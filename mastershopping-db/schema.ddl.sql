



CREATE TABLE CATEGORIES (
	id SERIAL PRIMARY KEY,
	category_name varchar (30) NOT NULL
	
);

CREATE TABLE PRODUCTS (
	id SERIAL PRIMARY KEY,
	product_name varchar (30) NOT NULL,
	brand varchar(30) NOT NULL,
	price DECIMAL NOT NULL,
	size varchar (30) NOT NULL,
	fabrics varchar (30) NOT NULL,
	categories_id INTEGER NOT NULL,
	CONSTRAINT fk_categories_id
    FOREIGN KEY (categories_id)
    REFERENCES categories(id)
);

CREATE TABLE ROLES (
	id SERIAL PRIMARY KEY,
	role_name varchar(30) NOT NULL
);

CREATE TABLE USERS (
	id SERIAL PRIMARY KEY,
	user_name varchar (30) NOT NULL,
	password varchar(60) NOT NULL,
	roles_id INTEGER NOT NULL,
	CONSTRAINT fk_roles_id
	FOREIGN KEY (roles_id)
	REFERENCES roles(id)

);
	





