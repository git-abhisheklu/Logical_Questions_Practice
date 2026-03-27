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
        int[] input = {2,2,0,4,0,8};
        String[] stringArr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String s1="IX"; String s2 = "MCMIV";
        List<Integer> listArr = Arrays.asList(-5, -2, 5, 2, 4, 7, 1, 8, 0, -8);
        ArrayList<Integer> newList = new ArrayList<>(listArr);
//        System.out.println(" Result of frequency count: " + Main.findElement(arrrr));
//        System.out.println(" Result of frequency count: " + Main.encode("ttlllsslhh"));
//        System.out.println(" Result of frequency count: " + Main.printString("Thisisdemostring", 'i',3 ));
//        System.out.println(" Result of frequency count: " + Main.kPangram("zuobxee atwqtkq nflgomyhu w woqrb pfqschzobqcf lupvimxuqe reeabtpsox sxep a f ceero db",6));
//        System.out.println(" Result: " + Main.ExtractNumber("zg 9 e 12 b 16 10 8 10 l 7"));
        System.out.println(" Result: " + Main.modifyAndRearrangeArr(input));
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

//    public static int findElement(int[] arr) {
//        // code here
//        int maxLeft = Integer.MIN_VALUE;
//        int minRight = Integer.MAX_VALUE;
//        int[] prefixArr = new int[arr.length];
//        int[] suffixArr = new int[arr.length];
//        for(int i=0; i< arr.length; i++){
//            maxLeft = Math.max(maxLeft,arr[i]);
//            prefixArr[i]=maxLeft;
//            minRight = Math.min(minRight, arr[arr.length-1-i]);
//            suffixArr[i] = minRight;
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>=prefixArr[i] && arr[i]<=suffixArr[i]){
//                return arr[i];
//            }
//        }
//        return -1;
//    }
//    public static String encode(String s) {
//        // code here
//        StringBuilder sb = new StringBuilder();
//        int count =1;
//        char prev = s.charAt(0);
//        for(int i=1; i<s.length(); i++){
//            char next = s.charAt(i);
//            if(prev!=next){
//                sb.append(prev);
//                sb.append(count);
//                prev=next;
//                count=1;
//            }else{
//                count++;
//                prev = next;
//            }
//        }
//        sb.append(s.charAt(s.length() - 1));
//        sb.append(count);
//        return sb.toString();
//    }

//    public static String printString(String s, char ch, int count) {
//        // code here
//        String result = "";
//        int charCount = 0;
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)==ch){
//                charCount++;
//            }
//            if(charCount==count){
//                result = s.substring(i+1);
//                return result;
//            }
//        }
//        return result;
//    }

//Given a string str and an integer k, return true if the string can be changed into a pangram after at most k operations, else return false.
//A single operation consists of swapping an existing alphabetic character with any other lowercase alphabetic character.
//Note - A pangram is a sentence containing every letter in the english alphabet.
//    public static boolean kPangram(String str, int k) {
        // code here
//        boolean[] seen = new boolean[26];
//        int uniqueCount = 0;
//        int totalChars = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//
//            if (c >= 'a' && c <= 'z') {
//                totalChars++;
//
//                if (!seen[c - 'a']) {
//                    seen[c - 'a'] = true;
//                    uniqueCount++;
//                }
//            }
//        }
//        if (totalChars < 26) {
//            return false;
//        }
//        int missing = 26 - uniqueCount;
//
//        return k >= missing;
//
//    }

//Given a sentence containing several words and numbers. Find the largest number among them which does not contain 9. If no such number exists, return -1.
//Note: Numbers and words are separated by spaces only. It is guaranteed that there are no leading zeroes in the answer.
//    public static long ExtractNumber(String sentence) {
//        // code here
//        long max = -1;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < sentence.length(); i++) {
//            char c = sentence.charAt(i);
//            if (Character.isDigit(c)) {
//                sb.append(c);
//            } else {
//                if (sb.length() > 0) {
//                    String numStr = sb.toString();
//                    if (!numStr.contains("9")) {
//                        long num = Long.parseLong(numStr);
//                        max = Math.max(max, num);
//                    }
//                    sb.setLength(0);
//                }
//            }
//        }
//        if (sb.length() > 0) {
//            String numStr = sb.toString();
//            if (!numStr.contains("9")) {
//                long num = Long.parseLong(numStr);
//                max = Math.max(max, num);
//            }
//        }
//        return max;
//    }

//    Given an array arr. Return the modified array in such a way that if the current and next numbers are valid numbers and are equal then double the
//    current number value and replace the next number with 0. After the modification, rearrange the array such that all 0's are shifted to the end.
//Note:
//    Assume ‘0’ as the invalid number and all others as a valid number.
//    The sequence of the valid numbers is present in the same order.
    public static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        ArrayList<Integer> nonZerosList = new ArrayList<>();
        ArrayList<Integer> zerosList = new ArrayList<>();
        int crr= arr[0];
        int nxt = 0;
        for(int i=1; i<arr.length; i++){
            nxt = arr[i];
            if(crr!=0 && crr==nxt){
                crr=crr*2;
                nonZerosList.add(crr);
                nxt=0;
                crr=nxt;
            }else if(crr!=0 && crr!=nxt){
                nonZerosList.add(crr);
                crr=nxt;
            }else{
                zerosList.add(crr);
                crr=nxt;
            }

        }
        if(nxt!=0){
            nonZerosList.add(nxt);
        }
        int s = zerosList.size();
        int k=0;
        while(s>0){
            nonZerosList.add(zerosList.get(k));
            k++;
            s--;
        }
        return nonZerosList;
    }
}