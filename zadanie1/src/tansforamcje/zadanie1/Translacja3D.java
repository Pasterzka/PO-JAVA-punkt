package tansforamcje.zadanie1;

public class Translacja3D implements Transformacja{
    private final double dx, dy, dz;

    Translacja3D(double dx, double dy, double dz){
        this.dx = dx;
        this.dy = dy;
        this.dz = dz;
    }
    @Override
    public Punkt transformuj(Punkt p) {
        Punkt3D punkt3d = (Punkt3D) p;
        //double newX = p.getX() + dx;
        //double newY = p.getY() + dy;
        //double newZ = p.getZ() + dz;
        //return new Punkt3D(newX, newY, newZ);
        return new Punkt3D((p.getX()+dx),(p.getY()+dy),(((Punkt3D) p).getZ()+dz));
    }

    public double getdX() {
        return dx;
    }

    public double getdY() {
        return dy;
    }

    public double getdZ() {
        return dz;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException {
        return new Translacja3D(-dx,-dy,-dz);
    }

    @Override
    public String toString() {
        return "Translacja3D o wektor (" + dx + "," + dy + "," + dz + ")";
    }
}
