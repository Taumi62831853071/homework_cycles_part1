public class Main
{
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("Итерация цикла " + i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println("Итерация цикла " + i);
        }
        for (int i = 0; i < 17; i+=2) {
            System.out.println("Итерация цикла " + i);
        }
        for (int i = 10; i > -11; i--) {
            System.out.println("Итерация цикла " + i);
        }
        for (int i = 1904; i < 2096; i = i + 4) {
            if (i % 100 !=0 || i % 400 == 0) {
                System.out.println(i + " год является високосным в Юлианском и Григорианском календаре");
            } else System.out.println(i + " год является високосным только в Юлианском календаре");
        }
        for (int i = 0; i < 100; i = i + 7) {
            System.out.println("Итерация цикла " + i);
        }
        for (int i = 1; i < 1000; i = i * 2) {
            System.out.println("Итерация цикла " + i);
        }
        int savings = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        float total2 = 0;
        for (int i = 1; i < 13; i++) {
            total2 = total2 + total2/100;
            total2 = total2 + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }
    }
}