# Ejercicios de Lógica de Programación en Java

Estos ejercicios están diseñados para practicar:

- Uso de `if`
- Uso de `do-while`
- Validación de datos
- Variables estilo contador
- Variables booleanas
- Menús interactivos

---

# Ejercicio 1 — Control de Acceso a Laboratorio

## Contexto

Un laboratorio de computación tiene un sistema simple de control de acceso.

Solo los usuarios autorizados pueden ingresar.

## Datos válidos

Usuario: `admin`  
Clave: `1234`

## Requisitos

El sistema debe:

1. Solicitar el nombre de usuario
2. Solicitar la contraseña del usuario
3. Permitir **máximo 3 intentos**

## Reglas

Si las credenciales son correctas:

Acceso permitido

Si falla alguna:

El usuario o contraseña son incorrectos **tiene X oportunidades restantes antes que su usuario sea bloqueado**

Si se superan los 3 intentos:

Acceso bloqueado

## Requisitos técnicos

- Usar `do-while`
- Usar `if`
- Controlar el número de intentos con una variable

---

# Ejercicio 2 — Control de Cajero Automático

## Contexto

Un cajero automático tiene **500000 pesos disponibles**.

El usuario puede consultar su saldo o retirar dinero.

## Menú

1. Consultar saldo
2. Retirar dinero
3. Salir

## Reglas

Cuando el usuario quiera retirar dinero:

El sistema debe solicitar el monto.

Validaciones:

- El monto debe ser **mayor que 0**
- El monto **no puede superar el saldo disponible**

Si el retiro es válido:

Retiro exitoso
Saldo restante: ___

Si el retiro es no válido:

Cantidad de saldo no disponible
Saldo disponible: ___

## Requisitos técnicos

- Usar `do-while` para repetir el menú
- Usar `if` para validar el monto
- Actualizar el saldo después del retiro

---

# Ejercicio 3 — Registro de Ventas

## Contexto

Un vendedor debe registrar las ventas realizadas durante el día.

## Menú

1. Registrar venta
2. Ver total vendido
3. Salir

## Funcionamiento

Cuando el usuario elija **Registrar venta**:

El sistema debe solicitar:

- Valor de la venta

## Reglas

- El valor de la venta debe ser **mayor que 0**
- El sistema debe **acumular el total vendido**

Ejemplo:

"Venta registrada
Total vendido: 250000"
