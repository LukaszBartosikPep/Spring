package eu.pepco.lbartosik.Spring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<Users, Long> {
}