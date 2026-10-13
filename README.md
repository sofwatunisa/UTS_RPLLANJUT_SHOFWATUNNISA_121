# UTS ADSE - Sistem Alur Kerja Dokumen Proposal Skripsi UIN Jakarta

**Nama:** Shofwatunnisa  
**NIM:** 11210910000121  
**Program Studi:** Teknik Informatika, UIN Syarif Hidayatullah Jakarta  
**Dosen Pengampu:** Rizal Broer Bahaweres

---

## 1. Landasan Konseptual (5W)

### A. Spring / Spring Boot Framework
* **What:** Framework berbasis Java untuk membangun aplikasi enterprise yang mandiri (*standalone*), modular, dan *production-ready*.
* **Why:** Meminimalkan konfigurasi rumit XML pada Java EE, menyediakan server internal (*embedded Tomcat*), serta mempercepat pengembangan backend.
* **Who:** Dikembangkan oleh Pivotal (VMware) dan digunakan oleh *Software Engineer* serta *Backend Developer*.
* **Where:** Diterapkan pada lapisan backend, RESTful API, dan arsitektur *microservices*.
* **When:** Digunakan saat aplikasi membutuhkan fondasi Java yang stabil, aman, dan manajemen dependensi yang efisien.

### B. BPM & BPMN
* **What:** **BPM** adalah metodologi manajerial untuk mengelola alur kerja operasional. **BPMN** adalah standar notasi grafis (ISO/IEC 19510) untuk memvisualisasikan alur kerja tersebut.
* **Why:** Memangkas hambatan komunikasi antara analis bisnis (*business analyst*) dan pengembang sistem (*developer*).
* **Who:** Dikelola oleh OMG (Object Management Group) dan digunakan oleh perancang alur kerja serta pengembang sistem.
* **Where:** Diterapkan pada *workflow engine*, sistem manajemen dokumen (ECM), dan otomatisasi prosedur bisnis.
* **When:** Digunakan ketika proses bisnis memiliki aturan persetujuan berlapis (*approval*) dan membutuhkan jejak audit (*audit trail*).

### C. Keterkaitan Spring Boot & BPMN (Manfaat dalam J2EE)
* **Keterkaitan:** Camunda BPMN Engine ditanamkan (*embedded*) sebagai dependensi di dalam Spring Boot sehingga diagram BPMN dapat dieksekusi langsung oleh kode Java.
* **Manfaat:**
    1. *Separation of Concerns:* Logika alur proses dipisahkan dari kode utama program.
    2. *Automated State Tracking:* Transisi status dikelola otomatis oleh *Engine*.
    3. *Visual Audit Trail:* Pemantauan posisi dokumen secara *real-time* via dashboard Camunda.

---

## 2. Struktur Proyek
Proyek ini dibangun menggunakan **Spring Boot 3.3.4** dan **Camunda BPM 7.20.0**.