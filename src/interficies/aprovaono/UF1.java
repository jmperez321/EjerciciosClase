package interficies.aprovaono;

public class UF1 extends UF {


    public UF1(int pt, int pl, int ne) {
        super(pt, pl, ne);
    }
    public boolean aprova(){
        boolean via1 = (this.pl/ (float)this.pt) >= 0.75f && this.ne >=4;
        boolean via2 = (this.pl/ (float)this.pt) >= 0.5f && this.ne >=5;
        boolean via3 = this.ne >7;

        return via1 || via2 || via3;
    }
}
