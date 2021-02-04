from flask import Blueprint, Flask, redirect, render_template, request

from models.team import Team
import repositories.team_repository as team_repository

team_blueprint = Blueprint("team", __name__)

@team_blueprint.route("/team")
def teams():
     teams = team_repository.select_all()
     return render_template("team/index.html", teams=teams)


@team_blueprint.route("/team/<id>")
def show_team(id):
     team = team_repository.select(id)
     return render_template("team/show.html", team=team)