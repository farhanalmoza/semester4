//use path module
const path = require('path');
//use express module
const express = require('express');
//use hbs view engine
const hbs = require('hbs');
//use bodyParser middleware
const bodyParser = require('body-parser');
//use mysql database
const mysql = require('mysql');
const app = express();

//konfigurasi koneksi
const conn = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: '',
  database: 'pemweb_sipinjam'
});

//connect ke database
conn.connect((err) =>{
  if(err) throw err;
  console.log('Mysql Connected...');
});

//set views file
app.set('views',path.join(__dirname,'views'));
//set view engine
app.set('view engine', 'hbs');
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));
//set folder public sebagai static folder untuk static file
app.use('/assets',express.static(__dirname + '/public'));

//route untuk homepage
app.get('/',(req, res) => {
  let sql = "SELECT * FROM anggota";
  let query = conn.query(sql, (err, results) => {
    if(err) throw err;
    res.render('product_view',{
      results: results
    });
  });
});

//route untuk insert data
app.post('/save',(req, res) => {
  let data = {id: req.body.id_anggota, nama: req.body.nama_anggota, telepon: req.body.telepon_anggota, alamat: req.body.alamat_anggota};
  let sql = "INSERT INTO anggota SET ?";
  let query = conn.query(sql, data,(err, results) => {
    if(err) throw err;
    res.redirect('/');
  });
});

//route untuk update data
app.post('/update',(req, res) => {
  let sql = "UPDATE anggota SET id='"+req.body.id_anggota+"', nama='"+req.body.nama_anggota+"', telepon='"+req.body.telepon_anggota+"', alamat='"+req.body.alamat_anggota+"' WHERE id="+req.body.id_anggota;
  let query = conn.query(sql, (err, results) => {
    if(err) throw err;
    res.redirect('/');
  });
});

//route untuk delete data
app.post('/delete',(req, res) => {
  let sql = "DELETE FROM anggota WHERE id="+req.body.id_anggota+"";
  let query = conn.query(sql, (err, results) => {
    if(err) throw err;
      res.redirect('/');
  });
});

//server listening
app.listen(8000, () => {
  console.log('Server is running at port 8000');
});