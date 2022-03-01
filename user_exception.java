import java.util.*;

class balanceException extends Exception{
    public String toString(){
        return "Insufficient Balance Exception";
    }
}
class user_exception{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Balance is 100");
        while(true){
            System.out.print("Enter the amount to withdraw: ");
            int amount = sc.nextInt();
            try{
                if(100-amount<0){
                    throw new balanceException();
                }else{
                    int bal = 100-amount;
                    System.out.println("Balance is "+bal);
                    break;
                }
            }catch(balanceException e){
                System.out.println(e);
            }
        }
    }
}