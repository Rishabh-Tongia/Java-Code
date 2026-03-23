import java.util.*;

interface TDS
{
     public double tdsp=0.05;
}

class employee implements TDS
{
    String empid, name, desig;
    double salary;
    employee(String a, String b, String c)
    {
        empid=a;
        name=b;
        desig=c;
        salary=0;
    }
    double calculateSalary(int noOfDaysPresent, double wagesPerDay)
    {
        double gross=noOfDaysPresent*wagesPerDay;
        salary=gross-(gross*tdsp);
        return salary;
    }
}

class TDSCAT1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        employee e[]=new employee[15];
        for(int i=0;i<15;i++)
        {
            System.out.println("Enter id name and designation for employee "+(i+1));
            String id=sc.next();
            String name=sc.next();
            String desig=sc.next();
            e[i]=new employee(id,name,desig);
            System.out.println("Enter number of days present and wages per day");
            int days=sc.nextInt();
            double wage=sc.nextDouble();
            e[i].calculateSalary(days,wage);
        }
        int count=0;
        for(int i=0;i<15;i++)
        {
            if(e[i].desig.equalsIgnoreCase("Steno") && e[i].salary>10000)
                count++;
        }
        System.out.println("Number of Stenos earning above 10000 = "+count);
    }
}
