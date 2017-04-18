import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sunny on 18/04/17.
 */
public class TestCustomException {
    public static void main(String[] args) throws IOException, InvalidAgeException {
        System.out.println("Provide age");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());

        validateAge(value);

    }

    public static void validateAge(int age) throws InvalidAgeException{
        if (age < 18 ){
            throw new InvalidAgeException(age+" age is less than 18 ");
        }
        else {
            System.out.println("Welcome to vote");
        }
    }
}
