package class11.deserialization.part2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown=true)

public class Root {
	
    public Data data;
    public Support support;
    
    public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	
	  public Support getSupport() { return support; }
	  
	  public void setSupport(Support support) { this.support = support; }
	 
}
