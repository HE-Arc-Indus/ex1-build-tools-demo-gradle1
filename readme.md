# Marche à suivre

## Se positionner dans le dossier dans lequel créer le projet
``` cd C:\Users\normand.paratte\Documents\JavaProjects ```
## Initialisation du projet (Création des dossiers et fichiers de base)
``` gradle init --type java-application ```

## Création(ou copie) des classes --> Attention aux packages (sous-dossiers)

## Affectation des paramètres dans le fichier settings.gradle
```  Nom du projet : rootProject.name = 'JavaProjects' ```

## Définir la classe principale dans le fichier build.gradle
``` mainClassName = 'ex1.MesPersonnes'```

## Compilation
``` gradlew build ```
## Lance l'exécutable
``` gradlew run ```