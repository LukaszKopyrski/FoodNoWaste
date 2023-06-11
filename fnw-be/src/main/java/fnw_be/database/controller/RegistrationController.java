package fnw_be.database.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fnw_be.database.data.Registration;
import fnw_be.database.repository.RegistrationRepoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RegistrationController {
    RegistrationRepoTemplate repoTemplate;

    public RegistrationController(RegistrationRepoTemplate repoTemplate) {
        this.repoTemplate = repoTemplate;
    }

    @RequestMapping(value = "/registration/response", method = RequestMethod.POST)
    ResponseEntity<Registration> register(@RequestBody String registrationString) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Registration registration = mapper.readValue(registrationString, Registration.class);
        Registration byName = repoTemplate.findByName(registration.getName());
        if (byName == null) {
            repoTemplate.save(registration);
            return ResponseEntity.ok(registration);
        }
        return ResponseEntity.badRequest().build(); //Status 400
    }

}
