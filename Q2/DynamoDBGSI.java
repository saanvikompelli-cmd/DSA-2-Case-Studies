import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class User {

    String userId;
    String countryCode;
    LocalDate signupDate;

    User(String userId,
         String countryCode,
         LocalDate signupDate) {

        this.userId = userId;
        this.countryCode = countryCode;
        this.signupDate = signupDate;
    }
}

public class DynamoDBGSI {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("U101", "IN",
                LocalDate.of(2026, 5, 1)));

        users.add(new User("U102", "US",
                LocalDate.of(2026, 5, 5)));

        users.add(new User("U103", "IN",
                LocalDate.of(2026, 5, 12)));

        users.add(new User("U104", "IN",
                LocalDate.of(2026, 5, 20)));

        users.add(new User("U105", "UK",
                LocalDate.of(2026, 5, 25)));

        users.add(new User("U106", "IN",
                LocalDate.of(2026, 5, 28)));

        LocalDate startDate =
                LocalDate.of(2026, 5, 1);

        LocalDate endDate =
                LocalDate.of(2026, 5, 30);

        int count = 0;

        System.out.println(
            "Users in IN who signed up in last 30 days:\n");

        for (User u : users) {

            if (u.countryCode.equals("IN") &&
                !u.signupDate.isBefore(startDate) &&
                !u.signupDate.isAfter(endDate)) {

                System.out.println(
                    u.userId + "  " +
                    u.countryCode + "  " +
                    u.signupDate);

                count++;
            }
        }

        System.out.println(
            "\nTotal Matching Users = " + count);
    }
}