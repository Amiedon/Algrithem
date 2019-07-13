package SpringOffer.localThread;

import SpringOffer.J2ee.Run;

/**
 * Created by Amie on 2019/1/29.
 */
public class RunableDemo extends Thread{
    private Thread t;
    private String threadName;

    RunableDemo(String name){
        this.threadName = name;
        System.out.println("Creating" + threadName);
    }
    @Override
    public void run() {
        System.out.println("Running" + this.threadName);
        try {
            for (int i=4;i>0;i--){
                System.out.println("Thread:" + this.threadName + "," + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }
    public void start(){
        System.out.println("Starting"+ threadName);
        if (t == null){
            t = new Thread(this, this.threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        RunableDemo R1 = new RunableDemo("Thread_1");
        R1.start();
        RunableDemo R2 = new RunableDemo("Thread_2");
        R2.start();
    }
}
