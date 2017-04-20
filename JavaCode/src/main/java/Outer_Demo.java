/**
 * Created by sunny on 20/04/17.
 */
public class Outer_Demo {
    int num;

    private class Inner_Demo{
        public void print(){
            System.out.println("This is inner class ");
        }
    }

    void display_Inner(){
        Inner_Demo inner_demo = new Inner_Demo();
        inner_demo.print();
    }
}
