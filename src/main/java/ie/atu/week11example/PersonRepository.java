package ie.atu.week11example;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByEmployeeId(String employeeId);
    List<Person> findByDepartment(String department);
}