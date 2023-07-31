# Restaurant Management System

Welcome to the Restaurant Management System repository, a Java-based restaurant management system with a graphical user interface using the Swing library. This project was developed for the course Técnicas de Programção 1 (TP1) at the Universidade de Brasília (UnB).

## Features
The Restaurant Management System is designed to handle various aspects of restaurant resource management. Its main features include:

* Employee, customer, and menu management.
* Order tracking with preparation and delivery status.
* Exclusive authentication area for the manager with advanced administrative functionalities.
* User-friendly graphical interface for easy interaction with the system.

## Focus on Functionality over Appearance
As this system has the restaurant managers and waiters as its users, the primary focus during the development of this system was to ensure robust functionality and smooth operation. As a result, the user interface design might not be highly polished but is designed for ease of use and efficiency in restaurant management tasks.

## Data Persistence
To ensure data persistence even when the system is closed, the project utilizes simple text files (.txt) as "databases" to store information. This approach allows the system to retrieve previously saved data upon reopening, providing a seamless user experience.

## Requirements
* Java 8 or higher
* Swing library (included in the Java installation)

## Screenshots
Here are some screenshots of the Restaurant Management System in action:

![Screenshot of the main screen](https://github.com/fornari03/GerenciadorRestaurante/assets/112660465/b761ded8-1297-430f-9485-f81e0b7cc03d)

![Screenshot of the new hall's order screen](https://github.com/fornari03/GerenciadorRestaurante/assets/112660465/5a9d6f9a-8d66-4574-8cd8-ddcc19570bcb)

![Screenshot of the manager's authentication screen](https://github.com/fornari03/GerenciadorRestaurante/assets/112660465/124fa621-9a52-4c2f-a166-15ed612d213c)

![Screenshot of the customers' report screen](https://github.com/fornari03/GerenciadorRestaurante/assets/112660465/49622b2b-3efd-424d-9e23-55ab72191072)


## Installation
1. Clone this repository to your local machine:

`git clone https://github.com/fornari03/GerenciadorRestaurante `

* You may also Download ZIP of the project.

2. Open the project in your preferred IDE (recommended: NetBeans).

3. Compile and run the program.

## How to Use
* Upon running the program, you will be presented with the login screen.
* If you are the manager, enter your credentials to access advanced functionalities. There is a "cheat" for testing: User: 000.000.000-00 and Password: 1.
* Explore the different options of the system, such as adding employees, customers, menu items, or registering orders.
* Enjoy the intuitive interface to efficiently manage the restaurant's resources.
* If you wish to exit the system, you'll have to click on Sistema -> Fechar Sistema and then enter the manager credentials.

## Contributing
Contributions are welcome! If you want to improve the Restaurant Management System, follow these steps:

Fork the repository.
* Create a new branch with your addition or fix: git checkout -b my-improvement
* Commit your changes: git commit -m 'Added a new feature'
* Push to the branch: git push origin my-improvement
* Open a pull request so I can review your changes.

## License
This project is licensed under the MIT License. See the [LICENSE](https://github.com/fornari03/GerenciadorRestaurante/blob/main/LICENSE) file for more details.
