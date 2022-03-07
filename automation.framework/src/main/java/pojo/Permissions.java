package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)

public class Permissions {
    public boolean push;
    public boolean pull;
	public boolean isPush() {
		return push;
	}
	public void setPush(boolean push) {
		this.push = push;
	}
	public boolean isPull() {
		return pull;
	}
	public void setPull(boolean pull) {
		this.pull = pull;
	}
    
    
}
