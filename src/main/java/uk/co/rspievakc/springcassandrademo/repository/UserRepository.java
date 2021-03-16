package uk.co.rspievakc.springcassandrademo.repository;

import org.springframework.data.cassandra.core.mapping.MapId;
import org.springframework.data.cassandra.repository.CassandraRepository;
import uk.co.rspievakc.springcassandrademo.domain.User;

public interface UserRepository extends CassandraRepository<User, MapId> {
}
