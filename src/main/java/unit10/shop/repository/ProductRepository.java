package unit10.shop.repository;

import unit10.shop.dao.CategoryDao;
import unit10.shop.entity.Category;

import java.util.List;

public class ProductRepository implements CategoryDao {
    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public Category findByName(String name) {
        return null;
    }

    @Override
    public void save(Category obj) {

    }

    @Override
    public void update(Category obj) {

    }

    @Override
    public void delete(Category obj) {

    }

    @Override
    public void deleteAll() {

    }
}
