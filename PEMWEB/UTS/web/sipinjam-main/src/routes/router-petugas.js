const router = require('express').Router();
const petugasController = require('../controllers').petugas;


router.get('/petugas', verifyUser.isLogin, petugasController.petugas);

module.exports = router;