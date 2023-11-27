# CinemaHub Fullstack Micro services based Web 
## Overview
CinemaHub serves as an all-encompassing platform for movie lovers, providing a user-friendly interface to explore and interact with a wide range of cinematic offerings. The project is structured using a microservices architecture, ensuring each component of the cinema experience is handled by a dedicated, independently deployable service. This approach enhances the overall performance and reliability of the system, making it robust and adaptable to changing user needs and technological advancements.

## Functional Microservices
| Microervice  | Description
| --- | --- |
| Movie Service | A core service that handles the details of movies, including information about directors, actors, and movie showtimes. Integrated with a relational database for efficient data management.
| User Service |  Manages user registrations, authentication, and profile management. Utilizes JWT for secure user sessions and interactions. 
| Notification Service | Sends out timely notifications with email sender as Kafka| A REST API built using Python FastAPI and SQLAlchamey used PostreSQL   
| Discovery Server (Eureka Server) | Deployed Eureka Server for service discovery, registration, and load balancing in the microservices ecosystem.
| API Gateway| Developed an API Gateway to centralize request management, routing, and load balancing for microservices. 
| Cinema-UI| Outgoing....
## Tech Stack

**Front-end:** React

**Back-end** Java, Spring Cloud, Spring Data Jpa, Spring Security,Jwt, Lombok, Apache Kafka,Java Mail Sender,Zipkin,Resilience4j,PostgreSql,MongoDB,Redis,Docker

## Future Plan

There's alot of stuff still doing on after that. But i only do in 7 days of duration so...
