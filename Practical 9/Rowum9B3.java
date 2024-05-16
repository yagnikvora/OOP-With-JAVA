class RowSum extends Thread {
    int[] row;
    int index;

    RowSum(int[] row, int i) {
        this.row = row;
        index = i;
    }

    public void run() {
        int sum = 0;
        for (int i : row) {
            sum += i;
        }
        System.out.println("Sum of Row " + (index+1) + ": " + sum);
    }
}
public class Rowum9B3 {
    public static void main(String[] args) {
        int[][] ma = { { 16, 25, 32 }, { 46, 75, 36 }, { 77, 98, 39 } };
        int rows = ma.length;
        RowSum[] rs = new RowSum[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < ma[0].length; j++)
                System.out.print(ma[i][j] + " ");
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            rs[i] = new RowSum(ma[i], i);
            try{
                rs[i].start();
                Thread.sleep(1000);
                // rs[i].join();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

