# URL Shortener Challenge

## Challenge Overview

This challenge is part of the [backend-br challenges](https://github.com/backend-br/desafios/blob/master/url-shortener/PROBLEM.md). The goal is to build a URL shortener service that takes a long URL and converts it into a shorter version. 

## Requirements

1. The URL shortener receives a long URL as an input parameter.
2. The shortened URL should have a length between 5 and 10 characters.
3. The shortened URL can only contain letters and numbers.
4. The shortened URL will be stored in a database with an expiration date (you can choose the desired duration).
5. When a request is made to the shortened URL, e.g., `https://xxx.com/DXB6V`, it should redirect to the original URL stored in the database. If the URL is not found in the database, return an HTTP 404 (Not Found) status code.

## How to Run

1. Clone this repository to your local machine.
2. Install the required dependencies.
3. Set up your database and configure the connection settings.
4. Run the application.
5. Use the provided endpoints to shorten URLs and retrieve the original URLs.

## Endpoints

- **POST /shorten**: Accepts a long URL and returns a shortened URL.
- **GET /:shortenedURL**: Redirects to the original URL if found; otherwise, returns a 404 status code.

## Technologies Used

- [Technology 1]
- [Technology 2]
- [Technology 3]

## Configuration

1. Set the database connection string in the configuration file.
2. Specify the desired duration for URL validity.

## License

This project is licensed under the [MIT License](LICENSE).

## Contributing

Feel free to open issues or submit pull requests with improvements or fixes. For major changes, please open an issue first to discuss what you would like to change.

## Contact

For any questions or feedback, please reach out to [Allan Cristiano da Silva Santos] at [drmundo920@gmail.com].

---

By following the requirements and guidelines mentioned above, you'll be able to implement a functional and efficient URL shortener service. Happy coding!
