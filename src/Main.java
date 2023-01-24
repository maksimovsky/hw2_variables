public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper);
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog + "\n" + cat + "\n" + paper);
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog + "\n" + cat + "\n" + paper);
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("\nЗадача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var summaryWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов: " + summaryWeight + " кг");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница весов бойцов: " + weightDifference + " кг");
    }

    public static void task7() {
        System.out.println("\nЗадача 7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница весов бойцов 1: " + weightDifference + " кг");
        weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница весов бойцов 2: " + weightDifference + " кг");
    }

    public static void task8() {
        System.out.println("\nЗадача 8");
        var sumTime = 640;
        var workerTime = 8;
        var workers = sumTime / workerTime;
        System.out.println("Всего работников в компании — " + workers + " человек");
        workers += 94;
        sumTime = workerTime * workers;
        System.out.println("Если в компании работает " + workers + " человека, то всего " + sumTime + " часа работы может быть поделено между сотрудниками");
    }
}