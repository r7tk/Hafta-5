/*	********** - ÖDEV 4 - ********** */

-- 1. film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız.

-- SELECT DISTINCT replacement_cost FROM film;

-- 2.film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?

/*
SELECT COUNT(DISTINCT replacement_cost)
AS birbirinden_farkli_verileri_göster
FROM film;
*/

-- 3.film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?

/*
SELECT COUNT (*) AS film_sayisi -- BURADAKİ AS KOLONLARA İSİM VERMEK İÇİN KULLANILIR ALİAS KISALTMASI AS 
FROM film
WHERE title LIKE 'T%' AND rating ='G';
*/

-- 4.country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?
/*
SELECT COUNT (*) AS Ülke_Sayisi
FROM country
WHERE LENGTH(country)=5;
*/

-- 5.city tablosundaki şehir isimlerinin kaç tanesi 'R' veya r karakteri ile biter?
 
/*SELECT COUNT (*) AS r_R_ile_bitenler
FROM city
WHERE LOWER(RIGHT(city, 1)) ='r';
*/


