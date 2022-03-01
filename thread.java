import java.util.*;
class thread1 extends Thread{
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
        //     Thread.sleep(1000);
        // }catch(Exception e){
        //     System.out.println(e);
        // }
        // System.out.println("Hello");
        // }
    }
}
class thread2 extends Thread{
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
        //     Thread.sleep(500);
        // }catch(Exception e){
        //     System.out.println(e);
        // }
        // System.out.println("Hello 2");
        // }
    }
}

class thread{
    public static void main(String args[]){
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}