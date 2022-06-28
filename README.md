# Habit Tracker
>  Our group is composed of Charlie Cox, Temi Kounoudji, Caitlyn Barrow, 
Martin Castaneda, and Bridgett Tijerina
>
> We are Working towards an app to help people track both positive and negative habits. Individuals can
use technology to improve their daily lives one mindful habit at a time!
Through promotion and encouragement of healthy habits while making note
of negative ones, we empower our users with an easy-to-use tool to facilitate
a positive lifestyle.

<!--

## Table of Contents
* [General Info](#general-information)
* [Technologies Used](#technologies-used)
* [Features](#features)
* [Screenshots](#screenshots)
* [Setup](#setup)
* [Usage](#usage)
* [Project Status](#project-status)
* [Room for Improvement](#room-for-improvement)
* [Acknowledgements](#acknowledgements)
* [Contact](#contact) 
* [License](#license)

-->


<!---

## General Information
- Provide general information about your project here.
- What problem does it (intend to) solve?
- What is the purpose of your project?
- Why did you undertake it?

-->
<!-- You don't have to answer all the questions - just the ones relevant to your project. -->

## Technologies Used

<a href= "https://docs.oracle.com/javase/tutorial/uiswing/">Java Swing</a>: Used for created GUI's.


## Features

> ### Success vs Failure Tracking
 - Allows users to track their successes and failures and gives them data when the habit ends.

> ### Customizable habits
 - Fit with a description and goal. (User Story: Caitlyn Barrow)


<!---
## Screenshots

<!-- If you have screenshots you'd like to share, include them here. -->
## App Icon 

![](https://i.imgur.com/Sxy2STc.png){height=50 width=60}
<span style="font-size:5px;"/span></p>



## Sprint 1

## What We Did
Charlie- Created the backend for the habits including classes and interfaces. Also researched Java Swing and Calendar API's.

<a href= "https://cs3398su22edosians.atlassian.net/browse/HTP-21">HTP-21</a> /
<a href= "https://cs3398su22edosians.atlassian.net/browse/HTP-23">HTP-23</a> /
<a href= "https://cs3398su22edosians.atlassian.net/browse/HTP-24">HTP-24</a> /
<a href= "https://cs3398su22edosians.atlassian.net/browse/HTP-22">HTP-22</a>

Temi- GUI for user login and initialization of main panel GUI upon successful login. Creation of SQL database on remote server. Connection between SQL and Java to utilize said database during runtime.<br>
<a href= "https://bitbucket.org/cs-3398-su22-edosians/habit-tracker-repository/src/master/UI%20Research/Swing%20and%20JavaFX%20Research">HTP-45</a> /
<a href= "https://bitbucket.org/cs-3398-su22-edosians/habit-tracker-repository/src/master/UI%20Initialization/SystemLog.java">HTP-30</a> /
<a href= "https://bitbucket.org/cs-3398-su22-edosians/habit-tracker-repository/src/master/UI%20Initialization/GUI.java">HTP-30.2</a> /
<a href= "https://bitbucket.org/cs-3398-su22-edosians/habit-tracker-repository/src/master/UI%20Research/SQL%20Research">HTP-31</a> /
<a href= "https://bitbucket.org/cs-3398-su22-edosians/habit-tracker-repository/src/master/UI%20Initialization/SystemLog.java%20(Local%20Server%20Vers.)">HTP-32</a>


Martin- Modified GUI.java to open other windows for profile and habit interaction.
<a href= "https://cs3398su22edosians.atlassian.net/jira/software/projects/HTP/boards/4/backlog?selectedIssue=HTP-47">HTP-47</a>


Caitlyn-  
<a href= https://bitbucket.org/cs-3398-su22-edosians/habit-tracker-repository/src/master/Habit%20Interface%20and%20Classes/End%20of%20File%20Summary>Created app Icon, laid out some skeleton code.</a>

Bridgett- Draft for a User Profile screen and research for Java User Interfaces using Java Swing and Window Builder.

<a href= "https://cs3398su22edosians.atlassian.net/browse/HTP-33">HTP-33</a> /
<a href= "https://cs3398su22edosians.atlassian.net/browse/HTP-34">HTP-34</a> /
<a href= "https://cs3398su22edosians.atlassian.net/browse/HTP-35">HTP-35</a> /
<a href= "https://cs3398su22edosians.atlassian.net/browse/HTP-36">HTP-36</a>

## Next Steps

Charlie- Work with Martin on making sure the backend and habit UI work together properly. <br>
         Work with Temi to work on a calendar.<br>
         Add JUnit Tests to Habit Classes.<br>
         Work on improving overall UI integration.<br>


Temi- Finish building SQL database (space for habits to be added in by back-end, first and last name to refer to the user by, etc.)<br>
      Enable modifying SQL data during runtime (option to reset password so people aren't blocked with no recourse, availability of renaming habits through back-end, etc.)<br>
      Bug fix pass (current: trying to connect to a different database with more arguments causes an SQL error).<br>
      Code integration with rest of the team (making sure front-end functions with remaining code, error checking, etc).<br>


Martin- Have a working and Interactive UI. Implement a better work ethic. <br> 


Caitlyn- Flesh out some skeleton code established during sprint 1. Elaborate on UI integration as well as some bug fixes. 

Bridgett- Create a working and fleshed out User Profile screen.
          Integrating my code with Temi's code.

## What Went Well

Team- We chose to write code from scratch rather than pulling from GitHub and have made good progress so far.<br>
We were able to separate who would do what in the project very early on.<br>
Everyone is able to communicate effectively through our team Discord or Slack.<br>
On several occasions everyone went an extra mile to stay on talking for a long time after the official class end period to finalize decisions on time-sensitive issues.<br>

Charlie- We did a good job of meeting together and deciding what we would work on. Communication
was very consistent.

Temi- Nobody's attitudes clashed with the overall group.

Martin- Communication was open, questions were welcomed.

Caitlyn- Really great team, everyone was very good at communicating and spreading out the work. Everyone was super receptive to everyone elses ideas as well. 


Bridgett- The team communicated what problems each member had and working together to fix problems.

## What Could Be Improved

We missed the mark on some of our deadlines and would like to have done more in the first sprint.

## What Can I Do To Improve?
Charlie- Generally, I would like to have done more coding. I did the backend for the habit class, but I could have helped more with the UI code as well. You will know that I have done this when you see my name
on more code involving UI's and on more code in general.

Temi- Me focusing and being more creative on the tools we are already using rather than pushing for tools we as a group are unfamiliar with (like SQL and the initial idea of JavaFX), which slows us down.

Martin- Litterally anything. Asking for more help. Studying. Being productive

Caitlyn- Better time managment for me, organizing my time better and spreading out my work. I woud like to contribute more this time around to the overall project.

Bridgett- Dedicating time to work on assignments and communicate better with the team.

## Sprint 2

## What We Did
Charlie- Created the GUI for the Habit Class, the Create Habit GUI, and the habit End of Life GUI.<br>
<a href= "https://cs3398su22edosians.atlassian.net/browse/HTP-55">HTP-55</a> /
<a href= "https://cs3398su22edosians.atlassian.net/browse/HTP-61">HTP-61</a> /
<a href= "https://cs3398su22edosians.atlassian.net/browse/HTP-67">HTP-67</a> /


## Next Steps <br>
Charlie - I'd love to clean up the GUI's and integrate everything into one project. <br>


## What Went Well<br>
Team- We ended up overcoming a lot of adversity and having a close to finished project.<br>

Charlie- Did a good job of trying to keep everyone as involved as possible and I had a lot of fun working on GUI's.<br>

## What Could Be Improved<br>
Team- We still missed a lot of deadlines.<br>


## What Can I Do To Improve?<br>
Charlie- I would like to have the GUI's implemented completely and integrated with the whole project. You will know I have done this
because there will be no buttons that don't work, and the project will be one program.






<!--
## Setup
What are the project requirements/dependencies? Where are they listed? A requirements.txt or a Pipfile.lock file perhaps? Where is it located?

Proceed to describe how to install / setup one's local environment / get started with the project.

-->

<!---
## Usage
How does one go about using it?
Provide various use cases and code examples here.

`write-your-code-here`

-->

<!---
## Project Status
Project is: _in progress_ / _complete_ / _no longer being worked on_. If you are no longer working on it, provide reasons why.

-->

<!--
## Room for Improvement
Include areas you believe need improvement / could be improved. Also add TODOs for future development.

Room for improvement:
- Improvement to be done 1
- Improvement to be done 2

To do:
- Feature to be added 1
- Feature to be added 2

-->

<!---
## Acknowledgements
Give credit here.
- This project was inspired by...
- This project was based on [this tutorial](https://www.example.com).
- Many thanks to...

-->

<!---
## Contact
Created by [@flynerdpl](https://www.flynerd.pl/) - feel free to contact me! 

<!-- Optional -->
<!-- ## License -->
<!-- This project is open source and available under the [... License](). -->

<!-- You don't have to include all sections - just the one's relevant to your project -->