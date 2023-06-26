package com.xworkz.instancemethod.things;

public class AirCooler {
	private String company;
	private int price;
	private int litres;
	private int temperature;

	public AirCooler() {
		System.out.println("No-argument constructor");
	}

	public AirCooler(String company, int price, int litres, int temperature) {
		System.out.println("All-Argument constructor");
		this.company = company;
		this.price = price;
		this.litres = litres;
		this.temperature = temperature;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setLitres(int litres) {
		this.litres = litres;
	}

	public int getLitres() {
		return litres;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}

	public void cooling() {
		System.out.println("This is cooling method");
	}

	public String weather(int temperature) {
		if (temperature < 10) {
			return "Cool";
		} else if (temperature > 10 && temperature < 20) {
			return "Normal";
		} else if (temperature > 20 && temperature < 30) {
			return "Moderate";
		} else if (temperature > 30) {
			return "Hot";
		} else {
			return "Invalid";
		}
	}

	public String getWeather(String weather) {
		if(weather=="Cool") {
			return "Turnoff the AirCooler";
			
		}else if(weather=="Normal"){
			return "Slow down";
		}	else if(weather=="Moderate") {
			return "Don't turn off the cooler";
		}else if(weather=="Hot") {
			return "Turn on the Cooler";
		}else {
			return "Invalid";
		}
	}
}
