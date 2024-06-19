import java.util.*;
import java.util.stream.Collectors;

public class Gukov {
    public static List<String> lists1 = new ArrayList<>(4);

    public static void main(String[] args) {
        lists1.add("hsbdfshfbs");
        lists1.add("sshsh");
        lists1.add("hhh");
        lists1.add("hsbdfserhasshfbs");

        task_1();
        taskMaxInt(task_1());
    }

    public static List<Integer> task_1() {
        List<Integer> expected = lists1.stream()//код тут
                .peek(e -> System.out.print(e))
                .map(String::length)
                //.max(Comparator.naturalOrder());
                //.orElse()
                // .filter((e) -> (e % 2) == 0)
                .peek(e -> System.out.print(" = " + e + " + 1 = "))
                //.peek(e -> System.out.println(e))
                .map(e -> e + 1)
                .peek(e -> System.out.println(e))
                //.toList();
                .collect(Collectors.toList());
        //System.out.println(expected);
        return expected;
    }

    public static List<Integer> taskMaxInt(List<Integer> listInt1) {
        listInt1 = Collections.singletonList(task_1().stream()
                .max(Integer::compareTo).get());



        return listInt1;
    }
    //-//-
}
