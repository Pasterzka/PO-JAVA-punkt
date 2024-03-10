package tansforamcje.zadanie1;

public class Punkt {
    /*
     * Słowo kluczowe final oznacza, że po pierwszym przypisaniu
     * zawartość pól x oraz y nie może zostać zmieniona
     * w tym miejscu jest to odpowiednik słowa kluczowego const
     * z języka C++.
     */

    //pole
    private final double x,y;

    //konstruktor
    public Punkt(double x, double y){
        this.x = x;
        this.y = y;
    }

    //metody get
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }

    //override eqauals, hash, tostring
    @Override public boolean equals(Object obj){
        if (obj instanceof Punkt){
            Punkt other = (Punkt)obj;
            return x == other.x && y == other.y;
        }
        return false;
    }

    @Override public int hashCode(){
        int prime = 31; // Wybrana liczba pierwsza
        int hashX = 1; // Początkowa wartość skrótu
        int hashY=1;
        int result=1;

        long xBits = Double.doubleToLongBits(x); //Kowersja typu double na long, wartość ta sama ale jako reprezentacja bitowa
        hashX = prime * hashX + (int) (xBits ^ (xBits >>> 32));
        // Konwersja pola y na typ long i dodanie do skrótu
        long yBits = Double.doubleToLongBits(y);
        hashY = prime * hashY + (int) (yBits ^ (yBits >>> 32));
        result=hashX+hashY;
        return result; // Zwrócenie skrótu
    }

    @Override public String toString(){
        return "Wartosc x - "+ x + ", wartosc y - " + y +".";
    }

    /**
     * Początek układu współrzędnych.
     * W tym miejscu słowo kluczowe final oznacza, że statyczne
     * pole klasy Punkt nie może zostać zmienione.
     * Dotyczy to jednak samej referencji, a nie obiektu, na który
     * wskazuje.
     */
    public static final Punkt O = new Punkt(0, 0);
    /**
     * Punkt (1,0) w układzie współrzędnych
     */
    public static final Punkt E_X = new Punkt(1, 0);

    /**
     * Punkt (0,1) w układzie współrzędnych
     */
    public static final Punkt E_Y = new Punkt(0, 1);

}
