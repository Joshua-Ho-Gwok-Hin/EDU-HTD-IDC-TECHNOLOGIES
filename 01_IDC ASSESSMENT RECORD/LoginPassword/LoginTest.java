package LoginPassword;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginTest {

    public static void main(String[] args) {

        User john = new User("John", "password");
        User peter = new User("Peter", "password");
        User david = new User("David", "password");
        User mark = new User("Mark", "password");
        User jason = new User("Jason", "password");

        ArrayList<User> users = new ArrayList<>();
        users.add(john);
        users.add(peter);
        users.add(david);
        users.add(mark);
        users.add(jason);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please key in username: ");
        String input = scanner.nextLine();







    }
}
