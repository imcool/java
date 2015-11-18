package Numbers;

public class mortgage {
    private double principal;
    private double rate;
    private int timePeriod;  // in months i.e. no of months



    public double getPrincipal() {
        return principal;
    }

    /**
     * if principal is negative than return zero
     * @param principal
     */
    private void setPrincipal(double principal) {
        if(principal >= 0)
            this.principal = principal;
        else
            this.principal =  0;  // can't be a negative
    }

    public double getRate() {
        return rate;
    }

    /**
     * If rate is less then zero than return zero
     * @param rate
     */
    private void setRate(double rate) {
        if(rate >= 0)
            this.rate = rate;
        else
            this.rate = 0;  // can't be a negative
    }


    public int getTimePeriod() {
        return timePeriod;
    }

    /**
     * if timePeriod of payment is negative than return 0
     * @param timePeriod
     */
    private void setTimePeriod(int timePeriod) {
        if(timePeriod > 0)
            this.timePeriod = timePeriod;
        else
            this.timePeriod = 0;
    }


    /**
     * Calculate mortgage per month
     * @return
     */
    public double calculateMortgage() {
        // M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]
        double temp = Math.pow( (1+rate), timePeriod);
        double x = temp* rate;
        double y = rate-1;
        return (this.principal * ( x ) ) / (y);
    }

    /**
     * constructor
     * @param principal
     * @param rate
     * @param timePeriod
     */
    public mortgage (double principal, double rate, int timePeriod) {
        this.setPrincipal(principal);
        setRate(rate);
        setTimePeriod(timePeriod);
    }

    /**
     * Pretty Print form
     */
    public void PrintPayment() {
        System.out.println("Principal           : " + getPrincipal());
        System.out.println("TimePeiod           : " + getTimePeriod());
        System.out.println("Rate                : " + getRate());
        System.out.println("Payement Per Month  : " + calculateMortgage());
    }
}

