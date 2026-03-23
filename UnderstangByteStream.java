import java.io.*;
import java.util.Scanner;

public class UnderstangByteStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "mark.txt";
        
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            System.out.println("Enter marks (out of 100) for 100 students:");
            
            for (int i = 0; i < 100; i++) {
                int mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid mark! Enter again:");
                    i--;
                    continue;
                }
                String data = mark + " ";
                fos.write(data.getBytes());
            }
            fos.close();
            
            FileInputStream fis = new FileInputStream(fileName);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            
            String fileContent = new String(buffer);
            String[] marksArray = fileContent.trim().split("\\s+");
            
            int sum = 0, countLess40 = 0;
            
            for (String s : marksArray) {
                int mark = Integer.parseInt(s);
                sum += mark;
                if (mark < 40) {
                    countLess40++;
                }
            }
            
            double average = sum / 100.0;
            
            System.out.println("\n--- Results ---");
            System.out.println("Average Score : " + average);
            System.out.println("Students scoring less than 40 : " + countLess40);
            
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}