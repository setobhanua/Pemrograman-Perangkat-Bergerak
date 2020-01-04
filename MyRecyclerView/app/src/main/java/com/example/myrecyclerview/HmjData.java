package com.example.myrecyclerview;

import java.util.ArrayList;

public class HmjData {

    public static String[][] data = new String[][]{
            {"0","Dr. Ir. H. Soekarno", " Dr.(H.C.) Ir. H. Soekarno (Sukarno, nama lahir: Koesno Sosrodihardjo) (lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970 pada umur 69 tahun) adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967. Ia memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda.[6]:26-32 Ia adalah Proklamator Kemerdekaan Indonesia (bersama dengan Mohammad Hatta) yang terjadi pada tanggal 17 Agustus 1945. Soekarno adalah yang pertama kali mencetuskan konsep mengenai Pancasila sebagai dasar negara Indonesia dan ia sendiri yang menamainya.", "https://i.postimg.cc/vHRfhDMG/skrno.jpg"},
            {"1","H. Soeharto"," Jenderal Besar TNI (Purn.) H. M. Soeharto, (Jawa Kuno: Suharta; Jawa Latin: Suhartå; ) (ER, EYD: Suharto) (lahir di Kemusuk, Yogyakarta, 8 Juni 1921 – meninggal di Jakarta, 27 Januari 2008 pada umur 86 tahun) adalah Presiden kedua Indonesia yang menjabat dari tahun 1967 sampai 1998, menggantikan Soekarno. Di dunia internasional, terutama di Dunia Barat, Soeharto sering dirujuk dengan sebutan populer The Smiling General (bahasa Indonesia: Sang Jenderal yang Tersenyum) karena raut mukanya yang senantiasa tersenyum dan menunjukkan keramahan. Meski begitu, dengan berbagai kontroversi yang terjadi ia sering juga disebut sebagai diktator bagi yang berseberangan dengannya.", "https://i.postimg.cc/GmXWz2hM/soeharto.jpg"},
            {"2","Prof. Dr. Ing. H. B.J. Habibie"," Prof. Dr. Ing. H. Bacharuddin Jusuf Habibie, FREng (lahir di Parepare, Sulawesi Selatan, 25 Juni 1936 – meninggal di Jakarta, 11 September 2019 pada umur 83 tahun) adalah Presiden Republik Indonesia yang ketiga. Sebelumnya, B.J. Habibie menjabat sebagai Wakil Presiden Republik Indonesia ke-7, menggantikan Try Sutrisno. B. J. Habibie menggantikan Soeharto yang mengundurkan diri dari jabatan presiden pada tanggal 21 Mei 1999.", "https://i.postimg.cc/Jhg9V2XZ/habibie.jpg"},
            {"3","Dr. K. H. Abdurahman Wahid"," Dr.(H.C.) K. H. Abdurrahman Wahid atau yang akrab disapa Gus Dur (lahir di Jombang, Jawa Timur, 7 September 1940 – meninggal di Jakarta, 30 Desember 2009 pada umur 69 tahun) adalah tokoh Muslim Indonesia dan pemimpin politik yang menjadi Presiden Indonesia yang keempat dari tahun 1999 hingga 2001. Ia menggantikan Presiden B.J. Habibie setelah dipilih oleh Majelis Permusyawaratan Rakyat hasil Pemilu 1999. Penyelenggaraan pemerintahannya dibantu oleh Kabinet Persatuan Nasional. Masa kepresidenan Abdurrahman Wahid dimulai pada 20 Oktober 1999 dan berakhir pada Sidang Istimewa MPR pada tahun 2001. Tepat 23 Juli 2001, kepemimpinannya digantikan oleh Megawati Soekarnoputri setelah mandatnya dicabut oleh MPR. Abdurrahman Wahid adalah mantan ketua Tanfidziyah (badan eksekutif) Nahdlatul Ulama dan pendiri Partai Kebangkitan Bangsa (PKB).", "https://i.postimg.cc/Pxw0tQbc/gus-dur.jpg"},
            {"4","Hj. Megawati Soekarno Putri"," Dr.(H.C.) Hj. Dyah Permata Megawati Setyawati Soekarnoputri atau umumnya lebih dikenal sebagai Megawati Soekarnoputri atau biasa disapa dengan panggilan Mbak Mega (lahir di Yogyakarta, 23 Januari 1947; umur 72 tahun) adalah Presiden Indonesia yang kelima yang menjabat sejak 23 Juli 2001 sampai 20 Oktober 2004. Ia merupakan presiden wanita Indonesia pertama dan putri dari presiden Indonesia pertama, Soekarno, yang kemudian mengikuti jejak ayahnya menjadi Presiden Indonesia. Pada 20 September 2004, ia kalah suara dari Susilo Bambang Yudhoyono dalam Pemilu Presiden 2004 putaran yang kedua.", "https://i.postimg.cc/50LkcNbW/megawati.jpg"},
            {"5","Prof. Dr. H. Susilo Bambang Yudhoyono"," Jenderal TNI (HOR.) (Purn.) Prof. Dr. H. Susilo Bambang Yudhoyono, M.A., GCB., AC.(lahir di Tremas, Arjosari, Pacitan, Jawa Timur, Indonesia, 9 September 1949; umur 70 tahun) adalah Presiden Indonesia ke-6 yang menjabat sejak 20 Oktober 2004 hingga 20 Oktober 2014.Ia adalah Presiden pertama di Indonesia yang dipilih melalui jalur pemilu. Ia, bersama Wakil Presiden Muhammad Jusuf Kalla, terpilih dalam Pemilu Presiden 2004. Ia berhasil melanjutkan pemerintahannya untuk periode kedua dengan kembali memenangkan Pemilu Presiden 2009, kali ini bersama Wakil Presiden Boediono. Sejak era reformasi dimulai, Susilo Bambang Yudhoyono merupakan Presiden Indonesia pertama yang menyelesaikan masa kepresidenan selama 5 tahun dan berhasil terpilih kembali untuk periode kedua.", "https://i.postimg.cc/9XPNJMLG/sby.png"},
            {"6","Ir. H. Joko Widodo"," Ir. H. Joko Widodo atau Jokowi (lahir di Surakarta, Jawa Tengah, 21 Juni 1961; umur 58 tahun) adalah Presiden ke-7 Indonesia yang mulai menjabat sejak 20 Oktober 2014. Ia terpilih bersama Wakil Presiden Muhammad Jusuf Kalla dalam Pemilu Presiden 2014 dan kembali terpilih bersama Wakil Presiden Ma'ruf Amin dalam Pemilu Serentak 2019. Jokowi pernah menjabat Gubernur DKI Jakarta sejak 15 Oktober 2012 hingga 16 Oktober 2014 didampingi Basuki Tjahaja Purnama sebagai wakil gubernur. Sebelumnya, ia adalah Wali Kota Surakarta (Solo), sejak 28 Juli 2005 hingga 1 Oktober 2012 didampingi F.X. Hadi Rudyatmo sebagai wakil wali kota. Dua tahun menjalani periode keduanya menjadi Wali Kota Solo, Jokowi ditunjuk oleh partainya, Partai Demokrasi Indonesia Perjuangan (PDI-P), untuk bertarung dalam pemilihan Gubernur DKI Jakarta berpasangan dengan Basuki Tjahaja Purnama (Ahok).", "https://i.postimg.cc/d3J6z25G/jkw.jpg"},

    };

public static ArrayList<Hmj>getListData(){
    ArrayList<Hmj> list = new ArrayList<>();
    for (String[] HmjData : data){
        Hmj hmj = new Hmj();
        hmj.setId(Integer.parseInt(HmjData[0]));
        hmj.setName(HmjData[1]);
        hmj.setDescription(HmjData[2]);
        hmj.setPhoto(HmjData[3]);

        list.add(hmj);
    }
    return list;
}
}
