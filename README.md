## Scripts de creación de tablas en PostgreSQL

```sql
CREATE TABLE Cliente (
    ID_Cliente SERIAL PRIMARY KEY,
    Nombre VARCHAR,
    Contacto VARCHAR,
    Dirección TEXT,
    Teléfono VARCHAR,
    Correo_Electronico VARCHAR,
    Tipo_Servicio VARCHAR
);

CREATE TABLE Especialidad (
    ID_Especialidad SERIAL PRIMARY KEY,
    Nombre VARCHAR,
    Descripción TEXT
);

CREATE TABLE Especialista (
    ID_Especialista SERIAL PRIMARY KEY,
    Nombre VARCHAR,
    Apellido VARCHAR,
    ID_Especialidad INTEGER REFERENCES Especialidad(ID_Especialidad),
    Tasa_Hora NUMERIC
);

CREATE TABLE Contrato (
    ID_Contrato SERIAL PRIMARY KEY,
    ID_Cliente INTEGER REFERENCES Cliente(ID_Cliente),
    Fecha_Inicio DATE,
    Fecha_Fin DATE,
    Horas_Contratadas INTEGER
);

CREATE TABLE Ticket (
    ID_Ticket SERIAL PRIMARY KEY,
    ID_Contrato INTEGER REFERENCES Contrato(ID_Contrato),
    ID_Especialista INTEGER REFERENCES Especialista(ID_Especialista),
    Fecha_Apertura DATE,
    Fecha_Cierre DATE,
    Descripción TEXT,
    Estado VARCHAR
);

CREATE TABLE Registro_Hora (
    ID_RegistroHora SERIAL PRIMARY KEY,
    ID_Ticket INTEGER REFERENCES Ticket(ID_Ticket),
    ID_Especialista INTEGER REFERENCES Especialista(ID_Especialista),
    Fecha_Hora TIMESTAMP,
    Duración INTEGER,
    Descripción TEXT
);
