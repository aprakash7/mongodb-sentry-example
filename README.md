# Grocery inventory example

- Spring boot
- MongoDB
- Sentry

## Endpoints:

#### Create Grocery List
```
POST: http://localhost:8080/create
{
    "id": "Test ID",
    "name" : "test name",
    "quantity": 5,
    "category": "munchies"
}
```
#### Get total count by Collection

```
GET: http://localhost:8080/count
```