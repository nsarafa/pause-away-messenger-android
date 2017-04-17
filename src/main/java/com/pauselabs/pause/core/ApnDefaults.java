package com.pauselabs.pause.core;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.pauselabs.pause.core.MmsCommunication.MmsConnectionParameters;
import java.util.HashMap;
import java.util.Map;

public class ApnDefaults {

  private static final Map<String, MmsConnectionParameters> paramMap =
      new HashMap<String, MmsConnectionParameters>() {
        {

          //T-Mobile USA - Tested: Works
          put(
              "310260",
              new MmsConnectionParameters(
                  "http://mms.msg.eng.t-mobile.com/mms/wapenc", null, null));

          //AT&T - Tested
          put(
              "310410",
              new MmsConnectionParameters(
                  "http://mmsc.mobile.att.net", "proxy.mobile.att.net", "80"));

          //Verizon - Untested
          put(
              "310004",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "310005",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "310012",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));

          //Telenor Norway - Tested
          put("24201", new MmsConnectionParameters("http://mmsc", "10.10.10.11", "8080"));

          // Rogers - Untested
          put(
              "302720",
              new MmsConnectionParameters("http://mms.gprs.rogers.com", "10.128.1.69", "80"));

          // Virgin Mobile US - Untested
          put(
              "310053",
              new MmsConnectionParameters(
                  "http://mmsc.vmobl.com:8080/mms", "205.239.233.136", "81"));

          // Slovenia MOBITEL - Untested
          put(
              "29341",
              new MmsConnectionParameters(
                  "http://mms.mobitel.si/servlets/mms", "213.229.249.40", "8080"));

          // Slovenia SI.MOBIL - Untested
          put("29340", new MmsConnectionParameters("http://mmc", "80.95.224.46", "9201"));

          // Slovenia TUSMOBIL - Untested
          put(
              "29370",
              new MmsConnectionParameters("http://mms.tusmobil.si:8002", "91.185.221.85", "8002"));

          // Slovenia T-2 - Untested
          put(
              "29364",
              new MmsConnectionParameters("http://www.mms.t-2.net:8002", "172.20.18.137", "8080"));

          // UK giffgaff -Tested
          put(
              "23410",
              new MmsConnectionParameters(
                  "http://mmsc.mediamessaging.co.uk:8002", "193.113.200.195", "8080"));

          put(
              "00000",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "000000",
              new MmsConnectionParameters("http://mms.plspictures.com", "68.28.31.7", "80"));
          put(
              "00011",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "007007",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "007038",
              new MmsConnectionParameters(
                  "http://mms.mycricket.com/servlets/mms", "wap.mycricket.com", "8080"));
          put(
              "007127",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put("100000", new MmsConnectionParameters("http://mms.movilnet.com.ve", null, null));
          put(
              "1023111",
              new MmsConnectionParameters("http://mms.plspictures.com", "68.28.31.7", "80"));
          put(
              "1023127",
              new MmsConnectionParameters(
                  "http://mms.mycricket.com/servlets/mms", "wap.mycricket.com", "8080"));
          put(
              "1023456",
              new MmsConnectionParameters(
                  "http://mms.mycricket.com/servlets/mms", "wap.mycricket.com", "8080"));
          put(
              "11100",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "111038",
              new MmsConnectionParameters(
                  "http://mmsc.vmobl.com:8088/mms?", "205.239.233.136", "81"));
          put(
              "11111",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "111111",
              new MmsConnectionParameters(
                  "http://mmsc.vmobl.com:8088/mms?", "205.239.233.136", "81"));
          put(
              "118038",
              new MmsConnectionParameters(
                  "http://mms.mycricket.com/servlets/mms", "wap.mycricket.com", "8080"));
          put(
              "123456",
              new MmsConnectionParameters(
                  "http://pix.cspire.com/servlets/mms", "66.175.144.91", "80"));
          put(
              "134038",
              new MmsConnectionParameters(
                  "http://mms.mycricket.com/servlets/mms", "wap.mycricket.com", "8080"));
          put(
              "13438",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "20201",
              new MmsConnectionParameters("http://mmsc.cosmote.gr:8002", "10.10.10.20", "8080"));
          put(
              "20205",
              new MmsConnectionParameters("http://mms.vodafone.gr", "213.249.19.49", "5080"));
          put(
              "20210",
              new MmsConnectionParameters(
                  "http://192.168.200.95/servlets/mms", "192.168.200.11", "9401"));
          put(
              "20404",
              new MmsConnectionParameters(
                  "http://mmsc.mms.vodafone.nl", "192.168.251.150", "8799"));
          put(
              "20408",
              new MmsConnectionParameters("http://mp.mobiel.kpn/mmsc", "10.10.100.20", "5080"));
          put("20416", new MmsConnectionParameters("http://t-mobilemms", "10.10.10.11", "8080"));
          put(
              "20601",
              new MmsConnectionParameters("http://mmsc.proximus.be/mms", "10.55.14.75", "8080"));
          put(
              "20610",
              new MmsConnectionParameters("http://mmsc.mobistar.be", "212.65.63.143", "8080"));
          put("20620", new MmsConnectionParameters("http://mmsc.base.be", "217.72.235.1", "8080"));
          put(
              "20801",
              new MmsConnectionParameters("http://mms.orange.fr/", "192.168.10.200", "8080"));
          put(
              "20802",
              new MmsConnectionParameters("http://mms.orange.fr/", "192.168.10.200", "8080"));
          put("20810", new MmsConnectionParameters("http://mms1", "10.151.0.1", "8080"));
          put("20811", new MmsConnectionParameters("http://mms1", "10.151.0.1", "8080"));
          put("20813", new MmsConnectionParameters("http://mms1", "10.151.0.1", "8080"));
          put("20815", new MmsConnectionParameters("http://212.27.40.225", null, null));
          put(
              "20820",
              new MmsConnectionParameters(
                  "http://mms.bouyguestelecom.fr/mms/wapenc", "62.201.129.226", "8080"));
          put(
              "20888",
              new MmsConnectionParameters("http://mms.orange.fr/", "192.168.10.200", "8080"));
          put(
              "209088",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "209090",
              new MmsConnectionParameters(
                  "http://mms.mycricket.com/servlets/mms", "wap.mycricket.com", "8080"));
          put(
              "209099",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "21401",
              new MmsConnectionParameters(
                  "http://mmsc.vodafone.es/servlets/mms", "212.73.32.10", "80"));
          put(
              "21403",
              new MmsConnectionParameters("http://mms.orange.es", "172.22.188.25", "8080"));
          put(
              "21407",
              new MmsConnectionParameters("http://mms.movistar.com", "10.138.255.5", "8080"));
          put(
              "21601",
              new MmsConnectionParameters("http://mmsc.telenor.hu/", "84.225.255.1", "8080"));
          put(
              "21630",
              new MmsConnectionParameters(
                  "http://mms.t-mobile.hu/servlets/mms", "212.051.126.010", "8080"));
          put(
              "21670",
              new MmsConnectionParameters(
                  "http://mms.vodafone.hu/servlets/mms", "80.244.97.2", "8080"));
          put(
              "21901",
              new MmsConnectionParameters(
                  "http://mms.t-mobile.hr/servlets/mms", "10.12.0.4", "8080"));
          put("21902", new MmsConnectionParameters("http://mmsc.tele2.hr", "193.12.40.66", "8080"));
          put(
              "21910",
              new MmsConnectionParameters(
                  "http://mms.vipnet.hr/servlets/mms", "212.91.99.91", "8080"));
          put(
              "22001",
              new MmsConnectionParameters(
                  "http://mms.telenor.rs/servlets/mms", "217.65.192.33", "8080"));
          put(
              "22003",
              new MmsConnectionParameters(
                  "http://mms.mts064.telekom.rs/mms/wapenc", "172.17.85.131", "8080"));
          put(
              "22005",
              new MmsConnectionParameters("http://mmsc.vipmobile.rs", "212.15.182.82", "8080"));
          put(
              "22201",
              new MmsConnectionParameters(
                  "http://mms.tim.it/servlets/mms", "213.230.130.89", "80"));
          put(
              "222038",
              new MmsConnectionParameters(
                  "http://mms.mycricket.com/servlets/mms", "wap.mycricket.com", "8080"));
          put(
              "22210",
              new MmsConnectionParameters(
                  "http://mms.vodafone.it/servlets/mms", "10.128.224.10", "80"));
          put(
              "22288",
              new MmsConnectionParameters("http://mms.wind.it", "212.245.244.100", "8080"));
          put(
              "22299",
              new MmsConnectionParameters(
                  "http://10.216.59.240:10021/mmsc", "62.13.171.3", "8799"));
          put(
              "22601",
              new MmsConnectionParameters(
                  "http://multimedia/servlets/mms", "193.230.161.231", "8080"));
          put(
              "22606",
              new MmsConnectionParameters(
                  "http://mmsc1.mms.cosmote.ro:8002", "10.252.1.62", "8080"));
          put(
              "22610",
              new MmsConnectionParameters(
                  "http://wap.mms.orange.ro:8002", "62.217.247.252", "8799"));
          put(
              "22801",
              new MmsConnectionParameters("http://mms.natel.ch:8079", "192.168.210.2", "8080"));
          put(
              "22802",
              new MmsConnectionParameters("http://mmsc.sunrise.ch", "212.35.34.75", "8080"));
          put(
              "22803",
              new MmsConnectionParameters("http://192.168.151.3:8002", "192.168.151.2", "8080"));
          put("23001", new MmsConnectionParameters("http://mms", "10.0.0.10", "80"));
          put(
              "23002",
              new MmsConnectionParameters(
                  "http://mms.o2active.cz:8002", "160.218.160.218", "8080"));
          put("23003", new MmsConnectionParameters("http://mms", "10.11.10.111", "80"));
          put(
              "23101",
              new MmsConnectionParameters("http://imms.orange.sk", "213.151.208.145", "8799"));
          put("23102", new MmsConnectionParameters("http://mms", "192.168.1.1", "8080"));
          put(
              "23106",
              new MmsConnectionParameters("http://mms.o2world.sk:8002", "10.97.1.11", "8080"));
          put("23201", new MmsConnectionParameters("http://mmsc.A1.net", "194.48.124.71", "8001"));
          put(
              "23203",
              new MmsConnectionParameters(
                  "http://mmsc.t-mobile.at/servlets/mms", "10.12.0.20", "80"));
          put(
              "23205",
              new MmsConnectionParameters(
                  "http://mmsc.orange.at/mms/wapenc", "194.24.128.118", "8080"));
          put("23210", new MmsConnectionParameters("http://mmsc", "213.094.078.133", "8799"));
          put(
              "23410",
              new MmsConnectionParameters("http://mmsc.mms.o2.co.uk:8002", "82.132.254.1", "8080"));
          put(
              "23415",
              new MmsConnectionParameters(
                  "http://mms.vodafone.co.uk/servlets/mms", "212.183.137.12", "8799"));
          put(
              "23420",
              new MmsConnectionParameters(
                  "http://mms.um.three.co.uk:10021/mmsc", "mms.three.co.uk", "8799"));
          put(
              "23430",
              new MmsConnectionParameters("http://mms.orange.co.uk/", "192.168.224.10", "8080"));
          put(
              "23433",
              new MmsConnectionParameters("http://mms.orange.co.uk/", "192.168.224.10", "8080"));
          put(
              "23801",
              new MmsConnectionParameters("http://mmsc.tdc.dk:8002", "194.182.251.15", "8080"));
          put("23802", new MmsConnectionParameters("http://mms.telenor.dk", "212.88.64.8", "8080"));
          put("23806", new MmsConnectionParameters("http://mms.3.dk", "mmsproxy.3.dk", "8799"));
          put(
              "23820",
              new MmsConnectionParameters("http://mms.telia.dk", "193.209.134.131", "8080"));
          put("24001", new MmsConnectionParameters("http://mmss", "193.209.134.132", "80"));
          put("24002", new MmsConnectionParameters("http://mms.tre.se", "mmsproxy.tre.se", "8799"));
          put("24004", new MmsConnectionParameters("http://mms.tre.se", "mmsproxy.tre.se", "8799"));
          put(
              "24005",
              new MmsConnectionParameters("http://mmsc.tele2.se", "130.244.202.30", "8080"));
          put(
              "24007",
              new MmsConnectionParameters("http://mmsc.tele2.se", "130.244.202.30", "8080"));
          put("24008", new MmsConnectionParameters("http://mms", "172.30.253.241", "8799"));
          put(
              "24024",
              new MmsConnectionParameters("http://mmsc.tele2.se", "130.244.202.30", "8080"));
          put("24201", new MmsConnectionParameters("http://mmsc/", "10.10.10.11", "8080"));
          put("24202", new MmsConnectionParameters("http://mm", "212.169.66.4", "8080"));
          put("24205", new MmsConnectionParameters("http://mms.nwn.no", "188.149.250.10", "80"));
          put(
              "24405",
              new MmsConnectionParameters("http://mms.saunalahti.fi:8002", "62.142.4.197", "8080"));
          put(
              "24412",
              new MmsConnectionParameters("http://mmsc.dnafinland.fi", "10.1.1.2", "8080"));
          put(
              "24491",
              new MmsConnectionParameters("http://mms.sonera.fi:8002", "195.156.25.33", "80"));
          put(
              "24601",
              new MmsConnectionParameters(
                  "http://mms.omnitel.net:8002/", "194.176.32.149", "8080"));
          put(
              "24602",
              new MmsConnectionParameters("http://mmsc/servlets/mms", "192.168.150.2", "8080"));
          put(
              "24603",
              new MmsConnectionParameters("http://mmsc.tele2.lt", "193.012.040.029", "8080"));
          put(
              "24701",
              new MmsConnectionParameters("http://mmsc.lmt.lv/mmsc", "212.93.97.201", "8080"));
          put("24702", new MmsConnectionParameters("http://mmsc.tele2.lv", "193.12.40.38", "8080"));
          put("25001", new MmsConnectionParameters("http://mmsc", "192.168.192.192", "8080"));
          put("25002", new MmsConnectionParameters("http://mmsc:8002", "10.10.10.10", "8080"));
          put("25003", new MmsConnectionParameters("http://10.0.3.50", "10.0.3.20", "8080"));
          put("25012", new MmsConnectionParameters("http://mmsc/mms", "10.10.17.2", "8080"));
          put(
              "25016",
              new MmsConnectionParameters("http://mmsc.vntc.ru/was", "80.243.64.68", "8080"));
          put("25020", new MmsConnectionParameters("http://mmsc.tele2.ru", "193.12.40.65", "8080"));
          put("25035", new MmsConnectionParameters("http://mms.ycc.ru", "172.16.2.10", "8080"));
          put("25039", new MmsConnectionParameters("http://mms", "192.168.168.192", "8080"));
          put("25099", new MmsConnectionParameters("http://mms/", "192.168.94.23", "8080"));
          put("25501", new MmsConnectionParameters("http://mmsc:8002/", "192.168.10.10", "8080"));
          put(
              "25503",
              new MmsConnectionParameters("http://mms.kyivstar.net", "10.10.10.10", "8080"));
          put(
              "25506",
              new MmsConnectionParameters(
                  "http://mms.life.com.ua/cmmsc/post", "212.58.162.230", "8080"));
          put(
              "25701",
              new MmsConnectionParameters(
                  "http://mms.velcom.by/servlets/mms", "10.200.15.15", "8080"));
          put("25702", new MmsConnectionParameters("http://mmsc", "192.168.192.168", "8080"));
          put(
              "25704",
              new MmsConnectionParameters("http://mms.life.com.by/mmsc", "10.10.10.20", "8080"));
          put(
              "26001",
              new MmsConnectionParameters("http://mms.plusgsm.pl:8002", "212.2.96.16", "8080"));
          put(
              "26002",
              new MmsConnectionParameters("http://mms/servlets/mms", "213.158.194.226", "8080"));
          put(
              "26003",
              new MmsConnectionParameters("http://mms.orange.pl", "192.168.6.104", "8080"));
          put(
              "26006",
              new MmsConnectionParameters("http://10.10.28.164/mms/wapenc", "10.10.25.5", "8080"));
          put(
              "26201",
              new MmsConnectionParameters(
                  "http://mms.t-mobile.de/servlets/mms", "172.28.23.131", "8008"));
          put(
              "26202",
              new MmsConnectionParameters("http://139.7.24.1/servlets/mms", "139.7.29.17", "80"));
          put("26203", new MmsConnectionParameters("http://mms/eplus/", "212.23.97.153", "5080"));
          put(
              "26207",
              new MmsConnectionParameters("http://10.81.0.7:8002", "82.113.100.5", "8080"));
          put(
              "26801",
              new MmsConnectionParameters(
                  "http://mms.vodafone.pt/servlets/mms", "iproxy.vodafone.pt", "80"));
          put(
              "26803",
              new MmsConnectionParameters("http://mmsc:10021/mmsc", "62.169.66.5", "8799"));
          put("26806", new MmsConnectionParameters("http://mmsc/", "10.111.2.16", "8080"));
          put("27001", new MmsConnectionParameters("http://mmsc.pt.lu", "194.154.192.88", "8080"));
          put("27077", new MmsConnectionParameters("http://mms.tango.lu", "212.66.75.3", "8080"));
          put(
              "27099",
              new MmsConnectionParameters("http://mms.orange.lu", "212.88.139.44", "8080"));
          put(
              "27201",
              new MmsConnectionParameters("http://www.vodafone.ie/mms", "10.24.59.200", "80"));
          put(
              "27202",
              new MmsConnectionParameters("http://mmsc.mms.o2.ie:8002", "62.40.32.40", "8080"));
          put(
              "27203",
              new MmsConnectionParameters("http://mms.mymeteor.ie", "10.85.85.85", "8799"));
          put(
              "27205",
              new MmsConnectionParameters(
                  "http://mms.um.3ireland.ie:10021/mmsc", "mms.3ireland.ie", "8799"));
          put(
              "27401",
              new MmsConnectionParameters(
                  "http://mms.simi.is/servlets/mms", "213.167.138.200", "8080"));
          put(
              "27402",
              new MmsConnectionParameters("http://mmsc.vodafone.is", "10.22.0.10", "8080"));
          put("27411", new MmsConnectionParameters("http://mmsc.nova.is", "10.10.2.60", "8080"));
          put("28310", new MmsConnectionParameters("http://mms/", "192.168.220.251", "3128"));
          put("28401", new MmsConnectionParameters("http://mmsc/", "10.150.0.33", "8080"));
          put(
              "28405",
              new MmsConnectionParameters(
                  "http://mmsc1.mms.globul.bg:8002", "192.168.087.011", "8004"));
          put(
              "28601",
              new MmsConnectionParameters(
                  "http://mms.turkcell.com.tr/servlets/mms", "212.252.169.217", "8080"));
          put(
              "28602",
              new MmsConnectionParameters(
                  "http://217.31.233.18:6001/MM1Servlet", "217.31.233.18", "9401"));
          put(
              "28603",
              new MmsConnectionParameters(
                  "http://mms.avea.com.tr/servlets/mms", "213.161.151.201", "8080"));
          put("29340", new MmsConnectionParameters("http://mmc", "80.95.224.46", "9201"));
          put(
              "29341",
              new MmsConnectionParameters(
                  "http://mms.mobitel.si/servlets/mms", "213.229.249.40", "8080"));
          put(
              "29370",
              new MmsConnectionParameters("http://mms.tusmobil.si:8002", "91.185.221.85", "8080"));
          put(
              "302065",
              new MmsConnectionParameters(
                  "http://mms01.publicmobile.clearmode.com/mms/", "74.200.29.50", "80"));
          put(
              "302220",
              new MmsConnectionParameters(
                  "http://aliasredirect.net/proxy/mmsc", "74.49.0.18", "80"));
          put(
              "302320",
              new MmsConnectionParameters("http://mms.mobilicity.net", "10.100.3.4", "8080"));
          put(
              "302490",
              new MmsConnectionParameters("http://mms.windmobile.ca", "74.115.197.70", "8080"));
          put(
              "302500",
              new MmsConnectionParameters("http://media.videotron.com", "10.208.89.17", "8080"));
          put(
              "302610",
              new MmsConnectionParameters(
                  "http://mms.bell.ca/mms/wapenc", "web.wireless.bell.ca", "80"));
          put(
              "302720",
              new MmsConnectionParameters("http://mms.gprs.rogers.com", "10.128.1.69", "80"));
          put(
              "302780",
              new MmsConnectionParameters("http://mms.sasktel.com", "mig.sasktel.com", "80"));
          put(
              "302880",
              new MmsConnectionParameters(
                  "http://aliasredirect.net/proxy/koodo/mmsc", "74.49.0.18", "80"));
          put(
              "31000",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "310000",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310001",
              new MmsConnectionParameters(
                  "http://mms.mycricket.com/servlets/mms", "wap.mycricket.com", "8080"));
          put(
              "310004",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "310007",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put("31001", new MmsConnectionParameters("http://mms.sprintpcs.com", null, null));
          put(
              "310012",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "310016",
              new MmsConnectionParameters(
                  "http://mms.mycricket.com/servlets/mms", "wap.mycricket.com", "8080"));
          put(
              "31002",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310020",
              new MmsConnectionParameters("http://mms.unionwireless.com", "166.230.4.83", "80"));
          put("310027", new MmsConnectionParameters("http://mms.sprintpcs.com", null, null));
          put(
              "31003",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put("310035", new MmsConnectionParameters("http://mmsi.etex.mobi", null, null));
          put(
              "310038",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310050",
              new MmsConnectionParameters("http://mmsc1.acsalaska.net/servlets/mms", null, null));
          put(
              "31006",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31007",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31008",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310080",
              new MmsConnectionParameters(
                  "http://m.iot1.com/corr/mms.php", "74.112.57.173", "9201"));
          put(
              "310088",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "31009",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310090",
              new MmsConnectionParameters(
                  "http://mms.mycricket.com/servlets/mms", "wap.mycricket.com", "8080"));
          put(
              "310099",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put("310100", new MmsConnectionParameters("http://mms", "172.23.253.206", "8080"));
          put(
              "31012",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put("310120", new MmsConnectionParameters("http://mms.sprintpcs.com", null, null));
          put(
              "310127",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "31013",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31016",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31018",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put("310180", new MmsConnectionParameters("http://mms.wcc.net", "209.55.70.246", "80"));
          put(
              "31022",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31023",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31024",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31025",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31026",
              new MmsConnectionParameters(
                  "http://mms.msg.eng.t-mobile.com/mms/wapenc", null, null));
          put(
              "310260",
              new MmsConnectionParameters(
                  "http://mms.msg.eng.t-mobile.com/mms/wapenc", null, null));
          put(
              "31027",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31028",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31029",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31030",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310320",
              new MmsConnectionParameters(
                  "http://mmsc.c1neaz.csky.us:6672", "209.4.229.94", "9401"));
          put(
              "31033",
              new MmsConnectionParameters(
                  "http://mms.alltel.com/servlets/mms", "mms.alltel.com", "8080"));
          put(
              "310330",
              new MmsConnectionParameters(
                  "http://mms.alltel.com/servlets/mms", "mms.alltel.com", "8080"));
          put(
              "310340",
              new MmsConnectionParameters(
                  "http://mms2.westlinkcom.com/mms/", "199.221.134.43", "8080"));
          put(
              "31035",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put("310360", new MmsConnectionParameters("http://mms1.zsend.com", null, null));
          put(
              "31038",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31039",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put("31040", new MmsConnectionParameters("http://mms.sprintpcs.com", "68.28.31.7", "80"));
          put(
              "31041",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310410",
              new MmsConnectionParameters(
                  "http://mmsc.mobile.att.net", "proxy.mobile.att.net", "80"));
          put(
              "31042",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310420",
              new MmsConnectionParameters("http://mms.gocbw.com:8088/mms", "216.68.79.202", "80"));
          put(
              "31043",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31045",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310450",
              new MmsConnectionParameters("http://mms.viaero.com", "10.168.3.23", "9401"));
          put(
              "31046",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put("31047", new MmsConnectionParameters("http://mms.ntelospcs.net/", null, null));
          put("310470", new MmsConnectionParameters("http://mms.ntelospcs.net/", null, null));
          put(
              "31048",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310480",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "31051",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put("31053", new MmsConnectionParameters("http://mms.sprintpcs.com", null, null));
          put(
              "31057",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310570",
              new MmsConnectionParameters(
                  "http://mmsc.mtpcs.csky.us:6672/", "209.4.229.229", "9201"));
          put(
              "31058",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31059",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310590",
              new MmsConnectionParameters(
                  "http://mmsc.cingular.com", "wireless.cingular.com", "80"));
          put(
              "31060",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310600",
              new MmsConnectionParameters(
                  "http://mms.cellcom.com/cellcom/mms.php", "66.255.055.023", "9201"));
          put(
              "31064",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310650",
              new MmsConnectionParameters(
                  "http://mms.unitedwireless.com/united/mms.php", null, null));
          put(
              "31066",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31069",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31070",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31072",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "31073",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310730",
              new MmsConnectionParameters(
                  "http://mms.msg.eng.t-mobile.com/mms/wapenc", null, null));
          put(
              "31074",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310750",
              new MmsConnectionParameters(
                  "http://interop.myawi.com/ekn/mms.php", "66.255.55.23", "9201"));
          put(
              "31076",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310770",
              new MmsConnectionParameters(
                  "http://mmsc.iwireless.dataonair.net:6672", "209.4.229.31", "9201"));
          put(
              "31078",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31079",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31080",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31081",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31083",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31087",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310870",
              new MmsConnectionParameters(
                  "http://mms.iot1.com/kaplan/mms.php", "10.10.0.97", "9201"));
          put("310880", new MmsConnectionParameters("http://mmsdtcw.com", "192.168.20.42", "80"));
          put(
              "31089",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "310890",
              new MmsConnectionParameters(
                  "http://mmsc.cingular.com", "wireless.cingular.com", "80"));
          put(
              "31092",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31095",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31096",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put("310960", new MmsConnectionParameters("http://mms.rinawireless.com", null, null));
          put(
              "31098",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "31099",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put("31100", new MmsConnectionParameters("http://mmsc1.uscc.net/mmsc/MMS", null, null));
          put(
              "311000",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put("311030", new MmsConnectionParameters("http://mmsgprs.com", "10.213.2.68", "80"));
          put(
              "311040",
              new MmsConnectionParameters(
                  "http://mms.msg.eng.t-mobile.com/mms/wapenc", null, null));
          put(
              "311080",
              new MmsConnectionParameters("http://69.8.34.146/mms/", "69.8.34.146", "9401"));
          put(
              "311090",
              new MmsConnectionParameters(
                  "http://mms.longlines.com/mms", "66.172.210.195", "8080"));
          put(
              "311100",
              new MmsConnectionParameters("http://mms.ntwls.net/nex-tech/mms.php", null, null));
          put(
              "31111",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "311127",
              new MmsConnectionParameters("http://pix.cellularsouth.com/servlets/mms", null, null));
          put(
              "311148",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "311190",
              new MmsConnectionParameters(
                  "http://mms.cellular1.net/ecit/mms.php", "10.10.0.97", "9201"));
          put("31122", new MmsConnectionParameters("http://mmsc1.uscc.net/mmsc/MMS", null, null));
          put("311220", new MmsConnectionParameters("http://mmsc1.uscc.net/mmsc/MMS", null, null));
          put(
              "31123",
              new MmsConnectionParameters("http://pix.cellularsouth.com/servlets/mms", null, null));
          put("311230", new MmsConnectionParameters("http://pix.cellularsouth.com/", null, null));
          put(
              "311340",
              new MmsConnectionParameters(
                  "http://mms.iot1.com/ivc/mms.php", "66.255.55.23", "9201"));
          put(
              "31135",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "311370",
              new MmsConnectionParameters("http://mmsc.gci.csky.us:6672", "209.4.229.92", "9201"));
          put(
              "31144",
              new MmsConnectionParameters(
                  "http://mms.iot1.com/bluegrass/mms.php", "66.255.55.23", "9201"));
          put(
              "311440",
              new MmsConnectionParameters("http://mms.iot1.com/bluegrass/mms.php", null, null));
          put("311470", new MmsConnectionParameters("http://mms.innovativevi.net", null, null));
          put(
              "311480",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "311490",
              new MmsConnectionParameters(
                  "http://mmsc.vmobl.com:8088/mms?", "205.239.233.136", "81"));
          put("311580", new MmsConnectionParameters("http://mmsc1.uscc.net/mmsc/MMS", null, null));
          put("31165", new MmsConnectionParameters("http://mms.sprintpcs.com", "68.28.31.7", "80"));
          put(
              "311660",
              new MmsConnectionParameters(
                  "http://mms.metropcs.net:3128/mmsc", "proxy.metropcs.net", "3128"));
          put(
              "311700",
              new MmsConnectionParameters(
                  "http://mms.elementmobile.net", "69.147.217.001", "8080"));
          put(
              "31172",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "311870",
              new MmsConnectionParameters("http://mm.myboostmobile.com", "68.28.31.7", "80"));
          put(
              "31600",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "31638",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put("3167", new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put(
              "31672",
              new MmsConnectionParameters("http://mms.vtext.com/servlets/mms", null, null));
          put("33000", new MmsConnectionParameters("http://mms.sprintpcs.com", "68.28.31.7", "80"));
          put(
              "330000",
              new MmsConnectionParameters("http://mms.openmobilepr.com:1981/", null, null));
          put(
              "330110",
              new MmsConnectionParameters(
                  "http://mmsg.claropr.com:10021/mmsc", "10.50.38.3", "8799"));
          put("33038", new MmsConnectionParameters("http://mms.sprintpcs.com", "68.28.31.7", "80"));
          put(
              "3307",
              new MmsConnectionParameters("http://mm.myboostmobile.com", "68.28.31.7", "80"));
          put(
              "334020",
              new MmsConnectionParameters(
                  "http://mms.itelcel.com/servlets/mms", "148.233.151.240", "8080"));
          put("33403", new MmsConnectionParameters("http://mms.movistar.mx", "10.2.20.1", "80"));
          put(
              "334050",
              new MmsConnectionParameters("http://mms.iusacell3g.com/", "192.200.1.110", "9201"));
          put(
              "34001",
              new MmsConnectionParameters(
                  "http://193.251.160.246/servlets/mms", "10.0.0.10", "8082"));
          put(
              "40001",
              new MmsConnectionParameters(
                  "http://mms.azercell.com/cMMSC/post", "10.0.154.101", "8080"));
          put(
              "40101",
              new MmsConnectionParameters(
                  "http://mms.beeline.kz/mms/wapenc", "172.27.6.93", "8080"));
          put(
              "40102",
              new MmsConnectionParameters("http://mms.kcell.kz/post", "195.47.255.7", "8080"));
          put(
              "40402",
              new MmsConnectionParameters(
                  "http://100.1.201.171:10021/mmsc", "100.1.201.172", "8799"));
          put(
              "40405",
              new MmsConnectionParameters(
                  "http://mms1.live.vodafone.in/mms/", "10.10.1.100", "9401"));
          put(
              "40407",
              new MmsConnectionParameters("http://10.4.42.21:8002/", "10.4.42.15", "8080"));
          put(
              "40410",
              new MmsConnectionParameters(
                  "http://100.1.201.171:10021/mmsc", "100.1.201.172", "8799"));
          put(
              "40411",
              new MmsConnectionParameters(
                  "http://mms1.live.vodafone.in/mms/", "10.10.1.100", "9401"));
          put(
              "40413",
              new MmsConnectionParameters(
                  "http://mms1.live.vodafone.in/mms/", "10.10.1.100", "9401"));
          put(
              "40419",
              new MmsConnectionParameters("http://10.4.42.21:8002/", "10.4.42.15", "8080"));
          put(
              "40420",
              new MmsConnectionParameters(
                  "http://mms1.live.vodafone.in/mms/", "10.10.1.100", "9401"));
          put(
              "40422",
              new MmsConnectionParameters("http://10.4.42.21:8002/", "10.4.42.15", "8080"));
          put("40424", new MmsConnectionParameters("http://10.4.42.21:8002", "10.4.42.15", "8080"));
          put(
              "40427",
              new MmsConnectionParameters(
                  "http://mms1.live.vodafone.in/mms/", "10.10.1.100", "9401"));
          put(
              "40430",
              new MmsConnectionParameters(
                  "http://mms1.live.vodafone.in/mms/", "10.10.1.100", "9401"));
          put(
              "40440",
              new MmsConnectionParameters(
                  "http://100.1.201.171:10021/mmsc", "100.1.201.172", "8799"));
          put("40444", new MmsConnectionParameters("http://10.4.42.21:8002", "10.4.42.15", "8080"));
          put(
              "40445",
              new MmsConnectionParameters(
                  "http://100.1.201.171:10021/mmsc", "100.1.201.172", "8799"));
          put(
              "40449",
              new MmsConnectionParameters(
                  "http://100.1.201.171:10021/mmsc", "100.1.201.172", "8799"));
          put(
              "40456",
              new MmsConnectionParameters("http://10.4.42.21:8002/", "10.4.42.15", "8080"));
          put(
              "40464",
              new MmsConnectionParameters("http://bsnlmmsc.in:8514", "10.210.10.11", "8080"));
          put("40466", new MmsConnectionParameters("http://bsnlmmsc.in", "10.210.10.11", "8080"));
          put(
              "40470",
              new MmsConnectionParameters(
                  "http://100.1.201.171:10021/mmsc", "100.1.201.172", "8799"));
          put(
              "40478",
              new MmsConnectionParameters("http://10.4.42.21:8002/", "10.4.42.15", "8080"));
          put(
              "40486",
              new MmsConnectionParameters(
                  "http://mms1.live.vodafone.in/mms/", "10.10.1.100", "9401"));
          put(
              "40488",
              new MmsConnectionParameters(
                  "http://mms1.live.vodafone.in/mms/", "10.10.1.100", "9401"));
          put(
              "40490",
              new MmsConnectionParameters(
                  "http://100.1.201.171:10021/mmsc", "100.1.201.172", "8799"));
          put(
              "40492",
              new MmsConnectionParameters(
                  "http://100.1.201.171:10021/mmsc", "100.1.201.172", "8799"));
          put(
              "40494",
              new MmsConnectionParameters(
                  "http://100.1.201.171:10021/mmsc", "100.1.201.172", "8799"));
          put(
              "40497",
              new MmsConnectionParameters(
                  "http://100.1.201.171:10021/mmsc", "100.1.201.172", "8799"));
          put(
              "40498",
              new MmsConnectionParameters(
                  "http://100.1.201.171:10021/mmsc", "100.1.201.172", "8799"));
          put("405025", new MmsConnectionParameters("http://mmsc/", "10.124.26.94", "8799"));
          put("405030", new MmsConnectionParameters("http://mmsc/", "10.124.26.94", "8799"));
          put("405034", new MmsConnectionParameters("http://mmsc/", "10.124.26.94", "8799"));
          put("405037", new MmsConnectionParameters("http://mmsc/", "10.124.26.94", "8799"));
          put("405039", new MmsConnectionParameters("http://mmsc/", "10.124.26.94", "8799"));
          put("405044", new MmsConnectionParameters("http://mmsc/", "10.124.26.94", "8799"));
          put(
              "40554",
              new MmsConnectionParameters(
                  "http://100.1.201.171:10021/mmsc", "100.1.201.172", "8799"));
          put(
              "405751",
              new MmsConnectionParameters(
                  "http://mms1.live.vodafone.in/mms/", "10.10.1.100", "9401"));
          put(
              "405799",
              new MmsConnectionParameters("http://10.4.42.21:8002/", "10.4.42.15", "8080"));
          put(
              "405800",
              new MmsConnectionParameters(
                  "http://10.50.1.166/servlets/mms", "172.017.083.069", "8080"));
          put("41001", new MmsConnectionParameters("http://mms/", "172.25.20.12", "8080"));
          put(
              "41003",
              new MmsConnectionParameters("http://www.ufonemms.com:80/", "172.16.13.27", "8080"));
          put("41004", new MmsConnectionParameters("http://10.81.6.11:8080", "10.81.6.33", "8000"));
          put("41006", new MmsConnectionParameters("http://mmstelenor", "172.18.19.11", "8080"));
          put(
              "41007",
              new MmsConnectionParameters("http://10.4.0.132/servlets/MMS", "10.4.2.1", "8080"));
          put(
              "41301",
              new MmsConnectionParameters("http://192.168.50.165", "192.168.50.163", "8080"));
          put(
              "41302",
              new MmsConnectionParameters(
                  "http://mms.dialog.lk:3130/mmsc", "192.168.122.2", "8080"));
          put("41305", new MmsConnectionParameters("http://mmsc/", "10.200.184.86", "8080"));
          put(
              "41601",
              new MmsConnectionParameters("http://mms.jo.zain.com/", "192.168.55.10", "80"));
          put("41603", new MmsConnectionParameters("http://mms.umniah.com/", "10.1.1.10", "8080"));
          put(
              "41677",
              new MmsConnectionParameters("http://172.16.1.96/servlets/mms", "172.16.1.2", "8080"));
          put(
              "41805",
              new MmsConnectionParameters(
                  "http://192.168.107.10:19090/was", "192.168.107.50", "8080"));
          put("41902", new MmsConnectionParameters("http://mms.zain", "176.0.0.65", "8080"));
          put("42001", new MmsConnectionParameters("http://mms.net.sa:8002", "10.1.1.1", "8080"));
          put(
              "42003",
              new MmsConnectionParameters("http://10.3.3.133:9090/was", "10.3.2.133", "8080"));
          put(
              "42202",
              new MmsConnectionParameters(
                  "http://mmsc.omanmobile.om:10021/mmsc", "192.168.203.35", "8080"));
          put(
              "42203",
              new MmsConnectionParameters(
                  "http://10.128.240.16/servlets/mms", "10.128.240.19", "8080"));
          put(
              "42402",
              new MmsConnectionParameters("http://mms/servlets/mms", "10.12.0.32", "8080"));
          put("42403", new MmsConnectionParameters("http://mms.du.ae", "10.19.18.4", "8080"));
          put(
              "42501",
              new MmsConnectionParameters("http://192.168.220.15/servlets/mms", null, null));
          put(
              "42502",
              new MmsConnectionParameters("http://mms.cellcom.co.il", "vwapm2.ain.co.il", "8080"));
          put(
              "42503",
              new MmsConnectionParameters(
                  "http://mmsu.pelephone.net.il", "10.170.252.104", "9093"));
          put(
              "42505",
              new MmsConnectionParameters(
                  "http://mms.jawwal.ps/servlets/mms", "213.244.118.129", "8080"));
          put(
              "42507",
              new MmsConnectionParameters("http://mms.hotmobile.co.il", "80.246.131.99", "80"));
          put(
              "42508",
              new MmsConnectionParameters("http://mmsc.golantelecom.co.il", "10.224.228.81", "80"));
          put("42602", new MmsConnectionParameters("http://172.18.83.129", "172.18.85.34", "80"));
          put("42701", new MmsConnectionParameters("http://mmsr.qtelmms.qa", "10.23.8.3", "8080"));
          put("43235", new MmsConnectionParameters("http://mms:8002", "10.131.26.138", "8080"));
          put("43404", new MmsConnectionParameters("http://mms", "172.30.30.166", "8080"));
          put("43405", new MmsConnectionParameters("http://mmsc:8002/", "10.64.164.10", "8080"));
          put("44010", new MmsConnectionParameters("http://mmsc.ktfwing.com:9082", null, null));
          put(
              "44020",
              new MmsConnectionParameters("http://mms/", "smilemms.softbank.ne.jp", "8080"));
          put(
              "45005",
              new MmsConnectionParameters(
                  "http://omms.nate.com:9082/oma_mms", "smart.nate.com", "9093"));
          put("45008", new MmsConnectionParameters("http://mmsc.ktfwing.com:9082", null, null));
          put(
              "45201",
              new MmsConnectionParameters("http://203.162.21.114/mmsc", "203.162.21.114", "3130"));
          put(
              "45202",
              new MmsConnectionParameters("http://mms.vinaphone.com.vn", "10.1.10.46", "8000"));
          put(
              "45204",
              new MmsConnectionParameters(
                  "http://mms.viettelmobile.com.vn/mms/wapenc", "192.168.233.10", "8080"));
          put(
              "45400",
              new MmsConnectionParameters("http://192.168.58.171:8002/", "192.168.59.51", "8080"));
          put(
              "45403",
              new MmsConnectionParameters(
                  "http://mms.um.three.com.hk:10021/mmsc", "172.20.97.116", "8799"));
          put(
              "45406",
              new MmsConnectionParameters("http://mms.smartone.com/server", "10.9.9.9", "8080"));
          put(
              "45412",
              new MmsConnectionParameters(
                  "http://mms.hk.chinamobile.com/mms", "172.31.31.36", "8080"));
          put(
              "45419",
              new MmsConnectionParameters(
                  "http://3gmms.pccwmobile.com:8080/was", "10.140.14.10", "8080"));
          put(
              "46000",
              new MmsConnectionParameters("http://mmsc.monternet.com", "10.0.0.172", "80"));
          put("460003", new MmsConnectionParameters("http://mmsc.vnet.mobi", "10.0.0.200", "80"));
          put("46001", new MmsConnectionParameters("http://mmsc.myuni.com.cn", "10.0.0.172", "80"));
          put("46003", new MmsConnectionParameters("http://mmsc.vnet.mobi", "10.0.0.200", "80"));
          put("46601", new MmsConnectionParameters("http://mms", "210.241.199.199", "9201"));
          put("46689", new MmsConnectionParameters("http://mms", "172.24.128.36", "8080"));
          put(
              "46692",
              new MmsConnectionParameters("http://mms.emome.net:8002", "10.1.1.1", "8080"));
          put("46697", new MmsConnectionParameters("http://mms.catch.net.tw/", "10.1.1.2", "80"));
          put(
              "47001",
              new MmsConnectionParameters(
                  "http://mms.gpsurf.net/servlets/mms", "10.128.1.2", "8080"));
          put(
              "47201",
              new MmsConnectionParameters("http://mmsc.dhimobile.com.mv", "172.24.97.4", "8080"));
          put(
              "50212",
              new MmsConnectionParameters(
                  "http://172.16.74.100:10021/mmsc", "202.75.133.49", "80"));
          put(
              "50216",
              new MmsConnectionParameters(
                  "http://mms.digi.com.my/servlets/mms", "203.92.128.160", "80"));
          put(
              "50218",
              new MmsConnectionParameters("http://10.30.3.11/servlets/mms", "10.30.5.11", "8080"));
          put(
              "50219",
              new MmsConnectionParameters("http://mms.celcom.net.my", "10.128.1.242", "8080"));
          put(
              "50501",
              new MmsConnectionParameters("http://mmsc.telstra.com:8002", "10.1.1.180", "80"));
          put(
              "50502",
              new MmsConnectionParameters(
                  "http://mmsc.optus.com.au:8002/", "61.88.190.10", "8070"));
          put(
              "50503",
              new MmsConnectionParameters(
                  "http://pxt.vodafone.net.au/pxtsend", "10.202.2.60", "8080"));
          put(
              "51001",
              new MmsConnectionParameters("http://mmsc.indosat.com", "10.19.19.19", "8080"));
          put("51008", new MmsConnectionParameters("http://mmsc.axis", "10.8.3.8", "8080"));
          put(
              "51009",
              new MmsConnectionParameters("http://10.17.93.103:8080", "10.17.27.250", "8080"));
          put(
              "51010",
              new MmsConnectionParameters("http://mms.telkomsel.com", "10.1.89.150", "8000"));
          put(
              "51011",
              new MmsConnectionParameters(
                  "http://mmc.xl.net.id/servlets/mms", "202.152.240.50", "8080"));
          put("51089", new MmsConnectionParameters("http://mms.three.co.id", "10.4.0.10", "3128"));
          put(
              "51502",
              new MmsConnectionParameters(
                  "http://192.40.100.22:10021/mmsc", "203.177.42.214", "8080"));
          put(
              "51503",
              new MmsConnectionParameters("http://10.102.61.238:8002", "10.102.61.46", "8080"));
          put(
              "51505",
              new MmsConnectionParameters(
                  "http://mmscenter.suncellular.com.ph", "202.138.159.78", "8080"));
          put(
              "52000",
              new MmsConnectionParameters("http://mms.trueh.com:8002/", "10.4.7.39", "8080"));
          put(
              "52001",
              new MmsConnectionParameters("http://mms.mobilelife.co.th", "203.170.229.34", "8080"));
          put(
              "52018",
              new MmsConnectionParameters(
                  "http://mms.dtac.co.th:8002/", "203.155.200.133", "8080"));
          put(
              "52099",
              new MmsConnectionParameters("http://mms.trueh.com:8002/", "10.4.7.39", "8080"));
          put(
              "52501",
              new MmsConnectionParameters(
                  "http://mms.singtel.com:10021/mmsc", "165.21.42.84", "8080"));
          put("52503", new MmsConnectionParameters("http://mmsgw:8002", "172.16.14.10", "8080"));
          put(
              "52505",
              new MmsConnectionParameters(
                  "http://mms.starhubgee.com.sg:8002/", "10.12.1.80", "80"));
          put(
              "53001",
              new MmsConnectionParameters(
                  "http://pxt.vodafone.net.nz/pxtsend", "172.30.38.3", "8080"));
          put(
              "53005",
              new MmsConnectionParameters("http://lsmmsc.xtra.co.nz", "210.55.11.73", "80"));
          put(
              "53024",
              new MmsConnectionParameters(
                  "http://mms.2degreesmobile.net.nz:48090", "118.148.1.118", "8080"));
          put("60401", new MmsConnectionParameters("http://mms:8002", "10.16.35.50", "8080"));
          put(
              "60503",
              new MmsConnectionParameters("http://mmsc.tunisiana.com", "10.3.2.100", "80"));
          put(
              "63102",
              new MmsConnectionParameters("http://10.128.4.10/wapenc", "10.128.2.70", "8080"));
          put("63401", new MmsConnectionParameters("http://mms.zain.sd", "172.20.2.124", "80"));
          put(
              "63902",
              new MmsConnectionParameters(
                  "http://mms.gprs.safaricom.com", "172.022.002.038", "8080"));
          put(
              "64700",
              new MmsConnectionParameters("http://mms.orange.re/", "192.168.10.200", "8080"));
          put("64710", new MmsConnectionParameters("http://mms", "10.0.224.145", "8080"));
          put(
              "64901",
              new MmsConnectionParameters("http://www.mtcmobile.com.na/", "10.40.10.252", "80"));
          put(
              "65501",
              new MmsConnectionParameters("http://mmsc.vodacom4me.co.za", "196.6.128.13", "8080"));
          put(
              "65507",
              new MmsConnectionParameters("http://mms.cmobile.co.za", "196.31.116.250", "8080"));
          put(
              "65510",
              new MmsConnectionParameters(
                  "http://mms.mtn.co.za/mms/wapenc", "196.11.240.241", "8080"));
          put(
              "70401",
              new MmsConnectionParameters(
                  "http://mms.ideasclaro.com:8002", "216.230.133.66", "8080"));
          put("70603", new MmsConnectionParameters("http://mms", "10.16.17.12", "8888"));
          put("710300", new MmsConnectionParameters("http://mms.movistar.ni", "10.12.23.1", "80"));
          put("71201", new MmsConnectionParameters("http://mmsice", "10.184.202.24", "8080"));
          put(
              "71203",
              new MmsConnectionParameters(
                  "http://mms.ideasclaro.com:8002", "216.230.133.66", "8080"));
          put("71204", new MmsConnectionParameters("http://mms.movistar.cr", "10.221.79.83", "80"));
          put(
              "71610",
              new MmsConnectionParameters("http://claro/servlets/mms", "192.168.231.30", "80"));
          put(
              "72207",
              new MmsConnectionParameters("http://mms.movistar.com.ar", "200.68.32.239", "8080"));
          put(
              "722310",
              new MmsConnectionParameters("http://mms.ctimovil.com.ar", "170.51.255.240", "8080"));
          put(
              "72234",
              new MmsConnectionParameters("http://mms.personal.com", "172.25.7.31", "8080"));
          put("72402", new MmsConnectionParameters("http://mms.tim.br", "200.179.66.242", "8080"));
          put("72403", new MmsConnectionParameters("http://mms.tim.br", "200.179.66.242", "8080"));
          put("72404", new MmsConnectionParameters("http://mms.tim.br", "200.179.66.242", "8080"));
          put(
              "72405",
              new MmsConnectionParameters("http://mms.claro.com.br", "200.169.126.10", "8799"));
          put(
              "72406",
              new MmsConnectionParameters(
                  "http://termnat.vivomms.com.br:8088/mms", "200.142.130.104", "80"));
          put(
              "72410",
              new MmsConnectionParameters(
                  "http://termnat.vivomms.com.br:8088/mms", "200.142.130.104", "80"));
          put(
              "72411",
              new MmsConnectionParameters(
                  "http://termnat.vivomms.com.br:8088/mms", "200.142.130.104", "80"));
          put(
              "72416",
              new MmsConnectionParameters("http://200.222.42.204:8002", "192.168.10.50", "3128"));
          put(
              "72423",
              new MmsConnectionParameters(
                  "http://termnat.vivomms.com.br:8088/mms", "200.142.130.104", "80"));
          put(
              "72431",
              new MmsConnectionParameters("http://200.222.42.204:8002", "192.168.10.50", "3128"));
          put(
              "73001",
              new MmsConnectionParameters("http://mmsc.entelpcs.cl", "10.99.0.10", "8080"));
          put(
              "73002",
              new MmsConnectionParameters("http://mms.movistar.cl", "172.17.8.10", "8080"));
          put(
              "73402",
              new MmsConnectionParameters(
                  "http://mms.412.com.ve/servlets/mms", "10.99.0.10", "8080"));
          put(
              "73404",
              new MmsConnectionParameters(
                  "http://mms.movistar.com.ve:8088/mms", "200.35.64.73", "9001"));
          put(
              "74402",
              new MmsConnectionParameters("http://mms.ctimovil.com.py", "170.51.255.240", "8080"));
          put("74404", new MmsConnectionParameters("http://mms", "10.16.17.12", "8888"));
          put(
              "74801",
              new MmsConnectionParameters(
                  "http://mmsc.mms.ancelutil.com.uy", "200.40.246.2", "3128"));
          put(
              "74807",
              new MmsConnectionParameters("http://mmsc.movistar.com.uy", "10.0.2.29", "8080"));
          put(
              "74810",
              new MmsConnectionParameters("http://mms.ctimovil.com.uy", "170.51.255.240", "8080"));
        }
      };

  public static MmsConnectionParameters getMmsConnectionParameters(Context context) {
    TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
    return paramMap.get(tm.getSimOperator());
  }
}