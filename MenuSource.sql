CREATE TABLE menu (
	item VARCHAR (50) PRIMARY KEY,
	half1 VARCHAR (25),
	half2 VARCHAR (25),
	amt INTEGER DEFAULT 0
);

INSERT INTO menu(item, half1, half2) VALUES
	-- Fried Rice
	('Plain Fried Rice', 'Plain', 'Fried Rice'),
	('Regular Fried Rice', 'Regular', 'Fried Rice'),
	('Vegetable Fried Rice', 'Vegetable', 'Fried Rice'),
	('Pork Fried Rice', 'Pork', 'Fried Rice'),
	('Chicken Fried Rice', 'Chicken', 'Fried Rice'),
	('Beef Fried Rice', 'Beef', 'Fried Rice'),
	('Shrimp Fried Rice', 'Shrimp', 'Fried Rice'),
	('House Special Fried Rice', 'House Special', 'Fried Rice'),

	-- Lo Mein
	('Plain Lo Mein', 'Plain', 'Lo Mein'),
	('Regular Lo Mein', 'Regular', 'Lo Mein'),
	('Vegetable Lo Mein', 'Vegetable', 'Lo Mein'),
	('Pork Lo Mein', 'Pork', 'Lo Mein'),
	('Chicken Lo Mein', 'Chicken', 'Lo Mein'),
	('Beef Lo Mein', 'Beef', 'Lo Mein'),
	('Shrimp Lo Mein', 'Shrimp', 'Lo Mein'),
	('House Special Lo Mein', 'House Special', 'Lo Mein'),

	-- Mai Fun
	('Plain Mai Fun', 'Plain', 'Mai Fun'),
	('Regular Mai Fun', 'Regular', 'Mai Fun'),
	('Vegetable Mai Fun', 'Vegetable', 'Mai Fun'),
	('Pork Mai Fun', 'Pork', 'Mai Fun'),
	('Chicken Mai Fun', 'Chicken', 'Mai Fun'),
	('Beef Mai Fun', 'Beef', 'Mai Fun'),
	('Shrimp Mai Fun', 'Shrimp', 'Mai Fun'),
	('House Special Mai Fun', 'House Special', 'Mai Fun'),

	-- Chow Mein
	('Vegetable Chow Mein', 'Vegetable', 'Chow Mein'),
	('Pork Chow Mein', 'Pork', 'Chow Mein'),
	('Chicken Chow Mein', 'Chicken', 'Chow Mein'),
	('Beef Chow Mein', 'Beef', 'Chow Mein'),
	('Shrimp Chow Mein', 'Shrimp', 'Chow Mein'),
	('House Special Chow Mein', 'House Special', 'Chow Mein'),

	-- Poultry
	('Moo Goo Gai Pan', 'Moo Goo', 'Gai Pan'),
	('Chicken w/ Broccoli', 'Chicken w/', 'Broccoli'),
	('Chicken w/ Snow Peas', 'Chicken w/', 'Snow Peas'),
	('Chicken w/ Cashew Nuts', 'Chicken w/', 'Cashew Nuts'),
	('Chicken w/ Mixed Veg.', 'Chicken w/', 'Mixed Veg.'),
	('Chicken w/ Garlic Sauce', 'Chicken w/', 'Garlic Sauce'),
	('Curry Chicken w/ Onions', 'Curry Chicken', 'w/ Onions'),
	('Kum Po Chicken', 'Kum Po', 'Chicken'),
	('Diced Chicken & Shrimp', 'Diced Chicken', '& Shrimp'),
	('Sweet & Sour Chicken', 'Sweet &', 'Sour Chicken'),
	('General Tso''s Chicken', 'General Tso''s', 'Chicken'),
	('Sesame Chicken', 'Sesame', 'Chicken'),
	('Orange Chicken', 'Orange', 'Chicken'),
	('Crispy Chicken', 'Crispy', 'Chicken'),
	('Coral Chicken', 'Coral', 'Chicken'),
	('Pepper Chicken', 'Pepper', 'Chicken'),

	-- Pork
	('Pork w/ Chinese Veg.', 'Pork w/', 'Chinese Veg.'),
	('Pork w/ Broccoli', 'Pork w/', 'Broccoli'),
	('Pork w/ Snow Peas', 'Pork w/', 'Snow Peas'),
	('Pork w/ Mushroom', 'Pork w/', 'Mushroom'),
	('Pork w/ Garlic Sauce', 'Pork w/', 'Garlic Sauce'),
	('Sweet & Sour Pork', 'Sweet &', 'Sour Pork'),
	('Sauteed Sliced Pork', 'Sauteed', 'Sliced Pork'),

	-- Beef
	('Pepper Steak w/ Onions', 'Pepper Steak', 'w/ Onions'),
	('Beef w/ Broccoli', 'Beef w/', 'Broccoli'),
	('Beef w/ Snow Peas', 'Beef w/', 'Snow Peas'),
	('Beef w/ Mushroom', 'Beef w/', 'Mushroom'),
	('Beef w/ Garlic Sauce', 'Beef w/', 'Garlic Sauce'),
	('Beef w/ Chinese Veg.', 'Beef w/', 'Chinese Veg.'),
	('Beef w/ Mixed Veg.', 'Beef w/', 'Mixed Veg.'),
	('Curry Beef w/ Onions', 'Curry Beef', 'w/ Onions'),
	('Orange Beef', 'Orange', 'Beef'),
	('Mongolian Beef', 'Mongolian', 'Beef'),

	-- Seafood
	('Shrimp w/ Lobster Sauce', 'Shrimp w/', 'Lobster Sauce'),
	('Shrimp w/ Broccoli', 'Shrimp w/', 'Broccoli'),
	('Shrimp w/ Snow Peas', 'Shrimp w/', 'Snow Peas'),
	('Shrimp w/ Cashew Nuts', 'Shrimp w/', 'Cashew Nuts'),
	('Shrimp w/ Garlic Sauce', 'Shrimp w/', 'Garlic Sauce'),
	('Shrimp w/ Chinese Veg.', 'Shrimp w/', 'Chinese Veg.'),
	('Shrimp w/ Mixed Veg.', 'Shrimp w/', 'Mixed Veg.'),
	('Shrimp w/ Curry Sauce', 'Shrimp w/', 'Curry Sauce'),
	('Kum Po Shrimp', 'Kum Po', 'Shrimp'),
	('Sweet & Sour Shrimp', 'Sweet &', 'Sour Shrimp'),
	('Crab & Shrimp Garlic Sauce', 'Crab & Shrimp', 'Garlic Sauce'),
	('Coral Shrimp', 'Coral', 'Shrimp'),

	-- Vegetable
	('Buddhist Delight', 'Buddhist', 'Delight'),
	('Moo Shu Vegetable', 'Moo Shu', 'Vegetable'),
	('Sauteed Vegetable', 'Sauteed', 'Vegetable'),
	('Mixed Veg. w/ Garlic Sauce', 'Mixed Veg. w/', 'Garlic Sauce'),
	('Broccoli w/ Garlic Sauce', 'Broccoli w/', 'Garlic Sauce'),
	('Hunan Bean Curd', 'Hunan Bean', 'Curd'),
	('Ma Po Tofu', 'Ma Po', 'Tofu'),
	('Steam Broccoli', 'Steam', 'Broccoli'),
	('Steam Mixed Veg.', 'Steam', 'Mixed Veg,'),
	('Steam Chicken w/ Broccoli', 'Steam Chicken', 'w/ Broccoli'),
	('Steam Chicken w/ Mixed Veg.', 'Steam Chicken', 'w/ Mixed Veg.'),
	('Steam Shrimp w/ Broccoli', 'Steam Shrimp', 'w/ Broccoli'),
	('Steam Shrimp w/ Mixed Veg.', 'Steam Shrimp', 'w/ Mixed Veg.'),

	-- Soup
	('Wonton Soup', 'Wonton', 'Soup'),
	('Wonton Egg Drop Soup', 'Wonton Egg', 'Drop Soup'),
	('Chicken Noodle Soup', 'Chicken', 'Noodle Soup'),
	('Chicken Rice Soup', 'Chicken', 'Rice Soup'),
	('Veg. w/ Bean Curd Soup', 'Veg. w/ Bea',  'Curd Soup'),
	('Egg Drop Soup', 'Egg', 'Drop Soup'),
	('Hot & Sour Soup', 'Hot &', 'Sour Soup'),
	('House Special Soup', 'House Special', 'Soup'),
	('Seafood Soup', 'Seafood', 'Soup'),

	-- Appetizers
	('Spring Roll (2)', 'Spring', 'Roll (2)'),
	('Pork Egg Roll', 'Pork Egg', 'Roll'),
	('Shrimp Egg Roll', 'Shrimp Egg', 'Roll'),
	('Boneless Spare Ribs', 'Boneless', 'Spare Ribs'),
	('Fried Dumplings (8)', 'Fried', 'Dumplings (8)'),
	('Steam Dumplings (8)', 'Steam', 'Dumplings (8)'),
	('Cheese Wontons (8)', 'Cheese', 'Wontons (8)'),
	('Fried Pork Wontons (10)', 'Fried Pork', 'Wontons (10)'),
	('Fried Scallops (8)', 'Fried', 'Scallops (8)'),
	('Fried Nuggets (8)', 'Fried', 'Nuggets (8)'),
	('Fried Onions (8)', 'Fried', 'Onions (12)'),
	('Apple Sticks (8)', 'Apple', 'Sticks (12)'),
	('Teriyaki Chicken (5)', 'Teriyaki', 'Chicken (5)'),
	('Teriyaki Beef (5)', 'Teriyaki', 'Beef (5)'),
	('Fried Shrimp (20)', 'Fried', 'Shrimp (20)'),

	-- Side Orders
	('White Rice', 'White', 'Rice'),
	('Sweet & Sour Sauce', 'Sweet &', 'Sour Sauce'),
	('Coral Sauce', 'Coral', 'Sauce'),
	('Dumpling Sauce', 'Dumpling', 'Sauce'),
	('Fried Noodles', 'Fried', 'Noodles'),
	('Hot Oil', 'Hot', 'Oil'),

	 -- Egg Foo Young
	('Vegetable Egg Foo Young', 'Vegetable', 'Egg Foo Young'),
	('Pork Egg Foo Young', 'Pork', 'Egg Foo Young'),
	('Chicken Egg Foo Young', 'Chicken', 'Egg Foo Young'),
	('Beef Egg Foo Young', 'Beef', 'Egg Foo Young'),
	('Shrimp Egg Foo Young', 'Shrimp', 'Egg Foo Young'),

	-- Szechuan & Hunan Cuisine
	('Seafood Pan Fried Noodles', 'Seafood Pan', 'Fried Noodles'),
	('House Pan Fried Noodles', 'House Pan', 'Fried Noodles'),
	('Happy Family', 'Happy', 'Family'),
	('Seafood Delight', 'Seafood', 'Delight'),
	('Four Seasons', 'Four', 'Seasons'),
	('Hunan Triple Delight', 'Hunan Triple', 'Delight'),
	('Hunan Beef', 'Hunan', 'Beef'),
	('Hunan Chicken', 'Hunan', 'Chicken'),
	('Moo Shu Pork', 'Moo Shu', 'Pork'),
	('Moo Shu Chicken', 'Moo Shu', 'Chicken'),
	('Moo Shu Shrimp', 'Moo Shu', 'Shrimp'),
	('Szechuan Chicken', 'Szechuan', 'Chicken');

select * from menu;