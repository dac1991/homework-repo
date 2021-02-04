from db.run_sql import run_sql

from models.team import Team 

def select(id):
    team = None
    sql = "SELECT * FROM team WHERE id = %s"
    values = [id]
    result = run_sql(sql, values)[0]

    if result is not None:
        team = Team(result['name'], result['id'] )
    return team

def select_all():
    teams = []
    sql = "SELECT * FROM teams"
    results = run_sql(sql)
    for result in results:
        team = Team(result["name"], result["id"])
        teams.append(team)
    return teams 

def save(team):
        sql = "INSERT INTO teams ( name ) VALUES ( %s ) RETURNING id"
        values = [team.name]
        results = run_sql( sql, values )
        team.id = results[0]['id']
        return team

def delete(id):
    sql = "DELETE FROM teams WHERE id = %s"
    values = [id]
    run_sql(sql, values)

def update(team):
    sql = "UPDATE teams SET name = %s WHERE id = %s"
    values = [team.name, team.id]
    run_sql(sql, values)

def delete_all():
    sql = "DELETE FROM teams"
    run_sql(sql)
