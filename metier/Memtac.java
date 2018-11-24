package com.gestionequipe.metier;

public class Memtac {

	private int tacheID;
	private int membreID;
	private int memtacID;
	public Memtac() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Memtac(int tacheID, int membreID, int memtacID) {
		super();
		this.tacheID = tacheID;
		this.membreID = membreID;
		this.memtacID = memtacID;
	}
	public int getTacheID() {
		return tacheID;
	}
	public void setTacheID(int tacheID) {
		this.tacheID = tacheID;
	}
	public int getMembreID() {
		return membreID;
	}
	public void setMembreID(int membreID) {
		this.membreID = membreID;
	}
	public int getMemtacID() {
		return memtacID;
	}
	public void setMemtacID(int memtacID) {
		this.memtacID = memtacID;
	}
	
	
	
	
}
