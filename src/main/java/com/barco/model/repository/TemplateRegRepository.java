package com.barco.model.repository;

import com.barco.model.pojo.TemplateReg;
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
public interface TemplateRegRepository extends CrudRepository<TemplateReg, Long> {

	String FIND_BY_TEMPLATE_ID_AND_USERNAME = "SELECT templateReg FROM TemplateReg templateReg " +
		"WHERE templateReg.id = ?1 AND templateReg.createdBy.username = ?2";
	String FIND_ALL_BY_USERNAME = "SELECT templateReg FROM TemplateReg templateReg " +
		"WHERE templateReg.createdBy.username = ?1 ORDER BY templateReg.dateCreated DESC";

	public Optional<TemplateReg> findFirstByTemplateNameAndStatusNot(String templateName, APPLICATION_STATUS status);

	public Optional<TemplateReg> findFirstByTemplateNameAndStatus(String templateName, APPLICATION_STATUS status);

	@Query(value = FIND_BY_TEMPLATE_ID_AND_USERNAME)
	public Optional<TemplateReg> findByIdAndUsername(Long id, String username);

	@Query(value = FIND_ALL_BY_USERNAME)
	public List<TemplateReg> findAllByUsernameOrderByDateCreatedDesc(String username);

	public List<TemplateReg> findAllByIdIn(List<Long> ids);

}
