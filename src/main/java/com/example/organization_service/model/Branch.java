package com.example.organization_service.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

/**
 * Represents information about a branch of an organization.
 */
@Entity
@Data
public class Branch {

    @Id
    @GeneratedValue
    private UUID id;

    /**
     * The organization to which this branch belongs.
     */
    @ManyToOne
    private Organization organization;

    /**
     * Name of the branch.
     */
    private String name;

    /**
     * Postal address of the branch.
     */
    private String postalAddress;

    /**
     * Name of the head of the branch.
     */
    private String headName;

    /**
     * Date of birth of the head of the branch.
     */
    private Date headBirthDate;
}
