import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaEx1 {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Runnable runnable1 = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };
//        System.out.println(lambdaFunction.apply("1234567890"));

        System.out.println(everySecondCharacter(lambdaFunction, "1234567890"));

        Supplier<String> iLoveJava = () -> { return "I love Java!"; };
        String result = iLoveJava.get();
        System.out.println(result);

        List<String> topNames2015 = Arrays.asList(
                "amelia", "olivia", "emily", "isla",
                "ava", "oliver", "jack", "charlie", "harry", "jacob"
        );


        System.out.println("*************************");
//        List<String> firstUpperCaseList = new ArrayList<>();
//        topNames2015.forEach(name->{
//            firstUpperCaseList.add(name.substring(0, 1).toUpperCase() + name.substring(1));
//        });
//        firstUpperCaseList.sort(String::compareTo);
//        firstUpperCaseList.forEach(System.out::println);
//
//        firstUpperCaseList.stream()
//                .sorted()
//                .forEach(System.out::println);

        topNames2015
                .stream()
                .map(name-> name.substring(0,1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted()
                .forEach(System.out::println);

        long number2 = topNames2015
                .stream()
                .map(name-> name.substring(0,1).toUpperCase() + name.substring(1))
                .filter(name-> name.startsWith("A"))
                .count();

        System.out.println("Number of names beginning with A is " + number2);














    }

//    public static

    public static String everySecondCharacter(Function<String, String> functionStr, String source) {
        return functionStr.apply(source);
    }

    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }


}
