package com.bridgelabz.ObjectOrientedPrograms;

public class StockDetails {
	String sharename;
	int noofshares;
	long shareprice;
	
	
	public String getSharename() {
		return sharename;
	}
	public void setSharename(String sharename) {
		this.sharename = sharename;
	}
	public int getNoofshares() {
		return noofshares;
	}
	public void setNoofshares(int noofshares) {
		this.noofshares = noofshares;
	}
	public long getShareprice() {
		return shareprice;
	}
	public void setShareprice(long shareprice) {
		this.shareprice = shareprice;
	}
	
	public String toString() {
		return"Share Name: "+ getSharename()+" No of Shares: "+ 
	getNoofshares()+ " Share Price: "+ getShareprice()+"\n";
	}
}