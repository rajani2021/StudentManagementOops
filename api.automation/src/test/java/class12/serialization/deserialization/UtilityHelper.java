package class12.serialization.deserialization;

public class UtilityHelper {
	
	public static CreateGitRepoPojo CreateGitPublicRepoHelper(String repoName, String description) {
		CreateGitRepoPojo obj = new CreateGitRepoPojo();
		obj.setName(repoName);
		obj.setDescription(description);
		return obj;
	}
	
	public static CreateGitRepoPojo CreateGitPublicRepoHelper(String repoName, String description, boolean type) {
		CreateGitRepoPojo obj = new CreateGitRepoPojo();
		obj.setName(repoName);
		obj.setDescription(description);
		return obj;
	}
}
