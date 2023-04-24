public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + "  он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 65;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }
    }


    public static void task4() {
        System.out.println("Задача 4");
        int age = 65;
        boolean toSleep = age < 2;
        if (toSleep) {
            System.out.println("Если возраст человека равен " + age + " , то ему пора спать");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        } else if (age > 6 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        } else if (age > 24 && age < 60) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        } else if (age >= 60) {
            System.out.println("Если возраст человека равен " + age + " , то он может отдохнуть");
        }
    }


    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " , то он не может кататься на аттракционе");
        } else if (age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься без сопровождения взрослого");
        }
    }


    public static void task6() {
        System.out.println("Задача 6");
        int capacity = 102;
        int sit = 60;
        int stand = capacity - sit;

        int busySit = 59;
        int busyStand = 30;
        if (busySit < sit) {
            System.out.println("Есть ещё " + (sit - busySit) + " мест для сидения");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (busyStand < stand) {
            System.out.println("Есть ещё " + (stand - busyStand) + " мест стоячих");
        } else {
            System.out.println("Сточих мест нет");
        }

    }


    public static void task7() {
        System.out.println("Задача 7");
        int one = 15;
        int two = 9;
        int three = 12;

        if (one > two) {
            if (one > three) {
                System.out.println("Самое большое число " + one);
            } else if (three > one) {
                System.out.println("Максимальное чило " + three);
            } else {
                System.out.println("Число " + one + " и число " + three + " равны");
            }
        } else if (two > one) {
            if (two > three) {
                System.out.println("Максимальное чило" + two);
            } else if (two < three) {
                System.out.println("Максимальное число " + three);
            } else {
                System.out.println("Число " + two + " и число " + three + " равны");
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное чило " + one);
            } else if (three > one) {
                System.out.println("Максимальное чило " + three);
            } else {
                System.out.println("Все числа равны");
            }
        }
    }
}






