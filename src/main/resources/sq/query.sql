select * from users
select * from books

delete from books

insert into books(id, author, category, title, year, owner_id)
values
(1, 'Some Author', 'Some Category', 'Vavilon, Me', 1488, 9),
(2, 'Some Author', 'Some Category', 'Poor cat, Harry Potter', 1991, 13),
(3, 'Some Author', 'Some Category', 'Gore ot uma, Little Prince', 2003, 14)


insert into roles(id, name)
values (1, 'Role_Admin'),(2, 'Role_User'), (3, 'Role_Super_Admin')

select * from users_roles

insert into users_roles(user_id, roles_id)
values(9, 2),
(13, 2),
(13, 3),
(16, 1)

