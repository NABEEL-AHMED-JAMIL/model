package com.barco.model.repository;

import com.barco.model.pojo.GenForm;
import com.barco.model.pojo.GenSection;
import com.barco.model.pojo.GenSectionLinkGenForm;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface GenSectionLinkGenFormRepository extends CrudRepository<GenSectionLinkGenForm, Long> {

    public Long countByGenFormAndStatusNot(GenForm genForm, APPLICATION_STATUS status);

    public Long countByGenSectionAndStatusNot(GenSection genSection, APPLICATION_STATUS status);

    public List<GenSectionLinkGenForm> findAllByIdInAndStatusNot(List<Long> ids, APPLICATION_STATUS status);

    public List<GenSectionLinkGenForm> findAllByGenFormAndStatus(GenForm genForm, APPLICATION_STATUS status);

}
