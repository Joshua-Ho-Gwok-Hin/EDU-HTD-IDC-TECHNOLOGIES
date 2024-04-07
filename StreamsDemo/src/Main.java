import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "071");

        List<String> gNumbers = new ArrayList<>();

//        someBingoNumbers.forEach(tableNumber ->{
//            if (tableNumber.toUpperCase().startsWith("G")) {
//                gNumbers.add(tableNumber);
////                System.out.println(tableNumber);
//            }
//        });
//
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s) -> System.out.println(s));

        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("**********************");

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());


        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Deer",25 );
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        Department hr = new Department("Human Resouce");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);

        Department acc = new Department("Accounting");
        acc.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(acc);

        departments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .forEach(System.out::println);

        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .collect(Collectors.toList());

        List<String> sortedArrayGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for (String s : sortedGNumbers) {
            System.out.println(s);
        }

        Map<Integer, List<Employee>> groupByAge = departments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getAge));

        departments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

        Stream.of("ABC", "AC", "BAA", "CCCC", "XY", "ST")
                .filter(s->{
                    System.out.println(s);
                    return s.length() == 3;
                })
                .count();




    }
}
