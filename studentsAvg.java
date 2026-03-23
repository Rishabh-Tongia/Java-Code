import java.lang.*;
import java.util.*;

class student{
   int mark1,mark2,mark3,roll;
   static int count =0;
   String name;
   float avg;

   public student(int roll,String name,int m1,int m2,int m3){
      this.roll=roll;
      this.name=name;
      this.mark1=m1;
      this.mark2=m2;
      this.mark3=m3;
   }

   void avgCal(){
      avg=(mark1+mark2+mark3)/3;
   }

   void studCount(){
      if(avg>=60){
         count ++;
      }
   } 
}
public class studentsAvg {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    student[] stud=new student[5];

    for(int i=0;i<5;i++){
      System.out.println("enter details of "+(i+1)+"st student");
      System.out.print("enter RollNo : ");
      int roll=sc.nextInt();
      sc.nextLine();
      System.out.print("enter Name : ");
      String name=sc.nextLine();
      System.out.print("enter Marks1 : ");
      int m1=sc.nextInt();
      System.out.print("enter Marks2 : ");
      int m2=sc.nextInt();
      System.out.print("enter Marks3 : ");
      int m3=sc.nextInt();

      stud[i]=new student(roll,name,m1,m2,m3);
      stud[i].avgCal();
      stud[i].studCount();
    }    

    System.out.println("No of Students with avg greater than 60 : "+student.count);
   } 
}
