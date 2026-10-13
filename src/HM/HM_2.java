package HM;

public class HM_2 {
    static void main(String[] args) {

        // Task 1
        byte q = 12;
        short w = 113;
        int e = 4564;
        long r = 123456L;
        float t = 12.25f;
        double y = 12.4586;
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(r);
        System.out.println(t);
        System.out.println(y);

        // Task 2
        float a = 27.12f;
        long s = 987678965549L;
        double d = 2.786;
        short f = 569;
        short g = -159;
        int h = 27897;
        byte j = 67;

        // Task 3
        int teacherLyudmila = 23;
        int teacherAnna = 27;
        int teacherCatherine = 30;
        int sheetsOfPaper = 480;
        int totalStudents = teacherAnna + teacherCatherine + teacherLyudmila;
        int sheetsForStudent = sheetsOfPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsForStudent + " листов бумаги");

        // Task 4
        int bottleInTwoMinute = 16;
        int bottleInOneMinute = bottleInTwoMinute / 2;
        int minuteInOneHours = 60;
        int horseInOneDay = 24;
        int daysInOneMonth = 30;
        int minuteInOneDay = horseInOneDay * minuteInOneHours;
        int minuteInThreeDay = minuteInOneDay * 3;
        int minuteInOneMonth = daysInOneMonth * minuteInOneDay;

        int bottleInTwentyMinute = 20 * bottleInOneMinute;
        int bottleInOneDay = minuteInOneDay * bottleInOneMinute;
        int bottleInThreeDay = minuteInThreeDay * bottleInOneMinute;
        int bottleInOneMonth = minuteInOneMonth * bottleInOneMinute;

        System.out.println("За 20 минут машина произвела " + bottleInTwentyMinute + " штук бутылок");
        System.out.println("За 1 день машина произвела " + bottleInOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleInThreeDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottleInOneMonth + " штук бутылок");

        // Task 5
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int totalPaintNeeded = 120;
        int totalPaintPerClass = whitePaintPerClass + brownPaintPerClass;

        int totalClassesCount = totalPaintNeeded / totalPaintPerClass;
        int totalWhitePaintBought = totalClassesCount * whitePaintPerClass;
        int totalBrownPaintBought = totalClassesCount * brownPaintPerClass;

        System.out.println("В школе, где " + totalClassesCount + " классов, нужно " + totalWhitePaintBought + " банок белой краски и " + totalBrownPaintBought + " банок коричневой краски");

        // Task 6
        int bananasCount = 5;
        int bananaWeight = 80;
        int milkVolumeMl = 200;
        int milkPackWeightGrams = 105;
        int iceCreamCount = 2;
        int iceCreamWeight = 100;
        int eggsCount = 4;
        int eggWeight = 70;
        int totalBananasWeight = bananasCount * bananaWeight;
        int totalMilkWeight =  (milkVolumeMl * milkPackWeightGrams) / 100;
        int totalIceCreamWeight = iceCreamCount * iceCreamWeight;
        int totalEggsWeight = eggsCount * eggWeight;

        int totalWeightGrams = totalEggsWeight + totalIceCreamWeight + totalMilkWeight + totalBananasWeight;
        float totalWeightKilograms = totalWeightGrams / 1000f;
        System.out.println("Вес спортзавтрака равен " + totalWeightGrams + " грамм");
        System.out.println("Вес спортзавтрака равен " + totalWeightKilograms + " килограмм");

        // Task 7
        int weightToLoseKg = 7;
        int targetWeightGrams = weightToLoseKg * 1000;
        int variantOne = 250;
        int variantTwo = 500;
        int daysForVariantOne = targetWeightGrams / variantOne;
        int daysForVariantTwo = targetWeightGrams / variantTwo;
        int averageDaysNeeded = (daysForVariantOne + daysForVariantTwo) / 2;
        System.out.println(daysForVariantOne + " дней понадобится если худеть каждый день по " + variantOne + " грамм");
        System.out.println(daysForVariantTwo + " дней понадобится если худеть каждый день по " + variantTwo + " грамм");
        System.out.println(averageDaysNeeded + " день может потребоваться в среднем, чтобы добиться результата похудения.");

        // Task 8
        double monthsInYear = 12;
        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;

        double mashaOldIncome = mashaSalary * monthsInYear;
        double denisOldIncome = denisSalary * monthsInYear;
        double kristinaOldIncome = kristinaSalary * monthsInYear;

        mashaSalary = mashaSalary * 1.1;
        denisSalary = denisSalary * 1.1;
        kristinaSalary = kristinaSalary * 1.1;

        double mashaNewIncome = mashaSalary * monthsInYear;
        double denisNewIncome = denisSalary * monthsInYear;
        double kristinaNewIncome = kristinaSalary * monthsInYear;

        double mashaIncomeGrowth = mashaNewIncome - mashaOldIncome;
        double denisIncomeGrowth = denisNewIncome - denisOldIncome;
        double kristinaIncomeGrowth = kristinaNewIncome - kristinaOldIncome;

        System.out.println("Маша теперь получает " + mashaNewIncome + " рублей. Годовой доход вырос на " + mashaIncomeGrowth + " рублей");
        System.out.println("Денис теперь получает " + denisNewIncome + " рублей. Годовой доход вырос на " + denisIncomeGrowth + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewIncome + " рублей. Годовой доход вырос на " + kristinaIncomeGrowth + " рублей");



    }
}
