



CREATE TABLE CATEGORIES (
	id SERIAL PRIMARY KEY,
	category_name VARCHAR (255) UNIQUE NOT NULL
	
);

CREATE TABLE BRANDS (
	id SERIAL PRIMARY KEY,
	brand_name VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE SIZES (
	id SERIAL PRIMARY KEY,
	size_name VARCHAR (255) UNIQUE NOT NULL
);



CREATE TABLE PRODUCTS (
	id SERIAL PRIMARY KEY,
	product_name VARCHAR (255) UNIQUE NOT NULL,
	price DECIMAL NOT NULL,
	fabrics VARCHAR (255) NOT NULL,
	number_stock INTEGER NOT NULL,
	categories_id INTEGER NOT NULL,
	brands_id INTEGER NOT NULL,
	sizes_id INTEGER NOT NULL,
	CONSTRAINT fk_categories_id
    FOREIGN KEY (categories_id)
    REFERENCES categories(id),
    CONSTRAINT fk_brands_id
    FOREIGN KEY (brands_id)
    REFERENCES brands(id),
     CONSTRAINT fk_sizes_id
    FOREIGN KEY (sizes_id)
    REFERENCES sizes(id)
    
);

CREATE TABLE ROLES (
	id SERIAL PRIMARY KEY,
	role_name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE USERS (
	id SERIAL PRIMARY KEY,
	user_name VARCHAR (255) NOT NULL,
	password VARCHAR(60) NOT NULL,
	roles_id INTEGER,
	CONSTRAINT fk_roles_id
	FOREIGN KEY (roles_id)
	REFERENCES roles(id)

);
	





