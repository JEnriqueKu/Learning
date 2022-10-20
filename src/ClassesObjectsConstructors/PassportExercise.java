package ClassesObjectsConstructors;

import java.time.LocalDate;

class Passport{
    String number;
    LocalDate expiryDate;

    Passport(String number, LocalDate expiryDate){
        this.number = number;
        this.expiryDate = expiryDate;
    }
}

public class PassportExercise {
    public static void main(String[] args) {

        Passport mexicoPassport = new Passport("10003137",LocalDate.of(2024,10,20));
        Passport ukPassport = new Passport("23072457",LocalDate.of(2025,10,20));
        System.out.println(mexicoPassport.expiryDate);
    }
}
