**PROJECT OVERVIEW**

This repository contains a simple To-Do List Application implemented in Python and Java. It allows users to add tasks, view them, and remove tasks with a clean and interactive menu-driven interface. 
The project demonstrates collaboration using Git (branches, pull requests, and reviews) and code quality practices such as naming conventions, indentation, and documentation.


**PROJECT STRUCTURE**

├── ToDoApp.java        # Java version of the To-Do List App

├── toDoApp.py          # Python version of the To-Do List App

└── README.md           # Project overview and setup instructions

**FEATURES**

-Add tasks

-View task list

-Remove tasks

-Input validation to prevent crashes

-Clear and consistent menu design

-Loading messages for better UX


**SETUP INSTRUCTIONS**


//PYTHON//
1. Ensure you have Python 3.8+ installed.
   a. If not, make sure to install Python 3.8 from the Microsoft Store.
   b. Using Windows Powershell, Command Prompt, or the Built-in terminal within Visual Studio, enter:
   python3 -V
   it should produce an output like this:
   Python 3.13.7 (or any advanced version above 3.0)
   c. If this does not appear, double check installation guides for Microsoft or download Python from this site: https://www.python.org/
2. Ensure that you have downloaded Git for Desktop, GitHub for Desktop, and secure a Git and/or GitHub Account. (https://git-scm.com/downloads for git) and (https://github.com/ for gitgub account creation)
3. Launch Visual Studio Code (you must install this if not existing) and install the following in the Visual Studio Marketplace:
   a. Python by Microsoft
   b. Pylance by Microsoft
   c. Python Debugger by Microsoft
   d. Python Environments by Microsoft
4. Download the files from this link: https://github.com/stfnnnnnnn/exercise-3-tn33 OR go to the Source Control in Visual Studio Code (Shortcut: Ctrl+Shift+G)
   a. If you choose to download the files within the link, just click open file and select each program file individually.
   b. If you choose to use the Source Control method, you must click either the "clone this repository" button in the left panel of the screen or in the right panel along the welcome tab options.
      -If this is your method or preference you will be prompted to the center bar (along the search bar) of the visual studio code. Click clone from GitHub again and verify your account in GitHub.
      -After this, just select stfnnnnnnn/exercise-3-tn330
      -The whole repository will appear in the left panel of your screen.
5. Choose/click the ToDoApp.py and then the source code should appear. Click the play icon in the upper-right portion of your application and click run Python.
7. The application must appear and be available in the Terminal section and should run without errors.



//JAVA//
1. Ensure you have the latest Java Development Kit available and downloaded in your Desktop. (link:https://download.oracle.com/java/25/latest/jdk-25_windows-x64_bin.exe)
2. Double-click the installer and follow the prompts (keep default settings).
3. After installation, set the JAVA_HOME environment variable (search edit environment variable then choose path >> edit >> then the repository location.
4. Open a new Command Prompt and run:
5. java -version
javac -version
6. Ensure that you have downloaded Git for Desktop, GitHub for Desktop, and secure a Git and/or GitHub Account. (https://git-scm.com/downloads for git) and (https://github.com/ for gitgub account creation)
7. Launch Visual Studio Code (you must install this if not existing) and install the following in the Visual Studio Marketplace:
   a. Java by Oracle Corporation
   b.Gradle for Java by Microsoft
   c.Maven for Java by Microsoft
   d.Debugger for Java by Microsoft
   e.Project Manager for Java by Microsoft
   f.Language Support for Java(TM) by Red Hat
   g.Test Runner for Java by Microsoft
8. Download the files from this link: https://github.com/stfnnnnnnn/exercise-3-tn33 OR go to the Source Control in Visual Studio Code (Shortcut: Ctrl+Shift+G)
   a. If you choose to download the files within the link, just click open file and select each program file individually.
   b. If you choose to use the Source Control method, you must click either the "clone this repository" button in the left panel of the screen or in the right panel along the welcome tab options.
      -If this is your method or preference you will be prompted to the center bar (along the search bar) of the visual studio code. Click clone from GitHub again and verify your account in GitHub.
      -After this, just select stfnnnnnnn/exercise-3-tn330
      -The whole repository will appear in the left panel of your screen.
9. Choose/click the ToDoApp.java and then the source code should appear. Click the play icon in the upper-right portion of your application and click run Java.
10. The application must appear and be available in the Terminal section and should run without errors.


**PROGRAM GUIDE**

//PYTHON//

Main Menu
When you run the program, you will see:

Each number corresponds to an action:
1. Add Task
  Choose option 1 to add a task.
  Type the description of the task you want to add.
  The program will confirm that the task has been added.
2. Show Tasks
  Choose the option to view tasks.
  The program will display all tasks in the order they were added.
  If there are no tasks, it will inform you that the list is empty.
  If there are no tasks, it will display:

3. Remove Task
  Deletes a task from your list.
    Type 3 and press Enter.
    Type the number of the task you want to remove (from the “Show Tasks” list) and press Enter.
    You will see:
    Make sure you enter a valid task number to avoid errors.
4. Exit
  Closes the program.
    Type 4 and press Enter.
    The program will terminate.

//JAVA//

Main Menu

Upon running the program, the user is presented with a menu that shows the available actions.

The user can input the numbers 1 through 4, which correspond to a specific action.

  1: Add Task
  
  2: Show Tasks
  
  3: Remove Task
  
  4: Exit
  
  Invalid input: if the user enters a value outside the options, an error message appears and the menu is shown again.

Add Task

  Choosing 1 prompts the user to add a task by entering a task description.
  
  In doing so, the task is added to a list.

View Tasks

  Choosing 2 displays the list of tasks that the user has added.
  
  If the list is empty, it will display a message informing the user that there are no tasks.

Remove Task

  Choosing 3 prompts the user to remove a task.
  
  The user can enter the number of the task they want to remove.
  
  Valid: If the number is valid, the program removes the specified task from the list.
  
  Invalid: If the number is invalid or the task does not exist, an error message appears and the user is sent back to the main menu.
  
  Empty list: If the user has yet to add a task, it will display a message informing the user that there are no tasks.

Exit
  The program will continue running until the user chooses 4 which exits the system.

   
**DEVELOPMENT WORKFLOW**

Delos Santos-Code base and Features (Java), Documentation (Python)

Gatmaytan- Documentation (Java), UI (Python) 

Mangahas- UI (Java), Code base and Features (Python)


**SEQUENTIAL WORK FLOW (Concurrent for both Program Types)**

Codebase and Features >> UI Development >> Documentation >> Final Revision


**IDE,TOOLS, AND EXTENSIONS USED**

a. Git

b. GitHub

c. Python by Microsoft

d. Pylance by Microsoft

e. Python Debugger by Microsoft

f. Python Environments by Microsoft

g. Java by Oracle Corporation

h. Gradle for Java by Microsoft

i. Maven for Java by Microsoft

j. Debugger for Java by Microsoft

k. Project Manager for Java by Microsoft

l. Language Support for Java(TM) by Red Hat

m. Test Runner for Java by Microsoft

o. IntelliCode by Microsoft

p. autoDocstring - Python Docstring Generator by Nils Werner

r. Zencoder: AI Coding Agent and Chat for Python, Javascript, Typescript, Java, Go, and more by zencoder.ai

s. Mintlify Doc Writer for Python, JavaScript, TypeScript, C++, PHP, Java, C#, Ruby & more by Mintlify
