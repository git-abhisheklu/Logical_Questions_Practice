package Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rakesh");
        map.put(12, "Akash");
        map.put(3,"Amit");
        map.put(18, "Kapil");
        map.put(14, "Kareena");
//        System.out.println(map);
//        System.out.println("Value associated with key-2: "+map.get(2));
//        map.remove(3);
//        System.out.println(map.entrySet());
//        map.put(3,"Rohit");
//        map.put(2,"Ankita");
//        System.out.println(map.entrySet());

//        We can loop or iterate over Map using 4 ways-
//        1. keySet() & foreach
//        for (Integer m:map.keySet()){
//            System.out.println("Entries of map using keySet(): " + m + ":" + map.get(m));
//        }

//        2. entrySet & foreach
//        for (Map.Entry<Integer, String> e : map.entrySet()){
//            System.out.println("Entries of map using entrySet(): " + e);
//        }

//        3. keySet() & iterator()
//        Iterator<Integer> iterator = map.keySet().iterator();
//        while(iterator.hasNext()){
//            Integer next = iterator.next();
//            System.out.println("Entries of map using keySet() & iterator: " + next + ":" + map.get(next));
//        }

//        4. entryset() & iterator()
//        Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();
//        while(iterator.hasNext()){
//            System.out.println("Entries of map using entrySet() & iterator: " +iterator.next());
//        }

//        How HashMap works internally?
//        *HashMap works on the principle of Hashing*
//        In hashMap, both put() & get() methods works same internally, the key is hashed using Object class hashcode() method, basically hashmap has a static hash()
//        method and it does like this hash(key.hashcode()), so hashcode method is called on the key to generate the hashcode, the generated hashcode is then passed
//        to the hash() method to generate it in best way.
//        The generated hashcode is then kept on a bucket index except index 0.

        //Note: HashMap internally uses array and that array is nothing but collection of buckets.

//        In HashMap, one bucket can store multiple entires by using linkedlist/RB Tree. When Hash collision occurs the bucket uses linked-list untill the nodes are 8.
//        If nodes/entries are greater than 8, it converts into RB Tree/ Self balancing Binary Search Tree.
//        Q. How hashmap determines that the linkedlist will be converted into RB Tree?
//        It has a final static variable 'TREEIFY_THRESHOLD', which has value 8 provided. There is another variable 'UNTREEIFY_THRESHOLD' that has value 6, and it
//        determines if nodes in linked list are less than 6 then it does not convert into RB Tree.

//        Most important Question
//        How to improve the performance of HashMap?
//        See, HashMap performance is totally depends upon the Hashing of keys, if hashing is done in the best way it will handle collision.

        System.out.println("The size of map is: "+map.size());
        System.out.println("Is map empty: "+ map.isEmpty());
        System.out.println("Sorting hashmap by keys and values: ");
        Iterator<Integer> iterator = map.keySet().iterator();
        System.out.println("Sorting the keys of HashMap: ");

        TreeMap<Integer, String> treeMap = new TreeMap<>(map);
        for (Map.Entry<Integer, String> list : treeMap.entrySet()) {
            System.out.println(list.getKey()+ "  & "+ list.getValue());
        }
//        System.out.println("Sorting the values of HashMap: ");
//        Main.getHashMapValue(map);
//        Iterator<Map.Entry<Integer, String>> iterator1 = treeMap.entrySet().iterator();

        // Q. How to convert HashMap into Set?
        // There are two ways-
        //1. Using HashSet constructor 2. Using stream API
        System.out.println("Converting the HashMap into Set: ");
        //1. Using HashSet constructor-
//        Set<Integer> setKey= new TreeSet<>(map.keySet());
//        Iterator iterator1= setKey.iterator();
//        while(iterator1.hasNext()){
//            System.out.println(iterator1.next());
//        }
//        Set<String> treeSet = new TreeSet<>(map.values());
//        Iterator<String> iterator2 = treeSet.iterator();
//        while(iterator2.hasNext()){
//            System.out.println(iterator2.next());
//        }

        //2. Using stream API-
//        Set<Integer> collect = map.keySet().stream().collect(Collectors.toSet());
//        Iterator<Integer> iterator3 = collect.iterator();
//        while(iterator3.hasNext()){
//            System.out.println(iterator3.next());
//        }
//        Set<String> collect1 = map.values().stream().collect(Collectors.toSet());
//        Iterator<String> iterator1 = collect1.iterator();
//        while(iterator1.hasNext()){
//            System.out.println(iterator1.next());
//        }

        List<Integer> arr=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        Main.swapKth(arr,3);
        ArrayList<Integer> list = new ArrayList<>();

        String s="geeks for geeks";

        int[] newArr={8,2,1,2,1,5,7,1};
//        System.out.println("Find two elements: "+Main.findTwoElement(newArr));
//        Main.returnUniqueElements(newArr);
//        int n=5, arr[ ] = {10, 11, 1, 2, 3};
//        System.out.println("First letter concat: " +Main.game_with_number(arr,n));
        int[] arrrr = {5,9,20,2,22,29,40};
        String[] stringArr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String s1="IX"; String s2 = "MCMIV";
        List<Integer> listArr = Arrays.asList(-5, -2, 5, 2, 4, 7, 1, 8, 0, -8);
        ArrayList<Integer> newList = new ArrayList<>(listArr);
        System.out.println(" Result of frequency count: " + Main.findElement(arrrr));
        int a[] ={-1, -2, 4, -6, 5, 7};
        int b[] = {6, 3, 4, 0};
//        Main.allPairs(8,a,b);
//        int aa=10;
//        Integer bb=10;
//        System.out.println(aa==bb);
    }
//    static HashMap<Integer,String> getHashMapValue(Map<Integer,String> map){
//        List<Map.Entry<Integer,String>> list=new LinkedList(map.entrySet());
//        Collections.sort(list, new Comparator() {
//            public int compare(Object o1, Object o2) {
//                return ((Comparable) ((Map.Entry) (o1)).getValue())
//                        .compareTo(((Map.Entry) (o2)).getValue());
//            }
//        });
//
//        return ;
//
//    }

    public static int findElement(int[] arr) {
        // code here
        int maxLeft = Integer.MIN_VALUE;
        int minRight = Integer.MAX_VALUE;
        int[] prefixArr = new int[arr.length];
        int[] suffixArr = new int[arr.length];
        for(int i=0; i< arr.length; i++){
            maxLeft = Math.max(maxLeft,arr[i]);
            prefixArr[i]=maxLeft;
            minRight = Math.min(minRight, arr[arr.length-1-i]);
            suffixArr[i] = minRight;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=prefixArr[i] && arr[i]<=suffixArr[i]){
                return arr[i];
            }
        }
        return -1;
    }
}