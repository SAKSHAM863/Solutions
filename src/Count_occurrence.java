import java.util.*;

public class Count_occurrence {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 7, 3, 8, 5, 7));

        Map<Integer, Integer> occurrencesMap = new HashMap<>();
        for (Integer number : numbers) {
            if (occurrencesMap.containsKey(number)) {
                occurrencesMap.put(number, occurrencesMap.get(number) + 1);
            } else {
                occurrencesMap.put(number, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : occurrencesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " occurrences");

        }
    }

}
