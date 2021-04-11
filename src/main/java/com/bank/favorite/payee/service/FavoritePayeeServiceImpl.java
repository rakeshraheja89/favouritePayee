
package com.bank.favorite.payee.service;

import java.util.List;
import java.util.Optional;

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
		// ID id = favoritePayee.getId();
		// favoritePayeeRepository.deleteById(favoritePayee.getId());
		return "200";
	}


	@Override
	public String updateBankData(FavoritePayee favoritePayee) {
		Optional<FavoritePayee> bankFinanceObj = favoritePayeeRepository.findById(favoritePayee.getId());
		String ibanCode = favoritePayee.getIbanCode();
		if (ibanCode != null && ibanCode.length() >= 8) {
			ibanCode=favoritePayee.getIbanCode().substring(4, 8);
			// getting details via rest template
			// String bankDetails = favoritePayeeRepository.getBankDetails();
		}
		
		if (bankFinanceObj.isPresent()) {
			FavoritePayee newEntity = bankFinanceObj.get();
			newEntity.setBankName(favoritePayee.getBankName());
			newEntity.setCustomerName(favoritePayee.getCustomerName());
			newEntity.setId(favoritePayee.getId());
			newEntity.setPayeeName(favoritePayee.getPayeeName());
			newEntity.setIbanCode(favoritePayee.getIbanCode());
			favoritePayeeRepository.save(newEntity);
		} else {
			favoritePayeeRepository.save(favoritePayee);
		}
		return "200";
	}


	@Override
	public String createBankData(FavoritePayee favoritePayee) {
		favoritePayeeRepository.save(favoritePayee);
		return "200";
	}
}
