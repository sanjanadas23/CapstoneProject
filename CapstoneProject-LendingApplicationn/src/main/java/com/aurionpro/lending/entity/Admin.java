package com.aurionpro.lending.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Admin extends User{
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "agency_id")
    private LendingAgency agency;

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    private List<LoanOfficer> officers;

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    private List<LoanScheme> schemes;
}
