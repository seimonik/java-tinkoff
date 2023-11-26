package edu.project1;

import java.util.List;
import java.util.Random;

public class InMemoryDictionary implements Dictionary {
    private List<String> dictionary = List.of("piglet", "weather", "nicely", "hello", "irony", "only");

    public String randomWord() {
        Random rnd = new Random();
        return dictionary.get(rnd.nextInt(dictionary.size()));
    }

    public List<String> getDictionary(){
        return dictionary;
    }

    public void setDictionary(List<String> dict){
        this.dictionary = dict;
    }
}
