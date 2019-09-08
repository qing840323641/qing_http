import com.sun.glass.ui.Size;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //arrayToList();//array和list转换
        //iterator();//迭代器
    }

    //迭代器
    public static void iterator() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);

        }
    }

    //array和list转换
    public static void arrayToList() {
        // list to array
        List<String> list = new ArrayList<String>();
        list.add("☞精◈彩◈猿◈笔◈记☜");
        list.add("的博客");
        Object[] objects = list.toArray();
        System.out.println(objects);
// array to list
        String[] array = new String[]{"☞精◈彩◈猿◈笔◈记☜", "的博客"};
        List<String> stringList = Arrays.asList(array);
        System.out.println(stringList);
    }
}




