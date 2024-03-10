package tansforamcje.zadanie1;

public class zdanie1 {
    public static void main(String[] args) {
        /*

        /*
         * Konstrukcja językowa try {} catch (...){} służy do
         * obsługi wyjątków. Kod w bloku try jest monitorowany
         * pod kątem wystąpienia wyjątku bądź wyjątków
         * wspomnianych na początku bloku/bloków catch.
         * Jeżeli gdzieś w bloku try wystąpi wyjątek, to sterowanie
         * zostanie natychmiast przeniesione do bloku catch.
         * Tam powinien znajdować się kod obsługujący wyjątek.
         * Może to być np. wypisanie stosu wywołań na wyjście błędów
         * lub zapisanie wyjątku w logach, lub wyrzucenie (zgłoszenie)
         * innego wyjątku lepiej opisującego sytuacje (można załączyć
         * wyjątek który zainicjował to zdarzenie patrz. Konstruktor
         * klasy java.lang.Exception)

        try {
            Punkt p1 = Punkt.E_X;
            System.out.println(p1);
            Transformacja tr = new Translacja(5, 6);
            System.out.println(tr);
            Punkt p2 = tr.transformuj(p1);
            System.out.println(p2);
            Transformacja trr = tr.getTransformacjaOdwrotna();
            System.out.println(trr);
            Punkt p3 = trr.transformuj(p2);
            System.out.println(p3);

        } catch (BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();


        try
        {
            Punkt p1 = new Punkt(2, 2);
            System.out.println(p1);
            Transformacja tr2 = new Skalowanie(5, 4);
            System.out.println(tr2);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();


        try
        {
            Punkt p1 = new Punkt(2, 2);
            Transformacja tr2 = new Skalowanie(5, 0);
            System.out.println(tr2);
            System.out.println(p1);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();

        */


        //zadanie 3
        /*
        try {
            Punkt p1 = new Punkt(3, 4); // Punkt (3, 4)
            System.out.println("Początkowy punkt: " + p1);

            double katObrotu = Math.PI / 2; // Obrót o 90 stopni
            Transformacja obrot = new Obrot(katObrotu); // Tworzenie obiektu obrotu
            System.out.println("Wykonujemy obrót o 90 stopni: " + obrot);

            Punkt p2 = obrot.transformuj(p1); // Wykonanie obrotu
            System.out.println("Po obrocie: " + p2);

            Transformacja obrotOdwrotny = obrot.getTransformacjaOdwrotna(); // Pobranie transformacji odwrotnej
            System.out.println("Transformacja odwrotna: " + obrotOdwrotny);

            Punkt p3 = obrotOdwrotny.transformuj(p2); // Wykonanie transformacji odwrotnej
            System.out.println("Po transformacji odwrotnej: " + p3);
        } catch (BrakTransformacjiOdwrotnejException ex) {
            ex.printStackTrace();
        }
        */


        //zadanie 4

        try {
            Punkt p1 = new Punkt(2, 2); // Początkowy punkt (2, 2)
            System.out.println("Początkowy punkt: " + p1);

            Transformacja[] transformacje = {
                    new Translacja(3, 4), // Translacja o (3, 4)
                    new Skalowanie(2, 2) // Skalowanie o 2 wzdłuż osi x i y
            };

            Transformacja zlozenie = new ZlozenieTransformacji(transformacje);
            System.out.println("Wykonujemy złożenie transformacji: " + zlozenie);

            Punkt p2 = zlozenie.transformuj(p1); // Wykonanie złożenia transformacji
            System.out.println("Po złożeniu transformacji: " + p2);

            Transformacja zlozenieOdwrotna = zlozenie.getTransformacjaOdwrotna(); // Pobranie transformacji odwrotnej
            System.out.println("Transformacja odwrotna: " + zlozenieOdwrotna);

            Punkt p3 = zlozenieOdwrotna.transformuj(p2); // Wykonanie transformacji odwrotnej
            System.out.println("Po transformacji odwrotnej: " + p3);
        } catch (BrakTransformacjiOdwrotnejException ex) {
            ex.printStackTrace();
        }
    }
}
