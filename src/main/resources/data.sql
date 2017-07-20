/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


 * Author:  dekikurnia
 * Created: 15 Jul 17


INSERT INTO t_jurusan (kode_jurusan, nama_jurusan, keterangan) values ('MM','Multimedia','');
INSERT INTO t_jurusan (kode_jurusan, nama_jurusan, keterangan) values ('RPL','Rekayasa Perangkat Lunak','');
INSERT INTO t_jurusan (kode_jurusan, nama_jurusan, keterangan) values ('TKJ','Teknik Komputer Jaringan','');

INSERT INTO t_kelas (kode_kelas, nama_kelas, keterangan) values ('X-MM 1','Sepuluh multimedia satu','');
INSERT INTO t_kelas (kode_kelas, nama_kelas, keterangan) values ('X-MM 2','Sepuluh multimedia dua','');
INSERT INTO t_kelas (kode_kelas, nama_kelas, keterangan) values ('X-MM 3','Sepuluh multimedia tiga','');
INSERT INTO t_kelas (kode_kelas, nama_kelas, keterangan) values ('X-MM 4','Sepuluh multimedia empat','');
INSERT INTO t_kelas (kode_kelas, nama_kelas, keterangan) values ('X-MM 5','Sepuluh multimedia lima','');
INSERT INTO t_kelas (kode_kelas, nama_kelas, keterangan) values ('X-MM 6','Sepuluh multimedia enam','');
INSERT INTO t_kelas (kode_kelas, nama_kelas, keterangan) values ('X-MM 7','Sepuluh multimedia tujuh','');

INSERT INTO `t_role` VALUES (1, 'ADMIN');

INSERT INTO t_mapel (kode_mapel, nama_mapel, jumlah_jam, keterangan) values ('MTK','Matematika','4 jam', '');

INSERT INTO t_siswa  (nisn, nis, nama_siswa, jenis_kelamin, tempat_lahir, 
       tanggal_lahir, kode_jurusan, kode_kelas, agama, anak_ke, nama_orangtua, tahun_diterima, tahun_lulus, aktif) 
            values ('9936732451', '02041790365', 'Deki kurnia', 'Laki-laki', 'Bogor', '1992-06-27', '1', '1', 'Islam', '3 dari 3 bersaudara',
                    'Nurhadi', '2017', '', true);

INSERT INTO t_guru  (kode_guru, nuptk, nama_guru, jenis_kelamin, tempat_lahir, 
       tanggal_lahir, agama, pendidikan, keterangan) 
            values ('36', '001982138283', 'Slamet waluyo', 'Laki-laki', 'Banyuwangi', 
'1960-06-27', 'Islam', 'S1 pendidikan matematika', 'Mengajar matematika kelas 11 dan 12');
 
*/