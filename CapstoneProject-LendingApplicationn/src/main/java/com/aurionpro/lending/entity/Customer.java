package com.aurionpro.lending.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Customer extends User{
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kyc_id")
    private KYCInfo kyc;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<LoanApplication> applications;

}
