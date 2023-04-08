import mylib.StringFun;

public class StrongPasswordGeneratorTest {

    public static void main(String[] args) {

        StrongPasswordGenerator spt = new StrongPasswordGenerator();

        spt.setLength(16);

        System.out.println(spt.generate());

        spt.setZnakiSpecialne(false);

        System.out.println(spt.generate());

        spt.setWielkieLitery(false);

        System.out.println(spt.generate());

        spt.setMaleLitery(false);

        System.out.println(spt.generate());

    }
}
