package com.barco.model.repository;

import com.barco.model.pojo.STTForm;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
@Transactional
public interface STTFormRepository extends CrudRepository<STTForm, Long> {

    @Query(value = "SELECT sttForm FROM STTForm sttForm WHERE sttForm.sttfId = ?1 AND " +
        "sttForm.appUser.username = ?2 AND sttForm.status = ?3")
    public Optional<STTForm> findBySTTFIdAndAppUserAndStatusNotIn(Long sttfId, String username, Long status);


}
