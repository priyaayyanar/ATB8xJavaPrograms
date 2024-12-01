package tasks.nov15_SOAP_vs_REST;

public class Task1 {

    /*                          SOAP          vs                   REST

Stands for   |  Simple Object Access Protocol     |  Representational State Transfer

What is it?  | SOAP is a protocol for              |  REST is an architecture style for
               communication between applications  |  designing communication interfaces.

Design       | SOAP API exposes the operation.    |  REST API exposes the data.

Transport    |  SOAP is independent and can work  |  REST works only with HTTPS.
Protocol     |  with any transport protocol.      |

Data format  | SOAP supports only XML data exchange. | REST supports XML, JSON, plain text, HTML.

Performance  | SOAP messages are larger,          |  REST has faster performance due to smaller
                which makes communication slower. |  messages and caching support.

Scalability  | SOAP is difficult to scale.        | REST is easy to scale.
                The server maintains state by     | It’s stateless, so every message is processed
                storing all previous messages     | independently of previous messages.
                exchanged with a client.          |

Security   |  SOAP supports encryption with       |  REST supports encryption without affecting
                additional overheads.             |  performance.

Use case   |  SOAP is useful in legacy            | REST is useful in modern applications
               applications and private APIs.     |  and public APIs.
     */
}
