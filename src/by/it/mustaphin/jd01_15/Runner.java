package by.it.mustaphin.jd01_15;

public class Runner {
    public static void main(String[] args) {
//        Singleton tA = new Singleton();
//        tA.makeMatrix();

        TaskB tB = new TaskB();
        tB.readSrc();
        tB.writeToFile();
    }
}
