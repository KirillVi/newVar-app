package by.itstep.oop.casting;

public class Circle extends Shape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void print() {
        System.out.println("   ___ ");
        System.out.println(" _______ ");
        System.out.println("_________");
        System.out.println(" _______ ");
        System.out.println("   ___ ");

    }

    @Override
    public void calculateP() {
        double p = 2 * Math.PI * r;
        setP(p);

    }

    @Override
    public void calculateS() {
        double s = Math.sqrt(Math.PI * r);
        setS(s);

    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

}
