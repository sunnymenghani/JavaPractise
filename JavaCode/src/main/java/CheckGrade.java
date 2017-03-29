import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sunny on 29/03/17.
 */
public class CheckGrade {
    public static void main(String[] args) throws IOException {
        System.out.println("Provide the grade");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String grade = br.readLine().toUpperCase();

        switch (grade){

            case "A" :
                System.out.println(grade+" Grade, Remark:- Excellent");
                break;

            case "B" :
                System.out.println(grade+" Grade, Remark:- Well Done");
                break;

            case "C" :
                System.out.println(grade+" Grade, Remark:- Good");
                break;

            case "D" :
                System.out.println(grade+" Grade, Remark:- You Passed");
                break;

            case "E" :
                System.out.println(grade+" Grade, Remark:- Better try again");
                break;
            default:
                System.out.println(" Invalid Grade:- "+ grade);

        }
    }
}
