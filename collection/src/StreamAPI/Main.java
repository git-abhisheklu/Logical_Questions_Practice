package StreamAPI;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
//        List<String> stringList= Arrays.asList("Abhishek", "Rohit", "Rohan", "Kripa", "Sejal", "Sanam");
//        Iterator<String> iterator = stringList.iterator();
//        while(iterator.hasNext()){
//            String next = iterator.next();
//            System.out.println("Here is the iterated values: " + next);
//            System.out.println(next.compareTo("Rohit"));
//        }

//        1.) Determine the highest value present in a numeric list
        List<Integer> listOfInteger = Arrays.asList(12,34,2,34,65,23,76,112);
        System.out.println(listOfInteger);
//        Integer max = listOfInteger.stream().max(Integer::compareTo).orElseThrow();
//        System.out.println("Highest value is: " + max);

//        2.) Determine the lowest value present in a numeric list
//        Integer first = listOfInteger.stream().sorted().findFirst().orElseThrow();
//        System.out.println("Lowest value is: " + first);

//        3.) Compute how many times each element appears in a list
//        Map<Integer, Long> collect = listOfInteger.stream().collect(groupingBy(n -> n, counting()));
//        System.out.println(collect);

//        4.) Calculate the frequency of every character in a given string
//        List<String> listOfString = Arrays.asList("Hello", "Happy", "People", "Laptop", "Table");
//        Map<?,?> collect = listOfString.stream().flatMap(a -> a.chars().mapToObj(b -> (char) b)).collect(groupingBy(n -> n, counting()));
//        System.out.println(collect);
//      To get the no. of characters in a string of List of String.
//        Map<String, Map<Character, Long>> perStringCounts = listOfString.stream()
//                .collect(Collectors.toMap(
//                        str -> str,  // Key: the original string
//                        str -> str.chars()
//                                .mapToObj(c -> (char) c)
//                                .collect(groupingBy(c -> c, counting()))));
//        System.out.println(perStringCounts);
//
//      5). Separate and display even and odd numbers from a list.
//        List<Integer> list3=Arrays.asList(1,2,3,4,5,6);
//        Map<Boolean, List<Integer>> collect1 = list3.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
//        List<Integer> oddNums= collect1.get(false);
//        List<Integer> evenNums= collect1.get(true);
//        System.out.println("Dividing list into even & odd: " + "Odd: " + oddNums + ", Even: " + evenNums);
//
//      6). Join two different lists into a single stream result.
//        List<Integer> list1=Arrays.asList(1,2,3,4,5);
//        List<Integer> list2=Arrays.asList(6,7,8,9,10);
//        Stream<?> concat = Stream.concat(list1.stream(), list2.stream());
//        System.out.println("Concatenation of lists: " + concat.toList());

//      7). Divide a list into even-numbered and odd-numbered elements
//        List<Integer> listOfInteger= Arrays.asList(1,2,3,4,5,6,7);
//        List<Integer> listOfEvenNums = IntStream.range(0, listOfInteger.size()).filter(n -> n % 2 == 0).mapToObj(i->listOfInteger.get(i)).toList();
//        List<Integer> listOfOddNums = IntStream.range(0,listOfInteger.size()).filter(n->n%2!=0).mapToObj(i->listOfInteger.get(i)).toList();
//        System.out.println("List of Odd positions elements: " + listOfOddNums );
//        System.out.println("List of Even positions elements: " + listOfEvenNums);
//        System.out.println(iterator1.next());

//        8). Extract the word with maximum length from a sentence
//        String str = "A happy person is the one who never cares what others are saying.";
//        String string = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).orElse("NUll");
//        System.out.println("The string having max. length: " + "'"+string+"'");

//        9). Eliminate duplicate entries from a collection
//        List<Integer> listofInteger = Arrays.asList(1,2,3,3,4,5,5,6,7,8,8,9);
//        Set<Integer> collect = listofInteger.stream().collect(toSet());
//        List<Integer> list = listofInteger.stream().distinct().toList();
//        System.out.println(list);

//        10). Find elements that exist in both lists
//        List<Integer> lisOfInteger1 = Arrays.asList(1,2,5,87,34,56,44);
//        List<Integer> lisOfInteger2 = Arrays.asList(1,4,9,8,33,56,42);
//        List<Integer> list = lisOfInteger1.stream().filter(lisOfInteger2::contains).distinct().toList();
//        System.out.println(list);

//        11). Detect and display repeated values from a list.
//        List<Integer> list=Arrays.asList(1,2,3,4,4,5,6,6,7,7);
//        Set<Integer> set = new HashSet<>();
//        List<Integer> list1 = list.stream().filter(integer -> !set.add(integer)).toList();
//        System.out.println(list1);

//        12). Identify characters that occur more than once in a string
//        String str="Happy";
//        Set<Character> set=new HashSet<>();
//        List<Character> list = str.chars().mapToObj(i -> (char) i).filter(c -> !set.add(c)).collect(Collectors.toList());
//        System.out.println(list);

//        13). Find the first character that appears multiple times in a string
//        Set<Character> set = new HashSet<>();
//        String str="character";
//        Character c1 = str.chars().mapToObj(c -> (char) c).filter(c -> !set.add(c)).findFirst().orElseThrow();
//        System.out.println(c1);

//        14).Compute the aggregate sum of all numbers in a list
//        List<Integer> list = Arrays.asList(12,45,34,67,55,43,23);
//        Integer integer = list.stream().reduce((a, b) -> a + b).orElse(0);
//        System.out.println(integer);

//        15). Identify the second smallest and second largest values
//        List<Integer> list = Arrays.asList(23,43,56,55,33,12);
//        Integer secondSmallest = list.stream().sorted().skip(1).findFirst().orElseThrow();
//        System.out.println("The second smallest element is: "+ secondSmallest);
////        Integer integer = list.stream().sorted().skip(list.size() - 2).findFirst().orElseThrow();
//        Integer integer = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
//        System.out.println("The second smallest element is: " + integer);

//        16). Filter numbers whose first digit is 1
//        List<Integer> integerList = Arrays.asList(34,87,68,29,13,21,11,16,19,19);
//        List<Integer> collect = integerList.stream().map(String::valueOf).filter(n -> n.startsWith("1")).map(Integer::parseInt).collect(toList());
//        System.out.println(collect);

//        17). Calculate the sum of even numbers using reduction logic
//        List<Integer> integerList = Arrays.asList(34,87,68,29,13,21,11,16,19,19);
//        Integer integer = integerList.stream().filter(n -> n % 2 == 0).reduce((a, b) -> a + b).orElseThrow();
//        System.out.println(integer);

//        18). Validate whether a number is prime using Stream operations
//        Integer num=111;
//        IntStream.range(3,num);

//        19).Identify missing values within a sorted numeric sequence
//        List<Integer> integerList = Arrays.asList(1, 2, 4, 6, 7, 8);
//        List<Integer> list = IntStream.range(1, integerList.get(integerList.size()-1)).mapToObj(n -> n).filter(n -> !integerList.contains(n)).toList();
//        System.out.println(list);

//        20). Sort a list of strings while safely ignoring null entries
//        List<String> str = Arrays.asList(  null, "banana", "apple", null, "cherry", "date");
//        List<String> list = str.stream().filter(n-> n!=null).toList() ;
//        System.out.println(list);

//        Integer num1 = 10;
//        Integer num2;
//        num2 = num1;
//        System.out.println(num1);
//        num1 = 20;
//        System.out.println(num1);
//        System.out.println(num2);

//        int a =10;
//        System.out.println("a: "+a);
//        int b;
//        b=a;
//        a=20;
//        System.out.println("b: "+b);
//        System.out.println("a: "+a);

//        Test test1 = new Test(10);
//        Test test2 =
//                test2 = test1.clone();
//        System.out.println(test1);
//        test1.id = 20;
//        System.out.println(test1);
//        System.out.println(test2);
    }
}

class Test implements Cloneable {
    int id;

    Test() {

    }

    Test(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                '}';
    }

    @Override
    public Test clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Test) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

