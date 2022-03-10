package Kalkulator;

public class Kali extends Kalkulator{
    int number1, number2;

    public Kali(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public int kali(){
        return number1*number2;
    }
}
