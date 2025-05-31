package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.demo.Service.DonarService;
import com.demo.entity.Donar;
// controller layer: Handles HTTP requests/responses

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DonarController {
	@Autowired
	DonarService service;

	@RequestMapping("/donar")
	public String registrationPage() {
		return "DonarRegistration";
	}

	@RequestMapping("/registration")
	public String insertDonarData(Donar donar) {
		service.donarRegistrationdata(donar);
		return "registrationSuccess";
	}

	// Model is an interface provided by the Spring Framework that is used to pass
	// data from a controller to a view (tymleaf)
	@RequestMapping("/displaytable")
	public String showDonarsInTable(Model model) {
		List<Donar> donorList = service.getAllDonarDetails(); // get data from DB
		model.addAttribute("donorList", donorList); // add to model
		return "DonarTable"; // return template name
	}

	@RequestMapping("/getByName")
	public String getDonarByName(@RequestParam("donarname") String name, Model model) {
		List<Donar> donorList = service.findDonorByName(name);
		model.addAttribute("donorList", donorList);
		return "DonarTable";
	}

	@RequestMapping("/getByAddress")
	public String getDonarByAddress(@RequestParam("address") String address, Model model) {
		List<Donar> donarList = service.findDonarByAddress(address);
		model.addAttribute("donorList", donarList);
		return "DonarTable";
	}

//	/*Updation Operation*/
	@GetMapping("/update")
	public String showUpdateForm(@RequestParam("donaremail") String email, Model model) {
	    Donar donorList = service.getDonarByEmail(email); // 'donorList' contains one donor object
	    model.addAttribute("donorList", donorList);
	    return "UpdateDetails"; // Thymeleaf page to be displayed
	}
	
	@PostMapping(value = "/update")
	public String updateDonarDetails(Donar donar) {
	    service.updateDonarInfo(donar); // You must have this service method
	    return "redirect:/displaytable"; // Redirect to updated donor list
	}
	
	 @RequestMapping("/deleteuser")
	    public String deleteDonarDetailsByEmail(@RequestParam("email") String email) {
	        String result = service.deleteByEmail(email);
	        return "redirect:/displaytable";  // always redirect to the table view
	    }
	
}
