# <div align="center">Selenium Automation Framework 🚀</div>

<div align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/d/d5/Selenium_Logo.png" width="120" alt="Selenium Logo">
  <br>
  <br>
  
  ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
  ![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
  ![TestNG](https://img.shields.io/badge/TestNG-FF7F00?style=for-the-badge&logo=testng&logoColor=white)
  ![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
  ![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
</div>

---

## 📖 **Project Description**

A robust, scalable, and modular **Selenium Automation Framework** built with **Java** and **TestNG**. This project is designed to handle complex UI automation tasks with ease, featuring **Dockerized execution (Selenium Grid)**, Page Object Model (POM) design pattern, and unified reporting.

Key capabilities include handling:
- 🖼️ **Iframes & Nested Frames**
- 🚨 **JavaScript Alerts (Simple, Confirm, Prompt)**
- 📑 **Multiple Tabs & Windows**
- 🔄 **Browser Navigation**

---

## ⚡ **Features**

- 🏗 **Page Object Model (POM)**: separation of test logic and page elements.
- 🐳 **Docker Support**: Ready-to-use `docker-compose.yml` for Selenium Grid (Chrome & Firefox).
- 🧪 **TestNG Integration**: Parallel execution and priority-based testing.
- ⚙️ **Configurable**: Properties-based configuration (URLs, Locators).
- 🔄 **Cross-Browser**: Supports Chrome, Firefox, and Remote (Grid) execution.

---

## 🛠 **Tech Stack**

| Technology | Usage |
| :--- | :--- |
| **Java 17+** | Core programming language |
| **Selenium WebDriver 4.x** | Browser automation library |
| **TestNG** | Test framework & assertions |
| **Maven** | Build & dependency management |
| **Docker** | Containerized Selenium Grid |
| **Jenkins** | CI/CD Integration (Configured in Docker) |

---

## 📂 **Project Architecture**

```bash
Selenium_Full_Project
├── Docker
│   └── docker-compose.yml   # Docker setup for Selenium Hub/Nodes & Jenkins
├── src
│   ├── main
│   │   └── java
│   │       └── Pages        # Page Object Classes (Locators & Actions)
│   └── test
│       ├── java
│       │   ├── BaseTests    # Base Test Class (Setup/Teardown)
│       │   └── Generics     # Test Scripts
│       └── resources
│           └── One.properties # Configuration (URLs, XPaths)
└── pom.xml                  # Maven Dependencies
```

---

## 🚀 **Getting Started**

### **Prerequisites**
- Java JDK 11 or higher
- Maven 3.x
- Docker & Docker Compose (optional, for Grid execution)
- Eclipse IDE or IntelliJ IDEA

### **Installation**

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/selenium-automation-project.git
   cd selenium-automation-project
   ```

2. **Install Dependencies**
   ```bash
   mvn clean install -DskipTests
   ```

---

## 🏃 **Usage Instructions**

### **Running Tests Locally**
You can run the tests directly using Maven or through your IDE (Right-click `testng.xml` or `Tests.java` -> Run As -> TestNG Test).

```bash
mvn test
```

### **Running on Docker Grid**
1. **Start the Grid**
   Navigate to the `Docker` folder and fire up the containers:
   ```bash
   cd Docker
   docker-compose up -d
   ```
   
2. **Verify Grid Status**
   Open your browser and visit:  
   [http://localhost:4444](http://localhost:4444)

3. **Execute Remote Tests**
   Ensure `BaseTest.java` is configured to use `startGrid("chrome")` or `startGrid("firefox")`.

---

## 📸 **Screenshots**

<div align="center">
  <img src="https://dummyimage.com/600x400/000/fff&text=Selenium+Grid+Dashboard" alt="Grid Dashboard" />
  <br>
  <em>Selenium Grid Dashboard</em>
</div>

---

## 🤝 **Contributing**

Contributions are welcome! Please follow these steps:

1. Fork the project.
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a Pull Request.

---

## 📄 **License**

Distributed under the MIT License. See `LICENSE` for more information.

---

## 👨‍💻 **Author**

<div align="center">

**Abhisek Baral**  
*QA Automation Engineer | Java Developer*

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:example@email.com)

</div>
