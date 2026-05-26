<div align="center">

# Train Ticket System

**A Java-based train ticket booking application with customer booking, ticket pricing, payment receipt, and admin management workflows.**

[![Java](https://img.shields.io/badge/Java-8%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Swing](https://img.shields.io/badge/UI-Java%20Swing-007396?style=for-the-badge)](https://docs.oracle.com/javase/tutorial/uiswing/)
[![BlueJ](https://img.shields.io/badge/IDE-BlueJ-1E88E5?style=for-the-badge)](https://www.bluej.org/)
[![Status](https://img.shields.io/badge/Status-Student%20Project-2EA44F?style=for-the-badge)](#)

</div>

---

## Project Overview

Train Ticket System is an object-oriented Java application designed to simulate a simple railway ticket booking platform. It supports customer registration, login, passenger information management, ticket selection, route-based pricing, payment receipt generation, feedback collection, and admin-side reporting.

The application uses `JOptionPane` dialogs for user input and displays ticket, receipt, and admin summaries through console output. It was built as a Java/BlueJ project and is suitable for learning core Java concepts such as classes, inheritance, abstraction, arrays, input handling, and basic business logic.

## Features

| Module | Capabilities |
| --- | --- |
| Customer Access | Customer sign up, login verification, and passenger data entry |
| Ticket Booking | Select origin, destination, departure date, return option, and passenger count |
| Ticket Types | Supports `GoldTicket` and `SilverTicket` classes through an abstract `Ticket` base class |
| Pricing Logic | Calculates ticket price by route, ticket category, return trip, packages, seat type, and discounts |
| Gold Ticket Options | Food package, food and drinks package, and soft-seat add-on |
| Silver Ticket Discounts | Student and senior citizen discount handling |
| Payment | Captures payment details, generates transaction IDs, and prints receipts |
| Feedback | Collects customer feedback and ratings |
| Admin Panel | Search customers, view feedback, view ratings, monitor sales, and cancel purchased tickets |

## Tech Stack

| Technology | Purpose |
| --- | --- |
| Java | Main programming language |
| Java Swing `JOptionPane` | Dialog-based user interaction |
| Java Time API | Payment date handling with `LocalDate` |
| Java Collections/Arrays | In-memory customer and ticket storage |
| BlueJ | Original project IDE and project metadata |

## Installation

### Prerequisites

Make sure the following tools are installed:

- Java Development Kit, version 8 or newer
- Git
- BlueJ, optional if you want to open the original BlueJ project

### Clone The Repository

```bash
git clone https://github.com/Xid03/TrainTicketSystem.git
cd TrainTicketSystem
```

### Compile The Project

```bash
javac *.java
```

### Run The Application

```bash
java TicketTrainApp
```

## Usage

When the application starts, choose the site you want to access:

```text
C - Customer
A - Admin
```

### Customer Flow

1. Sign up or log in.
2. Enter passenger information.
3. Browse available routes and ticket prices.
4. Select origin, destination, ticket type, and travel details.
5. Choose Gold or Silver ticket options.
6. Enter payment information.
7. View receipt and total payment details.
8. Optionally submit feedback and rating.

### Admin Flow

Use the default admin credentials defined in `Admin.java`:

```text
Username: admin123
Password: admin123
```

Admin users can search customer records, display customer feedback and ratings, review ticket sales, and cancel purchased tickets.

## Screenshots

Screenshots are not included yet because this project runs through Java Swing dialogs and console output. Recommended screenshots to add:

| Screen | Suggested File |
| --- | --- |
| Main menu dialog | `docs/screenshots/main-menu.png` |
| Customer booking flow | `docs/screenshots/customer-booking.png` |
| Ticket receipt output | `docs/screenshots/payment-receipt.png` |
| Admin sales summary | `docs/screenshots/admin-dashboard.png` |

After adding screenshots, embed them in this section using:

```md
![Main Menu](docs/screenshots/main-menu.png)
```

## Demo

This is a local desktop Java application. A typical demo flow is:

```text
Run TicketTrainApp
Choose Customer
Sign up or log in
Enter passenger details
Select route and ticket type
Complete payment
View receipt
Switch to Admin
Review sales and customer information
```

For a stronger GitHub presentation, add a short GIF or screen recording to `docs/demo/` and link it here.

## Folder Structure

```text
TrainTicketSystem/
├── Admin.java              # Admin account model and default credentials
├── Customer.java           # Customer profile, feedback, and rating model
├── GoldTicket.java         # Gold ticket pricing, package, and seat logic
├── LogIn.java              # Login validation logic
├── Payment.java            # Payment details and receipt printing
├── SignUp.java             # Customer sign-up model
├── SilverTicket.java       # Silver ticket pricing and discount logic
├── Ticket.java             # Abstract base class for ticket types
├── TicketTrainApp.java     # Main application entry point
├── package.bluej           # BlueJ project configuration
├── README.TXT              # BlueJ project README note
└── README.md               # GitHub project documentation
```

## Future Improvements

- Add persistent storage using files or a database.
- Build a graphical interface with JavaFX or a full Swing window layout.
- Add form validation for empty inputs, invalid dates, and invalid route selections.
- Hash and protect passwords instead of storing plain text values.
- Separate business logic from UI prompts for easier testing.
- Add unit tests for ticket pricing, discounts, and payment receipt generation.
- Export receipts as PDF or text files.
- Add screenshots, demo GIFs, and a project license.

## Contact Information

Created by **Xid03**.

- GitHub: [@Xid03](https://github.com/Xid03)
- Repository: [TrainTicketSystem](https://github.com/Xid03/TrainTicketSystem)

---

<div align="center">

**Train Ticket System** - A Java OOP project for learning ticket booking workflows and basic management features.

</div>
