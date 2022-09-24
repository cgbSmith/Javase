package method;

/**
 * @author cgb
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        t tt = new t();
        tt.start();
        for (int i = 1; i <=20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程吃了"+i+"个包子");
            if(i==5){
                System.out.println("主线程（小弟）让子线程先吃");
                Thread.yield();//礼让，不一定成成...
                tt.join();
            }
        }
    }
}

class t extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程在吃了"+i+"个包子");
        }
    }
}