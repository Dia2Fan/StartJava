package edu.java.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        int[] arr0to4 ={0,1,2,3,4};
        IntStream is = IntStream.range(0,5);
        is = IntStream.rangeClosed(0,4);
        is = Arrays.stream(arr0to4);
        is = IntStream.of(arr0to4);
        is = IntStream.of(0,1,2,3,4);

        is.forEach(i-> System.out.println(i+" "));

        is = new Random().ints();
        is = new Random().ints(4,0,100);
        is.forEach(System.out::println);

        DoubleStream ds = new Random().doubles(5);
        ds.forEach(System.out::println);

        String[] arr = {"pop","air","oak","key"};
        List<String> list = Arrays.asList("pop","air","oak","key");
        Stream<String> s1 = Arrays.stream(arr);
                       s1 = list.stream().filter( l -> l.contains("a"));
        System.out.println(list);
        System.out.println(s1.collect(Collectors.toList()));


        list.stream().map(l->l.toLowerCase()).forEach(System.out::println);
    }
}
