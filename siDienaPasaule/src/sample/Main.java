package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.time.LocalDateTime;
import java.util.Random;


public class Main extends Application {
    Random ran = new Random();

    public void start(Stage stage) {
        Button jan = new Button("Janvāris");
        jan.setTranslateX(10);
        jan.setTranslateY(55);

        Button feb = new Button("Februāris");
        feb.setTranslateX(82);
        feb.setTranslateY(55);

        Button mar = new Button("Marts");
        mar.setTranslateX(160);
        mar.setTranslateY(55);

        Button apr = new Button("Aprilis");
        apr.setTranslateX(216);
        apr.setTranslateY(55);

        Button maj = new Button("Maijs");
        maj.setTranslateX(275);
        maj.setTranslateY(55);

        Button jun = new Button("Jūnijs");
        jun.setTranslateX(330);
        jun.setTranslateY(55);

        Button jul = new Button("Jūlijs");
        jul.setTranslateX(385);
        jul.setTranslateY(55);

        Button aug = new Button("Augusts");
        aug.setTranslateX(435);
        aug.setTranslateY(55);

        Button sep = new Button("Septembris");
        sep.setTranslateX(504);
        sep.setTranslateY(55);

        Button okt = new Button("Oktobris");
        okt.setTranslateX(590);
        okt.setTranslateY(55);

        Button nov = new Button("Novembris");
        nov.setTranslateX(662);
        nov.setTranslateY(55);

        Button dec = new Button("Decembris");
        dec.setTranslateX(744);
        dec.setTranslateY(55);

        Button n1 = new Button("1");
        n1.setTranslateX(20);
        n1.setTranslateY(90);

        Button n2 = new Button("2");
        n2.setTranslateX(50);
        n2.setTranslateY(90);

        Button n3 = new Button("3");
        n3.setTranslateX(80);
        n3.setTranslateY(90);

        Button n4 = new Button("4");
        n4.setTranslateX(110);
        n4.setTranslateY(90);

        Button n5 = new Button("5");
        n5.setTranslateX(140);
        n5.setTranslateY(90);

        Button n6 = new Button("6");
        n6.setTranslateX(170);
        n6.setTranslateY(90);

        Button n7 = new Button("7");
        n7.setTranslateX(200);
        n7.setTranslateY(90);

        Button n8 = new Button("8");
        n8.setTranslateX(230);
        n8.setTranslateY(90);

        Button n9 = new Button("9");
        n9.setTranslateX(260);
        n9.setTranslateY(90);

        Button n10 = new Button("10");
        n10.setTranslateX(290);
        n10.setTranslateY(90);

        Button n11 = new Button("11");
        n11.setTranslateX(90);
        n11.setTranslateY(125);

        Button n12 = new Button("12");
        n12.setTranslateX(125);
        n12.setTranslateY(125);

        Button n13 = new Button("13");
        n13.setTranslateX(160);
        n13.setTranslateY(125);

        Button n14 = new Button("14");
        n14.setTranslateX(195);
        n14.setTranslateY(125);

        Button n15 = new Button("15");
        n15.setTranslateX(230);
        n15.setTranslateY(125);

        Button n16 = new Button("16");
        n16.setTranslateX(265);
        n16.setTranslateY(125);

        Button n17 = new Button("17");
        n17.setTranslateX(300);
        n17.setTranslateY(125);

        Button n18 = new Button("18");
        n18.setTranslateX(335);
        n18.setTranslateY(125);

        Button n19 = new Button("19");
        n19.setTranslateX(370);
        n19.setTranslateY(125);

        Button n20 = new Button("20");
        n20.setTranslateX(405);
        n20.setTranslateY(125);

        Button n21 = new Button("21");
        n21.setTranslateX(170);
        n21.setTranslateY(160);

        Button n22 = new Button("22");
        n22.setTranslateX(208);
        n22.setTranslateY(160);

        Button n23 = new Button("23");
        n23.setTranslateX(246);
        n23.setTranslateY(160);

        Button n24 = new Button("24");
        n24.setTranslateX(285);
        n24.setTranslateY(160);

        Button n25 = new Button("25");
        n25.setTranslateX(322);
        n25.setTranslateY(160);

        Button n26 = new Button("26");
        n26.setTranslateX(360);
        n26.setTranslateY(160);

        Button n27 = new Button("27");
        n27.setTranslateX(400);
        n27.setTranslateY(160);

        Button n28 = new Button("28");
        n28.setTranslateX(440);
        n28.setTranslateY(160);

        Button n29 = new Button("29");
        n29.setTranslateX(480);
        n29.setTranslateY(160);

        Button n30 = new Button("30");
        n30.setTranslateX(520);
        n30.setTranslateY(160);

        Button n31 = new Button("31");
        n31.setTranslateX(560);
        n31.setTranslateY(160);

        //Izvades tekst
        Text text = new Text();
        text.setLayoutY(250);
        text.setLayoutX(10);
        text.setFont(Font.font(null, FontWeight.THIN, 16));


        //~virsraksta teksts
        Text topText = new Text("Izvēlieties mēnesi un datumu:");
        topText.setLayoutX(160);
        topText.setLayoutY(30);
        topText.setFont(Font.font("Verdana", FontPosture.ITALIC, 32));


        // Realais datums
        LocalDateTime now = LocalDateTime.now();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();

        Text dateText = new Text();
        dateText.setLayoutX(20);
        dateText.setLayoutY(220);
        dateText.setFont(Font.font("Verdana", FontPosture.ITALIC, 16));
        String[] men = {"Janvāris", "Februāris", "Marts", "Aprilis", "Maijs", "Jūnijs", "Jūlijs", "Augusts", "Septembris", "Oktobris", "Novembris", "Decembris"};
        dateText.setText("Šodien ir: " + men[month - 1] + " " + day);

// Janvāris
        jan.setOnAction(e -> {
            n30.setVisible(true);
            n31.setVisible(true);
            n1.setOnAction(event -> {
                String[] jan1 = {
                        "1801. — Īrijas karaliste apvienojās ar Lielbritānijas Karalisti, izveidojot Lielbritānijas \nimpēriju, pieņemts pašreizējais Apvienotās Karalistes karogs.",
                        "1959. — Fidela Kastro spēki gāza Kubas prezidenta Fulhensio Batistas režīmu.",
                        "1993. — Čehoslovākija sadalījās divās valstīs: Čehijā un Slovākijā."};
                int random1 = ran.nextInt(jan1.length);
                text.setText("1. Janvāra notikums:\n" + jan1[random1]);
            });
            n2.setOnAction(event -> {
                String[] jan2 = {
                        "1882. — ASV uzņēmējs Džons Rokfellers, apvienojot 40 dažādus naftas uzņēmumus, izveidoja Standard Oil.",
                        "2004. — NASA zonde Stardust pārlidoja Vilda 2 komētu, savācot vielas paraugus, kurus pēc diviem gadiem atgādāja uz Zemi.",
                        "1942. — Audriņu traģēdija: par no gūsta izbēgušu sarkanarmiešu karavīru slēpšanu nacistiskās \nVācijas soda ekspedīcija nodedzināja Audriņu ciemu un nogalināja aptuveni 200 iedzīvotāju."};
                int random2 = ran.nextInt(jan2.length);
                text.setText("2. Janvāra notikums:\n" + jan2[random2]);
            });
            n3.setOnAction(event -> {
                String[] jan3 = {
                        "1957. — ASV pulksteņu ražošanas uzņēmums Hamilton sāka ražot pasaulē pirmos elektroniskos pulksteņus.",
                        "1959. — Aļaska kļuva par ASV 49. štatu.",
                        "1987. — soulmūzikas dziedātāja Areta Franklina kļuva par pirmo sievieti, kas uzņemta \nRokenrola Slavas zālē."};
                int random3 = ran.nextInt(jan3.length);
                text.setText("3. Janvāra notikums:\n" + jan3[random3]);
            });
            n4.setOnAction(event -> {
                String[] jan4 = {"1762. — Lielbritānija pieteica karu Spānijai un Neapolei.",
                        "1948. — Birma atguva neatkarību no Apvienotās Karalistes.",
                        "1959. — Luna-1 kļuva par pirmo kosmisko aparātu, kas sasniedzis Mēness apkārtni."};
                int random4 = ran.nextInt(jan4.length);
                text.setText("4. Janvāra notikums:\n" + jan4[random4]);
            });
            n5.setOnAction(event -> {
                String[] jan5 = {"1769. — Džeimss Vats ieguva patentu savam tvaika dzinējam.",
                        "1895. — tika atklāti rentgenstari.",
                        "1997. — Krievija izveda savus bruņotos spēkus no Čečenijas."};
                int random5 = ran.nextInt(jan5.length);
                text.setText("5. Janvāra notikums:\n" + jan5[random5]);
            });
            n6.setOnAction(event -> {
                String[] jan6 = {
                        "1900. — Angļu—būru karš: būri uzbruka Leidismitai Dienvidāfrikā, tika nonāvēti vairāk \nnekā 1000 cilvēku.",
                        "1912. — Ņūmeksika kļuva par 47. ASV štatu.",
                        "1998. — palaista NASA Mēness zonde Lunar Prospector."};
                int random6 = ran.nextInt(jan6.length);
                text.setText("6. Janvāra notikums:\n" + jan6[random6]);
            });
            n7.setOnAction(event -> {
                String[] jan7 = {"1927. — tika veikts pirmais transatlantiskais telefona zvans no Ņujorkas uz Londonu.",
                        "1953. — ASV prezidents Harijs Trumens paziņoja, ka ASV izstrādāta ūdeņraža bumba.",
                        "1999. — tika sākta ASV prezidenta Billa Klintona impīčmenta procedūra."};
                int random7 = ran.nextInt(jan7.length);
                text.setText("7. Janvāra notikums:\n" + jan7[random7]);
            });
            n8.setOnAction(event -> {
                String[] jan8 = {"1297. — Monako ieguva neatkarību no Dženovas.",
                        "1900. — ASV prezidents Viljams Makinlijs Aļaskā ieviesa militāro pārvaldi.",
                        "1959. — Šarls de Golls kļuva par Francijas Republikas prezidentu."};
                int random8 = ran.nextInt(jan8.length);
                text.setText("8. Janvāra notikums:\n" + jan8[random8]);
            });
            n9.setOnAction(event -> {
                String[] jan9 = {"1788. — Konektikuta kļuva par piekto ASV štatu.",
                        "1878. — Umberto I kļuva par Itālijas karali.",
                        "1792. — noslēdzot Jasu miera līgumu, beidzās krievu—turku karš (1787—1792)."};
                int random9 = ran.nextInt(jan9.length);
                text.setText("9. Janvāra notikums:\n" + jan9[random9]);
            });
            n10.setOnAction(event -> {
                String[] jan10 = {
                        "1920. — Tautu Savienības pirmā sanāksmē ratificēts Versaļas līgums, izbeidzot Pirmo pasaules karu.",
                        "1923. — Klaipēdas apgabala vietējo lietuviešu izveidotā glābšanas komisija pasludināja pilsētu \npar pievienojušos Lietuvai.",
                        "1946. — Londonā atklāta ANO Ģenerālā asambleja."};
                int random10 = ran.nextInt(jan10.length);
                text.setText("10. Janvāra notikums:\n" + jan10[random10]);
            });
            n11.setOnAction(event -> {
                String[] jan11 = {"1693. — Etnas vulkāna izvirdums Sicīlijā.",
                        "1569. — Svētā Pāvila katedrālē notika pirmā vēsturē pieminētā loterija Anglijā.",
                        "1990. — Lietuvā notika 300 000 liela cilvēku demonstrācija par neatkarības atgūšanu."};
                int random11 = ran.nextInt(jan11.length);
                text.setText("11. Janvāra notikums:\n" + jan11[random11]);
            });
            n12.setOnAction(event -> {
                String[] jan12 = {"1816. — Francijas valdība izdeva pavēli uz mūžu no valsts padzīt Napoleona ģimeni.",
                        "1908. — pirmoreiz no Eifeļa torņa pārraidīts tālas distances radio signāls.",
                        "1964. — Zanzibārā notika sacelšanās pret arābu sultāna varu un proklamēta republika."};
                int random12 = ran.nextInt(jan12.length);
                text.setText("12. Janvāra notikums:\n" + jan12[random12]);
            });
            n13.setOnAction(event -> {
                String[] jan13 = {"1900. — Vācijas ķeizars deklarēja, ka vācu valoda ir Vācijas armijas komandu valoda.",
                        "1991. — PSRS bruņoto spēku vienības ieņēma Viļņas televīzijas torni Lietuvā, nogalinot 14 \nneapbruņotus civiliedzīvotājus un daudzus ievainojot.",
                        "2001. — Salvadorā plosījās viesuļvētra, nogalinot vairāk kā 800 cilvēkus."};
                int random13 = ran.nextInt(jan13.length);
                text.setText("13. Janvāra notikums:\n" + jan13[random13]);
            });
            n14.setOnAction(event -> {
                String[] jan14 = {"1539. — Spānija anektēja Kubu.",
                        "1953. — maršals Josips Brozs Tito kļuva par Dienvidslāvijas prezidentu.",
                        "1994. — ASV prezidents Bills Klintons Maskavā ar Krievijas prezidentu Borisu Jeļcinu parakstīja vienošanos,\n pēc kuras raķetes vairs netika notēmētas uz pretējo valstu mērķiem, kā arī nolēma likvidēt kodolarsenālu Ukrainā."};
                int random14 = ran.nextInt(jan14.length);
                text.setText("14. Janvāra notikums:\n" + jan14[random14]);
            });
            n15.setOnAction(event -> {
                String[] jan15 = {"1943. — pabeigta Pentagona celtniecība.",
                        "2001. — Vikipēdija, brīvā satura enciklopēdija, tika iedarbināta tiešsaistes režīmā.",
                        "2006. — NASA zondes Stardust nolaižamais aparāts pirmoreiz vēsturē nogādāja uz Zemi komētas \ndaļiņas."};
                int random15 = ran.nextInt(jan15.length);
                text.setText("15. Janvāra notikums:\n" + jan15[random15]);
            });
            n16.setOnAction(event -> {
                String[] jan16 = {"1891. — sākās Čīles Pilsoņu karš.",
                        "1920. — ASV spēkā stājās «sausais likums».",
                        "1969. — čehu students Jans Palahs pašaizdedzinājās Vāclava laukumā Prāgā, protestējot pret \npadomju iebrukumu 1968. gadā."};
                int random16 = ran.nextInt(jan16.length);
                text.setText("16. Janvāra notikums:\n" + jan16[random16]);
            });
            n17.setOnAction(event -> {
                String[] jan17 = {
                        "1773. — britu kuģis Resolution Džeimsa Kuka vadībā bija pirmais kuģis, kas šķērsoja \nDienvidu polāro loku.",
                        "1875. — atklāts Stambulas Tünel (pazemes dzelzceļš), kas bija otrais pasaulē un pirmais \nkontinentālajā Eiropā.",
                        "1995. — Japānā, Kobes tuvumā, notika 7,3 ballu stiprā Lielā Hanšinas zemestrīce, kas izraisīja \nplašus postījumus un 6434 cilvēku nāvi."};
                int random17 = ran.nextInt(jan17.length);
                text.setText("17. Janvāra notikums:\n" + jan17[random17]);
            });
            n18.setOnAction(event -> {
                String[] jan18 = {"1778. — angļu jūras braucējs Džeimss Kuks atklāja Havaju salas.",
                        "1886. — tika uzbūvēta pirmā automašīna.",
                        "2009. — Izraēla beidza karadarbību Gazas sektorā, kas sākās 2008. gada 27. decembrī."};
                int random18 = ran.nextInt(jan18.length);
                text.setText("18. Janvāra notikums:\n" + jan18[random18]);
            });
            n19.setOnAction(event -> {
                String[] jan19 = {"1806. — Apvienotā Karaliste okupēja Labās Cerības ragu.",
                        "2001. — Beļģijā tika atļauta marihuānas lietošana un glabāšana.",
                        "1649. — Kvebekā tika izpildīts pirmais nāves sods Kanādā (sodīta 16 gadu veca meitene par zagšanu)."};
                int random19 = ran.nextInt(jan19.length);
                text.setText("19. Janvāra notikums:\n" + jan19[random19]);
            });
            n20.setOnAction(event -> {
                String[] jan20 = {"1265. — grāfs Lankasters sasauca pirmo Anglijas parlamentu.",
                        "1892. — Springfīldā, Masačūsetsas štatā, ASV notika pirmais basketbola turnīrs.",
                        "1996. — Jāsirs Arafāts tika ievēlēts par Palestīnas autonomijas prezidentu."};
                int random20 = ran.nextInt(jan20.length);
                text.setText("20. Janvāra notikums:\n" + jan20[random20]);
            });
            n21.setOnAction(event -> {
                String[] jan21 = {"1774. — Osmaņu impērijā sāka valdīt Abdulhamids I.",
                        "1921. — Zviedrijas sievietēm tika piešķirtas balsstiesības.",
                        "1925. — Albānija tika pasludināta par republiku."};
                int random21 = ran.nextInt(jan21.length);
                text.setText("21. Janvāra notikums:\n" + jan21[random21]);
            });
            n22.setOnAction(event -> {
                String[] jan22 = {"1918. — Ukraina pasludināja neatkarību.",
                        "1955. — ASV paziņoja par plāniem attīstīt starpkontinentālās ballistiskās raķetes.",
                        "2008. — tika pieņemts pašreizējais Irākas karogs."};
                int random22 = ran.nextInt(jan22.length);
                text.setText("22. Janvāra notikums:\n" + jan22[random22]);
            });
            n23.setOnAction(event -> {
                String[] jan23 = {"1579. — tika parakstīta Utrehtas ūnija, izveidojot Nīderlandes valsti.",
                        "1950. — Jeruzaleme tika pasludināta par Izraēlas galvaspilsētu.",
                        "1996. — tika izlaista Java programmēšanas valodas pirmā versija."};
                int random23 = ran.nextInt(jan23.length);
                text.setText("23. Janvāra notikums:\n" + jan23[random23]);
            });
            n24.setOnAction(event -> {
                String[] jan24 = {
                        "1848. — Amerikas Savienotajās Valstīs tika atrasts zelts un sākās Kalifornijas zelta drudzis",
                        "1924. — Krievijas pilsēta Petrograda tika pārdēvēta par Ļeņingradu.",
                        "1986. — Voyager 2 81 500 km attālumā palidoja garām Urānam."};
                int random24 = ran.nextInt(jan24.length);
                text.setText("24. Janvāra notikums:\n" + jan24[random24]);
            });
            n25.setOnAction(event -> {
                String[] jan25 = {
                        "1533. — Anglijas karalis Henrijs VIII Tjudors slepus apprecēja Annu Boleinu, par ko tika \npadzīts no baznīcas.",
                        "1554. — Brazīlijā tika dibināta Sanpaulu pilsēta.",
                        "1858. — pirmo reizi tika atskaņots Mendelszona \"Kāzu maršs\"."};
                int random25 = ran.nextInt(jan25.length);
                text.setText("25. Janvāra notikums:\n" + jan25[random25]);
            });
            n26.setOnAction(event -> {
                String[] jan26 = {"1837. — Mičigana kļuva par 26. ASV štatu.",
                        "1921. — Francija, Apvienotā Karaliste, Itālija, Beļģija un Japāna atzina Latvijas un Igaunijas \nneatkarību de jure.",
                        "1934. — Vācija un Polija parakstīja 10 gadu neuzbrukšanas līgumu."};
                int random26 = ran.nextInt(jan26.length);
                text.setText("26. Janvāra notikums:\n" + jan26[random26]);
            });
            n27.setOnAction(event -> {
                String[] jan27 = {"1885. — tika izveidota Vācijas Austrumāfrika.",
                        "1944. — tika pārrauta Ļeņingradas blokāde.",
                        "1951. — Nevadas poligonā pirmoreiz izmēģināti atomieroči."};
                int random27 = ran.nextInt(jan27.length);
                text.setText("27. Janvāra notikums:\n" + jan27[random27]);
            });
            n28.setOnAction(event -> {
                String[] jan28 = {"1932. — Japāna okupēja Šanhaju.",
                        "1937. — Latvijas Republikā pieņemts Civillikums.",
                        "1724. — Sanktpēterburgā dibināja Krievijas Zinātņu akadēmiju."};
                int random28 = ran.nextInt(jan28.length);
                text.setText("28. Janvāra notikums:\n" + jan28[random28]);
            });
            n29.setOnAction(event -> {
                String[] jan29 = {"1676. — Fjodors III Romanovs kļuva par Krievijas caru.",
                        "1960. — radīta pirmā mākslīgā niere.",
                        "1916. — Pirmais pasaules karš: pirmoreiz Parīzi bombardēja vācu dirižabļi."};
                int random29 = ran.nextInt(jan29.length);
                text.setText("29. Janvāra notikums:\n" + jan29[random29]);
            });
            n30.setOnAction(event -> {
                String[] jan30 = {"1920. — starp Latviju un Padomju Krieviju tika parakstīts līgums par slepenu pamieru.",
                        "1933. — Ādolfs Hitlers ievēlēts par Vācijas kancleru.",
                        "1943. — Otrais pasaules karš: pie Staļingradas kapitulēja vācu 6. armija."};
                int random30 = ran.nextInt(jan30.length);
                text.setText("30. Janvāra notikums:\n" + jan30[random30]);
            });
            n31.setOnAction(event -> {
                String[] jan31 = {"1946. — pieņemta jauna Dienvidslāvijas konstitūcija pēc PSRS parauga.",
                        "1968. — Nauru deklarēja neatkarību no Austrālijas.",
                        "1983. — Apvienotajā Karalistē obligāta kļuva drošības josta automašīnu vadītājiem un \npriekšējiem pasažieriem."};
                int random31 = ran.nextInt(jan31.length);
                text.setText("31. Janvāra notikums:\n" + jan31[random31]);
            });
        });

//Februaris
        feb.setOnAction(e -> {
            n30.setVisible(false);
            n31.setVisible(false);
            n1.setOnAction(event -> {
                String[] feb1 = {"1861. — Amerikas pilsoņu karš: Teksasa atdalījās no ASV.",
                        "1959. — pēc referenduma Šveicē tika pieņemts lēmums atļaut sievietēm balsot.",
                        "1958. (pēc vietējā laika 31. janvārī) — palaists pirmais ASV Zemes mākslīgais pavadonis Explorer 1."};
                int random1 = ran.nextInt(feb1.length);
                text.setText("1. Februāra notikums:\n" + feb1[random1]);
            });
            n2.setOnAction(event -> {
                String[] feb2 = {"1933. — Ādolfs Hitlers atlaida Vācijas parlamentu.",
                        "1946. — proklamēta Ungārijas republika.",
                        "2008. — nemiernieki uzbruka Čadas galvaspilsētai Ndžamenai, bet tika padzīti no tās."};
                int random2 = ran.nextInt(feb2.length);
                text.setText("2. Februāra notikums:\n" + feb2[random2]);
            });
            n3.setOnAction(event -> {
                String[] feb3 = {"1919. — Padomju Krievija okupēja Ukrainu.",
                        "1943. — Otrais pasaules karš: PSRS piekrita pievienoties karadarbībai Klusajā okeānā pret Japānu.",
                        "1966. — PSRS zonde Luna-9 pirmoreiz vēsturē veica nosēšanos uz Mēness virsmas, kā arī pārraidīja \npirmos fotoattēlus."};
                int random3 = ran.nextInt(feb3.length);
                text.setText("3. Februāra notikums:\n" + feb3[random3]);
            });
            n4.setOnAction(event -> {
                String[] feb4 = {"1789. — Džordžs Vašingtons tika ievēlēts par pirmo ASV prezidentu.",
                        "1794. — Francijā tika atcelta verdzība.",
                        "2003. — Dienvidslāvijas parlaments pieņēma jaunu konstitūciju par jaunas valsts Serbijas un \nMelnkalnes dibināšanu Dienvidslāvijas atlikušo republiku vietā."};
                int random4 = ran.nextInt(feb4.length);
                text.setText("4. Februāra notikums:\n" + feb4[random4]);
            });
            n5.setOnAction(event -> {
                String[] feb5 = {"881. — Fīniksai, ASV piešķirtas pilsētas tiesības.",
                        "1900. — ASV un Apvienotā Karaliste noslēdza līgumu par Panamas kanālu.",
                        "1917. — Meksikā pieņemta jauna konstitūcija, izveidojot federatīvo republiku."};
                int random5 = ran.nextInt(feb5.length);
                text.setText("5. Februāra notikums:\n" + feb5[random5]);
            });
            n6.setOnAction(event -> {
                String[] feb6 = {
                        "1457. — Rīgas arhibīskaps Silvestrs Stodevešers piešķīra Silvestra žēlastību vasaļiem Livonijā.",
                        "1922. — par Romas pāvestu kļuva Pijs XI.",
                        "2000. — Tarja Halonena tika ievēlēta par pirmo Somijas prezidenti sievieti."};
                int random6 = ran.nextInt(feb6.length);
                text.setText("6. Februāra notikums:\n" + feb6[random6]);
            });
            n7.setOnAction(event -> {
                String[] feb7 = {"1962. — ASV aizliedza importu un eksportu uz Kubu.",
                        "1974. — Grenāda ieguva neatkarību no Apvienotās Karalistes.",
                        "1983. — Irāna veica iebrukumu Irākas dienvidaustrumos."};
                int random7 = ran.nextInt(feb7.length);
                text.setText("7. Februāra notikums:\n" + feb7[random7]);
            });
            n8.setOnAction(event -> {
                String[] feb8 = {
                        "1904. — negaidīts japāņu torpēdu uzbrukums Portartūrai Ķīnā izprovocēja krievu—japāņu karu.",
                        "1924. — ASV Nevadas štatā pirmoreiz valsts vēsturē tika izpildīts nāvessods, izmantojot indīgu gāzi.",
                        "2006. — sākās krīze Austrumtimorā — 404 kareivji atstāja kazarmas."};
                int random8 = ran.nextInt(feb8.length);
                text.setText("8. Februāra notikums:\n" + feb8[random8]);
            });
            n9.setOnAction(event -> {
                String[] feb9 = {"1900. — Dvaits Deiviss nodibināja Deivisa kausu tenisā.",
                        "1918. — Ukrainas Tautas Republika Brestā parakstīja miera līgumu ar Vācijas impēriju.",
                        "2008. — Rīgā ielikts Z-Towers pamatakmens."};
                int random9 = ran.nextInt(feb9.length);
                text.setText("9. Februāra notikums:\n" + feb9[random9]);
            });
            n10.setOnAction(event -> {
                String[] feb10 = {"1861. — Florida pievienojās Amerikas Valstu Konfederācijai.",
                        "1931. — Ņūdeli kļuva par Indijas galvaspilsētu.",
                        "1996. — superdators Deep Blue pirmoreiz uzvarēja pasaules šaha čempionu Gariju Kasparovu."};
                int random10 = ran.nextInt(feb10.length);
                text.setText("10. Februāra notikums:\n" + feb10[random10]);
            });
            n11.setOnAction(event -> {
                String[] feb11 = {
                        "1700. — sākās Lielais Ziemeļu karš, Saksijas karaspēkam iebrūkot zviedru pārvaldītajā Vidzemē.",
                        "1873. — Spānijas karalis Amadeo I atteicās no troņa, un Spāniju pasludināja par republiku.",
                        "1943. — ģenerālis Dvaits Eizenhauers tika tika izvēlēts par Sabiedroto armiju komandieri Eiropā."};
                int random11 = ran.nextInt(feb11.length);
                text.setText("11. Februāra notikums:\n" + feb11[random11]);
            });
            n12.setOnAction(event -> {
                String[] feb12 = {"1818. — Čīle ieguva neatkarību no Spānijas.",
                        "1908. — sākās pirmās autosacīkstes apkārt zemeslodei no Ņujorkas uz Parīzi.",
                        "1950. — dibināta Eiropas Raidorganizāciju apvienība."};
                int random12 = ran.nextInt(feb12.length);
                text.setText("12. Februāra notikums:\n" + feb12[random12]);
            });
            n13.setOnAction(event -> {
                String[] feb13 = {"1668. — Spānija atzina Portugāli kā neatkarīgu valsti.",
                        "1880. — Tomass Edisons atklāja termoelektronu emisijas efektu.",
                        "1960. — Francija pirmo reizi izmēģināja atombumbu Sahāras tuksnesī."};
                int random13 = ran.nextInt(feb13.length);
                text.setText("13. Februāra notikums:\n" + feb13[random13]);
            });
            n14.setOnAction(event -> {
                String[] feb14 = {
                        "1009. — Lietuvas nosaukums pirmoreiz minēts vēstures avotos (Kvedlinburgas klostera annālēs).",
                        "1949. — pirmoreiz tika sasaukts Knesets (Izraēlas parlaments).",
                        "1998. — palaisti pirmie 4 globālās mobilo sakaru pavadoņu sistēmas Globalstar pavadoņi."};
                int random14 = ran.nextInt(feb14.length);
                text.setText("14. Februāra notikums:\n" + feb14[random14]);
            });
            n15.setOnAction(event -> {
                String[] feb15 = {"1794. — pieņemts pašreizējais Francijas karogs.",
                        "1903. — ASV tirgū parādījās rotaļlieta plīša lācis (teddy bear).",
                        "1989. — Afganistānu atstāja PSRS karaspēks."};
                int random15 = ran.nextInt(feb15.length);
                text.setText("15. Februāra notikums:\n" + feb15[random15]);
            });
            n16.setOnAction(event -> {
                String[] feb16 = {"1918. — Lietuva pasludināja neatkarību no Krievijas.",
                        "1985. — dibināta Hezbollah organizācija.",
                        "2005. — stājās spēkā Kioto protokols, bet bez ASV un Austrālijas piedalīšanās."};
                int random16 = ran.nextInt(feb16.length);
                text.setText("16. Februāra notikums:\n" + feb16[random16]);
            });
            n17.setOnAction(event -> {
                String[] feb17 = {"1867. — pirmais kuģis izbrauca Suecas kanālu.",
                        "2000. — Microsoft izlaida operētājsistēmu Windows 2000.",
                        "2003. — daļā Londonas tika ieviesta satiksmes nodeva."};
                int random17 = ran.nextInt(feb17.length);
                text.setText("17. Februāra notikums:\n" + feb17[random17]);
            });
            n18.setOnAction(event -> {
                String[] feb18 = {"1954. — Losandželosā, ASV tika atvērta pirmā scientoloģijas baznīca.",
                        "1977. — Space Shuttle Enterprise veica pirmo izmēģinājuma lidojumu uz Boeing 747 muguras.",
                        "2012. — Latvijā notika tautas nobalsošana par Satversmes grozījumiem, kas paredzētu valsts \nvalodas statusa piešķiršanu krievu valodai."};
                int random18 = ran.nextInt(feb18.length);
                text.setText("18. Februāra notikums:\n" + feb18[random18]);
            });
            n19.setOnAction(event -> {
                String[] feb19 = {"1881. — Kanzasā kā pirmajā ASV štatā tika aizliegti alkoholiskie dzērieni.",
                        "1915. — Pirmais pasaules karš: sākās Galipoli operācija.",
                        "2008. — Kubas prezidents Fidels Kastro paziņoja par aiziešanu no amata."};
                int random19 = ran.nextInt(feb19.length);
                text.setText("19. Februāra notikums:\n" + feb19[random19]);
            });
            n20.setOnAction(event -> {
                String[] feb20 = {"1878. — par pāvestu kļuva Leons XIII.",
                        "1907. — Sanktpēterburgā uz pirmo sēdi sanāca Krievijas Valsts Domes otrais sasaukums.",
                        "1965. — Ranger 8 ietriecās Mēness virsmā pēc veiksmīgi nofotografētām iespējamām Apollo \nnolaišanās vietām."};
                int random20 = ran.nextInt(feb20.length);
                text.setText("20. Februāra notikums:\n" + feb20[random20]);
            });
            n21.setOnAction(event -> {
                String[] feb21 = {
                        "1613. — Mihails Romanovs tika izvēlēts par caru, sākot Romanovu dinastijas valdīšanu Krievijas \nImpērijā.",
                        "1960. — Kubā tika nacionalizēti visi uzņēmumi.",
                        "1992. — ANO Drošības padome apstiprināja rezolūciju 743, lai sūtītu miera uzturēšanas spēkus uz \nDienvidslāviju."};
                int random21 = ran.nextInt(feb21.length);
                text.setText("21. Februāra notikums:\n" + feb21[random21]);
            });
            n22.setOnAction(event -> {
                String[] feb22 = {
                        "1958. — Ēģiptes un Sīrijas prezidenti parakstīja abu valstu apvienošanas paktu, dibinot Apvienoto \nArābu Republiku.",
                        "1978. — ASV palaists pirmais eksperimentālais GPS pavadonis Navstar 1.",
                        "1978. — Sentlūsija ieguva neatkarību no Apvienotās Karalistes."};
                int random22 = ran.nextInt(feb22.length);
                text.setText("22. Februāra notikums:\n" + feb22[random22]);
            });
            n23.setOnAction(event -> {
                String[] feb23 = {"1947. — dibināta Starptautiskā standartizācijas organizācija (ISO).",
                        "1966. — Sīrijā armijas virsnieki īstenoja valsts apvērsumu.",
                        "1999. — orbitālajā stacijā Mir notika liels ugunsgrēks."};
                int random23 = ran.nextInt(feb23.length);
                text.setText("23. Februāra notikums:\n" + feb23[random23]);
            });
            n24.setOnAction(event -> {
                String[] feb24 = {"1918. — Igaunija pasludināja neatkarību no Krievijas.",
                        "1920. — Ādolfs Hitlers Minhenē prezentēja nacionālsociālistu jauno programmu.",
                        "1965. — Montevideo Mossad aģenti nogalināja Herbertu Cukuru."};
                int random24 = ran.nextInt(feb24.length);
                text.setText("24. Februāra notikums:\n" + feb24[random24]);
            });
            n25.setOnAction(event -> {
                String[] feb25 = {"1590. — Narvas tuvumā krievi un zviedri noslēdza pamieru uz vienu gadu.",
                        "1921. — Padomju Krievija okupēja Gruziju.",
                        "1992. — dibināta Krievijas kosmiskā aģentūra Roskosmos."};
                int random25 = ran.nextInt(feb25.length);
                text.setText("25. Februāra notikums:\n" + feb25[random25]);
            });
            n26.setOnAction(event -> {
                String[] feb26 = {"1848. — proklamēta otrā Francijas Republika.",
                        "1952. — Apvienotās Karalistes premjerministrs Vinstons Čērčils paziņoja, ka valstī izgatavota atombumba.",
                        "2004. — Maķedonijas Republikas prezidents Boriss Trajkovskis gāja bojā lidmašīnas katastrofā pie \nMostaras, Bosnijā un Hercegovinā."};
                int random26 = ran.nextInt(feb26.length);
                text.setText("26. Februāra notikums:\n" + feb26[random26]);
            });
            n27.setOnAction(event -> {
                String[] feb27 = {
                        "1900. — Lielbritānijā nodibināta Leiboristu partija, par tās sekretāru ievēlēja Ramzeju Makdonaldu.",
                        "1942. — Andrejs Vlasovs publicēja Smoļenskas deklarāciju.",
                        "1991. — ASV prezidents Džordžs H. V. Bušs paziņoja, ka Kuveita ir atbrīvota no Irākas karaspēka."};
                int random27 = ran.nextInt(feb27.length);
                text.setText("27. Februāra notikums:\n" + feb27[random27]);
            });
            n28.setOnAction(event -> {
                String[] feb28 = {"1922. — Apvienotā Karaliste atzina Ēģiptes neatkarību.",
                        "1991. — beidzās Līča karš.",
                        "1998. — Serbijas policija sāka operāciju, lai iztīrītu Kosovu no \"teroristu bandām\"."};
                int random28 = ran.nextInt(feb28.length);
                text.setText("28. Februāra notikums:\n" + feb28[random28]);
            });
            n29.setOnAction(event -> {
                String[] feb29 = {"1952. — Vācija atguva tiesības pār Helgolandes salu.",
                        "1960. — zemestrīce gandrīz pilnībā iznīcināja Marokas pilsētu Agadiru, bojā gāja vairāk nekā 3000 cilvēku.",
                        "2004. — Haiti prezidents Žans Bertrāns Aristīds atkāpās no amata un pameta valsti pēc plašajām \ndemonstrācijām un nemieriem."};
                int random29 = ran.nextInt(feb29.length);
                text.setText("29. Februāra notikums:\n" + feb29[random29]);
            });
        });

//Marts
        mar.setOnAction(e -> {
            n30.setVisible(true);
            n31.setVisible(true);
            n1.setOnAction(event -> {
                String[] mar1 = {"1815. — Napoleons Bonaparts atgriezās Francijā no izsūtījuma trimdā uz Elbas salu.",
                        "1847. — ASV štatā Mičiganā oficiāli atcēla nāvessodu.",
                        "1992. — Bosnija un Hercegovina pasludināja neatkarību no Dienvidslāvijas."};
                int random1 = ran.nextInt(mar1.length);
                text.setText("1. Marta notikums:\n" + mar1[random1]);
            });
            n2.setOnAction(event -> {
                String[] mar2 = {"1855. — Aleksandrs II kļuva par Krievijas caru.",
                        "1956. — Maroka pasludināja neatkarību no Francijas.",
                        "1970. — Rodēzija tika pasludināta par republiku, saraujot pēdējās saites ar Apvienoto Karalisti."};
                int random2 = ran.nextInt(mar2.length);
                text.setText("2. Marta notikums:\n" + mar2[random2]);
            });
            n3.setOnAction(event -> {
                String[] mar3 = {"1795. — Kurzemes hercogiste tika iekļauta Krievijas Impērijā.",
                        "1924. — Turcijā tika atcelts 1400 gadu senais kalifāts, atceļot kalifa titulu.",
                        "1991. — Latvijā notika aptauja, kurā vairākums balsotāju atbalstīja \"demokrātisku un neatkarīgu Latviju\"; \ntajā pašā dienā Igaunijā arī notika analoģisks referendums."};
                int random3 = ran.nextInt(mar3.length);
                text.setText("3. Marta notikums:\n" + mar3[random3]);
            });
            n4.setOnAction(event -> {
                String[] mar4 = {"1822. — Bostona ieguva pilsētas tiesības.",
                        "1861. — par ASV prezidentu kļuva Abrahams Linkolns.",
                        "2007. — Igaunijā notika parlamenta vēlēšanas, kurās pirmo reizi pasaulē iedzīvotājiem bija \niespēja balsot arī elektroniskā veidā."};
                int random4 = ran.nextInt(mar4.length);
                text.setText("4. Marta notikums:\n" + mar4[random4]);
            });
            n5.setOnAction(event -> {
                String[] mar5 = {"1918. — Padomju Krievija pārvietoja galvaspilsētu no Petrogradas uz Maskavu",
                        "1940. — Katiņas slaktiņš: PSKP CK Politbiroja locekļi parakstīja pavēli par vairāk nekā 20 000 \npoļu karavīru un inteliģences nošaušanu.",
                        "1991. — Irāka atbrīvoja visus Līča kara gūstekņus."};
                int random5 = ran.nextInt(mar5.length);
                text.setText("5. Marta notikums:\n" + mar5[random5]);
            });
            n6.setOnAction(event -> {
                String[] mar6 = {"1940. — Ziemas karš: starp Somiju un Padomju Savienību tika noslēgts pamiers.",
                        "1945. — Rumānijā izveidota komunistiski noskaņota valdība.",
                        "1997. — Šrilankā Tamilu Tīģeri uzbruka militārajai bāzei, nogalinot vairāk nekā 200 cilvēku."};
                int random6 = ran.nextInt(mar6.length);
                text.setText("6. Marta notikums:\n" + mar6[random6]);
            });
            n7.setOnAction(event -> {
                String[] mar7 = {"1918. — Pirmais pasaules karš: Somija noslēdza aliansi ar Vāciju.",
                        "1969. — Golda Meira kļuva par pirmo sievieti Izraēlas premjerministra amatā.",
                        "1996. — darbu uzsāka pirmais demokrātiski ievēlētais Palestīnas parlaments."};
                int random7 = ran.nextInt(mar7.length);
                text.setText("7. Marta notikums:\n" + mar7[random7]);
            });
            n8.setOnAction(event -> {
                String[] mar8 = {"1817. — tika dibināta Ņujorkas fondu birža.",
                        "1945. — Josips Brozs Tito izveidoja Dienvidslāvijas valdību.",
                        "1980. — PSRS tika rīkots pirmais rokmūzikas festivāls."};
                int random8 = ran.nextInt(mar8.length);
                text.setText("8. Marta notikums:\n" + mar8[random8]);
            });
            n9.setOnAction(event -> {
                String[] mar9 = {"1908. — Milānā, Itālijā dibināts futbola klubs F.C. Internazionale Milano.",
                        "1991. — Belgradas ielās notika demonstrācijas pret Serbijas prezidentu Slobodanu Miloševiču.",
                        "1992. — Ķīnas Tautas Republika ratificēja Kodolieroču neizplatīšanas līgumu."};
                int random9 = ran.nextInt(mar9.length);
                text.setText("9. Marta notikums:\n" + mar9[random9]);
            });
            n10.setOnAction(event -> {
                String[] mar10 = {"1876. — Aleksandrs Greiems Bells veica pirmo telefona sarunu.",
                        "1892. — Kotdivuāra kļuva par Francijas koloniju.",
                        "1952. — Fulhensio Batista veica valsts apvērsumu Kubā."};
                int random10 = ran.nextInt(mar10.length);
                text.setText("10. Marta notikums:\n" + mar10[random10]);
            });
            n11.setOnAction(event -> {
                String[] mar11 = {"1951. — Indijas pilsētā Ņūdeli beidzās pirmās Āzijas spēles.",
                        "1990. — Lietuvas PSR Augstākā Padome pieņēma neatkarības deklarāciju.",
                        "2004. — Madridē, Spānijā vienlaicīgos sprādzienos vilcienos dzīvību zaudēja 190 cilvēki."};
                int random11 = ran.nextInt(mar11.length);
                text.setText("11. Marta notikums:\n" + mar11[random11]);
            });
            n12.setOnAction(event -> {
                String[] mar12 = {"1994. — Anglikāņu baznīca pirmoreiz par priesteri apstiprināja sievieti.",
                        "1947. — tika pasludināta Trumena doktrīna, lai palīdzētu Grieķijai un Turcijai pret spiedienu no PSRS.",
                        "1934. — Igaunijā Konstantīns Petss un Johans Laidoners veica valsts apvērsumu; tika aizliegtas \npolitiskās partijas."};
                int random12 = ran.nextInt(mar12.length);
                text.setText("12. Marta notikums:\n" + mar12[random12]);
            });
            n13.setOnAction(event -> {
                String[] mar13 = {"1881. — izveidota Rumānijas karaliste.",
                        "1781. — astronoms Viljams Heršels atklāja Saules sistēmas planētu Urānu.",
                        "1325. — dibināta Mehiko."};
                int random13 = ran.nextInt(mar13.length);
                text.setText("13. Marta notikums:\n" + mar13[random13]);
            });
            n14.setOnAction(event -> {
                String[] mar14 = {"1903. — ASV Senāts ratificēja līgumu, kurā Kolumbija atļāva būvēt Panamas kanālu.",
                        "1978. — Izraēlas spēki iebruka un okupēja Libānas dienvidus.",
                        "2004. — Vladimirs Putins tika atkārtoti ievēlēts par Krievijas prezidentu."};
                int random14 = ran.nextInt(mar14.length);
                text.setText("14. Marta notikums:\n" + mar14[random14]);
            });
            n15.setOnAction(event -> {
                String[] mar15 = {"44. p.m.ē. — nogalināts Jūlijs Cēzars.",
                        "1918. — Jelgavā deklarēta Kurzemes hercogistes atjaunošana.",
                        "1990. — Mihails Gorbačovs ievēlēts par pirmo (un pēdējo) PSRS prezidentu."};
                int random15 = ran.nextInt(mar15.length);
                text.setText("15. Marta notikums:\n" + mar15[random15]);
            });
            n16.setOnAction(event -> {
                String[] mar16 = {"1521. — Filipīnās pirmo reizi ieradās eiropieši. Ekspedīciju vadīja Fernāns Magelāns.",
                        "1942. — pirmais vācu raķetes V-2 izmēģinājums, raķete eksplodēja netālu no starta laukuma.",
                        "2005. — Izraēla oficiāli Palestīnai atdeva kontroli pār pilsētu Jēriku."};
                int random16 = ran.nextInt(mar16.length);
                text.setText("16. Marta notikums:\n" + mar16[random16]);
            });
            n17.setOnAction(event -> {
                String[] mar17 = {"1378. — Kurzemes bīskaps Oto piešķīra pilsētas tiesības Aizputei.",
                        "1901. — Parīzē, Bernheimas galerijā pirmoreiz izstādīti holandiešu gleznotāja Vinsenta van Goga \ndarbi, kas izraisīja milzu sensāciju mākslas pasaulē.",
                        "1992. — referendumā Dienvidāfrikā vairums nobalsoja par aparteīda izbeigšanu."};
                int random17 = ran.nextInt(mar17.length);
                text.setText("17. Marta notikums:\n" + mar17[random17]);
            });
            n18.setOnAction(event -> {
                String[] mar18 = {"1921. — Rīgā noslēgts miera līgums starp Poliju un Padomju Krieviju.",
                        "1990. — notika Latvijas PSR Augstākās Padomes vēlēšanas, kurās pirmoreiz vēlēšanu apgabalos \nvarēja izvirzīt vairākus kandidātus.",
                        "1992. — Microsoft izlaida operētājsistēmu Windows 3.1."};
                int random18 = ran.nextInt(mar18.length);
                text.setText("18. Marta notikums:\n" + mar18[random18]);
            });
            n19.setOnAction(event -> {
                String[] mar19 = {
                        "1831. — Ņujorkas pilsētas banka kļuva par vietu pirmajai lielajai banku laupīšanai ASV vēsturē, \nlaupītājiem nolaupot 245 000 USD.",
                        "1944. — Otrais pasaules karš: vācu armija okupēja Ungāriju.",
                        "1946. — Franču Gviāna, Gvadelupa, Martinika un Reinjona kļuva par Francijas aizjūras departamentiem."};
                int random19 = ran.nextInt(mar19.length);
                text.setText("19. Marta notikums:\n" + mar19[random19]);
            });
            n20.setOnAction(event -> {
                String[] mar20 = {
                        "1861. — zemestrīce Argentīnas rietumos iznīcināja Mendosas pilsētu, nogalinot ap 5000 tās \niedzīvotāju.",
                        "1916. — Alberts Einšteins publicēja vispārējo relativitātes teoriju.",
                        "2003. — sākās ASV iebrukums Irākā."};
                int random20 = ran.nextInt(mar20.length);
                text.setText("20. Marta notikums:\n" + mar20[random20]);
            });
            n21.setOnAction(event -> {
                String[] mar21 = {"1857. — zemestrīcē Tokijā, Japānā, gāja bojā vairāk kā 100 000 cilvēku.",
                        "1935. — Persija tika pārdēvēta par Irānu.",
                        "1990. — Namībija ieguva neatkarību pēc 75 gadu ilgas pakļautības Dienvidāfrikai."};
                int random21 = ran.nextInt(mar21.length);
                text.setText("21. Marta notikums:\n" + mar21[random21]);
            });
            n22.setOnAction(event -> {
                String[] mar22 = {
                        "1873. — Spānijas Nacionālā asambleja pieņēma likumu, ar kuru tika atcelta verdzība Puertoriko.",
                        "1894. — notika pirmā Stenlija kausa izcīņas izslēgšanas spēle.",
                        "1939. — Otrais pasaules karš: Vācija okupēja Lietuvai piederošo Mēmeli."};
                int random22 = ran.nextInt(mar22.length);
                text.setText("22. Marta notikums:\n" + mar22[random22]);
            });
            n23.setOnAction(event -> {
                String[] mar23 = {"1919. — Milānā, Itālijā, Benito Musolīni nodibināja fašistu politisko kustību.",
                        "1991. — sākās Sjerraleones pilsoņu karš.",
                        "2001. — orbitālā stacija Mir tika nogremdēta Klusā okeāna dienvidu daļā."};
                int random23 = ran.nextInt(mar23.length);
                text.setText("23. Marta notikums:\n" + mar23[random23]);
            });
            n24.setOnAction(event -> {
                String[] mar24 = {"1923. — Grieķija kļuva par republiku.",
                        "1924. — Latvijā dibināts Triju Zvaigžņu ordenis.",
                        "2004. — darbu sāka viens no Latvijas populārākajiem interneta portāliem Draugiem.lv."};
                int random24 = ran.nextInt(mar24.length);
                text.setText("24. Marta notikums:\n" + mar24[random24]);
            });
            n25.setOnAction(event -> {
                String[] mar25 = {"1655. — Kristiāns Heigenss atklāja Saturna lielāko pavadoni Titānu.",
                        "1949. — Padomju Savienība veica masveida deportācijas no Baltijas valstīm, izvedot vairāk \nnekā 92 000 cilvēku.",
                        "1954. — PSRS atzina Austrumvācijas suverenitāti, tomēr atstāja padomju bruņotos spēkus valstī."};
                int random25 = ran.nextInt(mar25.length);
                text.setText("25. Marta notikums:\n" + mar25[random25]);
            });
            n26.setOnAction(event -> {
                String[] mar26 = {"1817. — Kurzemē atcēla dzimtbūšanu.",
                        "1971. — Bangladeša deklarēja neatkarību no Pakistānas, kā rezultātā sākās Bangladešas \natbrīvošanas karš.",
                        "1995. — stājās spēkā Šengenas līgums."};
                int random26 = ran.nextInt(mar26.length);
                text.setText("26. Marta notikums:\n" + mar26[random26]);
            });
            n27.setOnAction(event -> {
                String[] mar27 = {"1625. — Čārlzs I kļuva par Skotijas, Īrijas un Anglijas karali.",
                        "1918. — Moldova un Besarābija pievienojās Rumānijai.",
                        "1994. — pirmo lidojumu veica Eiropas iznīcinātājlidmašīnas Eurofighter 2000 Typhoon prototips."};
                int random27 = ran.nextInt(mar27.length);
                text.setText("27. Marta notikums:\n" + mar27[random27]);
            });
            n28.setOnAction(event -> {
                String[] mar28 = {
                        "1930. — Turcijas pilsētām Konstantinopolei un Angorai tika mainīti nosaukumi uz Stambulu un Ankaru.",
                        "1990. — dibināta Latvijas Kultūras akadēmija.",
                        "2005. — Indonēzijā Sumatras salā notika 8,7 ballu stipra zemestrīce, kas bija otra spēcīgākā \nzemestrīce kopš 1965. gada."};
                int random28 = ran.nextInt(mar28.length);
                text.setText("28. Marta notikums:\n" + mar28[random28]);
            });
            n29.setOnAction(event -> {
                String[] mar29 = {
                        "1942. — Otrais pasaules karš: Sabiedroto aviācijas uzlidojumā Lībekai piektā daļa no vecpilsētas \ntika sagrauta.",
                        "1973. — Vjetnamas karš: pēdējais ASV karavīrs atstāja Dienvidvjetnamu.",
                        "2004. — NATO tika uzņemta Bulgārija, Igaunija, Latvija, Rumānija, Slovākija un Slovēnija."};
                int random29 = ran.nextInt(mar29.length);
                text.setText("29. Marta notikums:\n" + mar29[random29]);
            });
            n30.setOnAction(event -> {
                String[] mar30 = {"1856. — ar Parīzes miera līguma noslēgšanu beidzās Krimas karš.",
                        "1867. — beidza pastāvēt Austrijas impērija.",
                        "1945. — Otrais pasaules karš: PSRS spēki iegāja Austrijā un ieņēma Vīni; padomju un poļu spēki \nieņēma Gdaņsku."};
                int random30 = ran.nextInt(mar30.length);
                text.setText("30. Marta notikums:\n" + mar30[random30]);
            });
            n31.setOnAction(event -> {
                String[] mar31 = {"1918. — ASV pirmoreiz tika pielietots vasaras laiks.",
                        "1931. — zemestrīce iznīcināja Managvu Nikaragvā, bojā gāja apmēram 2000 cilvēku.",
                        "1959. — dalailama (Tenzins Gjaco) šķērsoja Indijas robežu, lūdzot politisko patvērumu."};
                int random31 = ran.nextInt(mar31.length);
                text.setText("31. Marta notikums:\n" + mar31[random31]);
            });
        });

        //Aprillis
        apr.setOnAction(e -> {
            n30.setVisible(true);
            n31.setVisible(false);
            n1.setOnAction(event -> {
                String[] apr1 = {
                        "1939. — ģenerālisimuss Fransisko Franko paziņoja par Spānijas pilsoņu kara beigām, kad bija \npadevušies pēdējie republikāņu spēki.",
                        "1948. — Fēru Salas ieguva autonomiju Dānijas sastāvā.",
                        "1967. — Stīvs Džobss un Stīvs Vozņaks dibināja Apple Computer."};
                int random1 = ran.nextInt(apr1.length);
                text.setText("1. Aprīļa notikums:\n" + apr1[random1]);
            });
            n2.setOnAction(event -> {
                String[] apr2 = {"1801. — Napoleona kari: notika Kopenhāgenas kauja, kurā briti iznīcināja dāņu floti.",
                        "1902. — Losandželosā tika atklāts pirmais kinoteātris ASV.",
                        "1945. — tika izveidoti diplomātiski sakari starp PSRS un Brazīliju."};
                int random2 = ran.nextInt(apr2.length);
                text.setText("2. Aprīļa notikums:\n" + apr2[random2]);
            });
            n3.setOnAction(event -> {
                String[] apr3 = {"1885. — Gotlībam Daimleram piešķīra vācu patentu par dzinēju.",
                        "1954. — PSRS vēstniecības Kanberā trešais sekretārs Vladimirs Petrovs lūdza un saņēma politisko \npatvērumu Austrālijā.",
                        "1973. — ASV, Ņujorkā tika veikts pirmais mobilā telefona zvans."};
                int random3 = ran.nextInt(apr3.length);
                text.setText("3. Aprīļa notikums:\n" + apr3[random3]);
            });
            n4.setOnAction(event -> {
                String[] apr4 = {"1850. — Losandželosa ieguva pilsētas tiesības.",
                        "1975. — Bills Geitss un Pols Allens dibināja Microsoft.",
                        "1969. — Dentonam Kūlejam implantēja pirmo pagaidu mākslīgo sirdi."};
                int random4 = ran.nextInt(apr4.length);
                text.setText("4. Aprīļa notikums:\n" + apr4[random4]);
            });
            n5.setOnAction(event -> {
                String[] apr5 = {"1242. — Ledus kauja uz Peipusa ezera starp Novgorodas kņazisti un krustnešiem.",
                        "1968. — Čehoslovākijā tika publicēta Rīcības programma, lai veidotu no PSRS neatkarīgu politiku.",
                        "1969. — Vjetnamas karš: daudzās ASV pilsētās notika plašas pretkara demonstrācijas."};
                int random5 = ran.nextInt(apr5.length);
                text.setText("5. Aprīļa notikums:\n" + apr5[random5]);
            });
            n6.setOnAction(event -> {
                String[] apr6 = {"1917. — Pirmais pasaules karš: ASV pieteica karu Vācijai.",
                        "1941. — Otrais pasaules karš: Vācija iebruka Dienvidslāvijas Karalistē un Grieķijā.",
                        "2004. — Rolands Pakss kļuva par pirmo Lietuvas prezidentu, kas atcelts no amata pēc impīčmenta \nprocedūras."};
                int random6 = ran.nextInt(apr6.length);
                text.setText("6. Aprīļa notikums:\n" + apr6[random6]);
            });
            n7.setOnAction(event -> {
                String[] apr7 = {"1795. — Francijā metru pieņēma par garuma pamata mērvienību.",
                        "1923. — starp Latviju un Padomju Krieviju tika parakstīts robežlīgums.",
                        "2003. — ASV spēki ieņēma Bagdādi."};
                int random7 = ran.nextInt(apr7.length);
                text.setText("7. Aprīļa notikums:\n" + apr7[random7]);
            });
            n8.setOnAction(event -> {
                String[] apr8 = {
                        "1525. — Krakovā tika parakstīts līgums, saskaņā ar kuru Teitoņu ordeņa valsts vietā tika \ndibināta Prūsijas hercogiste, Polijas troņa vasaļvalsts.",
                        "1940. — Otrais pasaules karš: Vācijas karaspēks okupēja Norvēģijas galvaspilsētu Oslo.",
                        "1993. — Maķedonijas Republika tika uzņemta ANO."};
                int random8 = ran.nextInt(apr8.length);
                text.setText("8. Aprīļa notikums:\n" + apr8[random8]);
            });
            n9.setOnAction(event -> {
                String[] apr9 = {"1940. — Otrais pasaules karš: Vācija iebruka Dānijā un Norvēģijā.",
                        "1942. — Otrais pasaules karš: Batānas Nāves maršs — 70 000 ASV un Filipīnu karavīri padevās japāņiem.",
                        "1991. — Gruzija pasludināja neatkarību no PSRS."};
                int random9 = ran.nextInt(apr9.length);
                text.setText("9. Aprīļa notikums:\n" + apr9[random9]);
            });
            n10.setOnAction(event -> {
                String[] apr10 = {
                        "1945. — Otrais pasaules karš: Sabiedroto spēki atbrīvoja nacistu koncentrācijas nometni Būhenvaldē.",
                        "1980. — Spānija un Apvienotā Karaliste vienojās par Gibraltāra robežas atvēršanu, kas tika \nslēgta 1969. gadā.",
                        "2006. — Romano Prodi ar nelielu balsu pārsvaru sakāva Silvio Berluskoni Itālijas parlamenta \nvēlēšanās."};
                int random10 = ran.nextInt(apr10.length);
                text.setText("10. Aprīļa notikums:\n" + apr10[random10]);
            });
            n11.setOnAction(event -> {
                String[] apr11 = {"1919. — izveidota Starptautiskā Darba organizācija.",
                        "2006. — ESA zonde Venus Express iegāja Veneras orbītā.",
                        "2007. — teroristiskais grupējums Al Qaeda uzņēmās atbildību par diviem sprādzieniem Alžīrā, \nkuros bojā gāja 33 cilvēki, vairāk kā 200 ievainoti."};
                int random11 = ran.nextInt(apr11.length);
                text.setText("11. Aprīļa notikums:\n" + apr11[random11]);
            });
            n12.setOnAction(event -> {
                String[] apr12 = {
                        "1861. — sākās Amerikas pilsoņu karš, konfederātu spēkiem uzbrūkot Samteras fortam Dienvidkarolīnā.",
                        "1917. — Pirmais Pasaules karš: Kanādas spēki uzvarēja kaujā par Vimī kori.",
                        "1955. — ASV ieviesta poliomielīta vakcīna."};
                int random12 = ran.nextInt(apr12.length);
                text.setText("12. Aprīļa notikums:\n" + apr12[random12]);
            });
            n13.setOnAction(event -> {
                String[] apr13 = {"1849. — Ungārija kļuva par republiku.",
                        "1974. — ASV palaists pirmais komerciālais ģeostacionārais sakaru pavadonis Westar 1.",
                        "1975. — sākās Libānas pilsoņu karš."};
                int random13 = ran.nextInt(apr13.length);
                text.setText("13. Aprīļa notikums:\n" + apr13[random13]);
            });
            n14.setOnAction(event -> {
                String[] apr14 = {
                        "1912. — pasažieru kuģis “Titāniks” Atlantijas ziemeļdaļā sadūrās ar aisbergu un nākamajā rīta \nnogrima, bojā gāja 1503 cilvēki.",
                        "1978. — Tbilisi, Gruzijas PSR notika demonstrācijas, protestējot pret valsts valodas statusa \nnoņemšanu gruzīnu valodai.",
                        "2003. — pabeigts Cilvēka genoma projekts, sekvencējot 99% cilvēka genoma, ar 99,99% precizitāti."};
                int random14 = ran.nextInt(apr14.length);
                text.setText("14. Aprīļa notikums:\n" + apr14[random14]);
            });
            n15.setOnAction(event -> {
                String[] apr15 = {"1945. — Otrais pasaules karš: atbrīvota Bergenes-Belzenes koncentrācijas nometne.",
                        "1955. — tika atvērts pirmais McDonald's franšīzes ātrās apkalpošanas restorāns.",
                        "2013. — Bostonas maratona laikā notika divi sprādzieni, kuros gāja bojā 3 cilvēki un 246 cilvēki \ntika ievainoti."};
                int random15 = ran.nextInt(apr15.length);
                text.setText("15. Aprīļa notikums:\n" + apr15[random15]);
            });
            n16.setOnAction(event -> {
                String[] apr16 = {"1917. — Ļeņins ieradās Petrogradā no emigrācijas.",
                        "1945. — Otrais pasaules karš: Sarkanā armija sāka Berlīnes operāciju.",
                        "1994. — referendumā Somijā atbalstīta pievienošanās Eiropas Savienībai."};
                int random16 = ran.nextInt(apr16.length);
                text.setText("16. Aprīļa notikums:\n" + apr16[random16]);
            });
            n17.setOnAction(event -> {
                String[] apr17 = {"1861. — Virdžīnija nolēma atdalīties no ASV.",
                        "1919. — Francijā ieviesta astoņu stundu darba diena.",
                        "1970. — Apollo programma: bojātais kosmosa kuģis Apollo 13 atgriezās uz Zemes."};
                int random17 = ran.nextInt(apr17.length);
                text.setText("17. Aprīļa notikums:\n" + apr17[random17]);
            });
            n18.setOnAction(event -> {
                String[] apr18 = {"1906. — Sanfrancisko, ASV, notika postoša zemestrīce.",
                        "1946. — likvidēta Tautu Savienība, nodibinoties ANO.",
                        "1983. — Beirūtā, Libānā, tika uzspridzināta ASV vēstniecība, bojā gāja 63 cilvēki."};
                int random18 = ran.nextInt(apr18.length);
                text.setText("18. Aprīļa notikums:\n" + apr18[random18]);
            });
            n19.setOnAction(event -> {
                String[] apr19 = {"1896. — notika pirmās riteņbraukšanas sacensības Parīze-Rubē",
                        "1995. — Oklahomasitijā, ASV notika sprādziens federālajā ēkā, bojā gāja 168 cilvēki.",
                        "1999. — Vācijas Bundestāgs atgriezās Berlīnē."};
                int random19 = ran.nextInt(apr19.length);
                text.setText("19. Aprīļa notikums:\n" + apr19[random19]);
            });
            n20.setOnAction(event -> {
                String[] apr20 = {"1792. — Francija pieteica karu Austrijai, sākot Franču revolūcijas karus.",
                        "1945. — Otrais pasaules karš: ASV spēki ieņēma Leipcigu.",
                        "1999. — apšaude Kolumbainas vidusskolā ASV: 2 skolēni nošāva 12 skolas biedrus un 1 skolotāju, \nievainoja 24."};
                int random20 = ran.nextInt(apr20.length);
                text.setText("20. Aprīļa notikums:\n" + apr20[random20]);
            });
            n21.setOnAction(event -> {
                String[] apr21 = {"1509. — pēc Henrija VII nāves Anglijas tronī viņu nomainīja dēls Henrijs VIII.",
                        "1944. — sievietes Francijā ieguva vēlēšanas tiesības.",
                        "1960. — oficiāli atklāta Brazīlijas jaunā galvaspilsēta Brazilja."};
                int random21 = ran.nextInt(apr21.length);
                text.setText("21. Aprīļa notikums:\n" + apr21[random21]);
            });
            n22.setOnAction(event -> {
                String[] apr22 = {"1343. — Igaunijā uzliesmoja tā sauktā Jurģa nakts sacelšanās.",
                        "1993. — izlaista tīmekļa pārlūkprogrammas Mosaic pirmā versija.",
                        "1997. — beidzās 126 dienu ķīlnieku krīze Japānas vēstniecībā Limā, Peru, pēc specvienību \nuzbrukuma ēkām."};
                int random22 = ran.nextInt(apr22.length);
                text.setText("22. Aprīļa notikums:\n" + apr22[random22]);
            });
            n23.setOnAction(event -> {
                String[] apr23 = {"1919. — uz pirmo sēdi sanāca Igaunijas Satversmes sapulce.",
                        "1985. — Coca Cola mainīja dzēriena formulu, izlaižot New Coke, tomēr cilvēku reakcija bija tik \nļoti negatīva, ka iepriekšējās formulas dzēriens atgriezās atpakaļ tirdzniecībā mazāk kā pēc 3 mēnešiem.",
                        "1993. — Eritrejas iedzīvotāji nobalsoja par neatkarību no Etiopijas ANO pārraudzītajā referendumā."};
                int random23 = ran.nextInt(apr23.length);
                text.setText("23. Aprīļa notikums:\n" + apr23[random23]);
            });
            n24.setOnAction(event -> {
                String[] apr24 = {
                        "1915. — sākās Armēņu genocīds ar simtiem ietekmīgu armēņu deportāciju no Konstantinopoles.",
                        "1981. — demonstrēts pirmais IBM PC personālais dators.",
                        "1990. — VFR un VDR piekrita apvienot ekonomiku un valūtu 1. jūlijā."};
                int random24 = ran.nextInt(apr24.length);
                text.setText("24. Aprīļa notikums:\n" + apr24[random24]);
            });
            n25.setOnAction(event -> {
                String[] apr25 = {
                        "1953. — Frānsiss Kriks un Džeimss Votsons publicēja pētījumu rezultātus par DNS struktūru.",
                        "1974. — Portugalē Neļķu revolūcijā atjaunoja demokrātiju pēc 40 gadu ilga autoritāra režīma.",
                        "2002. — startēja kosmosa kuģis Sojuz TM-34 ar otro \"kosmisko tūristu\" Marku Šatlvortu un diviem \nprofesionāliem kosmonautiem."};
                int random25 = ran.nextInt(apr25.length);
                text.setText("25. Aprīļa notikums:\n" + apr25[random25]);
            });
            n26.setOnAction(event -> {
                String[] apr26 = {
                        "1933. — tika nodibināta gestapo (Geheime Staatspolizei) — slepenpolicija nacistiskajā Vācijā.",
                        "1900. — dzimis Čārlzs Rihters, ASV seismologs, Rihtera skalas radītājs.",
                        "1966. — 7,5 magnitūdas spēcīga zemestrīce iznīcināja Taškentu."};
                int random26 = ran.nextInt(apr26.length);
                text.setText("26. Aprīļa notikums:\n" + apr26[random26]);
            });
            n27.setOnAction(event -> {
                String[] apr27 = {"1961. — Sjerraleone ieguva neatkarību no Apvienotās Karalistes.",
                        "1994. — Dienvidāfrikas Republikā notika pirmās vēlēšanas, kurās ļauts piedalīties visu rasu pārstāvjiem.",
                        "2007. — Igaunijā pārvietota Bronzas karavīra statuja, izraisot protestus gan no valstī dzīvojošo \nkrievu puses, gan Krievijas."};
                int random27 = ran.nextInt(apr27.length);
                text.setText("27. Aprīļa notikums:\n" + apr27[random27]);
            });
            n28.setOnAction(event -> {
                String[] apr28 = {"1788. — Mērilenda kļuva par septīto ASV štatu.",
                        "1952. — ASV beidza Japānas okupāciju",
                        "1969. — Šarls de Golls atkāpās no Francijas prezidenta amata."};
                int random28 = ran.nextInt(apr28.length);
                text.setText("28. Aprīļa notikums:\n" + apr28[random28]);
            });
            n29.setOnAction(event -> {
                String[] apr29 = {"1483. — Grankanāriju, galveno Kanāriju salu, iekaroja Kastīlijas karaliste.",
                        "1991. — tropiskais ciklons uzbruka Bangladešai, bojā gāja aptuveni 138 000 cilvēku, bez pajumtes \npalika vairāk nekā 10 miljoni cilvēku.",
                        "2007. — Sīrija pabeidza savu bruņoto spēku izvešanu no Libānas, beidzot 29 gadu okupāciju."};
                int random29 = ran.nextInt(apr29.length);
                text.setText("29. Aprīļa notikums:\n" + apr29[random29]);
            });
            n30.setOnAction(event -> {
                String[] apr30 = {"1916. — Vācija kļuva par pirmo valsti, kura pārgāja uz vasaras laiku.",
                        "1975. — Vjetnamas karš beidzās, komunistiskajiem spēkiem ieņemot Saigonu.",
                        "1993. — CERN palaida globālo tīmekli brīvā izmantošanā jebkuram lietotājam."};
                int random30 = ran.nextInt(apr30.length);
                text.setText("30. Aprīļa notikums:\n" + apr30[random30]);
            });
        });

        // Maijs
        maj.setOnAction(e -> {
            n30.setVisible(true);
            n31.setVisible(true);
            n1.setOnAction(event -> {
                String[] maj1 = {"1851. — tika atklāta Lielā izstāde Kristāla pilī, Londonā.",
                        "1920. — uz pirmo sēdi sanāca Latvijas Satversmes sapulce.",
                        "1948. — dibināta Korejas Tautas Demokrātiskā Republika."};
                int random1 = ran.nextInt(maj1.length);
                text.setText("1. Maija notikums:\n" + maj1[random1]);
            });
            n2.setOnAction(event -> {
                String[] maj2 = {
                        "1945. — Padomju Savienība paziņoja par Berlīnes ieņemšanu; padomju karavīri pacēla sarkano \nkarogu virs Reihstāga.",
                        "1997. — Tonijs Blērs kļuva par Apvienotās Karalistes premjerministru.",
                        "2011. — ASV specvienība Pakistānā nogalināja Osamu bin Ladenu, aizdomās turēto par 11. septembra \nuzbrukumiem un FIB meklētāko personu."};
                int random2 = ran.nextInt(maj2.length);
                text.setText("2. Maija notikums:\n" + maj2[random2]);
            });
            n3.setOnAction(event -> {
                String[] maj3 = {"1802. — Vašingtona ieguva pilsētas tiesības.",
                        "1947. — Japānā stājās spēkā jauna konstitūcija.",
                        "2000. — paslēpts pirmais Geocaching slēpnis."};
                int random3 = ran.nextInt(maj3.length);
                text.setText("3. Maija notikums:\n" + maj3[random3]);
            });
            n4.setOnAction(event -> {
                String[] maj4 = {
                        "1776. — Rodailenda pirmā no ASV štatiem pasludināja neatkarību no Apvienotās Karalistes.",
                        "1935. — Latvijas basketbola izlase izcīnīja uzvaru 1935. gada Eiropas čempionātā Šveicē, \nkļūstot par pirmajiem Eiropas čempioniem.",
                        "1949. — Pasniegta pirmā Grammy balva."};
                int random4 = ran.nextInt(maj4.length);
                text.setText("4. Maija notikums:\n" + maj4[random4]);
            });
            n5.setOnAction(event -> {
                String[] maj5 = {"1936. — Itālijas spēki okupēja Adisabebu, Etiopijā.",
                        "1949. — Strasbūrā dibināta Eiropas Padome.",
                        "1997. — palaisti pirmie 5 Iridium pavadoņi."};
                int random5 = ran.nextInt(maj5.length);
                text.setText("5. Maija notikums:\n" + maj5[random5]);
            });
            n6.setOnAction(event -> {
                String[] maj6 = {"1861. — Amerikas Pilsoņu karš: Ārkanzasa izstājās no ASV.",
                        "1910. — Džordžs V kļuva par Apvienotās Karalistes karali pēc sava tēva Edvarda VII nāves.",
                        "2007. — Francijas prezidenta vēlēšanu otrajā kārtā ar 53% balsu tika ievēlēts Nikolā Sarkozī."};
                int random6 = ran.nextInt(maj6.length);
                text.setText("6. Maija notikums:\n" + maj6[random6]);
            });
            n7.setOnAction(event -> {
                String[] maj7 = {"1832. — Grieķija ieguva neatkarību.",
                        "1895. — Sanktpēterburgā krievu zinātnieks Aleksandrs Popovs demonstrēja pirmo radiouztvērēju — kohereru.",
                        "2000. — Par Krievijas prezidentu kļuva Vladimirs Putins."};
                int random7 = ran.nextInt(maj7.length);
                text.setText("7. Maija notikums:\n" + maj7[random7]);
            });
            n8.setOnAction(event -> {
                String[] maj8 = {"1912. — dibināts uzņēmums Paramount Pictures.",
                        "1945. — Otrais pasaules karš: beidzās karadarbība Eiropā, Vācijai pieņemot bezierunu kapitulāciju.",
                        "1956. — lauzta Indonēzijas un Nīderlandes konstitucionālā savienība."};
                int random8 = ran.nextInt(maj8.length);
                text.setText("8. Maija notikums:\n" + maj8[random8]);
            });
            n9.setOnAction(event -> {
                String[] maj9 = {"1877. — Rumānija pasludināja neatkarību no Osmaņu impērijas.",
                        "1936. — Benito Musolīni paziņoja par Etiopijas pievienošanu Itālijai.",
                        "1926. — pēc islāmistu sektas nemieriem Francijas flote bombardēja Damasku."};
                int random9 = ran.nextInt(maj9.length);
                text.setText("9. Maija notikums:\n" + maj9[random9]);
            });
            n10.setOnAction(event -> {
                String[] maj10 = {
                        "1924. — Edgars Hūvers tika apstiprināts par ASV Federālā izmeklēšanas biroja direktoru un \npalika šajā amatā līdz pat savai nāvei 1972. gadā.",
                        "1967. — PSRS pārtrauca diplomātiskās attiecības ar Izraēlu.",
                        "1994. — par pirmo melnādaino Dienvidāfrikas Republikas prezidentu kļuva Nelsons Mandela."};
                int random10 = ran.nextInt(maj10.length);
                text.setText("10. Maija notikums:\n" + maj10[random10]);
            });
            n11.setOnAction(event -> {
                String[] maj11 = {"1858. — Minesota kļuva par 32. ASV štatu.",
                        "1502. — Kristofors Kolumbs devās savā ceturtajā un pēdējā ceļojumā un Rietumindiju.",
                        "1949. — Siāma oficiāli nomainīja nosaukumu uz Taizemi, kas ticis lietots kopš 1939. gada."};
                int random11 = ran.nextInt(maj11.length);
                text.setText("11. Maija notikums:\n" + maj11[random11]);
            });
            n12.setOnAction(event -> {
                String[] maj12 = {"1786. — Teherāna kļuva par Irānas galvaspilsētu.",
                        "1941. — Konrāds Cūze Berlīnē prezentēja Z3, pasaulē pirmo darbojošos programmējamu, pilnībā \nautomātisku datoru.",
                        "1997. — noslēgts Krievijas un Čečenijas miera līgums."};
                int random12 = ran.nextInt(maj12.length);
                text.setText("12. Maija notikums:\n" + maj12[random12]);
            });
            n13.setOnAction(event -> {
                String[] maj13 = {"1848. — pirmoreiz atskaņota Somijas valsts himna.",
                        "1909. — tika dots starts pirmajām Giro d'Italia sacensībām.",
                        "1950. — Apvienotajā Karalistē (Silverstonas trasē) sākās pirmais Formula 1 čempionāts."};
                int random13 = ran.nextInt(maj13.length);
                text.setText("13. Maija notikums:\n" + maj13[random13]);
            });
            n14.setOnAction(event -> {
                String[] maj14 = {"1702. — Lielais Ziemeļu karš: zviedru karaspēks ieņēma Varšavu.",
                        "1811. — Paragvaja ieguva neatkarību no Spānijas.",
                        "1955. — PSRS un vēl septiņas komunistiskā bloka valstis dibināja Varšavas līguma organizāciju, \natbildot uz NATO izveidi."};
                int random14 = ran.nextInt(maj14.length);
                text.setText("14. Maija notikums:\n" + maj14[random14]);
            });
            n15.setOnAction(event -> {
                String[] maj15 = {"1919. — Grieķija ieņēma Turcijas pilsētu Izmiru.",
                        "1935. — Maskavas metro atklāts publikai.",
                        "1958. — PSRS palaists pavadonis Sputņik-3."};
                int random15 = ran.nextInt(maj15.length);
                text.setText("15. Maija notikums:\n" + maj15[random15]);
            });
            n16.setOnAction(event -> {
                String[] maj16 = {"1908. — Parīzē dibināta Starptautiskā Hokeja federācija.",
                        "1929. — Holivudā, ASV notika pirmā Kinoakadēmijas balvas pasniegšanas ceremonija.",
                        "1916. — noslēgta slepenā Sikes-Piko vienošanās par Osmaņu impērijas teritorijas sadalīšanu \nietekmes sfērās starp Lielbritāniju, Franciju un Krieviju."};
                int random16 = ran.nextInt(maj16.length);
                text.setText("16. Maija notikums:\n" + maj16[random16]);
            });
            n17.setOnAction(event -> {
                String[] maj17 = {"1587. — par Kurzemes hercogiem kļuva brāļi Frīdrihs un Vilhelms Ketleri",
                        "1756. — formāli sākās Septiņgadu karš, kad Lielbritānijas Karaliste pieteica karu Francijai.",
                        "1983. — Libāna, Izraēla un ASV parakstīja līgumu par Izraēlas spēku izvākšanu no Libānas."};
                int random17 = ran.nextInt(maj17.length);
                text.setText("17. Maija notikums:\n" + maj17[random17]);
            });
            n18.setOnAction(event -> {
                String[] maj18 = {"1804. — Francijas senāts proklamēja Napoleonu par imperatoru.",
                        "1944. — krimas tatāri tika deportēti no Krimas uz Vidusāziju.",
                        "1998. — ASV Tieslietu departaments un 20 štati iesniedza prasību tiesā pret Microsoft par \nmonopola stāvokļa izmantošanu."};
                int random18 = ran.nextInt(maj18.length);
                text.setText("18. Maija notikums:\n" + maj18[random18]);
            });
            n19.setOnAction(event -> {
                String[] maj19 = {"1568. — karaliene Elizabete I pavēlēja arestēt Skotijas karalieni Mariju I.",
                        "1971. — PSRS palaista Marsa zonde Mars-2.",
                        "1991. — horvāti nobalsoja par neatkarību no Dienvidslāvijas."};
                int random19 = ran.nextInt(maj19.length);
                text.setText("19. Maija notikums:\n" + maj19[random19]);
            });
            n20.setOnAction(event -> {
                String[] maj20 = {"1498. — Portugāļu jūrasbraucējs Vasko da Gama sasniedza Indijas okeānu.",
                        "1882. — izveidota Trejsavienība starp Vāciju, Austroungāriju un Itāliju.",
                        "2002. — Austrumtimora iegūst neatkarību no Portugāles un Indonēzijas."};
                int random20 = ran.nextInt(maj20.length);
                text.setText("20. Maija notikums:\n" + maj20[random20]);
            });
            n21.setOnAction(event -> {
                String[] maj21 = {"1721. — zibens iespēra Rīgas Sv. Pētera baznīcas tornī, un tas nodega.",
                        "1840. — Jaunzēlande tika pasludināta par britu koloniju.",
                        "2006. — Melnkalnē notika referendums, kurā iedzīvotaji atbalstīja atdalīšanos no Serbijas un \nMelnkalnes valsts."};
                int random21 = ran.nextInt(maj21.length);
                text.setText("21. Maija notikums:\n" + maj21[random21]);
            });
            n22.setOnAction(event -> {
                String[] maj22 = {"1906. — brāļi Raiti patentēja savu pirmo lidaparātu.",
                        "1990. — Microsoft izlaida operētājsistēmu Windows 3.0.",
                        "1960. — 9,5 ballu stipra Lielā Čīles zemestrīce satricināja Čīles dienvidus."};
                int random22 = ran.nextInt(maj22.length);
                text.setText("22. Maija notikums:\n" + maj22[random22]);
            });
            n23.setOnAction(event -> {
                String[] maj23 = {"1568. — Nīderlande pasludināja neatkarību no Spānijas.",
                        "1958. — pirmais ASV pavadonis Explorer 1 beidza aktīvo darbību.",
                        "1949. — dibināta Vācijas Federatīvā Republika un pieņemts pašreizējais Vācijas karogs un ģerbonis."};
                int random23 = ran.nextInt(maj23.length);
                text.setText("23. Maija notikums:\n" + maj23[random23]);
            });
            n24.setOnAction(event -> {
                String[] maj24 = {"1940. — Igors Sikorskis veica pirmo sekmīgo helikoptera lidojumu.",
                        "1962. — Mercury projekts: ASV palaists kosmosa kuģis Mercury 7 ar astronautu Skotu Karpenteru.",
                        "1993. — Eritreja pasludināja neatkarību no Etiopijas."};
                int random24 = ran.nextInt(maj24.length);
                text.setText("24. Maija notikums:\n" + maj24[random24]);
            });
            n25.setOnAction(event -> {
                String[] maj25 = {"2008. — uz Marsa virsmas nolaidās NASA kosmiskais aparāts Phoenix. ",
                        "2000. — Izraēla izveda savus spēkus no Libānas dienvidiem pēc 22 gadu okupācijas.",
                        "1977. — izlaista filma \"Zvaigžņu kari\", kas drīzumā kļuva par rekordisti kases ieņēmumos."};
                int random25 = ran.nextInt(maj25.length);
                text.setText("25. Maija notikums:\n" + maj25[random25]);
            });
            n26.setOnAction(event -> {
                String[] maj26 = {"1966. — Gajāna ieguva neatkarību no Apvienotās Karalistes.",
                        "2001. — CIP atslepenoja 39. paragrāfu 1991. gada janvāra Līča kara ziņojumā par Irākas \nkodolprogrammu.",
                        "2006. — 6,3 ballu stiprā zemestrīcē Javas salā gāja bojā 5700 cilvēku."};
                int random26 = ran.nextInt(maj26.length);
                text.setText("26. Maija notikums:\n" + maj26[random26]);
            });
            n27.setOnAction(event -> {
                String[] maj27 = {"1919. — Afganistāna kļuva par neatkarīgu valsti.",
                        "1994. — krievu rakstnieks un disidents Aleksandrs Solžeņicins atgriezās dzimtenē pēc 20 \ntrimdā pavadītiem gadiem.",
                        "1996. — Pirmais Čečenijas karš: Krievijas prezidents Boriss Jeļcins tikās ar Čečenijas nemiernieku \nlīderiem."};
                int random27 = ran.nextInt(maj27.length);
                text.setText("27. Maija notikums:\n" + maj27[random27]);

            });
            n28.setOnAction(event -> {
                String[] maj28 = {"1971. — PSRS palaista Marsa zonde Mars-3.",
                        "2001. — Centrālāfrikas Republikā notika valsts apvērsuma mēģinājums.",
                        "1918. — Armēnija un Azerbaidžāna pasludināja neatkarību."};
                int random28 = ran.nextInt(maj28.length);
                text.setText("28. Maija notikums:\n" + maj28[random28]);
            });
            n29.setOnAction(event -> {
                String[] maj29 = {"1946. — dibināta Minskas traktoru rūpnīca.",
                        "1936. — Turcijā ar likumu noteikts Turcijas Republikas karogs un tā izgatavošanas un lietošanas noteikumi.",
                        "1790. — Rodailenda kā pēdējā no sākotnējām ASV kolonijām ratificēja konstitūciju, kļūstot par \n13. ASV štatu."};
                int random29 = ran.nextInt(maj29.length);
                text.setText("29. Maija notikums:\n" + maj29[random29]);
            });
            n30.setOnAction(event -> {
                String[] maj30 = {"1913. — beidzās Pirmais Balkānu karš.",
                        "1998. — 6,6 ballu stipra zemestrīce Afganistānā, bojā gāja vairāk kā 5000 cilvēku.",
                        "1987. — Indijā izveidots Goa štats."};
                int random30 = ran.nextInt(maj30.length);
                text.setText("30. Maija notikums:\n" + maj30[random30]);
            });
            n31.setOnAction(event -> {
                String[] maj31 = {"1911. — pabeigts okeāna lainera \"Titāniks\" korpuss.",
                        "1962. — Izraēlā tika pakārts Ādolfs Eihmanis.",
                        "1961. — Dienvidāfrika kļuva par republiku un izstājās no Nāciju Sadraudzības."};
                int random31 = ran.nextInt(maj31.length);
                text.setText("31. Maija notikums:\n" + maj31[random31]);
            });
        });

        // Jūnijs
        jun.setOnAction(e -> {
            n30.setVisible(true);
            n31.setVisible(false);
            n1.setOnAction(event -> {
                String[] jun1 = {"1926. — dzimusi ASV aktrise Merilina Monro.",
                        "1945. — britu spēki pārņēma kontroli pār Libānu un Sīriju.",
                        "2005. — Nīderlandē referendumā tika noraidīta Eiropas Savienības konstitūcija."};
                int random1 = ran.nextInt(jun1.length);
                text.setText("1. Jūnija notikums:\n" + jun1[random1]);
            });
            n2.setOnAction(event -> {
                String[] jun2 = {"1896. — itāliešu izgudrotājs Guljelmo Markoni patentēja radio.",
                        "1946. — Itālijā referendumā vēlētāji atbalstīja monarhijas likvidēšanu un republikas izveidi.",
                        "1966. — Surveyor 1 kļuva par pirmo ASV aparātu, kas nolaidies uz Mēness virsmas."};
                int random2 = ran.nextInt(jun2.length);
                text.setText("2. Jūnija notikums:\n" + jun2[random2]);
            });
            n3.setOnAction(event -> {
                String[] jun3 = {
                        "1808. — dzimis ASV politiķis, Amerikas Valstu Konfederācijas prezidents Džefersons Deiviss.",
                        "1940. — Vācijas Luftwaffe bombardēja Parīzi.",
                        "2006. — Melnkalne pasludināja neatkarību pēc 21. maijā notikušā referenduma."};
                int random3 = ran.nextInt(jun3.length);
                text.setText("3. Jūnija notikums:\n" + jun3[random3]);
            });
            n4.setOnAction(event -> {
                String[] jun4 = {"1133. — par Svētās Romas impērijas imperatoru kronēts Lotārs III Zuplinburgs.",
                        "1940. — Otrais pasaules karš: vācu spēki iegāja Parīzē.",
                        "1970. — Tonga ieguva neatkarību no Apvienotās Karalistes."};
                int random4 = ran.nextInt(jun4.length);
                text.setText("4. Jūnija notikums:\n" + jun4[random4]);
            });
            n5.setOnAction(event -> {
                String[] jun5 = {"1837. — Hjūstona, ASV, ieguva pilsētas tiesības.",
                        "1848. — pieņemot jaunu konstitūciju, Dānija kļuva par konstitucionālu monarhiju.",
                        "1950. — Rīgā tika nodibināts Rīgas Medicīnas institūts."};
                int random5 = ran.nextInt(jun5.length);
                text.setText("5. Jūnija notikums:\n" + jun5[random5]);
            });
            n6.setOnAction(event -> {
                String[] jun6 = {"1971. — PSRS palaists kosmosa kuģis Sojuz-11.",
                        "1984. — tika izdota viena no visu laiku veiksmīgākajām datorspēlēm Tetris.",
                        "2006. — islamisti pārņēma kontroli pār Somālijas galvaspilsētu Mogadīšo, tā beidzot militāristu \nvaldīšanu pilsētā."};
                int random6 = ran.nextInt(jun6.length);
                text.setText("6. Jūnija notikums:\n" + jun6[random6]);
            });
            n7.setOnAction(event -> {
                String[] jun7 = {"1905. — Norvēģijas parlaments anulēja savienību ar Zviedriju.",
                        "1942. — ASV uzvarēja Japānu Midveja kaujā.",
                        "1967. — Sešu dienu karš: Izraēlas spēki iegāja Jeruzalemē."};
                int random7 = ran.nextInt(jun7.length);
                text.setText("7. Jūnija notikums:\n" + jun7[random7]);
            });
            n8.setOnAction(event -> {
                String[] jun8 = {"1861. — Amerikas pilsoņu karš: Tenesī izstājās no Savienības.",
                        "1948. — Čeļabinskā-40 (tagad Ozjorska) iedarbināja pirmo PSRS rūpniecisko atomreaktoru.",
                        "1988. — PSRS pieņēma likumu \"Par kooperāciju PSRS\", kas legalizēja privāto uzņēmējdarbību."};
                int random8 = ran.nextInt(jun8.length);
                text.setText("8. Jūnija notikums:\n" + jun8[random8]);
            });
            n9.setOnAction(event -> {
                String[] jun9 = {"1846. — Hamiltonai, Kanādā, Ontārio štatā piešķirtas pilsētas tiesības.",
                        "1934. — Donalds Daks debitēja filmā The Wise Little Hen.",
                        "1999. — Kosovas karš: Dienvidslāvija noslēdza miera līgumu ar NATO."};
                int random9 = ran.nextInt(jun9.length);
                text.setText("9. Jūnija notikums:\n" + jun9[random9]);
            });
            n10.setOnAction(event -> {
                String[] jun10 = {"1376. — Vāclavs IV kļuva par Vācijas karali (formāli par Romas karali).",
                        "1967. — beidzās Sešu dienu karš: Izraēla un Sīrija piekrita uguns pārtraukšanai.",
                        "2003. — palaists NASA Marsa visurgājējs Mars Exploration Rover Spirit."};
                int random10 = ran.nextInt(jun10.length);
                text.setText("10. Jūnija notikums:\n" + jun10[random10]);
            });
            n11.setOnAction(event -> {
                String[] jun11 = {"1903. — nogalināts Serbijas karalis Aleksandrs Obrenovičs.",
                        "1964. — budistu mūks Thits Kuangs Diks pašaizdedzinājās Saigonā, protestējot pret reliģiskās \nbrīvības trūkumu Dienvidvjetnamā.",
                        "1999. — beidzās Kosovas karš."};
                int random11 = ran.nextInt(jun11.length);
                text.setText("11. Jūnija notikums:\n" + jun11[random11]);
            });
            n12.setOnAction(event -> {
                String[] jun12 = {"1901. — Kuba kļuva par ASV protektorātu.",
                        "1934. — Bulgārijā aizliedza politiskās partijas.",
                        "1898. — Filipīnas deklarēja neatkarību no Spānijas."};
                int random12 = ran.nextInt(jun12.length);
                text.setText("12. Jūnija notikums:\n" + jun12[random12]);
            });
            n13.setOnAction(event -> {
                String[] jun13 = {"1942. — Vācija pirmoreiz izmēģināja (neveiksmīgi) raķeti A4 (V-2).",
                        "1955. — PSRS (Jakutijā) atrada pirmo dimantu atradni.",
                        "1917. — Pirmais pasaules karš: Vācija veica pirmo lielāko Londonas bombardēšanu, 162 cilvēki \ngāja bojā, 432 ievainoti."};
                int random13 = ran.nextInt(jun13.length);
                text.setText("13. Jūnija notikums:\n" + jun13[random13]);
            });
            n14.setOnAction(event -> {
                String[] jun14 = {"1900. — Havajas kļuva par ASV teritoriju.",
                        "1940. — Otrais Pasaules karš: Vācijas karaspēks ieņēma Parīzi.",
                        "1941. — Igaunijā, Latvijā un Lietuvā tika veikta iedzīvotāju deportācija uz PSRS austrumu rajoniem."};
                int random14 = ran.nextInt(jun14.length);
                text.setText("14. Jūnija notikums:\n" + jun14[random14]);
            });
            n15.setOnAction(event -> {
                String[] jun15 = {"1808. — Žozefs I Napoleons kļuva par Spānijas karali.",
                        "1954. — dibināta Eiropas futbola asociāciju savienība UEFA.",
                        "1991. — Filipīnās izvirda Pinatubo; tas bija otrs lielākais 20. gadsimta vulkāna izvirdums, \nkurā bojā gāja vairāk kā 800 cilvēku."};
                int random15 = ran.nextInt(jun15.length);
                text.setText("15. Jūnija notikums:\n" + jun15[random15]);
            });
            n16.setOnAction(event -> {
                String[] jun16 = {"1779. — Spānija pasludināja karu pret Apvienoto Karalisti.",
                        "1846. — par Romas pāvestu kļuva Pijs IX, kas bija visu laiku visilgāk valdījušais ievēlētais \npāvests.",
                        "1963. — PSRS kosmosa programmas Vostok 6 misijas laikā kosmonaute Valentīna Tereškova kļuva \npar pirmo sievieti kosmosā."};
                int random16 = ran.nextInt(jun16.length);
                text.setText("16. Jūnija notikums:\n" + jun16[random16]);
            });
            n17.setOnAction(event -> {
                String[] jun17 = {
                        "1789. — Franču revolūcija: trešās kārtas pārstāvji pasludināja sevi par Nacionālo sapulci.",
                        "1944. — Islande pasludināja neatkarību no Dānijas un kļuva par republiku.",
                        "1999. — Vaira Vīķe-Freiberga tika ievēlēta par Latvijas Valsts prezidenti."};
                int random17 = ran.nextInt(jun17.length);
                text.setText("17. Jūnija notikums:\n" + jun17[random17]);
            });
            n18.setOnAction(event -> {
                String[] jun18 = {"1778. — ASV Neatkarības karš: Lielbritānijas kareivji pameta Filadelfiju.",
                        "1953. — Ēģipte pasludināta par republiku.",
                        "2009. — palaista NASA izpētes zonde Lunar Reconnaissance Orbiter (LRO)."};
                int random18 = ran.nextInt(jun18.length);
                text.setText("18. Jūnija notikums:\n" + jun18[random18]);
            });
            n19.setOnAction(event -> {
                String[] jun19 = {"1862. — ASV aizliegta verdzība.",
                        "1925. — pieņemts pašreizējais Igaunijas ģerbonis.",
                        "1961. — Kuveita deklarēja neatkarību no Apvienotās Karalistes."};
                int random19 = ran.nextInt(jun19.length);
                text.setText("19. Jūnija notikums:\n" + jun19[random19]);
            });
            n20.setOnAction(event -> {
                String[] jun20 = {"1840. — Semjuels Morze patentēja telegrāfu.",
                        "1863. — Rietumvirdžīnija kļuva par 35. ASV štatu",
                        "1993. — notika pirmais vilciena izmēģinājuma brauciens pa Lamanša tuneli."};
                int random20 = ran.nextInt(jun20.length);
                text.setText("20. Jūnija notikums:\n" + jun20[random20]);
            });
            n21.setOnAction(event -> {
                String[] jun21 = {"1788. — Ņūhempšīra kļuva par 9. ASV štatu.",
                        "1945. — Otrais pasaules karš: noslēdzās Okinavas kauja.",
                        "1934. — Turcijā atcēla Osmaņu impērijas titulus un goda vārdus, ieviešot uzvārdus."};
                int random21 = ran.nextInt(jun21.length);
                text.setText("21. Jūnija notikums:\n" + jun21[random21]);
            });
            n22.setOnAction(event -> {
                String[] jun22 = {
                        "1919. — Latvijas brīvības cīņas: Igaunijas armija kopā ar Ziemeļlatvijas brigādi Cēsu kaujās \nsakāva vācu spēkus.",
                        "1940. — Otrais pasaules karš: Francija Kompjēnā parakstīja kapitulāciju Vācijai.",
                        "1957. — PSRS pirmoreiz palaida vidējās darbības rādiusa ballistisko raķeti R-12."};
                int random22 = ran.nextInt(jun22.length);
                text.setText("22. Jūnija notikums:\n" + jun22[random22]);
            });
            n23.setOnAction(event -> {
                String[] jun23 = {
                        "1919. — Latvijas brīvības cīņas: Cēsu kaujas beidzās ar Igaunijas un Latvijas spēku uzvaru, \nieņemot Cēsis.",
                        "1990. — Moldova pasludināja neatkarību no Padomju Savienības.",
                        "1941. — Lietuvas Aktīvistu Fronte pasludināja Lietuvas neatkarību no Padomju Savienības, ko \npēc dažām nedēļām pārtrauca vācu okupācija."};
                int random23 = ran.nextInt(jun23.length);
                text.setText("23. Jūnija notikums:\n" + jun23[random23]);
            });
            n24.setOnAction(event -> {
                String[] jun24 = {"1793. — Francijā akceptēja pirmo republikānisko konstitūciju.",
                        "1880. — pirmoreiz izpildīja dziesmu O Canada, kas vēlāk kļuva par Kanādas himnu.",
                        "1983. — uz Zemes no kosmiskā lidojuma atgriezās pirmā amerikāniete kosmonaute Sallija Raida."};
                int random24 = ran.nextInt(jun24.length);
                text.setText("24. Jūnija notikums:\n" + jun24[random24]);
            });
            n25.setOnAction(event -> {
                String[] jun25 = {"1868. — Florida no jauna iestājās ASV.",
                        "1947. — izdeva grāmatu \"Annas Frankas dienasgrāmata\".",
                        "1993. — Lietuvā atjaunoja naudas vienību litu."};
                int random25 = ran.nextInt(jun25.length);
                text.setText("25. Jūnija notikums:\n" + jun25[random25]);
            });
            n26.setOnAction(event -> {
                String[] jun26 = {
                        "1940. — saskaņā ar Molotova-Rībentropa paktu PSRS iesniedza ultimātu Rumānijai, kurā pieprasīja \nBesarābijas un Ziemeļbukovinas teritoriju atdošanu.",
                        "1945. — parakstīja Apvienoto Nāciju Organizācijas Statūtus.",
                        "1991. — Desmitdienu karš: Dienvidslāvijas armija atstāja kazarmas un devās uz Slovēniju."};
                int random26 = ran.nextInt(jun26.length);
                text.setText("26. Jūnija notikums:\n" + jun26[random26]);
            });
            n27.setOnAction(event -> {
                String[] jun27 = {"1954. — Obņinskā, PSRS, atklāja pasaulē pirmo atomelektrostaciju.",
                        "1977. — Džibutija ieguva neatkarību no Francijas.",
                        "1993. — Microsoft izlaida pirmo operētājsistēmas Windows NT versiju Windows NT 3.1."};
                int random27 = ran.nextInt(jun27.length);
                text.setText("27. Jūnija notikums:\n" + jun27[random27]);
            });
            n28.setOnAction(event -> {
                String[] jun28 = {"1635. — Gvadelupa kļuva par Francijas koloniju.",
                        "1919. — Pirmais pasaules karš: Parīzē starp Sabiedrotajiem un Veimāras republiku (bijušo \nVācijas impēriju) parakstīts Versaļas līgums.",
                        "1950. — Korejas karš: Ziemeļkorejas karaspēks ieņēma Seulu."};
                int random28 = ran.nextInt(jun28.length);
                text.setText("28. Jūnija notikums:\n" + jun28[random28]);
            });
            n29.setOnAction(event -> {
                String[] jun29 = {"1880. — Francija anektēja Taiti.",
                        "2006. — sievietes pirmoreiz piedalījās Kuveitas parlamenta vēlēšanās.",
                        "1775. — atklāja Jelgavas akadēmisko ģimnāziju, vēlāko Academia Petrina."};
                int random29 = ran.nextInt(jun29.length);
                text.setText("29. Jūnija notikums:\n" + jun29[random29]);
            });
            n30.setOnAction(event -> {
                String[] jun30 = {
                        "1934. — Garo nažu nakts: Vācijā Ādolfa Hitlera vadītā nacistu partija izrēķinājās ar \npolitiskajiem pretiniekiem.",
                        "1972. — pirmoreiz UTC laika sistēmai pievienoja vienu lieku sekundi, lai saskaņotu to ar \nZemes rotācijas izmaiņām.",
                        "1997. — Apvienotā Karaliste nodeva Honkongas pārvaldību Ķīnai."};
                int random30 = ran.nextInt(jun30.length);
                text.setText("30. Jūnija notikums:\n" + jun30[random30]);
            });
        });

        //Jūlijs
        jul.setOnAction(e -> {
            n30.setVisible(true);
            n31.setVisible(true);
            n1.setOnAction(event -> {
                String[] jul1 = {"1921. — dibināta Ķīnas Komunistiskā partija.",
                        "1957. — sākās Starptautiskais ģeofizikas gads.",
                        "2002. — dibināta Starptautiskā krimināltiesa, kas ļautu personām ierosināt lietas genocīda, \nnoziegumu pret cilvēci, kara noziegumu un agresijas gadījumos."};
                int random1 = ran.nextInt(jul1.length);
                text.setText("1. Jūlija notikums:\n" + jul1[random1]);
            });
            n2.setOnAction(event -> {
                String[] jul2 = {"1777. — Vērmonta kļuva par pirmo ASV štatu, kurā atcēla verdzību.",
                        "1853. — Krievijas impērijas armija iebruka Osmaņu impērijā, sākot Krimas karu.",
                        "1900. — Vācijā virs Bodenezera notika pirmais cepelīna lidojums."};
                int random2 = ran.nextInt(jul2.length);
                text.setText("2. Jūlija notikums:\n" + jul2[random2]);
            });
            n3.setOnAction(event -> {
                String[] jul3 = {"1608. — dibināta Kvebekas pilsēta Kanādā.",
                        "1998. — Japānā palaista Marsa zonde Nozomi.",
                        "1962. — Alžīrijas neatkarības karš beidzās, Francijas prezidentam Šarlam de Gollam pasludinot \nAlžīrijas neatkarību."};
                int random3 = ran.nextInt(jul3.length);
                text.setText("3. Jūlija notikums:\n" + jul3[random3]);
            });
            n4.setOnAction(event -> {
                String[] jul4 = {"1776. — Filadelfijā pieņemta ASV Neatkarības deklarācija.",
                        "1810. — franči okupēja Amsterdamu.",
                        "1941. — Vācijas okupētajā Latvijā nodedzināja Rīgas sinagogas, kas bija daļa no holokausta Latvijā."};
                int random4 = ran.nextInt(jul4.length);
                text.setText("4. Jūlija notikums:\n" + jul4[random4]);
            });
            n5.setOnAction(event -> {
                String[] jul5 = {"1811. — Venecuēla deklarēja neatkarību no Spānijas.",
                        "1962. — Alžīrija ieguva neatkarību no Francijas.",
                        "1996. — pirmais sekmīgi klonētais zīdītājs aita Dollija (attēlā) piedzima Rozlinas institūtā \nSkotijā."};
                int random5 = ran.nextInt(jul5.length);
                text.setText("5. Jūlija notikums:\n" + jul5[random5]);
            });
            n6.setOnAction(event -> {
                String[] jul6 = {"1253. — Mindaugs kronēts par Lietuvas karali.",
                        "1785. — ASV ieviesta naudas vienība dolārs.",
                        "1919. — Latvijas brīvības cīņas: Rīgā ienāca Ziemeļlatvijas brigāde Jorģa Zemitāna vadībā."};
                int random6 = ran.nextInt(jul6.length);
                text.setText("6. Jūlija notikums:\n" + jul6[random6]);
            });
            n7.setOnAction(event -> {
                String[] jul7 = {"1941. — ASV okupēja Īslandi, lai ierīkotu atbalsta punktu cīņai pret Vāciju.",
                        "2003. — ASV palaists otrs Marsa visurgājējs Opportunity.",
                        "2005. — Londonā notika četri bumbu sprādzieni (3 metro un 1 autobusā), nogalinot 56 cilvēkus \nun vairāk par 700 ievainojot."};
                int random7 = ran.nextInt(jul7.length);
                text.setText("7. Jūlija notikums:\n" + jul7[random7]);
            });
            n8.setOnAction(event -> {
                String[] jul8 = {"1997. — NATO uzaicināja Čehiju, Poliju un Ungāriju pievienoties aliansei 1999. gadā.",
                        "1994. — pēc Kima Irsena nāves viņa dēls Kims Čenirs kļuva par Ziemeļkorejas augstāko vadītāju.",
                        "1919. — Kārļa Ulmaņa vadītā Latvijas Pagaidu valdība ar kuģi Saratov atgriezās Rīgā."};
                int random8 = ran.nextInt(jul8.length);
                text.setText("8. Jūlija notikums:\n" + jul8[random8]);
            });
            n9.setOnAction(event -> {
                String[] jul9 = {"2002. — dibināja Āfrikas Savienību.",
                        "1877. — sākās pirmais Vimbldonas čempionāts tenisā.",
                        "1850. — pēc Zekerija Teilora nāves par ASV prezidentu kļuva Milards Filmors. "};
                int random9 = ran.nextInt(jul9.length);
                text.setText("9. Jūlija notikums:\n" + jul9[random9]);
            });
            n10.setOnAction(event -> {
                String[] jul10 = {"1988. — Arkādijas parkā, Rīgā, lika pamatus Latvijas Nacionālās neatkarības kustībai.",
                        "1986. — Liepājā nodibināja Latvijas cilvēktiesību aizsardzības grupu Helsinki-86.",
                        "1940. — Otrais pasaules karš: izveidoja Višī Francijas valdību."};
                int random10 = ran.nextInt(jul10.length);
                text.setText("10. Jūlija notikums:\n" + jul10[random10]);
            });
            n11.setOnAction(event -> {
                String[] jul11 = {"1776. — kapteinis Džeimss Kuks uzsāka trešo (pēdējo) ceļojumu.",
                        "1955. — frāze \"Mēs paļaujamies uz Dievu\" (In God We Trust) iekļauta visās ASV naudas vienībās.",
                        "1995. — Bosnijas karā Serbu Republikas kaujinieki ieņēma Srebrenicu, kad ANO miera nodrošinātāji \nto atstāja; Srebrenicas slaktiņā\n serbi nogalināja vairāk nekā 8000 musulmaņu vīriešu un zēnu."};
                int random11 = ran.nextInt(jul11.length);
                text.setText("11. Jūlija notikums:\n" + jul11[random11]);
            });
            n12.setOnAction(event -> {
                String[] jul12 = {"1312. — par Ungārijas karali kļuva Kārols I Anžū.",
                        "1979. — Kiribati ieguva neatkarību no Apvienotās Karalistes.",
                        "1920. — Maskavā noslēgts Padomju Krievijas—Lietuvas miera līgums."};
                int random12 = ran.nextInt(jul12.length);
                text.setText("12. Jūlija notikums:\n" + jul12[random12]);
            });
            n13.setOnAction(event -> {
                String[] jul13 = {
                        "1995. — notika Live Aid labdarības koncerts, lai vāktu līdzekļus, ar kuriem cīnīties pret \nbadu Etiopijā.",
                        "1908. — pirmoreiz olimpiskajās spēlēs piedalījās sievietes.",
                        "1821. — pieņēma pašreizējo Norvēģijas karogu."};
                int random13 = ran.nextInt(jul13.length);
                text.setText("13. Jūlija notikums:\n" + jul13[random13]);
            });
            n14.setOnAction(event -> {
                String[] jul14 = {"1985. — Šengenā, Luksemburgā, parakstīja Šengenas vienošanos.",
                        "1789. — Franču revolūcija: tauta ieņēma valsts cietumu Bastīliju.",
                        "1700. — Krievu-turku karš: parakstīts Konstantinopoles līgums starp Krievijas impēriju un \nOsmaņu impēriju."};
                int random14 = ran.nextInt(jul14.length);
                text.setText("14. Jūlija notikums:\n" + jul14[random14]);
            });
            n15.setOnAction(event -> {
                String[] jul15 = {"1099. — Pirmais Krusta karš: krustneši ieņēma Jeruzalemi.",
                        "1799. — Ēģiptē atrasts Rozetas akmens.",
                        "1959. — notika tērauda lietuvju strādnieku streiks ASV."};
                int random15 = ran.nextInt(jul15.length);
                text.setText("15. Jūlija notikums:\n" + jul15[random15]);
            });
            n16.setOnAction(event -> {
                String[] jul16 = {"1705. — Lielais Ziemeļu karš: Mūrmuižas kaujā zviedri sakāva Krievijas karaspēku.",
                        "1769. — dibināja Sandjego, ASV.",
                        "1921. — Satversmes sapulce apstiprināja Latvijas ģerboni."};
                int random16 = ran.nextInt(jul16.length);
                text.setText("16. Jūlija notikums:\n" + jul16[random16]);
            });
            n17.setOnAction(event -> {
                String[] jul17 = {"1936. — Spānijā sākās pilsoņu karš.",
                        "1962. — lidmašīna X-15, kuru pilotēja Roberts Vaits, pirmoreiz pārsniedza 50 km augstumu, kas \nASV ir pieņemta par kosmosa robežu.",
                        "2014. — Ukrainā virs separātistu kontrolētās teritorijas ar raķeti notriekta Malaysia Airlines \nlidmašīna reisā 17, bojā iet 298 cilvēki."};
                int random17 = ran.nextInt(jul17.length);
                text.setText("17. Jūlija notikums:\n" + jul17[random17]);
            });
            n18.setOnAction(event -> {
                String[] jul18 = {"1968. — dibināta kompānija Intel Corporation.",
                        "1965. — PSRS palaista starpplanētu zonde Zond-3.",
                        "1955. — apmeklētājiem tiek atvērta Disnejlenda Anahaimā, Kalifornijā."};
                int random18 = ran.nextInt(jul18.length);
                text.setText("18. Jūlija notikums:\n" + jul18[random18]);
            });
            n19.setOnAction(event -> {
                String[] jul19 = {"1900. — Parīzē atklāja pirmo metro līniju.",
                        "1903. — Moriss Garēns uzvarēja pirmajā Tour de France velobraucienā.",
                        "1903. — Moriss Garēns uzvarēja pirmajā Tour de France velobraucienā."};
                int random19 = ran.nextInt(jul19.length);
                text.setText("19. Jūlija notikums:\n" + jul19[random19]);
            });
            n20.setOnAction(event -> {
                String[] jul20 = {"1871. — Britu Kolumbija pievienojās Kanādas konfederācijai.",
                        "1969. — Apollo programma: Apollo 11 veica pirmo pilotējamo nolaišanos uz Mēness (20:17 UTC).",
                        "1960. — Rīgā atklāja jauno dzelzceļa staciju."};
                int random20 = ran.nextInt(jul20.length);
                text.setText("20. Jūlija notikums:\n" + jul20[random20]);
            });
            n21.setOnAction(event -> {
                String[] jul21 = {"1831. — Beļģija ieguva neatkarību no Nīderlandes.",
                        "1973. — PSRS palaida Marsa zondi Mars-4.",
                        "1954. — Ženēvas konferencē Vjetnamu sadalīja Ziemeļvjetnamā un Dienvidvjetnamā."};
                int random21 = ran.nextInt(jul21.length);
                text.setText("21. Jūlija notikums:\n" + jul21[random21]);
            });
            n22.setOnAction(event -> {
                String[] jul22 = {
                        "2011. — Norvēģijā Annešs Bērings Breivīks uzbrukumā civiliedzīvotājiem nogalināja 77 cilvēkus.",
                        "1962. — Mariner programma: Venēras zondi Mariner 1 iznīcināja drīz pēc starta nesējraķetes \navārijas dēļ.",
                        "1298. — Skotijas neatkarības kari: Folkērkas kaujā angļu spēki Edvarda I vadībā uzveica skotus \nViljama Vollesa vadībā."};
                int random22 = ran.nextInt(jul22.length);
                text.setText("22. Jūlija notikums:\n" + jul22[random22]);
            });
            n23.setOnAction(event -> {
                String[] jul23 = {"1992. — Abhāzija pasludināja neatkarību no Gruzijas.",
                        "1962. — veica pasaulē pirmo televīzijas signāla retranslāciju caur pavadoni (Telstar).",
                        "1914. — Pirmā pasaules kara sākums: Austroungārija izvirzīja ultimātu Serbijai, pieprasot \nļaut atrast kroņprinča Franča Ferdinanda slepkavu."};
                int random23 = ran.nextInt(jul23.length);
                text.setText("23. Jūlija notikums:\n" + jul23[random23]);
            });
            n24.setOnAction(event -> {
                String[] jul24 = {"1985. — Commodore izlaida personālo datoru Amiga.",
                        "1923. — Šveicē noslēdza Lozannas miera līgumu, kas noteica jaunu Anatolijas teritoriju \nsadalīšanu un izbeidza Turcijas neatkarības karu.",
                        "1198. — kaujā pret līviem pie Rīgas kalna krita Ikšķiles bīskaps Bertolds."};
                int random24 = ran.nextInt(jul24.length);
                text.setText("24. Jūlija notikums:\n" + jul24[random24]);
            });
            n25.setOnAction(event -> {
                String[] jul25 = {"1567. — dibināja Venecuēlas galvaspilsētu Karakasu.",
                        "1907. — Koreja kļuva par Japānas protektorātu.",
                        "1946. — ASV veica atombumbas zemūdens sprādzienu Bikini atolā."};
                int random25 = ran.nextInt(jul25.length);
                text.setText("25. Jūlija notikums:\n" + jul25[random25]);
            });
            n26.setOnAction(event -> {
                String[] jul26 = {"1847. — Libērija pasludināja neatkarību no ASV.",
                        "1956. — Ēģiptes prezidents Gamāls Abdels Nāsers pasludināja Suecas kanāla nacionalizāciju.",
                        "1960. — Malagasu Republika ieguva pilnu neatkarību no Francijas."};
                int random26 = ran.nextInt(jul26.length);
                text.setText("26. Jūlija notikums:\n" + jul26[random26]);
            });
            n27.setOnAction(event -> {
                String[] jul27 = {"1953. — beidzās Korejas karš, ASV, Ziemeļkorejai un Ķīnai noslēdzot pamieru.",
                        "1955. — Austrija ieguva neatkarību no Sabiedrotajiem pēc Otrā pasaules kara.",
                        "1990. — Baltkrievija pasludināja neatkarību no PSRS."};
                int random27 = ran.nextInt(jul27.length);
                text.setText("27. Jūlija notikums:\n" + jul27[random27]);
            });
            n28.setOnAction(event -> {
                String[] jul28 = {"1821. — Peru deklarēja neatkarību no Spānijas.",
                        "1896. — dibināta Maiami.",
                        "1957. — Maskavā sākās 6. Pasaules studentu un jaunatnes festivāls, pirmoreiz plašāk atverot \nPSRS ārvalstniekiem."};
                int random28 = ran.nextInt(jul28.length);
                text.setText("28. Jūlija notikums:\n" + jul28[random28]);
            });
            n29.setOnAction(event -> {
                String[] jul29 = {"1957. — dibināta Starptautiskā Atomenerģijas aģentūra.",
                        "1958. — ASV prezidents Dvaits Eizenhauers parakstīja \"Nacionālo aeronautikas un kosmosa aktu\", \nkas bija par pamatu NASA dibināšanai.",
                        "1921. — Ādolfs Hitlers kļuva par Nacionālsociālistiskās vācu strādnieku partijas vadītāju."};
                int random29 = ran.nextInt(jul29.length);
                text.setText("29. Jūlija notikums:\n" + jul29[random29]);
            });
            n30.setOnAction(event -> {
                String[] jul30 = {"1629. — zemestrīcē Itālijas pilsētā Neapolē gāja bojā aptuveni 10 000 cilvēku.",
                        "1729. — dibināta Baltimoras pilsēta Mērilendas štatā, ASV.",
                        "1980. — Vanuatu ieguva neatkarību no Apvienotās Karalistes un Francijas."};
                int random30 = ran.nextInt(jul30.length);
                text.setText("30. Jūlija notikums:\n" + jul30[random30]);
            });
            n31.setOnAction(event -> {
                String[] jul31 = {"1914. — Pirmais pasaules karš: Krievijā uzsākta mobilizācija, vēl neesot karastāvoklī.",
                        "1932. — Vācijas parlamenta vēlēšanās NSDAP uzvarēja ar 38% balsu.",
                        "1991. — PSRS OMON grupa uzbruka Lietuvas muitas punktam Medininkos, nogalinot 7 muitniekus."};
                int random31 = ran.nextInt(jul31.length);
                text.setText("31. Jūlija notikums:\n" + jul31[random31]);
            });
        });

        //Augusts
        aug.setOnAction(e -> {
            n30.setVisible(true);
            n31.setVisible(true);
            n1.setOnAction(event -> {
                String[] aug1 = {"1291. — dibināta Šveices Konfederācija.",
                        "1902. — ASV nopirka tiesības uz Panamas kanālu no Francijas.",
                        "1922. — Lietuvas Republikā pieņēma pirmo konstitūciju."};
                int random1 = ran.nextInt(aug1.length);
                text.setText("1. Augusta notikums:\n" + aug1[random1]);
            });
            n2.setOnAction(event -> {
                String[] aug2 = {"1934. — Ādolfs Hitlers kļuva par Vācijas fīreru.",
                        "1945. — noslēdzās Potsdamas konference, kas Eiropas robežas pēc Otrā pasaules kara.",
                        "1990. — Līča karš: Irāka iebruka Kuveitā."};
                int random2 = ran.nextInt(aug2.length);
                text.setText("2. Augusta notikums:\n" + aug2[random2]);
            });
            n3.setOnAction(event -> {
                String[] aug3 = {"1914. — Pirmais pasaules karš: Vācija pieteica karu Francijai.",
                        "1940. — Lietuvas PSR tika uzņemta PSRS.",
                        "2004. — ASV palaista Merkura zonde MESSENGER."};
                int random3 = ran.nextInt(aug3.length);
                text.setText("3. Augusta notikums:\n" + aug3[random3]);
            });
            n4.setOnAction(event -> {
                String[] aug4 = {
                        "1995. — Horvātijas bruņotie spēki sadarbībā ar Bosnijas un Hercegovinas armiju sāka operāciju\n \"Vētra\" (Operacija Oluja) pret serbu spēkiem.",
                        "1993. — beidzās Ruandas pilsoņu karš.",
                        "1914. — Pirmais pasaules karš: Vācija iebruka neitrālajā Beļģijā, un Apvienotā Karaliste \npieteica karu Vācijai."};
                int random4 = ran.nextInt(aug4.length);
                text.setText("4. Augusta notikums:\n" + aug4[random4]);
            });
            n5.setOnAction(event -> {
                String[] aug5 = {"1772. — sākās pirmā Polijas dalīšana.",
                        "1969. — Mariner 7 veica Marsa pārlidojumu (3524 km no planētas virsmas).",
                        "1973. — PSRS palaida Marsa zondi Mars-6."};
                int random5 = ran.nextInt(aug5.length);
                text.setText("5. Augusta notikums:\n" + aug5[random5]);
            });
            n6.setOnAction(event -> {
                String[] aug6 = {"1890. — ASV pirmo reizi tika izpildīts nāvessods uz elektriskā krēsla.",
                        "1932. — notika pirmais Venēcijas kinofestivāls.",
                        "1806. — Svētās Romas pēdējais imperators Francis II dibināja Austrijas impēriju, likvidējot \nSvētās Romas impēriju."};
                int random6 = ran.nextInt(aug6.length);
                text.setText("6. Augusta notikums:\n" + aug6[random6]);
            });
            n7.setOnAction(event -> {
                String[] aug7 = {"2006. — tika atklāta komēta C/2006 P1.",
                        "1976. — ASV zonde Viking 2 iegāja orbītā ap Marsu.",
                        "1955. — Tokijas Komunikāciju rūpniecības uzņēmums (tagad zināms kā Sony) pārdeva savus pirmos \nradioaparātus."};
                int random7 = ran.nextInt(aug7.length);
                text.setText("7. Augusta notikums:\n" + aug7[random7]);
            });
            n8.setOnAction(event -> {
                String[] aug8 = {"1967. — Filipīnas, Indonēzija, Malaizija, Singapūra un Taizeme dibināja ASEAN.",
                        "1945. — Otrais pasaules karš: PSRS pieteica karu Japānai, sākot iebrukumu Mandžūrijā.",
                        "1919. — Apvienotā Karaliste un Afganistāna noslēdza Rāvalpindi miera līgumu."};
                int random8 = ran.nextInt(aug8.length);
                text.setText("8. Augusta notikums:\n" + aug8[random8]);
            });
            n9.setOnAction(event -> {
                String[] aug9 = {"1704. — Lielais Ziemeļu karš: krievu armija ieņēma Narvas cietoksni.",
                        "1810. — Napoleona Bonaparta vadītā Pirmā Franču impērija anektēja Vestfālenu.",
                        "1973. — PSRS palaida Marsa zondi Mars-7."};
                int random9 = ran.nextInt(aug9.length);
                text.setText("9. Augusta notikums:\n" + aug9[random9]);
            });
            n10.setOnAction(event -> {
                String[] aug10 = {"1990. — Magellan zonde sasniedza Veneru.",
                        "1920. — Pirmais pasaules karš: Sabiedrotie un Osmaņu impērija noslēdza Sevras līgumu.",
                        "1675. — lika Karaliskās Griničas observatorijas pamatakmeni."};
                int random10 = ran.nextInt(aug10.length);
                text.setText("10. Augusta notikums:\n" + aug10[random10]);
            });
            n11.setOnAction(event -> {
                String[] aug11 = {"1804. — Francis II Hābsburgs kļuva par Austrijas imperatoru.",
                        "1919. — Vācijā pieņēma Veimāras konstitūciju.",
                        "1960. — Čada ieguva neatkarību no Francijas."};
                int random11 = ran.nextInt(aug11.length);
                text.setText("11. Augusta notikums:\n" + aug11[random11]);
            });
            n12.setOnAction(event -> {
                String[] aug12 = {
                        "2000. — Krievijas atomzemūdene K-141 Kursk nogrima Barenca jūrā, bojā gāja 118 apkalpes locekļi.",
                        "1985. — Japānā nogāzās Japan Airlines lidmašīna, bojā gāja 520 cilvēki; visu laiku traģiskākā \nvienas lidmašīnas katastrofa.",
                        "1960. — palaida pirmo sakaru pavadoni Echo 1."};
                int random12 = ran.nextInt(aug12.length);
                text.setText("12. Augusta notikums:\n" + aug12[random12]);
            });
            n13.setOnAction(event -> {
                String[] aug13 = {
                        "1521. — spāņi ieņēma Tenočtitlānu, sagūstīja valdnieku Kuautemoku un viņa augstākos padomdevējus.",
                        "1918. — pirmās sievietes pievienojās ASV Jūras kājnieku korpusam.",
                        "1960. — Centrālāfrikas Republika ieguva neatkarību no Francijas."};
                int random13 = ran.nextInt(aug13.length);
                text.setText("13. Augusta notikums:\n" + aug13[random13]);
            });
            n14.setOnAction(event -> {
                String[] aug14 = {
                        "1385. — Lietuvas lielkņaziste noslēdza Krēvas ūniju ar Polijas karalisti par dinastiju savienību.",
                        "1912. — ASV jūras kājnieki iebruka Nikaragvā, lai atbalstītu ASV simpatizējošu valdību.",
                        "2008. — Gruzija izstājas no Neatkarīgo Valstu Sadraudzības."};
                int random14 = ran.nextInt(aug14.length);
                text.setText("14. Augusta notikums:\n" + aug14[random14]);
            });
            n15.setOnAction(event -> {
                String[] aug15 = {"1948. — uz dienvidiem no 38. ziemeļu paralēles dibināta Korejas Republika.",
                        "1947. — Indija ieguva neatkarību no Apvienotās Karalistes, paliekot Nāciju Sadraudzībā.",
                        "1945. — Otrais pasaules karš: pēc Japānas kapitulācijas tika atbrīvota Koreja."};
                int random15 = ran.nextInt(aug15.length);
                text.setText("15. Augusta notikums:\n" + aug15[random15]);
            });
            n16.setOnAction(event -> {
                String[] aug16 = {"1954. — iznāca laikraksta Sports Illustrated pirmais numurs.",
                        "1960. — Kipra ieguva neatkarību no Apvienotās Karalistes.",
                        "2010. — Ķīna apsteidza Japānu, kļūstot par Pasaules otro lielāko ekonomiku."};
                int random16 = ran.nextInt(aug16.length);
                text.setText("16. Augusta notikums:\n" + aug16[random16]);
            });
            n17.setOnAction(event -> {
                String[] aug17 = {"1999. — Turcijas pilsētu Izmitu skāra 7,4 ballu stiprā Izmitas zemestrīce.",
                        "1982. — Vācijā tika publiski izlaists pirmais kompaktdisks (CD).",
                        "1903. — Džozefs Pulicers nodibināja Pulicera balvu."};
                int random17 = ran.nextInt(aug17.length);
                text.setText("17. Augusta notikums:\n" + aug17[random17]);
            });
            n18.setOnAction(event -> {
                String[] aug18 = {
                        "1990. — gatavojoties valsts apvērsumam, PSRS prezidentam Mihailam Gorbačovam tika piemērots \nmājas arests.",
                        "1968. — Varšavas līguma valstu vadība piekrita karaspēka ievešanai Čehoslovākijā.",
                        "1877. — Asafs Hols atklāja Marsa dabisko pavadoni Fobosu."};
                int random18 = ran.nextInt(aug18.length);
                text.setText("18. Augusta notikums:\n" + aug18[random18]);
            });
            n19.setOnAction(event -> {
                String[] aug19 = {"1953. — CIP palīdzēja gāzt Irānas valdību un atjaunot šaha varu.",
                        "1919. — Afganistāna ieguva neatkarību no Apvienotās Karalistes.",
                        "1903. — notika šķelšanās sestajā cionistu kongresā Bāzelē, apspriežot priekšlikumu dibināt \nebreju valsti Ugandā."};
                int random19 = ran.nextInt(aug19.length);
                text.setText("19. Augusta notikums:\n" + aug19[random19]);
            });
            n20.setOnAction(event -> {
                String[] aug20 = {"1896. — tika patentēts telefons ar ciparu ripu.",
                        "1991. — reaģējot uz uzsākto valsts apvērsuma mēģinājumu Maskavā Igaunija deklarēja neatkarību \nno Padomju Savienības.",
                        "1914. — Pirmā pasaules kara laikā Vācijas spēki ieņēma Briseli."};
                int random20 = ran.nextInt(aug20.length);
                text.setText("20. Augusta notikums:\n" + aug20[random20]);
            });
            n21.setOnAction(event -> {
                String[] aug21 = {"1959. — Havajas kļuva par ASV 50. štatu.",
                        "1986. — no Ņosa ezera Kamerūnā pēkšņi izdalījās 1,6 miljoni tonnu ogļskābās gāzes, 20 km \nrādiusā izraisot ap 1800 cilvēku nāvi.",
                        "1993. — NASA zaudēja kontaktu ar Marsa zondi Mars Observer trīs dienas pirms ieiešanas \nplanētas orbītā."};
                int random21 = ran.nextInt(aug21.length);
                text.setText("21. Augusta notikums:\n" + aug21[random21]);
            });
            n22.setOnAction(event -> {
                String[] aug22 = {"1848. — ASV anektēja Ņūmeksiku.",
                        "1864. — 16 Eiropas valstis parakstīja pirmo Ženēvas konvenciju.",
                        "1932. — BBC sāka eksperimentālās televīzijas pārraides."};
                int random22 = ran.nextInt(aug22.length);
                text.setText("22. Augusta notikums:\n" + aug22[random22]);
            });
            n23.setOnAction(event -> {
                String[] aug23 = {"1770. — angļu kapteinis Džeimss Kuks pasludināja Austrāliju par Anglijas īpašumu.",
                        "1984. — Jeļenai Bonnerei (disidenta fiziķa Andreja Saharova sievai) tika piespriesti pieci \ngadi izsūtījumā.",
                        "1839. — Apvienotā Karaliste ieņēma Honkongu, gatavojoties karam pret Ķīnu."};
                int random23 = ran.nextInt(aug23.length);
                text.setText("23. Augusta notikums:\n" + aug23[random23]);
            });
            n24.setOnAction(event -> {
                String[] aug24 = {"1949. — stājās spēkā līgums par NATO izveidi.",
                        "1991. — Rīgā sākta Ļeņina pieminekļa demontāža.",
                        "1995. — Microsoft izlaida operētājsistēmu Windows 95."};
                int random24 = ran.nextInt(aug24.length);
                text.setText("24. Augusta notikums:\n" + aug24[random24]);
            });
            n25.setOnAction(event -> {
                String[] aug25 = {"1515. — dibināta Kubas galvaspilsēta Havana.",
                        "1817. — Vidzemē sāka atcelt dzimtbūšanu.",
                        "1944. — Otrā pasaules kara laikā Sabiedrotie atbrīvoja Parīzi."};
                int random25 = ran.nextInt(aug25.length);
                text.setText("25. Augusta notikums:\n" + aug25[random25]);
            });
            n26.setOnAction(event -> {
                String[] aug26 = {"1921. — Vācijā inflācijas dēļ notika nemieri Minhenē.",
                        "1883. — sākās viens no visu laiku spēcīgākajiem vulkāna izvirdumiem Krakatau.",
                        "1702. — Lielā Ziemeļu kara laikā Krievijas karaspēks ieņēma Alūksnes cietoksni."};
                int random26 = ran.nextInt(aug26.length);
                text.setText("26. Augusta notikums:\n" + aug26[random26]);
            });
            n27.setOnAction(event -> {
                String[] aug27 = {"1793. — dibināta Toronto pilsēta Kanādā.",
                        "1991. — Moldova deklarēja neatkarību no PSRS.",
                        "1916. — Pirmā pasaules kara laikā Rumānija pieteica karu Austroungārijai."};
                int random27 = ran.nextInt(aug27.length);
                text.setText("27. Augusta notikums:\n" + aug27[random27]);
            });
            n28.setOnAction(event -> {
                String[] aug28 = {"1867. — ASV okupēja Midveja salas.",
                        "1916. — Pirmā pasaules kara laikā Itālija pieteica karu Vācijai.",
                        "1988. — Ramšteinas katastrofa: ASV gaisa spēku bāzē Ramšteinā Vācijā aviošova laikā sadūrās \ntrīs lidmašīnas, kā rezultātā gāja bojā 70 cilvēki un vairāk nekā 300 ievainoti."};
                int random28 = ran.nextInt(aug28.length);
                text.setText("28. Augusta notikums:\n" + aug28[random28]);
            });
            n29.setOnAction(event -> {
                String[] aug29 = {"1982. — Vācijā pirmoreiz sintezēts ķīmiskais elements meitnerijs (atomskaitlis 109).",
                        "1966. — The Beatles Sanfrancisko izpildīja savu pēdējo koncertu.",
                        "1886. — Gotlībs Daimlers patentēja motociklu."};
                int random29 = ran.nextInt(aug29.length);
                text.setText("29. Augusta notikums:\n" + aug29[random29]);
            });
            n30.setOnAction(event -> {
                String[] aug30 = {"1945. — Lielbritānijas bruņotie spēki atbrīvoja Honkongu no Japānas okupācijas.",
                        "1991. — Azerbaidžāna deklarēja neatkarību no PSRS.",
                        "1999. — Austrumtimorā iedzīvotāji atbalstīja neatkarību no Indonēzijas."};
                int random30 = ran.nextInt(aug30.length);
                text.setText("30. Augusta notikums:\n" + aug30[random30]);
            });
            n31.setOnAction(event -> {
                String[] aug31 = {
                        "1910. — Zasulauka stacijā Rīgā vilciens nāvīgi notrieca latviešu komponistu Emīlu Dārziņu.",
                        "1935. — PSRS ogļracis Aleksejs Stahanovs uzstādīja rekordu, maiņā iegūdams 104 t akmeņogļu.",
                        "1994. — no Latvijas un Igaunijas tika izvesta Krievijas armija (Latvijā turpināja darboties \ntikai Skrundas lokators)."};
                int random31 = ran.nextInt(aug31.length);
                text.setText("31. Augusta notikums:\n" + aug31[random31]);
            });
        });

        // Septembris
        sep.setOnAction(e -> {
            n30.setVisible(true);
            n31.setVisible(false);
            n1.setOnAction(event -> {
                String[] sep1 = {"2006. — Luksemburga kļuva par pirmo valsti, kas pilnībā pārgājusi uz digitālās televīzijas virszemes apraidi.",
                        "1985. — ASV un Francijas kopīgā ekspedīcijā tika atrasts nogrimušais Titānika vraks.",
                        "1923. — Japānā spēcīga zemestrīce nopostīja Tokijas un Jokohamas pilsētu; bojā gāja aptuveni \n140 000 cilvēku."};
                int random1 = ran.nextInt(sep1.length);
                text.setText("1. Septembra notikums:\n" + sep1[random1]);
            });
            n2.setOnAction(event -> {
                String[] sep2 = {"1945. — Otrais pasaules karš beidzās ar Japānas padošanos.",
                        "1967. — Sīlendas Hercogiste pasludināja neatkarību no Apvienotās Karalistes.",
                        "2004. — Veimārā, Vācijas seno grāmatu krātuvē, hercogienes Annas Amālijas bibliotēkā izcēlās \nugunsgrēks, kas iznīcināja aptuveni 50 000 sējumu."};
                int random2 = ran.nextInt(sep2.length);
                text.setText("2. Septembra notikums:\n" + sep2[random2]);
            });
            n3.setOnAction(event -> {
                String[] sep3 = {"1791. — beidza pastāvēt Francijas karaliste.",
                        "1917. — Pirmais pasaules karš: Vācijas spēki ieņēma Rīgu.",
                        "1994. — Krievija un Ķīna parakstīja vienošanos, pēc kuras raķetes vairs netika notēmētas uz \npretējo valstu mērķiem."};
                int random3 = ran.nextInt(sep3.length);
                text.setText("3. Septembra notikums:\n" + sep3[random3]);
            });
            n4.setOnAction(event -> {
                String[] sep4 = {
                        "1774. — otrajā kapteiņa Džeimsa Kuka ceļojumā Jaunkaledoniju pirmoreiz apmeklēja eiropieši.",
                        "1998. — divi Stenforda Universitātes studenti, Lerijs Peidžs un Sergejs Brins, dibināja \nkompāniju Google.",
                        "1923. — Leikherstā, Ņūdžersijas štatā gaisā pacēlās pirmais ASV būvētais dirižablis."};
                int random4 = ran.nextInt(sep4.length);
                text.setText("4. Septembra notikums:\n" + sep4[random4]);
            });
            n5.setOnAction(event -> {
                String[] sep5 = {"1725. — Francijas karalis Luijs XV apprecējās ar Mariju Leščiņsku.",
                        "1944. — Beļģija, Nīderlande un Luksemburga izveidoja Beniluksu.",
                        "1936. — tika dots starts pirmajam Latvijas riteņbraucēju vienības braucienam, kurš noslēdzās \nar finišu Rīgā nākamajā dienā."};
                int random5 = ran.nextInt(sep5.length);
                text.setText("5. Septembra notikums:\n" + sep5[random5]);
            });
            n6.setOnAction(event -> {
                String[] sep6 = {
                        "1803. — angļu zinātnieks Džons Daltons sāka izmantot simbolus, lai attēlotu dažādu elementu \natomus.",
                        "1955. — Stambulā, Turcijā, notika turku rīkoti grautiņi pret grieķu un armēņu minoritāti.",
                        "1975. — 6,7 ballu stipra zemestrīce satricināja Turciju; bojā gāja 2085 cilvēki."};
                int random6 = ran.nextInt(sep6.length);
                text.setText("6. Septembra notikums:\n" + sep6[random6]);
            });
            n7.setOnAction(event -> {
                String[] sep7 = {"1822. — Brazīlija deklarēja neatkarību no Portugāles.",
                        "1940. — Otrais pasaules karš: Vācija sāka Londonas bombardēšanu.",
                        "2011. — lidmašīnas avārijā Krievijā bojā gāja 43 cilvēki, ieskaitot gandrīz visu Jaroslavļas \n\"Lokomotiv\" hokeja komandu, arī latviešu hokejists Kārlis Skrastiņš."};
                int random7 = ran.nextInt(sep7.length);
                text.setText("7. Septembra notikums:\n" + sep7[random7]);
            });
            n8.setOnAction(event -> {
                String[] sep8 = {"1636. — dibināta Hārvarda Universitāte.",
                        "1991. — Maķedonijas Republika deklarēja neatkarību no Dienvidslāvijas.",
                        "1951. — starp Sabiedrotajiem un Japānu parakstīts Sanfrancisko līgums."};
                int random8 = ran.nextInt(sep8.length);
                text.setText("8. Septembra notikums:\n" + sep8[random8]);
            });
            n9.setOnAction(event -> {
                String[] sep9 = {"1839. — Džons Heršels uzņēma pirmo fotogrāfiju uz stikla plates.",
                        "1850. — Kalifornija iestājās ASV kā 31. štats.",
                        "1948. — Kims Irsens paziņoja par Korejas Tautas Demokrātiskās Republikas dibināšanu."};
                int random9 = ran.nextInt(sep9.length);
                text.setText("9. Septembra notikums:\n" + sep9[random9]);
            });
            n10.setOnAction(event -> {
                String[] sep10 = {"1898. — Austrijas imperatori Elizabeti noslepkavoja Luidži Lukeni.",
                        "2003. — Igaunijā referendumā tika atbalstīta iestāšanās Eiropas Savienībā.",
                        "2002. — Šveice iestājās Apvienoto Nāciju Organizācijā."};
                int random10 = ran.nextInt(sep10.length);
                text.setText("10. Septembra notikums:\n" + sep10[random10]);
            });
            n11.setOnAction(event -> {
                String[] sep11 = {"1918. — Padomju Krievijā ieviesta metriskā sistēma.",
                        "1926. — Spānija izstājās no Tautu Savienības.",
                        "2007. — Krievijā tika izmēģināta pasaulē jaudīgākā vakuuma bumba."};
                int random11 = ran.nextInt(sep11.length);
                text.setText("11. Septembra notikums:\n" + sep11[random11]);
            });
            n12.setOnAction(event -> {
                String[] sep12 = {"2005. — Izraēla pabeidza bruņoto spēku un kolonistu izvākšanu no Gazas sektora.",
                        "1959. — Rīgā notika pirmās Dzejas dienas.",
                        "1943. — Otrais pasaules karš: no mājas aresta tika atbrīvots Itālijas diktators Benito Musolīni."};
                int random12 = ran.nextInt(sep12.length);
                text.setText("12. Septembra notikums:\n" + sep12[random12]);
            });
            n13.setOnAction(event -> {
                String[] sep13 = {"1502. — Kauja pie Smoļinas: Livonijas konfederācija sakāva krievu karsapēku.",
                        "1994. — Ulysses zonde pārlidoja Saules dienvidpolu.",
                        "1959. — Mēnesī ietriecās pirmais cilvēka veidotais objekts Luna-2."};
                int random13 = ran.nextInt(sep13.length);
                text.setText("13. Septembra notikums:\n" + sep13[random13]);
            });
            n14.setOnAction(event -> {
                String[] sep14 = {"2003. — Igaunijā iedzīvotāji referendumā atbalstīja iestāšanos Eiropas Savienībā.",
                        "1973. — Latvijas PSR dibināja Gaujas nacionālo parku.",
                        "1917. — Krievijas Pagaidu valdība pasludināja Krieviju par republiku, kas pastāvēja līdz \nOktobra revolūcijai."};
                int random14 = ran.nextInt(sep14.length);
                text.setText("14. Septembra notikums:\n" + sep14[random14]);
            });
            n15.setOnAction(event -> {
                String[] sep15 = {
                        "1821. — Gvatemala, Hondurasa, Kostarika, Nikaragva, Salvadora deklarēja neatkarību no Spānijas.",
                        "1959. — Ņikita Hruščovs kā pirmais PSRS vadītājs apmeklēja ASV.",
                        "1950. — Korejas karš: ASV izsēdināja desantu Inčhonā (pie Seulas)."};
                int random15 = ran.nextInt(sep15.length);
                text.setText("15. Septembra notikums:\n" + sep15[random15]);
            });
            n16.setOnAction(event -> {
                String[] sep16 = {"1810. — Meksika deklarēja neatkarību no Spānijas.",
                        "1908. — tika dibināts ASV autobūves uzņēmums General Motors.",
                        "1963. — dibināta Malaizija, apvienojot Malaju, Singapūru, Britu Ziemeļborneo (Sabahu) un \nSaravaku."};
                int random16 = ran.nextInt(sep16.length);
                text.setText("16. Septembra notikums:\n" + sep16[random16]);
            });
            n17.setOnAction(event -> {
                String[] sep17 = {"1787. — Filadelfijā pieņemta ASV konstitūcija.",
                        "1993. — Krievijas karaspēks atstāja Poliju.",
                        "1939. — Otrais pasaules karš: Padomju Savienības karaspēks, pamatojoties uz Molotova-Ribentropa \npaktu, iebruka Polijas austrumu daļā."};
                int random17 = ran.nextInt(sep17.length);
                text.setText("17. Septembra notikums:\n" + sep17[random17]);
            });
            n18.setOnAction(event -> {
                String[] sep18 = {"1947. — tika izveidoti ASV Gaisa spēki kā atsevišķa militāra struktūrvienība.",
                        "1910. — pie varas nāca pirmā huntas valdība Čīlē.",
                        "1679. — Ņūhempšīra kļuva par Masačūsetsas līča koloniju."};
                int random18 = ran.nextInt(sep18.length);
                text.setText("18. Septembra notikums:\n" + sep18[random18]);
            });
            n19.setOnAction(event -> {
                String[] sep19 = {"2002. — Kotdivuārā sākās pilsoņu karš.",
                        "1995. — The Washington Post un The New York Times publicēja Unabombera manifestu.",
                        "1944. — Otrais pasaules karš: PSRS un Somija parakstīja pamiera līgumu."};
                int random19 = ran.nextInt(sep19.length);
                text.setText("19. Septembra notikums:\n" + sep19[random19]);
            });
            n20.setOnAction(event -> {
                String[] sep20 = {"1187. — Saladīns sāka Jeruzalemes aplenkumu pret krustnešiem.",
                        "2003. — Latvijā referendumā pilsoņi atbalstīja iestāšanos Eiropas Savienībā.",
                        "1990. — Dienvidosetijas autonomais apgabals deklarēja Dienvidosetijas Padomju Demokrātisko \nRepubliku ārpus Gruzijas PSR sastāva."};
                int random20 = ran.nextInt(sep20.length);
                text.setText("20. Septembra notikums:\n" + sep20[random20]);
            });
            n21.setOnAction(event -> {
                String[] sep21 = {"1217. — igauņu cilšu vadonis Lembits tika nogalināts cīņā ar Teitoņu ordeni.",
                        "2004. — Latvijā tika novērota neliela zemestrīce, kuras epicentrs atradās Kaļiņingradas apgabalā.",
                        "1957. — Ūlavs V kļuva par Norvēģijas karali pēc Hokona VII nāves."};
                int random21 = ran.nextInt(sep21.length);
                text.setText("21. Septembra notikums:\n" + sep21[random21]);
            });
            n22.setOnAction(event -> {
                String[] sep22 = {"1980. — Irānas—Irākas karš: Irāka iebruka Irānā.",
                        "1921. — Latvija, Lietuva un Igaunija uzņemtas Tautu Savienībā.",
                        "1888. — tika izdots National Geographic žurnāla pirmais numurs."};
                int random22 = ran.nextInt(sep22.length);
                text.setText("22. Septembra notikums:\n" + sep22[random22]);
            });
            n23.setOnAction(event -> {
                String[] sep23 = {
                        "2002. — izlaista pirmā publiskā versija pārlūkprogrammai Mozilla Firefox (Phoenix 0.1).",
                        "1991. — Armēnija pasludināja savu neatkarību.",
                        "1923. — pēdējiem Antantes spēkiem pametot Konstantinopoli, beidzās Konstantinopoles okupācija."};
                int random23 = ran.nextInt(sep23.length);
                text.setText("23. Septembra notikums:\n" + sep23[random23]);
            });
            n24.setOnAction(event -> {
                String[] sep24 = {"1948. — dibināta kompānija Honda Motor Company.",
                        "1801. — Rietumgruzija pievienojās Krievijas impērijai.",
                        "1968. — Svazilendas karaliste pieņemta ANO."};
                int random24 = ran.nextInt(sep24.length);
                text.setText("24. Septembra notikums:\n" + sep24[random24]);
            });
            n25.setOnAction(event -> {
                String[] sep25 = {"2008. — Ķīna palaida kosmosa kuģi Shenzhou 7.",
                        "1990. — ar Latvijas Republikas Augstākās padomes lēmumu Stučkas pilsēta ieguva Aizkraukles vārdu.",
                        "1992. — ASV palaista Marsa zonde Mars Observer."};
                int random25 = ran.nextInt(sep25.length);
                text.setText("25. Septembra notikums:\n" + sep25[random25]);
            });
            n26.setOnAction(event -> {
                String[] sep26 = {"1950. — ANO karaspēks atguva Seulu no Ziemeļkorejas.",
                        "1961. — uzsāka darbu zinātniski pētnieciskais kodolreaktors Salaspilī.",
                        "1997. — zemestrīce satricināja Itālijas reģionus Umbriju un Marki, izraisot Svētā Franciska \nbazilikas sagrūšanu Asīzē."};
                int random26 = ran.nextInt(sep26.length);
                text.setText("26. Septembra notikums:\n" + sep26[random26]);
            });
            n27.setOnAction(event -> {
                String[] sep27 = {"1996. — Afganistānā Taliban spēki ieņēma galvaspilsētu Kabulu.",
                        "1983. — Ričards Stalmans oficiāli paziņoja par GNU projektu.",
                        "1981. — Francijā sākta ātrgaitas dzelzceļa līnijas TGV ekspluatācija starp Parīzi un Lionu."};
                int random27 = ran.nextInt(sep27.length);
                text.setText("27. Septembra notikums:\n" + sep27[random27]);
            });
            n28.setOnAction(event -> {
                String[] sep28 = {"2008. — notika pirmās nakts sacīkstes F1 čempionāta vēsturē (Singapūras Grand Prix).",
                        "1994. — Baltijas jūrā ceļā no Tallinas uz Stokholmu nogrima kuģis \"Estonia\", bojā gāja 852 \ncilvēki.",
                        "1950. — Indonēzija pievienojās ANO."};
                int random28 = ran.nextInt(sep28.length);
                text.setText("28. Septembra notikums:\n" + sep28[random28]);
            });
            n29.setOnAction(event -> {
                String[] sep29 = {
                        "2000. — Latvijas soļotājs Aigars Fadejevs izcīnīja sudraba medaļu 50 km soļošanas distancē \nSidnejas olimpiskajās spēlēs.",
                        "1991. — militārais apvērsums Haiti.",
                        "1918. — Pirmais pasaules karš: Bulgārija parakstīja pamiera līgumu ar Antanti."};
                int random29 = ran.nextInt(sep29.length);
                text.setText("29. Septembra notikums:\n" + sep29[random29]);
            });
            n30.setOnAction(event -> {
                String[] sep30 = {"1399. — Henrijs IV Lankasters tika kronēts par Anglijas karali.",
                        "1895. — Madagaskara kļuva par Francijas protektorātu.",
                        "1966. — Bečuanalendas protektorāts ieguva neatkarību no Apvienotās Karalistes un tika pārdēvēts \npar Botsvānu."};
                int random30 = ran.nextInt(sep30.length);
                text.setText("30. Septembra notikums:\n" + sep30[random30]);
            });
        });

        // Oktobris
        okt.setOnAction(e -> {
            n30.setVisible(true);
            n31.setVisible(true);
            n1.setOnAction(event -> {
                String[] okt1 = {"1890. — ASV dibināts Josemitu nacionālais parks.",
                        "1946. — darbu beidza Nirnbergas starptautiskais kara tribunāls.",
                        "1949. — tika proklamēta Ķīnas Tautas Republika."};
                int random1 = ran.nextInt(okt1.length);
                text.setText("1. Oktobra notikums:\n" + okt1[random1]);
            });
            n2.setOnAction(event -> {
                String[] okt2 = {"1990. — beidza pastāvēt Vācijas Demokrātiskā Republika.",
                        "1870. — Romā notika plebiscīts, pēc kura Roma un Latija tika pievienota Itālijas Karalistei.",
                        "1865. — Latgalē stājās spēkā aizliegums iespiest grāmatas ar latīņu burtiem, aizsākot cara \nvaldības rusifikācijas politiku."};
                int random2 = ran.nextInt(okt2.length);
                text.setText("2. Oktobra notikums:\n" + okt2[random2]);
            });
            n3.setOnAction(event -> {
                String[] okt3 = {"1906. — SOS oficiāli tika atzīts par starptautisko nelaimes signālu.",
                        "1932. — Irāka ieguva neatkarību no Apvienotās Karalistes.",
                        "1942. — pirmais veiksmīgais V-2 (A4) raķetes starts Vācijā, pirmoreiz cilvēka veidots objekts \nsasniedza kosmosu."};
                int random3 = ran.nextInt(okt3.length);
                text.setText("3. Oktobra notikums:\n" + okt3[random3]);
            });
            n4.setOnAction(event -> {
                String[] okt4 = {"1535. — Bībele pirmoreiz nodrukāta angļu valodā.",
                        "1957. — PSRS palaists pirmais Zemes mākslīgais pavadonis (Sputnik-1).",
                        "1883. — atklāta vilcienu satiksmes līnija Austrumu ekspresis, kas savienoja Parīzi ar Stambulu."};
                int random4 = ran.nextInt(okt4.length);
                text.setText("4. Oktobra notikums:\n" + okt4[random4]);
            });
            n5.setOnAction(event -> {
                String[] okt5 = {"1507. — Kristofors Kolumbs atklāja Kostariku.",
                        "1910. — Portugālē deklarēta republika; karalis aizbēg uz Apvienoto Karalisti.",
                        "2000. — Dienvidslāvijas prezidents Slobodans Miloševičs pameta savu posteni pēc plašām protesta \ndemonstrācijām Serbijā."};
                int random5 = ran.nextInt(okt5.length);
                text.setText("5. Oktobra notikums:\n" + okt5[random5]);
            });
            n6.setOnAction(event -> {
                String[] okt6 = {"1934. — Katalonijas separātistu dumpis.",
                        "1939. — Otrais pasaules karš: sakautas pēdējās Polijas armijas vienības.",
                        "1995. — paziņots par pirmās citplanētas (51 Pegasi b) atklāšanu."};
                int random6 = ran.nextInt(okt6.length);
                text.setText("6. Oktobra notikums:\n" + okt6[random6]);
            });
            n7.setOnAction(event -> {
                String[] okt7 = {"1920. — Lietuva un Polija noslēdza Suvalku līgumu.",
                        "1977. — PSRS pieņēma jaunu konstitūciju.",
                        "2001. — ASV ar Apvienotās Karalistes spēku piedalīšanos iebruka Afganistānā."};
                int random7 = ran.nextInt(okt7.length);
                text.setText("7. Oktobra notikums:\n" + okt7[random7]);
            });
            n8.setOnAction(event -> {
                String[] okt8 = {"1892. — Edmontonai Kanādā piešķīra pilsētas tiesības.",
                        "1919. — Latvijas brīvības cīņas: bermontieši sāka uzbrukumu Rīgai.",
                        "1988. — dibināta Latvijas Tautas fronte."};
                int random8 = ran.nextInt(okt8.length);
                text.setText("8. Oktobra notikums:\n" + okt8[random8]);
            });
            n9.setOnAction(event -> {
                String[] okt9 = {"1804. — dibināta Tasmanijas galvaspilsēta Hobārta.", "1920. — Polija okupēja Viļņu.",
                        "2006. — Ziemeļkoreja paziņoja, ka tā veikusi savu pirmo kodolsprādzienu."};
                int random9 = ran.nextInt(okt9.length);
                text.setText("9. Oktobra notikums:\n" + okt9[random9]);
            });
            n10.setOnAction(event -> {
                String[] okt10 = {"1868. — Kuba deklarēja neatkarību no Spānijas.",
                        "1939. — starp Lietuvu un PSRS parakstīts līgums, kurā Lietuva atguva Viļņas apgabalu.",
                        "1970. — Fidži ieguva neatkarību no Apvienotās Karalistes."};
                int random10 = ran.nextInt(okt10.length);
                text.setText("10. Oktobra notikums:\n" + okt10[random10]);
            });
            n11.setOnAction(event -> {
                String[] okt11 = {"1986. — Reikjavikā tikās ASV un PSRS vadītāji Ronalds Reigans un Mihails Gorbačovs.",
                        "1944. — PSRS anektēja Tivas Tautas Republiku.",
                        "1899. — sākās Angļu—būru karš."};
                int random11 = ran.nextInt(okt11.length);
                text.setText("11. Oktobra notikums:\n" + okt11[random11]);
            });
            n12.setOnAction(event -> {
                String[] okt12 = {
                        "1960. — ANO ģenerālās asamblejas laikā PSRS vadītājs Ņikita Hruščovs esot pārtraucis britu \npremjerministra runu, ar kurpi sitot pa galdu.",
                        "1964. — PSRS palaists kosmosa kuģis Voshod-1 ar pirmo pasaulē 3 cilvēku apkalpi.",
                        "2005. — Ķīnā palaists 2. pilotētais kosmosa kuģis Shenzhou 7."};
                int random12 = ran.nextInt(okt12.length);
                text.setText("12. Oktobra notikums:\n" + okt12[random12]);
            });
            n13.setOnAction(event -> {
                String[] okt13 = {"1970. — Fidži pievienojas Apvienoto Nāciju Organizācijai.",
                        "1946. — Francijā pieņemta Ceturtās Republikas konstitūcija.",
                        "1944. — Otrais pasaules karš: Sarkanā armija ieņēma Rīgu."};
                int random13 = ran.nextInt(okt13.length);
                text.setText("13. Oktobra notikums:\n" + okt13[random13]);
            });
            n14.setOnAction(event -> {
                String[] okt14 = {"1947. — Čaks Jēgers lidmašīnā X-1 pirmoreiz sasniedza virsskaņas ātrumu.",
                        "1964. — Leonīds Brežņevs kļuva par PSKP pirmo sekretāru pēc Ņikitas Hruščova atstādināšanas.",
                        "1978. — Filipīnās sākās astotais Pasaules čempionāts basketbolā; par čempioniem kļuva \nDienvidslāvijas izlase."};
                int random14 = ran.nextInt(okt14.length);
                text.setText("14. Oktobra notikums:\n" + okt14[random14]);
            });
            n15.setOnAction(event -> {
                String[] okt15 = {
                        "1582. — Pāvests Gregors XIII ieviesa Gregora kalendāru; vairākās Eiropas valstīs 4. oktobrim \nsekoja 15. oktobris.",
                        "1989. — Veins Greckis kļuva par visvairāk punktus guvušo spēlētāju NHL vēsturē.",
                        "1990. — PSRS līderis Mihails Gorbačovs saņēma Nobela Miera prēmiju par viņa ieguldījumu aukstā \nkara sasprindzinājuma mazināšanā un valsts atvērtības palielināšanā."};
                int random15 = ran.nextInt(okt15.length);
                text.setText("15. Oktobra notikums:\n" + okt15[random15]);
            });
            n16.setOnAction(event -> {
                String[] okt16 = {"1923. — dibināta kinokompānija The Walt Disney Company.",
                        "1929. — Tadžikijas APSR pārveidota par Tadžikijas PSR.",
                        "1978. — par pāvestu kļuva polis Jānis Pāvils II (Karols Juzefs Voitila)."};
                int random16 = ran.nextInt(okt16.length);
                text.setText("16. Oktobra notikums:\n" + okt16[random16]);
            });
            n17.setOnAction(event -> {
                String[] okt17 = {"1610. — Reimsā kronēts Francijas karalis Luijs XIII.",
                        "1918. — Ungārija pasludināja neatkarību no Austrijas.",
                        "1931. — Als Kapone tika notiesāts par izvairīšanos no ienākuma nodokļa maksāšanas."};
                int random17 = ran.nextInt(okt17.length);
                text.setText("17. Oktobra notikums:\n" + okt17[random17]);
            });
            n18.setOnAction(event -> {
                String[] okt18 = {"1797. — beidza pastāvēt Venēcijas Republika.",
                        "1922. — dibināta raidorganizācija BBC.",
                        "1944. — Otrais pasaules karš: Sarkanā armija iegāja Čehoslovākijā."};
                int random18 = ran.nextInt(okt18.length);
                text.setText("18. Oktobra notikums:\n" + okt18[random18]);
            });
            n19.setOnAction(event -> {
                String[] okt19 = {"2000. — Ņujorkā atklāta Tiso kundzes Vaska figūru muzeja filiāle.",
                        "1960. — ASV ieviesa embargo pret komunistisko Kubu.",
                        "1935. — Tautu Savienība ieviesa ekonomiskās sankcijas pret fašistisko Itāliju par tās iebrukumu \nEtiopijā."};
                int random19 = ran.nextInt(okt19.length);
                text.setText("19. Oktobra notikums:\n" + okt19[random19]);
            });
            n20.setOnAction(event -> {
                String[] okt20 = {"1548. — dibināta Lapasa, viena no Bolīvijas galvaspilsētām.",
                        "1971. — sabruka Nepālas vērtspapīru birža.",
                        "1818. — ASV un Apvienotā Karaliste vienojās noteikt ASV un Kanādas robežu pa 49. paralēli."};
                int random20 = ran.nextInt(okt20.length);
                text.setText("20. Oktobra notikums:\n" + okt20[random20]);
            });
            n21.setOnAction(event -> {
                String[] okt21 = {"2002. — Irākas prezidents Sadams Huseins izsludināja vispārēju amnestiju.",
                        "1986. — Māršala Salas ieguva neatkarību no ASV.",
                        "1578. — Livonijas karš: Vendenes kaujā pie Cēsīm apvienotie zviedru-poļu-lietuviešu spēki sakāva \nKrievijas karaspēku."};
                int random21 = ran.nextInt(okt21.length);
                text.setText("21. Oktobra notikums:\n" + okt21[random21]);
            });
            n22.setOnAction(event -> {
                String[] okt22 = {"2008. — Indija palaida pirmo Mēness zondi Chandrayaan 1.",
                        "1964. — franču rakstnieks un filozofs Žans Pols Sartrs atteicās no Nobela prēmijas.",
                        "1950. — Argentīnas pilsētā Buenosairesā sākās pirmais Pasaules čempionāts basketbolā."};
                int random22 = ran.nextInt(okt22.length);
                text.setText("22. Oktobra notikums:\n" + okt22[random22]);
            });
            n23.setOnAction(event -> {
                String[] okt23 = {"1946. — Ņujorkā notika pirmā ANO Ģenerālās asamblejas sēde.",
                        "2001. — Apple Computer izlaida iPod.",
                        "1956. — Ungārijas revolūcija: Ungārijā sākās protesti pret propadomiski orientēto valdību."};
                int random23 = ran.nextInt(okt23.length);
                text.setText("23. Oktobra notikums:\n" + okt23[random23]);
            });
            n24.setOnAction(event -> {
                String[] okt24 = {"2007. — Ķīna palaida savu pirmo Mēness zondi Chang'e 1.",
                        "1946. — ASV palaistā raķete V-2 pirmoreiz nofotografēja Zemi no kosmosa.",
                        "1945. — dibināta Apvienoto Nāciju Organizācija."};
                int random24 = ran.nextInt(okt24.length);
                text.setText("24. Oktobra notikums:\n" + okt24[random24]);
            });
            n25.setOnAction(event -> {
                String[] okt25 = {"1962. — Uganda pievienojās Apvienoto Nāciju Organizācijai.",
                        "1992. — Lietuvā referendumā pieņemta jauna konstitūcija.",
                        "2001. — Microsoft izlaida Windows XP."};
                int random25 = ran.nextInt(okt25.length);
                text.setText("25. Oktobra notikums:\n" + okt25[random25]);
            });
            n26.setOnAction(event -> {
                String[] okt26 = {"1905. — Norvēģija ieguva neatkarību no Zviedrijas.",
                        "2012. — sākta operētājsistēmas Windows 8 pārdošana.",
                        "1994. — Jordānija un Izraēla noslēdza miera līgumu."};
                int random26 = ran.nextInt(okt26.length);
                text.setText("26. Oktobra notikums:\n" + okt26[random26]);
            });
            n27.setOnAction(event -> {
                String[] okt27 = {"1939. — Lietuvas karaspēks ienāca Viļņā saskaņā ar PSRS un Lietuvas līgumu.",
                        "1982. — Ķīna paziņoja, ka tās iedzīvotāju skaits pārsniedzis miljardu.",
                        "1995. — Latvijas valdība iesniedza pieteikumu par iestāšanos Eiropas Savienībā."};
                int random27 = ran.nextInt(okt27.length);
                text.setText("27. Oktobra notikums:\n" + okt27[random27]);
            });
            n28.setOnAction(event -> {
                String[] okt28 = {"1918. — Čehoslovākija pasludināja neatkarību no Austroungārijas.",
                        "1941. — Otrais pasaules karš: Kauņas geto, Lietuvā vācu SS spēki nogalināja ap 9000 ebreju.",
                        "1962. — Kubas raķešu krīze: PSRS vadītājs Ņikita Hruščovs paziņoja, ka tiks izvāktas raķetes \nno Kubas."};
                int random28 = ran.nextInt(okt28.length);
                text.setText("28. Oktobra notikums:\n" + okt28[random28]);
            });
            n29.setOnAction(event -> {
                String[] okt29 = {
                        "2004. — Eiropas Savienības valstu vadītāji Romā parakstīja līgumu par Eiropas Konstitūciju.",
                        "1956. — IBM izveidoja pirmo cieto disku (5 MB).",
                        "1929. — ar Ņujorkas biržas sabrukumu (“melnā otrdiena”) ASV sākās Lielā depresija."};
                int random29 = ran.nextInt(okt29.length);
                text.setText("29. Oktobra notikums:\n" + okt29[random29]);
            });
            n30.setOnAction(event -> {
                String[] okt30 = {
                        "1983. — Argentīnā notika pirmās demokrātiskās vēlēšanas pēc 7 gadu militāras pārvaldes.",
                        "1941. — Otrais pasaules karš: ASV prezidents Franklins Rūzvelts apstiprināja viena miljarda USD lendlīzes palīdzības sniegšanu Sabiedrotajiem.",
                        "1941. — Otrais pasaules karš: ASV prezidents Franklins Rūzvelts apstiprināja viena miljarda USD lendlīzes palīdzības sniegšanu Sabiedrotajiem."};
                int random30 = ran.nextInt(okt30.length);
                text.setText("30. Oktobra notikums:\n" + okt30[random30]);
            });
            n31.setOnAction(event -> {
                String[] okt31 = {"1866. — sākta Briseles Tiesu pils būvniecība.",
                        "1957. — Japānas uzņēmums Toyota sāka eksportēt savas automašīnas uz ASV.",
                        "1915. — Pirmais pasaules karš: britu karavīri pirmoreiz izmantoja tērauda bruņucepures."};
                int random31 = ran.nextInt(okt31.length);
                text.setText("31. Oktobra notikums:\n" + okt31[random31]);
            });
        });

        // Novembris
        nov.setOnAction(e -> {
            n30.setVisible(true);
            n31.setVisible(false);
            n1.setOnAction(event -> {
                String[] nov1 = {"1993. — stājās spēkā Māstrihtas līgums, formāli dibinot Eiropas Savienību.",
                        "1955. — sākās Vjetnamas karš.",
                        "1925. — sāka raidīt Rīgas radiofons; Latvijas Radio dzimšanas diena."};
                int random1 = ran.nextInt(nov1.length);
                text.setText("1. Novembra notikums:\n" + nov1[random1]);
            });
            n2.setOnAction(event -> {
                String[] nov2 = {"1899. — sākās Bokseru sacelšanās.",
                        "1914. — Pirmais Pasaules karš: Krievija pieteica karu Osmaņu impērijai.",
                        "1917. — tika publiskota Balfūra deklarācija, pēc kuras tiktu atbalstīta ebreju apmetņu \nierīkošana Palestīnā."};
                int random2 = ran.nextInt(nov2.length);
                text.setText("2. Novembra notikums:\n" + nov2[random2]);
            });
            n3.setOnAction(event -> {
                String[] nov3 = {"1903. — ar ASV atbalstu Panama deklarēja neatkarību no Kolumbijas.",
                        "1950. — Argentīnas pilsētā Buenosairesā sākās pirmais Pasaules čempionāts basketbolā.",
                        "1919. — Latvijas brīvības cīņas: Latvijas armija sāka pretuzbrukumu bermontiešiem Bolderājā \nuz ziemeļiem no Rīgas."};
                int random3 = ran.nextInt(nov3.length);
                text.setText("3. Novembra notikums:\n" + nov3[random3]);
            });
            n4.setOnAction(event -> {
                String[] nov4 = {
                        "1918. — Pirmais pasaules karš: saskaņā ar panākto pamieru Austroungārija pārtrauca karadarbību.",
                        "1995. — Telavivā atentātā tika nogalināts Izraēlas premjerministrs Ichaks Rabins.",
                        "1921. — Vācijā izveidota paramilitāra organizācija Sturmabteilung (SA)."};
                int random4 = ran.nextInt(nov4.length);
                text.setText("4. Novembra notikums:\n" + nov4[random4]);
            });
            n5.setOnAction(event -> {
                String[] nov5 = {"1954. — Brazīlijas pilsētā Riodežaneiro beidzās otrais Pasaules čempionāts basketbolā.",
                        "1985. — pieņemts pašreizējais Santomes un Prinsipi karogs.",
                        "2007. — palaista pirmā Ķīnas Mēness zonde Chang'e-1."};
                int random5 = ran.nextInt(nov5.length);
                text.setText("5. Novembra notikums:\n" + nov5[random5]);
            });
            n6.setOnAction(event -> {
                String[] nov6 = {"1534. — dibināta Kito, Ekvadoras galvaspilsēta.",
                        "1954. — Latvijā, Rīgā sāktas regulāras televīzijas pārraides.",
                        "1999. — Austrālijas iedzīvotāji referendumā nobalsoja par Apvienotās Karalistes monarha kā \nvalsts galvas statusa saglabāšanu."};
                int random6 = ran.nextInt(nov6.length);
                text.setText("6. Novembra notikums:\n" + nov6[random6]);
            });
            n7.setOnAction(event -> {
                String[] nov7 = {"1922. — spēkā stājās Latvijas Republikas Satversme.",
                        "1944. — Franklins Rūzvelts kļuva par pirmo prezidentu ASV vēsturē, kas ticis ievēlēts \nceturto reizi pēc kārtas.",
                        "1990. — parādes laikā Sarkanajā laukumā, Maskavā, notika atentāta mēģinājums pret PSRS \nprezidentu Mihailu Gorbačovu."};
                int random7 = ran.nextInt(nov7.length);
                text.setText("7. Novembra notikums:\n" + nov7[random7]);
            });
            n8.setOnAction(event -> {
                String[] nov8 = {
                        "1860. — Pēterburgas—Varšavas dzelzceļa līnijas posmā Rītupe—Daugavpils atklāja pirmo dzelzceļa \nlīniju Latvijā.",
                        "1917. — Ļeņins kļuva par Padomju Krievijas Tautas Komisāru padomes priekšsēdētāju.",
                        "1965. — izveidota Britu Indijas okeāna teritorija."};
                int random8 = ran.nextInt(nov8.length);
                text.setText("8. Novembra notikums:\n" + nov8[random8]);
            });
            n9.setOnAction(event -> {
                String[] nov9 = {"1937. — Japānas spēki ieņēma Šanhaju Ķīnā.",
                        "1938. — Kristāla nakts: sākās pirmie masveidīgie pret ebrejiem vērsti grautiņi Vācijā.",
                        "2005. — palaista ESA Venēras zonde Venus Express."};
                int random9 = ran.nextInt(nov9.length);
                text.setText("9. Novembra notikums:\n" + nov9[random9]);
            });
            n10.setOnAction(event -> {
                String[] nov10 = {"1994. — Irāka paziņoja par Kuveitas suverenitātes atzīšanu.",
                        "1951. — Francija, Lielbritānija, ASV un Turcija pieņēma Tuvo Austrumu drošības programmu.",
                        "1933. — krievu literāts Ivans Buņins saņēma Nobela prēmiju literatūrā."};
                int random10 = ran.nextInt(nov10.length);
                text.setText("10. Novembra notikums:\n" + nov10[random10]);
            });
            n11.setOnAction(event -> {
                String[] nov11 = {"1889. — Vašingtona uzņemta ASV kā 42. štats.",
                        "2007. — notika filmas \"Rīgas sargi\" pirmizrāde.",
                        "1988. — Palestīna deklarēja neatkarību no Izraēlas."};
                int random11 = ran.nextInt(nov11.length);
                text.setText("11. Novembra notikums:\n" + nov11[random11]);
            });
            n12.setOnAction(event -> {
                String[] nov12 = {"1918. — Austrija kļuva par republiku.",
                        "2006. — Dienvidosetijā notika referendums par neatkarību no Gruzijas.",
                        "2001. — Taliban spēki atstāja Afganistānas galvaspilsētu Kabulu."};
                int random12 = ran.nextInt(nov12.length);
                text.setText("12. Novembra notikums:\n" + nov12[random12]);
            });
            n13.setOnAction(event -> {
                String[] nov13 = {
                        "2002. — tankkuģis Prestige nogrima pie Spānijas Galisijas krasta, izraisot plašu naftas \npiesārņojumu.",
                        "1994. — Zviedrijas iedzīvotāji referendumā nobalsoja par iestāšanos Eiropas Savienībā.",
                        "1990. — sāka darboties globālais tīmeklis."};
                int random13 = ran.nextInt(nov13.length);
                text.setText("13. Novembra notikums:\n" + nov13[random13]);
            });
            n14.setOnAction(event -> {
                String[] nov14 = {"1918. — Čehoslovākija kļuva par republiku.",
                        "1940. — Otrais pasaules karš: vācu aviācijas uzlidojumā tika sagrauts Koventrijas vēsturiskais \ncentrs Anglijā.",
                        "1975. — Spānija atstāja Rietumsahāru."};
                int random14 = ran.nextInt(nov14.length);
                text.setText("14. Novembra notikums:\n" + nov14[random14]);
            });
            n15.setOnAction(event -> {
                String[] nov15 = {"1983. — dibināta Ziemeļu Kipras Turku Republika, kuru atzinusi tikai Turcija.",
                        "1969. — Vjetnamas karš: Vašingtonā notika pretkara demonstrācija, kurā piedalījās 250 000—500 000 \ncilvēku.",
                        "1920. — notika Tautu Savienības pirmā asambleja Ženēvā."};
                int random15 = ran.nextInt(nov15.length);
                text.setText("15. Novembra notikums:\n" + nov15[random15]);
            });
            n16.setOnAction(event -> {
                String[] nov16 = {"1810. — Meksika pasludināja neatkarību no Spānijas.",
                        "1896. — pirmoreiz tika pārvadīta elektrība no elektrostacijas uz pilsētu (no Niagāras ūdenskrituma \nHES uz Bufalo, ASV).",
                        "2004. — X-43A ar tiešplūsmas reaktīvo dzinēju uzstādīja ātruma rekordu (11 200 km/h jeb 3,11 km/s) \nlidaparātiem, kuri darbojas ar atmosfēras gaisu kā degvielas oksidētāju."};
                int random16 = ran.nextInt(nov16.length);
                text.setText("16. Novembra notikums:\n" + nov16[random16]);
            });
            n17.setOnAction(event -> {
                String[] nov17 = {
                        "1869. — atklāja Suecas kanālu (attēlā) Ēģiptē, kas savienoja Vidusjūru ar Sarkano jūru.",
                        "1903. — Krievijas sociāldemokrātiskā strādnieku partija sadalījās boļševikos un meņševikos.",
                        "1922. — pēdējais Osmaņu impērijas sultāns Mehmeds VI devās trimdā uz Itāliju."};
                int random17 = ran.nextInt(nov17.length);
                text.setText("17. Novembra notikums:\n" + nov17[random17]);
            });
            n18.setOnAction(event -> {
                String[] nov18 = {"1493. — Kristofors Kolumbs sasniedza Puertoriko krastus.",
                        "1925. — Džordžs Bernards Šovs atteicās no naudas prēmijas, kas viņam tika piešķirta kā Nobela \nprēmijas literatūrā laureātam.",
                        "2004. — Krievija ratificēja Kioto protokolu."};
                int random18 = ran.nextInt(nov18.length);
                text.setText("18. Novembra notikums:\n" + nov18[random18]);
            });
            n19.setOnAction(event -> {
                String[] nov19 = {
                        "1985. — Ženēvā pirmo reizi tikās ASV prezidents Ronalds Reigans un PSRS vadītājs Mihails Gorbačovs.",
                        "1946. — Afganistāna pievienojās ANO.",
                        "1942. — Otrais pasaules karš: sākās Sarkanās armijas pretuzbrukums pie Staļingradas."};
                int random19 = ran.nextInt(nov19.length);
                text.setText("19. Novembra notikums:\n" + nov19[random19]);
            });
            n20.setOnAction(event -> {
                String[] nov20 = {"1910. — Meksikā sākās revolūcija.",
                        "1985. — izlaista Microsoft Windows 1.0.",
                        "1945. — Nirnbergas prāvas sākums pret 24 nacistiem, apsūdzot viņus kara noziegumos."};
                int random20 = ran.nextInt(nov20.length);
                text.setText("20. Novembra notikums:\n" + nov20[random20]);
            });
            n21.setOnAction(event -> {
                String[] nov21 = {"1919. — Latvijas brīvības cīņas: Latvijas armija atbrīvoja Jelgavu no bermontiešiem.",
                        "2008. — internetā pirmo reizi tika pamanīts viens no bīstamākajiem datora tārpiem — Conficker.",
                        "2013. — sabrūkot jumtam \"Maxima\" veikala ēkai Rīgā, Zolitūdē, bojā gāja 54 cilvēki, vairāki \ndesmiti tika ievainoti."};
                int random21 = ran.nextInt(nov21.length);
                text.setText("21. Novembra notikums:\n" + nov21[random21]);
            });
            n22.setOnAction(event -> {
                String[] nov22 = {"1858. — dibināta Denvera, ASV pilsēta.",
                        "1943. — Libāna ieguva neatkarību no Francijas.",
                        "1975. — pēc Fransisko Franko nāves Huans Karloss I kļuva par Spānijas karali."};
                int random22 = ran.nextInt(nov22.length);
                text.setText("22. Novembra notikums:\n" + nov22[random22]);
            });
            n23.setOnAction(event -> {
                String[] nov23 = {"1700. — par Romas pāvestu tika iecelts Klements XI.",
                        "1864. — tika nodibināta Ainažu jūrskola.",
                        "1963. — Lielbritānijā tika pārraidīta teleseriāla Doctor Who, kas tiek uzņemts vēl mūsdienās, \npirmā sērija."};
                int random23 = ran.nextInt(nov23.length);
                text.setText("23. Novembra notikums:\n" + nov23[random23]);
            });
            n24.setOnAction(event -> {
                String[] nov24 = {
                        "1227. — Polijas princis Lešeks I Baltais tika nogalināts Pjastu augstmaņu sanāksmē Gonsavā.",
                        "1963. — Džeks Rūbijs Dalasas policijas iecirkņa pagrabā nošāva Lī Hārviju Osvaldu. Šaušana \nnotika televīzijas tiešraidē.",
                        "1971. — D. B. Kūpers ASV nolaupīja lidmašīnu Boeing 727, saņēma 200 000 ASV dolāru izpirkuma \nmaksu un izlēca ar izpletni no tās, pazūdot bez pēdām."};
                int random24 = ran.nextInt(nov24.length);
                text.setText("24. Novembra notikums:\n" + nov24[random24]);
            });
            n25.setOnAction(event -> {
                String[] nov25 = {
                        "1918. — Vācijas pagaidu valdība ģenerālpilnvarotā Baltijas zemēs Augusta Vinniga personā atzina \nLatvijas neatkarību de facto.",
                        "1947. — Jaunzēlande ratificēja Vestminsteras statūtus, tādējādi kļūstot neatkarīgai likumdošanas \njomā no Apvienotās Karalistes.",
                        "1992. — Čehoslovākijas parlaments nobalsoja par valsts sadalīšanu Čehijas Republikā un Slovākijā, \nkas notika 1993. gada 1. janvārī."};
                int random25 = ran.nextInt(nov25.length);
                text.setText("25. Novembra notikums:\n" + nov25[random25]);
            });
            n26.setOnAction(event -> {
                String[] nov26 = {"1917. — Monreālā, Kanādā dibināta Nacionālā hokeja līga (NHL).",
                        "1950. — Korejas karš: Ziemeļkorejā Ķīnas Tautas Republikas spēki sāka masīvu pretuzbrukumu \nDienvidkorejas un ASV spēkiem.",
                        "1924. — Mongolijas Republika mainīja valsts nosaukumu uz Mongolijas Tautas Republika un pieņēma \njaunu konstitūciju, kļūstot par sociālistisku valsti."};
                int random26 = ran.nextInt(nov26.length);
                text.setText("26. Novembra notikums:\n" + nov26[random26]);
            });
            n27.setOnAction(event -> {
                String[] nov27 = {"1912. — Spānija pasludināja protektorātu pār Marokas ziemeļu piekrasti.",
                        "1918. — Sarkanā armija ieņēma Igaunijas pilsētu Narvu.",
                        "1971. — Mars-2 nolaižamais aparāts kļuva par pirmo cilvēku darināto objektu, kas sasniedzis \nMarsa virsmu, lai gan nolaišanās bija neveiksmīga."};
                int random27 = ran.nextInt(nov27.length);
                text.setText("27. Novembra notikums:\n" + nov27[random27]);
            });
            n28.setOnAction(event -> {
                String[] nov28 = {
                        "1943. — Otrais pasaules karš: sākās Teherānas konference, Apvienotās Karalistes, ASV un \nPSRS vadītājiem tiekoties Teherānā.",
                        "1964. — palaista NASA starpplanētu zonde Marsa izpētei Mariner 4.",
                        "1975. — Portugāļu Timora deklarēja neatkarību no Portugāles un nomainīja nosaukumu uz \nAustrumtimora."};
                int random28 = ran.nextInt(nov28.length);
                text.setText("28. Novembra notikums:\n" + nov28[random28]);
            });
            n29.setOnAction(event -> {
                String[] nov29 = {
                        "1943. — Otrais Pasaules karš: partizāņu kontrolētajā teritorijā dibināta Demokrātiskā Federālā \nDienvidslāvija kā sociālistiska valsts.",
                        "1945. — dibināta Dienvidslāvijas Federatīvā Tautas Republika.",
                        "1947. — ANO Ģenerālā asambleja nobalsoja par Palestīnas sadalīšanu."};
                int random29 = ran.nextInt(nov29.length);
                text.setText("29. Novembra notikums:\n" + nov29[random29]);
            });
            n30.setOnAction(event -> {
                String[] nov30 = {"1966. — Barbadosa ieguva neatkarību no Apvienotās Karalistes.",
                        "1954. — Silakaugas pilsētā Alabamas štatā meteorīta šķemba ievainoja sievieti — tas bija pirmais \ndokumentētais gadījums, kad no ārpuszemes objekta cieš cilvēks.",
                        "1872. — Glāzgovā tika izspēlēta pirmā starptautiskā futbola spēle vēsturē. Anglijas izlase ar \nSkotijas izlasi nospēlēja neizšķirti 0:0."};
                int random30 = ran.nextInt(nov30.length);
                text.setText("30. Novembra notikums:\n" + nov30[random30]);
            });
        });

        // Decembris
        dec.setOnAction(e -> {
            n30.setVisible(true);
            n31.setVisible(true);
            n1.setOnAction(event -> {
                String[] dec1 = {"1918. — Latvijas brīvības cīņas: Padomju Krievija sāka iebrukumu Latvijā.",
                        "1959. — noslēgts Antarktikas Līgums, saskaņā ar kuru Antarktiku aizliegts izmantot jebkādiem \nmilitāriem mērķiem.",
                        "1774. — stājās spēkā tirdzniecības boikots starp Lielbritāniju un tās Ziemeļamerikas kolonijām."};
                int random1 = ran.nextInt(dec1.length);
                text.setText("1. Decembra notikums:\n" + dec1[random1]);
            });
            n2.setOnAction(event -> {
                String[] dec2 = {"1409. — Leipcigā atklāta universitāte.",
                        "1942. — ASV sāka darboties Enriko Fermi vadībā radītais pasaulē pirmais atomreaktors.",
                        "1848. — Francis Jozefs I kļuva par Austrijas imperatoru."};
                int random2 = ran.nextInt(dec2.length);
                text.setText("2. Decembra notikums:\n" + dec2[random2]);
            });
            n3.setOnAction(event -> {
                String[] dec3 = {"1818. — Ilinoisa iestājās ASV.",
                        "1971. — sākās karš starp Indiju un Pakistānu.",
                        "1994. — Sony izlaida spēļu konsoli PlayStation."};
                int random3 = ran.nextInt(dec3.length);
                text.setText("3. Decembra notikums:\n" + dec3[random3]);
            });
            n4.setOnAction(event -> {
                String[] dec4 = {"1674. — franču jezuīti dibināja Čikāgu.",
                        "1909. — tika nodibināts Monreālas \"Canadiens\" hokeja klubs.",
                        "1980. — par savu izjukšanu paziņoja grupa Led Zeppelin."};
                int random4 = ran.nextInt(dec4.length);
                text.setText("4. Decembra notikums:\n" + dec4[random4]);
            });
            n5.setOnAction(event -> {
                String[] dec5 = {
                        "1934. — Turcijā sievietēm tika piešķirtas balsstiesības un tiesības tikt ievēlētām vispārējās \nparlamenta vēlēšanās.",
                        "1969. — tika izveidots četru mezglu ARPANET tīkls.",
                        "1978. — PSRS parakstīja \"sadraudzības līgumu\" ar Afganistānas Demokrātisko Republiku."};
                int random5 = ran.nextInt(dec5.length);
                text.setText("5. Decembra notikums:\n" + dec5[random5]);
            });
            n6.setOnAction(event -> {
                String[] dec6 = {"1534. — dibināta Kito, Ekvadoras galvaspilsēta.",
                        "1917. — Somija pasludināja neatkarību no Krievijas.",
                        "1991. — Dienvidslāvijas armija bombardēja Dubrovniku Horvātijā."};
                int random6 = ran.nextInt(dec6.length);
                text.setText("6. Decembra notikums:\n" + dec6[random6]);
            });
            n7.setOnAction(event -> {
                String[] dec7 = {"1787. — Delavēra ratificēja ASV konstitūciju kā pirmais štats.",
                        "1995. — NASA zonde Galileo beidza misiju, ieejot Jupitera atmosfērā.",
                        "1988. — Armēnijā notika 6,9 balles stipra zemestrīce, kurā gāja bojā vairāk nekā 25 tūkstoši \ncilvēku."};
                int random7 = ran.nextInt(dec7.length);
                text.setText("7. Decembra notikums:\n" + dec7[random7]);
            });
            n8.setOnAction(event -> {
                String[] dec8 = {"1907. — pēc Oskara II nāves par Zviedrijas karali kļuva viņa dēls Gustavs V.",
                        "1941. — Ķīnas Republika oficiāli pieteica karu Japānai.",
                        "2005. — Ķīnā izbeidza izmantot tvaika lokomotīves maģistrālajās dzelzceļa līnijās."};
                int random8 = ran.nextInt(dec8.length);
                text.setText("8. Decembra notikums:\n" + dec8[random8]);
            });
            n9.setOnAction(event -> {
                String[] dec9 = {"1917. — Pirmais pasaules karš: britu spēki ieņēma Jeruzalemi.",
                        "1922. — Gabriels Narutovičs ievēlēts par pirmo Polijas prezidentu.",
                        "1971. — Apvienotie Arābu Emirāti iestājās ANO."};
                int random9 = ran.nextInt(dec9.length);
                text.setText("9. Decembra notikums:\n" + dec9[random9]);
            });
            n10.setOnAction(event -> {
                String[] dec10 = {"1997. — Kazahstānas galvaspilsēta pārcelta no Almati uz Astanu.",
                        "1983. — Argentīnā atjaunota demokrātija pēc militāras pārvaldes.",
                        "1948. — ANO Ģenerālā Asambleja pieņēma Vispārējo cilvēktiesību deklarāciju."};
                int random10 = ran.nextInt(dec10.length);
                text.setText("10. Decembra notikums:\n" + dec10[random10]);
            });
            n11.setOnAction(event -> {
                String[] dec11 = {"1816. — Indiāna kļuva par ASV 19. štatu.",
                        "2001. — Ķīna iestājās Pasaules Tirdzniecības organizācijā.",
                        "1997. — pieņemts Kioto protokols."};
                int random11 = ran.nextInt(dec11.length);
                text.setText("11. Decembra notikums:\n" + dec11[random11]);
            });
            n12.setOnAction(event -> {
                String[] dec12 = {"1787. — Pensilvānija kļuva par ASV otro štatu.",
                        "2005. — ASV palaista Marsa zonde Mars Reconnaissance Orbiter ",
                        "1979. — Rodēzija nomainīja nosaukumu uz Zimbabve."};
                int random12 = ran.nextInt(dec12.length);
                text.setText("12. Decembra notikums:\n" + dec12[random12]);
            });
            n13.setOnAction(event -> {
                String[] dec13 = {"1642. — Ābels Tasmans sasniedza Jaunzēlandi.",
                        "1577. — Frānsiss Dreiks uzsāka savu ceturto pasaules apceļošanu no Plimutas, Anglijā.",
                        "2003. — ASV militārie spēki sagūstīja bijušo Irākas prezidentu Sadamu Huseinu."};
                int random13 = ran.nextInt(dec13.length);
                text.setText("13. Decembra notikums:\n" + dec13[random13]);
            });
            n14.setOnAction(event -> {
                String[] dec14 = {"1819. — Alabama kļuva par 22. ASV štatu.", "1955. — Albānija pievienojās ANO.",
                        "1989. — Čīlē pēc 16 gadu pārtraukuma notika brīvas vēlēšanas."};
                int random14 = ran.nextInt(dec14.length);
                text.setText("14. Decembra notikums:\n" + dec14[random14]);
            });
            n15.setOnAction(event -> {
                String[] dec15 = {"1791. — stājās spēkā Amerikas Savienoto Valstu Tiesību bils.",
                        "1978. — prezidents Džimijs Kārters paziņoja, ka ASV atzīs Ķīnas Tautas Republiku un saraus \nattiecības ar Taivānu.",
                        "1976. — Samoa Neatkarīgā Valsts uzņemta ANO."};
                int random15 = ran.nextInt(dec15.length);
                text.setText("15. Decembra notikums:\n" + dec15[random15]);
            });
            n16.setOnAction(event -> {
                String[] dec16 = {"1916. — Pirmais pasaules karš: beidzās Verdenas kauja.",
                        "1991. — Kazahstāna deklarēja neatkarību no PSRS.",
                        "1971. — beidzās karš starp Indiju un Pakistānu; Bangladeša ieguva neatkarību no Pakistānas."};
                int random16 = ran.nextInt(dec16.length);
                text.setText("16. Decembra notikums:\n" + dec16[random16]);
            });
            n17.setOnAction(event -> {
                String[] dec17 = {"1834. — Īrijā tika atklāts pirmais dzelzceļš valstī.",
                        "1947. — British Thomson-Houston patentēja hologrāfiju.",
                        "1926. — Antana Smetonas vadībā veikts valsts apvērsums Lietuvā."};
                int random17 = ran.nextInt(dec17.length);
                text.setText("17. Decembra notikums:\n" + dec17[random17]);
            });
            n18.setOnAction(event -> {
                String[] dec18 = {"1953. — uzsāktas krāsainās televīzijas pārraides NTSC standartā.",
                        "1940. — apstiprināts \"Barbarosas\" plāns.",
                        "1898. — Pēterpilī dibināta studentu korporācija Fraternitas Metropolitana."};
                int random18 = ran.nextInt(dec18.length);
                text.setText("18. Decembra notikums:\n" + dec18[random18]);
            });
            n19.setOnAction(event -> {
                String[] dec19 = {"2012. — Paka Kinhje kļuva par pirmo sievieti Dienvidkorejas prezidenta amatā.",
                        "1997. — iznāca filma \"Titāniks\".",
                        "1986. — Mihails Gorbačovs izbeidza Andreja Saharova un viņa sievas Jeļenas Bonneres izsūtījumu \ntrimdā Gorkijā."};
                int random19 = ran.nextInt(dec19.length);
                text.setText("19. Decembra notikums:\n" + dec19[random19]);
            });
            n20.setOnAction(event -> {
                String[] dec20 = {
                        "2000. — Lielbritānijas parlaments atļāva cilvēka klonēšanu, bet tikai medicīniskiem mērķiem.",
                        "1999. — Makao no Portugāles nonāca Ķīnas pārvaldībā.",
                        "1996. — kompānija NeXT apvienojās ar Apple Computer; sākta Mac OS X izstrāde."};
                int random20 = ran.nextInt(dec20.length);
                text.setText("20. Decembra notikums:\n" + dec20[random20]);
            });
            n21.setOnAction(event -> {
                String[] dec21 = {"1898. — Marija Sklodovska-Kirī un Pjērs Kirī atklāja rādiju.",
                        "2007. — Čehija, Igaunija, Ungārija, Latvija, Lietuva, Malta, Polija, Slovākija un Slovēnija \nparakstīja Šengenas līgumu.",
                        "1991. — NVS iestājās Azerbaidžāna, Armēnija, Kazahstāna, Kirgizstāna, Moldova, Tadžikistāna, \nTurkmenistāna un Uzbekistāna."};
                int random21 = ran.nextInt(dec21.length);
                text.setText("21. Decembra notikums:\n" + dec21[random21]);
            });
            n22.setOnAction(event -> {
                String[] dec22 = {"1894. — sākās Dreifusa lieta.",
                        "2001. — Hāmids Karzajs kļuva par Afganistānas valdības vadītāju.",
                        "2007. — Francijas nesējraķete Ariane 5 nogādāja orbītā pirmo Āfrikas mākslīgo Zemes pavadoni."};
                int random22 = ran.nextInt(dec22.length);
                text.setText("22. Decembra notikums:\n" + dec22[random22]);
            });
            n23.setOnAction(event -> {
                String[] dec23 = {"1956. — Apvienotās Karalistes un Francijas spēki atstāja Suecas kanāla reģionu.",
                        "1954. — ASV veikta pasaulē pirmā nieres transplantācija.",
                        "1920. — Apvienotā Karaliste un Francija vienojās par tām piederošo teritoriju — Sīrijas un \nPalestīnas — robežu."};
                int random23 = ran.nextInt(dec23.length);
                text.setText("23. Decembra notikums:\n" + dec23[random23]);
            });
            n24.setOnAction(event -> {
                String[] dec24 = {"1851. — ugunsgrēks Kongresa bibliotēkā iznīcināja ap 35 000 grāmatu.",
                        "1924. — Albānija pasludināta par republiku.",
                        "1951. — Lībija ieguva neatkarību no Itālijas."};
                int random24 = ran.nextInt(dec24.length);
                text.setText("24. Decembra notikums:\n" + dec24[random24]);
            });
            n25.setOnAction(event -> {
                String[] dec25 = {"1643. — atklāta Ziemassvētku sala.",
                        "2008. — ar nesējraķeti Proton-M nogādāti orbītā 3 GLONASS pavadoņi.",
                        "1991. — Mihails Gorbačovs atkāpās no PSRS prezidenta amata."};
                int random25 = ran.nextInt(dec25.length);
                text.setText("25. Decembra notikums:\n" + dec25[random25]);
            });
            n26.setOnAction(event -> {
                String[] dec26 = {"1933. — patentēts FM radio.",
                        "2003. — 6,6 ballu spēcīga zemestrīce izpostīja Irānas dienvidaustrumus; dzīvību zaudēja vairāk \nnekā 40 000 cilvēku.",
                        "2004. — netālu no Sumatras, Indonēzijā, notika 9,0 ballu stipra zemestrīce, kas izraisīja cunami, \nkurā dzīvību zaudēja vairāk nekā 200 000 cilvēku."};
                int random26 = ran.nextInt(dec26.length);
                text.setText("26. Decembra notikums:\n" + dec26[random26]);
            });
            n27.setOnAction(event -> {
                String[] dec27 = {"1945. — Vašingtonā, ASV tika dibināts Starptautiskais Valūtas fonds.",
                        "2004. — novērots līdz šim spēcīgākais kosmiskās radiācijas uzliesmojums, kas nāca no magnetāra \nSGR 1806-20.",
                        "1831. — Čārlzs Darvins ar kuģi Beagle devās ceļojumā, kura laikā viņš formulēja evolūcijas \nteoriju."};
                int random27 = ran.nextInt(dec27.length);
                text.setText("27. Decembra notikums:\n" + dec27[random27]);
            });
            n28.setOnAction(event -> {
                String[] dec28 = {"1836. — Spānija atzina Meksikas neatkarību.",
                        "1846. — Aiova kļuva par ASV 29. štatu.",
                        "2007. — Nepāla likvidēja monarhiju, pasludinot valsti par republiku."};
                int random28 = ran.nextInt(dec28.length);
                text.setText("28. Decembra notikums:\n" + dec28[random28]);
            });
            n29.setOnAction(event -> {
                String[] dec29 = {"1845. — Teksasa kļuva par ASV 28. štatu.",
                        "1911. — Mongolija ieguva neatkarību.",
                        "1989. — Vāclavs Havels kļuva par Čehoslovākijas prezidentu."};
                int random29 = ran.nextInt(dec29.length);
                text.setText("29. Decembra notikums:\n" + dec29[random29]);
            });
            n30.setOnAction(event -> {
                String[] dec30 = {"1922. — dibināta Padomju Sociālistisko Republiku Savienība.",
                        "1993. — Izraēla un Vatikāns uzsāka diplomātiskās attiecības.",
                        "2006. — bijušais Irākas prezidents Sadams Huseins tika sodīts ar nāvi pakarot."};
                int random30 = ran.nextInt(dec30.length);
                text.setText("30. Decembra notikums:\n" + dec30[random30]);
            });
            n31.setOnAction(event -> {
                String[] dec31 = {"1963. — Centrālāfrikas Federācija sadalījās Zimbabvē, Malāvijā un Rodēzijā.",
                        "1918. — Vācijas armija atstāja Viļņu, kas palika Polijas pārvaldībā.",
                        "1991. — oficiāli beidza pastāvēt PSRS."};
                int random31 = ran.nextInt(dec31.length);
                text.setText("31. Decembra notikums:\n" + dec31[random31]);
            });
        });


        HBox box = new HBox(5);
        box.setPadding(new Insets(25, 5, 5, 50));
        box.getChildren().add(text);
        //visas pogas grupa lai nebutu jaliek pa vienai
        Group root = new Group(box, jan, text, feb, mar, apr, maj, jun, jul, aug, sep, okt, nov, dec, n1, n2, n3, n4, n5, n6, n7,
                n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21, n22, n23, n24, n25, n26, n27, n28, n29, n30, n31, topText, dateText);


        Scene scene = new Scene(root, 830, 390, Color.rgb(255, 178, 102));
        stage.setTitle("Šī Diena Vēsturē");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
