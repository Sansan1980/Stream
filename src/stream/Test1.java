package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");
// Преобразовать элементы коллекции  list в число равное количеству символов подстроки в элементах и вернуть полученный int к String)
//        List<String> list2 = null;//интересно почему я должен присвоить  null list2 прежде чем указать ссылку на list
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//            list2 = list; //интересно почему я должен присвоить  null list2 прежде чем указать ссылку на list
//        }
//        System.out.println(list);
//        System.out.println(list2);

// Преобразовать элементы коллекции  list в число равное количеству символов подстроки в элементах и вернуть
// полученный int к String c помощью метода stream().
        List<Integer> list3 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list3);
        System.out.println(list);

        // Создать Stream у массива array
        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(elements ->
        {
            if (elements % 3 == 0) {
                elements = elements / 3;
            }
            return elements;
        }).toArray();
//        System.out.println(Arrays.toString(array));// результат [5, 3, 1, 8, 1]
//        System.out.println(array);// рeзультат в консоли [I@7530d0a

// Создать Stream у Set (Set автоматически сортирует элементы удаляя дубликаты)
        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        set.add("poka");
        System.out.println(set);// [OK, kak dela?, poka, privet]
        Set<Integer> set3 = set.stream().map(String::length).collect(Collectors.toSet());// Заменили запись ,((element -> element.length())) на синтаксичкеский сахар(String::length)
        List<Integer> list4 = set.stream().map(String::length).collect(Collectors.toList());//Преобразовали из Set в поток  Srteam из стрима  в List
        System.out.println(set3);//[2, 4, 6, 9]
        System.out.println(list4);//[[2, 9, 4, 6]
        List<String> fruits = Stream.of("apple", "banana", "lemon", "orange")
                // здесь могут быть ещё какие-то преобразования
                .peek(e-> System.out.println(e))
                .collect(Collectors.toList());
        System.out.println(fruits);
    }

}
