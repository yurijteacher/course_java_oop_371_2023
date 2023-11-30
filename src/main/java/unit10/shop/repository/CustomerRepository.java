package unit10.shop.repository;

import unit10.shop.dao.CustomerDao;
import unit9.association.one_to_one.Customer;

import java.util.List;

public class CustomerRepository implements CustomerDao {
    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public Customer findByName(String name) {
        return null;
    }

    @Override
    public void save(Customer obj) {

    }

    @Override
    public void update(Customer obj) {

    }

    @Override
    public void delete(Customer obj) {

    }

    @Override
    public void deleteAll() {

    }
}
