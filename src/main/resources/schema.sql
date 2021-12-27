DROP TABLE IF EXISTS sample1;

CREATE TABLE `sample1` (
                           `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
                           `name` VARCHAR(50) COLLATE utf8mb4_unicode_ci NOT NULL,
                           PRIMARY KEY (`id`)
);

insert into sample1 (name) values('test1');
insert into sample1 (name) values('test2');