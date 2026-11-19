# CodeAlpha Docker Web Server

## Project Description
This project demonstrates how to deploy a simple web server using Docker as part of my CodeAlpha DevOps Internship.

## Technologies Used
- Docker
- Nginx
- HTML
- Visual Studio Code

## Project Structure
```text
CodeAlpha_Docker_WebServer_New/
├── Dockerfile
├── index.html
├── README.md
└── screenshots/
    └── website.png
```

## Docker Commands

Build the Docker image:
```bash
docker build -t codealpha-webserver .
```

Run the container:
```bash
docker run -d -p 8080:80 --name codealpha-webserver codealpha-webserver
```

Check running containers:
```bash
docker ps
```

## Access the Website
Open your browser and visit:

http://localhost:8080

## Learning Outcome
Learned how to build a Docker image, run an Nginx web server inside a container, and access a website through port mapping.

## Internship
CodeAlpha DevOps Internship