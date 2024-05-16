import java .io.*;
public class StudentManipDataIO {
    public static void main(String[] args) throws IOException {
        DataInputStream din = new DataInputStream(new FileInputStream("Student1.txt"));
        DataOutputStream dout = new DataOutputStream(new FileOutputStream("Student2.txt"));
        String s;
        while((s = din.readLine()) != null){
            System.out.println(s);
            dout.write(s.getBytes());
            dout.write('\n');
        }
    }
}
