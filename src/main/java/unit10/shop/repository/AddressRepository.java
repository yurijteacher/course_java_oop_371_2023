package unit10.shop.repository;

import unit10.shop.dao.AddressDao;
import unit10.shop.entity.Address;

import java.util.List;

public class AddressRepository implements AddressDao {
    @Override
    public List<Address> findAll(Address obj) {
        return null;
    }

    @Override
    public Address findById(Long id) {
        return null;
    }

    @Override
    public Address findByName(String name) {
        return null;
    }

    @Override
    public void save(Address obj) {

    }

    @Override
    public void update(Address obj) {

    }

    @Override
    public void delete(Address obj) {

    }

    @Override
    public void deleteAll() {

    }
}
