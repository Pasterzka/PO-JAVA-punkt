package tansforamcje.zadanie1;

public class ZlozenieTransformacji implements Transformacja{
    private final Transformacja[] transformacje;

    public ZlozenieTransformacji(Transformacja... transformacje) {
        //trzy kropki oznaczają dowolną ilość argumentów
        this.transformacje = transformacje;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException {
        // Zwracamy złożenie transformacji odwrotnych w odwrotnej kolejności
        Transformacja[] odwrotne = new Transformacja[transformacje.length];
        for (int i = 0; i < transformacje.length; i++) {
            odwrotne[i] = transformacje[transformacje.length - 1 - i].getTransformacjaOdwrotna();
        }
        return new ZlozenieTransformacji(odwrotne);
    }

    @Override
    public Punkt transformuj(Punkt p) {
        // Wykonujemy kolejne transformacje na punkcie
        for (Transformacja transformacja : transformacje) {
            p = transformacja.transformuj(p);
        }
        return p;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zlozenie transformacji: [");
        for (int i = 0; i < transformacje.length; i++) {
            sb.append(transformacje[i]);
            if (i < transformacje.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
