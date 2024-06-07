package com.example.organization_service.repository;

import com.example.organization_service.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * Repository interface for managing organizations.
 */
@Repository
public interface OrganizationRepository extends JpaRepository<Organization, UUID> {

    /**
     * Searches for organizations by full name or short name containing the given search string.
     * @param fullName The full name search string
     * @param shortName The short name search string
     * @return List of organizations matching the search criteria
     */
    List<Organization> findByFullNameContainingOrShortNameContaining(String fullName, String shortName);
}

