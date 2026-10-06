# EVA2_COMPUTADOR - Sistema de Registro de Computadores

Este proyecto es una aplicación de escritorio desarrollada en **Java (Swing)** y conectada a una base de datos **MySQL**. Permite realizar el registro y gestión de equipos de cómputo asociándolos a sus respectivos tipos mediante un formulario interactivo.

---

## 🚀 Características

* **Interfaz Gráfica (GUI):** Desarrollada con Java Swing (`JFrame`, `JComboBox`, `JTextField`).
* **Conexión a Base de Datos:** Persistencia en MySQL mediante el conector oficial JDBC (`mysql-connector-j`).
* **Manejo de Excepciones:** Validaciones de entrada en formularios y control de errores SQL.
* **Carga Dinámica:** Desplegable de tipos de computadora alimentado dinámicamente desde la BD.

---

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java (JDK 25 / JavaSE)
* **Entorno de Desarrollo (IDE):** Eclipse IDE
* **Base de Datos:** MySQL Server 8.x / MySQL Workbench
* **Driver JDBC:** MySQL Connector/J

---

## 📁 Estructura del Proyecto

```text
EVA2_COMPUTADOR/
├── src/
│   ├── entity/                # Clases de entidad (sistemacomputadores, tipocomputador)
│   ├── model/                 # Lógica de acceso a datos / CRUD (computadorModel, tipocomputadorModel)
│   ├── util/                  # Clases de utilidad (MySqlDBConexion)
│   └── vista/                 # Formularios e interfaz gráfica (Frmtipocomputador)
└── mysql-connector-j-26.7.0.jar # Librería del driver JDBC de MySQL

👤 Autor
Juan - Implementacion Sistemas de Informacion
---
### ¿Cómo agregarlo a tu proyecto en GitHub?

1. Ve a la página principal de tu repositorio en **GitHub**.
2. Haz clic en el botón verde **"Add a README"**.
3. Pega el código de arriba en el editor.
4. Haz clic en el botón verde **"Commit changes..."** al final de la página.
