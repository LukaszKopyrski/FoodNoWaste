package fnw_be.database.service;

import fnw_be.database.controller.RegistrationController;
import fnw_be.database.repository.RegistrationRepoTemplate;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class RepositoryService {

    Logger logger = getLogger(RepositoryService.class);

    RegistrationRepoTemplate repoTemplate;
    RegistrationController controller;

    public RepositoryService(RegistrationRepoTemplate repoTemplate, RegistrationController controller) {
        this.repoTemplate = repoTemplate;
        this.controller = controller;
    }


}
