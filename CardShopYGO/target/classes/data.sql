insert into card (id, name, type) values (1, 'Dark Magician', 'Monster Spellcaster Normal')
insert into monster (id, card_id, attribute, attack) values (1, 1, 'DARK', 2500)
insert into normal_monster (id, monster_id, level, defense) values (1, 1, 7, 2100)

insert into card (id, name, type) values (2, 'Dark Magician Girl', 'Monster Spellcaster Effect')
insert into monster (id, card_id, attribute, attack) values (2, 2, 'DARK', 2000)
insert into effect_monster (id, monster_id, level, defense, effect) values (1, 2, 6, 1700, 'Gains 300 ATK for every Dark Magician or Magician of Black Chaos in the GY')

insert into card (id, name, type) values (3, 'Stardust Dragon', 'Monster Dragon Synchro')
insert into monster (id, card_id, attribute, attack) values (3, 3, 'WIND', 2500)
insert into synchro_monster(id, monster_id, level, defense, summoned_synchro) values (1, 3, 8, 2000, '1 Tuner + 1 or more non-Tuner monsters')

insert into card (id, name, type) values (4, 'Firewall Dragon', 'Monster Dragon Link')
insert into monster (id, card_id, attribute, attack) values (4, 4, 'LIGHT', 2500)
insert into link_monster (id, monster_id, link_rank, summoned_link) values (1, 4, 4, '2+ monsters')

insert into card (id, name, type) values (5, 'Dark Hole', 'Spell Normal')
insert into spell (id, card_id, effect) values (1, 5, 'Destroy all monsters on the field')

insert into card (id, name, type) values (6, 'Mirror Force', 'Trap Normal')
insert into trap (id, card_id, effect) values (1, 6, 'Destroy all your opponents attack positions monsters')