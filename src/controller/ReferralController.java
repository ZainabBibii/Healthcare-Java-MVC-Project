package controller;

import model.ReferralManager;

public class ReferralController {

    private ReferralManager manager = ReferralManager.getInstance();

    public void submitReferral(String text) {
        manager.createReferral(text);
    }
}
