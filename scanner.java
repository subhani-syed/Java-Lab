import java.util.Scanner;
class scanner{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Output from Scanner "+str);
        System.out.print("Output from args ");
        System.out.println(args[0]+" and "+args[1]);
    }
}