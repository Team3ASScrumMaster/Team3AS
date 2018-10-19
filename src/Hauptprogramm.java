/*
 * Here is a step by step video of uploading eclipse projects to github

https://www.youtube.com/watch?v=BH4OqYHoHC0

Adding the Steps here.

Right click on your eclipse project -> Team -> Share project

Choose git from the list shown; check the box asking create or use repository -> click on create repository and click finish. - This will create a local git repo. (Assuming you already have git installed )

Right click on project -> Team -> Commit - Select only the files you want to commit and click on Commit. - Now the files are committed to your local repo.

Go to git repositories view in eclipse ( or Team -> Show in repositories View)

Expand the git repo of your project and Right click on Remotes -> Create Remote

Remote name will appear as origin, select 'Configure Push' Option and click ok

In the next dialog, click on change next to URI textbox and give your git url, username, password and click on 'Save and Push'. This configures git Push.

For configuring Fetch, go to Git Repositories -> Remote -> Configure Fetch -> Add -> Master Branch -> Next -> Finish -> Save and Fetch

For configuring Master Branch, Branch -> Local -> Master Branch -> Right click and configure branch -> Remote: origin and Upstream Branch : refs/heads/master -> click ok

On refreshing your repo, you will be able to see the files you committed and you can do push and pull from repo.
 *
 */

public class Hauptprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
