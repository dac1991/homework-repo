from flask import Blueprint, Flask, redirect, render_template, request

from models.match import Match

@app.route('/<home_team_goals>/<away_team_goals')
def play(home_team_goals, away_team_goals):
    home_team = Team("Home Team", home_team_goals)
    away_team = Team("Away Team", away_team_goals)
    match = Match()

    winner = match.play(home_team, away_team)