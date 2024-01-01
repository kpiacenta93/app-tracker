package controller;

import JDBC.JobApplicationDAO;
import model.jobApplicationDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobApplicationController {

    private jobApplicationDTO jobApplicationDTO;
    private JobApplicationDAO jobApplicationDAO;


    public JobApplicationController(jobApplicationDTO jobApplicationDTO, JobApplicationDAO jobApplicationDAO){
       this.jobApplicationDTO = jobApplicationDTO;
       this.jobApplicationDAO = jobApplicationDAO;
    }


    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/test", method = RequestMethod.POST)
    public void test(){
        System.out.println("Controller is working");;
    }

    @GetMapping("/")
    public String home() {
        // Return the name of a view (e.g., "index.html") or redirect to another URL.
        return "index";
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/applications", method = RequestMethod.GET)
    public List<jobApplicationDTO> getAllApplications(){
        return jobApplicationDAO.getAllApplications();
    }
}
