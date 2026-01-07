package controller;

import model.Appointment;
import util.CSVReader;
import util.CSVWriter;

import java.util.ArrayList;
import java.util.List;

public class AppointmentController {

    private static final String FILE = "data/appointments.csv";

    public List<Appointment> loadAppointments() {
        List<Appointment> list = new ArrayList<>();
        for (String[] r : CSVReader.read(FILE)) {
            list.add(new Appointment(r[0], r[1], r[2], r[3], r[4]));
        }
        return list;
    }

    public void addAppointment(Appointment a) {
        CSVWriter.append(FILE, a.toString());
    }
}
