package ro.javatraining.jobfinder.user;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ro.javatraining.jobfinder.user.api.RegisterUserDto;
import ro.javatraining.jobfinder.user.api.UserDto;
import ro.javatraining.jobfinder.user.api.UserManagement;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class UserManagementImpl implements UserManagement {
    private final UserRepository userRepository;
//    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    private final ModelMapper modelMapper = new ModelMapper();



    @Override
    public Long registerUser(RegisterUserDto dto) {
        User user = modelMapper.map(dto, User.class);
        user.setPasswordHash(dto.getPassword());

        User savedUser = userRepository.save(user);
        return savedUser.getId();
    }

    @Override
    public UserDto get(Long id) {
        return userRepository.findById(id)
                .map(user -> modelMapper.map(user, UserDto.class))
                .orElseThrow(() -> new RuntimeException("User not found"));
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
            user.setPasswordHash(newPassword);
            userRepository.save(user);
        });
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
