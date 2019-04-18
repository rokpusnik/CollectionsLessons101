package com.conology;

import java.util.HashMap;
import java.util.Map;

public class LanguageMap {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object oriented, high level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        if (languages.containsKey("Java")) {
            System.out.println("already have Java in there!");
        } else {
            languages.put("Java", "this course is about Java");
        }
        languages.remove("Lisp");
        if(languages.remove("Algol", "a family of algorithmic languages")) {
            System.out.println("algol removed");
        } else {
            System.out.println("algol not removed, key/value pair not found");
        }
        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}