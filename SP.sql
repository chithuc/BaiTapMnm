create database SP
go
use SP
go

create table SanPham(
	MaSp nchar(20) not null primary key,
	TenSp nvarchar(50) not null,
	NhaSX nvarchar(50),
	MaLoaiSP nchar(20) not null,
	constraint fk1 foreign key(MaLoaiSP)
	references LoaiSanPham(MaLoaiSP)
	)

create table LoaiSanPham(
	MaLoaiSP nchar(20) not null primary key,
	TenLoaiSP nvarchar(50) not null,	
	)

insert into SanPham values ('sp1',N'Bút máy',N'Hàn Quốc','l1')
insert into SanPham values ('sp2',N'Bút bi',N'Việt Nam','l2')
insert into SanPham values ('sp3',N'Bút chì',N'Việt Nam','l3')

select * from SanPham

insert into LoaiSanPham values ('l1',N'Tốt')
insert into LoaiSanPham values ('l2',N'Trung bình')
insert into LoaiSanPham values ('l3',N'Cao cấp')

select * from LoaiSanPham
