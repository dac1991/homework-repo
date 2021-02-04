from flask import Blueprint, Flask, redirect, render_template, request

from models.team import Team
import repositories.team_repository as team_repository

team_blueprint = Blueprint("team", __name__)

# Index
@team_blueprint.route("/teams")
def teams():
    teams = team_repository.select_all()
    return render_template("teams/index.html", teams=teams)


# New
@team_blueprint.route("/teams/new")
def new_team():
    return render_template("teams/new.html")


# Create
@team_blueprint.route("/teams", methods=["POST"])
def create_team():
    name = request.form["name"]
    new_team = Team(name)
    team_repository.save(new_team)
    return redirect("/teams")


# Edit
@team_blueprint.route("/teams/<id>/edit")
def edit_team(id):
    team = team_repository.select(id)
    return render_template('humans/edit.html', team=team)


# Update
@team_blueprint.route("/teams/<id>", methods=["POST"])
def update_teams(id):
    name = request.form["name"]
    team = Team(name, id)
    team_repository.update(teams)
    return redirect("/teams")


# Remove
@team_blueprint.route("/teams/<id>/delete", methods=["POST"])
def remove_team(id):
    team_repository.delete(id)
    return redirect("/teams")