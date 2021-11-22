package ru.ibs.happynes.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.happynes.entities.UserEntity;
import ru.ibs.happynes.repositories.UserRepository;
import ru.ibs.happynes.services.intefaces.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(String name, String role, String password) {
        UserEntity userEntity = new UserEntity(name, role, password);
        userRepository.save(userEntity);
    }

    @Override
    public UserEntity readUser(Long id) {
        return userRepository.findUserEntityById(id);
    }

    @Override
    public List<UserEntity> readAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateUser(Long id, String name, String role, String password) {
        UserEntity userEntity = userRepository.findUserEntityById(id);

        if (name != null)
            userEntity.setName(name);
        if (role != null)
            userEntity.setRole(role);
        if (password != null)
            userEntity.setPassword(password);
        userRepository.save(userEntity);
    }
}
