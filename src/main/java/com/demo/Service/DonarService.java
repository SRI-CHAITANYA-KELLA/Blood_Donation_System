package com.demo.Service;
//Service Layer: 	Contains business logic as well as we can do validations
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.DAO.DonarDAO;
import com.demo.Userexception.Exception;
import com.demo.entity.Donar;
@Service
public class DonarService{
	@Autowired
	DonarDAO dao;
	
	public Donar donarRegistrationdata(Donar donar) {
		
		List<Donar> DonarInfo = dao.selectAllDetails();
		Donar donar1 = new Donar();
		/*------------------Email VAlidation-----------------------*/
		int count=0;
		for (Donar donar2 : DonarInfo) {
		    if (donar2.getDonaremail().equalsIgnoreCase(donar.getDonaremail())) {
		        count++;
		    }
		}
		if(count>0) {
			throw new Exception("Email Already Existed");
		}
		
		donar.setDonaremail(donar.getDonaremail());
		return dao.insertDonarRegistrationData(donar);
	}
	
	public List<Donar> getAllDonarDetails() {
	    return dao.selectAllDetails();
	}
	
	public List<Donar> findDonorByName(String name) {
		return dao.getDonorByName(name);
	}
	
	public List<Donar> findDonarByAddress(String address) {
		return dao.getDonarByAddress(address);
	}
	
//	/*--------------------------------------------------------*/
	public Donar getDonarByEmail(String email) {
		// TODO Auto-generated method stub
		return dao.getDonarByDonaremail(email);
	}

	public void updateDonarInfo(Donar donar) {
		dao.updateDonarInfo(donar);
	}

//	}
	/*---------------------Delete-------------------------------*/

	public String deleteByEmail(String email) {
        return dao.deleteDonarByDonaremail(email);
    }
	
}
