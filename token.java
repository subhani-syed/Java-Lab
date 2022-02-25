import java.util.*;
class token{
    public static void main(String args[]){
        StringTokenizer str = new StringTokenizer("Hello how are you im fine");
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken(" "));
        }
    }
}