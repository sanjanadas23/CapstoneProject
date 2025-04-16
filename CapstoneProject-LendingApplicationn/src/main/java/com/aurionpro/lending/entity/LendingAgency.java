package com.aurionpro.lending.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LendingAgency {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lendingid;

    @Column(nullable = false, unique = true)
    private String lendingName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AgencyType type;

}
