package view;

import controller.PrescriptionController;
import model.Prescription;

import javax.swing.*;
import java.awt.*;
import java.util.UUID;

public class PrescriptionPanel extends JPanel {

    public PrescriptionPanel() {
        setLayout(new GridLayout(5,2));

        JTextField patientId = new JTextField();
        JTextField medication = new JTextField();
        JTextField dosage = new JTextField();
        JButton save = new JButton("Create Prescription");

        add(new JLabel("Patient ID"));
        add(patientId);
        add(new JLabel("Medication"));
        add(medication);
        add(new JLabel("Dosage"));
        add(dosage);
        add(save);

        save.addActionListener(e -> {
            Prescription p = new Prescription(
                    UUID.randomUUID().toString(),
                    patientId.getText(),
                    medication.getText(),
                    dosage.getText()
            );
            new PrescriptionController().addPrescription(p);
            JOptionPane.showMessageDialog(this, "Prescription saved");
        });
    }
}
