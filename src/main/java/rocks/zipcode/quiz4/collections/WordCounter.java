package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private Map<String,Integer> map=new HashMap<>();

    public WordCounter(String... strings) {

        for(String value : strings)
        {
            Integer num = map.get(value);
            if(num == null)
                map.put(value,1);
            else
                map.put(value,num+1);
        }

    }

    public Map<String, Integer> getWordCountMap() {



        return map;
    }
}
