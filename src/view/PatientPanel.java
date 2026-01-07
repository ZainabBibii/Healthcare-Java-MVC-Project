package view;

import controller.PatientController;
import model.Patient;

import javax.swing.*;
import java.awt.*;
import java.util.UUID;

public class PatientPanel extends JPanel {

    public PatientPanel() {
        setLayout(new BorderLayout());

        JTextField name = new JTextField();
        JTextField dob = new JTextField();
        JTextField address = new JTextField();
        JButton add = new JButton("Add Patient");

        JPanel form = new JPanel(new GridLayout(4,2));
        form.add(new JLabel("Name"));
        form.add(name);
        form.add(new JLabel("DOB"));
        form.add(dob);
        form.add(new JLabel("Address"));
        form.add(address);
        form.add(add);

        add(form, BorderLayout.NORTH);

        add.addActionListener(e -> {
            Patient p = new Patient(
                    UUID.randomUUID().toString(),
                    name.getText(),
                    dob.getText(),
                    address.getText()
            );
            new PatientController().addPatient(p);
            JOptionPane.showMessageDialog(this, "Patient added");
        });
    }
}
