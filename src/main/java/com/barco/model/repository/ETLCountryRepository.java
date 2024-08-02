package com.barco.model.repository;

import com.barco.model.pojo.ETLCountry;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface ETLCountryRepository extends CrudRepository<ETLCountry, Long> {

    public Optional<ETLCountry> findByCountryName(String countryName);

    public Optional<ETLCountry> findByCountryCode(String countryCode);

}