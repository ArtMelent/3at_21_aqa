package day_2;

import static com.sun.tools.classfile.Module_attribute.RequiresEntry.length;

public class StringCalculator {
    public static void main(String[] args) {
        //Task 2. Given a string, find the number of words in it.
        String s = "Task 2. Given a string, find the number of words in it.";

        System.out.println(s.split(regex: " ").length);


        //Task 3. Given a string, show number of chars in each word
        for(String w:s.split(regex: " ")){
            System.out.println(w.length);
        }
        //Task 4. Create function which takes 2 parameters:
        //1st(String) – text; 2nd (int) - index of word. Function should return number of chars in word by its index in text

        System.out.println(stringCalculator(s, i: 5));
    }

        static int stringCalculator(String s, int i){
        return s.split(regex: " ")[i].length();
    }
}
