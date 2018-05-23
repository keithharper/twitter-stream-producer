# twitter-stream-producer

## Usage
    producer$ lein ring server-headless
    consumer$ lein repl
        (read-string (slurp "http://localhost:3000/tweets/300"))
