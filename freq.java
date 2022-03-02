import java.util.*;
class freq{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count[] = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=-1){
                int frq = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    frq++;
                    arr[j] = -1;
                }
            }
            count[i] = frq;
            System.out.println(arr[i]+" "+count[i]);

            }
            
        }
    }
}