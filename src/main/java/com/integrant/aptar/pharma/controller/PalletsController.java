package com.integrant.aptar.pharma.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/v1")
public class PalletsController {
	
    Logger logger = LoggerFactory.getLogger(this.getClass());

	@PostMapping("aptar/pallets")
	public void palettizeBags() {
		logger.info("This Bag has been palettized successfully");

	}

	@PostMapping("aptar/pallets")
	public void completePallet() {
		logger.info("This Pallet has been completed successfully");

	}

	@PostMapping("aptar/pallets")
	public void wrapPallet() {
		logger.info("This Pallet has been wrapped successfully");

	}

	@PostMapping("aptar/pallets")
	public void transferPalletForShippment() {
		logger.info("This Pallet has been transfered for shipment successfully");

	}

}
