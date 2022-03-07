package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateGitRepoPojo {
	    private String name;
	    private String description;
	    @JsonProperty("private") 
	    private boolean myPrivate;
	    
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}

		public boolean isMyPrivate() {
			return myPrivate;
		}
		public void setMyPrivate(boolean myPrivate) {
			this.myPrivate = myPrivate;
		}
}
