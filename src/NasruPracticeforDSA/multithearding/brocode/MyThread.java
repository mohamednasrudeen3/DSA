package NasruPracticeforDSA.multithearding;

import org.w3c.dom.ls.LSOutput;

public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=10;i>0;i--){
            System.out.println("Thread#1: "+i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){}
                
        }
        System.out.println("thread#1 is Finised");
    }

}
