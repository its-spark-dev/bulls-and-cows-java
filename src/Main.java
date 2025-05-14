import java.util.Arrays;

public class Main {

    //public NumberGenerator g; // Main Class 가 인스턴스화 될 때, NumberGenerator 타입을 가진 g 라는 이름의 property 가 public 접근 지정자로 declare

    public static void main(String[] args) {
        //NumberGenerator g; // NumberGenerator type 인 g 이름을 가진 variable declare
        //int a; // integer type 인 a 이름을 가진 variable declare
        //int b = 3; // integer type 인 b 이름을 가진 variable 에 3인 ㄹ;터럴 값을 copy 연산

        //NumberGenerator c = new NumberGenerator(); // NumberGenerator type 인 c 이름을 가진 variant를 선언 해주고 NumberGenerator 인스턴스화 해주고
        // 인스턴스 주소를 c 에 카피연산

        NumberGenerator g = new NumberGenerator();
        int[] test = g.getNumbers(4);


        System.out.println(Arrays.toString(test));
    }
}

/*
 * 1. 랜덤 숫자 생성하기 (3자리)
 * 2. 사용자 숫자 입력 받기 (integer check, digit check, if not -> error message -> retry)
 * 3. 입력받은 숫자랑 랜덤 숫자랑 비교하기 (S/B/O) -> retry
 * 4. 결과 출력 (끝) (if 랜덤 숫자 == 사용자 숫자 than print "done")
 */