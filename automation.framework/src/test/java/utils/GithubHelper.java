package utils;

import pojo.CreateGitRepoPojo;

public class GithubHelper {
	
	public static CreateGitRepoPojo createRepo(String reponame, String description)
	{
		CreateGitRepoPojo createGitRepo = new CreateGitRepoPojo();
		createGitRepo.setName(reponame);
		createGitRepo.setDescription(description);
		return createGitRepo;
	}
	
	public static CreateGitRepoPojo createRepo(String reponame, String description, boolean isPrivate)
	{
		CreateGitRepoPojo createGitRepo = new CreateGitRepoPojo();
		createGitRepo.setName(reponame);
		createGitRepo.setDescription(description);
		createGitRepo.setMyPrivate(isPrivate);
		return createGitRepo;
	}
}
