package SpringOffer.J2ee;

/**
 * Created by Amie on 2019/1/22.
 */
public class ThreadA extends Thread {
    private Object lock;
    public ThreadA(Object lock){
        super();
        this.lock = lock;
    }

    public void run(){
        try {
            synchronized (lock){
                if (MyList.size() != 5){
                    System.out.println("Wait begin" + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("Wait end" + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
