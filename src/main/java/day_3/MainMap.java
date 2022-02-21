package day_3;

import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;


public class MainMap {
    public static void main(String[] args) {
        //3) Given: String with big text (more than 1000 words).
        // Write a method that calculates the numbers of words for each letter that starts the word.
        String text = "3) Given: String with big text (more than 1000 words)." +
                " Write a method that calculates the numbers of words for each letter that starts the word.\n";
        Map<Character,Integer> res = new HashMap<>();
        for (String w:text.split( regex: " ")){
            res.putIfAbsent(w.charAt(0),0);
            res.put(w.charAt(0), res.get(w.charAt(0))+1);
        }
        System.out.println(new TreeMap<>res);
    }
}
