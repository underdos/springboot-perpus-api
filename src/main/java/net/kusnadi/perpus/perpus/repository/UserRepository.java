package net.kusnadi.perpus.perpus.repository;

import net.kusnadi.perpus.perpus.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
