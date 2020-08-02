INSERT into users(username,password,enabled)
values('user','user',true);
INSERT into users(username,password,enabled)
values('admin','admin',true);
INSERT into authorities(username,authority)
values('admin','ROLE_ADMIN');
INSERT into authorities(username,authority)
values('user','ROLE_USER');