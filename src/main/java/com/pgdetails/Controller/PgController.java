package com.pgdetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pgdetails.Service.PgService;
import com.pgdetails.model.PGListing;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PgController {

	@Autowired
	private PgService pgService;	
	
	@PostMapping("/addPGWithFiles")
	public ResponseEntity<PGListing> addPGWithFiles(
	        @RequestPart("pg") PGListing pg,
	        @RequestPart(value = "galleryImages", required = false) MultipartFile[] galleryImages,
	        @RequestPart(value = "video", required = false) MultipartFile video) {
	   
        return ResponseEntity.ok(pgService.createPG(pg));
    }

    @GetMapping
    public ResponseEntity<List<PGListing>> getAllPGs() {
        return ResponseEntity.ok(pgService.getAllPGs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PGListing> getById(@PathVariable Long id) {
        return pgService.getPGById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/search")
    public ResponseEntity<List<PGListing>> getByLocation(
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String locality
    ) {
        if (city != null && locality != null) {
            return ResponseEntity.ok(pgService.getPGByCityAndLocality(city, locality));
        } else if (city != null) {
            return ResponseEntity.ok(pgService.getPGByCity(city));
        } else if (locality != null) {
            return ResponseEntity.ok(pgService.getPGByLocality(locality));
        } else {
            return ResponseEntity.ok(pgService.getAllPGs());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<PGListing> updatePG(@PathVariable Long id, @RequestBody PGListing updatedPG) {
        return ResponseEntity.ok(pgService.updatePG(id, updatedPG));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePG(@PathVariable Long id) {
        pgService.deletePG(id);
        return ResponseEntity.noContent().build();
    }
}
