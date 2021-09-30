package Collection;

import java.util.*;

/**
 * @class: Arraylist, Hashset, HaspMap, Stack, vector, priorityQueue, linkList
 * @interface: List, set, Map, Queue
 * @algo: add, remove, update, sort, shuffle
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = list();
        HashSet<Integer> hashSet = hashSet();
        Map<String ,Integer> map = map();
    }

    /**
     * @return list
     */
    public static List<Integer> list() {
        List<Integer> ara = new ArrayList<>();
        ara.add(10);
        ara.add(20);
        ara.add(43);
        ara.add(1);
        return ara;
    }

    /**
     * @return set
     */
    public static HashSet<Integer> hashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(34);
        hashSet.add(50);
        hashSet.add(34);
        hashSet.add(34);
        return hashSet;
    }

    /**
     *
     * @return map
     */
    public static Map<String,Integer> map() {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("mdshohed",10);
        mp.put("kamal",1);
        mp.put("sakib",54);
        return mp;
    }
}
