CREATE TABLE menu (
	item VARCHAR (50) PRIMARY KEY,
	size1 DOUBLE PRECISION DEFAULT NULL,
	size2 DOUBLE PRECISION DEFAULT NULL,
	size3 DOUBLE PRECISION DEFAULT NULL,
	size4 DOUBLE PRECISION DEFAULT NULL,
	amt INTEGER DEFAULT 0,
	categ VARCHAR (50)
);

INSERT INTO menu(item, size1, size2, size3, size4, categ) VALUES
		-- Fried Rice
		('Plain Fried Rice', 5.1, 7.5, NULL, NULL, 'Fried Rice'),
		('Regular Fried Rice', 5.1, 7.5, NULL, NULL, 'Fried Rice'),
		('Vegetable Fried Rice', 5.1, 7.5, NULL, NULL, 'Fried Rice'),
		('Pork Fried Rice', 5.5, 7.95, NULL, NULL, 'Fried Rice'),
		('Chicken Fried Rice', 5.5, 7.95, NULL, NULL, 'Fried Rice'),
		('Beef Fried Rice', 5.95, 8.95, NULL, NULL, 'Fried Rice'),
		('Shrimp Fried Rice', 5.95, 8.95, NULL, NULL, 'Fried Rice'),
		('House Special Fried Rice', 5.95, 8.95, NULL, NULL, 'Fried Rice'),
		
		-- Lo Mein
		('Plain Lo Mein', 5.1, 7.5, 6.25, 8.3, 'Lo Mein'),
		('Regular Lo Mein', 5.1, 7.5, 6.25, 8.3, 'Lo Mein'),
		('Vegetable Lo Mein', 5.1, 7.5, 6.25, 8.3, 'Lo Mein'),
		('Pork Lo Mein', 5.5, 7.95, 6.25, 8.3, 'Lo Mein'),
		('Chicken Lo Mein', 5.5, 7.95, 6.25, 8.3, 'Lo Mein'),
		('Beef Lo Mein', 5.95, 8.95, 6.25, 8.3, 'Lo Mein'),
		('Shrimp Lo Mein', 5.95, 8.95, 6.25, 8.3, 'Lo Mein'),
		('House Special Lo Mein', 5.95, 8.95, 6.25, 8.3, 'Lo Mein'),
		
		-- Mai Fun
		('Plain Mai Fun', 5.1, 7.5, 6.25, 8.3, 'Mai Fun'),
		('Regular Mai Fun', 5.1, 7.5, 6.25, 8.3, 'Mai Fun'),
		('Vegetable Mai Fun', 5.1, 7.5, 6.25, 8.3, 'Mai Fun'),
		('Pork Mai Fun', 5.5, 7.95, 6.25, 8.3, 'Mai Fun'),
		('Chicken Mai Fun', 5.5, 7.95, 6.25, 8.3, 'Mai Fun'),
		('Beef Mai Fun', 5.95, 8.95, 6.25, 8.3, 'Mai Fun'),
		('Shrimp Mai Fun', 5.95, 8.95, 6.25, 8.3, 'Mai Fun'),
		('House Special Mai Fun', 5.95, 8.95, 6.25, 8.3, 'Mai Fun'),
		
		-- Chow Mein
		('Vegetable Chow Mein', 5.1, 7.5, 6.25, 8.3, 'Chow Mein'),
		('Pork Chow Mein', 5.5, 7.95, 6.25, 8.3, 'Chow Mein'),
		('Chicken Chow Mein', 5.5, 7.95, 6.25, 8.3, 'Chow Mein'),
		('Beef Chow Mein', 5.95, 8.95, 6.25, 8.3, 'Chow Mein'),
		('Shrimp Chow Mein', 5.95, 8.95, 6.25, 8.3, 'Chow Mein'),
		('House Special Chow Mein', 5.95, 8.95, 6.25, 8.3, 'Chow Mein'),

		-- Poultry
		('Moo Goo Gai Pan', 6.35, 9.25, 6.25, 8.3, 'Poultry'),
		('Chicken w/ Broccoli', 6.35, 9.25, 6.25, 8.3, 'Poultry'),
		('Chicken w/ Snow Peas', 6.35, 9.25, 6.25, 8.3, 'Poultry'),
		('Chicken w/ Cashew Nuts', 6.35, 9.25, 6.25, 8.3, 'Poultry'),
		('Chicken w/ Mixed Veg.', 6.35, 9.25, 6.25, 8.3, 'Poultry'),
		('Chicken w/ Garlic Sauce', 6.35, 9.25, 6.25, 8.3, 'Poultry'),
		('Curry Chicken w/ Onions', 6.35, 9.25, 6.25, 8.3, 'Poultry'),
		('Kum Po Chicken', 6.35, 9.25, 6.25, 8.3, 'Poultry'),
		('Diced Chicken & Shrimp', 6.35, 9.25, 6.25, 8.3, 'Poultry'),
		('Sweet & Sour Chicken', NULL, 9.25, 6.25, 8.3, 'Poultry'),
		('General Tso''s Chicken', NULL, 10.35, 6.5, 8.5, 'Poultry'),
		('Sesame Chicken', NULL, 10.35, 6.5, 8.5, 'Poultry'),
		('Orange Chicken', NULL, 10.35, 6.5, 8.5, 'Poultry'),
		('Crispy Chicken', NULL, 10.35, 6.5, 8.3, 'Poultry'),
		('Coral Chicken', NULL, 10.35, 6.5, 8.3, 'Poultry'),
		('Pepper Chicken', NULL, 10.35, NULL, 8.5, 'Poultry'),

		-- Pork
		('Pork w/ Chinese Veg.', 6.35, 9.25, 6.25, 8.3, 'Pork'),
		('Pork w/ Broccoli', 6.35, 9.25, 6.25, 8.3, 'Pork'),
		('Pork w/ Snow Peas', 6.35, 9.25, 6.25, 8.3, 'Pork'),
		('Pork w/ Mushroom', 6.35, 9.25, 6.25, 8.3, 'Pork'),
		('Pork w/ Garlic Sauce', 6.35, 9.25, 6.25, 8.3, 'Pork'),
		('Sweet & Sour Pork', NULL, 9.25, 6.25, 8.3, 'Pork'),
		('Sauteed Sliced Pork', NULL, 9.25, NULL, NULL, 'Pork'),

		-- Beef
		('Pepper Steak w/ Onions', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Beef w/ Broccoli', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Beef w/ Snow Peas', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Beef w/ Mushroom', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Beef w/ Garlic Sauce', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Beef w/ Chinese Veg.', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Beef w/ Mixed Veg.', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Curry Beef w/ Onions', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Orange Beef', NULL, 10.65, 6.5, 8.5, 'Beef'),
		('Mongolian Beef', NULL, 10.35, NULL, 8.5, 'Beef'),
		
		-- Seafood
		('Shrimp w/ Lobster Sauce', 6.99, 9.95, 6.25, 8.3, 'Seafood'),
		('Shrimp w/ Broccoli', 6.99, 9.95, 6.25, 8.3, 'Seafood'),
		('Shrimp w/ Snow Peas', 6.99, 9.95, 6.25, 8.3, 'Seafood'),
		('Shrimp w/ Cashew Nuts', 6.99, 9.95, 6.25, 8.3, 'Seafood'),
		('Shrimp w/ Garlic Sauce', 6.99, 9.95, 6.25, 8.3, 'Seafood'),
		('Shrimp w/ Chinese Veg.', 6.99, 9.95, 6.25, 8.3, 'Seafood'),
		('Shrimp w/ Mixed Veg.', 6.99, 9.95, 6.25, 8.3, 'Seafood'),
		('Shrimp w/ Curry Sauce', 6.99, 9.95, 6.25, 8.3, 'Seafood'),
		('Kum Po Shrimp', 6.99, 9.95, 6.25, 8.3, 'Seafood'),
		('Sweet & Sour Shrimp', NULL, 9.95, 6.25, 8.3, 'Seafood'),
		('Crab & Shrimp Garlic Sauce', NULL, 9.95, 6.25, 8.3, 'Seafood'),
		('Coral Shrimp', NULL, 12.99, 6.5, 8.5, 'Seafood'),

		-- Vegetable
		('Buddhist Delight', NULL, 8.25, NULL, NULL, 'Vegetable'),
		('Moo Shu Vegetable', NULL, 8.25, NULL, NULL, 'Vegetable'),
		('Sauteed Vegetable', NULL, 8.25, NULL, NULL, 'Vegetable'),
		('Mixed Veg. w/ Garlic Sauce', NULL, 8.25, NULL, NULL, 'Vegetable'),
		('Broccoli w/ Garlic Sauce', NULL, 8.25, NULL, NULL, 'Vegetable'),
		('Hunan Bean Curd', NULL, 8.25, NULL, NULL, 'Vegetable'),
		('Ma Po Tofu', NULL, 8.25, NULL, NULL, 'Vegetable'),
		('Steam Broccoli', NULL, 8.25, NULL, NULL, 'Vegetable'),
		('Steam Mixed Veg.', NULL, 8.25, NULL, NULL, 'Vegetable'),
		('Steam Chicken w/ Broccoli', 6.35, 9.25, 6.25, 8.3, 'Vegetable'),
		('Steam Chicken w/ Mixed Veg.', 6.35, 9.25, 6.25, 8.3, 'Vegetable'),
		('Steam Shrimp w/ Broccoli', 6.99, 9.95, 6.25, 8.3, 'Vegetable'),
		('Steam Shrimp w/ Mixed Veg.', 6.99, 9.95, 6.25, 8.3, 'Vegetable'),

		-- Soup
		('Wonton Soup', 2.5, 3.5, NULL, NULL, 'Soup'),
		('Wonton Egg Drop Soup', 2.5, 3.5, NULL, NULL, 'Soup'),
		('Chicken Noodle Soup', 2.5, 3.5, NULL, NULL, 'Soup'),
		('Chicken Rice Soup', 2.5, 3.5, NULL, NULL, 'Soup'),
		('Veg. w/ Bean Curd Soup', 2.5, 3.5, NULL, NULL, 'Soup'),
		('Egg Drop Soup', 1.99, 2.99, NULL, NULL, 'Soup'),
		('Hot & Sour Soup', 2.70, 3.99, NULL, NULL, 'Soup'),
		('House Special Soup', 4.95, NULL, NULL, NULL, 'Soup'),
		('Seafood Soup', 5.95, NULL, NULL, NULL, 'Soup'),

		-- Appetizers
		('Spring Roll (2)', 2.5, NULL, NULL, NULL, 'Appetizers'),
		('Pork Egg Roll', 1.29, NULL, NULL, NULL, 'Appetizers'),
		('Shrimp Egg Roll', 1.39, NULL, NULL, NULL, 'Appetizers'),
		('Boneless Spare Ribs', 6.25, 10.99, 6.5, 8.5, 'Appetizers'),
		('Fried Dumplings', 5.25, NULL, NULL, NULL, 'Appetizers'),
		('Steam Dumplings', 5.25, NULL, NULL, NULL, 'Appetizers'),
		('Cheese Wontons (8)', 4.5, NULL, NULL, NULL, 'Appetizers'),
		('Fried Pork Wontons (8)', 4.5, NULL, NULL, NULL, 'Appetizers'),
		('Fried Scallops (8)', 3.99, NULL, NULL, NULL, 'Appetizers'),
		('Fried Nuggets (8)', 3.99, NULL, NULL, NULL, 'Appetizers'),
		('Fried Onions (8)', 2.75, NULL, NULL, NULL, 'Appetizers'),
		('Apple Sticks (8)', 2.75, NULL, NULL, NULL, 'Appetizers'),
		('Teriyaki Chicken (5)', 4.69, NULL, NULL, NULL, 'Appetizers'),
		('Teriyaki Beef (5)', 4.99, NULL, NULL, NULL, 'Appetizers'),
		('Fried Shrimp', 6.99, NULL, NULL, NULL, 'Appetizers'),

		-- Side Orders
		('White Rice', 2.5, 3.0, NULL, NULL, 'Side Orders'),
		('Sweet & Sour Sauce', 1.0, NULL, NULL, NULL, 'Side Orders'),
		('Coral Sauce', 1.0, NULL, NULL, NULL, 'Side Orders',
		('Dumpling Sauce', 0.5, NULL, NULL, NULL, 'Side Orders'),
		('Fried Noodles', 0.5, NULL, NULL, NULL, 'Side Orders'),
/*		('Hot Oil', 0.5, NULL, NULL, NULL, 'Side Orders'),

		 -- Egg Foo Young
		('Vegetable Egg Foo Young', NULL, 8.5, NULL, 8.3, 'Egg Foo Young'),
		('Pork Egg Foo Young', NULL, 8.5, NULL, 8.3, 'Egg Foo Young'),
		('Chicken Egg Foo Young', NULL, 8.5, NULL, 8.3, 'Egg Foo Young'),
		('Beef Egg Foo Young', NULL, 9.5, NULL, 8.3, 'Egg Foo Young'),
		('Shrimp Egg Foo Young', NULL, 9.5, NULL, 8.3, 'Egg Foo Young'),

	-- Szechuan & Hunan Cuisine
		('Seafood Pan Fried Noodles', NULL, 11.7, NULL, NULL, 'Szechuan & Hunan Cuisine'),
		('House Pan Fried Noodles', NULL, 11.7, NULL, NULL, 'Szechuan & Hunan Cuisine'),
		('Happy Family', NULL, 11.7, NULL, NULL, 'Szechuan & Hunan Cuisine'),
		('Seafood Delight', NULL, 11.7, NULL, NULL, 'Szechuan & Hunan Cuisine'),
		('Four Seasons', NULL, 10.99, NULL, NULL, 'Szechuan & Hunan Cuisine'),
		('Hunan Triple Delight', NULL, 10.65, NULL, NULL, 'Szechuan & Hunan Cuisine'),
		('Hunan Beef', NULL, 10.35, 6.5, 8.5, 'Szechuan & Hunan Cuisine'),
		('Hunan Chicken', NULL, 10.35, 6.5, 8.5, 'Szechuan & Hunan Cuisine'),
		('Moo Shu Pork', NULL, 9.25, NULL, NULL, 'Szechuan & Hunan Cuisine'),
		('Moo Shu Chicken', NULL, 9.25, NULL, NULL, 'Szechuan & Hunan Cuisine'),
		('Moo Shu Shrimp', NULL, 9.95, NULL, NULL, 'Szechuan & Hunan Cuisine'),
		('Szechuan Chicken', NULL, 10.35, NULL, NULL, 'Szechuan & Hunan Cuisine'); */

select * from menu;