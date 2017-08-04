# CRUD using Spring Boot

### Introduction
Implementation of CRUD operations using JPA and PostgreSQL database.

### Relations
* **Users:** 
  * It contains following fields: id, username, password, email
* **Followers:**
  * It contains following fields: id, follower_id (reference user(id)), following_id (reference user(id))
* **Posts:**
  * It contains following fields: id, user_id (reference user(id)), post

### APIs
* **/SignUp:** It is a post request that requests user details as paramaters and saves it in "users" table.
* **/login:**
