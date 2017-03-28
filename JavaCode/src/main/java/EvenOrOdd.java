import javax.xml.bind.ParseConversionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sunny on 06/02/17.
 */
public class EvenOrOdd {
    public static void main(String[] args) throws IOException {
        System.out.println("Provide any number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Number = br.readLine();
        Double num = Double.valueOf(Number);

        if (num % 2 ==0){
            System.out.println(Number+" Is Even Number");
        }else {
            System.out.println(Number +"Is Odd Number");
        }
    }
}
