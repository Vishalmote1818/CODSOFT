"""TO-DO APPLICATION USING PYTHON"""
tasks = []

def add_task():
    task = input("Enter task: ")
    tasks.append(task)
    print("Task added!")

def view_tasks():
    if not tasks:
        print("No tasks.")
    else:
        print("Tasks:")
        for index, task in enumerate(tasks, start=1):
            print(f"{index}. {task}")

def update_task():
    view_tasks()
    if tasks:
        try:
            index = int(input("Enter task number to update: ")) - 1
            if 0 <= index < len(tasks):
                new_task = input("Enter updated task: ")
                tasks[index] = new_task
                print("Task updated!")
            else:
                print("Invalid task number.")
        except ValueError:
            print("Invalid input.")
    else:
        print("No tasks to update.")

def main():
    while True:
        print("\n1. Add Task\n2. View Tasks\n3. Update Task\n4. Exit")
        choice = input("Enter choice (1-4): ")

        if choice == '1':
            add_task()
        elif choice == '2':
            view_tasks()
        elif choice == '3':
            update_task()
        elif choice == '4':
            print("Exiting...")
            break
        else:
            print("Invalid choice. Try again.")

if __name__ == "__main__":
    main()
