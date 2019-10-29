# Spring Boot

Vajalik on Java ja JDK (Java Development Kit) olemasolu. Springiga ühilduvad versioonid on: **8, 11, 13**

**Eclipse allalaadimine**

https://www.eclipse.org/downloads/

**Java allalaadimine:** 

https://www.java.com/en/download/

**JDK allalaadimine:**

https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

juhul kui eelnevalt aadressilt allalaadimisel küsib Oracle kasutaja olemasolu siis proovida järgmist:

https://www.oracle.com/technetwork/java/javase/downloads/index.html ja otsida **Java SE 8u231** JDK download nupp

**Süsteemimuutujate lisamine:**

https://javatutorial.net/set-java-home-windows-10

**Spring Initializr:**

**https://start.spring.io**

    Project: Gradle Project

    Language: Java

    Spring Boot: 2.2.0

    Project Metadata:

    Packaging: jar

    Java: Märkida vastavalt arvutis olemasolevale Java versioonile

    Lisada järgmised dependencie'd:
      Spring Web
      Thymeleaf
      Lombok
      Spring Security
      JDBC API

Generate project -> paki lahti -> käivita Java IDE's või CMD's käsuga: **gradlew bootRun**

**NB! CMD käivitada admin õigustega.**

Brauseris avada aadressilt: **http://localhost:8080**

Juhul kui pordiga 8080 esineb probleeme, siis tuleb ära muuta default localhost aadress, mille õpetuse leiab:

https://www.baeldung.com/spring-boot-change-port

Spring Security ja JDBC API soovitatavalt alguses build.gradle failist välja kommenteerida // või lisada hiljem

