package ua.andrey.repository;

/**
 * Created by Andry on 30.06.2017.
 */


import ua.andrey.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

}