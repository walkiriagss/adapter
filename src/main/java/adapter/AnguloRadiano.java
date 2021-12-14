package adapter;

public class AnguloRadiano implements  IAngulo {
    private double radiano;

    @Override
    public double getAngulo() {
        return radiano;
    }

    @Override
    public double setAngulo(double radiano) {
        this.radiano = radiano;
        return radiano;
    }
}
