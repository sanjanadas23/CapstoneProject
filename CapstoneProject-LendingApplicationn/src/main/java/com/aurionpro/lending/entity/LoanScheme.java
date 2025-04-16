package com.aurionpro.lending.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class LoanScheme {
	@Column
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schemaid;

    @Column(nullable = false)
    private String schemeName;

    @Column(nullable = false)
    private Double interestRate;

    @Column(nullable = false)
    private Integer durationMonths;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SchemaType type;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

}
