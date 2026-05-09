package com.pgdetails.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgdetails.Reopsitory.PgRepository;
import com.pgdetails.model.PGListing;

@Service
public class PgSeriveImpl implements PgService {

	@Autowired
	private PgRepository pgRepository;
	

    @Override
    public PGListing createPG(PGListing pgListing) {
        return pgRepository.save(pgListing);
    }

    @Override
    public List<PGListing> getAllPGs() {
        return pgRepository.findAll();
    }

    @Override
    public Optional<PGListing> getPGById(Long id) {
        return pgRepository.findById(id);
    }

    @Override
    public List<PGListing> getPGByCity(String city) {
        return pgRepository.findByCityIgnoreCase(city);
    }

    @Override
    public List<PGListing> getPGByLocality(String locality) {
        return pgRepository.findByLocalityIgnoreCase(locality);
    }

    @Override
    public List<PGListing> getPGByCityAndLocality(String city, String locality) {
        return pgRepository.findByCityAndLocalityIgnoreCase(city, locality);
    }

    @Override
    public PGListing updatePG(Long id, PGListing updatedPG) {
        return pgRepository.findById(id)
                .map(existing -> {
                    updatedPG.setId(id);
                    return pgRepository.save(updatedPG);
                })
                .orElseThrow(() -> new RuntimeException("PG with ID " + id + " not found"));
    }

    @Override
    public void deletePG(Long id) {
        if (!pgRepository.existsById(id)) {
            throw new RuntimeException("PG with ID " + id + " not found");
        }
        pgRepository.deleteById(id);
    }
}
