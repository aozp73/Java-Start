package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//         intValue = doubleValue; // 컴파일 오류 발생 (큰 범위 -> 작은 범위: 자동 형변환 x)
        intValue = (int) doubleValue; // 명시적 형변환
        System.out.println(intValue); // 1
    }
}
