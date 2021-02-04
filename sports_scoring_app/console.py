import pdb

from models.match import Match
from models.team import Team 
import repositories.team_repository as team_repository
import repositories.match_repository as match_repository


team_repository.delete_all()
match_repository.delete_all()

team_1 = Team("Celtic")
team_repository.save(team_1)

team_2 = Team("Rangers")
team_repository.save(team_2)

team_3 = Team("Hibernian")
team_repository.save(team_3)

team_4 = Team("Heart of Midlothian")
team_repository.save(team_4)

team_5 = Team("Aberdeen")
team_repository.save(team_5)

team_6 = Team("Kilmarnock")
team_repository.save(team_6)

match_1 = Match(team_1, team_2)
match_repository.save(match_1)

match_2 = Match(team_3, team_4)
match_repository.save(match_2)

match_3 = Match(team_5, team_6)
match_repository.save(match_3)

match_4 = Match(team_1, team_3)
match_repository.save(match_4)

match_5 = Match(team_2, team_4)
match_repository.save(match_5)

match_6 = Match(team_3, team_6)
match_repository.save(match_6)

pdb.set_trace()
