# COMP333: Algorithm Theory and Design, 2019, Macquarie University 

This is the public repository for COMP333: Algorithm Theory and Design, offered in Semester 2, 2019 at Macquarie University.
The main purpose for this repository is to make it easier for us to share files and materials for workshops and assignments.
We may also use the wiki section of this repository to post extra notes.

All codes are written in Java 10 using Eclipse, and this repository was built so that you can easily import and 
run these codes using Eclipse. If you are not using Eclipse, then you need to use to clone this project and 
manually add them to whatever IDE or text editor you are running. 

You do not need to understand Git for this subject, but as a third year computing student, you should have a good 
understanding of the basics by now. If you do need to learn Git, then head over to https://www.atlassian.com/git 
and read the Beginner articles. At the very least, you should understand what a `pull` means. 

### Configuring Eclipse to work with Git

The following is based on the tutorial on https://www.vogella.com/tutorials/EclipseGit/article.html. Feel free to follow 
the tutorial if you want a more complete understanding, but this section should be enough for the purposes of COMP333.
The following guide (particularly the screenshots) were written using a MacOS, so there could be some differences 
with other operating systems, but 

First, we need to show the `Git Repositories` sub-window. On Eclipse, select

> Window -> Show View -> Other -> Git -> Git Repositories

![Show View 1](/img/git-1-show-view-1.png)

![Show View 2](/img/git-2-show-view-2.png)

A new sub-window titled `Git Repositories` will open. To clone this repository, follow these steps: 
1. Click on `Clone a Git repository` 

![cloning a repo](/img/git-3-repo.png)

2. On the new window that pops up (Source Git Repository), enter `https://github.com/sutantyo/comp333_2019` as the URI and click `Next`. 

![adding a repo](/img/git-4-clone-1.png)

3. On the next page (Branch Selection), select the master branch if it hasn't already been ticked, and click `Next`.

![selecting branch](/img/git-5-clone-2.png)

4. On the next page (Local Destination), you can change the local directory if you want to, and then click `Finish`.

![choose local directory](/img/git-6-clone-3.png)

5. Once you have cloned the repository, you should see the `comp333_2019 [master]` repository in the `Git Repositories` sub-window.

![importing project](/img/git-7-import-1.png)

6. Right click on this repo, and then select `Import Projects...`. You can click `Finish` on the newly opened window, unless there is any setting you want to change (I don't think there is any need). 

![importing project](/img/git-8-import-2.png)

7. The project should now be shown under the `Package Explorer`, and you can start modifying it.

![package explorer](/img/git-9-final.png)
