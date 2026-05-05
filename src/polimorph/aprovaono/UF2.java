package polimorph.aprovaono;

public class UF2 extends UF {


    public UF2(int pt, int pl, int ne) {
        super(pt, pl, ne);
    }
    public boolean aprova(){
        boolean via1 = (this.pl/ (float)this.pt) >= 0.75f && this.ne >=4;
        boolean via2 = this.pl == this.pt;
        boolean via3 = (this.pl/ (float)this.pt) >= 0.5f && this.ne >=5;


        return via1 || via2 || via3;
    }
}
