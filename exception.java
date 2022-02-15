import java.util.*;
class exception{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int res=0;
        try{
            int a = Integer.parseInt(sc.nextLine());
            int b = Integer.parseInt(sc.nextLine());
            res = a/b;
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Division not possible");
        }catch(NumberFormatException e){
            System.out.println(e);
        }finally{
            System.out.println("Result is "+res);
        }
    }
}