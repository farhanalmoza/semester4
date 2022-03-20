const mysql = require('mysql');
const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '',
    database: 'pemweb_uts'
});

connection.connect((err) => {
    if (err) throw err;
    console.log('Database connected');
});