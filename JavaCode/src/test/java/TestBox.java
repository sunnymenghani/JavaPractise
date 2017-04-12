import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

/**
 * Created by sunny on 12/04/17.
 */
public class TestBox {
    Integer i = 0;
    int j = 20;

    public static void main(String[] args) {
        TestBox testBox = new TestBox();
        testBox.go();
    }

    public void go(){
        Integer integer = Integer.valueOf(j);
        integer = i;
        System.out.println("value of j is "+j);
        System.out.println("value of i is "+i);
        double d = 2.3;
        String doubleString = Double.toString(d);
        System.out.println("value of doubleString is "+doubleString);
        String s = String.format("%,d",100000);
        System.out.println(s);
        
    }

}
