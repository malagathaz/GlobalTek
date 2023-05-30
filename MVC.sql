Create database MVC;
USE MVC;
CREATE TABLE Facturas (
    idFactura INT NOT NULL AUTO_INCREMENT,
    NumeroFactura INT NOT NULL,
    Fecha DATE NOT NULL,
    TipodePago VARCHAR(45) NOT NULL,
    DocumentoCliente INT NOT NULL,
    NombreCliente VARCHAR(45) NOT NULL,
    Subtotal INT NOT NULL,
    Descuento INT NOT NULL,
    IVA INT NOT NULL,
    TotalDescuento INT NOT NULL,
    TotalImpuesto INT NOT NULL,
    Total INT NOT NULL,
    PRIMARY KEY(idFactura)
);
CREATE TABLE Productos (
    idProducto INT NOT NULL, 
    Producto VARCHAR(45) NOT NULL,
    PRIMARY KEY(idproducto)
);
CREATE TABLE Detalles (
    idDetalle INT NOT NULL AUTO_INCREMENT ,
    idFactura INT NOT NULL,
    idProducto INT NOT NULL,
    Cantidad INT NOT NULL,
    PrecioUnitario INT NOT NULL,
    PRIMARY KEY(idDetalle),
    FOREIGN KEY(idFactura) REFERENCES Facturas(idFactura),
    FOREIGN KEY(idProducto) REFERENCES Productos(idProducto)
);
Insert into Productos (idProducto, Producto)
values (1,'Camisa'),(2,'Pantalon'),(3,'Zapatos'),(4,'Tenis'),(5,'Falda'),(6,'Blusa');