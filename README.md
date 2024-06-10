# URL Shortener Challenge

## Overview

This challenge is part of the [backend-br challenges](https://github.com/backend-br/desafios/blob/master/url-shortener/PROBLEM.md). The goal is to build a URL shortener service that takes a long URL and converts it into a shorter version. 

## Features

1. **URL Shortening**: The service accepts a long URL and returns a shortened version.
2. **Character Limit**: The shortened URL will contain between 5 and 10 characters.
3. **Character Restrictions**: The shortened URL can only include alphanumeric characters.
4. **Expiration Date**: The shortened URL will be stored in a database with an expiration date of your choice.
5. **Redirection**: When a request is made to the shortened URL (e.g., `https://xxx.com/DXB6V`), the service will redirect to the original URL. If the URL is not found, it will return an HTTP 404 (Not Found) status code.

## Getting Started

1. **Clone the Repository**: Clone this repository to your local machine.
2. **Install Dependencies**: Install the necessary dependencies.
3. **Database Setup**: Set up your database and adjust the connection settings.
4. **Run the Application**: Start the application.
5. **Use the Endpoints**: Utilize the provided endpoints to shorten URLs and retrieve the original URLs.

## Endpoints

- **POST /shorten**: Accepts a long URL and returns a shortened URL.
- **GET /:shortenedURL**: Redirects to the original URL if found; otherwise, returns a 404 status code.

## Tech Stack

- JAVA 21
- Spring Boot
- MongoDB

## Configuration

1. **Database Connection**: Specify the database connection string in the configuration file.
2. **URL Validity**: Set the desired duration for URL validity.

## License

This project is licensed under the MIT License.

## Contributing

We welcome contributions! Feel free to open issues or submit pull requests for improvements or fixes. For significant changes, please open an issue first to discuss your proposed changes.

## Contact

If you have any questions or feedback, please contact Allan Cristiano da Silva Santos at drmundo920@gmail.com.

---

By adhering to the above requirements and guidelines, you'll be able to create a functional and efficient URL shortener service. Happy coding!
