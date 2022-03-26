// const mysql = require('mysql');
// const connection = mysql.createConnection({
//     host: 'localhost',
//     user: 'root',
//     password: '',
//     database: 'pemweb_uts'
// });

// connection.connect((err) => {
//     if (err) throw err;
//     console.log('Database connected');
// });

// module.exports = connection;

const knex = require('knex')({
    client: 'mysql',
    connection: {
        host: 'localhost',
        user: 'root',
        password: '',
        database: 'pemweb_uts'
    }
});

knex('petugas').insert({
    nama: 'Rizki',
    username: 'rizki',
    password: 'rizki'
})