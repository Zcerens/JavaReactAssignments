package Entities;

import Abstract.GamerService;

public class Gamer implements GamerService {
	private Integer id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	
	public Gamer(Integer id, String firstName, String lastName, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getNationalityId() {
		return nationalityId;
	}
	
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	@Override
	public void add(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

}
