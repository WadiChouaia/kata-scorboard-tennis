# kata-scorboard-tennis
Il est demandé de réaliser un scoreboard de tennis :
Le résultat attendu, est un match aléatoire qui se joue entre les deux joueurs ou l’historique de l’évolution
des scores est affiché, cette évolution doit respecter les règles de gestion suivantes :
Une partie de tennis se joue entre deux joueurs :
Règles de gestion pour gagner la partie :
Le gagnant du match est le premier à arriver à deux sets.
Règles de gestion pour gagner un set.
Le gagnant du set est le premier à atteindre 6 jeux, ou 7 jeux si son adversaire est parvenu à cumuler 5
jeux.
La différence de jeu doit être toujours supérieur ou égale à 2 pour avoir un vainqueur.
Toutefois, en cas d’égalité 6 jeux partout, un jeu décisif a lieu pour départager les joueurs, le premier à
atteindre 7 points est le gagnant du set, au cas où les deux joueurs arrivent à 6 points partout, le tie break
continuera jusqu’à ce qu’un joueur cumule un nombre de points supérieur de deux points à son adversaire
(8-6) (11-13).
Règles de gestion pour un gagner un jeu
Quand un joueur marque son premier point, son compteur est valorisé à 15.
Quand un joueur marque son deuxième point, son compteur est valorisé à 30.
Quand un joueur marque son troisième point, son compteur est valorisé à 40.
Quand un joueur marque un quatrième point, et que son adversaire n’a cumulé que 2 points ou moins, il
gagne le jeu.
Quand les deux joueurs ont marqué le même nombre de points et que ce nombre de points est supérieur
ou égale à 3, le compteur de chaque joueur est valorisé à Egalité.
Quand les deux joueurs ont marqué un nombre de points supérieur ou égale à 3, et que l’un des deux
joueurs en a marqué un de plus (exemple joueur 1 : 7, joueur 2 : 6), le score du joueur qui marqué le point
de plus est valorisé à avantage, et le second à 40.
Le vainqueur du jeu doit impérativement marquer 2 points de plus que son adversaire pour le gagner.
