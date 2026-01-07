package controller;

import model.Patient;
import util.CSVReader;
import util.CSVWriter;

import java.util.ArrayList;
import java.util.List;

public class PatientController {

    private static final String FILE = "data/patients.csv";

    public List<Patient> loadPatients() {
        List<Patient> list = new ArrayList<>();
        for (String[] r : CSVReader.read(FILE)) {
            list.add(new Patient(r[0], r[1], r[2], r[3]));
        }
        return list;
    }

    public void addPatient(Patient p) {
        CSVWriter.append(FILE, p.toString());
    }
}
