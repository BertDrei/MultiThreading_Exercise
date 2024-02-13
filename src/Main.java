public class Main implements Runnable{
    public static void main(String[] args) {

        for (int i = 1; i<5; i++) {
            Main main = new Main(i);
            Thread mythread = new Thread(main);
            mythread.start();



        }


    }
int threading;
    Main(int threading) {
        this.threading = threading;

    }
    public void run() {
        for (int i = 0 ; i< 10; i++) {
            System.out.println(i + " from " + threading);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
