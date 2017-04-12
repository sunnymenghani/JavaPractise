/**
 * Created by sunny on 12/04/17.
 */
public class FinalKeyword {
    final int size = 3;
    public static void main(String[] args) {
        foof();
        dostuff();
    }

    public static void foof(){
        final int whuffie = 42;
        System.out.println("This is from Foof method & value of Final variable whuffie is "+ whuffie);
    }

    public static void dostuff(){
        final int z = 7;
        System.out.println("This is from doStuff method & value of Final variable z is "+ z);
    }

}
