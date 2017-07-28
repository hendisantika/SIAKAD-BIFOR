/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready (function() {
    var table = $('#kelasTable').DataTable({
        dom: 'Blfrtip',
        buttons: [
            'excel', 'pdf'
        ],
        "sAjaxSource": "/api/kelas",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "columns": [
            { "data": "kodeKelas" },
            { "data": "namaKelas" },
            { "data": "keterangan" },
            { "data": "id",
              "render": function (data, type, full, meta) {
                  return '<a class="btn btn-warning btn-sm" href="/admin/kelas/edit/'+data+'"><i class="fa fa-pencil"></i></a> \n\
                         <a class="btn btn-danger btn-sm" onclick="javascript:return confirm(\'Anda yakin menghapus jurusan ini ?\');" href="/admin/kelas/delete/'+data+'"><i class="fa fa-trash-o"></i></a>';
              }
            }
        ]
    });
});

