<strong>TrainTrack: Training Management and Booking System</strong>

<strong>Project Overview</strong>

TrainTrack is a web-based application designed to streamline the management of training sessions for businesses. It allows users to book and manage training sessions, view a brief synopsis of each session, and handle participant data securely. Trainers can manage their courses, and participants can register, update, or delete their information.

<strong>Features</strong>
<ul>
  <li><strong>Training Management</strong>: Add, edit, or delete training sessions.</li>
  <li><strong>Participant Registration</strong>: Users can register for training sessions, providing their name, email, skill level, and company.</li>
  <li><strong>Booking Overview</strong>: Displays an overview of all current training sessions, participants, and booking details.</li>
  <li><strong>Data Management</strong>: Edit or remove participant data and update course details.</li>
  <li><strong>Database Integration</strong>: The system is powered by MySQL to store all training and participant data securely.</li>
</ul>

<strong>Technologies Used</strong>
<ul>
  <li><strong>Backend</strong>: Java with Spring Framework</li>
  <li><strong>Frontend</strong>: Frontend</li>
  <li><strong>Database</strong>: MySQL</li>
  <li><strong>Frameworks</strong>: Spring Boot for backend functionality, MVC (Model-View-Controller) design pattern</li>
</ul>


<strong>Getting Started</strong>

<strong>Prerequisites</strong>
<ul>
  <li>Java JDK 8 or higher</li>
  <li>MySQL</li>
  <li>Maven for managing dependencies</li>
</ul>


<strong>Installation</strong>
<ol>
<li>Clone the repository</li>
  <li>Create a MySQL database and configure the connection in application.properties.
Run the provided SQL scripts to create the necessary tables for trainings, participants, and trainers.</li>
    <li>Build and run the application</li>
  <li>Access the application</li>
</ol>

<strong>Usage</strong>
<ol>
  <li><strong>Add Training</strong>: On the home page, click "Add New Training" to create a new training session.</li>
    <li><strong>Register Participants</strong>: Select a training from the list, then register participants by entering their details (name, email, skill level, company).</li>
    <li><strong>Edit or Delete</strong>: Trainers and admins can edit or remove training sessions and participant records directly from the interface.</li>
</ol>

<strong>Code Structure</strong>

MVC Architecture:
<ul>
  <li>Model: Contains the entity classes for Team, Training, Participant.</li>
    <li>View: HTML templates using Thymeleaf for dynamic content rendering.</li>
    <li>Controller: AppController handles routing and form submissions.</li>
</ul>

Services:TeamService and CourseService handle the business logic for managing the training sessions and participants.

Repository: TeamRepository interfaces with MySQL using Spring Data JPA.

<strong>Database Structure</strong>
<ul>
  <li><strong>Training Table</strong>: Stores training details such as training name, date, trainer, and description.</li>
    <li><strong>Participant Table</strong>: Stores participant information including name, email, skill level, and company.</li>
    <li><strong>Trainer Table</strong>: Stores trainer data and links with the training sessions.</li>
</ul>

<strong>Future Enhancements</strong>
<ul>
  <li><strong>Auto-Delete Feature</strong>: Automatically remove training sessions once their date has passed.</li>
    <li><strong>Mobile Responsiveness</strong>: Improve the design for better usability on mobile devices.</li>
    <li><strong>Enhanced Security</strong>: Implement role-based access control and further security measures.</li>
</ul>
