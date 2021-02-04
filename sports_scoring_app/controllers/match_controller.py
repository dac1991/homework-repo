from flask import Blueprint, Flask, redirect, render_template, request

from models.match import Match
from models.team import Team
import repositories.match_repository as match_repository

match_blueprint = Blueprint("match", __name__)
team_blueprint = Blueprint("team", __name__)

# @app.route('/<home_team_goals>/<away_team_goals')
# def play(home_team_goals, away_team_goals):
#     home_team = Team("Home Team", home_team_goals)
#     away_team = Team("Away Team", away_team_goals)
#     match = Match()

#     winner = match.play(home_team, away_team)

# Index
@match_blueprint.route("/match")
def matches():
     matches = match_repository.select_all()
     return render_template("match/index.html", match=match)

# Show Match
@match_blueprint.route("/match/<id>")
def show_match(id):
     match = match_repository.select(id)
     return render_template("match/show.html", match=match)

# New
@match_blueprint.route("/match/new")
def new_match():
    return render_template("match/new.html")


# Create
@match_blueprint.route("/match", methods=["POST"])
def create_match():
    name = request.form["name"]
    new_match = Match(name)
    team_repository.save(new_match)
    return redirect("/match")


# Edit
@match_blueprint.route("/match/<id>/edit")
def edit_match(id):
    match = match_repository.select(id)
    return render_template('match/edit.html', match=match)


# Update
@match_blueprint.route("/match/<id>", methods=["POST"])
def update_match(id):
    name = request.form["name"]
    match = Match(name, id)
    match_repository.update(match)
    return redirect("/match")


# Remove
@team_blueprint.route("/match/<id>/delete", methods=["POST"])
def remove_match(id):
    match_repository.delete(id)
    return redirect("/match")