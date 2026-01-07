package model;

public class Prescription {
    private String id;
    private String patientId;
    private String medication;
    private String dosage;

    public Prescription(String id, String patientId,
                        String medication, String dosage) {
        this.id = id;
        this.patientId = patientId;
        this.medication = medication;
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return id + "," + patientId + "," + medication + "," + dosage;
    }
}
