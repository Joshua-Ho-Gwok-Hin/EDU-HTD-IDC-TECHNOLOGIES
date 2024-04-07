package com.corejava.aggregate;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
//    LocalDate birthday;
    Sex gender;
//    String emailAddress;

    public Person(String name,Sex gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Sex getGender() {
        return gender;
    }

    public static void main(String[] args) {

        List<Person> friends = new ArrayList<>();
        List<Person> enemies = new ArrayList<>();


        Person john = new Person("John",Sex.MALE);
        Person mark = new Person("Mark",Sex.MALE);
        Person luke = new Person("Luke",Sex.MALE);
        Person matthew = new Person("Matthew",Sex.MALE);
        Person kate = new Person("Kate",Sex.FEMALE);
        Person cyndia = new Person("cyndia",Sex.FEMALE);
        Person cindy = new Person("cindy",Sex.FEMALE);
        Person peter = new Person("Peter", Sex.MALE);
        Person james = new Person("James", Sex.MALE);
        Person roger = new Person("Roger", Sex.MALE);

        friends.add(john);
        friends.add(mark);
        friends.add(luke);
        friends.add(matthew);
        friends.add(kate);
        friends.add(cyndia);
        friends.add(cindy);

        enemies.add(peter);
        enemies.add(james);
        enemies.add(roger);

        friends.addAll(enemies);

//        for (Person p : friends) {
//            System.out.println(p.getName());
//        }

        friends
                .stream()
//                .forEach(p -> System.out.print("before = " + p.getName()+ " "))
                .filter(whoAreMale -> whoAreMale.getGender() == Sex.MALE)
                .filter(lessThanSix -> lessThanSix.getName().length()<6)
                .forEach(afterFilter -> System.out.print(afterFilter.getName()+" "));

        System.out.println();


        List<Integer> oddNumber = Arrays.asList(1, 3, 5, 7, 9, 9);
        List<Integer> evenNumber = Arrays.asList(2, 4, 6, 8, 10, 10);
        List<List<Integer>> listOfList = Arrays.asList(oddNumber, evenNumber);
        List<Integer> flattenList = listOfList.stream()
                .flatMap(List::stream)
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Flatten list = " + flattenList);

        List<String> countryArray = Arrays.asList("Singapore", "SUK", "SUSA", "SFrance");
        List<String> countryArrayList = new ArrayList<String>();
        countryArrayList.add("Singapore");
        countryArrayList.add("SUK");
        countryArrayList.add("SUSA");
        countryArrayList.add("SFrance");


        boolean mathResult = countryArray.stream()
                .allMatch(s -> s.startsWith("S"));
        System.out.println(mathResult);

        long total = countryArray.stream().count();

        System.out.println(total);
        int[] arrayNum = {1, 3, 5, 7, 9, 9};

        Optional<String> reduce = countryArray.stream().reduce((s1, s2) -> s1 + " " + s2);
        reduce.ifPresent(System.out::println);
        System.out.println(reduce);
        System.out.println(countryArrayList);
        System.out.println(countryArray);
        System.out.println(oddNumber);
        System.out.println(Arrays.toString(arrayNum));
        System.out.println("***********************");

        Stream<Integer> random = Stream.generate(() -> (new Random())
                .nextInt(50,70));
        random.limit(10)
                .forEach(System.out::println);


        System.out.println("***********************");

        byte[] lengthOfString = new byte[8];
        new Random().nextBytes(lengthOfString);
        String generatedString = new String(lengthOfString, Charset.forName("UTF-8"));
        System.out.println(generatedString);
        System.out.println("***********************");

//        Stream<Integer> random = Stream,iterate (0), x -> new Random().nextInt());








    }
}
