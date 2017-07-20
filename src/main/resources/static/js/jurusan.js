/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready (function() {
    var table = $('#jurusanTable').DataTable({
        "sAjaxSource": "/api/jurusan",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "columns": [
            { "data": "kodeJurusan" },
            { "data": "namaJurusan" },
            { "data": "keterangan" },
            { "data": "id",
              "render": function (data, type, full, meta) {
                  return '<a class="btn btn-warning btn-sm" href="/jurusan/edit/'+data+'"><i class="fa fa-pencil"></i></a> \n\
                         <a class="btn btn-danger btn-sm" onclick="javascript:return confirm(\'Anda yakin menghapus jurusan ini ?\');" href="/jurusan/delete/'+data+'"><i class="fa fa-trash-o"></i></a>';
              }
            }
        ]
    });
});
