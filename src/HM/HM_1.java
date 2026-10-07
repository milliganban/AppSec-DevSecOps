package HM;

public class HM_1 {
    static void main(String[] args) {
        // Task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Task 4
        var friend = 19;
        friend = friend + 2;
        friend = friend / 7;
        System.out.println(friend);
        System.out.println(friend);
        System.out.println(friend);

        // Task 5
        var frog = 3.5;
        frog = frog * 10;
        frog = frog / 3.5;
        frog = frog + 4;
        System.out.println(frog);
        System.out.println(frog);
        System.out.println(frog);
        System.out.println(frog);

        // Task 6
        var boxerOneMass = 78.2;
        var boxerTwoMass = 82.7;
        var totalBoxerMass = boxerOneMass + boxerTwoMass;
        var differentBoxerMass = boxerTwoMass - boxerOneMass;
        System.out.println("Общая масса бойцов равно " + totalBoxerMass + " кг");
        System.out.println("Разница в весе состовляет " + differentBoxerMass + " кг");

        // Task 7
        var methodOne = boxerTwoMass - boxerOneMass;
        var methodTwo = boxerTwoMass % boxerOneMass;
        System.out.println("Разница в весе состовляет " + methodOne + " кг");
        System.out.println("Разница в весе состовляет " + methodTwo + " кг");

        // Task 8
        var totalWorkHours = 640;
        var oneWorkerHours = 8;
        var totalWorkerInCompany = totalWorkHours / oneWorkerHours;
        var moreWorkerInCompany = totalWorkerInCompany + 94;
        var moreWorkerHours = moreWorkerInCompany * oneWorkerHours;
        System.out.println("Всего работников в компании " + totalWorkerInCompany + " человек");
        System.out.println("Если в компании работает " + moreWorkerInCompany + " человека, то всего " + moreWorkerHours + " часов работы может быть поделено между сотрудниками");
    }
}
