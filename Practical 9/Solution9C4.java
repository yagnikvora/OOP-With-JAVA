class product1 {
    int item;

    synchronized void put(int item) {
        this.item = item;
        System.out.println("Produce : " + item);
    }

    synchronized void get(int item) {
        this.item = item;
        System.out.println("consume : " + item);
    }
}

class producer1 extends Thread {
    product1 p;

    producer1(product1 p) {
        this.p = p;
        start();
    }

    public void run() {
        try {
            synchronized (p) {
                for (int i = 1; i <= 5; i++) {
                    p.put(i);
                    Thread.sleep(500);
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class consumer1 extends Thread {
    product1 p;

    consumer1(product1 p) {
        this.p = p;
        start();
    }

    public void run() {
        try {
            synchronized (p) {
                for (int i = 1; i <= 5; i++) {
                    p.get(i);
                    Thread.sleep(500);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class solution9C4 {
    public static void main(String[] args) {
        product1 p1 = new product1();
        producer1 pd1 = new producer1(p1);
        consumer1 cm1 = new consumer1(p1);
    }
}