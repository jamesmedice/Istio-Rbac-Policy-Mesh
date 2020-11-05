package com.medici.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.medici.model.Enterprise;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "enterprises", path = "enterprises")
public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {

}
