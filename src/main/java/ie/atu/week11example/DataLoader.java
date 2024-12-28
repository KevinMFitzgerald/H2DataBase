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
        Person temp1 = new Person(1L, "Kevin Mark Fitzgerald", 30, "KMF@gmail.com", "Engineer", "K123", "Software Engineer", "IT");
        Person temp2 = new Person( 2L,"Mark Kevin Fitzgerald", 28, "MKF@example.com", "Student", "M456", "Software Engineer", "IT");
        personRepository.save(temp2);
        personRepository.save(temp1);
    }
}
