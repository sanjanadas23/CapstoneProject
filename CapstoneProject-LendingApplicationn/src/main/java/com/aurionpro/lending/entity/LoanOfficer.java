package com.aurionpro.lending.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class LoanOfficer extends User{
	@ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @OneToMany(mappedBy = "loanOfficer", cascade = CascadeType.ALL)
    private List<LoanApplication> handledApplications;

}
