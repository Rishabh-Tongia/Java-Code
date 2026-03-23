import java.util.*;

class stamp{
    int sum=0;
    int arr[][];
    stamp(int c){
        arr=new int[3][c];
    }

    void MonthInput(){
        for(int i=0;i<arr[0].length;i++){
            arr[0][i]=i+1;
        }
    }

    void stampInput(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr[1].length;i++){
            System.out.println("enter stamps collected for "+(i+1)+"thmonth");
            int s=sc.nextInt();
            arr[1][i]=s;
        }
    }

    void calculate(){
        int Sum=0;
        for(int i=0;i<arr[2].length;i++){
            Sum+=arr[1][i];
            arr[2][i]=Sum;
        }
    }

    void display(){
        for(int i=0;i<3;i++){
            for(int j=0;j<arr[1].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class StampsCollectionCAT1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of months ");
        int month=sc.nextInt();
        stamp stp=new stamp(month);
        stp.MonthInput();
        stp.stampInput();
        stp.calculate();
        stp.display();
    }

}
