from db.run_sql import run_sql
from models.match import Match
from models.team import Team
import repositories.team_repository

def select_all():
    match = []
    sql = "SELECT * FROM matches"
    results = run_sql(sql)
    for result in results:
        match = Match(result["name"], result["id"])
        match.append(match)
    return match

def select(id):
    match = None
    sql = "SELECT * FROM match WHERE id = %s"
    values = [id]
    result = run_sql(sql, values)[0]

    if result is not None:
        match = Match(result['name'], result['id'] )
    return match

def save(match):
    sql = "INSERT INTO matches( name ) VALUES ( %s ) RETURNING id"
    values = [match.name]
    results = run_sql( sql, values )
    match.id = results[0]['id']
    return match

def delete(id):
    sql = "DELETE FROM teams WHERE id = %s"
    values = [id]
    run_sql(sql, values)

def update(team):
    sql = "UPDATE teams SET name = %s WHERE id = %s"
    values = [team.name, team.id]
    run_sql(sql, values)

def delete_all():
    sql = "DELETE FROM matches"
    run_sql(sql)
