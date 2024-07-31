create database db_jv240408_mini_project;
use db_jv240408_mini_project;
create table categories(
    cate_id int auto_increment primary key,
    cate_name varchar(100) not null unique,
    status bit
);

create table products(
    product_id int auto_increment primary key,
    product_name varchar(100),
    short_description text,
    description text,
    image_name varchar(100),
    price float,
    cate_id int,
    foreign key (cate_id) references categories(cate_id)
);

create table cart(
    cart_id int auto_increment primary key,
    product_id int,
    quantity int,
    foreign key (product_id) references products(product_id)
);

insert into categories(cate_name, status) values
                                              ('Vegetables',1),
                                              ('Fruits',1),
                                              ('Meats',1);

insert into products(product_name, short_description, description, image_name, price,cate_id) values
           ('Brocoli','The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit. Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish',
            'The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish filefish Antarctic icefish goldeye aholehole trumpetfish pilot fish airbreathing catfish, electric ray sweeper. Weight 1 kg Country of Origin Agro Farm Quality Organic Сheck Healthy Min Weight 250 Kg','product01.jpg',3.35,1);
insert into products(product_name, short_description, description, image_name, price,cate_id) values
    ('Brocoli','The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit. Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish',
     'The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish filefish Antarctic icefish goldeye aholehole trumpetfish pilot fish airbreathing catfish, electric ray sweeper. Weight 1 kg Country of Origin Agro Farm Quality Organic Сheck Healthy Min Weight 250 Kg','product01.jpg',3.35,1);
insert into products(product_name, short_description, description, image_name, price,cate_id) values
    ('Brocoli','The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit. Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish',
     'The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish filefish Antarctic icefish goldeye aholehole trumpetfish pilot fish airbreathing catfish, electric ray sweeper. Weight 1 kg Country of Origin Agro Farm Quality Organic Сheck Healthy Min Weight 250 Kg','product01.jpg',3.35,1);
insert into products(product_name, short_description, description, image_name, price,cate_id) values
    ('Brocoli','The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit. Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish',
     'The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish filefish Antarctic icefish goldeye aholehole trumpetfish pilot fish airbreathing catfish, electric ray sweeper. Weight 1 kg Country of Origin Agro Farm Quality Organic Сheck Healthy Min Weight 250 Kg','product01.jpg',3.35,1);
insert into products(product_name, short_description, description, image_name, price,cate_id) values
    ('Brocoli','The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit. Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish',
     'The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish filefish Antarctic icefish goldeye aholehole trumpetfish pilot fish airbreathing catfish, electric ray sweeper. Weight 1 kg Country of Origin Agro Farm Quality Organic Сheck Healthy Min Weight 250 Kg','product01.jpg',3.35,1);
insert into products(product_name, short_description, description, image_name, price,cate_id) values
    ('Brocoli','The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit. Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish',
     'The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish filefish Antarctic icefish goldeye aholehole trumpetfish pilot fish airbreathing catfish, electric ray sweeper. Weight 1 kg Country of Origin Agro Farm Quality Organic Сheck Healthy Min Weight 250 Kg','product01.jpg',3.35,1);
insert into products(product_name, short_description, description, image_name, price,cate_id) values
    ('Brocoli','The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit. Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish',
     'The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish filefish Antarctic icefish goldeye aholehole trumpetfish pilot fish airbreathing catfish, electric ray sweeper. Weight 1 kg Country of Origin Agro Farm Quality Organic Сheck Healthy Min Weight 250 Kg','product01.jpg',3.35,1);
insert into products(product_name, short_description, description, image_name, price,cate_id) values
    ('Brocoli','The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit. Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish',
     'The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish filefish Antarctic icefish goldeye aholehole trumpetfish pilot fish airbreathing catfish, electric ray sweeper. Weight 1 kg Country of Origin Agro Farm Quality Organic Сheck Healthy Min Weight 250 Kg','product01.jpg',3.35,1);
insert into products(product_name, short_description, description, image_name, price,cate_id) values
    ('Brocoli','The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit. Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish',
     'The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish filefish Antarctic icefish goldeye aholehole trumpetfish pilot fish airbreathing catfish, electric ray sweeper. Weight 1 kg Country of Origin Agro Farm Quality Organic Сheck Healthy Min Weight 250 Kg','product01.jpg',3.35,1);
insert into products(product_name, short_description, description, image_name, price,cate_id) values
    ('Brocoli','The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit. Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish',
     'The generated Lorem Ipsum is therefore always free from repetition injected humour, or non-characteristic words etc. Susp endisse ultricies nisi vel quam suscipit Sabertooth peacock flounder; chain pickerel hatchetfish, pencilfish snailfish filefish Antarctic icefish goldeye aholehole trumpetfish pilot fish airbreathing catfish, electric ray sweeper. Weight 1 kg Country of Origin Agro Farm Quality Organic Сheck Healthy Min Weight 250 Kg','product01.jpg',3.35,1);