Selenium 4.x Learning & Implementation 🚀

This repository contains my hands-on learning journey with Selenium 4.x Web Automation.


📘 Topics Covered



Getting Started with Selenium

Setting up Java, Maven & IntelliJ/Eclipse

Running the first Selenium script

WebDriver architecture & browser drivers

Locators & Web Elements

findElement vs findElements

XPath (Absolute, Relative, Functions, Axes)

CSS Selectors

Handling forms, text fields, checkboxes, radio buttons

Selenium Waits ⏳

Implicit Wait

Explicit Wait (ExpectedConditions)

Fluent Wait

Advanced User Interactions

Actions class (keyboard & mouse events)

Handling Alerts, Windows, and iFrames

File Upload & Download automation

Working with Web Data

Web Tables (Static & Dynamic)

SVG & Shadow DOM handling

Test Automation Frameworks

TestNG integration

Allure Reporting

Page Object Model (POM) & Page Factory

Data-Driven Testing

Apache POI for Excel integration

Property Reader utility

Selenium Grid & Parallel Execution

Grid setup & usage

Running tests on Docker & BrowserStack

Miscellaneous

JavaScript Executor

Handling Dynamic Elements

Logging with Log4j

Jenkins CI/CD basics

🛠 Tech Stack

Java 11+

Maven

Selenium 4.x

TestNG

Allure Reports

Apache POI

Log4j

Jenkins (for CI/CD)

📂 Repository Structure
selenium-4x-learning/
│── src/
│   ├── main/java/   # Utility & Framework Code
│   └── test/java/   # Test Cases
│
│── pom.xml          # Maven dependencies
│── README.md        # This file

🚀 How to Run

Clone the repository:

git clone https://github.com/your-username/selenium-4x-learning.git
cd selenium-4x-learning


Install dependencies:

mvn clean install


Run tests:

mvn test


Generate Allure Report:

allure serve target/allure-results

📌 Progress Tracker

Run first Selenium script

Implement all Locators

Add Waits (Implicit/Explicit/Fluent)

Automate VWO login (Valid/Invalid)

Handle Alerts, Windows, iFrames

Build POM Framework

Add Apache POI for Data-Driven Testing

Setup Selenium Grid & Docker

Integrate with Jenkins