/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     4/25/2022 9:07:33 AM                         */
/*==============================================================*/


/*==============================================================*/
/* Table: GURU_PENGAJAR                                         */
/*==============================================================*/
create table GURU_PENGAJAR 
(
   ID_GURU              varchar(12)                    not null,
   NAMA_GURU            varchar(25)                    not null,
   GELAR_DEPAN          varchar(10)                    null,
   GELAR_BELAKANG       varchar(10)                    null,
   JENIS_KELAMIN        varchar(9)                     null,
   AGAMA                varchar(10)                    null,
   ALAMAT_TINGGAL       varchar(100)                   null,
   NO_HP                varchar(15)                    null,
   NO_WA                varchar(15)                    null,
   ID_TELEGRAM          varchar(25)                    null,
   ID_LINE              varchar(25)                    null,
   ID_FACEBOOK          varchar(25)                    null,
   ID_INSTAGRAM         varchar(25)                    null,
   ID_TWITTER           varchar(25)                    null,
   ID_YOUTUBE           varchar(25)                    null,
   EMAIL                varchar(50)                    null,
   TEMPAT_LAHIR         varchar(30)                    null,
   TANGGAL_LAHIR        date                           null,
   constraint PK_GURU_PENGAJAR primary key (ID_GURU)
);

/*==============================================================*/
/* Index: GURU_PENGAJAR_PK                                      */
/*==============================================================*/
create unique index GURU_PENGAJAR_PK on GURU_PENGAJAR (
ID_GURU ASC
);

/*==============================================================*/
/* Table: JADWAL_PELAJARAN                                      */
/*==============================================================*/
create table JADWAL_PELAJARAN 
(
   IDJADWAL             varchar(15)                    not null,
   ID_GURU              varchar(12)                    null,
   KODE_MAPEL           varchar(10)                    null,
   IDRUANG              varchar(10)                    null,
   NO_INDUK             varchar(10)                    null,
   HARIJADWAL           varchar(6)                     null,
   SESIJADWAL           char(1)                        null,
   WAKTU_MULAI          time                           null,
   WAKTU_SELESAI        time                           null,
   constraint PK_JADWAL_PELAJARAN primary key (IDJADWAL)
);

/*==============================================================*/
/* Index: JADWAL_PELAJARAN_PK                                   */
/*==============================================================*/
create unique index JADWAL_PELAJARAN_PK on JADWAL_PELAJARAN (
IDJADWAL ASC
);

/*==============================================================*/
/* Index: MENGAJAR_FK                                           */
/*==============================================================*/
create index MENGAJAR_FK on JADWAL_PELAJARAN (
ID_GURU ASC
);

/*==============================================================*/
/* Index: MENERIMA_MATERI_FK                                    */
/*==============================================================*/
create index MENERIMA_MATERI_FK on JADWAL_PELAJARAN (
NO_INDUK ASC
);

/*==============================================================*/
/* Index: MATERI_DIAJARKAN_FK                                   */
/*==============================================================*/
create index MATERI_DIAJARKAN_FK on JADWAL_PELAJARAN (
KODE_MAPEL ASC
);

/*==============================================================*/
/* Index: TEMPATKBM_FK                                          */
/*==============================================================*/
create index TEMPATKBM_FK on JADWAL_PELAJARAN (
IDRUANG ASC
);

/*==============================================================*/
/* Table: MATA_PELAJARAN                                        */
/*==============================================================*/
create table MATA_PELAJARAN 
(
   KODE_MAPEL           varchar(10)                    not null,
   NAMA_MAPEL           varchar(30)                    null,
   BIDANG_MAPEL         varchar(10)                    null,
   JENIS_MAPEL          varchar(10)                    null,
   TIPE_MAPEL           varchar(10)                    null,
   JUMLAH_PERTEMUAN     numeric(2)                     null,
   DURASI_MAPEL         time                           null,
   constraint PK_MATA_PELAJARAN primary key (KODE_MAPEL)
);

/*==============================================================*/
/* Index: MATA_PELAJARAN_PK                                     */
/*==============================================================*/
create unique index MATA_PELAJARAN_PK on MATA_PELAJARAN (
KODE_MAPEL ASC
);

/*==============================================================*/
/* Table: MURID                                                 */
/*==============================================================*/
create table MURID 
(
   NO_INDUK             varchar(10)                    not null,
   NAMA_MURID           varchar(25)                    null,
   JEN_KEL              char(1)                        null,
   AGAMA_MURID          varchar(10)                    null,
   ALAMAT_RUMAH         varchar(50)                    null,
   TEMPATLAHIR          varchar(25)                    null,
   TGL_LAHIR            date                           null,
   EMAIL_MURID          varchar(50)                    null,
   NOHP                 varchar(14)                    null,
   NOWA                 varchar(14)                    null,
   IDTELEGRAM           varchar(20)                    null,
   IDLINE               varchar(20)                    null,
   IDFACEBOOK           varchar(20)                    null,
   IDINSTAGRAM          varchar(20)                    null,
   IDTWITTER            varchar(20)                    null,
   IDYOUTUBE            varchar(20)                    null,
   constraint PK_MURID primary key (NO_INDUK)
);

/*==============================================================*/
/* Index: MURID_PK                                              */
/*==============================================================*/
create unique index MURID_PK on MURID (
NO_INDUK ASC
);

/*==============================================================*/
/* Table: RUANG_KELAS                                           */
/*==============================================================*/
create table RUANG_KELAS 
(
   IDRUANG              varchar(10)                    not null,
   NAMA_RUANG           varchar(15)                    not null,
   TIPE_RUANG           varchar(10)                    null,
   UKURAN_RUANG         varchar(10)                    null,
   KAPASITAS_RUANG      numeric(3)                     null,
   JUMLAH_MEJA          numeric(3)                     null,
   JUMLAH_KURIS         numeric(3)                     null,
   KETERANGAN_RUANG     varchar(200)                   null,
   KELENGKAPAN_ALAT     varchar(200)                   null,
   RENOVASI_TERAKHIR    date                           null,
   constraint PK_RUANG_KELAS primary key (IDRUANG)
);

/*==============================================================*/
/* Index: RUANG_KELAS_PK                                        */
/*==============================================================*/
create unique index RUANG_KELAS_PK on RUANG_KELAS (
IDRUANG ASC
);

alter table JADWAL_PELAJARAN
   add constraint FK_JADWAL_P_MATERI_DI_MATA_PEL foreign key (KODE_MAPEL)
      references MATA_PELAJARAN (KODE_MAPEL)
      on update restrict
      on delete restrict;

alter table JADWAL_PELAJARAN
   add constraint FK_JADWAL_P_MENERIMA__MURID foreign key (NO_INDUK)
      references MURID (NO_INDUK)
      on update restrict
      on delete restrict;

alter table JADWAL_PELAJARAN
   add constraint FK_JADWAL_P_MENGAJAR_GURU_PEN foreign key (ID_GURU)
      references GURU_PENGAJAR (ID_GURU)
      on update restrict
      on delete restrict;

alter table JADWAL_PELAJARAN
   add constraint FK_JADWAL_P_TEMPATKBM_RUANG_KE foreign key (IDRUANG)
      references RUANG_KELAS (IDRUANG)
      on update restrict
      on delete restrict;

