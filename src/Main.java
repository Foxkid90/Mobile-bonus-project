public class Main {
    public static void main(String[] args) {


        int balance = 100; // рублей - денежный баланс (счёт) клиента
        double rate = 100; // рублей - бонусный тариф


        int firstPayment = 300; // рублей - сумма первого платежа
        double firstBonuses; // рублей - количество начисленных бонусов после первого платежа


        if (firstPayment > 1_000) {
            firstBonuses = firstPayment / rate;
        } else {
            firstBonuses = 0;
        }


        int firstBalance = balance + firstPayment; // баланс после пополнения первым платежом


        System.out.println(firstBalance);
        System.out.println(firstBonuses);


        int secondPayment = 1_150; // рублей - сумма второго платежа
        double secondBonuses; // рублей - количество начисленных бонусов после второго платежа

        if (secondPayment > 1_000) {
            secondBonuses = firstBonuses + (secondPayment / rate);
        } else {
            secondBonuses = firstBonuses + 0;
        }


        int secondBalance = firstBalance + secondPayment; // баланс после пополнения вторым платежом


        System.out.println(secondBalance);
        System.out.println(secondBonuses);
    }
}