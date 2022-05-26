package co2103.hw2.repo;

import org.springframework.data.repository.CrudRepository;

import co2103.hw2.model.Staff;

public interface StaffRepository extends CrudRepository<Staff, Integer> {

}
