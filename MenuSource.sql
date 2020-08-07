CREATE TABLE menu (
	item VARCHAR (50) PRIMARY KEY,
	size1 DOUBLE PRECISION DEFAULT 0.0,
	size2 DOUBLE PRECISION DEFAULT 0.0,
	size3 DOUBLE PRECISION DEFAULT 0.0,
	size4 DOUBLE PRECISION DEFAULT 0.0,
	amt INTEGER DEFAULT 0,
	categ VARCHAR (50)
);

INSERT INTO menu(item, size1, size2, size3, size4, categ) VALUES
		-- Fried Rice
		('Plain Fried Rice', 5.1, 7.5, 0, 0, 'Fried Rice'),
		('Regular Fried Rice', 5.1, 7.5, 0, 0, 'Fried Rice'),
		('Vegetable Fried Rice', 5.1, 7.5, 0, 0, 'Fried Rice'),
		('Pork Fried Rice', 5.5, 7.95, 0, 0, 'Fried Rice'),
		('Chicken Fried Rice', 5.5, 7.95, 0, 0, 'Fried Rice'),
		('Beef Fried Rice', 5.95, 8.95, 0, 0, 'Fried Rice'),
		('Shrimp Fried Rice', 5.95, 8.95, 0, 0, 'Fried Rice'),
		('House Special Fried Rice', 5.95, 8.95, 0, 0, 'Fried Rice'),
		
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
		('Sweet & Sour Chicken', 0, 9.25, 6.25, 8.3, 'Poultry'),
		('General Tso''s Chicken', 0, 10.35, 6.5, 8.5, 'Poultry'),
		('Sesame Chicken', 0, 10.35, 6.5, 8.5, 'Poultry'),
		('Orange Chicken', 0, 10.35, 6.5, 8.5, 'Poultry'),
		('Crispy Chicken', 0, 10.35, 6.5, 8.3, 'Poultry'),
		('Coral Chicken', 0, 10.35, 6.5, 8.3, 'Poultry'),
		('Pepper Chicken', 0, 10.35, 0, 8.5, 'Poultry'),

		-- Pork
		('Pork w/ Chinese Veg.', 6.35, 9.25, 6.25, 8.3, 'Pork'),
		('Pork w/ Broccoli', 6.35, 9.25, 6.25, 8.3, 'Pork'),
		('Pork w/ Snow Peas', 6.35, 9.25, 6.25, 8.3, 'Pork'),
		('Pork w/ Mushroom', 6.35, 9.25, 6.25, 8.3, 'Pork'),
		('Pork w/ Garlic Sauce', 6.35, 9.25, 6.25, 8.3, 'Pork'),
		('Sweet & Sour Pork', 0, 9.25, 6.25, 8.3, 'Pork'),
		('Sauteed Sliced Pork', 0, 9.25, 0, 0, 'Pork'),

		-- Beef
		('Pepper Steak w/ Onions', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Beef w/ Broccoli', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Beef w/ Snow Peas', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Beef w/ Mushroom', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Beef w/ Garlic Sauce', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Beef w/ Chinese Veg.', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Beef w/ Mixed Veg.', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Curry Beef w/ Onions', 6.99, 9.95, 6.25, 8.3, 'Beef'),
		('Orange Beef', 0, 10.65, 6.5, 8.5, 'Beef'),
		('Mongolian Beef', 0, 10.35, 0, 8.5, 'Beef'),
		
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
		('Sweet & Sour Shrimp', 0, 9.95, 6.25, 8.3, 'Seafood'),
		('Crab & Shrimp Garlic Sauce', 0, 9.95, 6.25, 8.3, 'Seafood'),
		('Coral Shrimp', 0, 12.99, 6.5, 8.5, 'Seafood'),

		-- Vegetable
		('Buddhist Delight', 0, 8.25, 0, 0, 'Vegetable'),
		('Moo Shu Vegetable', 0, 8.25, 0, 0, 'Vegetable'),
		('Sauteed Vegetable', 0, 8.25, 0, 0, 'Vegetable'),
		('Mixed Veg. w/ Garlic Sauce', 0, 8.25, 0, 0, 'Vegetable'),
		('Broccoli w/ Garlic Sauce', 0, 8.25, 0, 0, 'Vegetable'),
		('Hunan Bean Curd', 0, 8.25, 0, 0, 'Vegetable'),
		('Ma Po Tofu', 0, 8.25, 0, 0, 'Vegetable'),
		('Steam Broccoli', 0, 8.25, 0, 0, 'Vegetable'),
		('Steam Mixed Veg.', 0, 8.25, 0, 0, 'Vegetable'),
		('Steam Chicken w/ Broccoli', 6.35, 9.25, 6.25, 8.3, 'Vegetable'),
		('Steam Chicken w/ Mixed Veg.', 6.35, 9.25, 6.25, 8.3, 'Vegetable'),
		('Steam Shrimp w/ Broccoli', 6.99, 9.95, 6.25, 8.3, 'Vegetable'),
		('Steam Shrimp w/ Mixed Veg.', 6.99, 9.95, 6.25, 8.3, 'Vegetable'),

		-- Soup
		('Wonton Soup', 2.5, 3.5, 0, 0, 'Soup'),
		('Wonton Egg Drop Soup', 2.5, 3.5, 0, 0, 'Soup'),
		('Chicken Noodle Soup', 2.5, 3.5, 0, 0, 'Soup'),
		('Chicken Rice Soup', 2.5, 3.5, 0, 0, 'Soup'),
		('Veg. w/ Bean Curd Soup', 2.5, 3.5, 0, 0, 'Soup'),
		('Egg Drop Soup', 1.99, 2.99, 0, 0, 'Soup'),
		('Hot & Sour Soup', 2.70, 3.99, 0, 0, 'Soup'),
		('House Special Soup', 4.95, 0, 0, 0, 'Soup'),
		('Seafood Soup', 5.95, 0, 0, 0, 'Soup'),

		-- Appetizers
		('Spring Roll (2)', 2.5, 0, 0, 0, 'Appetizers'),
		('Pork Egg Roll', 1.29, 0, 0, 0, 'Appetizers'),
		('Shrimp Egg Roll', 1.39, 0, 0, 0, 'Appetizers'),
		('Boneless Spare Ribs', 6.25, 10.99, 6.5, 8.5, 'Appetizers'),
		('Fried Dumplings (8)', 5.25, 0, 0, 0, 'Appetizers'),
		('Steam Dumplings (8)', 5.25, 0, 0, 0, 'Appetizers'),
		('Cheese Wontons (8)', 4.5, 0, 0, 0, 'Appetizers'),
		('Fried Pork Wontons (10)', 4.5, 0, 0, 0, 'Appetizers'),
		('Fried Scallops (8)', 3.99, 0, 0, 0, 'Appetizers'),
		('Fried Nuggets (8)', 3.99, 0, 0, 0, 'Appetizers'),
		('Fried Onions (8)', 2.75, 0, 0, 0, 'Appetizers'),
		('Apple Sticks (8)', 2.75, 0, 0, 0, 'Appetizers'),
		('Teriyaki Chicken (5)', 4.69, 0, 0, 0, 'Appetizers'),
		('Teriyaki Beef (5)', 4.99, 0, 0, 0, 'Appetizers'),
		('Fried Shrimp (20)', 6.99, 0, 0, 0, 'Appetizers'),

		-- Side Orders
		('White Rice', 2.5, 3.0, 0, 0, 'Side Orders'),
		('Sweet & Sour Sauce', 1.0, 0, 0, 0, 'Side Orders'),
		('Coral Sauce', 1.0, 0, 0, 0, 'Side Orders'),
		('Dumpling Sauce', 0.5, 0, 0, 0, 'Side Orders'),
		('Fried Noodles', 0.5, 0, 0, 0, 'Side Orders'),
		('Hot Oil', 0.5, 0, 0, 0, 'Side Orders'),

		 -- Egg Foo Young
		('Vegetable Egg Foo Young', 0, 8.5, 0, 8.3, 'Egg Foo Young'),
		('Pork Egg Foo Young', 0, 8.5, 0, 8.3, 'Egg Foo Young'),
		('Chicken Egg Foo Young', 0, 8.5, 0, 8.3, 'Egg Foo Young'),
		('Beef Egg Foo Young', 0, 9.5, 0, 8.3, 'Egg Foo Young'),
		('Shrimp Egg Foo Young', 0, 9.5, 0, 8.3, 'Egg Foo Young'),

		-- Szechuan & Hunan Cuisine
		('Seafood Pan Fried Noodles', 0, 11.7, 0, 0, 'Szechuan & Hunan'),
		('House Pan Fried Noodles', 0, 11.7, 0, 0, 'Szechuan & Hunan'),
		('Happy Family', 0, 11.7, 0, 0, 'Szechuan & Hunan'),
		('Seafood Delight', 0, 11.7, 0, 0, 'Szechuan & Hunan'),
		('Four Seasons', 0, 10.99, 0, 0, 'Szechuan & Hunan'),
		('Hunan Triple Delight', 0, 10.65, 0, 0, 'Szechuan & Hunan'),
		('Hunan Beef', 0, 10.35, 6.5, 8.5, 'Szechuan & Hunan'),
		('Hunan Chicken', 0, 10.35, 6.5, 8.5, 'Szechuan & Hunan'),
		('Moo Shu Pork', 0, 9.25, 0, 0, 'Szechuan & Hunan'),
		('Moo Shu Chicken', 0, 9.25, 0, 0, 'Szechuan & Hunan'),
		('Moo Shu Shrimp', 0, 9.95, 0, 0, 'Szechuan & Hunan'),
		('Szechuan Chicken', 0, 10.35, 0, 0, 'Szechuan & Hunan');

select * from menu;