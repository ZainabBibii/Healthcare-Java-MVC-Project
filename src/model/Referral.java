package model;

import java.util.ArrayList;
import java.util.List;

public class Referral {

    private static Referral instance;
    private List<String> referralQueue;

    private Referral() {
        referralQueue = new ArrayList<>();
    }

    public static Referral getInstance() {
        if (instance == null) {
            instance = new Referral();
        }
        return instance;
    }

    public void addReferral(String referral) {
        referralQueue.add(referral);
    }

    public List<String> getReferrals() {
        return referralQueue;
    }
}
