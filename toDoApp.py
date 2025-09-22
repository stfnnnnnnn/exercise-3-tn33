import os
import time
from typing import List

user_tasks: List[str] = []

def clear_screen() -> None:
    os.system('cls' if os.name == 'nt' else 'clear')

def loading_message(msg: str = "Loading") -> None:
    print(f"\n{msg}...")
    time.sleep(1.5)
    clear_screen()

def addtask(user_task: str) -> None:
    user_tasks.append(user_task)
    loading_message("Logging data") 
    print(f"\n{user_task} added to Tasks!\n")
    loading_message("Loading") 

def showtasks() -> None:
    if len(user_tasks) == 0:
        print("No tasks yet\n")
    else:
        print("Your tasks:\n")
        for num in range(len(user_tasks)):
            print(f"[{num + 1}] {user_tasks[num]}")
        print()

def removetask(task_num: int) -> None:
    if task_num > 0 and task_num <= len(user_tasks):
        removed = user_tasks.pop(task_num - 1)
        clear_screen()
        print(f"Removed task: {removed}\n")
        showtasks()
    else:
        clear_screen()
        print("No such task!!\n")
        showtasks()

def runapp() -> None:
    while True:
        clear_screen()
        print("[1] Add a Task")
        print("[2] Show my Tasks")
        print("[3] Remove a Task")
        print("[4] Exit Application")
        user_choice = input("\nEnter your choice: ")
        loading_message("Loading") 

        if user_choice == "1":
            user_task = input("Enter a task: ")
            addtask(user_task)

        elif user_choice == "2":
            showtasks()
            input("\nPress enter to continue...") 

        elif user_choice == "3":
            showtasks()
            if len(user_tasks) == 0:
                input("\nPress enter to continue...")
                continue
            task_num = int(input("Enter task no to remove: "))
            loading_message("Loading")
            removetask(task_num)
            input("\nPress enter to continue...")  

        elif user_choice == "4":
            clear_screen()
            print("Thank you for using this application! Goodbye!")
            time.sleep(1)
            break

        else:
            print("Wrong choice!!\n")
            input("Press enter to continue...")  

runapp()
