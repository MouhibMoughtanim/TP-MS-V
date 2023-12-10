# TP-MS Repository

## Overview

This repository hosts a microservices architecture featuring key components such as an Eureka Server, a Gateway, and two distinct services: "Car Service" and "Client Service." The central objective of these services is to establish seamless communication among themselves. Specifically, the "Car Service" oversees interactions with a MySQL database that stores data related to cars, while the "Client Service" is responsible for similar interactions, managing data associated with clients in another MySQL database. The Eureka Server assumes a pivotal role in the ecosystem, overseeing service registration and discovery processes.
![ms-architecture](https://github.com/MouhibMoughtanim/TP-MS/assets/101598112/3978acc4-9fd2-4097-af0a-647c83284d61)

## Technologies Used

- **Spring Tool Suite**: Integrated development environment for Spring Boot applications.
- **Java (Spring Boot)**: Framework for building Java-based microservices.
- **MySQL**: Relational database management system.

## Project Structure

1. **Eureka Server:** Manages service registration and discovery. [http://localhost:8761](http://localhost:8761)
2. **Gateway:** Serves as an entry point for accessing microservices.[http://localhost:8888](http://localhost:8888)
3. **Car Service:** Responsible for interactions with a MySQL database related to car data.[http://localhost:8089](http://localhost:8089)
4. **Client Service:** Manages interactions with a MySQL database containing client-related data.[http://localhost:8088](http://localhost:8088)

## Usage

### Client Service


- API endpoints:
  - `GET /clients`: Retrieve clients information.
  - `GET /client/{id}`: Retrieve client information by ID.
  <!-- Provide additional usage details or examples -->

### Car Service

- API endpoints:
  -  `GET /voitures`: Retrieve cars information.
  - `GET /voiture/{id}`: Retrieve car information by ID.
  - `GET /voiture/{id}`: Retrieve car information by client ID.



## Running the Project

### Prerequisites

- Java SDK
- MySQL
- IDE (Eclipse, IntelliJ, etc.)

### Follow these steps to run the microservices:

1. Clone the repository.
 ```bash
    git clone https://github.com/MouhibMoughtanim/TP-MS
 ```
2. Start the Eureka Server.
3. Launch the Gateway.
4. Run the Car Service and Client Service.
5. Access the Eureka interface to view all launched services.[http://localhost:8761](http://localhost:8761)

## Video Demo

Check out our video demo for a visual walkthrough of the project.

[Watch the Video Demo](https://mega.nz/file/NchBBSYZ#PbGjDmo1oRyORS1_0DfxgWDDujvwEV1OADwzYeqeecU)


## JSON Prettify

For improved readability of JSON responses, consider downloading a JSON prettify tool. This will enhance your testing experience by making it easier to interpret and analyze JSON data.

### Advantages of JSON Prettification

- **Readability:** Easily discern the structure and content of JSON responses.
- **Debugging:** Simplifies the identification of issues in JSON data.
- **Documentation:** Facilitates the documentation of API responses for developers.
![WhatsApp Image 2023-12-08 à 00 21 24_e1292abf](https://github.com/MouhibMoughtanim/TP-MS/assets/101598112/92db3b65-aca9-482b-8d44-b1937884e606)

Enjoy exploring the TP-MS repository! If you encounter any issues or have questions, feel free to reach out.
