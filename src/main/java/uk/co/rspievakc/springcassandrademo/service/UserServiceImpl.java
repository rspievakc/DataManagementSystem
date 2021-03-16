package uk.co.rspievakc.springcassandrademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.rspievakc.springcassandrademo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(
            @Autowired
            UserRepository repository) {
        this.repository = repository;
    }
}
