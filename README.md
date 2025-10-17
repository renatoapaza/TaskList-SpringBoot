# TaskList SpringBoot

Una aplicación de gestión de tareas desarrollada con Spring Boot que implementa el patrón MVC y arquitectura multicapa.

## 📋 Descripción

Este proyecto es una API REST para la gestión de tareas que permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre una lista de tareas. La aplicación está construida siguiendo las mejores prácticas de desarrollo con Spring Boot.

## 🚀 Tecnologías Utilizadas

- **Java**: 24
- **Spring Boot**: 3.5.4
- **Gestor de dependencias**: Maven
- **Packaging**: JAR
- **Base de datos**: PostgreSQL / H2 Database (para desarrollo)

## 📦 Dependencias

- **Lombok**: Reducción de código boilerplate
- **Spring Web**: Desarrollo de APIs REST
- **Spring Boot Dev Tools**: Herramientas de desarrollo
- **Spring Data JPA**: Persistencia de datos
- **H2 Database**: Base de datos en memoria para desarrollo
- **PostgreSQL Driver**: Conector para PostgreSQL

## 🏗️ Arquitectura

- **Patrón**: MVC (Modelo-Vista-Controlador)
- **Arquitectura**: Multicapa
- **Buenas prácticas implementadas**:
  - CORS configurado
  - Uso de ResponseEntity para respuestas HTTP consistentes

## 🗄️ Base de Datos

El proyecto utiliza PostgreSQL como base de datos principal.

**⚠️ Importante**: La base de datos PostgreSQL debe llamarse **`task_list`** para que la conexión funcione correctamente.

### Configuración de la Base de Datos

1. Crear la base de datos en PostgreSQL:
```sql
CREATE DATABASE task_list;

2. Las tablas se crearán automáticamente gracias a JPA/Hibernate.

## 🛠️ Instalación y Ejecución

### Prerrequisitos

- Java 24 o superior
- Maven 3.6+
- PostgreSQL Server
- IDE de tu preferencia (IntelliJ IDEA, Eclipse, VS Code)

### Pasos para ejecutar

1. **Clonar el repositorio**
```bash
git clone https://github.com/nahdaicue/TaskList_SpringBoot.git
cd TaskList_SpringBoot
```

2. **Configurar la base de datos**
   - Asegúrate de tener PostgreSQL ejecutándose
   - Crear la base de datos `task_list`
   - Verificar las credenciales en `application.properties`

3. **Compilar y ejecutar**
```bash
# Compilar el proyecto
mvn clean compile

# Ejecutar la aplicación
mvn spring-boot:run
```

4. **Acceder a la aplicación**
   - La aplicación estará disponible en: `http://localhost:8080`

## 📁 Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com/example/tasklistspringboot/
│   │       ├── controller/     # Controladores REST
│   │       ├── model/          # Entidades/Modelos
│   │       ├── repository/     # Repositorios JPA
│   │       ├── service/        # Lógica de negocio
│   │       └── config/         # Configuraciones
│   └── resources/
│       ├── application.properties
│       └── static/
└── test/
```

## 🔧 Configuración

La configuración principal se encuentra en `src/main/resources/application.properties`:

```properties
# Ejemplo de configuración para PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/task_list
spring.datasource.username=postgres
spring.datasource.password=tu_password
spring.datasource.driver-class-name=org.postgresql.Driver

# JPA/Hibernate
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

# JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 📚 API Endpoints

La aplicación expone endpoints REST para la gestión de tareas. Algunos ejemplos:

- `GET /api/tasks` - Obtener todas las tareas
- `POST /api/tasks` - Crear nueva tarea
- `GET /api/tasks/{id}` - Obtener tarea por ID
- `PUT /api/tasks/{id}` - Actualizar tarea
- `DELETE /api/tasks/{id}` - Eliminar tarea

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Para contribuir:

1. Fork del proyecto
2. Crear una rama feature (`git checkout -b feature/nueva-funcionalidad`)
3. Commit de los cambios (`git commit -am 'Agregar nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Crear un Pull Request

## 📄 Licencia

Este proyecto es de código abierto y está disponible bajo los términos que el autor considere apropiados.

## 👨‍💻 Autor

- **GitHub**: [@nahdaicue](https://github.com/nahdaicue)

## 🔗 Enlaces

- **Repositorio complementario**: [https://github.com/nahdaicue/TaskList_Angular](https://github.com/nahdaicue/TaskList_Angular)

---

⭐ Si este proyecto te fue útil, no olvides darle una estrella en GitHub!
```
