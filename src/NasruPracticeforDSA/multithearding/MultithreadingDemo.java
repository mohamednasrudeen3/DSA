package NasruPracticeforDSA.multithearding;

// Running Multiple Thread Simultaniously
//Utilize Maximum Use of CPU

public class MultithreadingDemo {
    public static void main(String[] args) throws InterruptedException{
//        Runnable book= new Book();
    //        Thread t1= new Thread(book);

//        implementing Anonymous Class

        Runnable book= ()->
             {
                for (int i=0;i<5;i++) {
                    System.out.println("Db Updated");

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                    }
                }
        };
        Thread t1= new Thread(book);
        Num num = new Num();
        t1.start();



        num.start();
    }
}

class Book implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Db updated");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }
}
class Num extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
