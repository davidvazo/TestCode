
* Consideraciones del proyecto *

	El proyecto se creó con Spring Boot, sobre un entorno Spring Tool Suite (IDE). El servicio web auto-configurado 
	fue Tomcat y la conexion a la base de datos fue personalizada


* Pasos para la instalacion del proyecto *


1.  Creacion de la base de datos con nombre 'codster'. La sentencia utilizada fue:
 
    # create database codster;
   
	El archivo de credenciales para acceso a bd es application.properties ubicado en la carpeta src/main/resources/.
	
	Para evitar problemas de restriccion de acceso de usuario en la basde del aplicativo en MySQL, 
	se creó un usuario unico para el acceso a la bd y se le concedió todos los privilegios.
	
	A continuacion se encuentran las sentencias de creacion del usuario
	
	# create user 'springuser'@'%' identified by 'passwd'; 
	
	# grant all on codster.* to 'springuser'@'%'; 
	
	
	Las credenciales utilizadas fueron:
	
	username:    springuser
	contrasenia: passwd
   
   
2.  Habiendo creado la base de datos, se continua con ejecucion del script sql con nombre CodsterProject.sql 
    ubicado en la carpeta src/main/resources/.

3.  Instalacion del proyecto, en un IDE eclipse ó Spring Tool Suite es posible importarlo como proyecto Maven.
	Al ser un proyecto Spring boot es preferible instalar el proyecto en Spring Tool Suite por sus herramientas
	complementarias.

4.  Habiendo instalarlo puede ejecutar el siguiente comando para correr el proyecto:

	# mvn clean &&  mvn spring-boot:run
	 


