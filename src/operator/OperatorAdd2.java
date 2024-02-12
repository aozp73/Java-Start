package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {

        // 1. 전위 증감 연산자
        int a = 1;
        int b = 0;
        b = ++a; // a의 값 먼저 증가, 그 결과 b에 대입
        System.out.println("a = " + a + ", b = " + b); // a = 2, b = 2


        // 2. 후위 증감 연산자
        a = 1; // a 값 1 지정
        b = 0; // b 값 0 지정

        b = a++; // a의 현재 값 b에 먼저 대입, 그 후 a 값을 증가
        System.out.println("a = " + a + ", b = " + b); // a = 2, b = 1
    }
}
