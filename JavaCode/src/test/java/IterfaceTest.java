/**
 * Created by sunny on 10/04/17.
 */
public  class IterfaceTest implements InterfaceDemo {
    public static void main(String[] args) {
        IterfaceTest iterfaceTest = new IterfaceTest();
        iterfaceTest.eat();
        iterfaceTest.travel();
    }

    @Override
    public void eat() {
        System.out.println("Eat method is called from IterfaceTest class ");

    }

    @Override
    public void travel() {
        System.out.println("Trvel method is called IterfaceTest class");
    }

}
