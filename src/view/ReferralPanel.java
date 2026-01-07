package view;

import controller.ReferralController;

import javax.swing.*;
import java.awt.*;

public class ReferralPanel extends JPanel {

    public ReferralPanel() {
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        JButton submit = new JButton("Create Referral");

        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(submit, BorderLayout.SOUTH);

        submit.addActionListener(e -> {
            new ReferralController().submitReferral(textArea.getText());
            JOptionPane.showMessageDialog(this, "Referral saved");
            textArea.setText("");
        });
    }
}
