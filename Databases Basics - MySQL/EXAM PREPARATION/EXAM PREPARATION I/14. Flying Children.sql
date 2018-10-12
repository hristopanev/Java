SELECT DISTINCT
    c.customer_id,
    CONCAT_WS(' ', first_name, last_name) AS 'full_name',
    (2016 - YEAR(c.date_of_birth)) AS 'age'
FROM
    customers AS c
        JOIN
    tickets AS t ON t.customer_id = c.customer_id
        JOIN
    flights AS f ON f.flight_id = t.flight_id
        AND f.status LIKE ('Arrived')
WHERE
    (2016 - YEAR(c.date_of_birth)) < 21
ORDER BY age DESC, customer_id;