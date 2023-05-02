package Task001;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Task001 {
    /**
     * 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * Пример:
     * 1 -> 2->3->4
     * Вывод:
     * 4->3->2->1
     */
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        Collections.reverse(lst);
        System.out.println("lst = " + lst);
    }
}
