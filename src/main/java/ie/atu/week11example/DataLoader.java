package ie.atu.week11example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final PersonRepository personRepository;

    public DataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Person person1 = new Person();
        person1.setName("Kevin Mark Fitzgerald");
        person1.setAge(30);
        person1.setEmail("KMF@gmail.com");
        person1.setTitle("Engineer");
        person1.setEmployeeId("K123");
        person1.setPosition("Software Engineer");
        person1.setDepartment("IT");

        Person person2 = new Person();
        person2.setName("Mark Kevin Fitzgerald");
        person2.setAge(28);
        person2.setEmail("MKF@example.com");
        person2.setTitle("Student");
        person2.setEmployeeId("M456");
        person2.setPosition("Software Engineer");
        person2.setDepartment("IT");

        personRepository.save(person1);
        personRepository.save(person2);

    }
}