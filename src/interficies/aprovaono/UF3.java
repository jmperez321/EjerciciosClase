package interficies.aprovaono;

public class UF3 implements UF {
    private int pt;
    private int pl;
    private int ne;

    public UF3(int pt, int pl, int ne) {
        this.pt = pt ;
        this.pl = pl ;
        this.ne = ne ;
    }

    public boolean aprova() {
        return this.pl == this.pt && this.ne >= 5;
    }
}
