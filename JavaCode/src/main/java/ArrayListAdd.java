import java.util.Iterator;

/**
 * Created by sunny on 30/03/17.
 */
public class ArrayListAdd {
    public static void main(String args[]){
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
