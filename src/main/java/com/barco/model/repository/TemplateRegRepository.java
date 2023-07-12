package com.barco.model.repository;

import com.barco.model.pojo.TemplateReg;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
@Transactional
public interface TemplateRegRepository extends CrudRepository<TemplateReg, Long> {

    @Query(value = "SELECT templateReg FROM TemplateReg templateReg WHERE templateReg.templateType = ?1 AND templateReg.status = ?2")
    public Optional<TemplateReg> findByTemplateTypeAndStatus(Long templateType, Long status);

    @Query(value = "SELECT templateReg FROM TemplateReg templateReg WHERE templateReg.templateType = ?1 AND templateReg.status != ?2")
    public Optional<TemplateReg> findFirstByTemplateTypeAndStatusNotIn(Long templateType, Long status);

    @Query(value = "SELECT templateReg FROM TemplateReg templateReg WHERE templateReg.templateId = ?1 " +
        "AND templateReg.appUser.username = ?2 AND templateReg.status = ?3")
    public Optional<TemplateReg> findByTemplateIdAndUsernameAndStatus(Long templateId, String username, Long status);

    @Query(value = "SELECT templateReg FROM TemplateReg templateReg WHERE templateReg.templateId = ?1 " +
            "AND templateReg.appUser.username = ?2 AND templateReg.status != ?3")
    public Optional<TemplateReg> findByTemplateIdAndUsernameAndStatusNotIn(Long templateId, String username, Long status);

    @Query(value = "SELECT templateReg FROM TemplateReg templateReg WHERE " +
            "templateReg.appUser.username = ?1 AND templateReg.status != ?2")
    public List<TemplateReg> findAllByUsernameAndStatusNotIn(String username, Long status);

}
