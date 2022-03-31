const config = require('../configs/database');
let mysql      = require('mysql');
let pool       = mysql.createPool(config);

pool.on('error',(err)=> {
    console.error(err);
});

module.exports = {
    index(req,res){
        res.render("peminjaman",{
            url : 'http://localhost:8000/',
        });
    },
    all(req,res){
        let sql = "SELECT * FROM peminjaman";
        let query = pool.query(sql, (err, results) => {
            if(err) throw err;
            return res.json(results);
        });
    },
    save(req,res){
        let data = {id: req.body.id_anggota,
                    tgl_pinjam: req.body.tgl_pinjam,
                    tgl_kembali: req.body.tgl_kembali,
                    id_buku: req.body.id_buku,
                    id_anggota: req.body.id_anggota,
                    id_petugas: req.body.id_petugas
                };
        let sql = "INSERT INTO peminjaman SET ?";
        let query = pool.query(sql, data,(err, results) => {
            if(err) throw err;
            res.redirect('/peminjaman');
        });
    },
    update(req,res){
        let data = {id: req.body.id_anggota,
                    tgl_pinjam: req.body.tanggal_pinjam,
                    tgl_kembali: req.body.tanggal_kembali,
                    id_buku: req.body.id_buku,
                    id_anggota: req.body.id_anggota,
                    id_petugas: req.body.id_petugas
                };
        let sql = "UPDATE peminjaman SET ? WHERE id="+req.body.id_anggota;
        let query = pool.query(sql, data,(err, results) => {
            if(err) throw err;
            res.redirect('/peminjaman');
        });
    },
    delete(req,res){
        let sql = "DELETE FROM peminjaman WHERE id="+req.body.id_anggota;
        let query = pool.query(sql, (err, results) => {
            if(err) throw err;
            res.redirect('/peminjaman');
        });
    }
}