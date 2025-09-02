package fundamentals.control_flow;

public class LogicalNot {
    public static void main(String[] args) {

        boolean hasHighIncome = false;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = false;

        boolean isEligibleForLoan = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligibleForLoan);
    }
}