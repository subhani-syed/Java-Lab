import java.util.*;

class random{
    public static void main(String args[]){
        int x1,x2;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        for(int i=0;i<2;i++){
        System.out.println("The number is "+(int)Math.random()*(x2-x1+1)+x1);
        }
    }
}