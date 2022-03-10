package bangunruang;

public class Tabung extends BangunRuang{
    final float phi = (float) 3.14;
    int r, t;

    public Tabung( int r, int t){
        this.r = r;
        this.t = t;
    }

    @Override
    public float volume(){
        return phi*(r*r)*t;
    }

}
