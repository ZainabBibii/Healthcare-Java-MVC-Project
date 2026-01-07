package view;

import controller.PatientController;
import model.Patient;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PatientPanel extends JPanel {

    public PatientPanel() {
        setLayout(new BorderLayout());

        PatientController controller = new PatientController();
        List<Patient> patients = controller.loadPatients();

        DefaultListModel<String> model = new DefaultListModel<>();
        for (Patient p : patients) {
            model.addElement(p.getName() + " (" + p.getNhsNumber() + ")");
        }

        add(new JScrollPane(new JList<>(model)), BorderLayout.CENTER);
    }
}
