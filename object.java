import java.util.*;
class student{
    int age;
    int rollnum;
    public student(int age,int roll){
        this.age = age;
        this.rollnum = roll;
    }
}
class object{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        student std1 = new student(a,b);
        System.out.println("The Student's age is "+ std1.age);
        System.out.println("The Student's rollnum is "+ std1.rollnum);
    }
}