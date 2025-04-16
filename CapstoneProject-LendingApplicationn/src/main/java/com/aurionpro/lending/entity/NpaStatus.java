package com.aurionpro.lending.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "npa_statuses")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NpaStatus {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank(message = "Status name is required")
	@Column(name = "status_name", unique = true, nullable = false)
	private String statusName;
}