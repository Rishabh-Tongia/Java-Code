import java.util.*;

abstract class employees{
    int empId;
    double CurrSalary;
    String empType;

    public employees(int empId, String empType) {
        this.empId = empId;
        this.empType = empType;
        this.CurrSalary = 0.0;
    }

    public abstract void calculateSalary();

    public void displaySalary() {
        System.out.println("Employee ID: " + empId + "   Type: " + empType + "   Salary: " + CurrSalary);
        System.out.println();
    }
}

class SalariedEmp extends employees {
    double weeklySalary;

    public SalariedEmp(int empId, double weeklySalary) {
        super(empId, "Salaried");
        this.weeklySalary = weeklySalary;
    }

    @Override
    public void calculateSalary() {
        CurrSalary = weeklySalary;
    }
}

class HourlyEmp extends employees {
    double hourlyRate;
    int hoursWorked;

    public HourlyEmp(int empId, double hourlyRate, int hoursWorked) {
        super(empId, "Hourly");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        if (hoursWorked <= 40) {
            CurrSalary = hourlyRate * hoursWorked;
        } else {
            CurrSalary = (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
        }
    }
}

class commissionEmp extends employees {
    double sales;

    public commissionEmp(int empId,double sales){
        super(empId,"commission");
        this.sales=sales;
    }

    @Override
    public void calculateSalary(){
        CurrSalary+=sales*0.10;
    }
}

class salariedCommissionEmp extends employees{
    double sales,baseSalary;

    public salariedCommissionEmp(int empId,double sales,double baseSalary){
        super(empId,"salariedCommission");
        this.sales=sales;
        this.baseSalary=baseSalary;
    }

    @Override
    public void calculateSalary(){
        double commission = sales * 0.10;
        CurrSalary = (baseSalary + commission) * 1.10;
    }
}

public class payroll {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        employees[] employee = new employees[4];
        employee[0] = new SalariedEmp(101, 800);
        employee[1] = new HourlyEmp(102, 20, 45);
        employee[2] = new commissionEmp(103, 5000);
        employee[3] = new salariedCommissionEmp(104, 500, 2000);

        for (employees emp : employee) {
            emp.calculateSalary();
            emp.displaySalary();
        }
    }
}
