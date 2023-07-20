package com.xworkz.inheritance.things;

public class Application {
		public String name;
		public String owner;
		public String type;
		public String numOfUsers;
		public String description;
		public String developer;
		public String address;
		public String category;
		public String security;
		public boolean paid;
		
		public Application() {
			System.out.println("Application no-argument constructor");
		}

		public Application(String name, String owner, String type, String numOfUsers, String description, String developer,
				String address, String category, String security, boolean paid) {
			this.name = name;
			this.owner = owner;
			this.type = type;
			this.numOfUsers = numOfUsers;
			this.description = description;
			this.developer = developer;
			this.address = address;
			this.category = category;
			this.security = security;
			this.paid = paid;
			System.out.println("Application all-argument constructor");
		}
		public void download() {
			System.out.println("Download method");
		}
		public void install() {
			System.out.println("Install method");
		}
		public void uninstall() {
			System.out.println("Unintsall method");
		}
		
		
		
		

	}



