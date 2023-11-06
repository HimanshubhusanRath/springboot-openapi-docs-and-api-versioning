# Highlights of this project:
## 1. Spring Boot + OpenAPI 2.0 for API documentation
* Few Points:
  * Dependencies added for OpenAPI 2.0 documentation support.
  * Annotation processor is configured to process the Javadoc.
  * Spring boot main class is configured with `OpenAPIDefinition` annotation.
  * NOTE: `springdoc-openapi-2` is supported for `Spring Boot 3`.
* URLs:
  * Access the API documentation: `http://localhost:8080/product-docs` (default : `/v3/api-docs`)
  * Download the API documentation : `http://localhost:8080/product-docs.yml`
  * Access Swagger UI : `http://localhost:8080/swagger-ui.html`

## 2. API versioning
* Types:
  * Using URL
  * Using request parameter
  * Using request headers