@registration @smoketest
Feature: Je souhaite tester la page registration de l'application Demo Web Shop
ETQ utilisateur je souhaite tester la page registration de l'application Demo Web Shop 

Background:
Given Je me connecte sur le site Demo Web Shop


@registration_account
Scenario Outline: Tester la page d'inscription avec des données valides
  When Je clique sur le bouton register dans le barMenu
  And Je choisis le genre
  And Je saisis le prenom "<prenom>"
  And Je saisis le nom "<nom>"
  And Je saisis adresse mail "<email>"
  And Je saisis un mot de passe "<motDePasse>"
  And Je ressaisis le mot de passe "<confirmationMotDePasse>"
  And Je clique sur le bouton register
  Then Je me redirige vers la page de confirmation de registration
Examples:
  | prenom | nom                  | email                               | motDePasse | confirmationMotDePasse |
  | Marwa  | Mejri                | mejrimarwa@gmail.com                | Abcd123    | Abcd123                |
  | Ali    | Ben Salah            | ali.bensalah@gmail.com              | Test1234   | Test1234               |
  | Sara   | Trabelsi             | sara.trabelsi@gmail.com             | Sara123    | Sara123                |