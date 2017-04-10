/**
 * Created by sunny on 10/04/17.
 */
public abstract class EmployeeAbstract {
    private String name;
    private String address;
    private int number;

    public void employee(String name,String address,int number){
        System.out.println("Following are the Employee Details");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computeSalary(){
        System.out.println("Computing Salary of Employee ");
        return 0.0;
    }

    public void mailCheck(){
        System.out.println("Mailing a check to "+this.name + " "+this.address);
    }

    public void setName(String employeeName){
        this.name = employeeName;
    }

    public String getName(){
        return this.name;
    }

    public void setAddress(String employeeAddress){
        this.address = employeeAddress;
    }

    public String getAddress(){
        return this.address;
    }

    public void setNumber(int employeeNumber){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

}
