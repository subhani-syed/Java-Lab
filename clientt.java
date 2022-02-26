import java.net.*;
import java.util.*;
import java.io.*;

class client{
    public client(String address,int port){
        try{
            Socket s = new Socket(address,port);
            System.out.println("Socket Created");
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            System.out.println("Enter Data");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            dout.write(a);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class clientt{
    public static void main(String args[]){
        new client("localhost",6942);
    }
}