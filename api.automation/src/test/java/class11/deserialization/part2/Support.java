package class11.deserialization.part2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(value = {"url"})
public class Support {
	
    public String url;
    public String text;
    
	
	  public String getUrl() { return url; } public void setUrl(String url) {
	  this.url = url; }
	 
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}