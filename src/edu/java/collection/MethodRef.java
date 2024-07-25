package edu.java.collection;

import java.util.function.IntBinaryOperator;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class MethodRef {
    public static void main(String[] args) {
        IntBinaryOperator ibo1 = (x,y)->Math.min(x,y);
        IntBinaryOperator ibo2 = Math::min;

        System.out.println("ibo1.applyAsInt(1,2) = " + ibo1.applyAsInt(1, 2));
        System.out.println("ibo2.applyAsInt(1,2) = " + ibo2.applyAsInt(1, 2));

        ToIntFunction<String> tif1 = (x)->Integer.parseInt(x);
        ToIntFunction<String> tif2 = Integer::parseInt;
        tif1.applyAsInt("123");
        tif2.applyAsInt("123");
    }
}
class Calculator{
    public Calculator(){

    }
}