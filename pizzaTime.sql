CREATE TABLE "User" (
    id BIGINT NOT NULL,
    Name VARCHAR(255) NOT NULL,
    Surname VARCHAR(255) NOT NULL,
    Phone_number CHAR(255) NOT NULL,
    Password VARCHAR(255) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE Dish (
    id BIGINT NOT NULL,
    Dish_name VARCHAR(255) NOT NULL,
    Description VARCHAR(255) NOT NULL,
    Number_of_grams INTEGER NOT NULL,
    Price_Number INTEGER NOT NULL,
    PRIMARY KEY(id)
);

CREATE INDEX dish_dish_name_index ON Dish(Dish_name);
CREATE INDEX dish_number_of_grams_index ON Dish(Number_of_grams);
CREATE INDEX dish_price_number_index ON Dish(Price_Number);


CREATE TABLE "Order" (
    id bigserial NOT NULL,
    Address VARCHAR(255) NOT NULL,
    Delivery_time DATE NOT NULL,
    Cost_of_the_order INTEGER NOT NULL,
    "User" bigserial NOT NULL,
    PRIMARY KEY(id),
    CONSTRAINT order_user_foreign FOREIGN KEY("User") REFERENCES "User"(id)
);

CREATE INDEX order_cost_of_the_order_index ON "Order"(Cost_of_the_order);
CREATE INDEX order_user_index ON "Order"("User");

CREATE TABLE Dish_order (
    id bigserial NOT NULL,
    "Order" bigserial NOT NULL,
    Dish bigserial NOT NULL,
    Count INTEGER NOT NULL,
    PRIMARY KEY(id),
    CONSTRAINT dish_order_dish_foreign FOREIGN KEY(Dish) REFERENCES Dish(id),
    CONSTRAINT dish_order_order_foreign FOREIGN KEY("Order") REFERENCES "Order"(id)
);

CREATE INDEX dish_order_order_index ON Dish_order("Order");
CREATE INDEX dish_order_dish_index ON Dish_order(Dish);
CREATE INDEX dish_order_count_index ON Dish_order(Count);