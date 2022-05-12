package com.technicalinterview.instagramclone.Service;

import com.technicalinterview.instagramclone.Entity.Users;
import com.technicalinterview.instagramclone.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Users submitMetaDataOfUser(Users user){
        return userRepo.save(user);
    }

    public Users displayUserMetaData(String userId){
        return userRepo.findByUserId(userId);
    }
}
