"""Python To-Do application

This script lets the user add, remove, or view all tasks from a list.
It makes use of input/output operations and list manipulation. This
application also features a clean UI that clears the screen for every
input and prints menus.
"""

# ----------------------------------------------------------------------
# Modules
# ----------------------------------------------------------------------
import os
import time
from typing import List


# ----------------------------------------------------------------------
# Global variables
# ----------------------------------------------------------------------
user_tasks: List[str] = []  # Stores user tasks
width = 30                  # Width for heading formatting


# ----------------------------------------------------------------------
# Formatting functions
# ----------------------------------------------------------------------
def clear_screen() -> None:
    """Clears the screen output.
    
    Uses the appropriate command depending on the operating system:
    'cls' for Windows and 'clear' for Unix/Linux/Mac.
    """
    os.system('cls' if os.name == 'nt' else 'clear')


def loading_message(msg: str = "Loading") -> None:
    """ Displays a loading message for a brief moment, then clears the screen.

    Args:
    msg (str): Loading message shown before "...". Defaults to "Loading".
    """
    print(f"\n{msg}...")
    time.sleep(1.8)
    clear_screen()
    
    
def print_line():
    """Prints a horizontal line for menu separation."""
    print("-" * width)
    
    
def print_heading(text: str):
    """Print a centered heading with dashes on each side."""
    print(text.center(width, "-"))
    

# ----------------------------------------------------------------------
# Core application functions
# ----------------------------------------------------------------------
def add_task(user_task: str) -> None:
    """ Adds a new task to the global user_tasks list.

    Args:
    user_task (str): Task description provided by the user.
    """
    user_tasks.append(user_task)
    loading_message("Logging data")
    print(f"\n{user_task} added to Tasks!\n")
    print_line()
    loading_message("Loading")


def show_tasks() -> None:
    """ Displays all tasks in the user_tasks list.
    
    Prints a formatted list with numbering. If no tasks exist,
    a message is displayed instead.
    """
    if len(user_tasks) == 0:
        print("No tasks yet\n")
    else:
        print_heading("YOUR TASKS")
        for num in range(len(user_tasks)):
            print(f"[{num + 1}] {user_tasks[num]}")
        print()
        print_line()


def remove_task(task_num: int) -> None:
    """ Removes task from the user_tasks list.

    Args:
    task_num (int): 1-based index of the task to remove.
    """
    if task_num > 0 and task_num <= len(user_tasks):
        removed = user_tasks.pop(task_num - 1)
        clear_screen()
        print(f"Removed task: {removed}\n")
        show_tasks()
        print_line()
    else:
        clear_screen()
        print("No such task!!\n")
        show_tasks()


# ----------------------------------------------------------------------
# Main Program
# ----------------------------------------------------------------------
def run_app() -> None:
    """ Runs the to-do list application.
    
    Continuously shows the menu screen until the user exits.
    Handles adding, displaying, and removing tasks.
    """
    while True:
        clear_screen()
        print_heading("Menu")
        print(" [1] Add a Task")
        print(" [2] Show my Tasks")
        print(" [3] Remove a Task")
        print(" [4] Exit Application")
        print_line()
        user_choice = input("\nEnter your choice (1-4): ")
        loading_message("Loading")

        if user_choice == "1":
            print_heading("ADD TASK")
            user_task = input("Add task here: ")
            add_task(user_task)
            print_line()

        elif user_choice == "2":
            show_tasks()
            input("\nPress enter to continue...")
            print_line()

        elif user_choice == "3":
            show_tasks()
            if len(user_tasks) == 0:
                input("\nPress enter to continue...")
                continue
            print()
            print_heading("REMOVE TASK")
            print()
            task_num = int(input("Enter the number of the task you want to remove: "))
            loading_message("Loading")
            print_line()
            remove_task(task_num)
            input("\nPress enter to continue...")
            print_line()

        elif user_choice == "4":
            clear_screen()
            print("Thank you for using this application! Goodbye!")
            time.sleep(1)
            break

        else:
            print("Wrong choice!!\n")
            print_line()
            input("Press enter to continue...")


# ----------------------------------------------------------------------
# Program entry point
# ----------------------------------------------------------------------
run_app()
