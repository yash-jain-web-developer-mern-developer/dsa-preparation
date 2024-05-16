package Tree.Binarysearchtree.selfbalancingtree;

import java.util.Map;
import java.util.TreeMap;

//hashmap provide limited functionalit
//it provide higherkey,lowerkey,floor key,ceiling key
//it impilment sorted map interface
public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(10, "geeks");
        t.put(15, "ide");
        t.put(5, "courses");
        System.out.println(t);
        System.out.println(t.containsKey(10));
        for (Map.Entry<Integer, String> e : t.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        t.remove(10);
        System.out.println(t.size());
        System.out.println(t.higherKey(10));
        System.out.println(t.lowerKey(10));
        System.out.println(t.floorKey(10));
        System.out.println(t.ceilingKey(10));
        System.out.println(t.higherEntry(10).getValue());
        System.out.println(t.lowerEntry(10).getValue());
        System.out.println(t.floorEntry(10).getValue());
        System.out.println(t.ceilingEntry(10).getValue());
    }
}
