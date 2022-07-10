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
Answer for question No 03.
---
AS question says tasks should be exicuted according to the priority.So we have to use priority scheduling algorithem with different arrival times.

Priority scheduling is a non-preemptive algorithm and one of the most common scheduling algorithms in batch systems. Each process is assigned first arrival time (less arrival time process first) if two processes have same arrival time, then compare to priorities (highest process first). Also, if two processes have same priority then compare to process number (less process number first). This process is repeated while all process get executed.

**Implementation**

1.First input the task with their arrival time, burst time and priority.

2.First task will schedule, which have the lowest arrival time, if two or more task will have lowest arrival time, then whoever has higher priority will  schedule first.

3.Now further task will be schedule according to the arrival time and priority of the process. (Here we are assuming that lower the priority number having higher priority). If two task priority are same then sort according to process number.

4.Once all the task have been arrived, we can schedule them based on their priority.

Example task chart

| Task | Arrival Time | Execution Time | Priority |
|------|--------------|----------------|----------|
|   1  |       0      |        3       |     3    |
|   2  |       1      |        6       |     4    |
|   3  |       3      |        1       |     9    |
|   4  |       2      |        2       |     7    |
|   5  |       4      |        4       |     8    |



Thank You OREL IT For the opportunity.
