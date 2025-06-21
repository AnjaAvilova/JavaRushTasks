-- Write your code here:
with tempTable(averageGrassed) as (select avg(grossed) from films)
with tempTable2 as (select avg(year_released) as averageYearReleased from films)
select films.title, films.genre, films.year_released, films.grossed
from films, tempTable, tempTable2
where films.grossed>tempTable.averageGrassed and
      films.year_released>tempTable2.averageYearReleased
group by films.title, films.genre, films.year_released, films.grossed