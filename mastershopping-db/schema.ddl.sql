DROP TABLE If exists products;
DROP TABLE If exists categories;
DROP TABLE If exists brands;
DROP TABLE If exists sizes;
DROP TABLE If exists fabrics;
DROP TABLE If exists users;
DROP TABLE If exists roles;





CREATE TABLE categories (
	id SERIAL PRIMARY KEY,
	category_name VARCHAR (255) UNIQUE NOT NULL
	
);

CREATE TABLE brands (
	id SERIAL PRIMARY KEY,
	brand_name VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE sizes (
	id SERIAL PRIMARY KEY,
	size_name VARCHAR (255) UNIQUE NOT NULL
);

CREATE TABLE fabrics (
	id SERIAL PRIMARY KEY,
	fabric_name VARCHAR (255) UNIQUE NOT NULL
);


CREATE TABLE products (
	id SERIAL PRIMARY KEY,
	product_name VARCHAR (255) UNIQUE NOT NULL,
	picture_url VARCHAR (255)NOT NULL,
	price FLOAT NOT NULL,
	number_stock INTEGER NOT NULL,
	categories_id INTEGER NOT NULL,
	brands_id INTEGER NOT NULL,
	sizes_id INTEGER NOT NULL,
	fabrics_id INTEGER NOT NULL,
	CONSTRAINT fk_categories_id
    FOREIGN KEY (categories_id)
    REFERENCES categories(id),
    CONSTRAINT fk_brands_id
    FOREIGN KEY (brands_id)
    REFERENCES brands(id),
     CONSTRAINT fk_sizes_id
    FOREIGN KEY (sizes_id)
    REFERENCES sizes(id),
     CONSTRAINT fk_fabrics_id
    FOREIGN KEY (fabrics_id)
    REFERENCES fabrics(id)
    
);

CREATE TABLE roles (
	id SERIAL PRIMARY KEY,
	role_name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	user_name VARCHAR (255) UNIQUE NOT NULL,
	first_name VARCHAR (255) NOT NULL,
	last_name VARCHAR(255) NOT NULL,
	password VARCHAR(60) NOT NULL,
	roles_id INTEGER,
	CONSTRAINT fk_roles_id
	FOREIGN KEY (roles_id)
	REFERENCES roles(id)

);
	





