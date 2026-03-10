public class soal2 {
    public static void main(String[] args) {

        int computerAmount = 3;
        int peripheral = 1;
        boolean businessHours = true;
        boolean dropOffPickup = false;

        double baseFee = 0;
        double additionalFee = 0;
        double total;

        if (computerAmount == 1 || computerAmount == 2) {
            baseFee = 50;
            additionalFee = 0;
        } 
        else if (computerAmount >= 3 && computerAmount <= 10) {
            baseFee = 100;
            additionalFee = 10 * peripheral;
        } 
        else if (computerAmount > 10) {
            baseFee = 500;
            additionalFee = 10 * peripheral;
        }

        if (!businessHours) {
            baseFee = baseFee * 2;
        }

        if (dropOffPickup) {
            baseFee = baseFee / 2;
        }

        total = baseFee + additionalFee;

        System.out.println("Base Fee: " + baseFee);
        System.out.println("Additional Fee: " + additionalFee);
        System.out.println("Total Biaya Servis: " + total);
    }
}
