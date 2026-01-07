package controller;

import model.Prescription;
import util.CSVWriter;

public class PrescriptionController {

    public void addPrescription(Prescription p) {
        CSVWriter.append("data/prescriptions.csv", p.toString());
    }
}
