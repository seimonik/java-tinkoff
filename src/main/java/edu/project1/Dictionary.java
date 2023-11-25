package edu.project1;

import org.jetbrains.annotations.NotNull;
import java.util.List;

public interface Dictionary {
    @NotNull String randomWord();

    void setDictionary(List<String> dict);


}
