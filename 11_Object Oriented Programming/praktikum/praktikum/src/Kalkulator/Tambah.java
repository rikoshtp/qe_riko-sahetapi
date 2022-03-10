package Kalkulator;

public class Tambah extends Kalkulator{
    int number1, number2;

    public Tambah (int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public int tambah(){
        return number1+number2;
    }

}
