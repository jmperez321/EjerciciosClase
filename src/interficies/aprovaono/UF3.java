package interficies.aprovaono;

public class UF3 extends UF {


    public UF3(int pt, int pl, int ne) {
        super(pt, pl, ne);
    }

    public boolean aprova() {
        return this.pl == this.pt && this.ne >= 5;
    }
}
