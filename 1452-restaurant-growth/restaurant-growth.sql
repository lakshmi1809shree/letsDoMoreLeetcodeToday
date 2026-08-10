# Write your MySQL query statement below
Select visited_on,amount,average_amount
from(select distinct visited_on ,sum(amount) over
   (order by visited_on RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW) as amount,
    Round(sum(amount) over (order by visited_on RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW)/7,2) AS average_amount
from Customer) as whole_totals
where datediff(visited_on ,(select min(visited_on)from Customer))>=6