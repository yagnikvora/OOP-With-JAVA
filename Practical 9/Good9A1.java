class GoodMorning implements Runnable{
    public void run(){
        for(int i=0 ; i<10 ; i++){
            try {
                System.out.println("Good Morning..");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class GoodAfternoon implements Runnable{
    public void run(){
        for(int i=0 ; i<10 ; i++){
            try {
                System.out.println("Good Afternoon..");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Good9A1{
    public static void main(String[] args) {
        Thread gm = new Thread(new GoodMorning());
        Thread ga = new Thread(new GoodAfternoon());
        gm.start();
        ga.start();
    }
}