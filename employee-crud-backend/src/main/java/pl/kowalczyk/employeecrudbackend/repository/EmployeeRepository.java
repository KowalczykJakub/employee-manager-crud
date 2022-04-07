package pl.kowalczyk.employeecrudbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kowalczyk.employeecrudbackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
