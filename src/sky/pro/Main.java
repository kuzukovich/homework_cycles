package sky.pro;

public class Main {

    public static void main(String[] args) {
        // task 1
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println("");
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
        //task 2
        int dayFriday = 5;
        for (i = 1; i <= 31; i++) {
            if (i % dayFriday == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }

            //task 3
            int curentYear = 2021;
            int startYear = curentYear - 200;
            int finishYear = curentYear + 100;
           for ( i= startYear ;i < finishYear;i++) {
                if (i % 79 == 0) {
                    System.out.println( i);
                }

            }

        }
    }

