INSERT INTO CATEGORIES (category_name) values ('Pantalon'), ('Jeans'),('T-shirt'),('Echarpe'),('Chapeau'),('Bonnet');
INSERT INTO BRANDS (brand_name) values ('ZARA'), ('TIMBERLAND'),('COACH'),('MICHAEL KORS'),('GIVENCHY');
INSERT INTO SIZES (size_name) values ('S'),('XS'),('M'),('L'),('XL'),('XXL');
INSERT INTO FABRICS (fabric_name) values ('Coton'), ('Laine'),('Soie'), ('Paille');

INSERT INTO PRODUCTS (product_name,picture_url,price,number_stock,categories_id,brands_id,sizes_id, fabrics_id)
values ('Jean de Lorrenzo','assets/products/Jeans.png',50.00,5,2,1,1,1),
('Pantalon de noisette','assets/products/Pantalon.png',78.79,7,1,3,4,2),
('Bonnet de bonheur','assets/products/Bonnet.png',35,77,6,3,1,3),
('Echarpe Le Roselle','assets/products/Echarpe.png',35.78,9,4,1,5,4),
('Le Roseau','assets/products/Tshirt.png',8.89,10,3,4,3,3),
('La Boule de Neige','assets/products/Pantalon.png', 89,91,1,5,1,1);
INSERT INTO ROLES (role_name) values ('ROLE_ADMIN');

INSERT INTO USERS (user_name,first_name,last_name,password,roles_id) 
values ('pascal.khuu@gmail.com','pascal','khuu','$2a$10$ou7/KwnnMYeWA4LSbtBSWeZ73pnhg3m1hADKbI3zC4Bj2YZKHjfnS',1),
('henry.loret@gmail.com','henry','loret','$2a$10$hWGbG0L9zleBP6oPpUC/4uPlYpQqSvBVld.JE8czabIZnIegPwLQ',1);

INSERT INTO USERS (user_name,first_name,last_name,password)
values ('paul.henry@gmail.com','paul','henry','$2a$10$wW5cM4gEqIQcqf0fCOYYuu9mFAO3CvOYQVDIxvuNMpcsDdIzdS2mS');