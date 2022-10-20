package ClassesObjectsConstructors;

class Frank{
    int Month;
    int CalculateMonthToBirthday() {
        int MonthLeft = 12 - Month;
        return MonthLeft;
    }
    void giveName(String name){
        System.out.println(name);
    }
    void giveNumber(int number){
        System.out.println("This number " + number);
    }
    void giveNumberDecimal(int numero, double numerodecimal){
        System.out.println("It took" + numero + " minutes " + numerodecimal + " seconds to finish.");
    }
}

public class ClassesAndObjectsv2 {
    public static void main(String[] args) {
        Frank name = new Frank();
        name.Month = 10;
        name.CalculateMonthToBirthday();
        int Months = name.CalculateMonthToBirthday();

        System.out.println("Months until birthday: " + Months);
        name.giveName("Frank");
        name.giveNumber(55);
        name.giveNumberDecimal(25, 35);
    }
}
