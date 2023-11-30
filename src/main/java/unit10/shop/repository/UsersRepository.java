package unit10.shop.repository;

import unit10.shop.dao.UsersDao;
import unit10.shop.entity.Users;

import java.util.List;

public class UsersRepository implements UsersDao {
    @Override
    public List<Users> findAll() {
        return null;
    }

    @Override
    public Users findById(Long id) {
        return null;
    }

    @Override
    public Users findByName(String name) {
        return null;
    }

    @Override
    public void save(Users obj) {

    }

    @Override
    public void update(Users obj) {

    }

    @Override
    public void delete(Users obj) {

    }

    @Override
    public void deleteAll() {

    }
}
