package OOPLab07;

public class MyPair<T,U> {
    public final T fst;
    public final U snd;
    public MyPair(T fst, U snd){
        this.fst=fst;
        this.snd=snd;
    }
    public String toString(){
        return "("+ fst + ", "+ snd+ ")";
    }
    public MyPair swap(){
        MyPair<T,U> a = new MyPair(snd,fst);
        return a;
    }
}
