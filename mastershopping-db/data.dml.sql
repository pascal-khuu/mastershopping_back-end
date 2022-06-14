INSERT INTO CATEGORIES (category_name) values 
	('Pantalon'), 
	('Jeans'),
	('T-shirt'),
	('Echarpe'),
	('Chapeau'),
	('Bonnet');
	
INSERT INTO BRANDS (brand_name) values 
	('ZARA'),
	('TIMBERLAND'),
	('COACH'),
	('MICHAEL KORS'),
	('GIVENCHY');
INSERT INTO SIZES (size_name) values
	('S'),
	('XS'),
	('M'),
	('L'),
	('XL'),
	('XXL');
INSERT INTO FABRICS (fabric_name) values
	('Coton'),
	('Laine'),
	('Soie'),
	('Paille');

INSERT INTO PRODUCTS (product_name,picture_url,price,number_stock,categories_id,brands_id,sizes_id, fabrics_id) values 
	('Jean de Lorrenzo','assets/products/Jeans.png',50.00,5,
		(select id from categories where category_name='Jeans'),
		(select id from brands where brand_name='ZARA'),
		(select id from sizes where size_name='S'),
		(select id from fabrics where fabric_name='Coton')),
	('Pantalon de noisette','assets/products/Pantalon.png',78.79,7,
		(select id from categories where category_name='Pantalon'),
		(select id from brands where brand_name='COACH'),
		(select id from sizes where size_name='L'),
		(select id from fabrics where fabric_name='Laine')),
	('Bonnet de bonheur','assets/products/Bonnet.png',35,77,
		(select id from categories where category_name='Bonnet'),
		(select id from brands where brand_name='COACH'),
		(select id from sizes where size_name='S'),
		(select id from fabrics where fabric_name='Soie')),
	('Echarpe Le Roselle','assets/products/Echarpe.png',35.78,9,
		(select id from categories where category_name='Echarpe'),
		(select id from brands where brand_name='ZARA'),
		(select id from sizes where size_name='XL'),
		(select id from fabrics where fabric_name='Paille')),
	('Le Roseau','assets/products/Tshirt.png',8.89,10,
		(select id from categories where category_name='T-shirt'),
		(select id from brands where brand_name='MICHAEL KORS'),
		(select id from sizes where size_name='M'),
		(select id from fabrics where fabric_name='Soie')),
	('La Boule de Neige','assets/products/Pantalon.png',89,91,
		(select id from categories where category_name='Pantalon'),
		(select id from brands where brand_name='GIVENCHY'),
		(select id from sizes where size_name='XS'),
		(select id from fabrics where fabric_name='Coton'));
	
/*	
('Chapeau de Luxe','assets/products/chapeau.png',47.99,5,3,5,3),

*/

INSERT INTO ROLES (role_name) values ('ROLE_ADMIN');

INSERT INTO USERS (user_name,first_name,last_name,password,roles_id) 
values ('pascal.khuu@gmail.com','pascal','khuu','$2a$10$ou7/KwnnMYeWA4LSbtBSWeZ73pnhg3m1hADKbI3zC4Bj2YZKHjfnS',1),
('henry.loret@gmail.com','henry','loret','$2a$10$hWGbG0L9zleBP6oPpUC/4uPlYpQqSvBVld.JE8czabIZnIegPwLQ',1);

INSERT INTO USERS (user_name,first_name,last_name,password)
values ('paul.henry@gmail.com','paul','henry','$2a$10$wW5cM4gEqIQcqf0fCOYYuu9mFAO3CvOYQVDIxvuNMpcsDdIzdS2mS');