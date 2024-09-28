package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class A {
    public static void main(String[] args) {
        //Predicate functional interface
        //it takes intup and produces boolean value output

        //1 test equal or not
//        Predicate<String>val = x->x.equals("mike");
//        boolean result = val.test("mike");
//        System.out.println(result);

        //2   test greater than or less than
//        Predicate<Integer>val = x->x>300;
//        boolean test = val.test(200);
//        System.out.println(test);

//      //3 filter elements above 100
//        List<Integer> data = Arrays.asList(100, 10, 35, 2, 15, 500, 700);
//        List<Integer> newData = data.stream().filter(x -> x > 100).collect(Collectors.toList());
//        System.out.println(newData);


       //4 filter elements whose name starts with m
//        List<String> data = Arrays.asList("ADAM","madam","rohan","sohan","waris");
//        List<String> newData = data.stream().filter(x -> x.startsWith("m")).collect(Collectors.toList());
//        System.out.println(newData);

//        //5 filter only even number 2,4,8
//        List<Integer> data = Arrays.asList(10, 11, 13,14, 16, 19);
//        List<Integer> newData = data.stream().filter(t->t%2==0).collect(Collectors.toList());
//        System.out.println(newData);


        //6 filter only odd number
//        List<Integer> data = Arrays.asList(19, 20, 21, 22, 23, 24, 25);
//        List<Integer> newData = data.stream().filter(t -> t % 2 != 0).collect(Collectors.toList());
//        System.out.println(newData);


        ////////// function functional interface ///////////////
          // it takes input and produce output
//        Function<String,Integer> x= s->s.length();
//        Integer val = x.apply("mike");
//        System.out.println(val);

//
//        Function<Integer,Integer> x= s->s*s;
//        Integer val = x.apply(100);
//        System.out.println(val);

//        List<Integer> data = Arrays.asList(10, 20, 35, 12, 14);
//        List<Integer> newData = data.stream().map(x -> x + x).collect(Collectors.toList());
//        System.out.println(newData);

//        List<String> data = Arrays.asList("waris","wasim","rahul");
//        List<String> newData = data.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newData);


//        List<String> data = Arrays.asList("waris","wasim","rahul");
//        List<Integer> newData = data.stream().map(x -> x.length()).collect(Collectors.toList());
//        System.out.println(newData);


//        List<String> data = Arrays.asList("waris","nasim","rahul");
//        List<String> newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);

        //remove duplicate values using stream api
//        List<String> data = Arrays.asList("waris","nasim","rahul");
//        List<String> newData = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newData);

//
//        List<String> data = Arrays.asList("warish","nasimas","rahu");
//        List<String> newData = data.stream().filter(s->s.length()>4).collect(Collectors.toList());
//        System.out.println(newData);


 ///////////////////////consumer functional interface ///////////////////////
             //it takes one input and prioduces no output

//        Consumer<String>x=s->System.out.println(s);
//        x.accept("mike");

//        List<String>names= Arrays.asList("Alice","Bob","Charles");
//       Consumer<String>val= s->System.out.println(s);
//       names.forEach(val);

//
//        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 10);
//        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
//        System.out.println(max.get());


//        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 10);
//        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
//        System.out.println(min.get());
//        }


//        List<Employee> employees = Arrays.asList(
//                new Employee(1, "mike"),
//                new Employee(2, "stalin"),
//                new Employee(3,"adam")
//    );
//        Stream<EmployeeDto> dtos = employees.stream().map(e -> mapToDto(e));
//    }
//        static   EmployeeDto mapToDto(Employee employee){
//       EmployeeDto dto = new EmployeeDto();
//       dto.setId(employee.getId());
//       dto.setName(employee.getName());
//       return dto;
//
   }
}