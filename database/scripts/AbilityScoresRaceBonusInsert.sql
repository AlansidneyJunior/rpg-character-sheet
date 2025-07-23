-- Humanos: +1 em todos os atributos
INSERT INTO ability_scores (strength, dexterity, constitution, intelligence, wisdom, charisma)
VALUES (1, 1, 1, 1, 1, 1);

-- Elfos: +2 Destreza
INSERT INTO ability_scores (strength, dexterity, constitution, intelligence, wisdom, charisma)
VALUES (0, 2, 0, 0, 0, 0);

-- Anões: +2 Constituição
INSERT INTO ability_scores (strength, dexterity, constitution, intelligence, wisdom, charisma)
VALUES (0, 0, 2, 0, 0, 0);

-- Meio-elfo: +2 Carisma, +1 em dois outros (ex: Destreza e Inteligência)
INSERT INTO ability_scores (strength, dexterity, constitution, intelligence, wisdom, charisma)
VALUES (0, 1, 0, 1, 0, 2);

-- Tiefling: +2 Carisma, +1 Inteligência
INSERT INTO ability_scores (strength, dexterity, constitution, intelligence, wisdom, charisma)
VALUES (0, 0, 0, 1, 0, 2);

-- Orc: +2 Força, +1 Constituição
INSERT INTO ability_scores (strength, dexterity, constitution, intelligence, wisdom, charisma)
VALUES (2, 0, 1, 0, 0, 0);

-- Halfling: +2 Destreza
INSERT INTO ability_scores (strength, dexterity, constitution, intelligence, wisdom, charisma)
VALUES (0, 2, 0, 0, 0, 0);
