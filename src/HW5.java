public class HW5 {
    public static void main(String args[]) {

        int a = 7;
        int b = 4;
        if (a == b) {
            System.out.println("квадрат");
        } else {
            System.out.println("прямоугольник");
        }

        System.out.println("===========");

        int price = 7000;
        int discount = 5000;
        if (price > discount) {
            double nprice = price * 0.9;
            System.out.println(nprice + " со скидкой");
        } else {
            System.out.println(price + " без");
        }

        System.out.println("===========");

        int grade = 54;
        if (grade > 80) {
            System.out.println("A");
        }
        if (grade > 60 && grade <= 80) {
            System.out.println("B");
        }
        if (grade > 50 && grade <= 60) {
            System.out.println("C");
        }
        if (grade > 45 && grade <= 50) {
            System.out.println("D");
        }
        if (grade > 25 && grade <= 45) {
            System.out.println("E");
        }
        if (grade <= 25) {
            System.out.println("F");
        }

        int l = 518631;
        while (l > 0) {
            int f = l % 10;
            System.out.print(f);
            l = l / 10;
        }

        int с = 17;
        boolean prime = true;
        for (int i = 2; i < с; i++) {

            if (с % i == 0) {
                prime = false;
                System.out.println("непростое");
                break;
            }
        }
        if (prime) {
            System.out.println("простое");
        }

        System.out.println("===========");


        int num = 6;

        if (num % 2 == 0) {
            System.out.println("4etnoe");
        } else {
            System.out.println("Ne 4etnoe");
        }

        System.out.println("===========");

        int num1 = 5;
        int num2 = 0;
        if (num1 > num2) {
            System.out.println("num 1 bigger than num2");
        } else {
            System.out.println("num2 bigger than num1");
        }

        System.out.println("===========");

        int year = 2015;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("366");
        } else System.out.println("365");


        System.out.println("===========");

        int weekDay = 5;
        if (weekDay == 1) {
            System.out.println("Monday");
        } else if (weekDay == 2) {
            System.out.println("Tuesday");
        } else if (weekDay == 3) {
            System.out.println("Wednesday");
        } else if (weekDay == 4) {
            System.out.println("Thursday");
        } else if (weekDay == 5) {
            System.out.println("Friday");
        } else if (weekDay == 6) {
            System.out.println("Saturday");
        } else if (weekDay == 7) {
            System.out.println("Sunday");
        }

        System.out.println("===========");

        int x = 7;
        int y = -5;
        if (x > 0 && y > 0) {
            System.out.println("+X +Y");
        } else if (x > 0 && y < 0) {
            System.out.println("+X -Y");
        } else if (x < 0 && y < 0) {
            System.out.println("-X -Y");
        } else if (x < 0 && y > 0) {
            System.out.println("-X +Y");
        }


    }
}
