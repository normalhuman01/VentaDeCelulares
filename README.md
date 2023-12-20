# VentaDeCelulares

## Installation and Running the Application

### Prerequisites
- Java Development Kit (JDK) installed on your system.
- Apache NetBeans or any Java IDE that supports Swing components.
- Git command line tool or a Git GUI client.

### Cloning the Repository
First, clone the repository to your local machine using Git:

```bash
git clone https://github.com/normalhuman01/VentaDeCelulares.git
cd VentaDeCelulares
```

Replace `https://github.com/your-username/VentaDeCelulares.git` with the actual URL of your GitHub repository.

### Importing the Project
Open Apache NetBeans or your Java IDE and import the project:

- In NetBeans, select 'Open Project' from the 'File' menu and navigate to the directory where you cloned the project.
- Select the `VentaDeCelulares` project folder and click 'Open Project'.

### Resolving Dependencies
Ensure that all the required libraries are included in the project settings. If you have a `pom.xml` or `build.gradle` file, your IDE should handle the dependencies automatically.

### Running the Application
To run the application within NetBeans:

- Right-click on the project in the 'Projects' pane.
- Select 'Run'.

Alternatively, you can use the command line:

```bash
cd path/to/VentaDeCelulares
java -cp build/classes modelo.Venta
```

Replace `modelo.Venta` with the path to your main class if it is different. Also, make sure the `build/classes` path points to the compiled `.class` files of your project.

### Building the Application
If you want to build a distributable JAR file:

- In NetBeans, right-click on the project and choose 'Clean and Build'.
- The JAR file should be generated in the `dist` folder within your project directory.

Now, the application can be run from the JAR file directly using the following command:

```bash
java -jar "dist/VentaDeCelulares.jar"
```

Replace `VentaDeCelulares.jar` with the actual name of your JAR file.

---

Please note that these instructions assume a standard Java project structure and may need to be adjusted based on the specific setup and build configuration of your project.
