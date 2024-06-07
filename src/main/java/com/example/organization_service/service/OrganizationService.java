package com.example.organization_service.service;

import com.example.organization_service.model.Organization;
import com.example.organization_service.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Service class for managing organizations.
 */
@Service
@RequiredArgsConstructor
public class OrganizationService {

    private final OrganizationRepository organizationRepository;

    /**
     * Retrieves all organizations from the database.
     * @return List of organizations
     */
    public List<Organization> getAllOrganizations() {
        return organizationRepository.findAll();
    }

    /**
     * Searches for organizations based on the given search string.
     * @param search The search string
     * @return List of organizations matching the search criteria
     */
    public List<Organization> searchOrganizations(String search) {
        return organizationRepository.findByFullNameContainingOrShortNameContaining(search, search);
    }

    /**
     * Retrieves an organization by its unique identifier.
     * @param id The unique identifier of the organization
     * @return The organization, or null if not found
     */
    public Organization getOrganizationById(UUID id) {
        return organizationRepository.findById(id).orElse(null);
    }
}

