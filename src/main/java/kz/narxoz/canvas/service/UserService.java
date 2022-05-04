package kz.narxoz.canvas.service;

import kz.narxoz.canvas.model.Role;
import kz.narxoz.canvas.model.User;
import kz.narxoz.canvas.repository.RoleRepository;
import kz.narxoz.canvas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(List.of(roleRepository.getById(1L))));
        userRepository.save(user);
    }
}