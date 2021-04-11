package com.bank.favorite.payee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.favorite.payee.model.FavoritePayee;

public interface FavoritePayeeRepository extends JpaRepository<FavoritePayee, Integer> {

}
