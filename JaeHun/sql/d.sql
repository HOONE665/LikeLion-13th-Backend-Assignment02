use amusementpark;

SELECT
    visitors.name AS 방문객이름,
    rides.name AS 놀이기구이름
FROM
    visitors
JOIN
    rides
ON
    visitors.ride_id = rides.id;
