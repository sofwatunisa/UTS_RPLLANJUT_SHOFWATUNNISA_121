# UTS Rekayasa Perangkat Lunak Lanjut (ADSE)
**Otomatisasi Alur Kerja Pemodelan BPMN Menggunakan Camunda BPM Engine dan Spring Boot Framework**

---

## 📌 Identitas Mahasiswa
* **Nama** : Shofwatunnisa
* **NIM** : 11210910000121
* **Program Studi** : Teknik Informatika
* **Mata Kuliah** : Rekayasa Perangkat Lunak Lanjut (ADSE)
* **Dosen Pengampu** : Rizal Broer Bahaweres, S.T., M.Kom.
* **Instansi** : UIN Syarif Hidayatullah Jakarta

---

## 🚀 Deskripsi Proyek
Proyek ini dikembangkan untuk memenuhi Ujian Tengah Semester (UTS) mata kuliah Rekayasa Perangkat Lunak Lanjut. Proyek mengintegrasikan **Camunda BPM Engine 7.20.0** ke dalam **Spring Boot Framework 3.3.4** untuk mengotomatisasi alur kerja (*workflow*) berbasis notasi standar BPMN 2.0.

### ⚙️ Spesifikasi Teknologi (*Tech Stack*)
* **Framework**: Spring Boot 3.3.4
* **BPM Engine**: Camunda BPM Platform 7.20.0 (Webapp Starter)
* **Java Version**: OpenJDK 21
* **Database**: H2 Database (*In-Memory*)
* **Build Tool**: Apache Maven

---

## 🛠️ Ringkasan Fitur & Pemodelan Proses

### 1. Pengujian Instalasi (`hello-process.bpmn`)
* Menguji eksekusi `JavaDelegate` (`HelloDelegate.java`) untuk memastikan konfigurasi Camunda Engine dan Spring Boot berjalan sempurna.
* Dijalankan otomatis melalui alur kerja sederhana: `Start` ➔ `Cetak Hello World` ➔ `End`.

### 2. Studi Kasus (`proposal-skripsi.bpmn`)
* **Kasus**: Otomatisasi Prosedur Pengajuan Proposal Skripsi Teknik Informatika UIN Syarif Hidayatullah Jakarta.
* **Alur Kerja**:
  1. **Mahasiswa Submit Proposal**: Permulaan alur pengajuan.
  2. **Verifikasi Kelayakan (Sekprodi)**: Evaluasi awal berkas proposal.
  3. **Keputusan Kelayakan (Exclusive Gateway)**:
    * **Tidak Layak**: Memicu Service Task `EmailRevisiService.java` untuk notifikasi penolakan.
    * **Layak**: Melanjutkan ke tahapan peninjauan dosen.
  4. **Pemeriksaan Dosen**: Konfirmasi kesediaan pembimbingan.
  5. **Persetujuan SK (Kaprodi)**: Penerbitan SK Pembimbing Skripsi.

---

## 💻 Cara Menjalankan Proyek

1. **Clone Repositori**
   ```bash
   git clone [https://github.com/Shofwatunnisa/UTS_RPLLANJUT_SHOFWATUNNISA_121.git](https://github.com/Shofwatunnisa/UTS_RPLLANJUT_SHOFWATUNNISA_121.git)
   cd UTS_RPLLANJUT_SHOFWATUNNISA_121