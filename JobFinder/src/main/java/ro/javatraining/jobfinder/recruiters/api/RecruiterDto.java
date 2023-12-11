package ro.javatraining.jobfinder.recruiters.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RecruiterDto {

    private Long id;
    @NotBlank
    private String conmpanyName;
    @NotBlank
    private String contactInfo;


}
