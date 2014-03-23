# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table seriado (
  id                        bigint auto_increment not null,
  nome                      varchar(255),
  constraint pk_seriado primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table seriado;

SET FOREIGN_KEY_CHECKS=1;

