package aplication;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dpto = new Department(1,"Contabilidade");
		
		Seller sel = new Seller(1,"Bob","bob@example.com", new Date(), 3000.00 , dpto);
		
		System.out.println(sel);

	}

}
