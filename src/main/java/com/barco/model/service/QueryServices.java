package com.barco.model.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@Scope("prototype")
public class QueryServices {

    public Logger logger = LogManager.getLogger(QueryServices.class);

    @Autowired
    private EntityManager entityManager;

    public List<Object[]> executeQuery(String queryStr){
        logger.info("Execute Query :- " + queryStr);
        Query query = this.entityManager.createNativeQuery(queryStr);
        return query.getResultList();
    }


}
