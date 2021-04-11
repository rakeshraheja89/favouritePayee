package com.bank.favorite.payee.service;

import com.bank.favorite.payee.model.FavoritePayee;

public interface FavoritePayeeService {

	String deleteBankData(FavoritePayee favoritePayee);

	String updateBankData(FavoritePayee favoritePayee);

}
