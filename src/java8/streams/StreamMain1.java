package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String[] args) {


        List<Product> products = List.of(
                new Product("Laptop", "Electronics", 1200),
                new Product("Shirt", "Clothing", 40),
                new Product("Smartphone", "Electronics", 800),
                new Product("Jeans", "Clothing", 60),
                new Product("Headphones", "Electronics", 150)
        );


        System.out.println(products.stream()
                .filter(product -> product.getCategory().equals("Electronics"))
                .map(product -> product.getName().toLowerCase())

                        .sorted().collect(Collectors.toList()));

        

        System.out.println(products);

        List<Employee> employees = List.of(
                new Employee("John", 60000),
                new Employee("Alice", 45000),
                new Employee("Bob", 70000),
                new Employee("Carol", 80000),
                new Employee("David", 35000)
        );

        List<String> emp=employees.stream()
                .filter(employee -> employee.getSalary()>=50000)
                .map(employee -> employee.name.toUpperCase())
                .collect(Collectors.toList());



        System.out.println("Names of Employees with Salary >= 50,000: "+emp);








        List<Integer> numbers = List.of(3, 6, 9, 12, 15, 18);

        List<Integer> newList=numbers.stream()
                .filter(n->n%2==0)
                .map(n->n*n)
                .collect(Collectors.toList());



        System.out.println("Squared Even Numbers : "+newList);

//         create a list and print only even numbers from list

        List<Integer> nums=new ArrayList<>();
        nums.add(23);
        nums.add(87);
        nums.add(54);
        nums.add(32);
        nums.add(78);
//
        List<Integer> above50=nums.stream().filter(n->n>=50).toList();

        System.out.println(above50);






        List<Integer> evenNumbers=new ArrayList<>();

        for (Integer i:nums){
            if (i%2==0){
                evenNumbers.add(i);
            }

       }

        Stream<Integer> integerStream=nums.stream();
        List<Integer> newList1=integerStream.filter(i->i%2==0).collect(Collectors.toList());


       List<Integer>  newList2=nums.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println(newList);

        List<String> names=new ArrayList<>();
        names.add("Shubham");
        names.add("Vishal");
        names.add("Vaishali");
        names.add("Rahul");



        System.out.println(nums);
    }
}
