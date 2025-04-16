
package com.aurionpro.lending.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "loan_officer")
public class LoanOfficer {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull(message = "User is required")
	@OneToOne
	@JoinColumn(name = "user_id", nullable = false, unique = true)
	private User user;

	@NotNull(message = "Admin is required")
	@ManyToOne
	@JoinColumn(name = "admin_id", nullable = false)
	private Admin admin;

	@OneToMany(mappedBy = "loanOfficer", cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.LAZY)
	private List<Customer> customers = new ArrayList<>();
}