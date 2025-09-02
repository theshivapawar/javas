package fundamentals.control_flow;

public class SwitchStatement {
    public static void main(String[] args) {

        String role = "admin";

        if (role == "admin")
            System.out.println("You are an admin.");
        else if (role == "moderator")
            System.out.println("You are a moderator.");
        else
            System.out.println("You are a guest.");

        switch (role) {
            case "admin": // role.hashcode() and role.equals()
                System.out.println("You are an admin.");
                break;
            case "moderator":
                System.out.println("You are a moderator.");
                break;
            default:
                System.out.println("You are a guest.");
        }

        int day = 5;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Day");
        }

        // Intentional use of fall through
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Day");
        }

        String result = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid Day";
        };
        System.out.println(result);

        char grade = 'j';
        switch (grade) {
            case 'a':
            case 'b':
                System.out.println("Excellent");
                break;
            case 'c':
            case 'd':
                System.out.println("Needs Improvement");
                break;
            default:
                System.out.println("Invalid Grade");
        }

        switch (grade) {
            case 'a', 'b' -> System.out.println("Excellent");
            case 'c', 'd' -> System.out.println("Needs Improvement");
            default -> System.out.println("Invalid Grade");
        }
    }
}

/*
* Supported
* byte, short, int, char (Wrappers)
* String, enum
*
* Not Supported
* long, float, double, boolean (Wrappers)
* Custom objects (except String and enum)
* */