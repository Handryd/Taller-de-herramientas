# 📦 Proyecto: Gestor de Recursos Humanos

## 📄 Descripción

Sistema de software diseñado para la gestión eficiente de empleados, solicitudes de vacaciones, permisos de ausencia y control de nómina, dirigido a MegaActividades S.A. de C.V. Este sistema integra la API de BancoNEXT para facilitar procesos bancarios relacionados con nómina.

---

## 🧩 Problema Identificado

La empresa presenta una gestión manual y desorganizada en procesos de personal y nómina, lo que provoca:
- Retrasos en la aprobación de vacaciones o permisos.
- Errores en el cálculo de nómina.
- Falta de trazabilidad en las solicitudes.

---

## 💡 Solución

Diseñar e implementar un sistema web centralizado con las siguientes funcionalidades:
- Registro y consulta de empleados.
- Solicitudes de vacaciones y permisos con flujos de aprobación.
- Cálculo y control de nómina automatizada.
- Integración con API de BancoNEXT para dispersión de pagos.

---

## 🏛️ Arquitectura

El sistema sigue el patrón **MVC (Modelo-Vista-Controlador)** y está compuesto por:

- **Frontend:** Java Server Pages (JSP), HTML, CSS.
- **Backend:** Java EE (Servlets).
- **Base de datos:** MySQL.
- **Servidor de aplicación:** GlassFish.
- **Integración continua:** Travis-CI.
- **Repositorio:** GitHub.
- **Gestión de tareas:** Trello (Gitlo).

---

## 🧭 Tabla de Contenidos

- [Descripción](#descripción)
- [Problema Identificado](#problema-identificado)
- [Solución](#solución)
- [Arquitectura](#arquitectura)
- [Requerimientos](#requerimientos)
- [Instalación](#instalación)
- [Configuración](#configuración)
- [Uso](#uso)
- [Contribución](#contribución)
- [Roadmap](#roadmap)
- [Producto](#producto)

---

## 🔧 Requerimientos

### Software
- Java JDK 17
- Apache Maven 3.9.x
- Servidor GlassFish 6.2+
- MySQL Server 8.0
- Travis-CI o Drone para CI/CD
- Navegador Web

### Paquetes Adicionales
- API REST BancoNEXT (token de autenticación)
- JSTL
- JDBC Driver MySQL

---

## 🛠️ Instalación

### 1. Ambiente de desarrollo
```bash
# Clonar el repositorio
git clone https://github.com/usuario/proyecto-gestor-rh.git
cd proyecto-gestor-rh

# Crear branches
git checkout -b develop

# Compilar
mvn clean install
