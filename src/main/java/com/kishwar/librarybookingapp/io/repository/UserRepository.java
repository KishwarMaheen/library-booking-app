package com.kishwar.librarybookingapp.io.repository;

import com.kishwar.librarybookingapp.ui.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
    public UserModel getUserModelByUsername(String username);
}
