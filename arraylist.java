import java.util.*;
class arraylist{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr;
        arr = new ArrayList<>();
        System.out.println("Enter the elements to be added into arraylist :");
        for(int i=0;i<5;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("The Elements are: ");
        for(int i=0;i<5;i++){
            System.out.println(arr.get(i));
        }
        System.out.print("The Size of list is : ");
        System.out.println(arr.size());
    }
}