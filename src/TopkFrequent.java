import java.util.*;

public class TopkFrequent {
    public static List<Integer> topKFrequent(ArrayList<Integer> nums, int k) {
        Map<Integer, Integer> counterMap = new HashMap<>();
        for (int num : nums) {
            int count = counterMap.getOrDefault(num, 0);
            counterMap.put(num, count + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : counterMap.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) pq.poll();
        }

        List<Integer> res = new LinkedList<>();
        while (!pq.isEmpty()) {
            res.add(0, pq.poll().getKey());
        }
        return res;
    }
        public static void main (String[]args){
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            Scanner cin = new Scanner(System.in);
            System.out.println("Input Digits");
            int n = cin.nextInt();
            for (int i = 0; i < n; i++) {
                numbers.add(cin.nextInt());
            }
            List<Integer> res = topKFrequent(numbers, 2);
            System.out.println(res);
        }
    }