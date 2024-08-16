create
definer = root@`%` procedure INSERT_CLASSROOM(IN class_name varchar(255), IN number_member int)
begin
INSERT INTO class_room(class_name,number_member) values (class_name,number_member);
end;

