public class Main {
    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }

        for (int c = 0; c <= 17; c = c + 2) {
            System.out.println(c);
        }

        for (int d = 10; d >= -10; d = d - 2) {
            System.out.println(d);
        }

        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(+year + " год является високосным");
        }

        for (int e = 7; e <= 98; e = e + 7) {
            System.out.println(e);
        }

        for (int f = 1; f <= 512; f = f * 2) {
            System.out.println(f);
        }

        int money = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        money = 29000;
        total = 0;
        for (int i = 1; i <= 12; i++) {
            money = money + money / 100;
            total = total + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        int number = 2;
        int result = 0;
        for (int num = 1; num <= 10; num++) {
            result = number + result;
            System.out.println(+number + "*" + num + "=" + result);
        }
    }
}