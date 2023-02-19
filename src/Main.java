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
    public static void task5 (){
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        byte canPaintAll=120;
        byte canPaintClassWhite=2;
        byte canPaintClassBraun=4;
        int ClassSchool=canPaintAll/(canPaintClassWhite+canPaintClassBraun);
       int canPaintWhiteSchool=ClassSchool*canPaintClassWhite;
        int canPaintBraunSchool=ClassSchool*canPaintClassBraun;
        System.out.println("В школе, где "+ClassSchool+" классов, нужно "+canPaintWhiteSchool+" банок белой краски и "+canPaintBraunSchool+" банок коричневой краски.");
    }
    public static void task6 (){
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        byte weightBananaGramm=80;
        byte weightMilk100ml=105;
        byte weightIceCream=100;
        byte weightЕgg=70;
        int ProteinCoctailsGramm=weightBananaGramm*5+weightMilk100ml*2+weightIceCream*2+weightЕgg*4;
        float ProteinCoctailsKg=ProteinCoctailsGramm/1000F;
        System.out.println("Спортзавтрак весит "+ProteinCoctailsGramm+" грамм.");
        System.out.println("Спортзавтрак весит "+ProteinCoctailsKg+" кг.");
    }
    public static void task7 (){
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        short loseWeightGramm=7000;
        int Days250Gr=loseWeightGramm/250;
        int Days500Gr=loseWeightGramm/500;

        System.out.println("Если спортсмен будеть терять 250 гр. в день, то потребуется "+Days250Gr+" дней.");
        System.out.println("Если спортсмен будеть терять 500 гр. в день, то потребуется "+Days500Gr+" дней.");
    }
    public static void task8 (){
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        int salaryMaria=67760;
        int salaryDenis=83690;
        int salaryCristina=76230;
        int salaryMariaYearDo=salaryMaria*12;
        int salaryDenisYearDo=salaryDenis*12;
        int salaryCristinaYearDo=salaryCristina*12;
        float salaryMariaLater=salaryMaria*1.10F;
        float salaryDenisLater=salaryDenis*1.10F;
        float salaryCristinaLater=salaryCristina*1.10F;
        float salaryMariaYearDifference=salaryMariaLater*12-salaryMariaYearDo;
        float salaryDenisYearDifference=salaryDenisLater*12-salaryDenisYearDo;
        float salaryCristinaYearDifference=salaryCristinaLater*12-salaryCristinaYearDo;
        System.out.println("Маша теперь получает "+salaryMariaLater+" рублей. Годовой доход вырос на "+salaryMariaYearDifference+" рублей.");
        System.out.println("Денис теперь получает "+salaryDenisLater+" рублей. Годовой доход вырос на "+salaryDenisYearDifference+" рублей.");
        System.out.println("Кристина теперь получает "+salaryCristinaLater+" рублей. Годовой доход вырос на "+salaryCristinaYearDifference+" рублей.");
    }

}