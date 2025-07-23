-- Guerreiro
INSERT INTO class_type (name, description, hit_die, primary_ability, saving_throws)
VALUES (
  'Fighter',
  'A master of martial combat, skilled with a variety of weapons and armor.',
  'D10',
  'STR',
  '["STR", "CON"]'::jsonb
);

-- Ladino
INSERT INTO class_type (name, description, hit_die, primary_ability, saving_throws)
VALUES (
  'Rogue',
  'A scoundrel who uses stealth and trickery to overcome obstacles and enemies.',
  'D8',
  'DEX',
  '["DEX", "INT"]'::jsonb
);

-- Mago
INSERT INTO class_type (name, description, hit_die, primary_ability, saving_throws)
VALUES (
  'Wizard',
  'A scholarly magic-user capable of manipulating the structures of reality.',
  'D6',
  'INT',
  '["INT", "WIS"]'::jsonb
);

-- Clérigo
INSERT INTO class_type (name, description, hit_die, primary_ability, saving_throws)
VALUES (
  'Cleric',
  'A priestly champion who wields divine magic in service of a higher power.',
  'D8',
  'WIS',
  '["WIS", "CHA"]'::jsonb
);

-- Bárbaro
INSERT INTO class_type (name, description, hit_die, primary_ability, saving_throws)
VALUES (
  'Barbarian',
  'A fierce warrior of primitive background who can enter a battle rage.',
  'D12',
  'STR',
  '["STR", "CON"]'::jsonb
);

-- Paladino
INSERT INTO class_type (name, description, hit_die, primary_ability, saving_throws)
VALUES (
  'Paladin',
  'A holy warrior bound to a sacred oath.',
  'D10',
  'CHA',
  '["WIS", "CHA"]'::jsonb
);

-- Bardo
INSERT INTO class_type (name, description, hit_die, primary_ability, saving_throws)
VALUES (
  'Bard',
  'An inspiring magician whose power echoes the music of creation.',
  'D8',
  'CHA',
  '["DEX", "CHA"]'::jsonb
);
