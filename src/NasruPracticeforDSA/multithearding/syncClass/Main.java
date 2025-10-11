package NasruPracticeforDSA.multithearding.syncClass;
class Table{
   synchronized void printTable(int n){
        for(int i=1;i<10;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
   Table t= new Table();
   Thread thread1= new Thread(){
       public void run(){
           t.printTable(5);

       }
   };

   Thread thread2= new Thread(){
       public void run(){
           t.printTable(3);
       }
   };
   thread1.start();
   thread2.start();


//   Counter counter = new Counter();
//   Thread t1 = new Thread(()->{
//       for(int i=0;i<10 ;i++)
//            counter.increment();
//
//   });
//
//
//   Thread t2 = new Thread(()->{
//       for(int i=0; i<10;i++){
//           counter.increment();
//       }
//   });
//
//   t1.start();
//   t2.start();
//   t1.join();
//   t2.join();
//
//        System.out.println("Final Count: "+ counter.getCount());
    }
}
