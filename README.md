# Photography Studio Management System — Spring Boot REST API

This is Assignment 4 for the Web Technology course. It extends the Photography Studio
Management System project (originally built with JSF and Hibernate in Assignment 3) by
implementing full CRUD operations on three of its entities using **Spring Boot** and a
REST API tested with **Postman**.

## Entities implemented

Out of the full entity set from the original project (Booking, StaffMember, Client,
Equipment), three were selected for this assignment:

- **Client** — a customer who books a shoot with the studio
- **StaffMember** — a photographer, videographer, or other studio staff who can be
  assigned to a booking
- **Booking** — a scheduled shoot, linked to one Client and one StaffMember

## Tech stack

- Java, Spring Boot
- Spring Data JPA (Hibernate underneath)
- PostgreSQL
- Lombok
- Maven

## Project structure

The project follows a layered, package-per-entity structure:

```
rw.ac.auca
├── base            → BaseEntity (shared id, createdAt, updatedAt)
├── client          → domain / repository / service
├── staffmember     → domain / repository / service
├── booking         → domain / repository / service
└── controller      → REST controllers for all three entities
```

Each entity has its own `domain` (the JPA entity), `repository` (a Spring Data JPA
interface), and `service` (an interface plus its implementation) package. All
controllers live together in one shared `controller` package.

## API endpoints

Each entity exposes the same five endpoints, following REST conventions:

| Method | URL | Purpose |
|---|---|---|
| GET | `/{entity}/search-all` | List all records |
| GET | `/{entity}/{id}` | Get one record by id |
| POST | `/{entity}/create` | Create a new record |
| PUT | `/{entity}/update/{id}` | Update an existing record |
| DELETE | `/{entity}/delete/{id}` | Delete a record |

Replace `{entity}` with `client`, `staff`, or `booking`.

## Running the project

1. Create a PostgreSQL database named `photostudio_spring_db`.
2. Update the username/password in `src/main/resources/application.properties` if
   they differ from your local setup.
3. Run `mvn spring-boot:run`.
4. The API is available at `http://localhost:8080`.

## Testing with Postman

A Postman collection is included showing example requests for all five operations on
each entity. To create a booking, a Client and a StaffMember must already exist, since
a booking references both by their id:

```json
{
  "eventType": "Wedding",
  "eventDate": "2026-11-20",
  "status": "Pending",
  "client": { "id": "<existing client id>" },
  "assignedStaff": { "id": "<existing staff member id>" }
}
```

## Video walkthrough

[Add your video link here]

## Author

Leiss Uwase, ID 27064
