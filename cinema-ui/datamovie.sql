
INSERT INTO public.movie_image (image_url, movie_movie_id) VALUES ('https://www.cgv.vn/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/r/s/rsz_vn_aqamn2_vert_tsr_2764x4096_intl_1.jpg', 1);
INSERT INTO public.actor_image (image_url, actor_actor_id) VALUES ('https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Jason_Momoa_by_Gage_Skidmore.jpg/300px-Jason_Momoa_by_Gage_Skidmore.jpg',1);

INSERT INTO public.movie (description, duration, is_display, movie_name, movie_trailer_url, release_date, category_id, director_id) VALUES ('Having failed to defeat Aquaman the first time, Black Manta, still driven by the need to avenge his father’s death, will stop at nothing to take Aquaman down once and for al', 120, true, 'Aquaman and the Lost Kingdom', 'https://www.youtube.com/watch?v=FV3bqvOHRQo', '2023-12-22', 1, 1);
INSERT INTO public.movie (description, duration, is_display, movie_name, movie_trailer_url, release_date, category_id, director_id) VALUES ('Comedic turns in an office setting', 90, true, 'The Daily Grind', 'http://trailerurl2.com', '2022-05-20', 2, 2);
INSERT INTO public.movie (description, duration, is_display, movie_name, movie_trailer_url, release_date, category_id, director_id) VALUES ('A courtroom drama that will keep you on the edge of your seat', 150, true, 'The Final Verdict', 'http://trailerurl3.com', '2022-09-10', 3, 3);
INSERT INTO public.movie (description, duration, is_display, movie_name, movie_trailer_url, release_date, category_id, director_id) VALUES ('A mystical journey through enchanted lands', 130, true, 'Realms of Myth', 'http://trailerurl4.com', '2023-12-01', 4, 4);
INSERT INTO public.movie (description, duration, is_display, movie_name, movie_trailer_url, release_date, category_id, director_id) VALUES ('Futuristic societies clash in this sci-fi epic', 140, false, 'Tomorrow’s Edge', 'http://trailerurl5.com', '2023-11-17', 5, 5);


INSERT INTO public.category (category_name) VALUES ('Action');
INSERT INTO public.category (category_name) VALUES ('Comedy');
INSERT INTO public.category (category_name) VALUES ('Drama');
INSERT INTO public.category (category_name) VALUES ('Fantasy');
INSERT INTO public.category (category_name) VALUES ('Science Fiction');


INSERT INTO public.director (director_name) VALUES ('Christopher Nolan');
INSERT INTO public.director (director_name) VALUES ('Stanley Kubrick');
INSERT INTO public.director (director_name) VALUES ('Zack Snyder');
INSERT INTO public.director (director_name) VALUES ('Quentin Tarantino');
INSERT INTO public.director (director_name) VALUES ('Martin Scorsese');
INSERT INTO public.director (director_name) VALUES ('Ridley Scott');
INSERT INTO public.director (director_name) VALUES ('Federico Fellini');
INSERT INTO public.director (director_name) VALUES ('Jean-Luc Godard');
INSERT INTO public.director (director_name) VALUES ('Hayao Miyazaki');
INSERT INTO public.director (director_name) VALUES ('Michael Bay');

INSERT INTO public.saloon (saloon_name, city_id) VALUES ('Screen 1', 1);
INSERT INTO public.saloon (saloon_name, city_id) VALUES ('Screen 2', 1);

INSERT INTO public.movie_saloon_time (movie_begin_time, movie_id, saloon_id) VALUES ('2023-11-30 14:00:00', 1, 1);
INSERT INTO public.movie_saloon_time (movie_begin_time, movie_id, saloon_id) VALUES ('2023-11-30 16:00:00', 1, 2);

INSERT INTO public.movie_image (image_url, movie_movie_id) VALUES
('https://www.cgv.vn/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/7/0/700x1000-oppen.jpg', 2);
INSERT INTO public.movie_image (image_url, movie_movie_id) VALUES
('https://www.themoviedb.org/t/p/original/4ODTvg9r3LQt31zxX6y8YELDo6p.jpg', 3);
INSERT INTO public.movie_image (image_url, movie_movie_id) VALUES
('https://www.cgv.vn/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/n/a/napoleon_poster_chair_1080x1350.jpg', 4);
INSERT INTO public.movie_image (image_url, movie_movie_id) VALUES
('https://www.cgv.vn/media/catalog/product/cache/1/image/1800x/71252117777b696995f01934522c402d/v/n/vn_flash_vert_intl_montage_2764x4096.jpg', 5);
INSERT INTO public.movie_image (image_url, movie_movie_id) VALUES
('https://i.imgur.com/8QzKJe1.jpg', 6);

INSERT INTO movie (description, duration, is_display, movie_name, movie_trailer_url, release_date, category_id, director_id)
VALUES ('A biographical film about J. Robert Oppenheimer and his role in the development of the atomic bomb.', '150', true, 'Oppenheimer', 'https://www.youtube.com/watch?v=dH9whsuL8CA', '2023-07-21', 3, 1);
INSERT INTO movie (description, duration, is_display, movie_name, movie_trailer_url, release_date, category_id, director_id)
VALUES ('A live-action feature film based on the popular line of Barbie toys.', '120', true, 'Barbie', 'https://www.youtube.com/watch?v=tOVF1fYXJfA', '2023-07-21', 2,9);
INSERT INTO movie (description, duration, is_display, movie_name, movie_trailer_url, release_date, category_id, director_id)
VALUES ('A historical epic that chronicles the life of Napoleon Bonaparte.', '180', true, 'Napoleon', 'https://www.youtube.com/watch?v=4WUUnc1M0TA', '2023-07-21',6, 6);
INSERT INTO movie (description, duration, is_display, movie_name, movie_trailer_url, release_date, category_id, director_id)
VALUES ('The Flash uses his super speed to fight crime and travel through different dimensions.', '130', true, 'The Flash', 'https://www.youtube.com/watch?v=ZDcPKqoI6Ic', '2023-07-21',5,7);

INSERT INTO movie (description, duration, is_display, movie_name, movie_trailer_url, release_date, category_id, director_id)
VALUES ('The next chapter in the Planet of the Apes franchise, set several generations after Caesar’s reign.', '145', true, 'Kingdom of the Planet of the Apes', 'https://www.youtube.com/watch?v=0', '2023-07-21', 1, 2);