package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

void insert(Seller department);
	
	void update (Seller department);
	
	void deleteById (Seller department);
	
	Seller findById (Integer id);
	
	List<Seller>  findAll();
}
