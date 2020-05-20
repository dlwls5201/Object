package object.chapter12;

import org.junit.Test;

public class 강제다형성 {

    //강제 다형성
    @Test
    public void coercionPolymorphism() {
        int temp1 = 1 + 1; //이항 연산자
        System.out.println("temp1 : " + temp1);

        String temp2 = "1" + 1; //연결 연산자
        System.out.println("temp2 : " + temp2);

        String temp3 = 1 + 1 + "1"; //연결 연산자
        System.out.println("temp3 : " + temp3);

        String temp4 = 1 + "1" + 1; //연결 연산자
        System.out.println("temp4 : " + temp4);
    }
}
