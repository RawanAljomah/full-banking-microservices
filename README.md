<h1>Compte Rendu : "Full Banking Project"</h1>
<h2>Partie 1 : Front-End</h2>
<h3>la liste des produits :</h3>
<img src="screenshots/frontendproducts.png">
<h3>la liste des clients :</h3>
<img src="screenshots/fecustomers.png">
<h3>Chaque client contient une liste des ordres (bouton vert):</h3>
<img src="screenshots/feorders.png">
<h3>Cette page contient les details de chaque ordre</h3>
<img src="screenshots/feorderdetails.jpeg">
<h3>Pour configurer CORS dans la gateway-service</h3>
<img src="screenshots/CORS.jpg">
<h2>Partie 2: Back-End</h2>
<h3>Les services sont enregistrés dans Consul :</h3>
<img src="screenshots/backend-consul.jpeg">
<h3>1)-Consul Config</h3>
<p>Pour utiliser Concul Config il faut tout d'abord ajouter la dependance suivante :</p>
<img src="screenshots/consuldependency.jpg">
<p>L'interface Concul où on a enregistrer notre configuration :</p>
<img src="screenshots/bectokens.jpg">
<p>Pour utiliser la configuration dans chaque microservice on doit l'importer :</p>
<img src="screenshots/customersProperties1.jpeg">
<img src="screenshots/customerproperties2.jpeg">
<p>Et pour tester si la config est bien importé on utilise une class RestController</p>
<img src="screenshots/restcontroller.png">
<h3>2) Vault Config</h3>
<p>Pour utiliser Vault Config il faut tout d'abord ajouter la dependance suivante :</p>
<img src="screenshots/vaultdependency.jpeg">
<p>Pour utiliser la configuration dans chaque microservice on doit la configurer et l'importer :</p>
<img src="screenshots/propertiesbilling.png">
<p>Et pour tester si la config est bien importé on utilise une class RestController</p>
<img src="screenshots/myconsulconfig.jpeg">
<img src="screenshots/myvaultconfig.jpeg">
<img src="screenshots/coconfigrestController.jpeg">
