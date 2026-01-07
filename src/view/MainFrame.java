package view;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Healthcare Management System");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Patients", new PatientPanel());
        tabs.add("Appointments", new AppointmentPanel());
        tabs.add("Prescriptions", new PrescriptionPanel());
        tabs.add("Referrals", new ReferralPanel());

        add(tabs);
    }
}
