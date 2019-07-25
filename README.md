# COMP333 

This is the public repository for Comp333: Algorithm Theory and Design, offered in Semester 2, 2019 at Macquarie University.

The main purpose for this repository is to make it easier for us to share files and materials for workshops and assigmments.
We are going to require that you use very basic git commands. 

If you need to learn Git, then head over to https://www.atlassian.com/git. You do not 

All codes are written in Eclipse using Java 10. 

### Configuring Eclipse to work with Git

The following is based on the tutorial on https://www.vogella.com/tutorials/EclipseGit/article.html. Feel free to follow 
the tutorial there if you already know your way around Git. However, 

First, we need to show the `Git Repositories` sub-window. On Eclipse, select

> Window -> Show View -> Other -> Git -> Git Repositories

A new sub-window titled `Git Repositories` will open. To clone this repository, follow these steps: 
1. Click on `Clone a Git repository` 
2. On the new window that pops up (Source Git Repository), enter `https://github.com/sutantyo/comp333_2019` as the URI and click `Next`. 
3. On the next page (Branch Selection), select the master branch if it hasn't already been ticked, and click `Next`.
4. On the next page (Local Destination), you can change the local directory if you want to, and then click `Finish`.
5. On the `Git Repositories` sub-window, there should be a `comp333_2019 [master]` repository. Right click on this repo, and then select `Import Projects...`. You can click `Finish` on the newly opened window, unless there is any setting you want to change (I don't think there is any need). 

Once you have done all this, your Package Explorer should show the comp333_2019 project with `codes/src` folder. 
