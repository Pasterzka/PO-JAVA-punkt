package tansforamcje.zadanie1;

public class ObrotOS extends Obrot{
    private final String os;

    public ObrotOS(String os, double katObrotu) {
        super(katObrotu);
        this.os = os;
    }

    public Punkt3D transformuj3D(Punkt3D p) {
        double x = p.getX();
        double y = p.getY();
        double z = p.getZ();
        double kat = this.getKatObrotu();

        if (os.equalsIgnoreCase("x")) {
            double newY = y * Math.cos(kat) - z * Math.sin(kat);
            double newZ = y * Math.sin(kat) + z * Math.cos(kat);
            return new Punkt3D(x, newY, newZ);
        } else if (os.equalsIgnoreCase("y")) {
            double newX = x * Math.cos(kat) + z * Math.sin(kat);
            double newZ = -x * Math.sin(kat) + z * Math.cos(kat);
            return new Punkt3D(newX, y, newZ);
        } else if (os.equalsIgnoreCase("z")) {
            double newX = x * Math.cos(kat) - y * Math.sin(kat);
            double newY = x * Math.sin(kat) + y * Math.cos(kat);
            return new Punkt3D(newX, newY, z);
        } else {
            System.err.println("Nieprawidłowa oś obrotu!");
            return null;
        }
    }

    public Punkt3D transformuj3D(Punkt3D p, String oss, double kat) {
        double x = p.getX();
        double y = p.getY();
        double z = p.getZ();

        if (oss.equalsIgnoreCase("x")) {
            double newY = y * Math.cos(kat) - z * Math.sin(kat);
            double newZ = y * Math.sin(kat) + z * Math.cos(kat);
            return new Punkt3D(x, newY, newZ);
        } else if (oss.equalsIgnoreCase("y")) {
            double newX = x * Math.cos(kat) + z * Math.sin(kat);
            double newZ = -x * Math.sin(kat) + z * Math.cos(kat);
            return new Punkt3D(newX, y, newZ);
        } else if (oss.equalsIgnoreCase("z")) {
            double newX = x * Math.cos(kat) - y * Math.sin(kat);
            double newY = x * Math.sin(kat) + y * Math.cos(kat);
            return new Punkt3D(newX, newY, z);
        } else {
            System.err.println("Nieprawidłowa oś obrotu!");
            return null;
        }
    }
}
