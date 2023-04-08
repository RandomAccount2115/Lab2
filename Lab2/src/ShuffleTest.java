import mylib.StringFun;

public class ShuffleTest {

    public static void main(String[] args) {

        String test = "Random Sentence";
        String test2 = "Another Longer Random Sentence";
        String test3 = "abc";

        System.out.println(StringFun.shuffle(test));

        System.out.println(StringFun.shuffle(test2));

        System.out.println(StringFun.shuffle(test3));

    }
}
