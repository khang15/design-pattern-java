package khangna.strategy.strategies;

import khangna.strategy.PaymentStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByVNPay implements PaymentStrategy {

    private static final Map<String, String> DATA_BASE = new HashMap<>();

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private String code;
    private boolean verifiedCode;

    static {
        DATA_BASE.put("code", "150597");
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (verifiedCode) {
            System.out.println("Paying " + paymentAmount + " using VNPay.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!verifiedCode) {
                System.out.println("Enter code: ");
                code = READER.readLine();

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

    public boolean verify() {
        setVerifiedCode(code.equals(DATA_BASE.get("code")));
        return verifiedCode;
    }

    public void setVerifiedCode(boolean verifiedCode) {
        this.verifiedCode = verifiedCode;
    }
}
