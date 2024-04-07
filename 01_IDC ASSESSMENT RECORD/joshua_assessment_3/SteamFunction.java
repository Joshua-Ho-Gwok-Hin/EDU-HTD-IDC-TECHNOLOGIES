package joshua_assessment_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SteamFunction {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i <=33; i+=3) {
            integerList.add(i);
        }

        integerList.forEach(System.out::println);

        long intList = integerList
                .stream()
                .sorted(Comparator.reverseOrder())
                .peek(System.out::println)
                .count();

        System.out.println("There are a total of " + intList + " numbers in integerlist");

        integerList
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
