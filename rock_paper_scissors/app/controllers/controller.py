from app import app
from app.models.game import Game
from app.models.player import Player
from flask import render_template

@app.route('/<player1_choice>/<player2_choice>')
def play(player1_choice, player2_choice):
    player1 = Player("Player 1", player1_choice)
    player2 = Player("Player 2", player2_choice)
    game = Game()

    winner = game.play(player1, player2)
    
    return render_template("game.html", player1=player1, player2=player2, winner=winner)