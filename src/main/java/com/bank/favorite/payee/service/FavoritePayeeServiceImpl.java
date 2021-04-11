
package com.bank.favorite.payee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.favorite.payee.model.FavoritePayee;
import com.bank.favorite.payee.repository.FavoritePayeeRepository;

@Service
public class FavoritePayeeServiceImpl implements FavoritePayeeService {

	@Autowired
	FavoritePayeeRepository favoritePayeeRepository;

	@Override
	public String deleteBankData(FavoritePayee favoritePayee) {
		favoritePayeeRepository.delete(favoritePayee);
		return "200";
	}

	@Override
	public String updateBankData(FavoritePayee favoritePayee) {
		if (favoritePayee.getIbanCode() != null) {
			favoritePayee.setIbanCode(favoritePayee.getIbanCode().substring(4, 8));
		}
		// getting details via rest template
		// String bankDetails = favoritePayeeRepository.getBankDetails();
		favoritePayeeRepository.save(favoritePayee);
		return "200";
	}
}
