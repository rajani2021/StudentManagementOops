package class13.ReqSpecRespSpecUrlSpec;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)

public class Owner {
	    public String login;
	    public int id;
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}    
	    
}
