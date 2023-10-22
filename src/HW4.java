public class HW4 {
    public static void main(String args[]) {
        int num1 = 5;
        int num2 = 10;
        int sum = num1 * num2;
        System.out.println(sum);

        System.out.println("===========");

        int twenty = 20;
        double twoHalf = 2.5;
        double delenie = twenty / twoHalf;
        System.out.println(delenie);

        System.out.println("===========");

        int a = 15;
        int b = 9;
        int perimetr = (15 * 2) + (9 * 2);
        int ploshad = a * b;
        System.out.println("Периметр = " + perimetr + " Площадь = " + ploshad);

        System.out.println("===========");

        int x = 0;
        int c = x + 5;
        System.out.println("x + 5 = " + c);

        System.out.println("===========");

        int o = 25;
        int p = 43;
        if (o < p) {
            System.out.println("25>43");
        } else {
            System.out.println("Выражение не верно");
        }

        System.out.println("===========");

        int m = 10;
        int n = 5;
        int summa = m + n;
        int proizvedenie = m * n;
        int delenieE = m / n;
        double modul = m % n;
        System.out.println("summa = " + summa + " delenie = " + delenieE + " modul = " + modul);

        System.out.println("===========");

        double farengeit = 98.6;
        double celsia = (farengeit - 32) * 5 / 9;
        System.out.println(farengeit + " = " + celsia);

        System.out.println("===========");

        int j = 65;
        int k = 80;
        if (j < 50 && j < k) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }


    }
}
