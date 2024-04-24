package com.barco.model.repository;

import com.barco.model.pojo.GenControl;
import com.barco.model.pojo.GenControlLinkGenSection;
import com.barco.model.pojo.GenSection;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface GenControlLinkGenSectionRepository extends CrudRepository<GenControlLinkGenSection, Long> {

    String DELETE_ALL_BY_STATUS_AND_SECTION_ID_AND_APP_USER_ID = "UPDATE GenControlLinkGenSection gClGs SET gClGs.status = ?1, gClGs.updatedBy.id = ?3 " +
        "WHERE gClGs.genSection.id = ?2 AND gClGs.createdBy.id = ?3 AND gClGs.status != ?1";

    public Long countByGenSectionAndStatusNot(GenSection genSection, APPLICATION_STATUS status);

    public Long countByGenControlAndStatusNot(GenControl genControl, APPLICATION_STATUS status);

    public List<GenControlLinkGenSection> findAllByIdInAndStatusNot(List<Long> ids, APPLICATION_STATUS status);

    @Modifying
    @Query(DELETE_ALL_BY_STATUS_AND_SECTION_ID_AND_APP_USER_ID)
    public void deleteAllByStatusAndSectionIdAndAppUserId(APPLICATION_STATUS status, Long genSectionId, Long createdBy);
}
