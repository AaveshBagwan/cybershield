package dev.group.cybershield.login.service;

import dev.group.cybershield.entity.UsersEntity;
import dev.group.cybershield.login.model.UserDTO;
import dev.group.cybershield.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UsersRepo userRepo;

    public Boolean verifyUser(UserDTO reqBody){
        UsersEntity user= userRepo.findByEmail(reqBody.getEmail());
        if(user!=null){
            if(user.getPassword()!=null&&user.getPassword().equalsIgnoreCase(reqBody.getPassword())){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
