public class ATM{

    public int countBanknotes(int sum){
            int amount = 0;
            int [] nominal = {500, 200, 100, 50, 20, 10, 5, 2, 1};
            int i = 0;
            int bufer = sum;
            while (i < nominal.length) {
                amount += bufer / nominal[i];
                bufer = bufer % nominal[i];
                i++;
            }
    return amount;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(70));
    }



}
