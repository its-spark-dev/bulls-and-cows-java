import java.util.Scanner;
public class Receiver {

    // 1. 사용자에게 3자리, 혹은 4자리 숫자를 물어보기
    // 2. 입력 받은 값을 변수에 저장하기
    // 3. 결과에 따라 계속 입력을 받아야하는 경우라면, 동일한 변수에 값을 업데이트 하기

    Scanner read = new Scanner(System.in);


    // String 으로 입력을 받고, int[] 로 변환하기
    public int[] userNumberInput () {

        System.out.println("Guess the number: ");
        String input = read.nextLine();

        int digitNumber = Integer.parseInt(input);

        try {
            digitNumber = Integer.parseInt(input);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input. Please try again.");
        }

        return digitNumber;
    } // 이렇게 하면 089 입력시 논리 X


    public int userLength (int input, int length) {
        int count = 0;
        while (count == length) {
            int lastDigit = input % 10;
            if (lastDigit != 0) {
                count++;
            }
        }
    }



    public int[] userNumber2 (int length) {

        int[] userNumber = new int[length];

        // user input
        // if input.length == length
        // accept
        // else
        // ask again (while it's true)


        boolean flag = false;
        while (!flag) {




            if (length is correct) {
                // put int into [] << the hardest part
                flag = true;
            } else {
                System.out.println("length should be " + length); // formalize
                System.out.println("What number?");
            }
        }

        return input;
    }

}
