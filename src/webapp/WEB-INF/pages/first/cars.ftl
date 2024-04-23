<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Thymeleaf Table</title>
</head>
<body>
<table th:if="${cars != null}" th:object="${cars}" border="1">
    <thead>
    <tr>
        <th>Марка</th>
        <th>Модель</th>
        <th>Год выпуска</th>
    </tr>
    </thead>
    <tbody>
    <tr th:each="car : ${cars}">
        <td th:text="${car.brand}">Марка</td>
        <td th:text="${car.model}">Модель</td>
        <td th:text="${car.year}">Год выпуска</td>
    </tr>
    </tbody>
</table>
</body>
</html>