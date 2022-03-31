package com.example.SpringBoot.Service;


import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SpringBoot.Repository.AcademyRepository;
import com.example.SpringBoot.model.Academy;

@Service
public class AcademyService {
	
	@Autowired
	private AcademyRepository repo;

	public Academy addAcademyDetails(Academy a) {
		// TODO Auto-generated method stub
		return repo.save(a);
	}

	public List<Academy> viewAcademyDetails() {
		// TODO Auto-generated method stub
		List<Academy> academy=new ArrayList<>();
		repo.findAll().forEach(a->academy.add(a));
		return academy;
	}

	public Academy getAcademyById(int instituteid) {
		// TODO Auto-generated method stub
		return repo.findById(instituteid).get();
	}

	public Academy updateAcademyDetails(int instituteid, Academy a) {
		// TODO Auto-generated method stub
		Academy prevValue=new Academy();
		prevValue=repo.findById(instituteid).get();
		prevValue.setInstitutename(a.getInstitutename());
		prevValue.setInstitutedescription(a.getInstitutedescription());
		prevValue.setInstituteaddress(a.getInstituteaddress());
		prevValue.setEmail(a.getEmail());
		prevValue.setMobile(a.getMobile());
		return repo.save(prevValue);
	}

	@Transactional
	public String deleteAcademyDetails(int instituteid) {
		// TODO Auto-generated method stub
		repo.deleteById(instituteid);
		return "Deleted Sucessfully";
	}

	public Academy getAcademyByName(String institutename) {
		// TODO Auto-generated method stub
		return repo.findByinstitutename(institutename);
	}
	
	/*@Override
	public List<Academy> viewAcademyDetails() {
		// TODO Auto-generated method stub
		List<Academy> academy=new ArrayList<>();
		repo.findAll().forEach(a->academy.add(a));
		return academy;
	}*/
}
