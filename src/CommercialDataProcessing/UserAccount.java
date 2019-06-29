package CommercialDataProcessing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserAccount {
	
	String stocksymbol;
	int noofshares;
	long shareprice;
	long cash;
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/YYYY  HH:MM:SS");
	LocalDateTime localDateTime = LocalDateTime.now();
	String date = format.format(localDateTime);
	
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

	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public long getCash() {
		return cash;
	}

	public void setCash(long cash) {
		this.cash = cash;
	}
	
	public String toString() {
		return getStocksymbol()+"\t\t"+getNoofshares()+"\t\t"+getShareprice()+"\t\t"+ getDate();
	}

}
