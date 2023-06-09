# Instrucciones de ejecución proyecto
***

A continuación se muestra la forma de distribución del proyecto y la forma de ejecución con gradle.

## Tecnologias utilizadas

En general para generar la automatización se utilizo **Selenium** con el framework **Serenity BDD**. Este framework
permite la escritura de pruebas mas eficientes, reutilizables y claras para el analista, esto tambien gracias
a Cucumber, el escenario de prueba se encuetra en el archivo **buy_products.feature** que describe cada paso y verificación

```cucumber:
    Scenario: User wants to make a buy in Source Demo
      Given Ana has an account to make purchases
      And Ana can log in with their credentials
      When Ana chooses her products
      And Ana completed the formulary
      Then Ana sees a purchase confirmation
```


Para realizar una ejecución exitosa se debe tener instalado lo siguiente:

1. Java **version** 8 .211 o superior
2. Gradle **version** 7.5.1
3. Chrome *(en su version mas reciente)*
4. powershell *(consola de comandos de windows)*

**Si se quiere revisar el código de la automatización abrir el archivo build.gradle con algun IDE para java
como Intellij, Netbeans o Eclipe**

## Pasos para ejecución

1. Descargar el proyecto y dirigirse a la carpeta donde se encuentra guardado en el equipo, luego ir a la ruta *E2EDevsu > serenity-cucumber-starter*
2. Iniciar la consola o terminal en esta carpeta
3. Ejecutar el siguiente comando 

``` bash 
gradle clean test
```

4. Al finalizar la ejecución escribimos el siguiente comando en la consola o terminal para visualizar
    el reporte de pruebas *(se debe estar ubicado en la carpeta del proyecto)*.

```bash
start .\target\site\serenity\index.html
```

Se procedera a abrir el navegador con el reporte general donde se muestran los features ejecutados,
tiempos de ejecución y resultados.

**Si se desea revisar las capturas de pantallas obtenidas ir a la siguiente ruta en la pagina**

```
 Test Results > User wants to make a buy in Source Demo
```

