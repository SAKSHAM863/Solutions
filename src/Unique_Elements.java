import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique_Elements {
    public static void main(String[] args) {
        ArrayList<Integer> Ele= new ArrayList<Integer>();
        Scanner cin = new Scanner(System.in);
        System.out.println("Input Digits");
        int n= cin.nextInt();
        for (int i=0;i<n;i++){
            Ele.add(cin.nextInt());
        }
        Set s= new HashSet(Ele);
        System.out.println("All elements : " + Ele);
        System.out.println("Unique Elements : " + s);
    }
}
