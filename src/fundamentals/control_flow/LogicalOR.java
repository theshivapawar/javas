package fundamentals.control_flow;

public class LogicalOR {
    public static void main(String[] args) {

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean isEligibleForLoan = (hasHighIncome || hasGoodCredit);
        System.out.println(isEligibleForLoan);

        boolean isLoggedInFromEmail = false;
        boolean isLoggedInFromGoogle = false;
        boolean isLoggedInFromFacebook = false;
        boolean isAllowedToAccessContent = (isLoggedInFromEmail || isLoggedInFromGoogle || isLoggedInFromFacebook);
        System.out.println(isAllowedToAccessContent);
    }
}
