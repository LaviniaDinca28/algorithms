package com.lseg.homework12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingDigitsNonDigitCharacters {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("\\d\\d\\D\\d\\d\\D\\d\\d\\d\\d"); // Use \\ instead of using \

    }
}

class Regex_Test2 {

    public void checker(String Regex_Pattern){

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}
