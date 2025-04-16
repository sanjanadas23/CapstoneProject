package com.aurionpro.lending.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class KYCInfo {
	@Column
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Kycid;

    @Column(nullable = false, length = 12)
    private String aadharNumber;

    @Column(nullable = false, length = 10)
    private String panNumber;

    @Column(nullable = false)
    private String address;

    @ElementCollection
    private List<String> documentUrls;

    @Column(nullable = false)
    private Boolean isVerified = false;

}
