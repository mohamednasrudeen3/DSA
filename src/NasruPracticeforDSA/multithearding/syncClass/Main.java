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
    public static void main(String[] args) {
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
    }
}
