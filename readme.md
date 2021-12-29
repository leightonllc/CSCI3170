# CSCI3170 Introduction to Database Systems Project -- Library Inquiry System

This is a library inquiry system implemented in Java, using JDBC for MySQL connection.

## Group 64
- Choi Sen Ho 1155125303
- Lau Long Ching 1155127347
- Li Chun Lam 1155116313

## Compilation
- Navigate to the folder with the files
- Run:`javac Main.java`

## Running the program
### Using Terminal
!(CUHK CSE VPN connection is required to run the project.)
- Navigate to the folder with the files
- Run: `java -cp .:mysql-connector-java-5.1.47.jar Main`
### Using Visual Studio Code
!(CUHK CSE VPN connection is required to run the project.)
- Put the connector jar file under "Referenced Libraries" of "Java Projects" tab
- Right click on Main.java and run
### Caution
Please delete the tables, re-create them and import sample data before trying the functions.

## Cleaning up the compiled files
Run:
`find . -name "*.class" -type f -delete`

Please refer to [this link](https://github.com/leightonllc/CSCI3170).

## Final result
38/39 (-1) rating by default is null. usre functions: test case 2, test case 3.
