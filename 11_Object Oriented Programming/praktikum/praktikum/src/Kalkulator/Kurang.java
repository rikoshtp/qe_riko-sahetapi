package Kalkulator;

public class Kurang extends Kalkulator {
    int number1, number2;

    public Kurang(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public int kurang(){
        return number1-number2;
    }

}
