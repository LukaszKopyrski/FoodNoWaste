package fnw_be.database.repository;

import fnw_be.database.data.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration, Long> {
    Registration findByName(String name);
}
