package com.integrant.aptar.pharma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integrant.aptar.pharma.model.Bag;
import com.integrant.aptar.pharma.service.BagsService;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class BagsController {
	
	@Autowired
	private BagsService bagsService;
	
	@PostMapping("aptar/bags")
	public void storeBags(@Validated @RequestBody Bag bag) {
		
		bagsService.saveBag(bag);
	}
	
	@PostMapping("aptar/bags/scan")
	public void scanBags(@Validated @RequestBody Bag bag) {
		
		bagsService.scanBag(bag);
	}
	
	@PostMapping("aptar/bags/packaging")
	public void packageBags(@Validated @RequestBody Bag bag) {
		
		bagsService.packageBags(bag);
	}
	
	@PostMapping("aptar/bags/box/checker")
	public void checkPackageBox(@Validated @RequestBody Bag bag) {
		
		bagsService.checkPackageBox(bag);
	}
	

}
