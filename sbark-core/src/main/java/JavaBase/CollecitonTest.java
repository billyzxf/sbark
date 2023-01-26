package JavaBase;

import org.junit.Test;

import java.util.*;

public class CollecitonTest {

    @Test
    public void test1() {
        HashMap<Object, Object> mp1 = new HashMap<>();
        mp1.put(1, "AAA");
        mp1.put(2, new Person("Billy", 28, 'M'));
        System.out.println(mp1);


    }

    @Test
    public void test2() {

        ArrayList<Object> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(456);
        list1.add(-15);

//        Collections.reverse(list1);
        Collections.shuffle(list1);
        System.out.println(list1 );

        List list2 = Arrays.asList(new Object[list1.size()]);
        System.out.println(list2.size());
        Collections.copy(list2, list1);
        System.out.println(list2);
    }

    @Test
    public void test3() {
        // 泛型使用
        ArrayList<Integer> list1 = new ArrayList();
//        list1.add("a");
        list1.add(99);
        list1.add(69);
        list1.add(88);

//        for (Integer score : list1) {
//            int stuScore = score;
//            System.out.println(stuScore);
//        }

        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) {
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }

    @Test
    public void test4() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        System.out.println(map.isEmpty());
        map.put("A", 1);
        map.put("B", 2);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + ":" + value);
        }
    }

    @Test
    public void test5() {
        // 自定义泛型的使用方法
        Order<String> order = new Order<String>("orderAA", 1001, "AAA");

        //调用泛型方法
        String[] arr = new String[]{"A", "B"};
        List<String> res = order.call(arr);
        System.out.println(res);
    }


}
