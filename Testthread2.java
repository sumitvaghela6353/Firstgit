
class Mythread extends Thread{
     public void run(){
          for(int i=0; i < 10; i++){
               System.out.println("Child Thread: " + i);
          }
     }
}

class Threaddemo1{
     public static void main(String[] args){
          Mythread t = new Mythread();
          t.start();

          for(int i=0; i < 10; i++){
               System.out.println("Main Thread: " + i);
          }
     }
}

class Threaddemo extends Thread{
     private Thread t;
     private String threadname;

     Threaddemo(String name){
          threadname = name;
          System.out.println("creating = " + threadname);
     }

     public void run(){
          System.out.println("Running" + threadname);
          try{
               for(int i = 4; i > 0; i--){
                    System.out.println("Thread =" + threadname + " , " + i);
                    Thread.sleep(50);
               }
          }
          catch(InterruptedException e){
               System.out.println("Thread" + threadname + " is interrupted");
          }
          System.out.println("Thread" + threadname + "exiting");
     }
     public void start(){
          System.out.println("Starting"+ threadname);
          if(t == null){
               t = new Thread(this.threadname);
               t.start();
          }
     }
}
class Testthread2{
     public static void main(String[] args){
          Threaddemo t1 = new Threaddemo("Thread - 1");
          t1.start();
          Threaddemo t2 = new Threaddemo("Thread - 2");
          t2.start();
     }
}