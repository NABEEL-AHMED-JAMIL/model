package com.barco.model.repository;

import com.barco.model.pojo.QueryInquiry;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface QueryInquiryRepository extends CrudRepository<QueryInquiry, Long> {

    public String FIND_BY_ID_AND_USERNAME = "SELECT queryInquiry FROM QueryInquiry queryInquiry " +
            "WHERE queryInquiry.id = ?1 AND queryInquiry.createdBy.username = ?2";

    public String FIND_BY_ID_AND_USERNAME_AND_STATUS_NOT = "SELECT queryInquiry FROM QueryInquiry queryInquiry " +
        "WHERE queryInquiry.id = ?1 AND queryInquiry.createdBy.username = ?2 AND queryInquiry.status != ?3";

    public String FIND_ALL_BY_USERNAME = "SELECT queryInquiry FROM QueryInquiry queryInquiry " +
        "WHERE queryInquiry.createdBy.username = ?1 ORDER BY queryInquiry.dateCreated DESC";

    @Query(value = FIND_BY_ID_AND_USERNAME)
    public Optional<QueryInquiry> findByIdAndUsername(Long id, String username);

    @Query(value = FIND_BY_ID_AND_USERNAME_AND_STATUS_NOT)
    public Optional<QueryInquiry> findByIdAndUsernameAndStatusNot(Long id, String username, APPLICATION_STATUS status);

    @Query(value = FIND_ALL_BY_USERNAME)
    public List<QueryInquiry> findAllByUsernameOrderByDateCreatedDesc(String username);

    public List<QueryInquiry> findAllByIdIn(List<Long> ids);

}
