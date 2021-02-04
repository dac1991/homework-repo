DROP TABLE matches;
DROP TABLE teams;

CREATE TABLE matches (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255)
);

CREATE TABLE teams (
  id SERIAL PRIMARY KEY,
  team_name VARCHAR(255),
  name VARCHAR(255)
);