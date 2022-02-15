package se.kth.recruitmentapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import se.kth.recruitmentapp.domain.Role;

/**
 * Contains database access methods regarding roles
 *
 * This repository class is annotated with transactional, which is required for establishing transactions for explicitly
 * defined methods. Methods commits or rollbacks when returned. Throws an exception if there is not an active transaction.
 */
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
