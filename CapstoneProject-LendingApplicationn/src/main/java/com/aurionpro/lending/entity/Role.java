package com.aurionpro.lending.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Role {
	@Id
    private Long id;  // 1 = CUSTOMER, 2 = ADMIN, 3 = LOAN_OFFICER

    @Column(nullable = false, unique = true, length = 50)
    private String name;

    public static final Long CUSTOMER_ID = 1L;
    public static final Long ADMIN_ID = 2L;
    public static final Long LOAN_OFFICER_ID = 3L;
}
