import java.net.*;
import java.io.*;

class server{
    public server(int port){
        try{
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Sever Created");
            Socket s = new Socket();
            s = ss.accept();
            System.out.println("Server Connected");
            DataInputStream din = new DataInputStream(s.getInputStream());
            System.out.println("Data Received from client is "+din.read());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class servert{
    public static void main(String args[]){
        new server(6942);
    }
}