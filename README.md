# Gift Service
Spring Cloud app with Docker Compose

## How to run project:
mvn clean install
docker-compose build
docker-compose up

docker-compose down - to stop containers

## How to test:
Import Postman collection "Guusto tech challenge.postman_collection"
from root directory to your Postman

### Requests
1) main request - POST "buy gift cards"
   http://localhost:8091/guusto-service/buy-gift
2) requests for balance:
    GET "get balance by id"
    POST "update balance by id"

### What were not finished:
1) Security requests to both micro-services (Balance, Giftcard)
2) Unit and integration tests