package com.barco.model.repository;

import com.barco.model.pojo.GenForm;
import com.barco.model.pojo.GenSection;
import com.barco.model.pojo.GenSectionLinkGenForm;
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
public interface GenSectionLinkGenFormRepository extends CrudRepository<GenSectionLinkGenForm, Long> {

    String DELETE_ALL_BY_STATUS_AND_FORM_ID_AND_APP_USER_ID = "UPDATE GenSectionLinkGenForm gSlGf SET gSlGf.status = ?1, gSlGf.updatedBy.id = ?3 " +
        "WHERE gSlGf.genForm.id = ?2 AND gSlGf.createdBy.id = ?3 AND gSlGf.status != ?1";

    public Long countByGenFormAndStatusNot(GenForm genForm, APPLICATION_STATUS status);

    public Long countByGenSectionAndStatusNot(GenSection genSection, APPLICATION_STATUS status);

    public List<GenSectionLinkGenForm> findAllByIdInAndStatusNot(List<Long> ids, APPLICATION_STATUS status);

    public List<GenSectionLinkGenForm> findAllByGenFormAndStatus(GenForm genForm, APPLICATION_STATUS status);

    @Modifying
    @Query(DELETE_ALL_BY_STATUS_AND_FORM_ID_AND_APP_USER_ID)
    public void deleteAllByStatusAndFormIdAndAppUserId(APPLICATION_STATUS status, Long genFormId, Long createdBy);

}
