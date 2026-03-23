import java.io.File;
import java.text.SimpleDateFormat;

public class UnderstandingFiles {
    public static void main(String[] args) {
        String directoryPath = "C:/Users/risha/OneDrive/Desktop/file3.txt";
        
        File directory = new File(directoryPath);
        
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path!");
            return;
        }

        File[] files = directory.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No files found in the directory.");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("JPEG Files in directory: " + directoryPath);
        System.out.println("-------------------------------------------------");

        for (File file : files) {
            if (file.isFile() && (file.getName().toLowerCase().endsWith(".jpg") ||
                                  file.getName().toLowerCase().endsWith(".jpeg"))) {
                
                System.out.println("File Name     : " + file.getName());
                System.out.println("Absolute Path : " + file.getAbsolutePath());
                System.out.println("File Size     : " + file.length() + " bytes");
                System.out.println("Readable      : " + file.canRead());
                System.out.println("Writable      : " + file.canWrite());
                System.out.println("Last Modified : " + sdf.format(file.lastModified()));
                System.out.println("-------------------------------------------------");
            }
        }
    }
}
