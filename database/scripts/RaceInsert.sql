-- Humanos (ID 1 em ability_scores)
INSERT INTO race (id, name, description, speed, dark_vision, size, ability_scores_id)
VALUES (
    1,
    'Human',
    'Versatile and ambitious, humans are the most adaptable of all races.',
    30,
    FALSE,
    'MEDIUM',
    1
);

-- Elfos (ID 2)
INSERT INTO race (id, name, description, speed, dark_vision, size, ability_scores_id)
VALUES (
    2,
    'Elf',
    'Graceful and magical people, with keen senses and a deep connection to nature.',
    30,
    TRUE,
    'MEDIUM',
    2
);

-- Anões (ID 3)
INSERT INTO race (id, name, description, speed, dark_vision, size, ability_scores_id)
VALUES (
    3,
    'Dwarf',
    'Stout and strong, dwarves are known for their resilience and craftsmanship.',
    25,
    TRUE,
    'MEDIUM',
    3
);

-- Halfling (ID 4)
INSERT INTO race (id, name, description, speed, dark_vision, size, ability_scores_id)
VALUES (
    4,
    'Halfling',
    'Small and nimble, halflings are cheerful and optimistic.',
    25,
    FALSE,
    'SMALL',
    4
);

-- Tiefling (ID 5)
INSERT INTO race (id, name, description, speed, dark_vision, size, ability_scores_id)
VALUES (
    5,
    'Tiefling',
    'Heirs of an infernal legacy, tieflings are marked by their otherworldly blood.',
    30,
    TRUE,
    'MEDIUM',
    5
);

-- Meio-Orc (ID 6)
INSERT INTO race (id, name, description, speed, dark_vision, size, ability_scores_id)
VALUES (
    6,
    'Half-Orc',
    'Brutal and fierce, half-orcs inherit the strength of their orc ancestry.',
    30,
    TRUE,
    'MEDIUM',
    6
);

-- Gnome (ID 7)
INSERT INTO race (id, name, description, speed, dark_vision, size, ability_scores_id)
VALUES (
    7,
    'Gnome',
    'Curious and inventive, gnomes are known for their intellect and humor.',
    25,
    TRUE,
    'SMALL',
    7
);
