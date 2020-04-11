/**
 * Map of different words with sorted keys and values (Exercise 26)
 * Author Wojtek Turek
 */

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class MapDiffWords {

    public static void main(String[] args) throws Exception {

        Scanner textFile = new Scanner(new File(String.valueOf("src/words.txt")));

        var wordsMap = new HashMap<String, Integer>();

        while (textFile.hasNext()) {
            String key = textFile.next()
                    .toLowerCase()
                    .replaceAll("[.,\\s]", "");
            for (String word : key.split(" ")){
                 wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);

            }
        }

        Map<String, Integer> sorted = wordsMap
                .entrySet()
                .stream()
                .sorted(comparingByKey())
                .sorted(comparingByValue())
                .collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println(sorted.toString()
                .replace("{", "[")
                .replace("}", "]"));
    }

}
