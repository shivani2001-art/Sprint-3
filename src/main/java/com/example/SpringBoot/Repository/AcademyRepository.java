package com.example.SpringBoot.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBoot.model.Academy;

@Repository
public interface AcademyRepository extends CrudRepository<Academy,Integer>{

	Academy findByinstitutename(String institutename);

}
