import java.io.*;
import java.util.*;
import java.io.IOException;

class bytefile{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            FileOutputStream fout = new FileOutputStream("/home/subhani/Desktop/College/Third Sem/Java/Internl/new.txt");
            String str = sc.nextLine();
            byte b[] = str.getBytes();
            fout.write(b);
            fout.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}