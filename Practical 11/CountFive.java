import java.io.FileInputStream;
import java.io.IOException;

public class CountFive {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream(args[0]);
        int data, c = 0;
        while ((data = fin.read()) != -1)
            if ((char) data == '5')
                c++;
        // System.out.println((char)data); to print
        System.out.println("Total 5 is : " + c);
        fin.close();
    }
}
