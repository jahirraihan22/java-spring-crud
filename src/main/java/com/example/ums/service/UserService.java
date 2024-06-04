package com.example.ums.service;

import com.example.ums.model.User;
import com.example.ums.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public Optional<User> findById(String id) {
        return repository.findById(id);
    }

    public User save(User user) {
        return repository.save(user);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
