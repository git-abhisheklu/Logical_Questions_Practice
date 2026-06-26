package StreamAPI;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) throws IOException {
//        List<String> stringList= Arrays.asList("Abhishek", "Rohit", "Rohan", "Kripa", "Sejal", "Sanam");
//        Iterator<String> iterator = stringList.iterator();
//        while(iterator.hasNext()){
//            String next = iterator.next();
//            System.out.println("Here is the iterated values: " + next);
//            System.out.println(next.compareTo("Rohit"));
//        }

//        1.) Determine the highest value present in a numeric list
//        List<Integer> listOfInteger = Arrays.asList(12, 34, 2, 34, 65, 23, 76, 112);
//        System.out.println(listOfInteger);
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

//        ***** Some Tricky Questions *****

//   (1)  Integer num1 = 10;
//        Integer num2;
//        num2 = num1;
//        System.out.println("num1 :"+num1);
//        num1 = 20;
//        System.out.println("num1 :"+num1);
//        System.out.println("num2 :"+num2);

//   (2)  int a =10;
//        System.out.println("a: "+a);
//        int b;
//        b=a;
//        a=20;
//        System.out.println("a: "+a);
//        System.out.println("b: "+b);

//   (3)  Integer i1 = 100;
//        Integer i2= 100;
//        int i3=100;
//        int i4=100;
//        System.out.println("i1+i2: " + (i1==i2));
//        System.out.println("i3+i4: "+(i3==i4));

//   (4)  Test test1 = new Test(10);
//        Test test2 = null;
//        test2 = test1.clone();
//        System.out.println(test1);
//        test1.id = 20;
//        System.out.println(test1);
//        System.out.println(test2);

//      ***** Comparable Vs Comparator *****
//        ArrayList<Employee> employeeList = new ArrayList<>();
//        Employee emp1 = new Employee(1001L,"Kartik", "Developer");
//        Employee emp2 = new Employee(1002L,"Suraj", "Tester");
//        Employee emp3 = new Employee(1003L,"Rohit", "Manager");
//        employeeList.add(emp2);
//        employeeList.add(emp3);
//        employeeList.add(emp1);
//        employeeList.add(emp3);
//        employeeList.add(emp1);
//        employeeList.add(emp2);
//        System.out.println("Printing the employee list in their order of insertion: " + employeeList+"\n");
//        Collections.sort(employeeList);
//        System.out.println("Printing employee list after sorting using comparable: " + employeeList);
//
//        ArrayList<Order> orderList = new ArrayList<>();
//        Order order = new Order(100L, "Apple", 1000L);
//        Order order1 = new Order(101L, "Pineapple", 500L);
//        Order order2 = new Order(102L, "Orange", 800L);
//
//        orderList.add(order);
//        orderList.add(order1);
//        orderList.add(order);
//        orderList.add(order2);
//        orderList.add(order1);
//        orderList.add(order2);
//        System.out.println("Printing the order list in their order of insertion: " + orderList + "\n");
//        Collections.sort(orderList, order);
//        System.out.println("Printing list of order in ascending order of their orderName: " + orderList);




//        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
//        Runnable task = () -> {
//            for (int i = 0; i < 10; i++) {
//                syncList.add(i);
//                System.out.println(Thread.currentThread().getName() + " added " + i +". Size: " + syncList.size());
//            }
//        };
//        Thread t1 = new Thread(task, "Thread-1");
//        Thread t2 = new Thread(task, "Thread-2");
//        Thread t3 = new Thread(task, "Thread-3");
//        t1.start();
//        t2.start();
//        t3.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            t3.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("\nFinal list size: " + syncList.size());
//        System.out.println("Final list: " + syncList);

//        1.) Determine the highest value present in a numeric list
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,5,2,6,4,8,5,3,2,1,4,448,3,49));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,5,2,6,4,8,5,3,2,1,4));
        String str = "HelloHello";
        ArrayList<Integer> newList = list1;
//        System.out.println("Here is the result: "+result);

//        1. Palindrome Number(Check whether the number is palindrome or not?)
//        System.out.println("Enter the number: ");
//        Scanner sc= new Scanner(System.in);
//        int number= sc.nextInt();
//        int reference=number;
//        int sum = 0;
//        while(number>0){
//            int rem = number % 10;
//            sum = sum * 10 + rem;
//            number=number/10;
//        }
//        if(reference!=sum){
//            System.out.println("The entered number is not a palindrome: " + reference);
//        }else{
//            System.out.println("The entered number is a palindrome: " + reference);
//        }

//        2. Armstrong Number(Check whether the number is Armstrong number or not?)
//        System.out.println("Enter the number: ");
//        Scanner sc= new Scanner(System.in);
//        int number= sc.nextInt();
//        int reference = number;

//        3. Print the factorial of a number
//        System.out.println("Enter the number: ");
//        Scanner sc= new Scanner(System.in);
//        int number= sc.nextInt();
//        int factorial= number;
//        if (number<1){
//            System.out.println("Please enter a valid number: " + number);
//        }else{
//            for(int i=1; i<number; i++){
//                factorial = factorial * (number-i);
//            }
//            System.out.println("The factorial of a number is: " + factorial );
//        }

//        4. Print the prime numbers from 2 to 100.
//        System.out.println("Enter the number: ");
//        Scanner sc= new Scanner(System.in);
//        int number= sc.nextInt();
//        int reference = number;

//        for(int i=2; i<=100; i++ ){
//            int j = 1;
//            int count = 0;
//            while(j<=i){
//                if(i%j==0){
//                    count++;
//                }
//                j++;
//            }
//            if(count==2){
//                System.out.print(i + ", ");
//            }
//        }

//        5. Print the Fibonacci series for a given number.
//        System.out.println("Enter the number: ");
//        Scanner sc= new Scanner(System.in);
//        int number= sc.nextInt();
//        int first = 0;
//        int second = 1;
//        int next = 0;
//        if(number==1){
//            System.out.println(0);
//        }else if(number ==2){
//            System.out.println(0 + " " + 1);
//        }else {
//            System.out.print(0 + " " + 1 + " ");
//            while (number > 0) {
//                next =  next + (first + second);
//                first=second;
//                second=next;
//                System.out.print(next + " ");
//                number--;
//            }
//        }



//        Q. Find the Employees with the name in ascending order and salary in descending order.
//        List<Employeee> list = new ArrayList<>();
//        Employeee e1= new Employeee("Amar", 2000);
//        Employeee e2= new Employeee("Atul", 3000);
//        Employeee e3= new Employeee("Ajay", 4000);
//        Employeee e4= new Employeee("Vijay", 5000);
//        Employeee e5= new Employeee("Ritik", 6000);
//        Employeee e6= new Employeee("Ritik", 7000);
//        list.add(e1);
//        list.add(e2);
//        list.add(e3);
//        list.add(e4);
//        list.add(e5);
//        list.add(e6);

//        list.sort(Comparator.comparing(Employeee::getEmpName).thenComparing(Comparator.comparing(Employeee::getSalary).reversed()));
//        list.stream().forEach(employeee -> System.out.println(employeee));

//        Q. Find the employees whose name starts with 'A' having salary in descending order.
//        for (Employeee employeee : list.stream().filter(employeee -> employeee.getEmpName().startsWith("A")).sorted(Comparator.comparing(Employeee::getEmpName).thenComparing(Comparator.comparing(Employeee::getSalary).reversed())).toList()) {
//            System.out.println(employeee);
//        }
//        System.out.println( " Here is the result --> " + Main.longestWord("Time to write great code"));
        //        Longest even length word (Using Stream API)
//        String lStr = "Time to write great code";
//        String[] arrStr = lStr.split(" ");
//        System.out.println(Arrays.stream(arrStr).filter(s1 -> s1.length()%2==0).reduce((s1,s2) -> s2.length()>s1.length()?s2:s1).orElse("00"));

//        Max salary from each department( Employee {id, name, salary, department})
        ArrayList<Employeee> employeees=new ArrayList<>();
        employeees.add(new Employeee(100L,"Rohit",30000L,"HR"));
        employeees.add(new Employeee(100L,"Akanksha",32000L,"HR"));
        employeees.add(new Employeee(200L,"Karan",50000L,"Salaes"));
        employeees.add(new Employeee(200L,"Param",55000L,"Salaes"));
        employeees.add(new Employeee(300L,"Kirti",41000L,"Dotnet"));
        employeees.add(new Employeee(300L,"Pooja",40000L,"Dotnet"));
        employeees.add(new Employeee(400L,"Sejal",35000L,"Finance"));
        employeees.add(new Employeee(400L,"Suraj",32000L,"Finance"));
        employeees.add(new Employeee(500L,"Heera",82000L,"Java"));
        employeees.add(new Employeee(600L,"Aby",80000L,"Java"));

//        System.out.println(employeees.stream().sorted(Comparator.comparing(Employeee::getSalary).reversed()).collect(Collectors.groupingBy(Employeee::getDepartment)));
//        Using maxBy()
//        Map<String, Optional<Employeee>> map = employeees.stream().collect(Collectors.groupingBy(Employeee::getDepartment, Collectors.maxBy(Comparator.comparing(Employeee::getSalary))));
//        for (Map.Entry<String, Optional<Employeee>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() +" -> "+entry.getValue());
//        }

//        Given the list of integers, find the first element of the list using Stream functions?
//        List<Integer> list = Arrays.asList(10,23,45,65,2,45,1,54,67);
//        Optional<Integer> element = list.stream().findFirst();
//        System.out.println("Here is the first element: "+ element);

//        Given a list of integers, find the total number of elements present in the list using Stream functions?
//        List<Integer> list = Arrays.asList(10,23,45,65,2,45,1,54,67);
//        long count = list.stream().count();
//        System.out.println("Count of elements: "+count);

//        Given a list of integers, find the maximum value element present in it using Stream functions?
        List<Integer> list = Arrays.asList(10,23,45,65,2,45,1,54,67);
        Optional<Integer> maximum= list.stream().reduce((a1,a2) -> a2>a1?a1:a2);
        System.out.println("Maximum element from a list: " + maximum);

//        Move zeros to the end of the array
//        int[] result = Main.moveZeros(new int[]{1,2,0,4,3,2,0,1,0});
//        for(int i :result){
//            System.out.println(i+" , ");
//        }

//        Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//        List<Integer> list = List.of(23,25,12,21,14,76,54,37,65,16,1);
//        List<Integer> integerList =list.stream().map(String::valueOf).filter(a -> a.charAt(0) == '1').map(Integer::valueOf).toList();
//        System.out.print("Numbers starting with '1': ");
//        for(int i:integerList){
//            System.out.print(i+", ");
//        }

//        How to find duplicate elements in a given integers list in java using Stream functions?
//        List<Integer> integerList = List.of(12,45,67,43,52,14,76,12,65);
//        Set<Integer> set= integerList.stream().collect(Collectors.toSet());
//        TreeSet<Integer> tSet= new TreeSet<>(set);
//        for (Integer i : tSet) {
//            System.out.print(i+",");
//        }

        System.out.println( "Here is the result:  "+Main.longestCommonPrefix(new String[]{"flower","flow","flight"}));

    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        String s1=strs[0];
        int len1=s1.length();
        for(int i=0; i<strs.length-1; i++){
            String s2=strs[i+1];
            int len2 = s2.length();
            int j=0;
            while(j<len1 && j<len2){
                if(s1.charAt(j)==s2.charAt(j)){
                    sb.append(s1.charAt(j));
                }else{
                    break;
                }
                j++;
            }
            s1=sb.toString();
            sb.setLength(0);
            len1=s1.length();
        }
        return s1;
    }

    //        Longest even length word
//    public static String longestWord(String lStr){
//        String lStr = "Time to write great code";
//        String[] strArr= lStr.split(" ");
//        int len=0;
//        String result= " ";
//        for(String s:strArr){
//            if(s.length()%2==0 && s.length()>len){
//                len=s.length();
//                result = s;
//            }
//        }
//        return result;
//    }

//    Move zeros to the end of Array
//    public static int[] moveZeros(int[] arr){
//
//        for(int i=0; i<arr.length;i++){
//                for(int j=1; j<arr.length;j++){
//                    if(arr[i]==0){
//                        int temp = arr[i];
//                        arr[i]=arr[j];
//                        arr[j]=temp;
//                    }
//                }
//        }
//    }
}

class Employeee{
    private Long id;
    private String empName;
    private Long salary;
    private String department;
    private Employeee(){}

    public Employeee(String empName, Long salary){
        this.empName=empName;
        this.salary=salary;
    }
    public Employeee(Long id, String empName, Long salary, String department){
        this.id=id;
        this.empName=empName;
        this.salary=salary;
        this.department=department;
    }

    public Long getId(){return id;}

    public String getEmpName() {
        return empName;
    }

    public Long getSalary() {
        return salary;
    }

    public String getDepartment(){return department;}

    @Override
    public String toString() {
        return "Employeee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}