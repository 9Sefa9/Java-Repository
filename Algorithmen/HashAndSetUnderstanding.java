import java.util.*;

//IMPORTANT!!! :

/*
    Use HashMap when performance is critical and ordering of keys doesn’t matter.
    Use LinkedHashMap if insertion order of the keys should be preserved.
    Use TreeMap when keys needs to be ordered using their natural ordering, or by a Comparator.
    Use TreeSet When you need a structure which is operated read/write frequently and also should keep order
    Use HashSet When you  
    */

public class HashAndSetUnderstanding {

    public static void main(String[] args) {
        hashMap();
        hashTable();
        linkedHashMap();
        treeMap();
        treeSet();
        hashSet();
    }

    public static void hashMap() {
        // Hashmap
        // - not threadsafe and unsynchronized
        // - it is very fast
        // - works with single Thread
        // - allows one null key
        // - insertion order is not fix, it may change
        // - A HashMap is implemented as Hash table
        // O(1) time performance for the basic operations such as get, put, containsKey,
        // remove, etc.
        // - HashMap is faster than HashSet because unique key is used to access object

        Map<String, Integer> personMap = new HashMap<String, Integer>();
        personMap.put("Oliver", 13578);
        personMap.put("James", 38590);
        personMap.put("John", 002315);

        // How to retrieve - keys
        System.out.println("HASHMAP - KEYS:\n");
        Set<String> keySet = personMap.keySet();
        for (String str : keySet) {
            System.out.println(str);
        }
        System.out.println();

        // How to retrieve - values
        System.out.println("HASHMAP - VALUES:\n");
        for (Integer val : personMap.values()) {
            System.out.println(val);
        }
        System.out.println();

        // How to retrieve - both keys and values
        System.out.println("HASHMAP - KEYS AND VALUES:\n");
        for (Map.Entry<String, Integer> pair : personMap.entrySet()) {
            System.out.println(String.format("Key is: %s, Value is : %s", pair.getKey(), pair.getValue()));
        }
        System.out.println("\n%%%%%%%%%%%%%%%%%%%%%% HASHMAP DONE %%%%%%%%%%%%%%%%%%%%%%\n\n");
    }

    public static void hashTable() {
        // HashTable
        // - it is threadsafe and synchronized
        // - it is very slow
        // - works with multiple Threads
        // - allows no null keys
        // - insertion order is not fix, it may change

        Hashtable<String, String> carTable = new Hashtable<String, String>();
        carTable.put("Mercedes", "SL-Class");
        carTable.put("Audi", "R8");
        carTable.put("Opel", "Corsa");
        carTable.put("Audi", "R8");

        // How to retrieve - keys
        System.out.println("HASHTABLE - KEYS:\n");
        Set<String> keySet = carTable.keySet();
        for (String str : keySet) {
            System.out.println(str);
        }
        System.out.println();

        // How to retrieve - values
        System.out.println("HASHTABLE - VALUES:\n");
        for (String val : carTable.values()) {
            System.out.println(val);
        }
        System.out.println();

        // How to retrieve - both keys and values
        System.out.println("HASHTABLE - KEYS AND VALUES:\n");
        for (Map.Entry<String, String> pair : carTable.entrySet()) {
            System.out.println(String.format("Key is: %s, Value is : %s", pair.getKey(), pair.getValue()));
        }

        System.out.println("\n%%%%%%%%%%%%%%%%%%%%%% HASHTABLE DONE %%%%%%%%%%%%%%%%%%%%%%\n\n");
    }

    public static void linkedHashMap() {
        // LinkedHashMap
        // - Aquivalent to HashMap but the order here is fixed and it is implemented as
        // doubly-linked list of Buckets
        // - O(1) time performance for the basic operations such as get, put,
        // containsKey, remove, etc.
        Map<String, Boolean> aboveEighteenMap = new LinkedHashMap<String, Boolean>();
        aboveEighteenMap.put("Kevin", true);
        aboveEighteenMap.put("Alisha", false);
        aboveEighteenMap.put("Barbara", true);

        // How to retrieve - keys
        System.out.println("LINKEDHASHMAP - KEYS:\n");
        Set<String> keySet = aboveEighteenMap.keySet();
        for (String str : keySet) {
            System.out.println(str);
        }
        System.out.println();

        // How to retrieve - values
        System.out.println("LINKEDHASHMAP - VALUES:\n");
        for (Boolean val : aboveEighteenMap.values()) {
            System.out.println(val);
        }
        System.out.println();

        // How to retrieve - both keys and values
        System.out.println("LINKEDHASHMAP - KEYS AND VALUES:\n");
        for (Map.Entry<String, Boolean> pair : aboveEighteenMap.entrySet()) {
            System.out.println(String.format("Key is: %s, Value is : %s", pair.getKey(), pair.getValue()));
        }

        System.out.println("\n%%%%%%%%%%%%%%%%%%%%%% LINKEDHASHMAP DONE %%%%%%%%%%%%%%%%%%%%%%\n\n");
    }

    public static void treeMap() {
        // TreeMap
        // - unlike a hash map and linked hash it map, does not employ the
        // hashingprinciple anywhere since it does not use an array to store its
        // entries.
        // - sorts all its entries according to their natural ordering if the ordering
        // wasn't set-up by the user in the TreeMap Constructor like this:
        // static <T,U> Comparator<T> comparing ( Function<? super T,? extends U>
        // keyExtractor, Comparator<? super U> keyComparator )
        // - TreeMap is implemented as Red-Black Tree

        TreeMap<Integer, String> digitMap = new TreeMap<Integer, String>(Comparator.naturalOrder());
        digitMap.put(2, "two");
        digitMap.put(8, "eight");
        digitMap.put(5, "five");
        digitMap.put(3, "three");

        // How to retrieve - keys
        System.out.println("TREEMAP - KEYS:\n");
        Set<Integer> keySet = digitMap.keySet();
        for (Integer str : keySet) {
            System.out.println(str);
        }
        System.out.println();

        // How to retrieve - values
        System.out.println("TREEMAP - VALUES:\n");
        for (String val : digitMap.values()) {
            System.out.println(val);
        }
        System.out.println();

        // How to retrieve - both keys and values
        System.out.println("TREEMAP - KEYS AND VALUES:\n");
        for (Map.Entry<Integer, String> pair : digitMap.entrySet()) {
            System.out.println(String.format("Key is: %s, Value is : %s", pair.getKey(), pair.getValue()));
        }

        System.out.println("\n%%%%%%%%%%%%%%%%%%%%%% TREEMAP DONE %%%%%%%%%%%%%%%%%%%%%%\n\n");
    }

    public static void treeSet() {
        // TreeSet
        // - TreeSet does not preserve the insertion order of elements but elements are
        // sorted by keys.
        // - implements NavigableSet => thus, first, last, tail and so on are fully
        // available and are very fast algorithms. No full search requiered here.
        // - a self-balancing binary search tree like a Red-Black Tree.
        // - add,remove,search takes O(log(N)) time. Printing N elements in the sorted
        // order takes O(N) time.
        // - TreeSet is not synchronized. It should be "wrapped" using the
        // Collections.synchronizedSortedSet method.

        TreeSet<String> authors = new TreeSet<String>();
        authors.add("Andreas Gryphius");
        authors.add("Fjodor Michailowitsch Dostojewski");
        authors.add("Alexander Puschkin");
        authors.add("Ruslana Lyzhichko");
        authors.add("Wladimir Klitschko");
        authors.add("Andrij Schewtschenko");
        authors.add("Wayne Gretzky");
        authors.add("Johann Jakob Christoffel");
        authors.add("Milla Jovovich");

        System.out.println("Authors first:" + authors.first());
        System.out.println("Authors last:" + authors.last());
        // find all the names which start with Milla and end with Wladimir.
        // it finds first and last elements and returns a new Collection with all the
        // elements in the range. Dont forget: it is ordered naturally, so here in
        // lexicographical order
        System.out.println("Authors Subset: " + authors.subSet("Milla", "Wladimir"));
        System.out.println("Authors: " + authors);
        System.out.println("\n%%%%%%%%%%%%%%%%%%%%%% TREESET DONE %%%%%%%%%%%%%%%%%%%%%%\n\n");
    }

    public static void hashSet() {
        // HashSet
        // - has everything what a Set should have
        // - objects which are going to be stored in HashSet must override equals() and
        // hashCode() method so that we can check for equality and no duplicate value is
        // stored in our set.
        // - HashMap is faster than HashSet because HashMap uses unique key to access
        // object
        // -
        Set<String> chocolateSet = new HashSet<>();
        chocolateSet.add("test");
        chocolateSet.add("test");
        System.out.println(chocolateSet);
    }
}