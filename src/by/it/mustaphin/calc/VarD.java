package by.it.mustaphin.calc;

public class VarD extends Var {

    private double value = 0;

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }

    @Override
    public void fromString(String str) {
        value = Double.parseDouble(str);
    }

    VarD(double value) {
        this.value = value;
    }

    VarD(String valStr) {
        fromString(valStr);
    }

    @Override
    public Var add(Var var) {
        if (var instanceof VarD)
            return new VarD(value + ((VarD) var).value);
        else return var.add(this);
    }

    @Override
    public Var sub(Var var) {
        if (var instanceof VarD && ((VarD) var).value != 0)
            return new VarD(this.value - ((VarD) var).value);
        else return super.sub(var);
    }

    @Override
    public Var mul(Var var) {
        if (var instanceof VarD)
            return new VarD(((VarD) var).value * ((VarD) var).value);
        else return var.mul(this);
    }

    @Override
    public Var div(Var var) {
        if (var instanceof VarD)
            return new VarD(this.value / ((VarD) var).value);
        else return super.div(var);
    }
}
