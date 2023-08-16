import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> map = new HashMap<>();
        char letter = 'a';
        for (int i = 0; i < 26; i++) {
            map.put((char)(letter + i), i + 1);
        }
        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
        map.put(num, num*num);
        }
        return map;
    }
    

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String,Integer> count = new TreeMap<>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        // Map<Character, Integer> test = letterToNum();
        // for (Entry<Character, Integer> elem : test.entrySet()) {
        //     Character key = elem.getKey();
        //     Integer value = elem.getValue();
        //     System.out.println("KEY:" + key + ", VALUE:" + value);
        // }


        //List<Integer> test2 = List.of(1, 3, 6, 7);
        List<Integer> test2 = new ArrayList<>();
        // test2.add(1);
        // test2.add(3);
        // test2.add(6);
        // test2.add(7);
        Map<Integer, Integer> map = squares(test2);
        // for (Entry<Integer, Integer> elem : map.entrySet()) {
        //     Integer key = elem.getKey();
        //     Integer value = elem.getValue();
        //     System.out.println("KEY:" + key + ", VALUE:" + value);
        // }
        System.out.println(map);

        List<String> fruits = List.of("fig","apple", "banana", "orange", "apple");
        Map<String,Integer> count = countWords(fruits);
        System.out.println(count);
    }
}
