package SpringOffer.J2ee;

/**
 * Created by Amie on 2019/1/22.
 */
public class Tread2 implements Runnable{
    private String name;
    public Tread2(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(name + "运行："+ i);
            try {
                Thread.sleep((int)Math.random()*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Tread2("c")).start();
        new Thread(new Tread2("d")).start();
    }
}
