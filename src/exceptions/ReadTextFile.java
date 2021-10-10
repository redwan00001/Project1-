package exceptions;


import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ReadTextFile {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("C:\\Users\\redwa\\OneDrive\\Documents\\Test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            br = new BufferedReader(fr);
            String str = " ";
            while ((str = br.readLine()) != null) {
                System.out.println(str);


            }

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (Exception e) {
                    e.printStackTrace();

                }

            }if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
