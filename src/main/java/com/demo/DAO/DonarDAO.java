package com.demo.DAO;
//DAO (Data Access Object) : Interacts with the database
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repository.DonarRepository;
import com.demo.entity.Donar;

@Service
public class DonarDAO {
	@Autowired
	DonarRepository repo;
	
	public Donar insertDonarRegistrationData(Donar donar) {
		return repo.save(donar);
	}
	
	public List<Donar> selectAllDetails() {
		return repo.findAll(); 
	}
	
	public List<Donar> getDonorByName(String name) {
		//here we must give the name in the "Donar" in the userDefined method
		//i.e.,findByDonarname ==> "Donarname"->"donarname"
		return repo.findByDonarname(name);
	}
	public List<Donar> getDonarByAddress(String address){
		return repo.findByAddress(address);
	}

	/*------------------------------------------------*/
	public Donar getDonarByDonaremail(String email) {
		// TODO Auto-generated method stub
		return repo.findByDonaremail(email);
	}

	public void updateDonarInfo(Donar donar) {
		repo.save(donar);
	}


	/*------------------------------------------------*/
	
	public String deleteDonarByDonaremail(String email) {
        Donar existingDonar = repo.findByDonaremail(email);
        if (existingDonar != null) {
            repo.delete(existingDonar);
            return "Donor deleted successfully.";
        } else {
            return "Donor not found.";
        }
    }
}
