package tansforamcje.zadanie1;

public class Punkt3D extends Punkt{
    private final double z;

    public Punkt3D(double x, double y, double z){
        super(x,y);
        this.z = z;
    }

    public double getZ(){
        return this.z;
    }

    @Override
    public String toString() {
        return "Wartosc x - " + getX() + ", wartosc y - " + getY() + ", wartosc z - " + z + ".";
    }
}
