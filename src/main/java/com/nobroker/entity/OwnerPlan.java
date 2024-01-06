package com.nobroker.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="owner_plans")
    public class OwnerPlan {
    @Id
    private long planId;
    @Column(name = "plan_name",unique = true)
    private String planName;
    @Column(name = "price")
    private double price;
    @Column(name = "plan_validity")
    private int planValidity;
    @Column(name = "relationship_manager")
    private boolean relationshipManager;
    @Column(name = "rental_agreement")
    private boolean rentalAgreement;
    @Column(name="propert_promotion")
    private boolean propertyPromotion;
    @Column(name="guranteed_tenants")
    private boolean guranteedTenants;
    @Column(name = "showing_property")
    private boolean showingProperty;
    @Column(name = "facebook_marketting_of_property")
    private boolean facebookMarkettingOfProperty;
}
