package com.pgdetails.Service;

import java.util.List;
import java.util.Optional;

import com.pgdetails.model.PGListing;
 
public interface PgService {

	 PGListing createPG(PGListing pgListing);
	    List<PGListing> getAllPGs();
	    Optional<PGListing> getPGById(Long id);
	    List<PGListing> getPGByCity(String city);
	    List<PGListing> getPGByLocality(String locality);
	    List<PGListing> getPGByCityAndLocality(String city, String locality);
	    PGListing updatePG(Long id, PGListing pgListing);
	    void deletePG(Long id);
	
	
}
