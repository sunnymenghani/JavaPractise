/**
 * Created by sunny on 31/03/17.
 */
public class InheritanceTest extends Inheritance {
    public static void main(String[] args) {
        InheritanceTest inheritanceTest = new InheritanceTest();
        int a = 20 ,b= 10;
        inheritanceTest.addition(a,b);
        inheritanceTest.Subtraction(a,b);
        inheritanceTest.multiplication(a,b);
    }

    public  void multiplication(int x, int y) {
        int z = x * y;
        System.out.println("The product of the given numbers:- "+z);
    }
}

