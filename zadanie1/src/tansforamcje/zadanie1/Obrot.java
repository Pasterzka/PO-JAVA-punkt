package tansforamcje.zadanie1;

public class Obrot implements Transformacja{
    private final double katObrotu; //kąt obrotu w radianach

    /*
    * konstruktor zawierający kąt obrotu
    */
    public Obrot(double katObrotu) {
        this.katObrotu = katObrotu;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException {
        // Transformacja obrotu zawsze posiada odwrotność, więc można ją zwrócić bez wyjątku
        return new Obrot(-katObrotu);
    }

    @Override
    public Punkt transformuj(Punkt p) {
        double x = p.getX();
        double y = p.getY();

        // Obliczenie nowych współrzędnych po obrocie
        double newX = x * Math.cos(katObrotu) - y * Math.sin(katObrotu);
        double newY = x * Math.sin(katObrotu) + y * Math.cos(katObrotu);

        return new Punkt(newX, newY);
    }

    public double getKatObrotu() {
        return katObrotu;
    }

    @Override
    public String toString() {
        return "Obrot o kąt " + Math.toDegrees(katObrotu) + " stopni";
    }
}
