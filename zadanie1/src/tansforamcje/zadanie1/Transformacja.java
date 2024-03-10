package tansforamcje.zadanie1;

public interface Transformacja {
    Punkt transformuj(Punkt p);
    Transformacja getTransformacjaOdwrotna()
            throws BrakTransformacjiOdwrotnejException;
}
