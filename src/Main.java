public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int intVariable = 2000000;
        byte byteVariable =110;
        short shortVariable =-30500;
        long longVariable =1100000000L;
        float floatVariable =3;
        double  doubleVariable =-110.45;
        System.out.println("Значение переменной intVariable c типом int равно "+intVariable);
        System.out.println("Значение переменной byteVariable c типом byte равно "+byteVariable);
        System.out.println("Значение переменной shortVariable c типом short равно "+shortVariable);
        System.out.println("Значение переменной longVariable c типом long равно "+longVariable);
        System.out.println("Значение переменной floatVariable c типом float равно "+floatVariable);
        System.out.println("Значение переменной doubleVariable c типом double равно "+doubleVariable);

    }

    public static void task2 (){
         System.out.println("Задача 2");
    // Пишем код для задачи 2
   float f=27.12f;
   long l=987678965549L;
   float f1=2.786f;
   short s=569;
   short s1=-159;
   short s3=27897;
   int i=67;

}
    public static void task3 (){
        System.out.println("Задача 3");
        // Пишем код для задачи 3
       byte studentLP=23;
        byte studentAS=27;
        byte studentEA=30;
        int studentAll=studentLP+studentAS+studentEA;
        short sheetsPaper=480;
        int studentPaper=sheetsPaper/studentAll;
        System.out.println("На каждого ученика рассчитано "+ studentPaper +" листов бумаги");
    }
    public static void task4 (){
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        byte productionMachineVmin=16/2;
        int productionMachine20min=productionMachineVmin*20;
        int productionMachineDay=productionMachineVmin*24*60;
        int productionMachineThreeDay=productionMachineVmin*3*24*60;
        int productionMachineMonth=productionMachineVmin*30*24*60;
        System.out.println("За 20 мин. машина произвела "+productionMachine20min+" штук бутылок.");
        System.out.println("За сутки машина произвела "+productionMachineDay+" штук бутылок.");
        System.out.println("За 3 дня машина произвела "+productionMachineThreeDay+" штук бутылок.");
        System.out.println("За 1 месяц машина произвела "+productionMachineMonth+" штук бутылок.");

    }
}