package khangna.strategy.strategies;

import khangna.strategy.PaymentStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByOnePay implements PaymentStrategy {

    private static final Map<String, String> DATA_BASE = new HashMap<>();

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private String ccv;
    private boolean verifiedCCV;

    static {
        DATA_BASE.put("ccv", "111");
    }


    @Override
    public boolean pay(int paymentAmount) {
        if (verifiedCCV) {
            System.out.println("Paying " + paymentAmount + " using OnePay.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!verifiedCCV) {
                System.out.println("Enter CCV: ");
                ccv = READER.readLine();

                if (verify()) {
                    System.out.println("Code is valid");
                } else {
                    System.out.println("Wrong");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean verify() {
        setVerifiedCCV(ccv.equals(DATA_BASE.get("ccv")));
        return verifiedCCV;
    }

    private void setVerifiedCCV(boolean verifyCCV) {
        this.verifiedCCV = verifyCCV;
    }
}
