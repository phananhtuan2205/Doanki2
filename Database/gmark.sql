-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 10, 2021 lúc 04:50 PM
-- Phiên bản máy phục vụ: 10.4.21-MariaDB
-- Phiên bản PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `gmark`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `diem`
--

CREATE TABLE `diem` (
  `maDiem` int(11) NOT NULL,
  `diem` float DEFAULT NULL,
  `maSV` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `maGV` int(11) DEFAULT NULL,
  `maMH` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `diem`
--

INSERT INTO `diem` (`maDiem`, `diem`, `maSV`, `maGV`, `maMH`, `created_at`, `updated_at`) VALUES
(1, 3, 'SV001', 2, 'C#', '2021-11-20 04:02:41', '2021-11-30 07:39:16'),
(3, 9, 'SV001', 2, 'PHP', '2021-11-20 04:02:41', '2021-11-26 01:05:31'),
(5, 9, 'SV001', 3, 'HTML', '2021-11-26 12:20:05', '2021-11-28 09:34:44'),
(7, 3, 'SV002', 2, 'EPC', '2021-11-26 12:43:52', '2021-11-30 07:11:41'),
(9, 5, 'SV003', 2, 'EPC', '2021-11-28 04:21:13', '2021-11-30 07:12:07'),
(11, 2.5, 'SV003', 2, 'C#', '2021-11-28 04:31:24', '2021-11-30 07:17:57'),
(12, 9.8, 'SV004', 2, 'EPC', '2021-11-28 04:33:49', '2021-12-02 04:34:23'),
(13, 2, 'SV009', 2, 'C#', '2021-11-28 04:44:23', '2021-11-30 07:17:52'),
(16, 7, 'c204r53453', 2, 'BBB', '2021-11-28 09:42:15', '2021-11-28 09:42:15'),
(19, 5.5, 'SV004', 2, 'C#', '2021-12-02 10:58:58', '2021-12-02 11:00:12'),
(20, 4, 'SV006', 2, 'EPC', '2021-12-03 09:08:52', '2021-12-03 09:08:52'),
(21, 9, 'c204r53453', 2, 'EPC', '2021-12-10 22:30:27', '2021-12-10 22:30:27'),
(22, 10, 'SV001', 2, 'EPC', '2021-12-10 22:30:34', '2021-12-10 22:30:34'),
(23, 9, 'SV003', 2, 'HTML', '2021-12-10 22:30:55', '2021-12-10 22:31:23'),
(24, 5, 'SV009', 2, 'HTML', '2021-12-10 22:31:01', '2021-12-10 22:31:01'),
(25, 3.5, 'SV004', 2, 'HTML', '2021-12-10 22:31:08', '2021-12-10 22:31:08'),
(26, 8, 'SV002', 2, 'HTML', '2021-12-10 22:31:14', '2021-12-10 22:31:14'),
(27, 10, 'c204r53453', 2, 'HTML', '2021-12-10 22:31:31', '2021-12-10 22:31:31'),
(28, 9.5, 'SV006', 2, 'HTML', '2021-12-10 22:31:51', '2021-12-10 22:31:51'),
(30, 6.8, 'SV009', 3, 'EPC', '2021-12-10 22:41:38', '2021-12-10 22:41:38');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `giangvien`
--

CREATE TABLE `giangvien` (
  `maGV` int(11) NOT NULL,
  `tenGV` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `diachi` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `sdt` varchar(15) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `ngaysinh` date DEFAULT NULL,
  `gioitinh` varchar(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `giangvien`
--

INSERT INTO `giangvien` (`maGV`, `tenGV`, `diachi`, `sdt`, `email`, `created_at`, `updated_at`, `ngaysinh`, `gioitinh`) VALUES
(1, 'Giao vien 1', 'Dia chi 1', '0975885356', 'mail1@gmail.com', '2021-11-18 13:48:30', '2021-12-02 11:59:32', '1990-11-08', 'Nữ'),
(2, 'Trần Văn Điệp', 'dc 2 ', '0952134123', 'mail2@gmail.com', '2021-11-18 13:48:30', '2021-12-02 11:59:37', '1987-11-03', 'Nam'),
(3, 'Giao vien 3', 'dc 3 ', '08623423265', 'mail3@gmail.com', '2021-11-18 13:50:17', '2021-12-02 11:59:43', '1980-11-29', 'Nữ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hocky`
--

CREATE TABLE `hocky` (
  `maHK` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tenHK` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `hocky`
--

INSERT INTO `hocky` (`maHK`, `tenHK`) VALUES
('HK1', 'Hoc ki 1'),
('HK2', 'Hoc ki 2'),
('HK3', 'Hoc ki 3'),
('HK4', 'Hoc ki 4');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khoa`
--

CREATE TABLE `khoa` (
  `maKH` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tenKH` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `lienheKH` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `khoa`
--

INSERT INTO `khoa` (`maKH`, `tenKH`, `lienheKH`, `created_at`, `updated_at`) VALUES
('KH1', 'Khoa 1', '66666666888', '2021-11-08 10:11:42', '2021-11-08 10:14:41'),
('KH2', 'Khoa 2', '33333333', '2021-11-16 21:19:19', '2021-11-17 10:01:19'),
('KH3', 'Khoa 3', '3333333333', '2021-11-09 01:01:23', '2021-11-09 01:01:23'),
('KH4', 'Khoa 4', '4444444444', '2021-11-09 01:01:23', '2021-11-09 01:01:36');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lop`
--

CREATE TABLE `lop` (
  `maLop` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tenLop` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `maKH` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `lop`
--

INSERT INTO `lop` (`maLop`, `tenLop`, `created_at`, `updated_at`, `maKH`) VALUES
('C2004G', 'Lớp c2004', '2021-12-10 22:26:10', '2021-12-10 22:26:10', 'KH1'),
('C2005L', 'Lớp 2005', '2021-11-20 04:00:36', '2021-12-10 10:26:19', 'KH2'),
('C2010G', 'Lớp 2010 ', '2021-11-20 04:00:36', '2021-11-22 12:48:40', 'KH3');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `monhoc`
--

CREATE TABLE `monhoc` (
  `maMH` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tenMH` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `maHK` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `monhoc`
--

INSERT INTO `monhoc` (`maMH`, `tenMH`, `maHK`, `created_at`, `updated_at`) VALUES
('AAA', 'Lập trình A', 'HK4', '2021-11-28 11:28:52', '2021-11-28 11:28:52'),
('BBB', 'Lập trình B', 'HK1', '2021-11-28 11:29:09', '2021-11-28 11:29:09'),
('C#', 'C sharp', 'HK2', '2021-11-18 13:54:57', '2021-11-18 13:54:57'),
('DDD', 'Lập trình D', 'HK4', '2021-12-02 09:25:00', '2021-12-02 09:25:00'),
('EPC', 'Lap trinh C', 'HK1', '2021-11-18 13:53:49', '2021-11-18 13:53:49'),
('HTML', 'Lap trinh HTML', 'HK1', '2021-11-18 13:53:50', '2021-11-18 13:53:50'),
('PHP', 'Lap trinh PHP', 'HK2', '2021-11-18 13:54:57', '2021-11-18 13:54:57');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `roles`
--

CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `role` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `roles`
--

INSERT INTO `roles` (`id`, `role`) VALUES
(1, 'Trưởng phòng ĐT'),
(2, 'Phó phòng ĐT'),
(3, 'Hiệu trưởng'),
(4, 'Phó hiệu trưởng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sinhvien`
--

CREATE TABLE `sinhvien` (
  `maSV` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tenSV` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `diachi` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `sdt` varchar(15) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `hedaotao` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ngaysinh` date DEFAULT NULL,
  `gioitinh` varchar(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `sinhvien`
--

INSERT INTO `sinhvien` (`maSV`, `tenSV`, `diachi`, `sdt`, `email`, `created_at`, `updated_at`, `hedaotao`, `ngaysinh`, `gioitinh`) VALUES
('c204r53453', 'Trần Hùng', 'Hải Phòng', '23423423', 'sfdasdfsdf@gmail.com', '2021-11-26 09:10:18', '2021-12-02 04:06:34', 'ADSE', '2021-11-02', 'Nam'),
('SV001', 'Tran VAn An', 'Ha Nam', '0111111111', 'dafsd@gmail.com', '2021-11-18 13:55:55', '2021-12-02 04:03:02', 'ADSE', '2000-11-16', 'Nam'),
('SV002', 'Nguyen thi Dung', 'Sai Gon', '22222222222', 'mail2@gmail.com', '2021-11-18 13:55:55', '2021-12-02 04:06:11', 'ADSE', '2001-11-15', 'Nữ'),
('SV003', 'Pham Van Dong', 'Dia Chi 4', '0982323423', 'mail3@gmail.com', '2021-11-18 13:59:27', '2021-12-10 19:56:55', 'ADSE', '1995-11-16', 'Nam'),
('SV004', 'Phan Dinh Giot', 'dia chi 4', '44444444444', 'mail4@gmail.com', '2021-11-18 13:59:27', '2021-12-02 04:06:47', 'ADSE', '2001-09-10', 'Nam'),
('SV006', 'Lam Hung', 'ha noi', '0972332312', 'gsdf@fadfgsdf.vn', '2021-11-28 10:16:03', '2021-12-02 04:05:58', 'ADSE', '1990-11-01', 'Nam'),
('SV007', 'Lâm Thanh', 'Hải Dương', '098364732', 'dfasdf@fasdfsadfsa', '2021-12-02 03:45:20', '2021-12-02 03:45:20', 'ADSE', '2001-12-08', 'Nam'),
('SV008', 'Lâm Văn Tuân', 'Ha noi', '098765467', 'sdfdf@mail.com', '2021-12-03 10:31:07', '2021-12-03 10:31:07', 'ADSE', '2000-12-07', 'Nam'),
('SV009', 'Doan Chi Binh', 'Trung Quoc', '0986495837', 'mailmail@gmail.com', '2021-11-23 02:12:35', '2021-11-23 02:17:53', 'ADSE', '2021-11-04', 'Nam'),
('SV010', 'Nguyễn Khắc Lê Anh', 'Sài Gòn', '09422453234', 'leanh@gmail.com', '2021-12-10 12:53:50', '2021-12-10 12:53:50', 'ADSE', '2001-12-01', 'Nam'),
('SV012', 'Lý Gia Bảo', 'Ba Đình', '0892423423', 'giabao@gmail.com', '2021-12-10 12:56:14', '2021-12-10 13:29:43', 'ADSE', '1999-12-15', 'Nữ'),
('SV013', 'Nguyễn Đình Đan', 'Phố Huễ', '096835215', 'dan@gmail.com', '2021-12-10 12:57:29', '2021-12-10 12:57:29', 'ADSE', '2000-12-14', 'Nam'),
('SV014', 'Phạm Nhật Hạ', 'Nam Định', '089242342', 'nhatha@gmail.com', '2021-12-10 01:01:28', '2021-12-10 01:01:28', 'ADSE', '1990-12-23', 'Nữ'),
('SV015', 'Tuấn Khang', 'Ba Đình', '0942341234', 'sv014@gmail.com', '2021-12-10 01:02:45', '2021-12-10 13:29:24', 'DISM', '2002-12-13', 'Nam'),
('SV016', 'Nguyễn Ngọc Linh', 'Lâm Đồng', '0921423234', 'linh@gmail.com', '2021-12-10 13:44:11', '2021-12-10 13:44:11', 'ADSE', '2001-12-08', 'Nam'),
('SV017', 'Trịnh Đình Dũng', 'Đồng Tháp', '084565334', 'dinhdung@gmail.com', '2021-12-10 13:46:02', '2021-12-10 13:46:02', 'ADSE', '2003-12-22', 'Nam'),
('SV018', 'Lâm Chí Khanh', 'Hải Dương', '08423534423', 'chikhanh@gmail.com', '2021-12-10 13:46:52', '2021-12-10 13:46:52', 'ADSE', '2001-12-22', 'Nữ'),
('SV019', 'Phạm Tùng Lâm', 'Hồ Chí Minh', '0976354726', 'lam@gmail.com', '2021-12-10 13:48:13', '2021-12-10 13:48:13', 'ADSE', '2000-12-15', 'Nam'),
('SV021', 'Trần Đình Khánh', 'Đồng Tháp', '094232434', 'dinhkhanh@gmail.com', '2021-12-10 14:37:56', '2021-12-10 14:37:56', 'ADSE', '1994-12-14', 'Nữ'),
('SV022', 'Cao Viet Anh', 'Hải Phòng', '09738473723', 'cva@gmail.com', '2021-12-10 14:38:39', '2021-12-10 14:38:39', 'ADSE', '2001-12-15', 'Nam'),
('SV023', 'Nguyễn Văn Khánh', 'Hải Dương', '0893423233', 'vkhanh@gmail.com', '2021-12-10 14:40:22', '2021-12-10 14:40:22', 'DISM', '1999-12-20', 'Nam'),
('SV024', 'Lam Dinh Thi', 'Hưng Yên', '0987342324', 'dinhti@gmail.com', '2021-12-10 14:41:14', '2021-12-10 14:41:14', 'ADSE', '1996-12-06', 'Nam'),
('SV025', 'Phạm Thanh Huyền', 'Hải Phòng', '09878342342', 'thuyen@gmail.com', '2021-12-10 14:42:07', '2021-12-10 14:42:07', 'ADSE', '1997-12-01', 'Nam'),
('SV026', 'Trinh Thi Thao', 'Hưng Yên', '079923423', 'thithao@gmail.com', '2021-12-10 14:42:55', '2021-12-10 14:42:55', 'ADSE', '1998-12-03', 'Nữ'),
('SV030', 'Trần Hùng', 'Hải Dương', '8978323423', 'mail@gmail.com', '2021-12-10 19:56:07', '2021-12-10 19:56:31', 'ADSE', '1999-12-06', 'Nam'),
('SV031', 'Hung Tran', 'Hải Phòng', '0934235343', 'hung@gmail.com', '2021-12-10 22:25:13', '2021-12-10 22:25:26', 'ADSE', '1989-12-01', 'Nam'),
('SV101', 'Pham Ngoc Van Anh', 'Đội Cấn', '09413423423', 'vananh@gmail.com', '2021-12-10 12:55:00', '2021-12-10 01:10:09', 'ADSE', '2002-12-07', 'Nữ'),
('SV120', 'Lâm Hùng', 'Lâm Đồng', '0987437436', 'hungf@gmail.com', '2021-12-10 14:36:49', '2021-12-10 14:36:49', 'ADSE', '1999-12-15', 'Nam');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sv_lop`
--

CREATE TABLE `sv_lop` (
  `id` int(11) NOT NULL,
  `maSV` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `maLop` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `sv_lop`
--

INSERT INTO `sv_lop` (`id`, `maSV`, `maLop`) VALUES
(6, 'SV002', 'C2005L'),
(19, 'SV003', 'C2005L'),
(23, 'SV003', 'C2010G'),
(24, 'SV004', 'C2010G'),
(25, 'SV001', 'C2010G'),
(28, 'SV001', 'C2005L'),
(29, 'SV006', 'C2010G'),
(30, 'SV002', 'C2010G'),
(31, 'c204r53453', 'C2010G'),
(34, 'SV009', 'C2010G');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `user_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `password` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phone` varchar(15) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `full_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `user_name`, `password`, `email`, `phone`, `created_at`, `updated_at`, `role_id`, `full_name`) VALUES
(1, 'gmark', '202cb962ac59075b964b07152d234b70', 'hungtran@gmail.com', '0933333333', '2021-11-09 18:22:11', '2021-11-09 18:22:11', 3, 'G Mark'),
(2, 'tuann', '202cb962ac59075b964b07152d234b70', 'tuan@gmail.com', '0966666666', '2021-11-09 18:22:11', '2021-12-10 14:28:53', 1, 'Tuan Tuan'),
(4, 'hung', '202cb962ac59075b964b07152d234b70', 'hung@gamil.com', '0999999999', '2021-11-09 18:27:17', '2021-11-10 04:42:06', 3, 'Trần Hùng'),
(18, 'alibaba', '03af277ad179d6d1cbad62d4a0e288c2', 'hung@gmail.com', '094234232', '2021-12-10 02:21:37', '2021-12-10 02:21:37', 4, 'Trần Hùng');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `diem`
--
ALTER TABLE `diem`
  ADD PRIMARY KEY (`maDiem`),
  ADD KEY `maSV` (`maSV`),
  ADD KEY `maGV` (`maGV`),
  ADD KEY `maMH` (`maMH`);

--
-- Chỉ mục cho bảng `giangvien`
--
ALTER TABLE `giangvien`
  ADD PRIMARY KEY (`maGV`);

--
-- Chỉ mục cho bảng `hocky`
--
ALTER TABLE `hocky`
  ADD PRIMARY KEY (`maHK`);

--
-- Chỉ mục cho bảng `khoa`
--
ALTER TABLE `khoa`
  ADD PRIMARY KEY (`maKH`);

--
-- Chỉ mục cho bảng `lop`
--
ALTER TABLE `lop`
  ADD PRIMARY KEY (`maLop`),
  ADD KEY `maKH` (`maKH`);

--
-- Chỉ mục cho bảng `monhoc`
--
ALTER TABLE `monhoc`
  ADD PRIMARY KEY (`maMH`),
  ADD KEY `maHK` (`maHK`);

--
-- Chỉ mục cho bảng `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`maSV`);

--
-- Chỉ mục cho bảng `sv_lop`
--
ALTER TABLE `sv_lop`
  ADD PRIMARY KEY (`id`),
  ADD KEY `maSV` (`maSV`),
  ADD KEY `maLop` (`maLop`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `user_name` (`user_name`),
  ADD KEY `role_id` (`role_id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `diem`
--
ALTER TABLE `diem`
  MODIFY `maDiem` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT cho bảng `giangvien`
--
ALTER TABLE `giangvien`
  MODIFY `maGV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT cho bảng `roles`
--
ALTER TABLE `roles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `sv_lop`
--
ALTER TABLE `sv_lop`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `diem`
--
ALTER TABLE `diem`
  ADD CONSTRAINT `diem_ibfk_1` FOREIGN KEY (`maSV`) REFERENCES `sinhvien` (`maSV`),
  ADD CONSTRAINT `diem_ibfk_3` FOREIGN KEY (`maMH`) REFERENCES `monhoc` (`maMH`),
  ADD CONSTRAINT `diem_ibfk_4` FOREIGN KEY (`maGV`) REFERENCES `giangvien` (`maGV`);

--
-- Các ràng buộc cho bảng `lop`
--
ALTER TABLE `lop`
  ADD CONSTRAINT `lop_ibfk_1` FOREIGN KEY (`maKH`) REFERENCES `khoa` (`maKH`),
  ADD CONSTRAINT `lop_ibfk_2` FOREIGN KEY (`maKH`) REFERENCES `khoa` (`maKH`);

--
-- Các ràng buộc cho bảng `monhoc`
--
ALTER TABLE `monhoc`
  ADD CONSTRAINT `monhoc_ibfk_1` FOREIGN KEY (`maHK`) REFERENCES `hocky` (`maHK`);

--
-- Các ràng buộc cho bảng `sv_lop`
--
ALTER TABLE `sv_lop`
  ADD CONSTRAINT `sv_lop_ibfk_1` FOREIGN KEY (`maSV`) REFERENCES `sinhvien` (`maSV`),
  ADD CONSTRAINT `sv_lop_ibfk_2` FOREIGN KEY (`maLop`) REFERENCES `lop` (`maLop`);

--
-- Các ràng buộc cho bảng `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
