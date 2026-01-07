package model;

import util.CSVWriter;

public class ReferralManager {

    private static ReferralManager instance;
    private Referral referral;

    private ReferralManager() {
        referral = Referral.getInstance();
    }

    public static ReferralManager getInstance() {
        if (instance == null) {
            instance = new ReferralManager();
        }
        return instance;
    }

    public void createReferral(String text) {
        referral.addReferral(text);
        CSVWriter.append("data/referrals.csv", text);
    }
}
