package CommercialDataProcessing;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.DataStructurePrograms.Queue;
import com.bridgelabz.DataStructurePrograms.Stack;

public class CommercialMethods {
	
	static ObjectMapper mapper = new ObjectMapper();
	static LinkedList<Company> clist = new LinkedList<>();
	static LinkedList<UserAccount> ulist = new LinkedList<>();
	static Company company = new Company();
	static UserAccount user = new UserAccount();
	static String companyFilePath = "/home/admin1/eclipse-workspace/JSON File/Company.json";
	static String userFilePath = "/home/admin1/eclipse-workspace/JSON File/UserAccount.json";
	static Stack<String> stack = new Stack<String>();
	static Queue<String> queue = new Queue<String>();
	
	

	public static void buyShares(int amount, String symbol) throws JsonParseException, JsonMappingException, IOException {
		
		clist = mapper.readValue(new File(companyFilePath),
				new TypeReference<LinkedList<Company>>() {});
		ulist = mapper.readValue(new File(userFilePath),
				new TypeReference<LinkedList<UserAccount>>() {});
		if(clist.size() == 0) {
			System.out.println("sorry there is no stock to buy !");
			return;
		}
		else {
		
			for(int i = 0; i < clist.size(); i++) {
				
				if(clist.get(i).getStocksymbol().equalsIgnoreCase(symbol)) {
					
					System.out.println("\n************* User Shares Before Buying *************\n");
					uPrintReport();
					int shareprice = (int)clist.get(i).getShareprice();
					System.out.println(shareprice);
					int noofshares = (int)(amount/shareprice);
					System.out.println(noofshares);
					int shares = clist.get(i).getNoofshares();
					int remshare = shares - noofshares;
					clist.get(i).setNoofshares(remshare);
				//  System.out.println(clist.get(i).getNoofshares());
			
					System.out.println("\n************* Company Shares After Buying *************\n");
					mapper.writeValue(new File(companyFilePath),clist);
					printReport();
					                                                        
					for(int j = 0; j < ulist.size(); j++) {
						if(ulist.get(j).getStocksymbol().equalsIgnoreCase(symbol)) {
							int usershares = ulist.get(j).getNoofshares();
							ulist.get(j).setNoofshares(usershares + noofshares);
							stack.push(symbol);
							queue.enQueue(ulist.get(j).getDate());
							System.out.println("\n************ User After Transaction ************\n");
							mapper.writeValue(new File(userFilePath),ulist);
							uPrintReport();
							}
						}
					}
				else {
					System.out.println("\nYou Entered Invalid Input");
					return;
				}
				}
			}
		return;
		}
	
	public static void sellShares(int amount, String symbol) throws JsonParseException, JsonMappingException, IOException {
		try {
			clist = mapper.readValue(new File(companyFilePath),
					new TypeReference<LinkedList<Company>>() {});
			
			ulist = mapper.readValue(new File(userFilePath),
					new TypeReference<LinkedList<UserAccount>>() {});
			
			
			if(ulist.size() == 0) {
				System.out.println("Sorry you have insufficient share to sell");
				return;
				}
			else {
				
				for(int i = 0; i < ulist.size(); i++) {
					
				//for loop for update the company Account.
					
					if(ulist.get(i).getStocksymbol().equalsIgnoreCase(symbol)) {
						System.out.println("\n****************** Available Company Shares ******************\n");
						printReport();
						int shareprice = (int)ulist.get(i).getShareprice();
						int noofshares = (int)(amount/shareprice);
						int shares = ulist.get(i).getNoofshares();
						int remshare = shares - noofshares;
						ulist.get(i).setNoofshares(remshare);
						System.out.println("\n************* User Shares After Selling *************\n");
						mapper.writeValue(new File(userFilePath),ulist);
						uPrintReport();
						
						for(int j = 0; j < ulist.size(); j++) {
							if(clist.get(j).getStocksymbol().equalsIgnoreCase(symbol)) {
								int companyshares = clist.get(j).getNoofshares();
								clist.get(j).setNoofshares(companyshares + noofshares);
								stack.push(symbol);
								queue.enQueue(clist.get(j).getDate());
								System.out.println("\n************ Company Shares After Transaction ************\n");
								mapper.writeValue(new File(companyFilePath),clist);
								printReport();
								}
							}
						}
					else {
						System.out.println("There is no Symbol Present In the stock");
					}
				}
			}
		} catch (JsonParseException e) {
			System.out.println("Error while reading the json file."+e.getMessage());
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void printReport() throws JsonParseException, JsonMappingException, IOException {
		
		try {
			System.out.println("Company Name \tStock Symbol\tNo of Shares \tShare Price \t Date\t\tTime");
			clist = mapper.readValue(new File(companyFilePath),
					new TypeReference<LinkedList<Company>>() {});
			for(Company c : clist) {
				System.out.println(c);
				}
		}
		catch (JsonParseException e) {
			e.printStackTrace();
			}
		catch (JsonMappingException e) {
			e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
			}
				
	}
	
public static void uPrintReport() throws JsonParseException, JsonMappingException, IOException {
		
		try {
			System.out.println("Stock Symbol\tNo of Shares \tShare Price \t Date\t\tTime");
			ulist = mapper.readValue(new File(userFilePath),
					new TypeReference<LinkedList<UserAccount>>() {});
			for(UserAccount u : ulist) {
				System.out.println(u);
				}
		}
		catch (JsonParseException e) {
			e.printStackTrace();
			}
		catch (JsonMappingException e) {
			e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
			}
				
	}
	
	public static double valueOf() throws JsonParseException, JsonMappingException, IOException {
		double total = 0;
		try {
			clist = mapper.readValue(new File(companyFilePath),
					new TypeReference<LinkedList<Company>>() {});
			for(int i = 0 ; i < clist.size(); i++) {
				total = total + clist.get(i).getNoofshares()*clist.get(i).getShareprice();
			}
		}
		catch (JsonParseException e) {
			e.printStackTrace();
			}
		catch (JsonMappingException e) {
			e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
			}
				 
		return total;
	}
	
	public static void save(String FilePath) throws JsonParseException, JsonMappingException, IOException {
		
		String location = "/home/admin1/eclipse-workspace/JSON File/";
		try {
		ulist = mapper.readValue(new File(location + FilePath + ".json"),
				new TypeReference<LinkedList<UserAccount>>() {});
		
		if(ulist.size() == 0) {
			mapper.writeValue(new File(location + FilePath + ".json"),user);
			}
			else {
				ulist.add(user);
				mapper.writeValue(new File(location + FilePath + ".json"),ulist);
				System.out.println("Saved Successfully...");
			}
		}
		catch (JsonParseException e) {
			e.printStackTrace();
			}
		catch (JsonMappingException e) {
			e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
			}
	}
	
	public static void quit() {
		System.exit(0);
	}

	

	

}
