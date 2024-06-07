package com.example.organization_service.model;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Represents information about an organization.
 */
@Entity
@Data
public class Organization {

    @Id
    @GeneratedValue
    private UUID id;

    /**
     * Full name of the organization.
     */
    private String fullName;

    /**
     * Short name of the organization.
     */
    private String shortName;

    /**
     * Taxpayer Identification Number of the organization.
     */
    private String inn;

    /**
     * Primary State Registration Number of the organization.
     */
    private String ogrn;

    /**
     * Postal address of the organization.
     */
    private String postalAddress;

    /**
     * Legal address of the organization.
     */
    private String legalAddress;

    /**
     * Name of the director of the organization.
     */
    private String directorName;

    /**
     * Date of birth of the director of the organization.
     */
    private Date directorBirthDate;

    /**
     * List of branches associated with the organization.
     */
    @OneToMany(mappedBy = "organization")
    private List<Branch> branches;
}
