import java.io.*;
import java.util.*;
import java.io.IOException;   

class file{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        try{
            FileWriter f = new FileWriter("/home/subhani/Desktop/College/Third Sem/Java/Internl/new.txt");
            String s = sc.nextLine();
            // f.write("Hello im done");
            f.write(s);
            f.close();
            System.out.println("Done writing");
            }catch(IOException e){
                System.out.println(e);
            }
            finally{
                // System.out.println(f.getName());
                // System.out.println(f.length());
                System.out.println("Ok");
            }
    }
}