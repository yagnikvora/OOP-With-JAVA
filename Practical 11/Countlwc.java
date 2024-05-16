import java.io.*;

class Countlwc {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("demo.txt");
        int data;
        int line = 0, word = 0, characters = 0;
        while ((data = in.read()) != -1) {
            if (data == '\r')
                continue;

            if (data == ' ' || data == '\n') {
                if (characters != 0)
                    word++;
            }
            if (data == '\n')
                line++;
            else
                characters++;
        }
        if (characters != 0) {
            line++;
            word++;
        }
        System.out.println("Lines :- " + line + "\nWords :- " + word + "\nCharacters :- " + characters);
        in.close();
    }
}