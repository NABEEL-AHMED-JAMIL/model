package com.barco.model.repository;

import com.barco.model.pojo.TemplateReg;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface TemplateRegRepository extends CrudRepository<TemplateReg, Long> {

	public Optional<TemplateReg> findFirstByTemplateNameAndStatusNot(String templateName, APPLICATION_STATUS status);

	public Optional<TemplateReg> findFirstByTemplateNameAndStatus(String templateName, APPLICATION_STATUS status);

	public Optional<TemplateReg> findByUuidAndStatusNot(String id, APPLICATION_STATUS status);

	public List<TemplateReg> findAllByStatusNotOrderByDateCreatedDesc(APPLICATION_STATUS status);

	public List<TemplateReg> findAllByUuidInAndStatusNot(List<String> uuids, APPLICATION_STATUS status);

}
