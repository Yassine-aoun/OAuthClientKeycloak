# OAuthClientKeycloak
## 1. Introduction
   This repository contains code demonstrating the integration of a Spring Boot application with Keycloak for OAuth 2.0 authentication. The setup includes configuring Keycloak, setting up the Spring Boot application as an OAuth client, handling access tokens, and securing endpoints.

## 2. What Is Keycloak?
   Keycloak is an open-source Identity and Access Management solution targeted towards modern applications and services.

Keycloak offers features such as Single-Sign-On (SSO), Identity Brokering and Social Login, User Federation, Client Adapters, an Admin Console, and an Account Management Console.

In our tutorial, we’ll use the Admin Console of Keycloak for setting up and connecting to Spring Boot using the Spring Security OAuth2.0.

## 3. Setting Up a Keycloak Server
### 3.1. Downloading and Installing Keycloak
   Download the Keycloak-22.0.3 Standalone server distribution from the official source.
   Unzip the downloaded file and navigate to the Keycloak directory.
   Start Keycloak from the terminal using bin/kc.sh start-dev.
   Access Keycloak in your browser at http://localhost:8080, create an initial admin user, and log in.
   ### 3.2. Creating a Realm
   Navigate to the Create realm button in the Admin Console.
   Create a new realm called SpringBootKeycloak.
   ### 3.3. Creating a Client
   Navigate to the Clients page in the Admin Console and click Create.
   Add a new client named login-app with appropriate settings, including Valid Redirect URIs.
   ### 3.4. Creating a Role and a User
   Add a user role in the Realm Roles section.
   Create a user and assign the user role to them.
   ## 4. Generating Access Tokens With Keycloak’s API
   Keycloak provides a REST API for generating and refreshing access tokens. Use this API to create your own login page and handle authentication.

## 5. Creating and Configuring a Spring Boot Application
   Add dependencies for OAuth2 client, Spring Security, and OAuth2 resource server in your Spring Boot application.
   Configure the OAuth2 client and provider properties in your application properties or configuration class.
   Implement security configurations and mappings for different URL paths and user roles.
   Create Thymeleaf web pages and a controller to handle page rendering and user interactions.
   ## 6. Demonstration
   Run your Spring Boot application either from an IDE or using Maven.
   Access the application in your browser and test the authentication flow with Keycloak.
   Verify that secured endpoints are accessible only to authenticated users with the required roles.
   ## 7. Conclusion
   This repository serves as a guide and example for integrating Spring Boot with Keycloak for OAuth 2.0 authentication. Feel free to explore the code and customize it according to your requirements.

