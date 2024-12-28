package ie.atu.week11example;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    // Placeholder method to save a person (add to Db in the next two weeks)
    public void savePerson(Person person) {
        personRepository.save(person);
        System.out.println("Person saved: " + person);
    }

    // Placeholder method to retrieve a person by employeeId
    public Person getPersonByEmployeeId(String employeeId) {
        return personRepository.findByEmployeeId(employeeId);
    }
    public void updatePerson(String employeeId, Person updatedPerson) {
        Person existingPerson = personRepository.findByEmployeeId(employeeId);
        if (existingPerson != null) {
            existingPerson.setName(updatedPerson.getName());
            existingPerson.setAge(updatedPerson.getAge());
            existingPerson.setTitle(updatedPerson.getTitle());
            existingPerson.setPosition(updatedPerson.getPosition());
            existingPerson.setDepartment(updatedPerson.getDepartment());
            personRepository.save(existingPerson);
        }
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
    public List<Person> getPersonsByDepartment(String department) {
        return personRepository.findByDepartment(department);
    }

}
