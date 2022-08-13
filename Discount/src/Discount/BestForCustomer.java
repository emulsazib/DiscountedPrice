package Discount;

public class BestForCustomer implements Discounteble{
    private double percentage;
    private double threshold;
    private double discount;

    public BestForCustomer(double percentage, double threshold, double discount) {
        this.percentage = percentage;
        this.threshold = threshold;
        this.discount = discount;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double duscountedPrice(double price) {
        return price-((this.threshold/this.percentage)*this.threshold*(this.discount/100));
    }
}
