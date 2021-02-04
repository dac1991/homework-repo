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

@team_blueprint.route("/match")
def matches():
     matches = match_repository.select_all()
     return render_template("match/index.html", matches=matches)


@team_blueprint.route("/match/<id>")
def show_match(id):
     match = match_repository.select(id)
     return render_template("match/show.html", match=match)