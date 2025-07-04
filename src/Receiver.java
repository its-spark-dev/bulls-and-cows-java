import java.util.Scanner;

public class Receiver {

    Scanner read = new Scanner(System.in);

    // 게임을 3자리로 할 지 4자리로 할 지 입력받기
    public int askLength() {
        boolean flag = true;
        while (flag) {
            System.out.print("Enter length: ");
            int length = read.nextInt();
            if (length == 3 || length == 4) {
                return length;
            } else {
                System.out.println("Invalid length");
                flag = false;
            }
        }
        return 0;
    }

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
                        .codePoints()                   // Generate a stream of code point `int` numbers for the characters in this string.
                        .filter(Character::isDigit)     // Ignore any non-digit.
                        .mapToObj(Character::toString)  // Convert each `int` code point to its character. We expect that character to be a digit.
                        .mapToInt(Integer::parseInt)    // Parse the textual digit as an `int` primitive value.
                        .toArray();
        return numbers;
    }
}
