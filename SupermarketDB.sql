DROP TABLE BitacoraTablasMaestras;
DROP TABLE BitacoraTablaCajero;
DROP TABLE BitacoraFactura;
DROP TABLE DETALLE_FACTURA;
DROP TABLE FACTURA;
DROP TABLE CAJERO;
DROP TABLE USUARIO;
DROP TABLE PRODUCTO;

CREATE TABLE PRODUCTO(
PLU INT NOT NULL,
TIPO VARCHAR(50)NOT NULL,
DESCRIPCION VARCHAR(50)NOT NULL,
PESO FLOAT NOT NULL,
PRECIO FLOAT NOT NULL,
CANTIDAD INT NOT NULL,
EAN VARCHAR(50) NOT NULL,
CONSTRAINT PK_PLU PRIMARY KEY(PLU)
);

CREATE TABLE USUARIO(
ID INT NOT NULL,
ROL INT NOT NULL,
NOMBRE VARCHAR(50),
CLAVE VARCHAR(50),
CORREO VARCHAR(50),
CONSTRAINT PK_ID PRIMARY KEY(ID)
);

CREATE TABLE CAJERO(
NUMERO_CAJA INT NOT NULL,
ID_USUARIO INT NOT NULL,
CONSTRAINT PK_NUMERO_CAJA PRIMARY KEY(NUMERO_CAJA),
CONSTRAINT FKID_USUARIO FOREIGN KEY(ID_USUARIO)REFERENCES USUARIO(ID)
);

CREATE TABLE FACTURA(
NUMERO INT NOT NULL,
SUBTOTAL FLOAT NOT NULL,
TOTAL FLOAT NOT NULL,
FECHA DATE NOT NULL,
CANTIDAD INT NOT NULL,
ID_CAJERO INT NOT NULL,
CONSTRAINT PK_NUMERO PRIMARY KEY(NUMERO),
CONSTRAINT FK_ID_CAJERO FOREIGN KEY(ID_CAJERO)REFERENCES USUARIO(ID)
);

CREATE TABLE DETALLE_FACTURA(
    ID INT NOT NULL,
    NUMERO INT NOT NULL,
    PLU INT NOT NULL, 
    CANTIDAD INT NOT NULL,
    PRECIO_PRODUCTOS FLOAT NOT NULL,
    CONSTRAINT PK_DETALLE_FACTURA PRIMARY KEY (ID), 
    CONSTRAINT FK_FACTURA FOREIGN KEY (NUMERO) REFERENCES FACTURA (NUMERO),
    CONSTRAINT FK_PRODUCTO FOREIGN KEY (PLU) REFERENCES PRODUCTO (PLU)
);

CREATE TABLE BitacoraTablasMaestras(
OPERACION VARCHAR(30),
USUARIO VARCHAR(30),
FECHA DATE,
HORA VARCHAR2(10),
TABLA VARCHAR(30)
);

CREATE TABLE BitacoraTablaCajero(
USUARIO INT,
NUMERO_CAJA INT,
FECHA_VENTA DATE,
HORA_VENTA VARCHAR(10)
);

CREATE TABLE BitacoraFactura(
ARTICULO VARCHAR(30),
CANTIDAD INT,
SUBTOTAL FLOAT,
TOTAL FLOAT,
ID_CAJERO INT,
FECHA DATE,
HORA VARCHAR2(10)
);


CREATE OR REPLACE TRIGGER CONTROL_PRODUCTOS
BEFORE INSERT OR UPDATE OR DELETE
ON PRODUCTO
BEGIN
    IF INSERTING THEN
        INSERT INTO BitacoraTablasMaestras VALUES('INSERT', USER, SYSDATE, TO_CHAR(sysdate,'HH:MI'), 'PRODUCTO'); 
    END IF;
    IF DELETING THEN
        INSERT INTO BitacoraTablasMaestras VALUES('DELETE', USER, SYSDATE, TO_CHAR(sysdate,'HH:MI'), 'PRODUCTO'); 
    END IF;
    IF UPDATING THEN
        INSERT INTO BitacoraTablasMaestras VALUES('UPDATING', USER, SYSDATE, TO_CHAR(sysdate,'HH:MI'), 'PRODUCTO'); 
    END IF;
END CONTROL_PRODUCTOS;
/

CREATE OR REPLACE TRIGGER CONTROL_USUARIOS
BEFORE INSERT OR UPDATE OR DELETE
ON USUARIO
BEGIN
    IF INSERTING THEN
        INSERT INTO BitacoraTablasMaestras VALUES('INSERT', USER, SYSDATE, TO_CHAR(sysdate,'HH:MI'), 'USUARIO'); 
    END IF;
    IF DELETING THEN
        INSERT INTO BitacoraTablasMaestras VALUES('DELETE', USER, SYSDATE, TO_CHAR(sysdate,'HH:MI'), 'USUARIO'); 
    END IF;
    IF UPDATING THEN
        INSERT INTO BitacoraTablasMaestras VALUES('UPDATING', USER, SYSDATE, TO_CHAR(sysdate,'HH:MI'), 'USUARIO'); 
    END IF;
END CONTROL_USUARIOS;
/

CREATE OR REPLACE TRIGGER CONTROL_CAJERO
BEFORE INSERT OR UPDATE OR DELETE
ON CAJERO
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        INSERT INTO BitacoraTablaCajero VALUES(USER, :NEW.NUMERO_CAJA, SYSDATE, TO_CHAR(sysdate,'HH:MI')); 
    END IF;
    IF DELETING THEN
        INSERT INTO BitacoraTablaCajero VALUES(USER, :OLD.NUMERO_CAJA, SYSDATE, TO_CHAR(sysdate,'HH:MI')); 
    END IF;
    IF UPDATING THEN
        INSERT INTO BitacoraTablaCajero VALUES(USER, :OLD.NUMERO_CAJA, SYSDATE, TO_CHAR(sysdate,'HH:MI')); 
    END IF;
END CONTROL_CAJERO;
/


CREATE OR REPLACE TRIGGER CONTROL_FACTURAS
BEFORE INSERT OR UPDATE OR DELETE
ON FACTURA
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        INSERT INTO BitacoraFactura VALUES(:NEW.NUMERO, :NEW.CANTIDAD, :NEW.SUBTOTAL, :NEW.TOTAL, :NEW.ID_CAJERO, SYSDATE, TO_CHAR(sysdate,'HH:MI')); 
    END IF;
    IF DELETING THEN
        INSERT INTO BitacoraFactura VALUES(:OLD.NUMERO, :OLD.CANTIDAD, :OLD.SUBTOTAL, :OLD.TOTAL, :OLD.ID_CAJERO, SYSDATE, TO_CHAR(sysdate,'HH:MI')); 
    END IF;
    IF UPDATING THEN
        INSERT INTO BitacoraFactura VALUES(:OLD.NUMERO, :NEW.CANTIDAD, :NEW.SUBTOTAL, :NEW.TOTAL, :NEW.ID_CAJERO, SYSDATE, TO_CHAR(sysdate,'HH:MI')); 
    END IF;
END CONTROL_FACTURAS;
/


CREATE OR REPLACE TRIGGER CONTROL_DETALLE_FACTURAS
BEFORE INSERT OR UPDATE OR DELETE
ON DETALLE_FACTURA
FOR EACH ROW
BEGIN
     prc_compra(:NEW.PLU, :NEW.CANTIDAD);
END CONTROL_DETALLE_FACTURAS;
/


/*
Insert into USUARIO (ID,ROL,NOMBRE,CLAVE,CORREO) values (402,1,'Diego Quiros','1234','diego@gmail.com');
Insert into USUARIO (ID,ROL,NOMBRE,CLAVE,CORREO) values (150,2,'Kevin Brenes','4321','kevin@gmail.com');
Insert into USUARIO (ID,ROL,NOMBRE,CLAVE,CORREO) values (370,1,'Jairo Ulloa','1234','jairo@gmail.com');
*/
/*
select * from producto;

select * from usuario;

select * from BitacoraTablasMaestras;

select * from BitacoraFactura;

select * from usuario;
select * from Factura;
select * from DETALLE_Factura;
select * from BitacoraFactura;
*/
