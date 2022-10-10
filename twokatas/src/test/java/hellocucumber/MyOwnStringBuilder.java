package hellocucumber;

public class MyOwnStringBuilder {
        static String reverseString(String input){
            if(input == "") return "no input";
            String reversedString="";
            char ch;

            for (int i=0; i< input.length(); i++)
            {
                ch= input.charAt(i);
                reversedString= ch+reversedString;
            }

            return reversedString;
        }


        static String capitalizeString(String input){
            if(input == "") return "no input";

            char[] chars = input.toLowerCase().toCharArray();
            for (int i = 0; i < chars.length; i++) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
            return String.valueOf(chars);
        }

        static String lowerCaseString(String input){
            if(input == "") return "no input";

            char[] chars = input.toLowerCase().toCharArray();
            for (int i = 0; i < chars.length; i++) {
                chars[i] = Character.toLowerCase(chars[i]);
            }
            return String.valueOf(chars);
        }
    }


