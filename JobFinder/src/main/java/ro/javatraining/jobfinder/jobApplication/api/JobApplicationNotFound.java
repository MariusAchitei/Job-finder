package ro.javatraining.jobfinder.jobApplication.api;

public class JobApplicationNotFound extends Exception {
    public JobApplicationNotFound(final long id) {
        super("Job application not found for id:" + id);
    }
}
