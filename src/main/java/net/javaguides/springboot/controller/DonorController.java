package net.javaguides.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Donor;
import net.javaguides.springboot.repository.DonorRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class DonorController {

	@Autowired
	private DonorRepository donorRepository;
	
	// get all employees
	@GetMapping("/employees")
	public List<Donor> getAllDonor(){
		return donorRepository.findAll();
	}		
	
	// create employee rest api
	@PostMapping("/employees")
	public Donor createDonor(@RequestBody Donor donor) {
		return  donorRepository.save(donor);
	}
	
	// get employee by id rest api
	@GetMapping("/employees/{id}")
	public ResponseEntity<Donor> getDonorId(@PathVariable Long id) {
		Donor donor = donorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return ResponseEntity.ok(donor);
	}
	
	// update employee rest api
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Donor> updateEmployee(@PathVariable Long id, @RequestBody Donor donorDetails){
		Donor donor = donorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		donor.setFirstName(donorDetails.getFirstName());
		donor.setLastName(donorDetails.getLastName());
		donor.setEmailId(donorDetails.getEmailId());
		
		Donor updatedDonor = donorRepository.save(donor);
		return ResponseEntity.ok(updatedDonor);
	}
	
	// delete employee rest api
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteDonor(@PathVariable Long id){
		Donor donor = donorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		donorRepository.delete(donor);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
}
