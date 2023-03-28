# Automation Testing

Testing sendiri dapat dilakukan dengan dua cara, yaitu manual testing dan automation testing.

## _ Manual Testing _

Manual testing adalah sebauah testing yang dilakukan secara manual dan bertujuan untuk mengeksplor semua fitur - fitur yang telah dikembangkan dalam sebuah aplikasi.

- Exploratory
- Velocity
- Usability

### Kelebihan dan kekurangan dari Manual Testing

Kelebihan :

- Mendapatkan feedback secara tepat dan akurat
- Lebih murah karena tidak perlu automation tools
- Sangat cocok untuk perubahan minor

Kekurangan :

- Sering terjadi error
- Tidak bisa direkam jadi harus dijalankan kembali secara manual

## _ Automation Testing _

Automation testing adalah sebuah pengujian yang dilakukan secara otomatis menggunakan automation tools seperti Selenium, Katalon, JMeter, dll. Automation sangat cocok untuk testing pada case yang banyak. Bisa digunakan juga untuk mengukur seberapa banyak fitur yang diuji.

- Flexibility
- Velocity
- Coverage
- Error-Avoidance

### Test case yang cocok dan tidak cocok untuk Automation Testing

Yang cocok untuk :

- Test case yang perlu dieksekusi secara berulang
- Test case yang dilakukan secara manual cukup rumit
- Test case yang memakan waktu cukup lama jika dilakukan secara manual

Tidak cocok untuk :

- Test case yang baru dirancang dan belum dieksekusi secara manual
- Test case yang memiliki kebutuhan yang sering berubah

## _ Proses Automation Testing _

1. Test Tool Selection
   Disesuaikan dengan kebutuhan

- Usability
- Simplicity
- Cost

2. Define Scope of Automation
   Kita mesti memastikan lingkup yang akan diotomasi dengan menentukan test case apa saja yang diperlukan pengujian otomatis.

3. Planning , design, and development
   Kita harus melakukan perencanaan, desain script, dan menulis atau pengembangan script untuk melakukan automation testing.

4. Test Execution
   Melakukan eksekusi test case yang sudah disusun

5. Maintenance
   Review dan melakukan perubahan jika diperlukan

# Behaviour Driven Development

BDD adalah proses software development yagn menerapkan penulisan test case sebelum developer menuliskan production codenya dengan fokus yang berbeda dengan TDD. Tim tester akan menuliskan scenario dari perspektif pengguna menggunakan bahasa yang mudah dipahami.

## BDD Format

Feature file ditulis menggunakan bahasa Gherkin dengan format Bahasa Inggris yang mudah dipahami.

Urutannya:

1. User Stroy

2. As a [X]
   I want [Y]
   So that [Z]

3. Scenario

4. Given
   When
   Then

## Cucumber

Cucumber adalah tools yang mendukung BDD dengan membaca ketentuan yang dapat dieksekusi menggunakan teks biasa.

## BDD dengan Cucumber

- Langkah - langkah
  1. Write Story : dengan bahasa Gherkin (Given, When, Then)
  2. Map Steps to Java : Konfigurasi langkah script dan validasi
  3. Configure Stories : Kombinasikan stories dan langkah - langkah
  4. Run Stories : Mengeksekusi stories di IDE menggunakan maven
  5. View Reports : Melihat hasil laporan testing yang dilakukan sesuai stories yang ditulis

## Yang perlu disiapkan

- Java
- Maven
- IDE

REFERNSI :

- Video materi Alta
- PPT Alta
