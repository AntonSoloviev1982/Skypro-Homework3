public class Main {
    public static void main(String[] args) {


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

    public static void task2(){
        double d = 27.12;
        long l = 987678965549L;
        float f = 2.786F;
        short s = 569;
        short s2 = -159;
        int i = 27897;
        double d2 = 67;
    }

    public static void task3(){
        int totalSchoolchildLudmilaAlekseevna = 23;
        int totalSchoolchildAnnaSergeevna = 27;
        int totalSchoolchildEcaterinaAndreevna = 30;
        int totalPaper = 480;
        int countPaperFromSchoolchild = 480 / (totalSchoolchildLudmilaAlekseevna + totalSchoolchildAnnaSergeevna
                + totalSchoolchildEcaterinaAndreevna);
        System.out.println("На каждого ученика расчитано " + countPaperFromSchoolchild + " листов бумаги");
    }
}