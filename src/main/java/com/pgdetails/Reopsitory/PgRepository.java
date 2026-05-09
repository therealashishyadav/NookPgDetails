package com.pgdetails.Reopsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgdetails.model.PGListing;

public interface PgRepository extends JpaRepository<PGListing, Long> {

	 List<PGListing> findByCityIgnoreCase(String city);
	    List<PGListing> findByLocalityIgnoreCase(String locality);
	    List<PGListing> findByCityAndLocalityIgnoreCase(String city, String locality);

}
