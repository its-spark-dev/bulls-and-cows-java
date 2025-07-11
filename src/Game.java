import java.util.Arrays;

public class Game {
    private NumberGenerator generator;
    private Receiver receiver;
    private Referee referee;
    private Printer printer;

    public Game() {

    }

    public void init() {
        this.generator = new NumberGenerator();
        this.receiver = new Receiver();
        this.referee = new Referee();
        this.printer = new Printer();
    }

    public void play() {
        int length = receiver.askLength();
        int[] randomNumber = generator.getNumbers(length);
        System.out.println("* [DEBUG: ]" + Arrays.toString(randomNumber) + " *");

        int strike = 0;

        while (strike != length) {
            String input = receiver.askNumber();
            while (!referee.lengthVerify(input, length)) {
                System.out.println("Invalid input");
                input = receiver.askNumber();
            }
            int[] userNumber = receiver.convert(input);

            strike = referee.getStrikeCount(randomNumber, userNumber);
            int ball = referee.getBallCount(randomNumber, userNumber);
            int out = referee.getOutCount(randomNumber, userNumber);
            printer.result(strike, ball, out);
        }

        printer.displayWin();
    }
}
