package com.example.demo;


public class Booke {
	
	private int id;
	
	private String name;
	
	private String author;
	
     private String serverport;
     
     private String jlcmessage;

	public Booke(int id, String name, String author, String serverport, String jlcmessage) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.serverport = serverport;
		this.jlcmessage = jlcmessage;
	}
	

	public Booke(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}


	public Booke(String name, String author, String serverport, String jlcmessage) {
		super();
		this.name = name;
		this.author = author;
		this.serverport = serverport;
		this.jlcmessage = jlcmessage;
	}

	public Booke() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getServerport() {
		return serverport;
	}

	public void setServerport(String serverport) {
		this.serverport = serverport;
	}

	public String getJlcmessage() {
		return jlcmessage;
	}

	public void setJlcmessage(String jlcmessage) {
		this.jlcmessage = jlcmessage;
	}

	@Override
	public String toString() {
		return "Booke [id=" + id + ", name=" + name + ", author=" + author + ", serverport=" + serverport
				+ ", jlcmessage=" + jlcmessage + "]";
	}
}
	