import java.util.*;

class balanceException extends Exception{
    public String toString(){
        return "Insufficient Balance";
    }
}
class user_exception{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Balance is 100");
        int amount = sc.nextInt();
        try{
            if(amount>100){
                throw new balanceException();
            }else{
                System.out.println("Balance is "+(100-amount));
            }
        }catch(balanceException e){
            System.out.println(e);
        }
    }
}