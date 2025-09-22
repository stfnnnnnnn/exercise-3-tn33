import os
import time
from typing import List

user_tasks: List[str] = []
width = 30

def clear_screen() -> None:
    os.system('cls' if os.name == 'nt' else 'clear')

def loading_message(msg: str = "Loading") -> None:
    print(f"\n{msg}...")
    time.sleep(1.8)
    clear_screen()
    
def print_line():
    print("-" * width)
    
def print_heading(text: str):
    print(text.center(width, "-"))
    
def addtask(user_task: str) -> None:
    user_tasks.append(user_task)
    loading_message("Logging data") 
    print(f"\n{user_task} added to Tasks!\n")
    print_line()
    loading_message("Loading") 

def showtasks() -> None:
    if len(user_tasks) == 0:
        print("No tasks yet\n")
    else:
        print_heading("YOUR TASKS")
        for num in range(len(user_tasks)):
            print(f"[{num + 1}] {user_tasks[num]}")
        print()
        print_line()

def removetask(task_num: int) -> None:
    if task_num > 0 and task_num <= len(user_tasks):
        removed = user_tasks.pop(task_num - 1)
        clear_screen()
        print(f"Removed task: {removed}\n")
        showtasks()
        print_line()
    else:
        clear_screen()
        print("No such task!!\n")
        showtasks()

def runapp() -> None:
    while True:
        clear_screen()
        print_heading("Menu")
        print(" [1] Add a Task")
        print(" [2] Show my Tasks")
        print(" [3] Remove a Task")
        print(" [4] Exit Application")
        print_line()
        user_choice = input("\nEnter your choice: ")
        loading_message("Loading") 

        if user_choice == "1":
            print_heading("ADD TASK")
            user_task = input("* ")
            addtask(user_task)
            print_line()

        elif user_choice == "2":
            showtasks()
            input("\nPress enter to continue...") 
            print_line()

        elif user_choice == "3":
            showtasks()
            if len(user_tasks) == 0:
                input("\nPress enter to continue...")
                continue
            print()
            print_heading("REMOVE TASK")
            print()
            task_num = int(input("Enter the number of the task you want to remove: "))
            loading_message("Loading")
            print_line()
            removetask(task_num)
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

runapp()
