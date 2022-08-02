public class Main {

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
    public static void printIsLeapYear (int year){
        boolean isLeapYear = true;
        System.out.printf("Год %s является високосным ", year);
    }
    private static void printIsLeapYearResult(int year){
        boolean isLeapYear =false;

            System.out.printf("Год %s не является високосным ", year);
    }
//    Задание 1
//    Реализуйте метод, который получает в качестве параметра год, а затем проверяет, является ли он високосным,
//    и выводит результат в консоль. 
//    *Эту проверку вы уже реализовывали в задании по условным операторам.*
//    Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
//    Результат программы выведите в консоль. Если год високосный, то должно быть выведено “*номер года —
//    * високосный год”. Если год не високосный, то, соответственно: “*номер года —* не **високосный год”.
//    *Подсказку с выполнением задания вы можете найти в шпаргалке урока.*

    public static void main(String[] args){
    int year = 2020;
    if (isLeapYear(year)==false) {
            printIsLeapYearResult(year);
        } else if (isLeapYear(year)==true) {
            printIsLeapYear(year);
        }
    }
}
