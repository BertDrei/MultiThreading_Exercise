import java.util.Random;

public class Dice extends Thread {
    private Random random;
    private int rolls;
    private String name;

    public Dice(int rolls, String name){
        random = new Random();
        this.rolls = rolls;
        this.name = name;
    }

    public void run(){
        int sum = 0;
        int roll = 0;

        for(int i=0;i<this.rolls;i++){
            roll += random.nextInt(6)+1;
        }
        System.out.println("Average roll: "+roll/this.rolls);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {

        Dice d = new Dice(7,"Thread 1");
        Dice d2 = new Dice(7,"Thread 2");
        d.start();
        d2.start();

    }

}