public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}