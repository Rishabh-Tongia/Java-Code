import java.io.*;
import java.util.Scanner;
public class UnderstandingCharacterStream
{
    public static void main(String args[])
    {try{
    
        Scanner in=new Scanner(System.in);
        String arr[]={"Kitchen","Electronics","Kids","SmartGadgets",};
        FileWriter fwrite=new FileWriter("C:/Users/risha/OneDrive/Desktop/file1.csv");
        for(int i=0;i<2;i++)
        {
        System.out.print("|Enter Product ID:");
        fwrite.write(new String(in.next()).toCharArray());
        fwrite.write(',');
        System.out.print("|Enter Product Name:");
        fwrite.write(new String(in.next()).toCharArray());
        fwrite.write(',');
        System.out.print("|Enter Supplier Name:");
        fwrite.write(new String(in.next()).toCharArray());
        fwrite.write(',');
        System.out.print("|Enter Price:");
        fwrite.write(new String(in.next()).toCharArray());
        fwrite.write(',');
        System.out.print("|Enter Product Catogory:");
          
        String category=new String(in.next());
        for(int j=0;j<arr.length;j++)
        {
            if(category.equalsIgnoreCase(arr[j]));
            {   
                fwrite.write(category.toCharArray());
                fwrite.write('\n');
                break;
            }
        }
        System.out.println();
        }
        fwrite.close();

        FileReader fr=new FileReader("C:/Users/risha/OneDrive/Desktop/file1.csv");
        String productProperties[]=new String[5];
        for(int i=0;i<productProperties.length;i++)
        {
            productProperties[i]=new String();
            
        }
        int ch,i=0;
		FileWriter fw[]=new FileWriter[productProperties.length];
        fw[0]=new FileWriter("C:/Users/risha/OneDrive/Desktop/file1.csv");
        fw[1]=new FileWriter("C:/Users/risha/OneDrive/Desktop/file1.csv");
        fw[2]=new FileWriter("C:/Users/risha/OneDrive/Desktop/file1.csv");
        fw[3]=new FileWriter("C:/Users/risha/OneDrive/Desktop/file1.csv");
        fw[4]=new FileWriter("C:/Users/risha/OneDrive/Desktop/file1.csv");
        while((ch=fr.read())!=-1)
        {
            i=0;
            while(ch!='\n')
            {
                for(int j=0;j<productProperties.length;j++)
                {
                    productProperties[j]="";
                }
                do
                {
                if((char)ch!=',')
                    productProperties[i]=productProperties[i]+Character.toString((char)ch);
                    
                }while((char)(ch=fr.read())!=','&&ch!=-1&&ch!='\n');
                
                fw[i].write(productProperties[i].toCharArray());
                fw[i].write('\n');
                i++;
            }
        }
        fr.close();    
            for(i=0;i<productProperties.length;i++)
            {
                fw[i].close();
            }
    }catch(Exception e){System.out.println(e);}
    finally{
        
       }
   }
}
