package edu.java.collection;

import java.util.*;
import java.util.function.Consumer;

public class ListMain {
    public static void main(String[] args) {
        List<Object> list= new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1);

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //4. consumer 인터페이스를 이용해서 list출력
//        Consumer<Object> consumer = new Consumer<Object>()//X 인터페이스라 안됨
        Consumer<Object> consumer = new Consumer<Object>() {//O 익명의 내부클래스로 구현
            @Override
            public void accept(Object o) {
                System.out.println(o + " ");
            }
        };
        list.forEach(consumer);

        //consumer 인터페이스를 이용해서 list값을 출력 - 람다식으로
        list.forEach(o -> System.out.println(o+" "));

        String[] animal = {"dog","cat","cow"};
        List<String> animalList = Arrays.asList(animal);
        System.out.println(Arrays.toString(animal));
        System.out.println(animalList);
        String[] array = animalList.toArray(new String[0]);
        String[] array1 = animalList.toArray(String[]::new);
        animalList.set(1,"bee");
        System.out.println(animalList);
        System.out.println(Arrays.toString(animal));// list와 배열이 같은 객체를 가르킴
//        animalList.add("bird"); //UnsupportedOperationException 발생 배열을 리스트로 바꾸면 추가가 안됨.배열을 리스트형태로 감싼다?라고 생각하기

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"서울");
        map.put(2,"경기");
        map.put(3,"충청");
        map.put(3,"제주");

        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            System.out.println(integer+" : " + map.get(integer));
        }
        Iterator<Integer> iterator1 = map.keySet().iterator();

        while(iterator1.hasNext()){
            Integer next = iterator1.next();
            System.out.println( next+" : "+map.get(next));
        }

        map.forEach((key, value)->{
            System.out.println(key + "->" + map.get(key));
        });

    }
}
