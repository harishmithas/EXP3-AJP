package rest.example.demo3.Repo;

import org.springframework.data.repository.CrudRepository;

import rest.example.demo3.Model.User;

public interface UserRepo extends CrudRepository<User,Long> {
    
}
