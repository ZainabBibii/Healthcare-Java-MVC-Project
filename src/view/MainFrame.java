package view;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Healthcare Management System");
        setSize(900, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Patients", new PatientPanel());
        tabs.add("Referrals", new ReferralPanel());

        add(tabs);
    }
}
