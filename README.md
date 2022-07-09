TECHNICAL ASSESSMENT(Spring boot)-OREL IT
===
---
1.	User profile with registration using mobile no and email and store in MySQL database
2.	Develop a rest service to return a list of registered users.
3.	In same project, you need to design a scheduler that to schedule a set of tasks. A
      number of the tasks need to wait for some other tasks to complete prior to running
      themselves. What algorithm could we use to design the schedule and how would we
      implement it?
4.	In the same project Develop a rest service for exception handling and logging. 


---

_Instructions_

*Update application.properties file before you begin.

*Please Create a User in the database for testing with followings.
    
* username ="ADMIN"
* role ="ADMIN"
*password="$2a$12$qSGYdGXU64dMbiFTyr68TOmzBcsHvlLMCilPb00AWD0aGpoYLRKgm"

keep other columns as you want.

Use above username and password for api basic authentication
# APIs
**List all users in the table**
```
user/getUsers
```
![image info](https://github.com/Geetdts/Orelassesment/blob/main/Screenshots/getUserList.png)

**Save an users to the table**
```
user/saveUser
```
![image info](https://github.com/Geetdts/Orelassesment/blob/main/Screenshots/SaveUser.png)

**Update an user**
```
user/updateUser
```
![image info](https://github.com/Geetdts/Orelassesment/blob/main/Screenshots/UpdateUser.png)

**Delete an user**
```
user/deleteUser
```
![image info](https://github.com/Geetdts/Orelassesment/blob/main/Screenshots/DeleteUser.png)

**Find a user**
```
user/getUserByUserID/{userID}
```
![image info](https://github.com/Geetdts/Orelassesment/blob/main/Screenshots/GetUserByID.png)

---


Thank You OREL IT For the opportunity.
