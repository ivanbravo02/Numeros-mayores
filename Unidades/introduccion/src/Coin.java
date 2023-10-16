public class Coin {
    private final int heads=0;
    private final int tails=1;
    private int face;

    public Coin() {
        this.flip();
    }
    public void flip(){
        this.face=(int) (Math.random()*2);
    }
    public boolean isheads(){
        return(face==heads);
    }
    public String toString(){
        String faceName;
        if(face==heads){
            faceName="heads";
        }else{
            faceName="tails";
        }
        return faceName;
    }
    
}
