package ENSIM.DM_POO.Model;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
}
