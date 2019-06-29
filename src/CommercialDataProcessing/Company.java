package CommercialDataProcessing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Company {
	String companyname;
	String stocksymbol;
	int noofshares;
	long shareprice;
	
	//Create formatter
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/YYYY  HH:MM:SS");
	 
	//Local date time instance
	LocalDateTime localDateTime = LocalDateTime.now();
	 
	//Get formatted String
	String date = format.format(localDateTime);
	
	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStocksymbol() {
		return stocksymbol;
	}
	
	public void setStocksymbol(String stocksymbol) {
		this.stocksymbol = stocksymbol;
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
		return getCompanyname() +"\t\t"+ getStocksymbol() +"\t\t"+ getNoofshares() +"\t\t"
	+ getShareprice() +"\t\t"+getDate();
	}
}
