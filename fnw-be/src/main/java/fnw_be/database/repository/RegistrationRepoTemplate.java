package fnw_be.database.repository;

import fnw_be.database.data.Registration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@EnableJpaRepositories
public class RegistrationRepoTemplate {

    RegistrationRepo registrationRepo;

    public RegistrationRepoTemplate(RegistrationRepo registrationRepo) {
        this.registrationRepo = registrationRepo;
    }

    public List<Registration> findAll() {
        return registrationRepo.findAll();
    }

    public Registration save(Registration registration) {
        return registrationRepo.save(registration);
    }

    public void delete(Registration registration) {
        registrationRepo.delete(registration);
    }

    public Registration findById(Long id) {
        return registrationRepo.findById(id).orElseGet(Registration::new);
    }

    public Registration findByName(String name) {
        return registrationRepo.findByName(name);
    }


    public Registration findByEmail(String email) {
        return registrationRepo.findByEmail(email);
    }
}
