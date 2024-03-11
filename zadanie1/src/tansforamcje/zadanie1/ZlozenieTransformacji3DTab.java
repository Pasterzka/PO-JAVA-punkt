package tansforamcje.zadanie1;

public class ZlozenieTransformacji3DTab {
    private final Transformacja[] transformacje;

    public ZlozenieTransformacji3DTab(Transformacja... transformacje) {
        this.transformacje = transformacje;
    }

    public Punkt transformuj(Punkt p) {
        for (Transformacja transformacja : transformacje) {
            Punkt3D newP = (Punkt3D) p;
            p = transformacja.transformuj(newP);
        }
        return p;
    }


}
