import mylib.StringFun;

public class DecamelizeTest {

    public static void main(String[] args) {

        String test = "randomDeamelizedText";
        String test2 = "    AnotherRandomDecamelizedText";

        System.out.println(StringFun.decamelize(test));

        System.out.println(StringFun.decamelize(test2));

    }
}
