public class Main {
    public static void main(String[] args) {
qodi (1624);
qodi( 1825);
qodi(2012);

printApp(2007,1);
printApp(2005,0);
printApp(2019,1);


var days =bank(55);
if (days == -1){
        System.out.println("Доставки нет");
} else {
    System.out.println("Количество дней"+days );
    }

    }


    private static void qodi(int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }
    }
        private static void printApp(int deviceYear,int clientOs){
            if (deviceYear < 2015 && clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else if (deviceYear < 2015 && clientOs == 1) {
                System.out.println("Установите облегченную версию приложения для Andriod по ссылке");
            } else if (deviceYear <= 2015 && clientOs == 0) {
                System.out.println("Установите  версию приложения для IOS по ссылке");
            } else if (deviceYear >= 2015 && clientOs == 1) {
                System.out.println("Установите версию приложения для Andriod по ссылке");
            }
        }
            private static int bank(int distance ) {
            if (distance>100) {
                return -1;
            }else {
                int days =1 ;
            if (distance>20);{
                days++;
            }
            if(distance>60);{
           days ++;
                }
                return days;


    }

    }

}










