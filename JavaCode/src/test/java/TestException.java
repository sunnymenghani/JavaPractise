import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sunny on 13/04/17.
 */
public class TestException {
    public static void main(String[] args) throws IOException {
        System.out.println("Provide value");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value = br.readLine();

        try {
            if (!value.equalsIgnoreCase(" ")){
                System.out.println("Start try");
                System.out.println("value provid by user is "+value);
            }
            else {
                System.out.println("Value provide is blank");
            }
        }
        catch (Exception e){
            System.out.println("In the catch block");
        }
    }

    public static void doRisky(String test) //throws ScaryException
    {
        System.out.println("Start doRisky");
        if ("yes".equals(test)){

        }
    }
}
