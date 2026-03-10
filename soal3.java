public class soal3 {
    public static void main(String[] args) {

        int accountNumber = 13680;
        int storedAccount = 13680;
        String statusCode = "valid";
        double amountOfSale = 300;

        if (accountNumber == storedAccount && statusCode.equals("valid")) {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Amount of Sale: " + amountOfSale);
        } else {
            System.out.println("Account tidak ditemukan atau tidak valid.");
        }
    }
}
