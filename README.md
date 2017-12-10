# deployment
## build java files
javac -classpath lib/servlet-api.jar classes/*.java

## start application (daemon mode)
docker-compose up -d

## delete application
docker-compose down


# build

# other
## site url
http://localhost:8888/app/
