This project is a microservices-based architecture built using the Event-Driven Architecture (EDA) pattern. 
The system is designed to handle order processing, stock management, email notifications, and other domain-specific functionalities.
Each service communicates asynchronously using an event-driven approach, ensuring scalability and resilience.

| Key Features |
a. Event-Driven Architecture - Services communicate asynchronously using events.

b. Microservices-based - Modular approach for scalability and independent deployments.

c. Decoupled Services - Each service focuses on a single responsibility.

d. Improved Fault Tolerance - Reduced dependency between services ensures high availability.

| Microservices & Event Flow |
1. Order Service
Receives order requests from users
Publishes an Order Created Event

2. Stock Service
Listens to Order Created Event
Checks stock availability
Publishes Stock Updated Event

3. Email Service
Listens to Stock Updated Event
Sends order confirmation emails
This ensures loose coupling and event-driven orchestration across services.

| License |
This project is licensed under the MIT License - see the LICENSE file for details.

