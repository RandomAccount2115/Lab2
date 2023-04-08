import java.util.Random;

public class StrongPasswordGenerator {

    private int length = 8;
    private boolean maleLitery = true;
    private boolean wielkieLitery = true;
    private boolean cyfry = true;
    private boolean znakiSpecialne = true;

    private char[] smallLetters = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    private char[] bigLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private char[] specialCharacters = ".?,<>;:'-_=+)(*&^%$#@!~`".toCharArray();

    private char[] digits = "0123456789".toCharArray();

    StrongPasswordGenerator(){

    }

    StrongPasswordGenerator(boolean znakiSpecialne){

        this.znakiSpecialne = znakiSpecialne;

    }

    StrongPasswordGenerator(boolean znakiSpecialne, boolean wielkieLitery){

        this.znakiSpecialne = znakiSpecialne;
        this.wielkieLitery = wielkieLitery;

    }

    StrongPasswordGenerator(boolean znakiSpecialne, boolean wielkieLitery, boolean maleLitery){

        this.znakiSpecialne = znakiSpecialne;
        this.wielkieLitery = wielkieLitery;
        this.maleLitery = maleLitery;

    }

    StrongPasswordGenerator(boolean znakiSpecialne, boolean wielkieLitery, boolean maleLitery, boolean cyfry){

        this.znakiSpecialne = znakiSpecialne;
        this.wielkieLitery = wielkieLitery;
        this.maleLitery = maleLitery;
        this.cyfry = cyfry;

    }


    public void setLength(int toSet){
        length = toSet;
    }

    public int getLength(){
        return length;
    }

    public void setMaleLitery(boolean toSet){
        maleLitery = toSet;
    }

    public boolean getMaleLitery(){
        return maleLitery;
    }

    public void setWielkieLitery(boolean toSet){
        wielkieLitery = toSet;
    }

    public boolean getWielkieLitery(){
        return wielkieLitery;
    }

    public void setCyfry(boolean toSet){
        cyfry = toSet;
    }

    public boolean getCyfry(){
        return cyfry;
    }

    public void setZnakiSpecialne(boolean toSet){
        znakiSpecialne = toSet;
    }

    public boolean getZnakiSpecjalne(){
        return znakiSpecialne;
    }


    public String generate(){

        if (maleLitery == false && wielkieLitery == false && znakiSpecialne == false && cyfry == false){
            return "Pula znaków dostępnych do wygenerowania hasła jest pusta. Proszę wybrać przynajmniej jeden rodzaj znaków.";
        }

        String password = "";

        Random random = new Random();

        int temp;

        while (password.length() < length){

            temp = random.nextInt(4);

            switch(temp){
                case 0:
                    if (maleLitery == false){
                        break;
                    }
                    password += smallLetters[random.nextInt(smallLetters.length)];
                    break;
                case 1:
                    if (wielkieLitery == false){
                        break;
                    }
                    password += bigLetters[random.nextInt(bigLetters.length)];
                    break;
                case 2:
                    if (znakiSpecialne == false){
                        break;
                    }
                    password += specialCharacters[random.nextInt(specialCharacters.length)];
                    break;
                case 3:
                    if (cyfry == false){
                        break;
                    }
                    password += digits[random.nextInt(digits.length)];
                    break;
            }
        }

        return password;

    }
}
