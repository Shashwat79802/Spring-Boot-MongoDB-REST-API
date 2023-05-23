## REST API with Spring-Boot + MongoDB

The application is built purely with Java Spring-Boot that does the complete CRUD in the MongoDB database. 

### Pre-Requisites

Make sure you have the following -
1. Latest version of JDK
2. MongoDB Compass
3. Postman

### Getting Started

Follow the steps to start the application -

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/Spring-Boot-MongoDB-REST-API.git
   ```
  
 2. Navigate to the project directory:
    ```bash
    cd src/main/resources
    ```
     a. Open the file ```application.properties```
     <br>b. Replace the value ```YOUR_CONNECTION_STRING``` with your MongoDB connection string. 
    
 3. Now, navigate to the directory: 
    ```bash
    cd ..
    cd java/com/example/potionsapi/model
    ```
    a. Open the file ```Potion.java``` <br>
    b. Replace the value ```YOUR_COLLECTION_NAME``` with your MongoDB collections name.
 
 Your application is ready to be executed!!
 Now go to the directory ```src/main/java/com/example/potionsapi``` and open the file ```PotionsApoApplication.java``` in an IDE and execute the file.
 
 The server is started to run on http://localhost:8080
