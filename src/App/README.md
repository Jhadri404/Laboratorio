# 🏪 Proyecto: Sistema de Administración de Tienda

## 📋 Descripción

Este proyecto corresponde al curso **Programación II (ITI-321)** de la carrera de Ingeniería en Tecnologías de Información de la **Universidad Técnica Nacional (UTN)**.

El sistema implementa una **aplicación de escritorio en Java** orientada a objetos para administrar una tienda que gestiona:
- 🗂️ **Categorías de productos**
- 📦 **Productos vinculados a sus categorías**
- 👤 **Clientes y sus métodos de pago**
- 🧾 **Facturas y sus ítems**
- 📢 **Notificaciones por diferentes canales** (correo, SMS, WhatsApp o pantalla)

El diseño sigue principios de **buenas prácticas**, **encapsulamiento**, **separación por capas** y aplicación progresiva de **patrones de diseño**.

---

## 🧠 Objetivos de aprendizaje

1. Aplicar conceptos de **Programación Orientada a Objetos (POO)** en Java.
2. Implementar **patrones de diseño y arquitectura** para mejorar mantenibilidad y extensibilidad.
3. Desarrollar software modular y escalable con separación entre lógica de negocio y persistencia.
4. Comprender la importancia del diseño limpio y la codificación segura.

---

## ⚙️ Estructura del proyecto
📦 src/
├── App.java # Clase principal
│
├── 🗂️ Catálogo
│ ├── Categoria.java
│ ├── Producto.java
│ ├── RepositorioCategorias.java
│ ├── RepositorioProductos.java
│ └── ServicioCatalogo.java
│
├── 👤 Clientes
│ ├── Cliente.java
│ ├── MetodoPago.java
│ ├── TipoMetodoPago.java
│ ├── RepositorioClientes.java
│ └── ServicioClientes.java
│
├── 🧾 Facturación
│ ├── Factura.java
│ ├── ItemFactura.java
│ ├── EstadoFactura.java
│ ├── RepositorioFacturas.java
│ └── ServicioFacturacion.java
│
├── 📢 Notificaciones
│ ├── CanalNotificacion.java
│ ├── EstadoNotificacion.java
│ ├── Notificacion.java
│ └── ServicioNotificaciones.java
│
└── README.md

## 🧩 Patrones de diseño aplicados
Yo aplique el Metodo iterator para recorrer una colección de objetos sin exponer su estructura interna,
En este proyecto existen diversas colecciones (clientes, productos, facturas, categorías), y todas se administran desde repositorios internos que usan estructuras como Map o List.
Aplicar el patrón Iterator permite:
Recorrer los elementos sin depender del tipo de colección (ya sea un List, Map, o Set).
Encapsular la lógica de iteración, evitando que otras clases accedan directamente a las estructuras internas.
Unificar la forma de recorrer datos en todos los módulos del sistema (Clientes, Catálogo, Facturación).
Aumentar la mantenibilidad y escalabilidad, ya que si se cambia la estructura interna (por ejemplo, de HashMap a TreeMap), el resto del sistema no se ve afectado.