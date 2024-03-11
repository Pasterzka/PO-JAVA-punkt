package tansforamcje.zadanie1;

public class Obrot3D extends ObrotOS {
    private final double alfa;
    private final double beta;
    private final double gamma;

    public Obrot3D(double alfa, double beta, double gamma) {
        super("z", alfa);
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
    }

    public Punkt transformuj(Punkt p) {
        Punkt3D newp = (Punkt3D) p;
        Punkt3D p1 = transformuj3D(newp, "z", alfa);
        Punkt3D p2 = transformuj3D(p1, "y", beta);
        Punkt3D p3 = transformuj3D(p2, "x", gamma);
        return new Punkt3D(p3.getX(),p3.getY(),p3.getZ());
    }
}