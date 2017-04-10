/**
 * Created by sunny on 10/04/17.
 */
public class AbstractClassDemo {
    public static void main(String[] args) {
        Salary salary = new Salary("John Adams", "Boston, NA", 2, 3000.00);
        EmployeeAbstract employeeAbstract = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        salary.mailCheck();

        System.out.println("\n Call mailCheck using employee reference --");
        employeeAbstract.mailCheck();
    }
}
