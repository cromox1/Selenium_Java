# PhoneBook API

This project is the solution to one of the challenges presented on a hiring platform.

## Data Modeling

A contact is CRUDed and stored as an `Entry` through the application. It follows the models:

```
type Entry struct {
	nickname   String   `json:"nickname"`
	password   String   `json:"password"`
	Firstname  String   `json:"firstName"`
	Lastname   String   `json:"lastName"`	
	Phones     String   `json:"phones"`
	Email      String   `json:"email"`	
	Notes      string   `json:"notes"`
}
```

Where at least the `nickname` cannot be empty string. This is the main entry point of the RESTfull website (or sometimes known as `ID`)

## Accessing the API

Using Postman, curl or any other REST client tool (in python, java or C#).
`https://www.getpostman.com` , `https://curl.haxx.se/docs/manpage.html` 

to below URLs :
1) http://localhost:8080/users
2) http://localhost:8080/users/{username}

#### POST - Create Entry

This json follows the structure layed out for the `Entry` model up above. 

For authorization, we need to use `username` + `password` to allow the data been put to the PhoneBook database.

\# curl -kv -u "admin:password" -H "Content-Type: application/json" -X POST -d '{
	   "nickname": "userone",
        "password": "password",
        "phones": "+44-1234-567890",
        "email": "anyemail@gmail.com",
        "notes": "I am administrator",
        "lastName": "PhoneBook",
        "firstName": "UserOne"
}' "http://localhost:8080/users"

#### GET - Get All Users Entry

\# curl -kv -u "anonymous:anonymous" -X GET "http://localhost:8080/users"

will get all the users entry

#### GET - Get Specific User Entry

Need to know user ID (in this database know as 'nickname'). You can use information from above REST GET for all users above.

\# curl -kv -u "anonymous:anonymous" -X GET "http://localhost:8080/users/{nickname}"

#### PUT - Update Entry

To update an entry, the entire entry must be resubmitted with only the desired fields changed. 
If an empty body is submitted all fields will then assume their default zero value, except `nickname` which will maintain their previous state.
The URL also need to have base URL + user's nickname.

\# curl -kv -u "admin:password" -H "Content-Type: application/json" -X PUT -d '{
	   "nickname": "userone",
        "password": "userone",
        "phones": "+44-1357-654321",
        "email": "userone@phonebook.com",
        "notes": "No Notes",
        "lastName": "Last",
        "firstName": "First"
}' "http://localhost:8080/users/userone"

#### DELETE - Delete Entry

To delete the specific entry, you need to have user's nickname.

\# curl -kv -u "admin:password" -H "Content-Type: application/json" -X DELETE "http://localhost:8080/users/{nickname}"


#### Useful information

I use :
1) Spring Framework - for the RESTfull webservice application
2) MySQL server - for my data persistent of the Database that I created.
3) Other tools - JUnit4, Json (org.json) and RestAssured (REST client)


