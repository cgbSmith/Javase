package method;

/**
 * @author cgb
 * @version 1.0
 */
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        //如果希望main主线程结束后，子线程自动结束
        //需要将子线程设置为守护线程即可
        for (int i = 1; i <=10 ; i++) {
            System.out.println("宝强在辛苦的工作....");
            Thread.sleep(1000);
        }
    }
}

class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for(;;){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("聊天，哈哈哈~");
        }
    }
}