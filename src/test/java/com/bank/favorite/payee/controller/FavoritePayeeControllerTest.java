package com.bank.favorite.payee.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.bank.favorite.payee.model.FavoritePayee;

@SpringBootTest
@AutoConfigureMockMvc
public class FavoritePayeeControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private FavoritePayeeController favoritePayeeController;

	@Test
	public void getVersion() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/favorite/payee/info/version").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}

	/*
	 * @Test public void deleteBankData() throws Exception { FavoritePayee
	 * favoritePayee = new FavoritePayee(); favoritePayee.setId(2); String uri =
	 * "/favorite/payee/delete/${favoritePayee}"; MvcResult mvcResult =
	 * mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn(); int status =
	 * mvcResult.getResponse().getStatus(); assertEquals(200, status);
	 * 
	 * String content = mvcResult.getResponse().getContentAsString();
	 * assertEquals(content, "Product is deleted successsfully");
	 * 
	 * }
	 */
}