import java.util.Date;
import java.util.Random;
public class NumberGenerator {
    public int[] getNumbers(int length) {
        int[] result = new int[length];
        int[] storage = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Random r = new Random();
        Date d = new Date();

        // 덱 섞기
        for (int i = 0; i < storage.length; i++) {
            int temp = storage[i];
            int target = r.nextInt(storage.length);
            storage[i] = storage[target];
            storage[target] = temp;
        }

        // 덱에서 첫 length value - 1 번째까지 결과에 넣기 ex) length = 3, index = 2.
        for (int j = 0; j < length; j++) {
            result[j] = storage[j];
        }

        // 결과 반환
        return result;
    }

}

// 숙제
// 디자인 + 로직 ((명세 2개 이상 나올 수 있음))
// 로직 -> 디자인 하고 안에 작성하면 댐

// 15일: 중간점검 (반 이상) 반이상?? 1개 클래스는 다 완성시켜놓기, 남은 2개는 디자인 까지 (더 하면 하지ㅇㅇ)
// 디자인 셋 다 먼저 디자인 부터ㅇㅇㅇㅇ
// referee -> printer -> receiver
// 18일: 추후