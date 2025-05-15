# PollApp

PollApp is a Spring Boot-based polling application where users can create polls, vote, and view results. It features a RESTful backend and a simple static frontend.

## 🚀 Features

- Create polls with multiple options
- Submit votes for poll options
- View poll results
- REST API design with Spring MVC
- HTML frontend using `index.html`

## 🛠️ Technologies Used

- Java 17+ (or 11+)
- Spring Boot
- Spring MVC
- Spring Data JPA
- Maven
- H2 or MySQL (via application.properties)
- Static HTML frontend

## 📂 Project Structure
src/
├── main/
│ ├── java/com/example/PollApp/
│ │ ├── DemoApplication.java
│ │ ├── PollController.java
│ │ ├── PollService.java
│ │ ├── PollRepository.java
│ │ ├── Poll.java
│ │ ├── Vote.java
│ │ └── VoteOption.java
│ └── resources/
│ ├── application.properties
│ └── static/index.html
├── test/
│ └── DemoApplicationTests.java

bash
Copy
Edit


