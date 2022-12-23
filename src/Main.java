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
        byte b = 2;
        short s = 12;
        int i = 124;
        long l = 123456L;
        float f = 121.64F;
        double d = 3.14;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
    }

    public static void task2() {
        double d = 27.12;
        long l = 987678965549L;
        float f = 2.786F;
        short s = 569;
        short s2 = -159;
        int i = 27897;
        double d2 = 67;
    }

    public static void task3() {
        int totalSchoolchildLudmilaAlekseevna = 23;
        int totalSchoolchildAnnaSergeevna = 27;
        int totalSchoolchildEcaterinaAndreevna = 30;
        int totalPaper = 480;
        int countPaperFromSchoolchild = 480 / (totalSchoolchildLudmilaAlekseevna + totalSchoolchildAnnaSergeevna
                + totalSchoolchildEcaterinaAndreevna);
        System.out.println("На каждого ученика расчитано " + countPaperFromSchoolchild + " листов бумаги");
    }

    public static void task4() {
        int machinePerformanceInOneMinute = 16 / 2;
        int machinePerformanceInTwentyMinute = machinePerformanceInOneMinute * 20;
        int machinePerformanceInOneDay = machinePerformanceInOneMinute * 60 * 24;
        int machinePerformanceInThreeDay = machinePerformanceInOneDay * 3;
        int machinePerformanceInOneMonth = machinePerformanceInOneDay * 30;
        System.out.println("За двадцать минут машина произвела " + machinePerformanceInTwentyMinute
                + " штук бутылок");
        System.out.println("За один день машина произвела " + machinePerformanceInOneDay
                + " штук бутылок");
        System.out.println("За три дня машина произвела " + machinePerformanceInThreeDay
                + " штук бутылок");
        System.out.println("За один месяц машина произвела " + machinePerformanceInOneMonth
                + " штук бутылок");
    }

    public static void task5() {
        int totalPaintForSchoolRepair = 120;
        int countOfClass = totalPaintForSchoolRepair / (2 + 4);
        int countOfWhitePaint = countOfClass * 2;
        int countOfBrownPaint = countOfClass * 4;
        System.out.println("В школе, где " + countOfClass + " классов, нужно " + countOfWhitePaint +
                " банок белой краски и " + countOfBrownPaint + " банок коричневой краски");
    }

    public static void task6() {
        int countOfBananas = 5;
        int countOfMilk = 200;
        int countOfIceCream = 2;
        int countOfEggs = 4;
        double totalWeightSportBreakfastInGram = countOfBananas * 80 + countOfMilk * 1.05 +
                countOfIceCream * 100 + countOfEggs * 70;
        double totalWeightSportBreakfastInKilo = totalWeightSportBreakfastInGram / 1000;
        System.out.println("Вес спортзавтрака в граммах равен " + totalWeightSportBreakfastInGram + " гр");
        System.out.println("Вес спортзавтрака в киллограмах равен " +
                totalWeightSportBreakfastInKilo + " кг");
    }

    public static void task7() {
        int needThrowWeightInGram = 7 * 1000;
        int maxSpeedThrowWeightGramInDay = 500;
        int minSpeedThrowWeightGramInDay = 250;
        int averageSpeedThrowWeightGramInDay = (maxSpeedThrowWeightGramInDay +
                minSpeedThrowWeightGramInDay) / 2;
        int countDayByMaxSpeedThrowWeight = needThrowWeightInGram / maxSpeedThrowWeightGramInDay;
        int countDayByMinSpeedThrowWeight = needThrowWeightInGram / minSpeedThrowWeightGramInDay;
        int countDayByAverageSpeedThrowWeight = needThrowWeightInGram / averageSpeedThrowWeightGramInDay;
        System.out.println(countDayByMaxSpeedThrowWeight + " дней уйдет на похудание, если спортсмен будет" +
                " терять каждый день по " + maxSpeedThrowWeightGramInDay + " грамм");
        System.out.println(countDayByMinSpeedThrowWeight + " дней уйдет на похудание, если спортсмен будет" +
                " терять каждый день по " + minSpeedThrowWeightGramInDay + " грамм");
        System.out.println(countDayByAverageSpeedThrowWeight + " дней уйдет на похудание, если спортсмен будет" +
                " терять каждый день по " + averageSpeedThrowWeightGramInDay + " грамм");
    }

    public static void task8() {
        double salaryMasha = 67760;
        double newSalaryMasha = salaryMasha + (salaryMasha / 10);
        double salaryDenis = 83690;
        double newSalaryDenis = salaryDenis + (salaryDenis / 10);
        double differenceInAnnualIncomeBetweenSalaryAndNewSalaryMasha = newSalaryMasha * 12
                - salaryMasha * 12;
        double differenceInAnnualIncomeBetweenSalaryAndNewSalaryDenis = newSalaryDenis * 12
                - salaryDenis * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на "
        + differenceInAnnualIncomeBetweenSalaryAndNewSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на "
                + differenceInAnnualIncomeBetweenSalaryAndNewSalaryDenis + " рублей");


    }
}