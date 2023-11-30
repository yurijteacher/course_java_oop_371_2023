package unit10.shop.dao;

import java.util.List;
import java.util.Set;

public interface GeneralDao<T> {
    List<T> findAll();
    T findById(Long id);
    T findByName(String name);
    void save(T obj);  // not found id
    void update(T obj); // id
    void delete(T obj);
    void deleteAll();
}
