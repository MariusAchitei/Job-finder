package ro.javatraining.jobfinder.users;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ro.javatraining.jobfinder.users.api.RegisterUserDto;
import ro.javatraining.jobfinder.users.api.UserDto;
import ro.javatraining.jobfinder.users.api.UserManagement;

import java.util.Collection;
import java.util.Optional;

@Service
//@RequiredArgsConstructor
//@NoArgsConstructor
public class UserManagementImpl implements UserManagement, UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    @Autowired
    private final ModelMapper modelMapper = new ModelMapper();



    @Override
    public Long registerUser(RegisterUserDto dto) {
        User user = modelMapper.map(dto, User.class);
        user.setPasswordHash(bCryptPasswordEncoder.encode(dto.getPassword()));

        User savedUser = userRepository.save(user);
        return savedUser.getId();
    }

    @Override
    public UserDto get(Long id) {
        return userRepository.findById(id)
                .map(user -> modelMapper.map(user, UserDto.class))
                .orElse(null);
    }

    @Override
    public Collection<UserDto> getAll() {
        return userRepository.findAll().stream()
                .map(user -> modelMapper.map(user, UserDto.class))
                .toList();
    }

    @Override
    public void update(Long id, UserDto dto) {
        userRepository.findById(id).ifPresent(user -> {
            modelMapper.map(dto, user);
            userRepository.save(user);
        });
    }

    @Override
    public void resetPassword(Long id, String newPassword) {
        userRepository.findById(id).ifPresent(user -> {
            user.setPasswordHash(bCryptPasswordEncoder.encode(newPassword));
            userRepository.save(user);
        });
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void getByUsername(String username) {
        Optional<User> user = userRepository.findByUsername(username);

        user
            .map(u -> modelMapper.map(u, UserDto.class))
            .orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
    }

    @Override
    public UserDetails getUserDetailsByUsername(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        return user
            .map(u -> new UserInfoDetails(u))
            .orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        return user
                .map(u -> new UserInfoDetails(u))
                .orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
    }
}
