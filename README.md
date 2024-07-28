# Project-24-Match-Schedule-Generator-
A class should be written in Java that creates a random match fixture for entered teams.


Rules:

A double round-robin league system will be applied. Each team will play two matches with other teams, one at home and one away.
The left side of the list shows the **home** team, and the right side shows the **away** team.
If an odd number of teams is entered, a team named "Bay" should be added to make it an even number. Teams matched with "Bay" will not play that week.

## Examples

### Scenario with even number of teams

Teams are

- Galatasaray
- Bursaspor
- Fenerbahce
- Besiktas
- Basaksehir
- Trabzonspor


Round 1

Galatasaray vs Bursaspor

Fenerbahce vs Basaksehir

Trabzonspor vs Besiktas



Round 2

Bursaspor vs Besiktas

Basaksehir vs Trabzonspor

Galatasaray vs Fenerbahce



Round 3

Fenerbahce vs Bursaspor

Trabzonspor vs Galatasaray

Besiktas vs Basaksehir



Round 4

Bursaspor vs Basaksehir

Galatasaray vs Besiktas

Fenerbahce vs Trabzonspor



Round 5

Trabzonspor vs Bursaspor

Besiktas vs Fenerbahce

Basaksehir vs Galatasaray



Round 6

Bursaspor vs Galatasaray

Basaksehir vs Fenerbahce

Besiktas vs Trabzonspor



Round 7

Besiktas vs Bursaspor

Trabzonspor vs Basaksehir

Fenerbahce vs Galatasaray



Round 8

Bursaspor vs Fenerbahce

Galatasaray vs Trabzonspor

Basaksehir vs Besiktas



Round 9

Basaksehir vs Bursaspor

Besiktas vs Galatasaray

Trabzonspor vs Fenerbahce



Round 10

Bursaspor vs Trabzonspor

Fenerbahce vs Besiktas

Galatasaray vs Basaksehir

### Scenario with odd number of teams

Teams are
- Galatasaray
- Bursaspor
- Fenerbahce
- Besiktas
- Basaksehir
- Bursaspor
- Boluspor



Round 1

Galatasaray vs Bay

Fenerbahce vs Boluspor

Trabzonspor vs Bursaspor

Besiktas vs Basaksehir



Round 2

Bay vs Basaksehir

Bursaspor vs Besiktas

Boluspor vs Trabzonspor

Galatasaray vs Fenerbahce



Round 3

Fenerbahce vs Bay

Trabzonspor vs Galatasaray

Besiktas vs Boluspor

Basaksehir vs Bursaspor



Round 4

Bay vs Bursaspor

Boluspor vs Basaksehir

Galatasaray vs Besiktas

Fenerbahce vs Trabzonspor



Round 5

Trabzonspor vs Bay

Besiktas vs Fenerbahce

Basaksehir vs Galatasaray

Bursaspor vs Boluspor



Round 6

Bay vs Boluspor

Galatasaray vs Bursaspor

Fenerbahce vs Basaksehir

Trabzonspor vs Besiktas



Round 7

Besiktas vs Bay

Basaksehir vs Trabzonspor

Bursaspor vs Fenerbahce

Boluspor vs Galatasaray



Round 8

Bay vs Galatasaray

Boluspor vs Fenerbahce

Bursaspor vs Trabzonspor

Basaksehir vs Besiktas



Round 9

Basaksehir vs Bay

Besiktas vs Bursaspor

Trabzonspor vs Boluspor

Fenerbahce vs Galatasaray



Round 10

Bay vs Fenerbahce

Galatasaray vs Trabzonspor

Boluspor vs Besiktas

Bursaspor vs Basaksehir



Round 11

Bursaspor vs Bay

Basaksehir vs Boluspor

Besiktas vs Galatasaray

Trabzonspor vs Fenerbahce



Round 12

Bay vs Trabzonspor

Fenerbahce vs Besiktas

Galatasaray vs Basaksehir

Boluspor vs Bursaspor



Round 13

Boluspor vs Bay

Bursaspor vs Galatasaray

Basaksehir vs Fenerbahce

Besiktas vs Trabzonspor



Round 14

Bay vs Besiktas

Trabzonspor vs Basaksehir

Fenerbahce vs Bursaspor

Galatasaray vs Boluspor
