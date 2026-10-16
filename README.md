# UTS Rekayasa Perangkat Lunak Lanjut - Spring Boot & Camunda BPMN

## Di Susun Oleh
- **Nama**: Shofwatunnisa
- **NIM**: 12409011050121
- **Program Studi**: Teknik Informatika - UIN Syarif Hidayatullah Jakarta
- **Dosen Pengampu**: Rizal Broer (rizalbroer@uinjkt.ac.id)

---

## Deskripsi Proyek
Aplikasi ini merupakan implementasi Sistem Peminjaman Peralatan Ormawa berbasis **Spring Boot** dan **Camunda BPM Engine 7.20**. Sistem menangani alur pengajuan peminjaman alat secara terintegrasi antara antarmuka Web (Thymeleaf) dan proses bisnis BPMN.

## Fitur Utama
1. **Pengajuan Web Form**: Mahasiswa/Ormawa dapat mengajukan peminjaman alat melalui halaman web (`http://localhost:8080/`).
2. **Persetujuan Tasklist**: Ketua Ormawa memverifikasi pengajuan melalui dashboard Camunda Tasklist.
3. **Java Delegate Service**: Eksekusi otomatis notifikasi persetujuan/penolakan berbasis logika bisnis BPMN yang tercetak di konsol.

## Teknologi & Tools
- Java 21 / Spring Boot 3.1.5
- Camunda BPMN Engine 7.20.0
- H2 Database (In-Memory)
- Thymeleaf & HTML/CSS
- Maven & IntelliJ IDEA Ultimate
