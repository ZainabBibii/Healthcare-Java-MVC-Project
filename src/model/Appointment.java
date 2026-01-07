package model;

public class Appointment {
    private String appointmentId;
    private String patientId;
    private String clinicianId;
    private String date;
    private String reason;

    public Appointment(String appointmentId, String patientId,
                       String clinicianId, String date, String reason) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.clinicianId = clinicianId;
        this.date = date;
        this.reason = reason;
    }
}
