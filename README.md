# Flight Board Demo

## Requirements

Airport arrival and departure app - Create a web app that is able to read from a database of your choice and display incoming and outgoing
flights of a given airport. Below are the high-level requirements.
- The application should highlight delayed flights based on arrival/departure scheduled times and the current system time.
- Provide an admin view that allows for the insertion of new inbound and outbound flights.

Tech details
- The front end should be written in angular and extra points are given if the design is responsive.
- Create as a Spring Boot application
- Define a simple schema that allows for the listing of inbound and outbound flights. Include information you deem relevant. List any assumptions made etc

## Assumptions & Estimates

- Based off [Toronto Pearson Airport (YYZ)](https://www.torontopearson.com/en/whats-happening/stories/whyyz/how-our-runways-work),
  - Average 1,300 flights arrive or depart from Pearson each day with 6 months of data retention. Assuming arrivals & departures are equal. 1,300 flights x 6 months retention period x 30 days/month = 234,000 flights in 6 months, i.e, 117,000 arrivals and departures, respectively.
  - Average 130,000 passengers fly via YYZ each day. 130,000 passengers each day/24 hours ≈ 5,416 passengers/hour. Assuming passengers & maybe 3 of thier loved ones visit the flight board app for updates on an hourly basis, which makes 16,248 hourly ≈ 270 minutely ≈ 5 secondly visitor traffic.
- Peaks and troughs will require auto-scaling of the system
- User traffic based on geography would require regional scaling

## Design

- Making a prototype based on YYZs flight board for [arrivals](https://www.torontopearson.com/en/arrivals) & [departures](https://www.torontopearson.com/en/departures)
- Using [global airlines & airports data](https://openflights.org/data.html) and [massaging the data](https://github.com/MrC0mm0n/flight-board-demo/tree/main/flight-board-demo-rest-api/data)

## Data Model

![ERD diagram](flight-board-demo-rest-api/media/flight-board-erd.png)
