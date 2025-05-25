# 🎮 Guess the Number – JSF Web Application

This project is a simple web-based number guessing game built using **Jakarta EE** with **JSF (JavaServer Faces)** and deployed on **GlassFish 7**. The application allows users to guess a randomly generated number between 1 and 100 within a maximum of 6 attempts.

---

## 📌 Features

- ✅ Random number generation on session start
- ✅ User input with validation
- ✅ Game logic with feedback:
  - "Too High"
  - "Too Low"
  - "Correct!"
- ✅ Limited to 6 attempts
- ✅ Game over handling with restart option
- ✅ Image displayed upon winning

---

## 🛠 Technologies Used

- Jakarta EE (JSF, CDI)
- Facelets (XHTML)
- Maven (Project Build)
- GlassFish 7 (Application Server)
- HTML, CSS (JSF UI Components)

---

## 📁 Project Structure
/
├── src/
│ └── main/
│ ├── java/
│ │ └── dcs/lab11/JSFManagedBean.java
│ └── webapp/
│ ├── index.xhtml
│ ├── response.xhtml
│ └── WEB-INF/
│ └── web.xml
├── target/
│ └── lab11.war
└── pom.xml

## 🚀 Running the Application

### Step 1: Build the WAR
bash
mvn clean package

### Step 2: Deploy on Glass

asadmin deploy --contextroot guessgame --name GuessGame target/lab11.war


### Step 3: Open in Browser

http://localhost:8080/guessgame/



Disclaimer: This project was developed as part of a university lab for Distributed Computer Systems using Jakarta EE and JSF.
