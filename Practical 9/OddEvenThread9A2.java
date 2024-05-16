class Even implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even:" + i);
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Odd implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd:" + i);
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class OddEvenThread9A2 {
    public static void main(String[] args) {
        Thread odd = new Thread(new Odd());
        Thread even = new Thread(new Even());
        odd.start();
        even.start();

    }
}