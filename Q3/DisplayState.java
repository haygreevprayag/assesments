package bank;
import java.util.*;
import java.util.regex.Pattern;
class State implements Comparable<State>{
	private String name;
	State(String name){
		this.name = name;
	}
	public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name =name;
    }
    
    public int compareTo(State st){    
    	 if(name==st.name)    
    	 return 0;    
    	 else     
    	 return -1;    
    	 }    
}

class Country
{
  private String name;
  List<State> countryList = new ArrayList<State>();
  Country(String name){
      this.name = name;
  }
  
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name =name;
    }
    
    public void addState(String stateName) {
    	State newState = new State(stateName);
    	this.countryList.add(newState);
    }
    
    public List<State> getStateList(){
    	Collections.sort(this.countryList); 
    	return countryList;
    }
}




public class Main
{
  public static void main (String[]args)
  {
	  
	  Scanner myObj = new Scanner(System.in);
	  String numberOfInput = myObj.nextLine();
	  int n = Integer.parseInt(numberOfInput);  
	  List<String> inputList = new ArrayList<String>();
	  List<String> countryList = new ArrayList<String>();
	  List<Country> country = new ArrayList<Country>();
	  for(int i = 0;i<n;i++) {
		  inputList.add(myObj.next("Enter COuntry|Name"));
	  }
	  for(String input:inputList) {
		  String countryName= input.split( Pattern.quote("|") )[0];
		  if(countryList.contains(countryName)) {
			  for(Country countryIndividual: country) {
				  if(countryIndividual.getName() == countryName) {
					  countryIndividual.addState(input.split( Pattern.quote("|") )[1]);
				  }
			  }
			 
		  }
		  Country newCountry = new Country(countryName);
		  country.add(newCountry);
		  for(Country countryIndividual: country) {
			   countryIndividual.getStateList();
			  
		  }
	  }
  }
}



