package com.helloworld.candor.candor;

import android.graphics.Color;
import android.widget.Toast;

import java.util.HashMap;
import java.util.ArrayList;


public class CompanyActivity {

    public static final double APLUS = 83.70;
    public static final double AA = 60.00;
    public static final double AMINUS = 48.30;
    public static final double BPLUS = 43.20;
    public static final double BB = 38.10;
    public static final double BMINUS = 31.80;
    public static final double CPLUS = 27.50;
    public static final double CC = 20.70;
    public static final double CMINUS = 15.00;
    public static final double DPLUS = 9.80;
    public static final double DD = 5.60;
    public static final double DMINUS = 3.90;
    public static final double FF = 0.80;

    HashMap<String, Double> hmap = new HashMap<>();
    HashMap<String, String> secondMap = new HashMap<>();
    HashMap<String, String> dmap = new HashMap<>();


    public int getColorByName(String x) {
        int color;
        if (getScoreNum(x)>60.00) {
            color = Color.rgb(53, 244, 107);
        }
        else if (getScoreNum(x)>48.30) {
            color = Color.rgb(53, 244, 107);
        }
        else if (getScoreNum(x)>43.20) {
            color = Color.rgb(53, 244, 107);
        }
        else if (getScoreNum(x)>38.10) {
            color = Color.rgb(136, 244, 53);
        }
        else if (getScoreNum(x)>31.80) {
            color = Color.rgb(136, 244, 53);
        }
        else if (getScoreNum(x)>27.50) {
            color = Color.rgb(136, 244, 53);
        }
        else if (getScoreNum(x)>20.70) {
            color = Color.rgb(238, 255, 12);
        }
        else if (getScoreNum(x)>15.00) {
            color = Color.rgb(238, 255, 12);
        }
        else if (getScoreNum(x)>9.80) {
            color = Color.rgb(238, 255, 12);
        }
        else if (getScoreNum(x)>5.60) {
            color = Color.rgb(239, 135, 0);
        }
        else if (getScoreNum(x)>3.90) {
            color = Color.rgb(239, 135, 0);
        }
        else if (getScoreNum(x)>0.80) {
            color = Color.rgb(239, 135, 0);
        }
        else color = Color.rgb(194, 1, 4);
        return color;
    }

    public CompanyActivity () {
        hmap.put("manpowergroup", 43.70);
        hmap.put("entergy", 43.30);
        hmap.put("cisco systems", 83.70);
        hmap.put("ecolab", 81.60);
        hmap.put("hasbro", 80.00);
        hmap.put("pg&e corp", 78.50);
        hmap.put("sealed air", 78.00);
        hmap.put("best buy", 76.30);
        hmap.put("celgene", 71.80);
        hmap.put("apple", 71.50);
        hmap.put("cms energy", 68.80);
        hmap.put("johnson & johnson", 68.10);
        hmap.put("applied materials", 67.50);
        hmap.put("exelon", 67.30);
        hmap.put("ball", 67.30);
        hmap.put("hp", 67.10);
        hmap.put("biogen", 66.80);
        hmap.put("boston scientific", 66.20);
        hmap.put("microsoft", 66.00);
        hmap.put("humana", 65.70);
        hmap.put("merck & co", 64.90);
        hmap.put("eversource energy", 64.80);
        hmap.put("hershey", 64.70);
        hmap.put("boeing", 62.90);
        hmap.put("raytheon", 62.90);
        hmap.put("nvidia", 62.80);
        hmap.put("cummins", 62.40);
        hmap.put("praxair", 62.30);
        hmap.put("bristol-myers squibb", 61.90);
        hmap.put("estee lauder companies", 61.90);
        hmap.put("rockwell automation", 61.80);
        hmap.put("metlife", 61.70);
        hmap.put("ppg industries", 61.50);
        hmap.put("oracle", 61.50);
        hmap.put("aflac", 60.80);
        hmap.put("general mills", 60.30);
        hmap.put("nordstrom", 59.30);
        hmap.put("mondelez international", 59.30);
        hmap.put("starbucks", 59.30);
        hmap.put("leidos holdings", 59.30);
        hmap.put("cvs health", 59.30);
        hmap.put("colgate-palmolive", 59.20);
        hmap.put("clorox", 59.20);
        hmap.put("domtar", 59.20);
        hmap.put("csx", 59.20);
        hmap.put("unitedhealth group", 59.10);
        hmap.put("qualcomm", 58.90);
        hmap.put("nike", 58.60);
        hmap.put("general electric", 57.60);
        hmap.put("consolidated edison", 57.40);
        hmap.put("ford motor", 57.40);
        hmap.put("whirlpool", 57.30);
        hmap.put("avangrid", 57.10);
        hmap.put("cognizant technology solutions", 56.90);
        hmap.put("campbell soup", 56.70);
        hmap.put("prudential financial", 56.50);
        hmap.put("harley-davidson", 55.70);
        hmap.put("archer daniels midland", 54.90);
        hmap.put("quest diagnostics", 54.60);
        hmap.put("las vegas sands", 54.60);
        hmap.put("united continental holdings", 54.30);
        hmap.put("citigroup", 53.00);
        hmap.put("union pacific", 53.00);
        hmap.put("host hotels & resorts", 51.90);
        hmap.put("fluor", 51.80);
        hmap.put("voya financial", 51.60);
        hmap.put("3m", 51.60);
        hmap.put("monsanto", 51.50);
        hmap.put("sprint", 50.70);
        hmap.put("bunge", 50.20);
        hmap.put("schlumberger nv", 50.00);
        hmap.put("dow chemical", 49.70);
        hmap.put("state street corp", 49.60);
        hmap.put("duke energy", 49.50);
        hmap.put("visa", 49.10);
        hmap.put("international business machines", 49.10);
        hmap.put("masco", 49.00);
        hmap.put("mgm resorts international", 48.40);
        hmap.put("delta air lines", 48.30);
        hmap.put("royal caribbean cruises", 48.20);
        hmap.put("kellogg", 47.90);
        hmap.put("wyndham worldwide", 47.70);
        hmap.put("goldman sachs group", 47.30);
        hmap.put("owens corning", 47.20);
        hmap.put("eli lilly and co", 47.00);
        hmap.put("intel", 46.50);
        hmap.put("altria group", 46.50);
        hmap.put("sempra energy", 46.40);
        hmap.put("united parcel service", 46.20);
        hmap.put("american express", 46.10);
        hmap.put("pepsico", 45.70);
        hmap.put("air products and chemicals", 45.00);
        hmap.put("united technologies", 44.80);
        hmap.put("lockheed martin", 44.50);
        hmap.put("mcdonald's corp", 44.30);
        hmap.put("ebay", 44.10);
        hmap.put("exxon mobil", 44.00);
        hmap.put("adobe systems", 44.00);
        hmap.put("eastman chemical", 43.90);
        hmap.put("cigna", 43.80);
        hmap.put("southwest airlines", 43.20);
        hmap.put("freeport-mcmoran", 42.90);
        hmap.put("phillip morris international", 42.90);
        hmap.put("anthem", 42.20);
        hmap.put("home depot", 41.90);
        hmap.put("xerox", 41.80);
        hmap.put("unum group", 41.60);
        hmap.put("simon property group", 41.50);
        hmap.put("xcel energy", 41.40);
        hmap.put("j m smucker", 41.20);
        hmap.put("norfolk southern", 41.10);
        hmap.put("aes", 40.50);
        hmap.put("nextera energy", 40.30);
        hmap.put("wal-mart stores", 40.20);
        hmap.put("waste management", 40.10);
        hmap.put("jabil", 40.00);
        hmap.put("republic services", 39.90);
        hmap.put("weyerhaeuser co", 39.80);
        hmap.put("bank of new york mellon", 39.60);
        hmap.put("abbott laboratories", 39.30);
        hmap.put("lyondellbasell nv", 39.30);
        hmap.put("conocophillips", 39.20);
        hmap.put("fedex", 39.10);
        hmap.put("cbre group", 39.10);
        hmap.put("kimberly-clark", 38.90);
        hmap.put("amgen", 38.80);
        hmap.put("gap", 38.60);
        hmap.put("becton dickinson and co", 38.60);
        hmap.put("pfizer", 38.30);
        hmap.put("aetna", 38.30);
        hmap.put("hewlett packard enterprise co", 38.20);
        hmap.put("cardinal health", 38.20);
        hmap.put("occidental petroleum", 38.10);
        hmap.put("viacom", 38.10);
        hmap.put("ppl", 38.10);
        hmap.put("pvh", 38.00);
        hmap.put("hormel foods", 37.80);
        hmap.put("chevron", 37.70);
        hmap.put("intuit", 37.50);
        hmap.put("marriott international", 37.20);
        hmap.put("omnicom group", 37.00);
        hmap.put("international paper co", 36.80);
        hmap.put("morgan stanley", 36.50);
        hmap.put("target", 36.30);
        hmap.put("parker-hannifin", 36.10);
        hmap.put("at&t", 35.50);
        hmap.put("jpmorgan chase & co", 35.20);
        hmap.put("thermo fischer scientific", 35.00);
        hmap.put("nrg energy", 35.00);
        hmap.put("lincoln national", 34.90);
        hmap.put("alcoa", 34.80);
        hmap.put("aecom", 34.60);
        hmap.put("autoliv", 34.20);
        hmap.put("wec energy group", 33.90);
        hmap.put("alliance data systems", 33.90);
        hmap.put("newmont mining ", 33.70);
        hmap.put("dte energy", 33.10);
        hmap.put("procter & gamble", 33.10);
        hmap.put("hartford financial services group", 32.90);
        hmap.put("kohls", 32.80);
        hmap.put("motorola solutions", 32.60);
        hmap.put("yum! brands", 32.60);
        hmap.put("quanta services", 32.50);
        hmap.put("devon energy", 32.50);
        hmap.put("general motors", 32.20);
        hmap.put("textron", 32.20);
        hmap.put("rockwell collins", 32.10);
        hmap.put("avery dennison", 31.80);
        hmap.put("edison international", 31.80);
        hmap.put("carnival", 31.80);
        hmap.put("constellation brands", 31.70);
        hmap.put("valero energy", 31.60);
        hmap.put("w w grainger", 31.60);
        hmap.put("lkq", 31.30);
        hmap.put("anadarko petroleum", 30.80);
        hmap.put("northrop grumman", 30.70);
        hmap.put("avon products", 30.70);
        hmap.put("wesco international", 30.60);
        hmap.put("dover", 30.60);
        hmap.put("texas instruments", 30.40);
        hmap.put("vmware", 30.40);
        hmap.put("wells fargo & co", 30.30);
        hmap.put("baxter international", 30.00);
        hmap.put("principal financial group", 30.00);
        hmap.put("alaska air group", 29.80);
        hmap.put("marsh & mclennan companies", 29.70);
        hmap.put("apache", 29.70);
        hmap.put("bank of america", 29.60);
        hmap.put("twenty-first century fox", 29.50);
        hmap.put("s&p global", 29.50);
        hmap.put("hertz global holdings", 29.40);
        hmap.put("allstate", 29.20);
        hmap.put("honeywell international", 28.80);
        hmap.put("hanesbrands", 28.60);
        hmap.put("staples", 28.40);
        hmap.put("ameren", 28.40);
        hmap.put("dean foods", 28.30);
        hmap.put("western union", 27.90);
        hmap.put("halliburton co", 27.90);
        hmap.put("tjx companies", 27.70);
        hmap.put("mosaic co", 27.70);
        hmap.put("owens-illinois", 27.50);
        hmap.put("marathon petroleum", 27.50);
        hmap.put("kroger co", 27.10);
        hmap.put("american airlines group", 26.70);
        hmap.put("abbvie", 25.60);
        hmap.put("pnc financial services group", 26.50);
        hmap.put("abm industries", 26.00);
        hmap.put("conagra brands", 25.80);
        hmap.put("jones lang lasalle", 25.50);
        hmap.put("oshkosh", 25.40);
        hmap.put("coca-cola co", 25.40);
        hmap.put("southern co", 25.30);
        hmap.put("deere & co", 25.10);
        hmap.put("dominion energy", 24.80);
        hmap.put("southern copper", 24.30);
        hmap.put("american electric power company", 23.60);
        hmap.put("cintas", 23.60);
        hmap.put("walt disney co", 23.30);
        hmap.put("facebook", 23.10);
        hmap.put("mckesson", 23.00);
        hmap.put("newell brands", 22.90);
        hmap.put("tyson foods", 22.80);
        hmap.put("verizon communications", 22.10);
        hmap.put("dr pepper snapple group", 21.50);
        hmap.put("level 3 communications", 21.50);
        hmap.put("vf", 21.50);
        hmap.put("centurylink", 21.50);
        hmap.put("centerpoint energy", 21.30);
        hmap.put("arconic", 21.30);
        hmap.put("macy's", 21.20);
        hmap.put("u.s. bancorp", 21.20);
        hmap.put("chesapeake energy", 21.10);
        hmap.put("illinois tool works", 21.00);
        hmap.put("berry global group", 21.00);
        hmap.put("ryder system", 20.70);
        hmap.put("corning", 20.00);
        hmap.put("public service enterprise group", 20.00);
        hmap.put("spectrum group international", 20.00);
        hmap.put("tesla", 20.00);
        hmap.put("sherwin-williams co", 19.90);
        hmap.put("davita", 19.80);
        hmap.put("m&t bank", 19.70);
        hmap.put("fifth third bancorp", 19.20);
        hmap.put("travelers companies", 18.90);
        hmap.put("fortive", 18.70);
        hmap.put("walgreens boots alliance", 18.60);
        hmap.put("arris international", 18.60);
        hmap.put("nielsen holdings", 18.50);
        hmap.put("hollyfrontier", 18.30);
        hmap.put("navistar international", 18.10);
        hmap.put("firstenergy", 18.10);
        hmap.put("automatic data processing", 17.90);
        hmap.put("aramark", 17.90);
        hmap.put("univar", 17.70);
        hmap.put("costco wholesale", 17.70);
        hmap.put("salesforce.com", 17.70);
        hmap.put("emerson electric co", 17.60);
        hmap.put("steel dynamics", 17.40);
        hmap.put("northern trust", 17.00);
        hmap.put("borgwarner", 17.00);
        hmap.put("e i du pont de nemours and co", 16.80);
        hmap.put("l brands", 16.50);
        hmap.put("stanley black & decker", 16.50);
        hmap.put("mohawk industries", 15.50);
        hmap.put("markel", 15.40);
        hmap.put("a-mark precious metals", 15.00);
        hmap.put("j.b. hunt transport services", 15.00);
        hmap.put("kinder morgan", 15.00);
        hmap.put("leucadia national", 15.00);
        hmap.put("mattel", 15.00);
        hmap.put("paccar", 15.00);
        hmap.put("stryker", 15.00);
        hmap.put("time warner", 15.00);
        hmap.put("alphabet", 14.90);
        hmap.put("ak steel holding", 14.60);
        hmap.put("booz allen hamilton holding", 14.40);
        hmap.put("dxc technology co", 14.40);
        hmap.put("caterpillar", 14.40);
        hmap.put("loews", 14.40);
        hmap.put("oneok", 14.00);
        hmap.put("huntsman", 13.90);
        hmap.put("american international group", 13.90);
        hmap.put("arthur j gallagher & co", 13.90);
        hmap.put("micron technology", 13.60);
        hmap.put("eog resources", 13.10);
        hmap.put("conduent", 12.90);
        hmap.put("crown holdings", 12.50);
        hmap.put("coty", 12.30);
        hmap.put("capital one financial", 12.00);
        hmap.put("spirit aerosystems holdings", 11.40);
        hmap.put("williams companies", 10.70);
        hmap.put("cbs", 10.60);
        hmap.put("charles schwab", 10.50);
        hmap.put("united natural foods", 10.40);
        hmap.put("blackrock", 10.00);
        hmap.put("phillips 66", 10.00);
        hmap.put("d.r. horton", 10.00);
        hmap.put("danaher", 10.00);
        hmap.put("express scripts holding co", 10.00);
        hmap.put("franklin resources", 10.00);
        hmap.put("gilead sciences", 10.00);
        hmap.put("liberty interactive", 10.00);
        hmap.put("national oilwell varco", 10.00);
        hmap.put("vistra energy", 10.00);
        hmap.put("westlake chemical", 10.00);
        hmap.put("zimmer biomet holdings", 10.00);
        hmap.put("progressive", 9.80);
        hmap.put("united rentals", 9.70);
        hmap.put("nucor", 9.70);
        hmap.put("united states steel", 9.60);
        hmap.put("darden restaurants", 9.30);
        hmap.put("hilton worldwide holdings", 9.30);
        hmap.put("yum china holdings", 9.30);
        hmap.put("molina healthcare", 9.30);
        hmap.put("autonation", 8.90);
        hmap.put("post holdings", 8.60);
        hmap.put("sysco", 8.00);
        hmap.put("o'reilly automotive", 8.00);
        hmap.put("goodyear tire & rubber", 7.70);
        hmap.put("lam research", 7.50);
        hmap.put("henry schein", 7.20);
        hmap.put("emcor group", 7.00);
        hmap.put("jacobs engineering group", 7.00);
        hmap.put("western digital", 6.90);
        hmap.put("interpublic group of companies", 6.80);
        hmap.put("advance auto parts", 6.50);
        hmap.put("asbury automotive group", 6.50);
        hmap.put("ascena retail group", 6.50);
        hmap.put("autozone", 6.50);
        hmap.put("bed bath & beyond", 6.50);
        hmap.put("burlington stores", 6.50);
        hmap.put("foot locker", 6.50);
        hmap.put("gamestop", 6.50);
        hmap.put("group 1 automotive", 6.50);
        hmap.put("lithia motors", 6.50);
        hmap.put("michaels companies", 6.50);
        hmap.put("murphy usa", 6.50);
        hmap.put("penske automotive group", 6.50);
        hmap.put("ross stores", 6.50);
        hmap.put("sonic automotive", 6.50);
        hmap.put("travelcenters of america", 6.50);
        hmap.put("williams-sonoma", 6.50);
        hmap.put("telephone and data systems", 6.30);
        hmap.put("ralph lauren", 6.20);
        hmap.put("tenneco", 5.70);
        hmap.put("dana", 5.60);
        hmap.put("federal national mortgage association", 5.60);
        hmap.put("bb&t", 5.40);
        hmap.put("genesis healthcare", 5.20);
        hmap.put("regions financial", 5.10);
        hmap.put("amerisourcebergen", 5.00);
        hmap.put("c.h. robinson worldwide", 5.00);
        hmap.put("celanese", 5.00);
        hmap.put("energy transfer equity", 5.00);
        hmap.put("enterprise products partners", 5.00);
        hmap.put("mastercard", 5.00);
        hmap.put("netflix", 5.00);
        hmap.put("pbf energy", 5.00);
        hmap.put("rr donnelley & sons co", 5.00);
        hmap.put("ugi", 5.00);
        hmap.put("williams partners", 5.00);
        hmap.put("pilgrims pride", 4.70);
        hmap.put("santander holdings usa", 4.70);
        hmap.put("suntrust banks", 4.70);
        hmap.put("reinsurance group of america", 4.50);
        hmap.put("w.r. berkley", 4.30);
        hmap.put("jetblue airways", 4.20);
        hmap.put("calpine", 4.10);
        hmap.put("alleghany", 3.90);
        hmap.put("american financial group", 3.90);
        hmap.put("amtrust financial services", 3.90);
        hmap.put("assurant", 3.90);
        hmap.put("cincinnati financial", 3.90);
        hmap.put("cna financial", 3.90);
        hmap.put("fidelity national financial", 3.90);
        hmap.put("first american financial", 3.90);
        hmap.put("genworth financial", 3.90);
        hmap.put("old republic international", 3.90);
        hmap.put("kraft heinz co", 3.60);
        hmap.put("treehouse foods", 3.60);
        hmap.put("hrg group", 3.30);
        hmap.put("spectrum brands holdings", 3.30);
        hmap.put("pulitegroup", 3.20);
        hmap.put("casey's general stores", 3.00);
        hmap.put("performance food group co", 3.00);
        hmap.put("publix super markets", 3.00);
        hmap.put("rite aid", 3.00);
        hmap.put("spartannash", 3.00);
        hmap.put("supervalu", 3.00);
        hmap.put("us foods holding", 3.00);
        hmap.put("packaging corp of america", 2.70);
        hmap.put("baker hughes a ge co", 2.30);
        hmap.put("news", 2.20);
        hmap.put("owens & minor", 2.00);
        hmap.put("j c penney company", 1.90);
        hmap.put("avnet", 1.80);
        hmap.put("whole foods market", 1.80);
        hmap.put("office depot", 1.70);
        hmap.put("charter communications", 1.20);
        hmap.put("federal home loan mortgage", 0.90);
        hmap.put("mastec", 0.90);
        hmap.put("lowe's companies", 0.80);
        hmap.put("activision blizzard", 0.00);
        hmap.put("agco", 0.00);
        hmap.put("ally financial", 0.00);
        hmap.put("altaba", 0.00);
        hmap.put("altice usa", 0.00);
        hmap.put("amazon.com", 0.00);
        hmap.put("american tower", 0.00);
        hmap.put("ameriprise financial", 0.00);
        hmap.put("amphenol", 0.00);
        hmap.put("andeavor", 0.00);
        hmap.put("anixter international", 0.00);
        hmap.put("arrow electronics", 0.00);
        hmap.put("avis budget group", 0.00);
        hmap.put("berkshire hathaway", 0.00);
        hmap.put("big lots", 0.00);
        hmap.put("blackstone group", 0.00);
        hmap.put("builders firstsource", 0.00);
        hmap.put("calatlantic group", 0.00);
        hmap.put("carmax", 0.00);
        hmap.put("cdw", 0.00);
        hmap.put("centene", 0.00);
        hmap.put("chemours", 0.00);
        hmap.put("citizens financial group", 0.00);
        hmap.put("comcast", 0.00);
        hmap.put("community health systems", 0.00);
        hmap.put("core-mark holding company", 0.00);
        hmap.put("dell technologies", 0.00);
        hmap.put("dick's sporting goods", 0.00);
        hmap.put("dillards", 0.00);
        hmap.put("discover financial services", 0.00);
        hmap.put("discovery communications", 0.00);
        hmap.put("dish network", 0.00);
        hmap.put("dollar general", 0.00);
        hmap.put("dollar tree", 0.00);
        hmap.put("energy transfer partners", 0.00);
        hmap.put("essendant", 0.00);
        hmap.put("expedia", 0.00);
        hmap.put("expeditors international of washington", 0.00);
        hmap.put("fidelity national information services", 0.00);
        hmap.put("first data", 0.00);
        hmap.put("fiserv", 0.00);
        hmap.put("frontier communications", 0.00);
        hmap.put("general dynamics", 0.00);
        hmap.put("genuine parts co", 0.00);
        hmap.put("global partners", 0.00);
        hmap.put("harris", 0.00);
        hmap.put("hca healthcare", 0.00);
        hmap.put("hd supply holdings", 0.00);
        hmap.put("huntington ingalls industries", 0.00);
        hmap.put("icahn enterprises", 0.00);
        hmap.put("iheartmedia", 0.00);
        hmap.put("ingredion", 0.00);
        hmap.put("insight enterprises", 0.00);
        hmap.put("intl fcstone", 0.00);
        hmap.put("kelly services", 0.00);
        hmap.put("kindred healthcare", 0.00);
        hmap.put("l3 technologies", 0.00);
        hmap.put("laboratory corporation of america holdings", 0.00);
        hmap.put("lear", 0.00);
        hmap.put("lennar", 0.00);
        hmap.put("lifepoint health", 0.00);
        hmap.put("live nation entertainment", 0.00);
        hmap.put("ncr", 0.00);
        hmap.put("netapp", 0.00);
        hmap.put("ngl energy partners", 0.00);
        hmap.put("nvr", 0.00);
        hmap.put("olin", 0.00);
        hmap.put("patterson companies", 0.00);
        hmap.put("paypal holdings", 0.00);
        hmap.put("plains gp holdings", 0.00);
        hmap.put("priceline group", 0.00);
        hmap.put("quintiles ims holdings", 0.00);
        hmap.put("raymond james financial", 0.00);
        hmap.put("realogy holdings", 0.00);
        hmap.put("reliance steel & aluminum co", 0.00);
        hmap.put("robert half international", 0.00);
        hmap.put("sanmina", 0.00);
        hmap.put("santander consumer usa holdings", 0.00);
        hmap.put("seaboard", 0.00);
        hmap.put("sears holdings", 0.00);
        hmap.put("sunoco", 0.00);
        hmap.put("synchrony financial", 0.00);
        hmap.put("synnex", 0.00);
        hmap.put("t-mobile us", 0.00);
        hmap.put("tanga resources", 0.00);
        hmap.put("tech data", 0.00);
        hmap.put("tenet healthcare", 0.00);
        hmap.put("toll brothers", 0.00);
        hmap.put("tractor supply co", 0.00);
        hmap.put("universal health services", 0.00);
        hmap.put("veritiv", 0.00);
        hmap.put("wellcare health plans", 0.00);
        hmap.put("westrock co", 0.00);
        hmap.put("windstream holdings", 0.00);
        hmap.put("world fuel services", 0.00);
        hmap.put("xpo logistics", 0.00);
        hmap.put("plains all american pipeline", 0.00);


        secondMap.put("cisco systems", "Information Technology");
        secondMap.put("ecolab", "Materials");
        secondMap.put("hasbro", "Consumer Discretionary");
        secondMap.put("pg&e corp", "Utilities");
        secondMap.put("sealed air", "Materials");
        secondMap.put("best buy co", "Consumer Discretionary");
        secondMap.put("celgene", "Health Care");
        secondMap.put("apple", "Information Technology");
        secondMap.put("cms Energy", "Utilities");
        secondMap.put("johnson & johnson", "Health Care");
        secondMap.put("applied Materials", "Information Technology");
        secondMap.put("exelon", "Utilities");
        secondMap.put("ball", "Materials");
        secondMap.put("hp", "Information Technology");
        secondMap.put("biogen", "Health Care");
        secondMap.put("boston scientific", "Health Care");
        secondMap.put("microsoft", "Information Technology");
        secondMap.put("humana", "Health Care");
        secondMap.put("merck & co", "Health Care");
        secondMap.put("eversource Energy", "Utilities");
        secondMap.put("hershey", "Consumer Staples");
        secondMap.put("boeing", "industrials");
        secondMap.put("raytheon", "industrials");
        secondMap.put("nvidia", "Information Technology");
        secondMap.put("cummins", "industrials");
        secondMap.put("praxair", "Materials");
        secondMap.put("bristol-myers squibb", "Health Care");
        secondMap.put("estee lauder companies", "Consumer Staples");
        secondMap.put("rockwell automation", "industrials");
        secondMap.put("metlife", "Financials");
        secondMap.put("ppg industries", "Materials");
        secondMap.put("oracle", "Information Technology");
        secondMap.put("aflac", "Financials");
        secondMap.put("general mills", "Consumer Staples");
        secondMap.put("nordstrom", "Consumer Discretionary");
        secondMap.put("mondelez international", "Consumer Staples");
        secondMap.put("starbucks", "Consumer Discretionary");
        secondMap.put("leidos holdings", "Information Technology");
        secondMap.put("cvs health", "Consumer Staples");
        secondMap.put("colgate-palmolive", "Consumer Staples");
        secondMap.put("clorox", "Consumer Staples");
        secondMap.put("domtar", "Materials");
        secondMap.put("csx", "industrials");
        secondMap.put("unitedhealth group", "Health Care");
        secondMap.put("qualcomm", "Information Technology");
        secondMap.put("nike", "Consumer Discretionary");
        secondMap.put("general electric", "industrials");
        secondMap.put("consolidated edison", "Utilities");
        secondMap.put("ford motor", "Consumer Discretionary");
        secondMap.put("whirlpool", "Consumer Discretionary");
        secondMap.put("avangrid", "Utilities");
        secondMap.put("cognizant technology solutions", "Information Technology");
        secondMap.put("campbell soup", "Consumer Staples");
        secondMap.put("prudential financial", "Financials");
        secondMap.put("harley-davidson", "Consumer Discretionary");
        secondMap.put("archer daniels midland", "Consumer Staples");
        secondMap.put("quest diagnostics", "Health Care");
        secondMap.put("las vegas sands", "Consumer Discretionary");
        secondMap.put("united continental holdings", "industrials");
        secondMap.put("citigroup", "Financials");
        secondMap.put("union pacific", "industrials");
        secondMap.put("host hotels & resorts", "Real Estate");
        secondMap.put("fluor", "industrials");
        secondMap.put("voya financial", "Financials");
        secondMap.put("3m", "industrials");
        secondMap.put("monsanto", "Materials");
        secondMap.put("sprint", "Telecommunication Services");
        secondMap.put("bunge", "Consumer Staples");
        secondMap.put("schlumberger nv", "Energy");
        secondMap.put("dow chemical", "Materials");
        secondMap.put("state street corp", "Financials");
        secondMap.put("duke Energy", "Utilities");
        secondMap.put("visa", "Information Technology");
        secondMap.put("international business machines", "Information Technology");
        secondMap.put("masco", "industrials");
        secondMap.put("mgm resorts international", "Consumer Discretionary");
        secondMap.put("delta air lines", "industrials");
        secondMap.put("royal caribbean cruises", "Consumer Discretionary");
        secondMap.put("kellogg", "Consumer Staples");
        secondMap.put("wyndham worldwide", "Consumer Discretionary");
        secondMap.put("goldman sachs group", "Financials");
        secondMap.put("owens corning", "industrials");
        secondMap.put("eli lilly and co", "Health Care");
        secondMap.put("intel", "Information Technology");
        secondMap.put("altria group", "Consumer Staples");
        secondMap.put("sempra Energy", "Utilities");
        secondMap.put("united parcel service", "industrials");
        secondMap.put("american express", "Financials");
        secondMap.put("pepsico", "Consumer Staples");
        secondMap.put("air products and chemicals", "Materials");
        secondMap.put("united technologies", "industrials");
        secondMap.put("lockheed martin", "industrials");
        secondMap.put("mcdonald's corp", "Consumer Discretionary");
        secondMap.put("ebay", "Information Technology");
        secondMap.put("exxon mobil", "Energy");
        secondMap.put("adobe systems", "Information Technology");
        secondMap.put("eastman chemical", "Materials");
        secondMap.put("cigna", "Health Care");
        secondMap.put("manpowergroup", "industrials");
        secondMap.put("entergy", "Utilities");
        secondMap.put("southwest airlines", "industrials");
        secondMap.put("freeport-mcmoran", "Materials");
        secondMap.put("phillip morris international", "Consumer Staples");
        secondMap.put("anthem", "Health Care");
        secondMap.put("home depot", "Consumer Discretionary");
        secondMap.put("xerox", "Information Technology");
        secondMap.put("unum group", "Financials");
        secondMap.put("simon property group", "Real Estate");
        secondMap.put("xcel Energy", "Utilities");
        secondMap.put("jm smucker", "Consumer Staples");
        secondMap.put("norfolk southern", "industrials");
        secondMap.put("aes", "Utilities");
        secondMap.put("nextera Energy", "Utilities");
        secondMap.put("wal-mart stores", "Consumer Staples");
        secondMap.put("waste management", "industrials");
        secondMap.put("jabil", "Information Technology");
        secondMap.put("republic services", "industrials");
        secondMap.put("weyerhaeuser co", "Real Estate");
        secondMap.put("bank of new york mellon", "Financials");
        secondMap.put("abbott laboratories", "Health Care");
        secondMap.put("lyondellbasell nv", "Materials");
        secondMap.put("conocophillips", "Energy");
        secondMap.put("fedex", "industrials");
        secondMap.put("cbre group", "Real Estate");
        secondMap.put("kimberly-clark", "Consumer Staples");
        secondMap.put("amgen", "Health Care");
        secondMap.put("gap", "Consumer Discretionary");
        secondMap.put("becton dickinson and co", "Health Care");
        secondMap.put("pfizer", "Health Care");
        secondMap.put("aetna", "Health Care");
        secondMap.put("hewlett packard enterprise co", "Information Technology");
        secondMap.put("cardinal health", "Health Care");
        secondMap.put("occidental petroleum", "Energy");
        secondMap.put("viacom", "Consumer Discretionary");
        secondMap.put("ppl", "Utilities");
        secondMap.put("pvh", "Consumer Discretionary");
        secondMap.put("hormel foods", "Consumer Staples");
        secondMap.put("chevron", "Energy");
        secondMap.put("intuit", "Information Technology");
        secondMap.put("marriott international", "Consumer Discretionary");
        secondMap.put("omnicom group", "Consumer Discretionary");
        secondMap.put("international paper co", "Materials");
        secondMap.put("morgan stanley", "Financials");
        secondMap.put("target", "Consumer Discretionary");
        secondMap.put("parker-hannifin", "industrials");
        secondMap.put("at&t", "Telecommunication Services");
        secondMap.put("jpmorgan chase & co", "Financials");
        secondMap.put("thermo fischer scientific", "Health Care");
        secondMap.put("nrg Energy", "Utilities");
        secondMap.put("lincoln national", "Financials");
        secondMap.put("alcoa", "Materials");
        secondMap.put("aecom", "industrials");
        secondMap.put("autoliv", "Consumer Discretionary");
        secondMap.put("wec Energy group", "Utilities");
        secondMap.put("alliance data systems", "Information Technology");
        secondMap.put("newmont mining ", "Materials");
        secondMap.put("dte Energy", "Utilities");
        secondMap.put("procter & gamble", "Consumer Staples");
        secondMap.put("hartford financial services group", "Financials");
        secondMap.put("kohls", "Consumer Discretionary");
        secondMap.put("motorola solutions", "Information Technology");
        secondMap.put("yum! brands", "Consumer Discretionary");
        secondMap.put("quanta services", "industrials");
        secondMap.put("devon Energy", "Energy");
        secondMap.put("general motors", "Consumer Discretionary");
        secondMap.put("textron", "industrials");
        secondMap.put("rockwell collins", "industrials");
        secondMap.put("avery dennison", "Materials");
        secondMap.put("edison international", "Utilities");
        secondMap.put("carnival", "Consumer Discretionary");
        secondMap.put("constellation brands", "Consumer Staples");
        secondMap.put("valero Energy", "Energy");
        secondMap.put("w w grainger", "industrials");
        secondMap.put("lkq", "Consumer Discretionary");
        secondMap.put("anadarko petroleum", "Energy");
        secondMap.put("northrop grumman", "industrials");
        secondMap.put("avon products", "Consumer Staples");
        secondMap.put("wesco international", "industrials");
        secondMap.put("dover", "industrials");
        secondMap.put("texas instruments", "Information Technology");
        secondMap.put("vmware", "Information Technology");
        secondMap.put("wells fargo & co", "Financials");
        secondMap.put("baxter international", "Health Care");
        secondMap.put("principal financial group", "Financials");
        secondMap.put("alaska air group", "industrials");
        secondMap.put("marsh & mclennan companies", "Financials");
        secondMap.put("apache", "Energy");
        secondMap.put("bank of america", "Financials");
        secondMap.put("twenty-first century fox", "Consumer Discretionary");
        secondMap.put("s&p global", "Financials");
        secondMap.put("hertz global holdings", "industrials");
        secondMap.put("allstate", "Financials");
        secondMap.put("honeywell international", "industrials");
        secondMap.put("hanesbrands", "Consumer Discretionary");
        secondMap.put("staples", "Consumer Discretionary");
        secondMap.put("ameren", "Utilities");
        secondMap.put("dean foods", "Consumer Staples");
        secondMap.put("western union", "Information Technology");
        secondMap.put("halliburton co", "Energy");
        secondMap.put("tjx companies", "Consumer Discretionary");
        secondMap.put("mosaic co", "Materials");
        secondMap.put("owens-illinois", "Materials");
        secondMap.put("marathon petroleum", "Energy");
        secondMap.put("kroger co", "Consumer Staples");
        secondMap.put("american airlines group", "industrials");
        secondMap.put("abbvie", "Health Care");
        secondMap.put("pnc financial services group", "Financials");
        secondMap.put("abm industries", "industrials");
        secondMap.put("conagra brands", "Consumer Staples");
        secondMap.put("jones lang lasalle", "Real Estate");
        secondMap.put("oshkosh", "industrials");
        secondMap.put("coca-cola co", "Consumer Staples");
        secondMap.put("southern co", "Utilities");
        secondMap.put("deere & co", "industrials");
        secondMap.put("dominion Energy", "Utilities");
        secondMap.put("southern copper", "Materials");
        secondMap.put("american electric power company", "Utilities");
        secondMap.put("cintas", "industrials");
        secondMap.put("walt disney co", "Consumer Discretionary");
        secondMap.put("facebook", "Information Technology");
        secondMap.put("mckesson", "Health Care");
        secondMap.put("newell brands", "Consumer Discretionary");
        secondMap.put("tyson foods", "Consumer Staples");
        secondMap.put("verizon communications", "Telecommunication Services");
        secondMap.put("dr pepper snapple group", "Consumer Staples");
        secondMap.put("level 3 communications", "Telecommunication Services");
        secondMap.put("vf", "Consumer Discretionary");
        secondMap.put("centurylink", "Telecommunication Services");
        secondMap.put("centerpoint Energy", "Utilities");
        secondMap.put("arconic", "industrials");
        secondMap.put("macy's", "Consumer Discretionary");
        secondMap.put("u.s. bancorp", "Financials");
        secondMap.put("chesapeake Energy", "Energy");
        secondMap.put("illinois tool works", "industrials");
        secondMap.put("berry global group", "Materials");
        secondMap.put("ryder system", "industrials");
        secondMap.put("corning", "information technologies");
        secondMap.put("public service enterprise group", "Utilities");
        secondMap.put("spectrum group international", "Consumer Discretionary");
        secondMap.put("tesla", "Consumer Discretionary");
        secondMap.put("sherwin-williams co", "Materials");
        secondMap.put("davita", "Health Care");
        secondMap.put("m&t bank", "Financials");
        secondMap.put("fifth third bancorp", "Financials");
        secondMap.put("travelers companies", "Financials");
        secondMap.put("fortive", "industrials");
        secondMap.put("walgreens boots alliance", "Consumer Staples");
        secondMap.put("arris international", "Information Technology");
        secondMap.put("nielsen holdings", "industrials");
        secondMap.put("hollyfrontier", "Energy");
        secondMap.put("navistar international", "industrials");
        secondMap.put("firstEnergy", "Utilities");
        secondMap.put("automatic data processing", "Information Technology");
        secondMap.put("aramark", "Consumer Discretionary");
        secondMap.put("univar", "industrials");
        secondMap.put("costco wholesale", "Consumer Staples");
        secondMap.put("salesforce.com", "Information Technology");
        secondMap.put("emerson electric co", "industrials");
        secondMap.put("steel dynamics", "Materials");
        secondMap.put("northern trust", "Financials");
        secondMap.put("borgwarner", "Consumer Discretionary");
        secondMap.put("e i du pont de nemours and co", "Materials");
        secondMap.put("l brands", "Consumer Discretionary");
        secondMap.put("stanley black & decker", "industrials");
        secondMap.put("mohawk industries", "Consumer Discretionary");
        secondMap.put("markel", "Financials");
        secondMap.put("a-mark precious metals", "Financials");
        secondMap.put("j.b. hunt transport services", "industrials");
        secondMap.put("kinder morgan", "Energy");
        secondMap.put("leucadia national", "Financials");
        secondMap.put("mattel", "Consumer Discretionary");
        secondMap.put("paccar", "industrials");
        secondMap.put("stryker", "Health Care");
        secondMap.put("time warner", "Consumer Discretionary");
        secondMap.put("alphabet", "Information Technology");
        secondMap.put("ak steel holding", "Materials");
        secondMap.put("booz allen hamilton holding", "Information Technology");
        secondMap.put("dxc technology co", "Information Technology");
        secondMap.put("caterpillar", "industrials");
        secondMap.put("loews", "Financials");
        secondMap.put("oneok", "Energy");
        secondMap.put("huntsman", "Materials");
        secondMap.put("american international group", "Financials");
        secondMap.put("arthur j gallagher & co", "Financials");
        secondMap.put("micron technology", "Information Technology");
        secondMap.put("eog resources", "Energy");
        secondMap.put("conduent", "Information Technology");
        secondMap.put("crown holdings", "Materials");
        secondMap.put("coty", "Consumer Staples");
        secondMap.put("capital one financial", "Financials");
        secondMap.put("spirit aerosystems holdings", "industrials");
        secondMap.put("williams companies", "Energy");
        secondMap.put("cbs", "Consumer Discretionary");
        secondMap.put("charles schwab", "Financials");
        secondMap.put("united natural foods", "Consumer Staples");
        secondMap.put("blackrock", "Financials");
        secondMap.put("phillips 66", "Energy");
        secondMap.put("d.r. horton", "Consumer Discretionary");
        secondMap.put("danaher", "Health Care");
        secondMap.put("express scripts holding co", "Health Care");
        secondMap.put("franklin resources", "Financials");
        secondMap.put("gilead sciences", "Health Care");
        secondMap.put("liberty interactive", "Consumer Discretionary");
        secondMap.put("national oilwell varco", "Energy");
        secondMap.put("vistra Energy", "Utilities");
        secondMap.put("westlake chemical", "Materials");
        secondMap.put("zimmer biornet holdings", "Health Care");
        secondMap.put("progressive", "Financials");
        secondMap.put("united rentals", "industrials");
        secondMap.put("nucor", "Materials");
        secondMap.put("united states steel", "Materials");
        secondMap.put("darden restaurants", "Consumer Discretionary");
        secondMap.put("hilton worldwide holdings", "Consumer Discretionary");
        secondMap.put("yum china holdings", "Consumer Discretionary");
        secondMap.put("molina healthcare", "Health Care");
        secondMap.put("autonation", "Consumer Discretionary");
        secondMap.put("post holdings", "Consumer Staples");
        secondMap.put("sysco", "Consumer Staples");
        secondMap.put("o'reilly automotive", "Consumer Discretionary");
        secondMap.put("goodyear tire & rubber", "Consumer Discretionary");
        secondMap.put("lam research", "Information Technology");
        secondMap.put("henry schein", "Health Care");
        secondMap.put("emcor group", "industrials");
        secondMap.put("jacobs engineering group", "industrials");
        secondMap.put("western digital", "information technologies");
        secondMap.put("interpublic group of companies", "Consumer Discretionary");
        secondMap.put("advance auto parts", "Consumer Discretionary");
        secondMap.put("asbury automotive group", "Consumer Discretionary");
        secondMap.put("ascena retail group", "Consumer Discretionary");
        secondMap.put("autozone", "Consumer Discretionary");
        secondMap.put("bed bath & beyond", "Consumer Discretionary");
        secondMap.put("burlington stores", "Consumer Discretionary");
        secondMap.put("foot locker", "Consumer Discretionary");
        secondMap.put("gamestop", "Consumer Discretionary");
        secondMap.put("group 1 automotive", "Consumer Discretionary");
        secondMap.put("lithia motors", "Consumer Discretionary");
        secondMap.put("michaels companies", "Consumer Discretionary");
        secondMap.put("murphy usa", "Consumer Discretionary");
        secondMap.put("penske automotive group", "Consumer Discretionary");
        secondMap.put("ross stores", "Consumer Discretionary");
        secondMap.put("sonic automotive", "Consumer Discretionary");
        secondMap.put("travelcenters of america", "Consumer Discretionary");
        secondMap.put("williams-sonoma", "Consumer Discretionary");
        secondMap.put("telephone and data systems", "Telecommunication Services");
        secondMap.put("ralph lauren", "Consumer Discretionary");
        secondMap.put("tenneco", "Consumer Discretionary");
        secondMap.put("dana", "Consumer Discretionary");
        secondMap.put("federal national mortgage association", "Financials");
        secondMap.put("bb&t", "Financials");
        secondMap.put("genesis healthcare", "Health Care");
        secondMap.put("regions financial", "Financials");
        secondMap.put("amerisourcebergen", "Health Care");
        secondMap.put("c.h. robinson worldwide", "industrials");
        secondMap.put("celanese", "Materials");
        secondMap.put("Energy transfer equity", "Energy");
        secondMap.put("enterprise products partners", "Energy");
        secondMap.put("mastercard", "Information Technology");
        secondMap.put("netflix", "Consumer Discretionary");
        secondMap.put("pbf Energy", "Energy");
        secondMap.put("rr donnelley & sons co", "industrials");
        secondMap.put("ugi", "Utilities");
        secondMap.put("williams partners", "Energy");
        secondMap.put("pilgrims pride", "Consumer Staples");
        secondMap.put("santander holdings usa", "Financials");
        secondMap.put("suntrust banks", "Financials");
        secondMap.put("reinsurance group of america", "Financials");
        secondMap.put("w.r. berkley", "Financials");
        secondMap.put("jetblue airways", "industrials");
        secondMap.put("calpine", "Utilities");
        secondMap.put("alleghany", "Financials");
        secondMap.put("american financial group", "Financials");
        secondMap.put("amtrust financial services", "Financials");
        secondMap.put("assurant", "Financials");
        secondMap.put("cincinnati financial", "Financials");
        secondMap.put("cna financial", "Financials");
        secondMap.put("fidelity national financial", "Financials");
        secondMap.put("first american financial", "Financials");
        secondMap.put("genworth financial", "Financials");
        secondMap.put("old republic international", "Financials");
        secondMap.put("kraft heinz co", "Consumer Staples");
        secondMap.put("treehouse foods", "Consumer Staples");
        secondMap.put("hrg group", "Consumer Staples");
        secondMap.put("spectrum brands holdings", "Consumer Staples");
        secondMap.put("pulitegroup", "Consumer Discretionary");
        secondMap.put("caseys general stores", "Consumer Staples");
        secondMap.put("performance food group co", "Consumer Staples");
        secondMap.put("publix super markets", "Consumer Staples");
        secondMap.put("rite aid", "Consumer Staples");
        secondMap.put("spartannash", "Consumer Staples");
        secondMap.put("supervalu", "Consumer Staples");
        secondMap.put("us foods holding", "Consumer Staples");
        secondMap.put("packaging corp of america", "Materials");
        secondMap.put("baker hughes a ge co", "Energy");
        secondMap.put("news", "Consumer Discretionary");
        secondMap.put("owens & minor", "Health Care");
        secondMap.put("j c penney company", "Consumer Discretionary");
        secondMap.put("avnet", "Information Technology");
        secondMap.put("whole foods market", "Consumer Staples");
        secondMap.put("office depot", "Consumer Discretionary");
        secondMap.put("charter communications", "Consumer Discretionary");
        secondMap.put("federal home loan mortgage", "Financials");
        secondMap.put("mastec", "industrials");
        secondMap.put("lowe's companies", "Consumer Discretionary");
        secondMap.put("activision blizzard", "information technologies");
        secondMap.put("agco", "industrials");
        secondMap.put("ally financial", "Financials");
        secondMap.put("altaba", "Information Technology");
        secondMap.put("altice usa", "Consumer Discretionary");
        secondMap.put("amazon.com", "Consumer Discretionary");
        secondMap.put("american tower", "Real Estate");
        secondMap.put("ameriprise financial", "Financials");
        secondMap.put("amphenol", "Information Technology");
        secondMap.put("andeavor", "Energy");
        secondMap.put("anixter international", "Information Technology");
        secondMap.put("arrow electronics", "Information Technology");
        secondMap.put("avis budget group", "industrials");
        secondMap.put("berkshire hathaway", "Financials");
        secondMap.put("big lots", "Consumer Discretionary");
        secondMap.put("blackstone group", "Financials");
        secondMap.put("builders firstsource", "industrials");
        secondMap.put("calatlantic group", "Consumer Discretionary");
        secondMap.put("carmax", "Consumer Discretionary");
        secondMap.put("cdw", "Information Technology");
        secondMap.put("centene", "Health Care");
        secondMap.put("chemours", "Materials");
        secondMap.put("citizens financial group", "Financials");
        secondMap.put("comcast", "Consumer Discretionary");
        secondMap.put("community health systems", "Health Care");
        secondMap.put("core-mark holding company", "Consumer Discretionary");
        secondMap.put("dell technologies", "Information Technology");
        secondMap.put("dick's sporting goods", "Consumer Discretionary");
        secondMap.put("dillards", "Consumer Discretionary");
        secondMap.put("discover financial services", "Financials");
        secondMap.put("discovery communications", "Consumer Discretionary");
        secondMap.put("dish network", "Consumer Discretionary");
        secondMap.put("dollar general", "Consumer Discretionary");
        secondMap.put("dollar tree", "Consumer Discretionary");
        secondMap.put("Energy transfer partners", "Energy");
        secondMap.put("essendant", "industrials");
        secondMap.put("expedia", "Consumer Discretionary");
        secondMap.put("expeditors international of washington", "industrials");
        secondMap.put("fidelity national information services", "Information Technology");
        secondMap.put("first data", "Information Technology");
        secondMap.put("fiserv", "Information Technology");
        secondMap.put("frontier communications", "Telecommunication Services");
        secondMap.put("general dynamics", "industrials");
        secondMap.put("genuine parts co", "Consumer Discretionary");
        secondMap.put("global partners", "Energy");
        secondMap.put("harris", "Information Technology");
        secondMap.put("hca healthcare", "Health Care");
        secondMap.put("hd supply holdings", "industrials");
        secondMap.put("huntington ingalls industries", "industrials");
        secondMap.put("icahn enterprises", "industrials");
        secondMap.put("iheartmedia", "Consumer Discretionary");
        secondMap.put("ingredion", "Consumer Staples");
        secondMap.put("insight enterprises", "Information Technology");
        secondMap.put("intl fcstone", "Financials");
        secondMap.put("kelly services", "industrials");
        secondMap.put("kindred healthcare", "Health Care");
        secondMap.put("l3 technologies", "industrials");
        secondMap.put("labratory corporation of america holdings", "Health Care");
        secondMap.put("lear", "Consumer Discretionary");
        secondMap.put("lennar", "Consumer Discretionary");
        secondMap.put("lifepoint health", "Health Care");
        secondMap.put("live nation entertainment", "Consumer Discretionary");
        secondMap.put("ncr", "Information Technology");
        secondMap.put("netapp", "Information Technology");
        secondMap.put("ngl Energy partners", "Energy");
        secondMap.put("nvr", "Consumer Discretionary");
        secondMap.put("olin", "Materials");
        secondMap.put("patterson companies", "Health Care");
        secondMap.put("paypal holdings", "Information Technology");
        secondMap.put("plains all american pipeline", "Energy");
        secondMap.put("plains gp holdings", "Energy");
        secondMap.put("priceline group", "Consumer Discretionary");
        secondMap.put("quintiles ims holdings", "Health Care");
        secondMap.put("raymond james financial", "Financials");
        secondMap.put("realogy holdings", "Real Estate");
        secondMap.put("reliance steel & aluminum co", "Materials");
        secondMap.put("robert half international", "industrials");
        secondMap.put("sanmina", "Information Technology");
        secondMap.put("santander consumer usa holdings", "Financials");
        secondMap.put("seaboard", "Consumer Staples");
        secondMap.put("sears holdings", "Consumer Discretionary");
        secondMap.put("sunoco", "Energy");
        secondMap.put("synchrony financial", "Financials");
        secondMap.put("synnex", "Information Technology");
        secondMap.put("t-mobile us", "Telecommunication Services");
        secondMap.put("tanga resources", "Energy");
        secondMap.put("tech data", "Information Technology");
        secondMap.put("tenet healthcare", "Health Care");
        secondMap.put("toll brothers", "Consumer Discretionary");
        secondMap.put("tractor supply co", "Consumer Discretionary");
        secondMap.put("universal health services", "Health Care");
        secondMap.put("veritiv", "industrials");
        secondMap.put("wellcare health plans", "Health Care");
        secondMap.put("westrock co", "Materials");
        secondMap.put("windstream holdings", "Telecommunication Services");
        secondMap.put("world fuel services", "Energy");
        secondMap.put("xpo logistics", "industrials");


        dmap.put("hp", "HP Inc. is an American technology company which develops personal computers, printers and related supplies, as well as 3D Printing solutions.");
        dmap.put("microsoft", "Microsoft Corporation is an American multinational technology company with headquarters in Redmond, Washington. It develops, manufactures, licenses, supports and sells computer software, consumer electronics, personal computers, and related services.");
        dmap.put("nike", "Nike, Inc. is an American multinational corporation that is engaged in the design, development, manufacturing, and worldwide marketing and sales of footwear, apparel, equipment, accessories, and services.");
        dmap.put("apple", "Apple Inc. is an American multinational technology company headquartered in Cupertino, California, that designs, develops, and sells consumer electronics, computer software, and online services.");
        dmap.put("starbucks", "Starbucks Corporation is an American coffee company and coffeehouse chain. Starbucks was founded in Seattle, Washington in 1971. As of 2018, the company operates 28,218 locations worldwide.");
        dmap.put("visa", "Visa Inc. is an American multinational financial services corporation headquartered in Foster City, California, United States. It facilitates electronic funds transfers throughout the world, most commonly through Visa-branded credit cards, gift cards, and debit cards.");
        dmap.put("eli lilly and co", "Eli Lilly and Company is a global pharmaceutical company headquartered in Indianapolis, Indiana, with offices in 18 countries. Its products are sold in approximately 125 countries.");
        dmap.put("fedex", "FedEx Corporation is an American multinational courier delivery services company headquartered in Memphis, Tennessee. The company is known for its overnight shipping service and pioneering a system that could track packages and provide real-time updates on package location, a feature that has now been implemented by most other carrier services.");
        dmap.put("amazon", "Amazon.com, Inc., doing business as Amazon, is an American electronic commerce and cloud computing company based in Seattle, Washington, that was founded by Jeff Bezos on July 5, 1994. The tech giant is the largest Internet retailer in the world as measured by revenue and market capitalization, and second largest after Alibaba Group in terms of total sales.");
        


    }

    public double getScoreNum(String x) {
        if (hmap.containsKey(x.toLowerCase())) {
            return hmap.get(x.toLowerCase());
        }
        return -1.0;
    }

    public String getScoreGrade(String x) {
        if (!hmap.containsKey(x.toLowerCase())) {
            return "ERROR";
        }
        if (getScoreNum(x)>60.00) {
            return "A+";
        }
        else if (getScoreNum(x)>48.30) {
            return "A";
        }
        else if (getScoreNum(x)>43.20) {
            return "A-";
        }
        else if (getScoreNum(x)>38.10) {
            return "B+";
        }
        else if (getScoreNum(x)>31.80) {
            return "B";
        }
        else if (getScoreNum(x)>27.50) {
            return "B-";
        }
        else if (getScoreNum(x)>20.70) {
            return "C+";
        }
        else if (getScoreNum(x)>15.00) {
            return "C";
        }
        else if (getScoreNum(x)>9.80) {
            return "C-";
        }
        else if (getScoreNum(x)>5.60) {
            return "D+";
        }
        else if (getScoreNum(x)>3.90) {
            return "D";
        }
        else if (getScoreNum(x)>0.80) {
            return "D-";
        }
        return "F";
    }

    public String getCompNameNum(double x) {
        if (hmap.containsValue(x)) {
            String m = "";
                for ( String key : hmap.keySet() ) {
                    if (hmap.get(key) ==  x) {
                        m += key + "\n";
                    }
                }
            return m;

        }
        else if (x > 100 || x < 0) {
            return "That's not a valid value";
        }
        else if (!hmap.containsValue(x)) {
            String d = "";
            double count = 0.1;
            boolean status = true;
            while (status) {
                for ( String key : hmap.keySet() ) {
                    if (hmap.get(key) ==  x + count) {
                        d += key;
                        status = false;
                    }
                }
                count += 1;
            }
            return d;
        }
        else {
            return "Sorry there's an error";
        }
    }

    public String getCompNameLetter(String x) {
        String compare = x.toLowerCase();
        if (compare.equals("a+")) {
            return getCompNameNum(83.70);
        }
        else if (compare.equals("a")) {
            return getCompNameNum(60.00);
        }
        else if (compare.equals("a-")) {
            return getCompNameNum(48.30);
        }
        else if (compare.equals("b+")) {
            return getCompNameNum(43.20);
        }
        else if (compare.equals("b")) {
            return getCompNameNum(38.10);
        }
        else if (compare.equals("b-")) {
            return getCompNameNum(31.80);
        }
        else if (compare.equals("c+")) {
            return getCompNameNum(27.50);
        }
        else if (compare.equals("c")) {
            return getCompNameNum(20.70);
        }
        else if (compare.equals("c-")) {
            return getCompNameNum(15.00);
        }
        else if (compare.equals("d+")) {
            return getCompNameNum(9.80);
        }
        else if (compare.equals("d")) {
            return getCompNameNum(5.60);
        }
        else if (compare.equals("d-")) {
            return getCompNameNum(3.90);
        }
        else if (compare.equals("f")) {
            return getCompNameNum(0.80);
        }
        else {
            return "That isn't a valid letter grade";
        }
    }

    public ArrayList<String> getLowest() {
        ArrayList<java.lang.String> result = new ArrayList<String>();

        result.add("Windstream Holdings");
        result.add("World Fuel Services");
        result.add("XPO Logistics");
        result.add("Sears Holdings");

        return result;
    }

    public ArrayList<String> getHighest() {
        ArrayList<java.lang.String> result = new ArrayList<String>();

        result.add("Cisco Systems");
        result.add("Ecolab");
        result.add("Hasbro");
        result.add("PG&E Corp");

        return result;
    }

    public int getRanking(String x) {
        int count = 1;
        for (double i = getScoreNum(x); i < 83.7; i +=0.1) {
            if (hmap.containsValue(i)) {
                count++;
            }
        }
        return count;
    }

    public double getPercentile(String x) {
        int count = 1;
        for (double i = 0.0; i < 83.7; i +=0.1) {
            if (hmap.containsValue(i)) {
                count++;
            }
        }
        return (count - getRanking(x)) / count;
    }

    public ArrayList<String> getPotentialAlt(String x) {
        ArrayList<String> result = new ArrayList<String>();
        for ( String key : secondMap.keySet() ) {
            if (secondMap.get(key).equals(secondMap.get(x.toLowerCase()))) {
                result.add(key);
            }
        }
        return result;
    }

    public String getDescriptor(String x) {
        return dmap.get(x);
    }

}