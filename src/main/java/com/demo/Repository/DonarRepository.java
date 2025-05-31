package com.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Donar;
@Repository
public interface DonarRepository extends JpaRepository<Donar, Integer>{
	
	List<Donar> findByDonarname(String name);
	List<Donar> findByAddress(String address);
	/*update function*/
	Donar findByDonaremail(String email);
	/*Delete function*/
	String deleteByDonaremail(String email);
	

}
