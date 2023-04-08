import mylib.Account;

public class Main {
    public static void main(String[] args) {
        Account klasaAccount = new Account();

        klasaAccount.setName("random name");
        System.out.println(klasaAccount.getName());

        System.out.println(Account.translit("випадкови текст"));
    }
}