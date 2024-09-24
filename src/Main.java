public class Main {
    public static void main(String[] args) {
        int age = 25;
        System.out.println("Задача №1");
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {System.out.println("Он не достиг совершеннолетия, нужно немного подождать");}

        age = 14;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else
        {System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");}

        int temp = 15;
        System.out.println("Задача №2");
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов , можно идти без шапки");
        } else {System.out.println("На улице " + temp + "  градусов, нужно надеть шапку");}

        temp = -2;
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов , можно идти без шапки");
        } else {System.out.println("На улице " + temp + "  градуса, нужно надеть шапку");}

        int speed = 45;
        System.out.println("Задача №3");
        if (speed > 60) {
            System.out.println("Если скорость  " + speed + " км/час , то придется заплатить штраф");
        } else {System.out.println("Если скорость  " + speed + "  км/час, можно ездить спокойно");}

        speed = 64;
        if (speed > 60) {
            System.out.println("Если скорость  " + speed + " км/час , то придется заплатить штраф");
        } else {System.out.println("Если скорость  " + speed + "  км/час, можно ездить спокойно");}

        int age1 = 34;
        System.out.println("Задача №4");
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад");
        }
        else if (age1 >= 7 && age1 <=17) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу");
        }
        else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то его место в университете");
        }
        else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему пора ходить на работу");
        }
        age1 = 6 ;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад");
        }
        else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу");
        }
        else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то его место в университете");
        }
        else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему пора ходить на работу");
        }
        age1 = 9;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад");
        }
        else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу");
        }
        else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то его место в университете");
        }
        else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему пора ходить на работу");
        }
        age1 = 20;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад");
        }
        else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу");
        }
        else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то его место в университете");
        }
        else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему пора ходить на работу");
        }
        int age2 = 14;
        System.out.println("Задача №5");
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то ему нельзя кататься на аттракционе");
        }
        if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то ему можно кататься на аттракционе в сопровождении взрослых");
        }
        if (age2 >= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то ему можно кататься на аттракционе без сопровождения взрослых");
        }
        age2 = 4;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то ему нельзя кататься на аттракционе");
        }
        if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то ему можно кататься на аттракционе в сопровождении взрослых");
        }
        if (age2 >= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то ему можно кататься на аттракционе без сопровождения взрослых");
        }

        age2 = 8;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то ему нельзя кататься на аттракционе");
        }
        if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то ему можно кататься на аттракционе в сопровождении взрослых");
        }
        if (age2 >= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то ему можно кататься на аттракционе без сопровождения взрослых");
        }

        int carriageCapacity = 84;
        System.out.println("Задача №6");
        if (carriageCapacity <= 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (carriageCapacity>60&&carriageCapacity<= 102) {
        System.out.println("В вагоне есть стоячие места");}
        else {System.out.println("Мест нет");}

        carriageCapacity = 44;
        if (carriageCapacity <= 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (carriageCapacity>60&&carriageCapacity<= 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {System.out.println("Мест нет");}

        carriageCapacity = 103;
        if (carriageCapacity <= 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (carriageCapacity>60&&carriageCapacity<= 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {System.out.println("Мест нет");
        }

        int one = 3;
        int two = 8;
        int three = 15;
        System.out.println("Задача №7");
        if (one > two && one > three) {
            System.out.println("Число один - наибольшее из всех.");
        } else if (two > one && two > three) {
            System.out.println("Число два - наибольшее из всех.");
        } else {System.out.println("Число три - наибольшее из всех.");}

        one = 28;
        two = 17;
        three = 11;
        if (one > two && one > three) {
            System.out.println("Число один - наибольшее из всех.");
        } else if (two > one && two > three) {
            System.out.println("Число два - наибольшее из всех.");
        } else {System.out.println("Число три - наибольшее из всех.");}

        one = 9;
        two = 45;
        three = 33;
        if (one > two && one > three) {
            System.out.println("Число один - наибольшее из всех.");
        } else if (two > one && two > three) {
            System.out.println("Число два - наибольшее из всех.");
        } else {System.out.println("Число три - наибольшее из всех.");}
    }
}
