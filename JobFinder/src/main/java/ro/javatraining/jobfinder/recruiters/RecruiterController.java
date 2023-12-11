package ro.javatraining.jobfinder.recruiters;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.javatraining.jobfinder.recruiters.api.RecruiterDto;
import ro.javatraining.jobfinder.recruiters.api.RecruiterManagement;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("recruiters")
public class RecruiterController {
    private final RecruiterManagement recruiterManagement;

    @GetMapping("/{id}")
    public RecruiterDto get(@NotNull@PathVariable final Long id){
        return recruiterManagement.get(id);
    }

    @GetMapping("")
    public Collection<RecruiterDto> listAll(){
        return recruiterManagement.getAll();
    }

    @PostMapping("")
    public Long create (@Valid @RequestBody final RecruiterDto recruiterDto){
        return recruiterManagement.create(recruiterDto);
    }

    @PutMapping("/{id}")
    public void update(@NotNull@PathVariable final Long id,@Valid@RequestBody final RecruiterDto recruiterDto){
        recruiterManagement.update(id,recruiterDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@NotNull@PathVariable final Long id){
        recruiterManagement.delete(id);
    }

}
