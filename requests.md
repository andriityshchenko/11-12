# Приклади запитів до API магазину спортивного харчування

## 1. Перелік усіх добавок (картки)

```bash
curl http://localhost:8080/api/supplements
```

## 2. Фільтр за категорією

```bash
curl "http://localhost:8080/api/supplements?category=Протеїн"
curl "http://localhost:8080/api/supplements?category=Креатин"
curl "http://localhost:8080/api/supplements?category=Амінокислоти"
```

## 3. Одна добавка з деталями

```bash
curl http://localhost:8080/api/supplements/1
curl http://localhost:8080/api/supplements/2
curl http://localhost:8080/api/supplements/3
```

## 4. Створити нову добавку (201 Created)

```bash
curl -i -X POST http://localhost:8080/api/supplements \
  -H "Content-Type: application/json" \
  -d '{"name":"Casein Gold Standard","brand":"Optimum Nutrition","price":1950.00,"weightGrams":1820,"imageUrl":"/images/casein-gold.jpg","description":"Міцелярний казеїн для тривалого живлення м язів. Ідеальний перед сном.","category":"Протеїн","flavor":"Шоколад"}'
```

## 5. Оновити добавку (200 OK / 404 Not Found)

```bash
curl -i -X PUT http://localhost:8080/api/supplements/1 \
  -H "Content-Type: application/json" \
  -d '{"name":"100% Whey Gold Standard","brand":"Optimum Nutrition","price":1999.00,"weightGrams":2270,"imageUrl":"/images/whey-gold.jpg","description":"Оновлений опис: преміальний сироватковий протеїн.","category":"Протеїн","flavor":"Ваніль"}'
```

## 6. Видалити добавку (204 No Content / 404 Not Found)

```bash
curl -i -X DELETE http://localhost:8080/api/supplements/3
```

## 7. Неіснуюча добавка → 404

```bash
curl -i http://localhost:8080/api/supplements/999
curl -i -X PUT http://localhost:8080/api/supplements/999 \
  -H "Content-Type: application/json" \
  -d '{"name":"Тест","brand":"Тест","price":100.00,"weightGrams":100,"imageUrl":"/x.jpg","description":"Тест","category":"Тест","flavor":"Тест"}'
curl -i -X DELETE http://localhost:8080/api/supplements/999
```
