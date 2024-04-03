package com.barco.model.repository;

import com.barco.model.pojo.Role;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;


/**
 * @author Nabeel Ahmed
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

	public Optional<Role> findRoleByName(String name);

	public Optional<Role> findByNameAndStatus(String name, APPLICATION_STATUS status);

	public Set<Role> findAllByNameInAndStatus(Set<String> names, APPLICATION_STATUS status);

	public static <T> Stream<T> asStream(Iterator<T> sourceIterator) {
		return asStream(sourceIterator, false);
	}

	public static <T> Stream<T> asStream(Iterator<T> sourceIterator, boolean parallel) {
		Iterable<T> iterable = () -> sourceIterator;
		return StreamSupport.stream(iterable.spliterator(), parallel);
	}
}
