package fnw_be.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fnw_be.database.data.Registration;
import fnw_be.database.repository.RegistrationRepoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class RegistrationController {

    RegistrationRepoTemplate repoTemplate;


    public RegistrationController(RegistrationRepoTemplate repoTemplate) {
        this.repoTemplate = repoTemplate;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/registration/response", method = RequestMethod.POST)
    ResponseEntity<Registration> register(@RequestBody String registrationString) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Registration registration = mapper.readValue(registrationString, Registration.class);
        Registration byName = repoTemplate.findByEmail(registration.getEmail());
        registration.setId(4);
        if (byName == null) {
            Registration save = repoTemplate.save(registration);
            return ResponseEntity.ok(save);
        }
        return ResponseEntity.badRequest().build(); //Status 400
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/registration/allUsers", method = RequestMethod.GET)
    ResponseEntity<List<Registration>> getAllUsers() {
        List<Registration> all = repoTemplate.findAll();

        return ResponseEntity.ok(all);
    }


}
