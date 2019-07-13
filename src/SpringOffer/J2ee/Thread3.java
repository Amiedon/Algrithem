package SpringOffer.J2ee;

/**
 * Created by Amie on 2019/1/22.
 */
public class Thread3 extends Thread{
    private String name;
    public Thread3(String name){
        super(name);
        this.name = name;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() + "线程开始");
        for (int i=0;i<5;i++){
            System.out.println("子线程"+name+"运行"+i);
            try {
                sleep((int)Math.random()*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "线程结束");
    }

    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName()+"主线程运行开始!");
//        Thread3 mTh1=new Thread3("A");
//        Thread3 mTh2=new Thread3("B");
//        mTh1.start();
//        mTh2.start();
//        System.out.println(Thread.currentThread().getName()+ "主线程运行结束!");
        System.out.println(Thread.currentThread().getName()+"主线程运行开始!");
        Thread3 mTh1=new Thread3("A");
        Thread3 mTh2=new Thread3("B");
        mTh1.start();
        mTh2.start();
        try {
            mTh1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        try {
            mTh2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("主线程结束");
    }
}
