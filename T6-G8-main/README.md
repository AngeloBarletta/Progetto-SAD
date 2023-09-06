# CodeRush  
- Compile and execute code.
- Switch themes from a list of available themes.
- Returns coverage of written code.
- Returns coverage results.

## Installations and setup without Docker
- git clone `https://github.com/Testing-Game-SAD-2023/T6-G8`
- download node.js: `https://nodejs.org/en/download`
- in 'Node.js command prompt': `npm install`
- `folder "codice"`
	- `folder "EditorApp"`
		- `folder "target"`
			- `java -jar EditorApp-0.0.1-SNAPSHOT.jar` to run the backend
	- `folder "editor"`
		- `npm start` to run the frontend

If you want to try the application with three simulated servers:
- `folder "codice"`
	- `folder "ClassServer"`
		- `node ClassServer.js` to run the server of the test classes
	- `folder "CoverageServer"`
		- `node CoverageServer.js` to run the server of the coverage
	- `folder "TestsServer"`
		- `node TestsServer.js` to run the server of the test saved


## Installations and setup with Docker
- git clone `https://github.com/Testing-Game-SAD-2023/T6-G8`
- download Docker Desktop: `https://www.docker.com/products/docker-desktop/`
- open `Docker Desktop`
- `folder "codice"`
	- `folder "editor"`
		- `docker build -t frontend .` to build the frontend image
		- `docker run -p 3000:3000 frontend` to run the frontend container
	- `folder "EditorApp"`
		- `docker build -t backend .` to build the backend image
		- `docker run -p 8080:8080 backend` to run the backend container
- open a Browser and connect to `http://localhost:3000`

If you wanto to try the application with three simulated servers:
- `folder "codice"`
	- `docker-compose up` to build and run all the containers
- open a Browser and connect to `http://localhost:3000`


## Port Mapping
You can change the exposed port on your Docker container when you run it with the option "-p" while launching the command:
	`docker run -p <origin_port>:<destination_port> ...`


## ENV Variables
To make the application context-independent we used Env Variables to specify the 
path to other containers/servers that expose the APIs/services needed by our task.
Based on the configuration, and without using any service discovery technology, it's
possible to specify the path to the appropriate service containers during the Docker-container 
execution of the backend service with the command
` docker run -p 8080:8080 -e COVERAGE_SERVER_URL=http://my-coverage-server:3001/ -e CLASS_SERVER_URL=http://my-class-server:3002/ -e TESTS_SERVER_URL=http://my-tests-server:3003/ backend `
Alternatively, it is possible to run all the containers with the command `docker-compose up` changing the environment variables defined in the .env file that is located in the `folder "codice"`

## API Documentation
APIs have been documented using the springdoc-openapi java library to automate and 
standardize the documentation process. 
To access the documentation, simply run the backend server and navigate to 
 	  `http://localhost:8080/swagger-ui/index.html`
If accessing remotely, please refer to the following link to read the documentation
` https://app.swaggerhub.com/apis/ZAIRAABDELMAJID/EditorG8/1.0.0 `

## Teams we interacted with
In order to more easily integrate our task in the application environment, we interacted with Team G14 for Task 5 and Team G31 for Task 7 to match our interfaces with.
