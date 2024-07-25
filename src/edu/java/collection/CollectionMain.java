package edu.java.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","C","B","E","a","d","f");
        Collections.sort(list);
        System.out.println(list);

        Comparator<String> ascComp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        };
        Collections.sort(list,ascComp);
        System.out.println(list);

        Collections.sort(list, (o1,o2)-> o1.compareToIgnoreCase(o2));
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        Collections.sort(list, Collections.reverseOrder((o1, o2) ->o1.compareToIgnoreCase(o2)));



    }
}
