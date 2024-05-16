import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class StudentManagement {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int rn, m1, m2, m3;
        String name, str, val;
        float per;
        System.out.print("Enter no. of student:");
        int n = sc.nextInt();
        FileOutputStream fout = new FileOutputStream("Student.txt");
        fout.write("Roll No       Name                        Mark-1     Mark-2     Mark-3     Percentage".getBytes());
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Roll no. of sudent: ");
            rn = sc.nextInt();
            System.out.print("Enter name of sudent: ");
            name = sc.next();
            System.out.print("Enter Mark 1 ");
            m1 = sc.nextInt();
            System.out.print("Enter Mark 2 ");
            m2 = sc.nextInt();
            System.out.print("Enter Mark 3 ");
            m3 = sc.nextInt();
            per = (m1 + m2 + m3) / 3;
            str = String.format("%-20s", name).replace(' ', ' ');
            val = "\n" + rn + "           " + str + "        " + m1 + "         " + m2 + "         " + m3 + "         "
                    + per;
            fout.write(val.getBytes());
        }
        fout.close();

    }
}
