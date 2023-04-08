package mylib;

import org.apache.commons.lang3.StringUtils;

public class Account {

    private String name;

    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};

    public void setName (String toSet){
        this.name = this.capitalize(toSet);
    }

    public static String capitalize (String toCapitalize){
        String[] tokens = StringUtils.split(toCapitalize);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        toCapitalize = StringUtils.join(tokens,' ');
        return toCapitalize;
    }

    public String getName (){
        return name;
    }

    public static String translit (String arg){
        arg = arg.toLowerCase();

        String translits = "";

        for(int i = 0; i < arg.length(); i++){
            char temp = arg.charAt(i);
            boolean isFound = false;
            for (int n = 0;n < ukrAlphabet.length(); n++){
                if (temp == ukrAlphabet.charAt(n)) {
                    translits = translits + translitRepl[n];
                    isFound = true;
                    break;
                }

            }
            if (isFound == false){
                translits = translits + arg.charAt(i);
                isFound = true;
            }

        }

        return translits;
    }

}
