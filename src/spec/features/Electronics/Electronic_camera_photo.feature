@electronics @smokeTest @tr @sanityTest
Feature: Tester l'ajout d'un produit de la catégorie Electronics sur Demo Web Shop
ETQ  je souhaite ajouter un produit de la catégorie Electronics afin de vérifier son ajout à la liste de comparaison.

Background:
Given Je me connecte sur le site Demo Web Shop

@electronics_Camera_Photo
Scenario: Ajouter un produit de la catégorie Camera & Photo à la liste de comparaison
When Je clique sur le bouton Electronics dans le menu
And Je clique sur la catégorie
And Je sélectionne un produit Electronics
And Je clique sur le bouton 
Then Je suis redirigé vers la page Comparaison produit
