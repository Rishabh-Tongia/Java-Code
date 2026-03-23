import java.util.*;
public class AddingMatrices {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int Arr[][]=new int[3][3];
        int Arr2[][]=new int[3][3];
        int Arr3[][]=new int[3][3];
        System.out.println("enter numbers in 1st array");
        for(i=0;i<Arr.length;i++){
            for(j=0;j<Arr[0].length;j++){
                Arr[i][j]=sc.nextInt();
            }
            System.out.println("");
        }
        System.out.println("enter numbers in 2nd array");
        for(i=0;i<Arr2.length;i++){
            for(j=0;j<Arr2[0].length;j++){
                Arr2[i][j]=sc.nextInt();
            }
            System.out.println("");
        }    
        System.out.println("The sum of both matrix is");
        for(i=0;i<Arr3.length;i++){
            for(j=0;j<Arr3[0].length;j++){
                Arr3[i][j]=Arr[i][j]+Arr2[i][j];
                System.out.println(Arr3[i][j]);
            }
            System.out.println("");
        }    
    }
}
