import java.util.*;
public class MultiplyingMatrices {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,rows1,columns1,rows2,columns2,sum=0;
        System.out.println("Enter no of rows in 1st matrix");
        rows1=sc.nextInt();
        System.out.println("Enter no of columns in 1st matrix");
        columns1=sc.nextInt();
        System.out.println("Enter no of rows in 2nd matrix");
        rows2=sc.nextInt();
        System.out.println("Enter no of columns in 2nd matrix");
        columns2=sc.nextInt();
        int Arr[][]=new int[rows1][columns1];
        int Arr2[][]=new int[rows2][columns2];
        int Arr3[][]=new int[columns1][rows2];
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

        
        if(Arr[0].length==Arr2.length){
            System.out.println("The product of both matrix is");
        for(i=0;i<Arr3.length;i++){
            for(j=0;j<Arr3[0].length;j++){
                for(k=0;k<Arr[0].length;k++){
                    Arr3[i][j]=Arr3[i][j]+Arr[i][k]*Arr2[k][j];
                }             
            }
        }  
        for(i=0;i<Arr3.length;i++){
            for(j=0;j<Arr3[0].length;j++){
               System.out.print(Arr3[i][j]+" ");  
            }
                    System.out.println("");
        }  
        }
        else
        System.out.println("Operation not possible");
    }
}
