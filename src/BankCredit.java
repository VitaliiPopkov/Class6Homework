import java.util.Scanner;

public class BankCredit {

    public static void main(String[] args) {
        double credit = 700;
        Scanner scannerPutMoney = new Scanner(System.in);
        do {
            System.out.println("Please enter next amount of money that you want to pay:");
            double payment = scannerPutMoney.nextDouble();
            credit = calculateCredit(credit, payment);
            System.out.println("Loan balance - " + credit);
        }
        while (credit > 0);
    }

    private static double calculateCredit(double credit, double payment) {
        double minMonthlyPayment = 100;

        // when user input less than minimum
        if (payment < minMonthlyPayment) {
            System.out.println("Please add " + (minMonthlyPayment - payment) + " $. Minimum monthly payment is: " + minMonthlyPayment + " $." );
        }
        // when user pay all credit
        else if (credit == payment){
            System.out.println("Congratulation, you pay all credit");
            credit = credit - payment;
        }
        // when user pay more than sum of credit
        else if (payment > credit) {
            System.out.println("Congratulation, you pay all credit, but you paid extra - "
                    + (payment - credit) + ", please take your oven back.");
            credit = 0;
        }
        // when user pay more than minimum and have overpayment
        else {
            credit = credit - payment;
            if (payment > minMonthlyPayment) {
                System.out.println("You have overpayment - " + (payment - minMonthlyPayment));
            }
        }
        return credit;
    }
}
