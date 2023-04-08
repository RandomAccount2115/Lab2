import mylib.StringFun;

public class CamelizeTest {

    public static void main(String[] args) {

        String test = "Losowy          Tekst";
        String test2 = "   inny losowy   tekst    ";

        System.out.println(StringFun.camelize(test));

        System.out.println(StringFun.camelize(test2));

    }
}
