package entities;

public enum LoyaltyCard {

    STANDARDCARD(true, false, 0.0),
    PREMIUMCARD(true, true, 0.05),
    GOLDCARD(true, true, 0.1);
    final private boolean pointCollection;
    final private boolean discount;
    final private double discountValuePercent;

    LoyaltyCard(boolean pointCollection, boolean discount, double discountValuePercent) {
        this.pointCollection = pointCollection;
        this.discountValuePercent = discountValuePercent;
        this.discount = discount;
    }

}
