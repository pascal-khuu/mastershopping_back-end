



CREATE TABLE categories (
	id SERIAL PRIMARY KEY,
	category_name varchar (30) NOT NULL
	
);

CREATE TABLE products (
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


