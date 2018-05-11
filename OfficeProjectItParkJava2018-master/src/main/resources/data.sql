INSERT INTO users (username, password, role, slack_id)
VALUES ('admin', '{noop}admin', 'ADMIN', 'UAD5LG6KY');
INSERT INTO users (username, password, role, slack_id)
VALUES ('Salavat', '{noop}salavat', 'USER', 'UAD5LG6KY');
INSERT INTO users (username, password, role, slack_id)
VALUES ('Andrey', '{noop}andrey', 'USER', 'UAMSMQS2D');
INSERT INTO users (username, password, role, slack_id)
VALUES ('Nick', '{noop}nick', 'USER', 'UADA6JZ9V');
INSERT INTO users (username, password, role, slack_id)
VALUES ('RookAndPawn', '{noop}rookandpawn', 'USER', 'UAND7TH8S');
INSERT INTO users (username, password, role, slack_id)
VALUES ('Kamilya', '{noop}kamilya', 'USER', 'UABHLB4QG');
INSERT INTO users (username, password, role, slack_id)
VALUES ('Peter', '{noop}peter', 'USER', 'UANJ1D4HK');


INSERT INTO groups (name)
VALUES ('testgroup1');
INSERT INTO groups (name)
VALUES ('testgroup2');
INSERT INTO groups (name)
VALUES ('testgroup3');

INSERT into users_groups (users_id, groups_id) VALUES (1, 1);
INSERT into users_groups (users_id, groups_id) VALUES (2, 1);
INSERT into users_groups (users_id, groups_id) VALUES (3, 1);
INSERT into users_groups (users_id, groups_id) VALUES (4, 2);
INSERT into users_groups (users_id, groups_id) VALUES (5, 2);
INSERT into users_groups (users_id, groups_id) VALUES (6, 3);
INSERT into users_groups (users_id, groups_id) VALUES (7, 3);