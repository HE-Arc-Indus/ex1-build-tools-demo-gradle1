# Marche à suivre

## Se positionner dans le dossier dans lequel créer le projet
''' cd C:\Users\normand.paratte\Documents\JavaProjects
> gradle init --type java-application --> Initialisation du projet
Création(ou copie) des classes --> Attention aux packages (sous-dossiers)
settings.gradle --> Nom du projet --> rootProject.name = 'JavaProjects'
// Define the main class for the application
build.gradle --> Définir la classe principale --> mainClassName = 'ex1.MesPersonnes'

gradlew build --> Compilation
gradlew run --> Lance l'exécutable

gradlew tasks --> Toutes les commandes possibles