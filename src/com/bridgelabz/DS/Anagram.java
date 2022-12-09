package com.bridgelabz.DS;
import java.util.*;

public class Anagram {

        public boolean anagram(String s1, String s2)
        {
            if(s1.length() != s2.length())
                return false;

            Hashtable<String, Integer> h1 = new Hashtable<>();
            Hashtable<String, Integer> h2 = new Hashtable<>();

            for(int i=0;i<s1.length();i++)
            {
                if(h1.containsKey(""+s1.charAt(i)))
                    h1.put(""+s1.charAt(i), h1.get(""+s1.charAt(i))+1);
                else
                    h1.put(""+s1.charAt(i), 1);
            }
            for(int i=0;i<s2.length();i++)
            {
                if(h2.containsKey(s2.charAt(i)))
                    h2.put(""+s2.charAt(i), h2.get(""+s2.charAt(i))+1);
                else
                    h2.put(""+s2.charAt(i), 1);
            }


            return h1.equals(h2);

        }

        public static void main(String[] args) {

            String s1 = "earth";
            String s2 = "heart";

            Anagram an = new Anagram();
            if(an.anagram(s1, s2))
            {
                System.out.println( s1+" and  "+s2+" are anagram!");
            }
            else
            {
                System.out.println(s1+" and "+s2+" are not anagram!");
            }
        }

    }

