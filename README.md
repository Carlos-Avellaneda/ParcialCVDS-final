# ParcialCVDS-final

## Como funciona

### 1. Diagrama de componentes

![](https://github.com/Carlos-Avellaneda/Parcial_CVDS/blob/main/1.png)

En el diagrama de componentes podemos apreciar que este funciona con con 3 clases principales:

Date que se refiere a la entidad de las citas unicamente (Contiene getter y setters para cada atributo)

DateRepository funciona como la interfaz que conecta mongo con los endpoint 

DateController el cual es quien realiza las peticiones y se conecta con la base de datos .

### Desgraciadamente la base datos fallo y esta no se puede conectar con el servidor de mongo.

### Ejecucion de Back
Este consiste en una Springboot app que para correr, y una vez funcionando se le manda a azure para que 
ya quede todo montado en la red.
![](https://github.com/Carlos-Avellaneda/Parcial_CVDS/2.png)


Una vez estuviese desplegado en azure se usaria la siguiente
url para hacer las peticiones: 

**parcialcvds-cvdsgafdfjhngxd0.canadacentral-01.azurewebsites.net**

Siendo esta proporcionada por azure y a la cual se le harian las peticiones
