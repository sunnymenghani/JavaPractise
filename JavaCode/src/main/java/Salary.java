/**
 * Created by sunny on 10/04/17.
 */
public class Salary extends EmployeeAbstract {
    private double salary;

    public Salary(String s, String s1, int i, double v) {
        super();
        setSalary(v);
    }

    public void mailCheck(){
        System.out.println("Within mailCheck of salary class");
        System.out.println("Mailing check to "+getName() +" with salary "+salary);
    }

    public void setSalary(double salaryAmount){
        this.salary = salaryAmount;
    }

    public double getSalary(){
        return this.salary;
    }

    public double computeSalary(){
        System.out.println("Computing Salary pay for "+ getName());
        return salary/52;
    }
}
