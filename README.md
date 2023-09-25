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
#### Get total grocery items (count docs in Collection)

```
GET: http://localhost:8080/count
```

#### Get items by Category

```
GET: http://localhost:8080/items/category/{category}
```

#### Get items by name

```
GET: http://localhost:8080/items/name/{name}
```