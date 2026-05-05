package interficies.aprovaono;

import java.util.ArrayList;
import java.util.List;

public class MP {
    private List<UF> ufs;

    public MP(){
        this.ufs=new ArrayList<>();
    }

    public void afegirUF(UF uf){
        this.ufs.add(uf);
    }

    public boolean aprova(){
        for(UF uf: this.ufs){
            if(!uf.aprova()) return false;
        }
        return true;
    }
}
