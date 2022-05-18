INSERT INTO CATEGORIES (category_name) values ('Pantalon'), ('Jeans'),('T-shirt'),('Echarpe'),('Chapeau'),('Bonnet');
INSERT INTO BRANDS (brand_name) values ('ZARA'), ('TIMBERLAND'), ('COACH');
INSERT INTO SIZES (size_name) values ('S'),('XS'),('M'),('L'),('XL'),('XXL');
INSERT INTO FABRICS (fabrics_name) values ('coton'), ('laine'),('soie'), ('paille');
INSERT INTO PRODUCTS (product_name,price,number_stock,categories_id,brands_id,sizes_id, fabrics_id) values ('Jean de Lorrenzo',50.00,5,1,1,1,1);
INSERT INTO ROLES (role_name) values ('ROLE_ADMIN');
INSERT INTO USERS (user_name,first_name,last_name,password,roles_id) values ('pascal.khuu@gmail.com','pascal','khuu','$2a$10$ou7/KwnnMYeWA4LSbtBSWeZ73pnhg3m1hADKbI3zC4Bj2YZKHjfnS',1),('henry.loret@gmail.com','henry','loret','$2a$10$hWGbG0L9zleBP6oPpUC/4uPlYpQqSvBVld.JE8czabIZnIegPwLQ',1);
INSERT INTO USERS (user_name,first_name,last_name,password) values ('paul.henry@gmail.com','paul','henry','$2a$10$wW5cM4gEqIQcqf0fCOYYuu9mFAO3CvOYQVDIxvuNMpcsDdIzdS2mS');