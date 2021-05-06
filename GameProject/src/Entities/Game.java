package Entities;

import Abstract.GameService;

public class Game implements GameService{
	
	private String name;
	private int id;
	private int price;
	
	public Game(String name, int id, int price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		
	}
	

}
