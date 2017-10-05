package com.community.core.customer;

import org.broadleafcommerce.profile.core.domain.Customer;

public interface HCCustomer extends Customer {

    Integer getAverageHeatRatingBought();

    Integer getNumSaucesBought();

    void setNumSaucesBought(Integer numSaucesBought);

    Integer getTotalHeatRating();

    void setTotalHeatRating(Integer totalHeatRating);
}
