@wishlist @smoketest
Feature: Je souhaite tester la page wishlist de l'application Demo Web Shop

Background:
Given Je me connecte sur le site Demo Web Shop
When Je clique sur le bouton log in
And Je saisis une adresse email
And Je saisis le mot de passe
And Je clique sur le bouton login 
Then Je me redirige vers la page home "ichrafbenmohamed@gmail.com"

 @wishlist
 Scenario: Je souhaite tester la page wishlist vide 
 When Je clique sur le bouton wishlist 
 Then Je verifie que le message empty s'affiche "The wishlist is empty!"