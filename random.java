import java.util.*;

class random{
    public static void main(String args[]){
        int x1,x2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 :");
        x1 = sc.nextInt();
        System.out.print("Enter x2 :");
        x2 = sc.nextInt();
        System.out.print("Random numbers from "+x1+" to "+x2+" are : ");
        for(int i=0;i<5;i++){
        double a = Math.random()*(x2-x1)+x1;
        System.out.print((int)a+" ");
        }
        System.out.println("");
    }
}