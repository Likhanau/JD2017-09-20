package by.it.malyshev.jd02_02;

public class Cashier implements Runnable {

    private int num;
    private boolean shouldCloseCashbox;

    public Cashier(int num) {
        this.num = num;
        shouldCloseCashbox = true;
    }

    boolean isShouldCloseCashbox() {
        return shouldCloseCashbox;
    }

    void setShouldCloseCashbox(boolean shouldCloseCashbox) {
        this.shouldCloseCashbox = shouldCloseCashbox;
    }


    @Override
    public void run() {
        while (Dispatcher.countBuyer < Dispatcher.planBuyer) {
            if (shouldCloseCashbox) {
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            Buyer b;
            synchronized (Dispatcher.buyerQueue) {
                b = Dispatcher.buyerQueue.poll();
            }
            if (b != null) {
                System.out.println(this + " start service for " + b);

                int timeout = Helper.random(2000, 5000);
                if (b.isPensioner()) timeout *= b.pensionerRetardation;
                Helper.sleep(timeout);

                printCheque(b);
                synchronized (Basket.baskets) {
                    Basket.baskets.add(b.getBasket());
                }
                System.out.println(this + " stop service for " + b);
                synchronized (b) {
                    b.notify();
                }

                synchronized (Dispatcher.planBuyer) {
                    Dispatcher.countBuyer++;
                }
            }

        }
    }

    @Override
    public String toString() {
        return "Cashier №" + num;
    }

    private void printCheque(Buyer b) {
        synchronized (Dispatcher.planBuyer) {
            Dispatcher.totalStoreRevenue += b.getBasket().totalSum();
        }

        String spase1 = "";
        String spase2 = "";
        switch (num) {
            case 1:
                spase2 = String.format("%105s", "");
                break;
            case 2:
                spase1 = String.format("%25s", "");
                spase2 = String.format("%80s", "");
                break;
            case 3:
                spase1 = String.format("%50s", "");
                spase2 = String.format("%55s", "");
                break;
            case 4:
                spase1 = String.format("%75s", "");
                spase2 = String.format("%30s", "");
                break;
            case 5:
                spase1 = String.format("%100s", "");
                spase2 = String.format("%5s", "");
                break;
        }

        StringBuilder str = new StringBuilder();

        str.append("\n");
        str.append(this).append("\n");
        str.append(b).append("\n");
        str.append(b.getBasket()).append("\n");
        if (b.getBasket().size() > 0) {
            str.append(b.getBasket().printContent());
            str.append("Total:   ").append(String.format("%5.2f", b.getBasket().totalSum()));
        }

        String[] strCheque = str.toString().split("\n");
        str.delete(0,str.length());
        for (String s : strCheque)
            str.append(spase1).append(s).append('\n');
        str.deleteCharAt(str.length()-1);

        str.append(spase2);
        str.append(String.format("%15s %10s", ("Queue: " + Dispatcher.buyerQueue.size()), ("Cashiers: " + Dispatcher.getWorkingCashiers())));
        str.append(String.format("%20s %5.2f\n\n", "Store revenue:", Dispatcher.totalStoreRevenue));

        System.out.print(str.toString());

    }
}
