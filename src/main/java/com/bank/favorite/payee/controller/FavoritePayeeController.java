package com.bank.favorite.payee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.favorite.payee.model.FavoritePayee;
import com.bank.favorite.payee.service.FavoritePayeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/favorite/payee")
public class FavoritePayeeController {
	
	@Autowired
	FavoritePayeeService favoritePayeeService;
	
	@Operation(summary = "/info/version")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "/info/version ") })
	@GetMapping("/info/version")
	public String checkVersion() {
		return "Greetings from Spring Boot!";
	}
	
	@PostMapping("/login")
	public void login() {
	}
	
	@PostMapping("/create")
	@Operation(summary = "/create")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "/create") })
	public String insertBankData(@RequestBody FavoritePayee favoritePayee) {
		return favoritePayeeService.createBankData(favoritePayee);
	}
	
	@PutMapping("/update")
	@Operation(summary = "/update")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "/update") })
	public String updateBankData(@RequestBody FavoritePayee favoritePayee) {
		return favoritePayeeService.updateBankData(favoritePayee);
	}
	
	@DeleteMapping("/delete")
	@Operation(summary = "/delete")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "/delete") })
	public String deleteBankData(@RequestBody FavoritePayee favoritePayee) {
		return favoritePayeeService.deleteBankData(favoritePayee);
	}
	
}
