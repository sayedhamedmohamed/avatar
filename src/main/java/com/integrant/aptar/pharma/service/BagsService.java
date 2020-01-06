package com.integrant.aptar.pharma.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void saveBag(Bag bag) {
		
		bagsRepository.save(bag);	
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
}
