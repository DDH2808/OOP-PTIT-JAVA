import java.util.Scanner;

class Number {
    int value;
    Number(int value ){
        this.value = value;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Number numberA = new Number(5);
        Number numberB = new Number(7);
        if(numberA.value > numberB.value){
            System.out.println(numberA.value);
        }else {
            System.out.println(numberB.value);
        }
    }
}
