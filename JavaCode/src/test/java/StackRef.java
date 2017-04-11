/**
 * Created by sunny on 11/04/17.
 */
public class StackRef {
    Duck duck = new Duck();
    public static void main(String[] args) {
        foof();
        go();
    }

    public static void barff(){
        Duck d = new Duck();
    }

    public static void foof(){
        System.out.println("Method of StackRef Class");
        barff();
    }

    public static void go(){
        Duck duck1 = new Duck();
        System.out.println(duck1 = null);
        
    }
}
