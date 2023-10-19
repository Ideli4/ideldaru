public class HW5 {
    public static void main(String args[]) {
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
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
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
