# README

###### Es necesario crear un sistema de delegación de permisos, en los que un usuario registrado en la Sucursal Virtual va a poder dar permisos a un Rut (que puede o no estar registrado), para que tenga acceso primeramente a la información del producto y tráfico asociado. Además podrá o no dar permisos para visualizar la información de facturación y generación de solicitudes de ese producto.

###### Detalle de la solicitud:

###### Despliegue
###### Permitir al Titular legar permisos a otros RUT para acceso a información de servicios de su propia cuenta.
###### Atributos a considerar: Productos y Tráficos, Boletas, acceso a dashboard.
###### Un Titular permite acceso a uno de sus servicios a otro usuario, basado en el RUT, mail y pcs contacto.
######Formulario registro considera: RUT, Nombres/Apellidos, mail, servicio legado, permisos proporcionados.
######El Titular puede: Crear, Editar, Eliminar y listar todos sus usuarios, en un máximo de 3 por servicio activo
######1 Titular puede legar un servicio específico a un máximo de 3 usuarios distintos.
######1 persona puede tener un máximo de 5 servicios asociados desde otros usuarios.
######Al generar los permisos, se enviará un SMS y un correo informando la entrega de estos.
######Implementación
###### Atributos de visualización: Producto y tráficos (defecto + resumen de tráfico), boleta (incluye modulo boleta, deuda y descarga), acceso a dashboard (definir vínculos a habilitar para usuarios)
######Construcción de vista con listado de usuarios y mantención de estos. Alertas por incumplimiento de reglas o máximo de registros.
######Envío de SMS es a todo destino
######Envío de mail debe estar diferenciado, con plantilla específica.
######Al momento tras dar permisos , se validará existencia de cuenta legada. Si cuenta no existe, se creará usuario, informando vía SMS y mail específico al proceso de creación más un nuevo correo con la definición de los permisos entregados.
