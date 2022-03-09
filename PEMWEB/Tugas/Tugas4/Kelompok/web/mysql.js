const mysql = require('mysql');
const fs = require('fs');

const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '',
    database: 'pemweb_4'
});

connection.connect( (err) => {
    if (err) throw err;
    console.log('Connected!');
});

connection.query('SELECT * from mahasiswa', (err, rows) => {
    if(err) throw err
    const finished = (error) => {
        if(error) {
            console.error(error);
            return;
        }
    }

    const jsonData = JSON.stringify(rows, null, 2);
    fs.writeFile('mahasiswa.json', jsonData, finished);
})

connection.end();