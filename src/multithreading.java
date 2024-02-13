public class multithreading  extends  Thread{
    int threading;
    public multithreading(int threading) {
        this.threading = threading;

    }
    public void run() {
        for (int i = 1 ; i<5; i++) {
            System.out.println(i + "from thread number: " + threading);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
