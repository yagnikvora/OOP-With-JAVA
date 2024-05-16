import java.io.*;

class FileWriteB extends Thread{
    String name;

    FileWriteB(String fname) {
        this.name = fname;
    }

    public void run() {
        
        try {
            FileOutputStream fout = new FileOutputStream(name, true);
            for (int i = 0; i < 10; i++) {
                fout.write(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

public class BFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriteB f1 = new FileWriteB("demo.txt");
        FileWriteB f2 = new FileWriteB("demo.txt");

        f1.start();
        try {
            f1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        f2.start();
        
        Thread.yield();

        try {
            Thread.sleep(500);
            // f2.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
