# 📚 Student Data Manager (Java)

A simple **Java console application** that demonstrates:

- ✅ Exception Handling  
- ✅ File I/O (Input / Output)  
- ✅ Menu-driven program  

This project allows you to **add student records** (Name, Age, Grade) and **view all saved students** from a text file.

---

## 🚀 Features

1. **Add Student**
   - Enter name, age, and grade.
   - Data is stored in a file `students.txt` in CSV format.

2. **View Students**
   - Reads the `students.txt` file line by line.
   - Displays records in a clean format:  
     ```
     Name: John, Age: 30, Grade: A
     ```

3. **Exception Handling**
   - Handles file read/write errors gracefully (no program crash).

---

## 🛠️ Technologies Used

- **Java** (JDK 8+)
- **File I/O classes** (`FileWriter`, `FileReader`, `BufferedReader`)
- **Exception Handling** (`try-catch` blocks)
- **Scanner** for user input

---

## 📂 Project Structure

D-Day-07-Exception-Handling-File-IO/
│
├── StudentDataManager.java # Main source code
├── students.txt # File storing student records
└── README.md # Project documentation


---

## ▶️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Shank312/D-Day-07-Exception-Handling-File-IO.git


Compile the Java program:
javac StudentDataManager.java

Run the program:
java StudentDataManager

📌 Example Output
=== Student Data Manager ===
1. Add Student
2. View Students
3. Exit
Choose option: 1
Enter Name: John
Enter Age: 30
Enter Grade: A
Student added successfully!

=== Student Data Manager ===
1. Add Student
2. View Students
3. Exit
Choose option: 2

--- Student List ---
Name: John, Age: 30, Grade: A
Name: Michael, Age: 28, Grade: A+
Name: Silvy, Age: 29, Grade: A++
Name: Nick, Age: 27, Grade: A
Name: Moana, Age: 25, Grade: B++++


📖 Learning Objectives

Understand exception handling (try-catch-finally).

Learn how to read/write files in Java.

Build a real mini-project with menu options.

✍️ Created by Shank312
