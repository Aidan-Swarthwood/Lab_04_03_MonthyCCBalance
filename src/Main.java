public class Main {
    public static void main(String[] args) {
        //A program that starts with a credit card balance of $5000 and then calculates the interest at a rate of 17%.
        // Assume the user does not make any payments.  Display the interest due after one month and again after two months.

        double balance = 5000;
        double oneMonth = balance * .17;
        double finalOneMonth = oneMonth + balance;
        System.out.println("one month of payment due: " + finalOneMonth);

        double twoMonth = finalOneMonth * .17;
        double finalTwoMonth = twoMonth + finalOneMonth;
        System.out.println("two months of payment due: " + finalTwoMonth);


    }
}