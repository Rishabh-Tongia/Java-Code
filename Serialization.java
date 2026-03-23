import java.io.*;

class Product implements Serializable
{
    int id;
    String productName;
    String supplierName;
    double price;
    String category;
    Product(int pid, String pN, String sN, double p, String c)
    {
        id=pid;
        productName=pN;
        supplierName=sN;
        price=p;
        category=c;
    }
    public String toString()
    {
        System.out.println("Product ID:"+id);
        System.out.println("Product Name:"+productName);
        System.out.println("Product Supplier:"+supplierName);
        System.out.println("Product Price:"+price);
        System.out.println("Product Category:"+category);
        return new String("");
    }
}

public class Serialization
{
    public static void main(String args[])
    {
        try{
        int pid=7;
        String pN="asdffghj";
        String sN="qwertryuiop";
        double cost=5.9;
        String c="Electronics";
        Product p = new Product(pid, pN, sN, cost, c);
        FileOutputStream fos = new FileOutputStream("C:/Users/risha/OneDrive/Desktop/file2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(p);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("C:/Users/risha/OneDrive/Desktop/file2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Product pr=(Product)ois.readObject();
        System.out.println(pr);
        }catch(Exception e){}
    }
}