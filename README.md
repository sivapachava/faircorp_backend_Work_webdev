# Web programming Backend Project - Java Spring Boot

My development includes,

* 4 Entities - Building, Room, Window and Heater.
* 4 Data Transfer Objects(DTO) - BuildingDto, RoomDto, WindowDto and HeaterDto.
* 4 Data Access Objects (DAO) - BuildingDao, RoomDao, HeaterDao and WindowDao.
* I did 15 DAO unit tests and 23 endpoint unit tests.

## security-controller (User with admin role)

| HTTP method | URL | Comment |
|--|--|--|
| **GET** | /api/users | returns list of all users |
| **GET** | /api/users/{id}| returns a specific user by id|

## building-controller (User with admin role)

| HTTP method | URL | Comment |
|--|--|--|
| **GET** | /api/buildings | returns a list of all buildings|
| **GET** | /api/buildings/{id} | returns a specific building by id|
| **POST** | /api/buildings | creates a new building |
| **DELETE** | /api/buildings/{id} | deletes a specific building by id|

## room-controller (User with admin role)

| HTTP method | URL | Comment |
|--|--|--|
| **GET** | /api/rooms | returns a list of all rooms|
| **GET** | /api/rooms/{id} | returns a specific room by id|
| **POST** | /api/rooms | creates a new room |
| **DELETE** | /api/rooms/{id} | deletes a specificcroom by id|
| **PUT** | /api/rooms/{id}/switch-heater | changes a specific heater status by id in room, if it was ON it will turn OFF or if it was OFF it will turn ON|
| **PUT** | /api/rooms/{id}/switch-window | changes a specific window status by id in room, if it was in OPEN it will CLOSED or if it was in CLOSED it will OPEN|

## window-controller (User with admin role)

| HTTP method | URL | Comment |
|--|--|--|
| **GET** | /api/windows | returns a list of all windows|
| **POST** | /api/windows | creates a new window |
| **GET** | /api/windows/{id} | returns a specific window by id|
| **DELETE** | /api/windows/{id} | deletes a specific window by id|
| **PUT** | /api/windows/{id}/switch | changes a specific window status by id, if it was in OPEN it will  CLOSED or if it was in CLOSED it will OPEN|

## heater-controller (User with admin role)

| HTTP method | URL | Comment |
|--|--|--|
| **GET** | /api/heaters | returns a list of all heaters|
| **GET** | /api/heaters/{id} | returns a specific heater by id|
| **POST** | /api/heaters | creates a new heater |
| **DELETE** | /api/heaters/{id} | deletes a specific heater by id|
| **PUT** | /api/heaters/{id}/switch | changes a specific heater status by id, if it was ON it will turn OFF or if it was OFF it will turn ON|

Credentials for users:

* Role **ADMIN**
    * username: admin
    * password: adminPassword
* Role **USER**
    * username: user
    * password: userPassword
   
*To test end-points by using following link [Swagger](http://localhost:8080/swagger-ui/index.html#/)

