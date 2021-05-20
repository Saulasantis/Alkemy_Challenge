CREATE DATABASE challenge_java;
USE challenge_java;

CREATE TABLE characters(
id_character INT NOT NULL AUTO_INCREMENT,
image VARCHAR(50), 
name VARCHAR(50) NOT NULL,
age INT NOT NULL,
weight INT NOT NULL,
story VARCHAR(500) NOT NULL,
associated_movies VARCHAR(50) NOT NULL,
primary key (id_character));

CREATE TABLE movies_or_series(
id_movies INT NOT NULL AUTO_INCREMENT,
image VARCHAR(50),
title VARCHAR(50) NOT NULL,
creation_date INT NOT NULL,
qualification INT NOT NULL,
associated_characters VARCHAR(50) NOT NULL,
primary key (id_movies));

CREATE TABLE gender(
id_gender INT NOT NULL AUTO_INCREMENT,
gender_name VARCHAR(50) NOT NULL,
image LONGBLOB,
associated_movies VARCHAR(50) NOT NULL,
primary key (id_gender));

INSERT INTO `characters` (`image`, `name`,`age`,`weight`,`story`,`associated_movies`) VALUES('hercules.jpg', 'Hercules', 21, 75, 'Hijo de Hera y de Zeus. Es robado del Olimpo por los secuaces de Hades para llevarlo a la Tierra y despojarlo de su inmortalidad. Sin embargo, el plan no resulta como se esperaba y el niño conserva algunos poderes divinos.', 'Hércules' );
INSERT INTO `characters` (`image`, `name`,`age`,`weight`,`story`,`associated_movies`) VALUES('anastasia.jpg', 'Anastasia', 16, 56, 'Al enterarse de que la emperatriz María de Rusia ofrece una recompensa a quien tenga pistas sobre el paradero de su nieta, la princesa Anastasia, una pareja de estafadores convencen a la joven Anya para que se haga pasar por ella y poder repartirse así el botín. Lo que ellos ignoran es que Anya es, en verdad, la desaparecida Anastasia y que tras sus pasos está el malvado Rasputín.', 'Anastasia' );
INSERT INTO `characters` (`image`, `name`,`age`,`weight`,`story`,`associated_movies`) VALUES('moana.jpg', 'Moana', 16, 57, 'Moana es la hija del jefe de la isla con una larga linea de ancestros navegantes, ella zarpa hacia el mar con un poderoso semidiós para ayudar a salvar a su familia de la aniquilación.', 'Moana' );
INSERT INTO `characters` (`image`, `name`,`age`,`weight`,`story`,`associated_movies`) VALUES('peter_pan.jpg', 'Peter Pan', 11, 35, 'Es un chico de entre 11 y 14 años que no quiere crecer. Vive en el País de Nunca Jamás junto al hada Campanita y los niños Perdidos. Su mayor enemigo es el Capitán Garfio, quien quiere acabar con él desde que le cortó la mano y se la echó de comer al cocodrilo.', 'Peter Pan' );
INSERT INTO `characters` (`image`, `name`,`age`,`weight`,`story`,`associated_movies`) VALUES('pinocho.jpg', 'Pinocho', 8, 25, 'Pinocho es una marioneta de madera con aspecto de niño, tiene la inocencia y la sensibilidad de un niño y, a su vez, carece de conciencia al ser de madera. Sensible, tímido y quizá acomplejado debido a su aspecto físico que nada tiene que ver al del resto de los niños.', 'Pinocho' );
INSERT INTO `characters` (`image`, `name`,`age`,`weight`,`story`,`associated_movies`) VALUES('luck.jpg', 'Luck SkyWalker', 23, 75, 'Procedente de la colonia de asteroides de Polis Massa, es el único hijo varón de Anakin Skywalker y la senadora Padmé Amidala (antigua reina del planeta Naboo). Tiene una hermana melliza llamada Leia Organa, de la cual fue separado al nacer con el objetivo de ocultarlo y protegerlo del emperador Palpatine (Darth Sidious) y del Imperio Galáctico. Su cuñado y compañero de batallas se llama Han Solo, famoso', 'Star Wars' );
INSERT INTO `characters` (`image`, `name`,`age`,`weight`,`story`,`associated_movies`) VALUES('hansolo.jpg', 'Han Solo', 25, 80, 'Solo, era un hombre humano contrabandista que se convirtió en un líder en la Alianza para Restaurar la República y una figura instrumental en la derrota del Imperio Galáctico durante la Guerra Civil Galáctica. Él procedía de Corellia y se convirtió en un contrabandista al servicio de Jabba el Hutt, incluso completando el Corredor de Kessel en menos de trece parsecs con su preciada nave, el Halcón Milenario.', 'Star Wars' );
INSERT INTO `characters` (`image`, `name`,`age`,`weight`,`story`,`associated_movies`) VALUES('joe.jpg', 'Joe Gardner', 37, 84, 'Joe es amable, nervioso, y muy alegre. Intenta enseñar con calma a los demás estudiantes. Aunque a veces sea duro, es muy cariñoso. Siempre tiene en su rostro una cara de felicidad.', 'Soul' );
INSERT INTO `characters` (`image`, `name`,`age`,`weight`,`story`,`associated_movies`) VALUES('capitana.jpg', 'Carol Danvers', 50, 58, 'Carol Susan Jane Danvers comenzó su carrera en la fuerza aérea de Estados Unidos y llegó hasta el puesto de jefe de seguridad de Cabo Cañaveral. Allí se vio relacionada con el Capitán Marvel, un soldado Kree que desertaría de sus funciones para proteger a la Tierra de su propio mundo.', 'Capitana Marvel' );
INSERT INTO `characters` (`image`, `name`,`age`,`weight`,`story`,`associated_movies`) VALUES('capitan.jpg', 'Steve Rogers', 27, 85, 'Steven Grant "Steve" Rogers es un veterano de la Segunda Guerra Mundial, miembro fundador de los Vengadores y el primer superhéroe del mundo. Rogers tenía problemas de salud, sin embargo, después de que el Proyecto Renacimiento lo convirtió en el Capitán América, ayudó a los Aliados a ganar la Segunda Guerra Mundial atacando las instalaciones de HYDRA junto a los Comandos Aulladores, convirtiéndose en una leyenda viviente debido a sus hazañas.', 'Capitán America' );


INSERT INTO `movies_or_series` (`image`, `title`,`creation_date`,`qualification`,`associated_characters`) VALUES('hercules.jpg', 'Hercules', 1997, 4, 'Hercules');
INSERT INTO `movies_or_series` (`image`, `title`,`creation_date`,`qualification`,`associated_characters`) VALUES('anastasia.jpg', 'Anastasia', 1997, 4, 'Anastasia');
INSERT INTO `movies_or_series` (`image`, `title`,`creation_date`,`qualification`,`associated_characters`) VALUES('moana.jpg', 'Moana', 2016, 5, 'Moana');
INSERT INTO `movies_or_series` (`image`, `title`,`creation_date`,`qualification`,`associated_characters`) VALUES('peter_pan.jpg', 'Peter Pan', 1953, 4, 'Peter Pan');
INSERT INTO `movies_or_series` (`image`, `title`,`creation_date`,`qualification`,`associated_characters`) VALUES('pinocho.jpg', 'Pinocho', 1940, 5, 'Pinocho');
INSERT INTO `movies_or_series` (`image`, `title`,`creation_date`,`qualification`,`associated_characters`) VALUES('starwars.jpg', 'Star Wars: Episodio IV - Una nueva esperanza', 1977, 5, 'Luck Skywalher - Han Solo');
INSERT INTO `movies_or_series` (`image`, `title`,`creation_date`,`qualification`,`associated_characters`) VALUES('starwars.jpg', 'Star Wars: Episodio IV - Una nueva esperanza', 1977, 5, 'Han Solo - Luck Skywalker ');
INSERT INTO `movies_or_series` (`image`, `title`,`creation_date`,`qualification`,`associated_characters`) VALUES('soul.jpg', 'Soul', 2020, 5, 'Joe Gardner');
INSERT INTO `movies_or_series` (`image`, `title`,`creation_date`,`qualification`,`associated_characters`) VALUES('capitana.jpg', 'Capitana Marvel', 2019, 5, 'Carol Danvers');
INSERT INTO `movies_or_series` (`image`, `title`,`creation_date`,`qualification`,`associated_characters`) VALUES('capitan.jpg', 'Capitán América', 2011, 5, 'Steve Rogers');

CREATE TABLE users(
id_users INT NOT NULL AUTO_INCREMENT,
username VARCHAR(50) NOT NULL,
password VARCHAR(128) NOT NULL,
primary key (id_users));

CREATE TABLE rol(
id_rol INT NOT NULL AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
id_users INT,
primary key (id_rol),
CONSTRAINT `id_rol_users` 
FOREIGN KEY (`id_users`) REFERENCES `users` (`id_users`) 
ON DELETE NO ACTION
ON UPDATE NO ACTION);

INSERT INTO `users` (`username`, `password`) VALUES('admin', '1234');
INSERT INTO `users` (`username`, `password`) VALUES('user', '1234');

INSERT INTO `rol` (`name`, `id_users`) VALUES('ROLE_ADMIN', '1');
INSERT INTO `rol` (`name`, `id_users`) VALUES('ROLE_USER', '1');
INSERT INTO `rol` (`name`, `id_users`) VALUES('ROLE_USER', '2');






users