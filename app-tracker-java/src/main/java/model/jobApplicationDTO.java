package model;

import java.util.Date;

public class jobApplicationDTO {
    private Double applicationID;
    private String jobTitle;
    private String company;
    private Date applicationDate;
    private String contactPerson;
    private String email;
    private double contactPhone;
    private String applicationStatus;
    private String notes;

    public jobApplicationDTO() {
    }

    public jobApplicationDTO(Double applicationID, String jobTitle, String company, Date applicationDate, String contactPerson, String email, double contactPhone, String applicationStatus, String notes) {
        this.applicationID = applicationID;
        this.jobTitle = jobTitle;
        this.company = company;
        this.applicationDate = applicationDate;
        this.contactPerson = contactPerson;
        this.email = email;
        this.contactPhone = contactPhone;
        this.applicationStatus = applicationStatus;
        this.notes = notes;
    }

    public Double getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(Double applicationID) {
        this.applicationID = applicationID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(double contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
