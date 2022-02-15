import java.io.*;
import java.util.*;

class fileread{
    public static void main(String args[]){
        int count = 0;
        try{
            FileReader fr = new FileReader("/home/subhani/Desktop/College/Third Sem/Java/Internl/new.txt");
            int i = fr.read();
            while(i !=-1){
                if((char)i>='a'||(char)i<='z'){
                    count++;
                }
                System.out.println((char)i);
                i = fr.read();
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("NUmber of char arre "+count);
        }
        
    }
}