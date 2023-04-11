package datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionView {

        public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(1, "NYC");
                map.put(2, "Colorado");
                map.put(3, "California");
                map.put(4, "Florida");
                map.put(5, "Hawaii");
                map.put(6, "Seattle");

                Set set = map.entrySet();//Converting to Set so that we can traverse
                Iterator itr = set.iterator();
                while (itr.hasNext()) {
                        //Converting to Map.Entry so that we can get key and value separately
                        Map.Entry entry = (Map.Entry) itr.next();
                        System.out.println(entry.getKey() + " " + entry.getValue());


                }

        }
}