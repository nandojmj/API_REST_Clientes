

# Proyecto de API REST para Gestión de Clientes

Este es un proyecto de API REST desarrollado con Spring Boot para gestionar clientes. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre la entidad Cliente.

## Requisitos

- **Java JDK 8 o superior:** Asegúrate de tener instalado Java en tu sistema. Puedes descargarlo [aquí](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- **Maven:** Necesitarás Maven para compilar y ejecutar el proyecto. Puedes descargarlo [aquí](https://maven.apache.org/download.cgi).
- **MySQL Server (opcional):** Si deseas utilizar una base de datos MySQL, necesitarás tener MySQL Server instalado. Puedes descargarlo [aquí](https://dev.mysql.com/downloads/mysql/).

## Instalación

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/tu_usuario/tu_proyecto.git
   ```

2. **Importar el proyecto:**

   Importa el proyecto en tu IDE preferido (Eclipse, IntelliJ, etc.).

3. **Configurar la conexión a la base de datos:**

   - Si estás utilizando MySQL, asegúrate de tener las siguientes propiedades en el archivo `application.properties`:

     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/nombre_base_datos
     spring.datasource.username=usuario
     spring.datasource.password=contraseña
     ```

4. **Ejecutar la aplicación:**

   Utiliza Maven para ejecutar la aplicación:

   ```bash
   mvn spring-boot:run
   ```

## Uso

Una vez que la aplicación esté en funcionamiento, puedes realizar las siguientes operaciones:

- **Obtener todos los clientes:** 
  - Método: `GET`
  - URL: `http://localhost:8080/clients`

- **Obtener un cliente por ID:** 
  - Método: `GET`
  - URL: `http://localhost:8080/clients/{id}`

- **Crear un nuevo cliente:** 
  - Método: `POST`
  - URL: `http://localhost:8080/clients`
  - Cuerpo de la solicitud:
    ```json
    {
        "cedula": "123456789",
        "nombre": "Juan",
        "apellido": "Pérez",
        "telefono": "123456789",
        "email": "juan@example.com"
    }
    ```

- **Actualizar un cliente existente:** 
  - Método: `PUT`
  - URL: `http://localhost:8080/clients/{id}`
  - Cuerpo de la solicitud:
    ```json
    {
        "cedula": "123456789",
        "nombre": "Juan",
        "apellido": "Pérez",
        "telefono": "987654321",
        "email": "juan@example.com"
    }
    ```

- **Eliminar un cliente:** 
  - Método: `DELETE`
  - URL: `http://localhost:8080/clients/{id}`

## Contribución

Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:

1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/nueva-caracteristica`).
3. Realiza tus cambios y haz commit (`git commit -am 'Agrega nueva característica'`).
4. Sube tus cambios (`git push origin feature/nueva-caracteristica`).
5. Crea un nuevo Pull Request.

## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](https://opensource.org/licenses/MIT).
```
