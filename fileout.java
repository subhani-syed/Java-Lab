import java.io.*;
import java.util.*;
public class fileout{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            FileOutputStream fo = new FileOutputStream("/home/subhani/Desktop/College/Third Sem/Java/Internl/new.txt");
            String s = sc.nextLine();
            byte b[] = s.getBytes();
            fo.write(b);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Done writing");
        }
    }
}