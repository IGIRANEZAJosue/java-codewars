/*
*
* */

package codewars;

import java.util.List;

public class FilterList {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                    .filter(elt -> elt instanceof Integer)
                    .toList();
    }

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
        System.out.println(filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)));
    }
}
