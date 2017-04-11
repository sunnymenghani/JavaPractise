/**
 * Created by sunny on 10/04/17.
 */
public class Duck {
    int size;
    private static int duckSize;

    public static void main(String[] args) {
        duckSize = 10;
        System.out.println("The size of the duck is "+ duckSize);
    }

    public Duck(){
        System.out.println("Contructor of Duck Class");
    }

    public Duck(int size){
        System.out.println("Provide the Size");
    }

    public void setSize(int newSize){
        size = newSize;
    }

    public int getSize(){
        System.out.println("Size is "+size);
        return size;
    }
}
