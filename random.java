import java.util.*;

class random{
    public static void main(String args[]){
        int x1,x2;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        for(int i=0;i<5;i++){
        double a = Math.random()*(x2-x1)+x1;
        System.out.println("The number is "+(int)a);
        }
    }
}