package mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;
import java.util.Random;

public class StringFun {

    public static String anarchize(String source) {

        boolean isFirstCharUpprecase;

        if (Character.isUpperCase(source.charAt(0))) {
            isFirstCharUpprecase = true;
        } else {
            isFirstCharUpprecase = false;
        }

        boolean lastCharUppercase = isFirstCharUpprecase;

        String result = "";

        char temp;

        if (isFirstCharUpprecase == true) {
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 0) {
                    temp = Character.toLowerCase(source.charAt(i));
                    result = result + temp;
                } else {
                    temp = Character.toUpperCase(source.charAt(i));
                    result = result + temp;
                }

            }
        } else {
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 0) {
                    temp = Character.toUpperCase(source.charAt(i));
                    result = result + temp;
                } else {
                    temp = Character.toLowerCase(source.charAt(i));
                    result = result + temp;
                }
            }


        }
        return result;
    }

    public static String camelize (String source){

        String temp = "";
        String result = "";

        int counter = 0;

        source = StringUtils.normalizeSpace(source);

        String[] tempArray = StringUtils.split(source);

        for (int i = 0; i < tempArray.length; i++){

            temp = tempArray[i];

            if (counter < 1){
                temp = Character.toLowerCase(temp.charAt(0)) + temp.substring(1, temp.length());
            }
            else{
                temp = Character.toUpperCase(temp.charAt(0)) + temp.substring(1, temp.length());
            }

            result = result + temp;

            counter++;
        }

        return result;


    }

    public static String decamelize (String source){

        source = StringUtils.normalizeSpace(source);

        String result = "";

        boolean isFirstChar = true;

        char temp;

        for (int i = 0; i < source.length(); i++){

            if (isFirstChar == true){
                temp = source.charAt(i);
                temp = Character.toUpperCase(temp);
                result = result + temp;
                isFirstChar = false;
            }
            else {
                if (Character.isUpperCase(source.charAt(i))){
                    temp = Character.toLowerCase(source.charAt(i));
                    result = result + " " + temp;
                }
                else {
                    temp = source.charAt(i);
                    result = result + temp;
                }

            }


        }

        return result;
    }

    public static boolean isPalindrome(String source){

        source = StringUtils.normalizeSpace(source);

        source = source.toLowerCase(Locale.ROOT);

        boolean result = true;


        for (int i = 0; i <= source.length()/2; i++){
            if (source.charAt(i) != source.charAt(source.length()-  1 - i)){
                result = false;
                break;
            }
        }





        return result;

    }

    public static String shuffle(String source){

        String shuffled = "";

        Random random = new Random();

        int tempLength;

        while (source.length() > 0){

            tempLength = random.nextInt(source.length());
            shuffled += source.charAt(tempLength);

            source = source.substring(0, tempLength) + source.substring(tempLength + 1);

        }

        return shuffled;



    }
}
