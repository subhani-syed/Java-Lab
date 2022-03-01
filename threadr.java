import java.util.*;

class thread1 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Hello");
        }
        // Infinte Loop
        // while(true){
        //     try{
        //         Thread.sleep(1000);
        //     }catch(Exception e){
        //         System.out.println(e);
        //     }
        //     System.out.println("Hello");
        // }
    }
}

class thread2 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Hello 2");
        }
        // Infinte Loop
        // while(true){
        //     try{
        //         Thread.sleep(500);
        //     }catch(Exception e){
        //         System.out.println(e);
        //     }
        //     System.out.println("Hello 2");
        // }
    }
}
class threadr{
    public static void main(String args[]){
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        Thread t11 = new Thread(t1);
        Thread t22 = new Thread(t2);
        t11.start();
        t22.start();
    }
}