package ru.itis.tuhocspringboot.securiry.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.itis.tuhocspringboot.models.User;
import ru.itis.tuhocspringboot.repositories.UsersRepository;

@Component(value = "customUserDetailsService")
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = usersRepository.findByEmail(email);
        if (user != null) {
            return new UserDetailsImpl(user);
        } else throw new UsernameNotFoundException("User not found");
    }
}
