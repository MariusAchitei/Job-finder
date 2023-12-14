package ro.javatraining.jobfinder.recruiter;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ro.javatraining.jobfinder.recruiter.api.RecruiterDto;
import ro.javatraining.jobfinder.recruiter.api.RecruiterManagement;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class RecruiterManagementImpl implements RecruiterManagement {

    private RecruiterRepository recruiterRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public Long create(RecruiterDto recruiterDto) {
        Recruiter newRecruiter = modelMapper.map(recruiterDto,Recruiter.class);
        return recruiterRepository.save(newRecruiter).getId();
    }
    @Override
    public Collection<RecruiterDto> getAll() {
        return recruiterRepository.findAll().stream().map(recruiter -> modelMapper.map(recruiter,RecruiterDto.class)).toList();
    }

    @Override
    public RecruiterDto get(Long id) {
        return  recruiterRepository.findById(id).map(recruiter -> modelMapper.map(recruiter,RecruiterDto.class)).orElse(null);
    }

    @Override
    public void update(Long id, RecruiterDto recruiterDto) {
        recruiterRepository.findById(id).ifPresent(recruiter -> {
            modelMapper.map(recruiterDto,recruiter);
            recruiterRepository.save(recruiter);
        } );
    }

    @Override
    public void delete(Long id) {
        recruiterRepository.deleteById(id);
    }
}
