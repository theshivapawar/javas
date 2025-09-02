package fundamentals.control_flow;

public class LogicalAND {
    public static void main(String[] args) {

        // Logical operators are used to combine multiple boolean expressions

        int temperature = 31;
        boolean isWarm = (temperature >= 21 && temperature <= 30);
        System.out.println(isWarm);


        boolean isLoggedIn = false;
        boolean isEmailVerified = true;
        boolean isCardInfoValid = false;
        boolean isAllowedToMakePurchase = (isLoggedIn && isEmailVerified && isCardInfoValid);
        System.out.println(isAllowedToMakePurchase);
    }
}
