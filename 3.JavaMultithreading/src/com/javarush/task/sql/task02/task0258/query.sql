-- Write your code here:
SELECT position, GROUP_CONCAT(name SEPARATOR ', ') AS employee_names
FROM employee
GROUP BY position
