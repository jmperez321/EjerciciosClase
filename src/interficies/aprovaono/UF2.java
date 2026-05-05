package interficies.aprovaono;

public class UF2 implements UF {
    private int pt;
    private int pl;
    private int ne;

    public UF2(int pt, int pl, int ne) {
        this.pt = pt ;
        this.pl = pl ;
        this.ne = ne ;
    }
    public boolean aprova(){
        boolean via1 = (this.pl/ (float)this.pt) >= 0.75f && this.ne >=4;
        boolean via2 = this.pl == this.pt;
        boolean via3 = (this.pl/ (float)this.pt) >= 0.5f && this.ne >=5;


        return via1 || via2 || via3;
    }
}
