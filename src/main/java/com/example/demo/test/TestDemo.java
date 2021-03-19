package com.example.demo.test;

import com.example.demo.entity.User;
import org.junit.Test;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class TestDemo {

    @Test//冒泡排序
    public void test1() {
        int[] ints = new int[]{2, 5, 3, 4, 1};

        int temp;//创建临时变量
        //遍历数组
        for (int i = 0; i < ints.length; i++) {
            //每循环一次就确定一位数的位置,固条件为ints.length-1-i
            for (int j = 0; j < ints.length - 1 - i; j++) {
                //从小到大排序,如果后一位数更小则换位置
                if (ints[j] > ints[j + 1]) {
                    temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
                System.out.println(Arrays.toString(ints));
            }
        }
    }


    @Test//找出字符串中重复的字符
    public void test2() {
        String str = "aawdfdgerwagdgsdaf";

        char[] chars = str.toCharArray();
        //创建hashmap对象,key存字符,value存字符个数
        Map<Character, Integer> map = new HashMap();
        for (Character character : chars) {
            map.put(character, map.get(character) != null ? map.get(character) + 1 : 1);
        }

        //遍历map
        Set<Character> characters = map.keySet();
        characters.forEach(character -> System.out.println(character + "====>" + map.get(character)));
    }


    @Test//io之输入流:inputstream
    public void test3() {
        File file = new File("D:\\data\\devdata\\devprojects\\demo\\hello.txt");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            int readByte;
            while ((readByte = inputStream.read()) != -1) {
                System.out.write(readByte);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test4() {
        String s1 = new String();
        s1 = new String("/:hello");

        System.out.println(s1);
        new ThreadPoolExecutor(3, 5, 30,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());


    }

    @Test//java8 Stream
    public void test5() {
        User user = new User(1, "lisi");
        User user1 = new User(2, "zhangsan");
        List<User> list = new ArrayList();
//        Stream<User> stream = list.stream();
        list.add(user);
        list.add(user1);
        HashMap<Integer, User> map = new HashMap();
        list.forEach(lists -> {
            map.put(lists.getId(), lists);
        });

        Set<Integer> integers = map.keySet();
        integers.forEach(set -> System.out.println(set + "--" + map.get(set)));

        consumo(100, (x) -> System.out.println(x));
    }

    public void consumo(double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }


}
