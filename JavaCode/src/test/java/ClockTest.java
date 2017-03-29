import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sunny on 29/03/17.
 */
public class ClockTest {
    static String time = "" ;
    public static void main(String[] args) throws IOException {

        System.out.println("Provide Time");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t = br.readLine();

        setTime(t);
        String timeIs = getTime();
        System.out.println("Time is "+timeIs);

    }

    public static void setTime(String t){
        time = t;
    }

    public static String getTime(){
        return time;
    }

}
