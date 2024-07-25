package edu.java.collection;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionPkg {
    public static void main(String[] args) {
        System.out.println("1. consumer 인터페이스를 람다식으로 구현");
        Consumer<Integer> consumer = (arg) -> System.out.println(arg*2);
        consumer.accept(3);
        System.out.println("2. Bifunction - return 0 , arg 2");
        BiFunction<Integer,Integer,Double> biFunction = (x,y) -> Math.pow(x,y);
        Double apply = biFunction.apply(2, 3);
        System.out.println("apply = " + apply);

        Supplier<Boolean> sup = () -> new Random().nextBoolean();

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("V");
        list.add("C");
        System.out.println("list = " + list);
        list.forEach(num -> System.out.print(num+" - "));
        System.out.println();
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.forEach((i,str) -> System.out.println(i + " : " + str));


    }
}
