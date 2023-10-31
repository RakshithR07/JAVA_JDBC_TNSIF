package com.tnsif.dao;

public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	static
	{
		factory=Persistance.createEntityManagerFactory("JPA-PU");
	}
	
	public static 
}
