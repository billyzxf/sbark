package JavaBase;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DAOTest {

    @Test
    public void test1() {
        CustomerDAO dao1 = new CustomerDAO();
        dao1.insert(new Customer());
    }

    @Test
    public void test2() {
        List<?> list1 = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();
        list2.add(123);
        list2.add(456);
        list1 = list2;
        Object o = list1.get(1);
        System.out.println(o);

    }
}
