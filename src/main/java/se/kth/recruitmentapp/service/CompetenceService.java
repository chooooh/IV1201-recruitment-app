package se.kth.recruitmentapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import se.kth.recruitmentapp.domain.models.Competence;
import se.kth.recruitmentapp.repository.CompetenceRepository;

import java.util.List;
/**
 * This is the competence service class, which defines competence related methods
 * that will be used by the controller classes.
 *
 * This service class is transactional, methods commits or rollbacks when returned. A new transaction is started
 * regardless of any existing transaction.
 */
@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
@Service
public class CompetenceService {
    @Autowired
    private CompetenceRepository repository;

    /**
     * Returns a competence by name.
     * @param name , the name of the competence to be found.
     * @return the competence found with the specified name.
     */
    public Competence getCompetenceByName(String name) {
        return repository.findCompetenceByName(name);
    }

    /**
     * Method that searches for competences by specified language.
     * @param language , the language competences should be returned in.
     * @return a list of Competences in the language specified.
     */
    public List<Competence> getAllCompetencesByLanguage(String language) {
        return repository.findCompetenceByLanguageCode(language);
    }
}
