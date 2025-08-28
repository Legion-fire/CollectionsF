import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Например, подсчет уникальных вхождений слов
        String[] words = {"Foo", "Bar", "Foo", "Buzz", "Foo", "Buzz", "Fizz", "Fizz"};
        Map<String, Integer> map = CollectionsF.countOccurrences(words);
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}