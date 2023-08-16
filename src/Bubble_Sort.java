import java.util.*;

public class Bubble_Sort {
    public static void bubbleSort(List<Integer> list) {
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the list is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        Scanner cin = new Scanner(System.in);
        System.out.println("Input Digits");
        int n= cin.nextInt();
        for (int i=0;i<n;i++){
            numbers.add(cin.nextInt());
        }
        bubbleSort(numbers);

        System.out.println(numbers);
    }
}




