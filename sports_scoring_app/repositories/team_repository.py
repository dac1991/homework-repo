from db.run_sql import run_sql
from models.team import Team 

def select_all():
    teams = []
    sql = "SELECT * FROM teams"
    results = run_sql(sql)
    for result in results:
        team = Team(result["name"], result["id"])
        teams.append(team)
    return teams 


def delete(id):
    sql = "DELETE FROM teams WHERE id = %s"
    values = [id]
    run_sql(sql, values)

def update(teams):
    sql = "UPDATE teams SET name = %s WHERE id = %s"
    values = [team.name, team.id]
    run_sql(sql, values)