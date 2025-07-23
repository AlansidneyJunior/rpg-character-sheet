-- Populando a tabela proficiency com nomes únicos e aspas corretamente escapadas

INSERT INTO proficiency (type, name) VALUES
-- ARMOR
('ARMOR', 'Light Armor'),
('ARMOR', 'Medium Armor'),
('ARMOR', 'Heavy Armor'),
('ARMOR', 'Shield'),

-- WEAPON
('WEAPON', 'Simple Weapons'),
('WEAPON', 'Martial Weapons'),
('WEAPON', 'Longsword'),
('WEAPON', 'Shortbow'),
('WEAPON', 'Crossbow'),
('WEAPON', 'Dagger'),

-- TOOL
('TOOL', 'Thieves'' Tools'),
('TOOL', 'Smith''s Tools'),
('TOOL', 'Brewer''s Supplies'),
('TOOL', 'Calligrapher''s Supplies'),

-- SKILL
('SKILL', 'Athletics'),
('SKILL', 'Stealth'),
('SKILL', 'Arcana'),
('SKILL', 'History'),
('SKILL', 'Perception'),
('SKILL', 'Survival'),

-- SAVING_THROW
('SAVING_THROW', 'Strength'),
('SAVING_THROW', 'Dexterity'),
('SAVING_THROW', 'Constitution'),
('SAVING_THROW', 'Intelligence'),
('SAVING_THROW', 'Wisdom'),
('SAVING_THROW', 'Charisma');
