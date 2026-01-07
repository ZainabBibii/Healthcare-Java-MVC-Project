package view;

import controller.AppointmentController;
import model.Appointment;

import javax.swing.*;
import java.awt.*;
import java.util.UUID;

public class AppointmentPanel extends JPanel {

    public AppointmentPanel() {
        setLayout(new BorderLayout());

        JTextField patientId = new JTextField();
        JTextField clinicianId = new JTextField();
        JTextField date = new JTextField();
        JTextField reason = new JTextField();

        JButton add = new JButton("Add Appointment");

        JPanel form = new JPanel(new GridLayout(5,2));
        form.add(new JLabel("Patient ID"));
        form.add(patientId);
        form.add(new JLabel("Clinician ID"));
        form.add(clinicianId);
        form.add(new JLabel("Date"));
        form.add(date);
        form.add(new JLabel("Reason"));
        form.add(reason);
        form.add(add);

        add(form, BorderLayout.NORTH);

        add.addActionListener(e -> {
            Appointment a = new Appointment(
                    UUID.randomUUID().toString(),
                    patientId.getText(),
                    clinicianId.getText(),
                    date.getText(),
                    reason.getText()
            );
            new AppointmentController().addAppointment(a);
            JOptionPane.showMessageDialog(this, "Appointment saved");
        });
    }
}
