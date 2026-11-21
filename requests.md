# Приклади запитів до API магазину спортивного харчування

## Перелік усіх добавок (картки)

```bash
curl http://localhost:8080/api/supplements
```

Очікувана відповідь — JSON-масив із короткою інформацією (id, name, brand, price, imageUrl).

---

## Одна добавка з деталями

```bash
curl http://localhost:8080/api/supplements/1
```

Очікувана відповідь — JSON-об'єкт із повною інформацією (включно з weightGrams, description, category, flavor).

---

## Інші добавки

```bash
curl http://localhost:8080/api/supplements/2
curl http://localhost:8080/api/supplements/3
curl http://localhost:8080/api/supplements/4
curl http://localhost:8080/api/supplements/5
```

---

## Неіснуюча добавка → 404

```bash
curl -i http://localhost:8080/api/supplements/999
```

Очікувана відповідь — HTTP-статус `404 Not Found`.
