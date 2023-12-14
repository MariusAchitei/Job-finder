package ro.javatraining.jobfinder.jobCategory.api;

public class JobCategoryNotFound extends Exception {
    public JobCategoryNotFound(final long id) {
        super("Job category not found for id:" + id);
    }
}
