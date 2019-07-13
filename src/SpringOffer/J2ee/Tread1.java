package SpringOffer.J2ee;

/**
 * Created by Amie on 2019/1/22.
 */
public class Tread1 extends Thread {
    private String name;

    public Tread1(String name){
        this.name  = name;
    }

    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(name + "运行:" + i);
            try {
                sleep((int)Math.random()*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Tread1 mTh1=new Tread1("A");
        Tread1 mTh2=new Tread1("B");
        mTh1.start();
        mTh2.start();
    }
}
