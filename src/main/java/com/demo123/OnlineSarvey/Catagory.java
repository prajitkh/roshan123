package com.demo123.OnlineSarvey;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Catagory {
	@Autowired
	SessionFactory sf;

	
	 //* @GetMapping("categories") public ArrayList<Products> showdata() {
	 //* ArrayList<Products> al = (ArrayList<Products>)
	// * sf.openSession().createCriteria(Products.class).list(); al.add(new
	// * Products(102, "door", 1000)); return al; }
	 
	@PostMapping("catagory")
	public String updatedata(@RequestBody Products p) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(p);
		t.commit();

		return "approve";
	}

	@GetMapping("cata/{id}")
	public ArrayList<Products> showdata(@PathVariable int id) {

		ArrayList<Products> al = (ArrayList<Products>) sf.openSession().createCriteria(Products.class).list();
		al.add(new Products(105, "doors", 1900));
		return al;
	}
	
	@PutMapping("catag")
	public void updateData(@RequestBody Products p){
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		Products p1=session.get(Products.class,107);
		session.save(Products.class);
		tx.commit();
		}
}
