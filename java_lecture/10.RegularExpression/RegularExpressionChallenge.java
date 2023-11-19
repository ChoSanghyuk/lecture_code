package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String challenge1 = "I want a bike.";
        String challenge2 = "I wnat a ball.";
        System.out.println(challenge1.matches("^\\w\\s\\w{4}\\s\\w\\s\\w{4}.$"));
        System.out.println(challenge2.matches("^\\w\\s\\w{4}\\s\\w\\s\\w{4}.$"));

        // Challenge 3
        Pattern pattern = Pattern.compile("^\\w \\w{4} \\w \\w{4}.$");
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s", "_"));

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("\\w+"));

        // Challegne 6
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));

        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^\\w+\\.\\d+$"));

        // Challenge 8
        String challenge8 = "abcd.123uvqz.7tzik.999";
        Pattern pattern2 = Pattern.compile("(\\w+)(\\.)(\\d+)");
        Matcher matcher2 = pattern2.matcher(challenge8);

        while(matcher2.find()){
            System.out.println(matcher2.group(3));
        }

        // Challenge 9 , 10
        String challenge9 = "abcd.123\tuvqz.7\ttzik.999\n";
        Pattern pattern3 = Pattern.compile("(\\w+)(\\.)(\\d+)\\s");
        Matcher matcher3 = pattern3.matcher(challenge9);

        while(matcher3.find()){
            System.out.println("Start :" + matcher3.start(3) + " End : " + (matcher3.end(3)-1));
        }

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}}";
        Pattern pattern4 = Pattern.compile("[{](.+?)[}]");
        Matcher matcher4 = pattern4.matcher(challenge11);
        while(matcher4.find()){
            System.out.println(matcher4.group(1));
        }

        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));

        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}(-\\d{4})?$"));


    }
}
