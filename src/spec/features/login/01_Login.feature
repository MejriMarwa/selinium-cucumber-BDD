@login @smokeTest @tr @sanityTest
Feature: Je souhaite tester la page login de l'application Demo Web Shop
ETQ utilisateur je souhaite tester la page connexion de l'application Demo Web Shop

@login_validCredentials
Scenario: Je souhaite tester la page login avec des données valides
Given Je me connecte sur le site Demo Web Shop
When Je clique sur le bouton login
And Je saisis une adresse email
And Je saisis le mot de passe
And Je clique sur le bouton login
Then Je me redirige vers la page home