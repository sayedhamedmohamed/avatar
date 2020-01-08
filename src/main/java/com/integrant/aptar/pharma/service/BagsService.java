package com.integrant.aptar.pharma.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrant.aptar.pharma.dto.BagDTO;
import com.integrant.aptar.pharma.model.Bag;
import com.integrant.aptar.pharma.repository.BagsRepository;

/**
 * The Class BagsService.
 */
@Service
public class BagsService {
	
	/** The bags repository. */
	@Autowired
	private BagsRepository bagsRepository;
	
    /** The logger. */
    Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * Save bag.
	 *
	 * @param bag the bag
	 */
	public void saveBag(BagDTO bag) {
		
		Bag newBag = new Bag(bag.getContent(), bag.getType());
		
		bagsRepository.save(newBag);	
	}

	/**
	 * Scan bag.
	 *
	 * @param bag the bag
	 */
	public void scanBag(Bag bag) {
		logger.info("This Bag scanned successfully");
	}

	/**
	 * Package bags.
	 *
	 * @param bag the bag
	 */
	public void packageBags(Bag bag) {
		logger.info("This Bag packaged successfully");
		
	}

	/**
	 * Check package box.
	 *
	 * @param bag the bag
	 */
	public void checkPackageBox(Bag bag) {
		logger.info("The package  of this bag is valid");
		
	}

	public List<Bag> finAllBags() {
		return bagsRepository.findAll();
	}
}
