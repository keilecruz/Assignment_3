# CSC 340 Assignment 3 - Character API

## 1. Introduction

**Character Type:** Characters from Game of Thrones, One Piece, and Marvel
**Purpose:** This Spring Boot REST API allows CRUD operations on a collection of characters, including searching and categorizing them by attributes such as universe or species.  

---

## 2. Installation

1. Clone the repository:

```bash
git clone <your-repo-url>
cd Assignment_3
```
2. Ensure Java 17 and Maven are installed.

3. Configure application.properties with your Neon.tech PostgreSQL connection string:

```bash
spring.application.name=crud-api
spring.datasource.url=jdbc:postgresql://<YOUR-NEON-HOST>/<DB-NAME>?user=<USERNAME>&password=<PASSWORD>&sslmode=require&channelBinding=require
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
```

4. Run the application

```bash
mvn spring-boot:run
```

The API will start on http://localhost:8080.

## API Endpoints 

## 3. API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/characters` | Retrieve all characters |
| GET | `/characters/{id}` | Retrieve a character by ID |
| POST | `/characters` | Add a new character (JSON body required) |
| PUT | `/characters/{id}` | Update a character by ID (JSON body required) |
| DELETE | `/characters/{id}` | Delete a character by ID |
| GET | `/characters/category/{category}` | Get characters filtered by a category (e.g., universe, species) |
| GET | `/characters/search?name=substring` | Search characters whose name contains a substring |

**Notes:**
- For POST and PUT requests, set `Content-Type: application/json`.
- Example JSON body for POST/PUT:

```json
{
  "name": "Daenerys Targaryen",
  "description": "Mother of Dragons",
  "universe": "Game of Thrones",
  "species": "Human",
  "age": 24
}
```

## 4. Showcasing API Endpoints (examples)

### GET /characters
**Request:**

```http
GET http://localhost:8080/characters
```

```http
[
  {
    "characterId": 1,
    "name": "Daenerys Targaryen",
    "description": "Mother of Dragons",
    "universe": "Game of Thrones",
    "species": "Human",
    "age": 24
  },
  {
    "characterId": 2,
    "name": "Luffy",
    "description": "Captain of the Straw Hat Pirates",
    "universe": "One Piece",
    "species": "Human",
    "age": 19
  }
]
```

### GET /characters/{id}
**Request:**

```http
GET http://localhost:8080/characters/1
```

```http
{
  "characterId": 1,
  "name": "Daenerys Targaryen",
  "description": "Mother of Dragons",
  "universe": "Game of Thrones",
  "species": "Human",
  "age": 24
}
```

### POST /characters/{id}
**Request:**

```http
POST http://localhost:8080/characters
```

```http
{
  "name": "Bucky Barnes",
  "description": "Winter Soldier",
  "universe": "Marvel",
  "species": "Human",
  "age": 105
}
```

**Reponse created:**


```http
{
  "characterId": 3,
  "name": "Bucky Barnes",
  "description": "Winter Soldier",
  "universe": "Marvel",
  "species": "Human",
  "age": 105
}
```
### PUT /characters/{id}

```http
PUT http://localhost:8080/characters/3
```

```http
{
  "name": "Bucky Barnes",
  "description": "Reformed Winter Soldier",
  "universe": "Marvel",
  "species": "Human",
  "age": 105
}
```
**Reponse created:**

```http
{
  "characterId": 3,
  "name": "Bucky Barnes",
  "description": "Reformed Winter Soldier",
  "universe": "Marvel",
  "species": "Human",
  "age": 105
}
```

### DELETE /characters/{id}

```http
    DELETE http://localhost:8080/characters/1
```
**Reponse created:**

will delete Daenerys Targaryen since her character id is 1.

### GET /characters/category/{category}

```http
GET http://localhost:8080/characters/category/One%20Piece
```

```http
[
  {
    "characterId": 2,
    "name": "Luffy",
    "description": "Captain of the Straw Hat Pirates",
    "universe": "One Piece",
    "species": "Human",
    "age": 19
  }
]
```

### GET /characters/search?name=substring

```http
GET http://localhost:8080/characters/search?name=Daen
```


```http
[
  {
    "characterId": 1,
    "name": "Daenerys Targaryen",
    "description": "Mother of Dragons",
    "universe": "Game of Thrones",
    "species": "Human",
    "age": 24
  }
]
```

## 5. Link to Demostration Video
Watch the demonstration of the API using Echo API in VS Code:

https://drive.google.com/drive/u/0/folders/1I3fFYGBlmV5o_gLzMT8KSHSKdYwzHVud

## 6. Link to Demosttration Video (Assignment 4 : MVC APP)
Watch the demostration of how a full stack web application is used to store data
https://www.loom.com/share/12715a91d99747ab808a54e61a73a15e