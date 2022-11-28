public class Main {
    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie5();
    }
    public static void zadanie1 () {
        var dog = 8;
        var cat = 3.6;
        var peper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(peper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        peper = peper + 4;
        System.out.println(peper);
         var hotDog = dog - 3.5;
        System.out.println(hotDog);
        cat = cat - 1.6;
        System.out.println(cat);
        peper = peper - 7639;
        System.out.println(peper);
    }
public static void zadanie2(){
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend/ 7;
        System.out.println(friend);
    }
    public static void zadanie3(){
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void zadanie4() {
        var weightBoxerOne = 78.2;
        System.out.println("Вес боксера №1 " + weightBoxerOne);
        var weightBoxerTwo = 82.7;
        System.out.println("Вес боксера №2 " + weightBoxerTwo);
        var boxerWeight = weightBoxerOne + weightBoxerTwo;
        System.out.println("Общий вес боксеров = " + boxerWeight);
        var differensWeigtBoxer = weightBoxerOne - weightBoxerTwo;
        System.out.println("Разница между боксерами = " + differensWeigtBoxer);
        var differensWeigtBoxer2 = weightBoxerTwo - weightBoxerOne;
        System.out.println("Из большего меньшее = "+differensWeigtBoxer2);
        var differnsWeigtBoxer3 = weightBoxerTwo % weightBoxerOne;
        System.out.println("Функция деления на остаток = "+ differnsWeigtBoxer3);

    }
    public static void zadanie5(){
        var generalOpeningHours = 640;
        var workingHours = 8;
        var personCompany = generalOpeningHours / workingHours;
        System.out.println("Всего работников в компании - " + personCompany + " человек");
        var plusPersonCompany = personCompany + 94;
        var personHours = generalOpeningHours / plusPersonCompany;
        System.out.println("Если в компании работает " + plusPersonCompany + " человек, то всего " + personHours + " часов работы может быть поделено между сотрудниками.");
    }
}
