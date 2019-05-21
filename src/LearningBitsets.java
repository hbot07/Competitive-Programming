import java.util.BitSet;
public class LearningBitsets {
    public static void main(String[] args)
    {
        BitSet b1=new BitSet(10);
        b1.set(0,true);
        b1.set(1,true);
        b1.set(2,true);
        b1.set(3,true);
        System.out.println(b1.length());

    }
}
