package JDBC;

import model.jobApplicationDTO;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;
import java.util.List;

public class JobApplicationDAO implements JobApplicationInterface{

    private final JdbcTemplate jdbcTemplate;

    public JobApplicationDAO(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<jobApplicationDTO> getAllApplications() {
        List<jobApplicationDTO> jobApplications = new ArrayList<>();

        String sql = "SELECT * FROM job_applications";

        try{
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

            while(results.next()){
              jobApplicationDTO jobApplicationsShown = mapRowToJobApplicationDTO(results);
              jobApplications.add(jobApplicationsShown);
            }
        }catch(CannotGetJdbcConnectionException e) {
            throw new RuntimeException("Custom error message");

        }
      return jobApplications;
    }


    private jobApplicationDTO mapRowToJobApplicationDTO(SqlRowSet rowset){
        jobApplicationDTO jobApplications = new jobApplicationDTO();

        jobApplications.setApplicationID(rowset.getDouble("application_id"));
        jobApplications.setJobTitle(rowset.getString("job_title"));
        jobApplications.setCompany(rowset.getString("company"));
        jobApplications.setApplicationDate(rowset.getDate("application_date"));
        jobApplications.setContactPerson(rowset.getString("contact_person"));
        jobApplications.setEmail(rowset.getString("contact_email"));
        jobApplications.setContactPhone(rowset.getDouble("contact_phone"));
        jobApplications.setApplicationStatus(rowset.getString("application_status"));
        jobApplications.setNotes(rowset.getString("notes"));

        return jobApplications;

    }
}
