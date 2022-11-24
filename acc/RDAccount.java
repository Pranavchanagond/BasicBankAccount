package com.pranav.Bank.acc;
import static java.lang.Math.pow;

public class RDAccount extends Account {


    public RDAccount(int tenure,float principal) {
        this.tenure=tenure;
        this.principal=principal;
    }

    @Override
    public float calculateAmountDeposited() {
        return tenure * principal * 12;
    }

    @Override
    public float calculateInterest() {
        float p= principal;
        float r= rateOfInterest/100;
        float n = 4;
        float t = 60/12;

        float m = (1+r/n);
        float k = (float) pow (m,(n * t));
                k=k-1;
        return (float) (p * k);
    }
}
