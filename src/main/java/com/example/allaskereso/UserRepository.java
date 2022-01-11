package com.example.allaskereso;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<user, Integer> {
}
