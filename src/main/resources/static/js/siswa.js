/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready (function() {
    var table = $('#siswaTable').DataTable({
        "scrollX": true,
        "sAjaxSource": "/api/siswa",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "columns": [
            { "data": "nisn" },
            { "data": "nis" },
            { "data": "namaSiswa" },
            { "data": "jenisKelamin" },
            { "data": "tempatLahir" },
            { "data": "tanggalLahir" },
            { "data": "jurusan.namaJurusan" },
            { "data": "kelas.kodeKelas" },
            { "data": "agama" },
            { "data": "namaOrangTua" },
            { "data": "anakKe" },
            { "data": "tahunDiterima" },
            { "data": "tahunLulus" },
            { "data": "status" },
            { "data": "id",
              "render": function (data, type, full, meta) {
                  return '<a class="btn btn-warning btn-sm" href="/siswa/edit/'+data+'"><i class="fa fa-pencil"></i></a> \n\
                         <a class="btn btn-danger btn-sm" onclick="javascript:return confirm(\'Anda yakin menghapus siswa ini ?\');" href="/siswa/delete/'+data+'"><i class="fa fa-trash-o"></i></a>';
              }
            }
        ]
    });
});

