package predicates;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //predicate --> one parameter return boolen value
        //use only for conditional check

        //Ex01 - Integer param
        Predicate<Integer> p = i -> (i > 10);
        System.out.println(p.test(20));

        //Ex02 - String Param
        Predicate<String> s = s1 -> (s1.length() > 4);
        System.out.println(s.test("tes"));

        //Ex03 - Array
        String names[] = {"David", "Scott", "Melan", "Js"};
        for (String name : names) {
            if (s.test(name)) {
                System.out.println(name);
            }
        }
    }
}
