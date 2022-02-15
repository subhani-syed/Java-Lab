import java.util.*;
class arraylist{
    public static void main(String args[]){
        ArrayList<Integer> arr;
        arr = new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(1);
        }
        for(int i=0;i<5;i++){
            // arr.add(1);
            System.out.println(arr.get(i));
        }
        System.out.println(arr.size());
    }
}