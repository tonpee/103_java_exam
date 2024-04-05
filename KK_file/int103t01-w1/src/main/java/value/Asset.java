package value;

public class Asset extends Property implements Valuable {
    private double value;
    @Override
    public double getValue() {
        return value;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }
}
