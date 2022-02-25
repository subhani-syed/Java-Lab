import java.io.*;
import java.net.*;
import java.util.*;

class client{
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            Socket s = new Socket("localhost",6942);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            System.out.println("Enter Radius Of Circle:");
            int a = sc.nextInt();
            // dos.writeUTF("Hello World");
            dos.write(a);
            dos.flush();
            dos.close();
            s.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}