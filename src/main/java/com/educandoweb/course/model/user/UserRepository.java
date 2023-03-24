package com.educandoweb.course.model.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity getUserEntityById(Long id);
}
