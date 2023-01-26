package JavaBase;

public class DAO<T> {

    //添加
    public void insert(T t) {
    }

    //删除
    public boolean remove(T t) {
        return false;
    }

    //修改
    public void update(int i, T t) {
    }

    //查询
    public T search(int i) {
        return null;
    }

    //查询多条数据
    public T[] searchAll(int i) {
        return null;
    }
}
