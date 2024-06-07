# Organization Service

## Описание

Это Spring Boot приложение для управления организациями. 
Оно предоставляет REST API для получения данных об организациях и их филиалах.

## Настройка проекта

### Требования

- Java 17
- PostgreSQL
- Maven

### Настройки

#### application.properties

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/organizationdb
spring.datasource.username=username
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=none
spring.liquibase.change-log=classpath:db/changelog/db.changelog-master.yaml
```

# Использование REST API

## Получение списка организаций
URL: /api/organizations
Метод: GET

## Параметры запроса:
search (опционально) - строка для фильтрации организаций по полному или сокращенному наименованию

## Пример запроса:
curl -X GET "http://localhost:8080/api/organizations?search=Example" -H "accept: application/json"

## Пример ответа:
```
[
  {
    "id": "123e4567-e89b-12d3-a456-556642440000",
    "fullName": "Example Organization",
    "shortName": "ExOrg",
    "inn": "1234567890",
    "ogrn": "1234567890123",
    "postalAddress": "123 Example St",
    "legalAddress": "456 Legal St",
    "directorName": "John Doe",
    "directorBirthDate": "1970-01-01"
  },
  ...
]
```


### Получение организации по идентификатору

```
URL: /api/organizations/{organizationId}
Метод: GET
Параметры запроса:
organizationId - уникальный идентификатор организации
Пример запроса:
curl -X GET "http://localhost:8080/api/organizations/123e4567-e89b-12d3-a456-556642440000" -H "accept: application/json"
```

## Пример ответа:

```
{
  "id": "123e4567-e89b-12d3-a456-556642440000",
  "fullName": "Example Organization",
  "shortName": "ExOrg",
  "inn": "1234567890",
  "ogrn": "1234567890123",
  "postalAddress": "123 Example St",
  "legalAddress": "456 Legal St",
  "directorName": "John Doe",
  "directorBirthDate": "1970-01-01",
  "branches": [
    {
      "id": "223e4567-e89b-12d3-a456-556642440001",
      "name": "Branch 1",
      "postalAddress": "456 Branch St",
      "headName": "Jane Doe",
      "headBirthDate": "1975-01-01"
    },
    ...
  ]
}
```

