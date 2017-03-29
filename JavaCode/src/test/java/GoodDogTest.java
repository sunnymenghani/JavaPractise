/**
 * Created by sunny on 29/03/17.
 */
public class GoodDogTest {
    public static void main(String[] args) {
        GoodDob one = new GoodDob();
        one.setSize(70);
        GoodDob two = new GoodDob();
        two.setSize(10);
        System.out.println("Dog one: "+one.getSize());
        System.out.println("Dog two: "+two.getSize());
        one.bark();
        two.bark();

    }
}
