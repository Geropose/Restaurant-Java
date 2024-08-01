# Restaurant-Java

Palacio Duhau - Sistema de Gestión de Restaurante
## Descripción:
Este proyecto es un sistema de gestión de restaurante desarrollado en Java. Permite el manejo de platos de comida, la aplicación de descuentos, la gestión de pedidos, y la acomodación de precios en el restaurante Palacio Duhau.

## Funcionalidades Principales:
- Gestión de Ingredientes: Permite definir ingredientes con sus propiedades como nombre, tipo, modo de preparación, calorías, precio, y tiempo de preparación.
- Gestión de Platos: Permite definir platos complejos que pueden estar compuestos por varios ingredientes.
- Gestión de Pedidos: Permite crear y gestionar pedidos de clientes, agregando platos a los pedidos.
- Cálculo de Precios: Permite calcular el precio de los pedidos aplicando diferentes tipos de cálculos como descuentos condicionales o porcentuales.
- Especialidades y Estaciones de Cocina: Permite definir especialidades de cocina y estaciones que aceptan ciertos tipos de platos.

### Estructura del Proyecto:
El proyecto está estructurado en varias clases que se encargan de diferentes aspectos del sistema

### Clases del Repositorio:
- PalacioDuhau: Clase principal que inicializa y ejecuta el sistema.
- Cocina: Maneja las estaciones de cocina y los pedidos.
- Comida: Clase abstracta que define las propiedades de un alimento.
- ComidaCompleja: Extiende Comida y representa platos que pueden estar compuestos por otros alimentos.
- Ingrediente: Extiende Comida y representa ingredientes individuales.
- Pedido: Representa un pedido realizado por un cliente.
- Estacion: Representa una estación de cocina que acepta ciertos tipos de platos basados en especialidades.
- Especialidad: Clase abstracta que define un criterio de aceptación de platos en una estación.
- Calculador: Clase abstracta que define el método de cálculo de costos adicionales.
- CalculadorPorcentual: Extiende Calculador y aplica un cálculo porcentual al costo de los platos.
