package controller;

import model.Patient;
import util.CSVReader;

import java.util.ArrayList;
import java.util.List;

public class PatientController {

    public List<Patient> loadPatients() {
        List<Patient> patients = new ArrayList<>();

        for (String[] row : CSVReader.read("data/patients.csv")) {
            patients.add(new Patient(
                    row[0], row[1], row[2], row[3]
            ));
        }
        return patients;
    }
}
