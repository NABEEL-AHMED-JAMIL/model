package com.barco.model.repository;

import com.barco.model.pojo.RefreshToken;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AppTokenRepository extends CrudRepository<RefreshToken, Long> {

    public List<RefreshToken> findAllByUuidInAndStatusNot(List<String> uuids, APPLICATION_STATUS status);

    public Optional<RefreshToken> findByTokenAndStatus(String token, APPLICATION_STATUS status);

    public List<RefreshToken> findByDateCreatedBetweenOrderByDateCreatedDesc(Date startDate, Date endDate);

}
