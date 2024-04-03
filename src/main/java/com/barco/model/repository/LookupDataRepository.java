package com.barco.model.repository;

import com.barco.model.pojo.LookupData;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface LookupDataRepository extends CrudRepository<LookupData, Long> {

    String FIND_ALL_PARENT_LOOKUP_BY_USERNAME = "SELECT lkd FROM LookupData lkd " +
        "WHERE lkd.createdBy.username = ?1 AND lkd.parentLookup.id IS NULL";
    String FIND_ONE_BY_PARENT_LOOKUP_ID_AND_USERNAME = "SELECT lkd FROM LookupData lkd " +
        "WHERE lkd.id = ?1 AND lkd.createdBy.username = ?2";

    public Optional<LookupData> findByLookupType(String lookupType);

    public List<LookupData> findByParentLookupIsNull();

    @Query(value = FIND_ALL_PARENT_LOOKUP_BY_USERNAME)
    public List<LookupData> findAllParentLookupByUsername(String username);

    @Query(value = FIND_ONE_BY_PARENT_LOOKUP_ID_AND_USERNAME)
    public Optional<LookupData> findOneByParentLookupIdAndUsername(Long parentLookupId, String username);

}