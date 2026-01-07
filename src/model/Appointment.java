package model;

public class Appointment {
    private String id;
    private String patientId;
    private String clinicianId;
    private String date;
    private String reason;

    public Appointment(String id, String patientId, String clinicianId,
                       String date, String reason) {
        this.id = id;
        this.patientId = patientId;
        this.clinicianId = clinicianId;
        this.date = date;
        this.reason = reason;
    }

    public String getId() { return id; }
    public String getPatientId() { return patientId; }
    public String getClinicianId() { return clinicianId; }
    public String getDate() { return date; }
    public String getReason() { return reason; }

    @Override
    public String toString() {
        return id + "," + patientId + "," + clinicianId + "," + date + "," + reason;
    }
}
