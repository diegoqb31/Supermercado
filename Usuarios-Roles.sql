alter session set "_ORACLE_SCRIPT"=true; 

drop user Cajero1 cascade;
drop user Cajero2 cascade;
drop user Cajero3 cascade;
drop user Gerente1 cascade;
drop user Gerente2 cascade;
drop user Gerente3 cascade;
drop user Gerente4 cascade;
drop user GerenteG1 cascade;
drop user GerenteG2 cascade;
drop user Sistemas1 cascade;
drop user Sistemas2 cascade;

create user Cajero1 identified by Cajero1
default tablespace users
temporary tablespace temp
quota unlimited on users;

create user Cajero2 identified by Cajero2
default tablespace users
temporary tablespace temp
quota unlimited on users;

create user Cajero3 identified by Cajero3
default tablespace users
temporary tablespace temp
quota unlimited on users;

create user Gerente1 identified by Gerente1
default tablespace users
temporary tablespace temp
quota unlimited on users;

create user Gerente2 identified by Gerente2
default tablespace users
temporary tablespace temp
quota unlimited on users;

create user Gerente3 identified by Gerente3
default tablespace users
temporary tablespace temp
quota unlimited on users;

create user Gerente4 identified by Gerente4
default tablespace users
temporary tablespace temp
quota unlimited on users;

create user GerenteG1 identified by GerenteG1
default tablespace users
temporary tablespace temp
quota unlimited on users;

create user GerenteG2 identified by GerenteG2
default tablespace users
temporary tablespace temp
quota unlimited on users;

create user Sistemas1 identified by Sistemas1
default tablespace users
temporary tablespace temp
quota unlimited on users;

create user Sistemas2 identified by Sistemas2
default tablespace users
temporary tablespace temp
quota unlimited on users;

drop role cajero;
drop role gerenteArea;
drop role gerenteGen;
drop role sistemas;

create role cajero;
create role gerenteArea;
create role gerenteGen;
create role sistemas;

grant connect to cajero;
grant connect to gerenteArea;
grant connect to gerenteGen;
grant connect to sistemas;

grant cajero to Cajero1;
grant cajero to Cajero2;
grant cajero to Cajero3;

grant gerenteArea to Gerente1;
grant gerenteArea to Gerente2;
grant gerenteArea to Gerente3;
grant gerenteArea to Gerente4;

grant gerenteGen to GerenteG1;
grant gerenteGen to GerenteG2;

grant dba to Sistemas1;
grant dba to Sistemas2;

grant insert on DETALLE_FACTURA to cajero;
grant execute on prc_compra to cajero;

create or replace procedure prc_compra(PId in INT, PCantPro in INT) is
begin
  update PRODUCTO
  set    CANTIDAD  = (CANTIDAD - PCantPro)
  where  PLU   = PId;
end prc_compra;
/
show error


grant update, insert, delete, select on PRODUCTO to gerenteGen;

grant select on PRODUCTO to gerenteArea;
grant update (DESCRIPCION) on PRODUCTO to gerenteArea;
grant update (CANTIDAD) on PRODUCTO to gerenteArea;  
grant select on PRODUCTO to CAJERO;
grant insert on Factura to CAJERO;
grant insert, select on Detalle_Factura to CAJERO;

/*De aquí para abajo es para pruebas*/
/*
grant select on PRODUCTO to CAJERO;
grant select on usuario to cajero;
*/



