class Game():
    def __init__(self):
        self.show_win = {
            "rock" : "scissors",
            "paper" : "rock",
            "scissors" : "paper"
             
        }

    def play(self, player1, player2):

        winner = None

        if self.show_win[player1.choice.lower()] == player2.choice.lower():
            winner = player1
        elif self.show_win[player2.choice.lower()] == player1.choice.lower():
            winner = player2

            return winner
