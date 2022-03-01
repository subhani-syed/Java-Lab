import java.util.*;
class arraylist{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr;
        arr = new ArrayList<>();
        try{
            System.out.println("Enter the elements to be added into arraylist :");
            for(int i=0;i<5;i++){
                arr.add(sc.nextInt());
            }
            System.out.println("The Elements are: ");
            for(int i=0;i<arr.size();i++){
                System.out.println(arr.get(i));
            }
            System.out.print("The Size of list is : ");
            System.out.println(arr.size());
            System.out.println("Removing the element at index 1");
            arr.remove(1);
            System.out.println("The Elements are: ");
            for(int i=0;i<arr.size();i++){
                System.out.println(arr.get(i));
            }
            System.out.print("The Size of list is : ");
            System.out.println(arr.size());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}