public class Main {
    public static void main(String[] args) {


        int balance = 100; // рублей - денежный баланс (счёт) клиента
        int rate = 100; // рублей - бонусный тариф


        int payment = 1_100; // рублей - сумма платежа
        int bonuses; // рублей - количество начисленных бонусов


        if (payment > 1_000) {
            bonuses = payment / rate;
        } else {
            bonuses = 0;
        }


        int newBalance = balance + payment + bonuses; // баланс после пополнения


        System.out.println(newBalance);
        System.out.println(bonuses);
    }
}