package fnw_be.database.repository;

import fnw_be.database.data.Registration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistrationRepoTemplate{

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

    public Registration findByEmail(String email) {
        return registrationRepo.findByEmail(email);
    }

    public Registration findByPassword(String password) {return registrationRepo.findByPassword(password);}

    public Registration patch(String email, String password, String firstName, String lastName, String phoneNumber) {
        Registration registration = findByEmail(email);
        if (registration != null) {
            registration.setPassword(password);
            registration.setName(firstName);
            registration.setLastName(lastName);
            registration.setPhoneNumber(phoneNumber);
            return save(registration);
        }
        return null;
    }

}
