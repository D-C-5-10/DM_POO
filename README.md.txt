
lien vers github repo : https://github.com/D-C-5-10/DM_POO
#partie 1

##Etape5
*Web*
Nous permet de créer des applications Web, y compris RESTful, à l'aide de Spring MVC. 
Utilise Apache Tomcat comme conteneur intégré par défaut
*JPA*
Sert à persister les données dans les magasins SQL avec l'API Java Persistence à l'aide de Spring Data et Hibernate.
*Hibernate*
Hibernate est un framework open source gérant la persistance des objets en base de données relationnelle.
*H2*
H2 est un système de gestion de base de données relationnelles écrit en Java. 
Il peut être intégré à une application Java ou bien fonctionner en mode client-serveur.
*Devtools*
Fournit des redémarrages rapides des applications, LiveReload et des configurations pour une expérience de développement améliorée.
*Thymeleaf*
Un moteur de modèle Java moderne côté serveur pour les environnements Web et autonomes. 
Permet au HTML d'être correctement affiché dans les navigateurs et en tant que prototypes statiques.
##Etape13
1. On a utiliser l'annotaion @GetMapping 
2. Avec la methode greeting qui retourne la page greeting (return greeting) suite à une requete Get
3. En specifiant en Parametre <nameGET=Nom > 
##Etape18
Par défault la console web pour la base données en mémoire est désactivée , donc dans la configuration qu'on a ajoutée dans application.properties
(spring.h2.console.enabled =true) on l'a activée, aussi on a specifié l'url de connexion avec le nom de base de données testdb(spring.datasource.url =jdbc:h2:mem:testdb)
et on a ajouter le username (spring.datasource.username =sa).
maintenant qu'on a notre base de données in memory préte et configurée,dans le modéle Adresse il y a les annotations suivantes:
@Entity : pour marquer cette classe comme entité bean
@id : utilisée pour spécifier la propriété d'identificateur de l'entité. 
Le placement de l'annotation @Id détermine la stratégie d'accès par défaut qu'Hibernate utilisera pour le mappage.
Si l'annotation @Id est placée sur au dessus du champ, l'accès par champ sera utilisé. 
Au lieu de cela, s'il est placé sur la méthode getter de ce champ, l'accès à travers la propriété sera utilisé.
Ici, nous utilisons l'accès par champ.
@GeneratedValue : pour spécifier la géneration du clé primaire.
Ici c'est par défault AUTO.
Maintenant cette entité est préte pour étre mapper dans une table dans la base de données in-memory.
##Etape 20 
le contenu est bien affiché 
##Etape23
l'annotation @Autowired est utilisée dans le Spring framework pour l'injection de dépendance.
normalement il faut ajouter des configurations comme (@Configuration et @ComponentScan("com.baeldung.autowire.sample"))
mais dans springboot il suffit d'ajouter l'annotaion @SpringBootApplication pour activer les annotaions d'injection de dépendences.
En conséquence, lorsque nous exécutons cette application Spring Boot, elle analysera automatiquement les composants du package actuel
et de ses sous-packages. 
Ainsi, il les enregistrera dans le contexte d'application de Spring, et nous permettra d'injecter des beans en utilisant @Autowired.
##Etape30
Il y a deux méthodes pour inclure Bootstrap dans le projet
1. Via CDN(Content Delivery Network): elle consiste à ajouter des liens <link> qui se trouvent dans le site "getbootstrap.com" dans le header 
du fichier html ,aussi il faut ajouter des scripts <scripts> pour JQuery parce certains composants de boostrap dependent sur 
jquery.Popper.js.
cette méthode est rapide, facile et ne nécéssite pas un téléchargement mais il faut étre toujours connécté(ne fonctionne pas hors ligne)
2. Self-hosted: consiste à télécharger les fichiers manuellement via "getbootstrap.com" copier les deux fichiers bootstrap.min.css/.js
et les ajouter dans le projet comme ressources statiques , finalement on les appels en utilisant tymeleaf dans les headers
des fichiers html.
J'ai choisi d'utiliser la premiére méthode
#partie 2
##Etape6
1. Oui il faut avoir une clé API 
2. Celui qui nous permet de demander les données météo à partir du coordonnées gpc : (api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key})
 il est possible d'ajouter des parametres supplémentaires comme (units : unité de mesure/lang : lange de reponse/mode format de reponse)
3. méthode Get
4. il faut ajouter les paramétres dans l'url comme ça : ?param1=valeur&param2=valeur...
dans le code j'ai utilisé la méthode "format" du classe String pour ajouter les paramétres dans l'url
5. La donnée de température se trouve dans le retour de l'api openweathermap dans main.temp :
"main":{"temp":28.33,...}
la donnée de prévision météo se trouve dans le retour de l'api openwheathermap dans weather.description
"weather":[{"...,"description":"couvert",..."}]

 