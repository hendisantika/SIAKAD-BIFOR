/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready (function() {
    var table = $('#guruTable').DataTable({
        "scrollX": true,
        "sAjaxSource": "/api/guru",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "columns": [
            { "data": "kodeGuru" },
            { "data": "nuptk" },
            { "data": "namaGuru" },
            { "data": "jenisKelamin" },
            { "data": "tempatLahir" },
            { "data": "tanggalLahir" },
            { "data": "agama" },
            { "data": "pendidikan" },
            { "data": "keterangan" },
            { "data": "id",
              "render": function (data, type, full, meta) {
                  return '<a class="btn btn-warning btn-sm" href="/admin/guru/edit/'+data+'"><i class="fa fa-pencil"></i></a> \n\
                         <a class="btn btn-danger btn-sm" onclick="javascript:return confirm(\'Anda yakin menghapus guru ini ?\');" href="/admin/guru/delete/'+data+'"><i class="fa fa-trash-o"></i></a>';
              }
            }
        ]
    });
});
