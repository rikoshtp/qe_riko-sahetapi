package Kalkulator;

public class Bagi extends Kalkulator{
    int number1, number2;

    public Bagi(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public int bagi(){
        return number1/number2;
    }
}
