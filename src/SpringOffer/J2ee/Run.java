package SpringOffer.J2ee;

/**
 * Created by Amie on 2019/1/22.
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();

            ThreadA a = new ThreadA(lock);
            a.start();

            Thread.sleep(50);

            ThreadB b = new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
