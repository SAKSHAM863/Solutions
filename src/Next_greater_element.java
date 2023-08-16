import java.util.*;

public class Next_greater_element {
    public static List<Integer> nextGreaterElements(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = nums.size() - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums.get(i)) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result.add(-1);
            } else {
                result.add(stack.peek());
            }

            stack.push(nums.get(i));
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<>(Arrays.asList(4, 5, 2, 10, 8));
        ArrayList<Integer> nums= new ArrayList<Integer>();
        Scanner cin = new Scanner(System.in);
        System.out.println("Input Digits");
        int n= cin.nextInt();
        for (int i=0;i<n;i++){
            nums.add(cin.nextInt());
        }
        List<Integer> nextGreater = nextGreaterElements(nums);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i) + " -> " + nextGreater.get(i));
        }
    }
}