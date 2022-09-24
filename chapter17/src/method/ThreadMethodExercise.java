package method;

/**
 * @author cgb
 * @version 1.0
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <10 ; i++) {
            Thread.sleep(1000);
            System.out.println("hi"+i);
            if(i==5){
                cgb cgb = new cgb();
                Thread thread = new Thread(new cgb());
                thread.start();
                thread.join();
            }
        }
        System.out.println("主线程结束 ");

    }
}

class cgb implements Runnable{

    @Override
    public void run() {
            for (int i = 1; i < 11; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("hello"+i);
            }
        System.out.println("子线程结束...");

    }
}