package ro.javatraining.jobfinder.jobCategory.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JobCategoryDto {
    private long id;
    private String name;
    private String description;
}
