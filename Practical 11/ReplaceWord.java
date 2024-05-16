import java.io.*;
import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("File1.txt");
        FileOutputStream fout = new FileOutputStream("File2.txt");
        Scanner sc = new Scanner(System.in);
        String w1, w2;
        int data;
        System.out.print("Enter word Which you want to replace: ");
        w1 = sc.next();
        System.out.print("Enter word Which you want to write: ");
        w2 = sc.next();
        int count = 0;
        String[] wa = new String[1000];
        String word = "";
        while ((data = fin.read()) != -1) {
            if (data == '\r')
                continue;
            if (data != '\n')
                word += (char) data;
            if (data == '\n') {
                // System.out.println(word);
                word = word.replaceAll(w1, w2);
                // System.out.println(word);
                byte[] b = word.getBytes();
                fout.write(b);
                wa = word.split(" ");
                // System.out.println("writed");
                for(String c : wa) {
                    if(c.equals(w2))
                    // System.out.println(c);
                    count++;
                }
                fout.write(data);
                word = "";
            }
        }
        System.out.println("total replaced = " + count);
        fin.close();
        fout.close();
    }
}
