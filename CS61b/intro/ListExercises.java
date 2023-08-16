import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int sum = 0;
        for (int elem : L){
            sum = sum + elem;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> even = new ArrayList<>();
        for (int elem : L) {
            if (elem % 2 == 0) {
                even.add(elem);
            }
        }
        return even;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> common = new ArrayList<>();
        for (int elem1 : L1) {
            for (int elem2: L2) {
                if (elem2 == elem1) {
                    common.add(elem1);
                }
            }
        }
        return common;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for (String word : words) {
            for (char elem : word.toCharArray()){
                if (elem == c){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(0);
        lst.add(1);
        lst.add(3);
        lst.add(5);
        lst.add(7);
        lst.add(10);
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(1);
        lst2.add(9);
        lst2.add(7);
        lst2.add(11);
        System.out.println(ListExercises.sum(lst));
        System.out.println(ListExercises.evens(lst));
        System.out.println(ListExercises.common(lst,lst2));
        List<String> names = new ArrayList<>();
        names.add("apple");
        names.add("banana");
        names.add("grape");
        //char c = 'p';
        System.out.println(ListExercises.countOccurrencesOfC(names, 'p'));
    }
}