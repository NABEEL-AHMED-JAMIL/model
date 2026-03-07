package com.barco.model.repository;

import com.barco.model.pojo.EtlAccount;
import com.barco.model.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface ETLAccountRepository extends CrudRepository<EtlAccount, Long> {

    // Find EtlAccount by the associated AppUser's username and the EtlAccount's status
    Optional<EtlAccount> findByAppUserUsernameAndStatus(String username, APPLICATION_STATUS status);

    // Find EtlAccount by the associated AppUser's email and the EtlAccount's status
    Optional<EtlAccount> findByAppUserEmailAndStatus(String email, APPLICATION_STATUS status);

}
