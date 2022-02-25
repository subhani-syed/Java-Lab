import java.net.*;
import java.io.*;
import java.util.*;
import java.lang.Math.*;

class server{
    public static void main(String args[]){
        try{
            ServerSocket ss = new ServerSocket(6942);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            // String str = (String)dis.readUTF();
            int inp = (int)dis.read();
            double out = Math.PI*inp*inp;
            // System.out.println("The message is "+str);
            System.out.println("Area of Circle with radius "+inp+" is "+ out);
            s.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
} 