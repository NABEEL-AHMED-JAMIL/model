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

	public Optional<TemplateReg> findById(Long id);

	/**
	 * Find all TemplateReg entities ordered by the dateCreated field in descending order.
	 * @return List of TemplateReg entities.
	 */
	public List<TemplateReg> findAllByOrderByDateCreatedDesc();

	public List<TemplateReg> findAllByIdIn(List<Long> ids);

}
