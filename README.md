

# E-Banking App en Microservices

E-Banking, une solution backend basée sur une architecture en microservices, développée avec **Java Spring Boot** et un frontend en **Angular**. Ce projet offre une architecture modulaire pour gérer les **clients**, **comptes** et **transactions**, avec une authentification centralisée via **Keycloak**.

---

## 🧩 Architecture

![Architecture Globale](./screenshots/Architecture.png "Architecture Globale")

---

## ⚡ Fonctionnalités

- **Architecture en microservices** : Meilleure évolutivité et maintenabilité.
- **Backend Spring Boot** : Services backend robustes.
- **Frontend Angular** : Une interface utilisateur dynamique et réactive.
- **Authentification centralisée** : Gestion des utilisateurs sécurisée avec Keycloak.
- **Passerelle API** : Routage intelligent des requêtes avec Spring Cloud Gateway.
- **Gestion des configurations** : Configuration centralisée via Spring Cloud Config.
- **Découverte de services** : Gestion simplifiée avec Eureka Server.

---

## 📷 Captures d'écran

- Vue des **clients** :  
  ![Clients](./screenshots/Clients.png)

- Vue des **comptes** :  
  ![Accounts](./screenshots/Accounts.png)

- Vue des **transactions** :  
  ![Transactions](./screenshots/Transactions.png)

- **Transaction en cours** :  
  ![Transaction-inaction](./screenshots/Transaction-inaction.png)

- **Transaction réussie** :  
  ![Transaction-success](./screenshots/Transaction-success.png)

---

## 📁 Structure du Répertoire

- `/discovery-service` : Service de découverte des autres microservices.
- `/config-service` : Gestion centralisée des configurations.
- `/gateway-service` : Passerelle API pour la gestion des requêtes.
- `/client-service` : Gestion des données clients.
- `/account-service` : Gestion des comptes bancaires.
- `/transaction-service` : Gestion des transactions.
- `/e-banking_app_ui` : Projet frontend basé sur Angular.

---

## 🔧 Présentation des Services

### Service de Découverte (Discovery Service)

- **Port** : `8761`
- **Technologie** : `spring-cloud-starter-netflix-eureka-server`
- **Rôle** : Inscription et découverte des autres services.

### Service de Configuration (Config Service)

- **Port** : `9999`
- **Technologie** : `spring-cloud-config-server`
- **Rôle** : Fournir les configurations aux microservices.

### Passerelle API (Gateway Service)

- **Port** : `8888`
- **Technologie** : `spring-cloud-starter-gateway`
- **Rôle** : Routage des requêtes vers les microservices.

### Service Client (Client Service)

- **Port** : `8082`
- **Endpoints** :
  - `GET /clients` : Liste des clients.
  - `POST /clients/new` : Ajouter un client.
  - `GET /clients/{id}` : Voir un client spécifique.
  - `PUT /clients/{id}/update` : Mettre à jour un client.
  - `DELETE /clients/{id}/delete` : Supprimer un client.

### Service de Comptes (Account Service)

- **Port** : `8081`
- **Endpoints** :
  - `GET /accounts` : Liste des comptes.
  - `POST /accounts/new` : Ajouter un compte.
  - `GET /accounts/{id}` : Voir un compte spécifique.
  - `PUT /accounts/{id}/update` : Mettre à jour un compte.
  - `DELETE /accounts/{id}/delete` : Supprimer un compte.

### Service de Transactions (Transaction Service)

- **Port** : `8083`
- **Endpoints** :
  - `GET /transactions` : Liste des transactions.
  - `POST /transactions/new` : Ajouter une transaction.
  - `GET /transactions/{id}` : Voir une transaction spécifique.
  - `PUT /transactions/{id}/update` : Mettre à jour une transaction.
  - `DELETE /transactions/{id}/delete` : Supprimer une transaction.

### Frontend Angular

- **Port** : `4200`

### Authentification Centralisée (Keycloak)

- **Port** : `80`

---

## 🔗 Points d'accès

- **Service de Comptes** : [http://localhost:8888/account-service](http://localhost:8888/account-service)
- **Service de Clients** : [http://localhost:8888/client-service](http://localhost:8888/client-service)
- **Service de Transactions** : [http://localhost:8888/transaction-service](http://localhost:8888/transaction-service)

---

## 🚀 Démarrage

1. Clonez le dépôt :

   ```bash
   git clone https://github.com/YASSINE-ABHIR/e-banking_app_in_microservices.git
   ```

2. Accédez au répertoire du projet et démarrez les services avec Docker Compose :

   ```bash
   cd e-banking_app_in_microservices
   docker-compose up --build
   ```

3. Accédez aux différents services via la passerelle API.

---

## 📜 Vérification de l'état des services

Chaque service est équipé d'un système de vérification pour garantir leur bon fonctionnement. Assurez-vous que tous les services sont en bonne santé pour un fonctionnement optimal.

---

## 🤝 Contribuer

Les contributions sont les bienvenues ! N'hésitez pas à forker ce dépôt et à soumettre des _pull requests_. Pour des modifications majeures, ouvrez une discussion pour expliquer vos idées.


