package com.example.SpringBoot.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.Repository.AcademyRepository;
import com.example.SpringBoot.Service.AcademyService;
import com.example.SpringBoot.model.Academy;

@RestController
@RequestMapping("/academy")
@CrossOrigin("*")
public class AcademyController {

	@Autowired
	private AcademyService service;
	
	@PostMapping("/addAcademy")
	public Academy addAcademy(@RequestBody Academy a) {
		return service.addAcademyDetails(a);
	}
	
	@GetMapping("/viewAcademy")
	public List<Academy> viewAcademy() {
		return service.viewAcademyDetails();
	}
	
	@GetMapping("/viewAcademyId")
	public Academy getAcademyByIdDetails(@RequestParam("instituteid")int instituteid) {
		return service.getAcademyById(instituteid);
	}
	
	@GetMapping("/viewAcademyName")
	public Academy getAcademyDetails(@RequestParam("institutename") String institutename) {
		return service.getAcademyByName(institutename);
	}
	
	@PutMapping("/updateAcademy")
	public Academy updateAcademy(@RequestParam("instituteid") int instituteid,@RequestBody Academy a) {
		return service.updateAcademyDetails(instituteid,a);
	}
	
	@DeleteMapping("/deleteAcademy")
	public String deleteAcademy(@RequestParam("instituteid") int instituteid) {
		return service.deleteAcademyDetails(instituteid);
	}
	
	/*@GetMapping("/viewAcademyImg")
	public List<Academy> viewAcademyImage() {
		return service.viewAcademyDetails();
	}*/
}
