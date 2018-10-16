UPDATE repositories_contributors AS rc
        JOIN
    repositories AS r 
    ON r.id NOT IN (SELECT 
            Jc.repository_id
    FROM
    (SELECT 
       *
    FROM
    repositories_contributors) AS Jc) 
SET 
    rc.repository_id = r.id
WHERE
    rc.repository_id = rc.contributor_id;