import java.util.Scanner;

public class Receiver {

    // 1. 사용자에게 3자리, 혹은 4자리 숫자를 물어보기
    // 2. 입력 받은 값을 변수에 저장하기
    // 3. 결과에 따라 계속 입력을 받아야하는 경우라면, 동일한 변수에 값을 업데이트 하기
    // 레프리에서 처리 할 것

    Scanner read = new Scanner(System.in);

    // 가장 기본적인 입력 받기
    public String askNumber() {
        System.out.println("Please enter a number: ");
        return read.nextLine();
    }


    // 길이 체크가 완료된 후 문자열을 int[]로 변환
    // functional programming applied
    public int[] convert(String input) {
        int[] numbers =
                input
                        .codePoints()                        // Generate a stream of code point `int` numbers for the characters in this string.
                        .filter(Character::isDigit)     // Ignore any non-digit.
                        .mapToObj(Character::toString)  // Convert each `int` code point to its character. We expect that character to be a digit.
                        .mapToInt(Integer::parseInt)    // Parse the textual digit as an `int` primitive value.
                        .toArray();
        return numbers;
    }
}
