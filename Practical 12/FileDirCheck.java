import java.io.*;

public class FileDirCheck {
    public static void main(String[] args) throws IOException {
        String name = args[0];
        File f = new File(name);
        if (f.isFile())
            System.out.println("File size : " + f.length() + " Bytes");
        else if (f.isDirectory()) {
            String s[] = f.list();
            for (int i = 0; i < s.length; i++) {
                File file = new File(name + "/" + s[i]);
                if (file.isDirectory())
                    System.out.println(s[i] + " is a Directory");
                else
                    System.out.println(s[i] + " is a File");
            }
        }
    }
}
