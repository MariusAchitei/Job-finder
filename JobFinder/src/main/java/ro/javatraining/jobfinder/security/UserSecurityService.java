package ro.javatraining.jobfinder.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ro.javatraining.jobfinder.user.User;
import ro.javatraining.jobfinder.user.UserRepository;

import java.util.Optional;

@Service
public class UserSecurityService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        username= "marius";
        Optional<User> userDetail = userRepository.findByUsername(username);

        // Converting userDetail to UserDetails
        return userDetail.map(UserInfoDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found mihai"));
    }
}
