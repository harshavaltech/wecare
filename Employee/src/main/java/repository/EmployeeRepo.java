package repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{


}
