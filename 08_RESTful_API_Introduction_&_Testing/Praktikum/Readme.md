# Pengenalan RESTful API

## API
API sendiri adalah singkatan dari Application Programming Interface yang memungkinan sesuatu aplikasi berkomunikasi dan bertukar data antara 2 atau lebih software yang terpisah. 

* Workflow *

Client <--> API <--> System/Server

## REST API
REST atau Representational State Transfer adalah standard arsitektur pemrograman berbasis web yang umummnya menggunakan HTTP sebagai protokol untuk komunikasi data. REST juga merupakan salah satu implementasi web service sebagai standar untuk pertukaran data. Jika API adalah penghubung, maka REST ini yang membuat aturan sesuai keinignan programmer dalam merancang web service. 

## HTTP METHOD

Resource : URL
GET : Membaca Data
PUT : Mengganti data
POST : Membuat data baru
DELETE : Menghapus data yang ada

## REST API Component
- Method
- URL
- Header
- Body

## JSON
Biasanya di dalam API terdapat JSON, JSON atau JavaScript Object Notation adalah sebuah format data yang digunakan untuk pertukaran dan penyimpanan data. JSON bisa dibaca oleh berbagai bahasa pemrograman seperti C, C++, Java, Phyton, dll.

* Contohnya : *
{
	"nama" : "Sammy",
	"location" : "Ocean",
	"followers" : "987"
}

## HTTP Response Code
- 200 OK : menandakan request yang dikirim success
- 201 Created : menandakan request yang dikirim success dan resources yang dikirim  berhasil dibuat, biasanya dipakai method POST dan PUT
- 400 Bad Request : data tidak sesuai dengan format saat request POST atau PUT
- 404 Not Found : terjadi ketika resource tidak ditemukan
- 401 Unauthorized : terjadi karena tidak melakukan autentikasi
- 405 Method : salah menggunakan method
- 500 Internal : kesalah di server

# API Testing
API Testing adalah test yang dilakukan pada layer dimana API yang didesain bisa dipastikan fungsionalitasnya. API diharapkan bisa memberikan gambaran respon aplikasi web sebelum UI-nya siap.

## Macam API Testing
- Functionality
  -> ditujukan untuk memvalidasi suatu fitur sudah berfungsi apa belum
- Load Test
  -> Untuk menguji kekuatan suatu sistem
- Security
  -> menguji keamanan suatu sistem

## Tools API Testing
- Postman
- JMeter
- frisby.js
- REST-assured

## Perbedaan API Test & Unit Test
Unit Test:
- Dilakukan oleh Developer
- Fungsi - fungsi terpisah
- Developer bisa mengakses source code
- Hanya dasar functionality yang ditest
- Scopenya terbatas
- Biasanya dilakukan sebelum build

API Test:
- Dilakukan oleh Software Tester 
- End to End
- Tidak bisa mengakses source code
- Hanya fungsi API saja
- Semua functional issue
- Scopenya lebih luas
- Dilakukan setelah build

## API Testing Process
- Specification Review
- Specification Development
- Framework Development
- Test Case Development
- Execution & Report

## Tipe Output API
- JSON and XML
- Response Code
- Memanggil fungsi API lain

## Bug ketika API Testing
- Gagal melakukan error handling
- Kesulitan tersambung dang mendapat respon API
- Isu keamanan
- Performance issues
- Warning atau error yang tidak tepat
- Struktur data respon yang tidak benar (JSON&XML)

## Manfaat API Testing
- Efisiensi waktu
- Bahasa yang independen
- Mengurangi biaya testing
- Mengurangi risiko

REFERENSI :
- PPT Alta.id
- Video penjelasan materi

