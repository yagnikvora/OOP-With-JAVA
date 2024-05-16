import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class StudentManip {
    public static void main(String[] args) throws IOException {
        BufferedReader bread = new BufferedReader(new FileReader("Student1.txt"));
        BufferedWriter bwrite = new BufferedWriter(new FileWriter("Student2.txt"));
        int data;
        while((data = bread.read()) != -1)
            bwrite.write(data);
            
        System.out.println("Data is transfared");
        bread.close();
        bwrite.close();
    }

}