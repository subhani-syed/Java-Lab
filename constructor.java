import java.util.*;
class box{
    int len;
    int bre;
    public box(int a,int b){
        this.len = a;
        this.bre = b;
    }
    public box(int a){
        this.len = a;
    }
    public int area(){
        return len*bre;
    }
}
class constructor{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        box b1 = new box(5,4);
        int a = sc.nextInt();
        box b2 = new box(a);
        System.out.println(b1.area());
        System.out.println(b2.area());
        System.out.println(b2.bre);
    }
}