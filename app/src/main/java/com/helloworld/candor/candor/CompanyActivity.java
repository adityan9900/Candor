package com.helloworld.candor.candor;

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

    public CompanyActivity () {
        hmap.put("ManpowerGroup", 43.70);
        hmap.put("Entergy", 43.30);
        hmap.put("Cisco Systems", 83.70);
        hmap.put("Ecolab", 81.60);
        hmap.put("Hasbro", 80.00);
        hmap.put("PG&E Corp", 78.50);
        hmap.put("Sealed Air", 78.00);
        hmap.put("Best Buy", 76.30);
        hmap.put("Celgene", 71.80);
        hmap.put("Apple", 71.50);
        hmap.put("CMS Energy", 68.80);
        hmap.put("Johnson & Johnson", 68.10);
        hmap.put("Applied Materials", 67.50);
        hmap.put("Exelon", 67.30);
        hmap.put("Ball", 67.30);
        hmap.put("HP", 67.10);
        hmap.put("Biogen", 66.80);
        hmap.put("Boston Scientific", 66.20);
        hmap.put("Microsoft", 66.00);
        hmap.put("Humana", 65.70);
        hmap.put("Merck & Co", 64.90);
        hmap.put("Eversource Energy", 64.80);
        hmap.put("Hershey", 64.70);
        hmap.put("Boeing", 62.90);
        hmap.put("Raytheon", 62.90);
        hmap.put("NVIDIA", 62.80);
        hmap.put("Cummins", 62.40);
        hmap.put("Praxair", 62.30);
        hmap.put("Bristol-Myers Squibb", 61.90);
        hmap.put("Estee Lauder Companies", 61.90);
        hmap.put("Rockwell Automation", 61.80);
        hmap.put("MetLife", 61.70);
        hmap.put("PPG Industries", 61.50);
        hmap.put("Oracle", 61.50);
        hmap.put("Aflac", 60.80);
        hmap.put("General Mills", 60.30);
        hmap.put("Nordstrom", 59.30);
        hmap.put("Mondelez International", 59.30);
        hmap.put("Starbucks", 59.30);
        hmap.put("Leidos Holdings", 59.30);
        hmap.put("CVS Health", 59.30);
        hmap.put("Colgate-Palmolive", 59.20);
        hmap.put("Clorox", 59.20);
        hmap.put("Domtar", 59.20);
        hmap.put("CSX", 59.20);
        hmap.put("UnitedHealth Group", 59.10);
        hmap.put("Qualcomm", 58.90);
        hmap.put("Nike", 58.60);
        hmap.put("General Electric", 57.60);
        hmap.put("Consolidated Edison", 57.40);
        hmap.put("Ford Motor", 57.40);
        hmap.put("Whirlpool", 57.30);
        hmap.put("Avangrid", 57.10);
        hmap.put("Cognizant Technology Solutions", 56.90);
        hmap.put("Campbell Soup", 56.70);
        hmap.put("Prudential Financial", 56.50);
        hmap.put("Harley-Davidson", 55.70);
        hmap.put("Archer Daniels Midland", 54.90);
        hmap.put("Quest Diagnostics", 54.60);
        hmap.put("Las Vegas Sands", 54.60);
        hmap.put("United Continental Holdings", 54.30);
        hmap.put("Citigroup", 53.00);
        hmap.put("Union Pacific", 53.00);
        hmap.put("Host Hotels & Resorts", 51.90);
        hmap.put("Fluor", 51.80);
        hmap.put("Voya Financial", 51.60);
        hmap.put("3M", 51.60);
        hmap.put("Monsanto", 51.50);
        hmap.put("Sprint", 50.70);
        hmap.put("Bunge", 50.20);
        hmap.put("Schlumberger NV", 50.00);
        hmap.put("Dow Chemical", 49.70);
        hmap.put("State Street Corp", 49.60);
        hmap.put("Duke Energy", 49.50);
        hmap.put("Visa", 49.10);
        hmap.put("International Business Machines", 49.10);
        hmap.put("Masco", 49.00);
        hmap.put("MGM Resorts International", 48.40);
        hmap.put("Delta Air Lines", 48.30);
        hmap.put("Royal Caribbean Cruises", 48.20);
        hmap.put("Kellogg", 47.90);
        hmap.put("Wyndham Worldwide", 47.70);
        hmap.put("Goldman Sachs Group", 47.30);
        hmap.put("Owens Corning", 47.20);
        hmap.put("Eli Lilly and Co", 47.00);
        hmap.put("Intel", 46.50);
        hmap.put("Altria Group", 46.50);
        hmap.put("Sempra Energy", 46.40);
        hmap.put("United Parcel Service", 46.20);
        hmap.put("American Express", 46.10);
        hmap.put("PepsiCo", 45.70);
        hmap.put("Air Products and Chemicals", 45.00);
        hmap.put("United Technologies", 44.80);
        hmap.put("Lockheed Martin", 44.50);
        hmap.put("McDonald's Corp", 44.30);
        hmap.put("eBay", 44.10);
        hmap.put("Exxon Mobil", 44.00);
        hmap.put("Adobe Systems", 44.00);
        hmap.put("Eastman Chemical", 43.90);
        hmap.put("Cigna", 43.80);
        hmap.put("Southwest Airlines", 43.20);
        hmap.put("Freeport-McMoRan", 42.90);
        hmap.put("Phillip Morris International", 42.90);
        hmap.put("Anthem", 42.20);
        hmap.put("Home Depot", 41.90);
        hmap.put("Xerox", 41.80);
        hmap.put("Unum Group", 41.60);
        hmap.put("Simon Property Group", 41.50);
        hmap.put("Xcel Energy", 41.40);
        hmap.put("J M Smucker", 41.20);
        hmap.put("Norfolk Southern", 41.10);
        hmap.put("AES", 40.50);
        hmap.put("NextEra Energy", 40.30);
        hmap.put("Wal-Mart Stores", 40.20);
        hmap.put("Waste Management", 40.10);
        hmap.put("Jabil", 40.00);
        hmap.put("Republic Services", 39.90);
        hmap.put("Weyerhaeuser Co", 39.80);
        hmap.put("Bank of New York Mellon", 39.60);
        hmap.put("Abbott Laboratories", 39.30);
        hmap.put("LyondellBasell NV", 39.30);
        hmap.put("ConocoPhillips", 39.20);
        hmap.put("FedEx", 39.10);
        hmap.put("CBRE Group", 39.10);
        hmap.put("Kimberly-Clark", 38.90);
        hmap.put("Amgen", 38.80);
        hmap.put("Gap", 38.60);
        hmap.put("Becton Dickinson and Co", 38.60);
        hmap.put("Pfizer", 38.30);
        hmap.put("Aetna", 38.30);
        hmap.put("Hewlett Packard Enterprise Co", 38.20);
        hmap.put("Cardinal Health", 38.20);
        hmap.put("Occidental Petroleum", 38.10);
        hmap.put("Viacom", 38.10);
        hmap.put("PPL", 38.10);
        hmap.put("PVH", 38.00);
        hmap.put("Hormel Foods", 37.80);
        hmap.put("Chevron", 37.70);
        hmap.put("Intuit", 37.50);
        hmap.put("Marriott International", 37.20);
        hmap.put("Omnicom Group", 37.00);
        hmap.put("International Paper Co", 36.80);
        hmap.put("Morgan Stanley", 36.50);
        hmap.put("Target", 36.30);
        hmap.put("Parker-Hannifin", 36.10);
        hmap.put("AT&T", 35.50);
        hmap.put("JPMorgan Chase & Co", 35.20);
        hmap.put("Thermo Fischer Scientific", 35.00);
        hmap.put("NRG Energy", 35.00);
        hmap.put("Lincoln National", 34.90);
        hmap.put("Alcoa", 34.80);
        hmap.put("AECOM", 34.60);
        hmap.put("Autoliv", 34.20);
        hmap.put("WEC Energy Group", 33.90);
        hmap.put("Alliance Data Systems", 33.90);
        hmap.put("Newmont Mining ", 33.70);
        hmap.put("DTE Energy", 33.10);
        hmap.put("Procter & Gamble", 33.10);
        hmap.put("Hartford Financial Services Group", 32.90);
        hmap.put("Kohls", 32.80);
        hmap.put("Motorola Solutions", 32.60);
        hmap.put("Yum! Brands", 32.60);
        hmap.put("Quanta Services", 32.50);
        hmap.put("Devon Energy", 32.50);
        hmap.put("General Motors", 32.20);
        hmap.put("Textron", 32.20);
        hmap.put("Rockwell Collins", 32.10);
        hmap.put("Avery Dennison", 31.80);
        hmap.put("Edison International", 31.80);
        hmap.put("Carnival", 31.80);
        hmap.put("Constellation Brands", 31.70);
        hmap.put("Valero Energy", 31.60);
        hmap.put("W W Grainger", 31.60);
        hmap.put("LKQ", 31.30);
        hmap.put("Anadarko Petroleum", 30.80);
        hmap.put("Northrop Grumman", 30.70);
        hmap.put("Avon Products", 30.70);
        hmap.put("Wesco International", 30.60);
        hmap.put("Dover", 30.60);
        hmap.put("Texas Instruments", 30.40);
        hmap.put("VMware", 30.40);
        hmap.put("Wells Fargo & Co", 30.30);
        hmap.put("Baxter International", 30.00);
        hmap.put("Principal Financial Group", 30.00);
        hmap.put("Alaska Air Group", 29.80);
        hmap.put("Marsh & McLennan Companies", 29.70);
        hmap.put("Apache", 29.70);
        hmap.put("Bank of America", 29.60);
        hmap.put("Twenty-First Century Fox", 29.50);
        hmap.put("S&P Global", 29.50);
        hmap.put("Hertz Global Holdings", 29.40);
        hmap.put("Allstate", 29.20);
        hmap.put("Honeywell International", 28.80);
        hmap.put("HanesBrands", 28.60);
        hmap.put("Staples", 28.40);
        hmap.put("Ameren", 28.40);
        hmap.put("Dean Foods", 28.30);
        hmap.put("Western Union", 27.90);
        hmap.put("Halliburton Co", 27.90);
        hmap.put("TJX Companies", 27.70);
        hmap.put("Mosaic Co", 27.70);
        hmap.put("Owens-Illinois", 27.50);
        hmap.put("Marathon Petroleum", 27.50);
        hmap.put("Kroger Co", 27.10);
        hmap.put("American Airlines Group", 26.70);
        hmap.put("AbbVie", 25.60);
        hmap.put("PNC Financial Services Group", 26.50);
        hmap.put("ABM Industries", 26.00);
        hmap.put("Conagra Brands", 25.80);
        hmap.put("Jones Lang LaSalle", 25.50);
        hmap.put("Oshkosh", 25.40);
        hmap.put("Coca-Cola Co", 25.40);
        hmap.put("Southern Co", 25.30);
        hmap.put("Deere & Co", 25.10);
        hmap.put("Dominion Energy", 24.80);
        hmap.put("Southern Copper", 24.30);
        hmap.put("American Electric Power Company", 23.60);
        hmap.put("Cintas", 23.60);
        hmap.put("Walt Disney Co", 23.30);
        hmap.put("Facebook", 23.10);
        hmap.put("McKesson", 23.00);
        hmap.put("Newell Brands", 22.90);
        hmap.put("Tyson Foods", 22.80);
        hmap.put("Verizon Communications", 22.10);
        hmap.put("Dr Pepper Snapple Group", 21.50);
        hmap.put("Level 3 Communications", 21.50);
        hmap.put("VF", 21.50);
        hmap.put("CenturyLink", 21.50);
        hmap.put("CenterPoint Energy", 21.30);
        hmap.put("Arconic", 21.30);
        hmap.put("Macy's", 21.20);
        hmap.put("U.S. Bancorp", 21.20);
        hmap.put("Chesapeake Energy", 21.10);
        hmap.put("Illinois Tool Works", 21.00);
        hmap.put("Berry Global Group", 21.00);
        hmap.put("Ryder System", 20.70);
        hmap.put("Corning", 20.00);
        hmap.put("Public Service Enterprise Group", 20.00);
        hmap.put("Spectrum Group International", 20.00);
        hmap.put("Tesla", 20.00);
        hmap.put("Sherwin-Williams Co", 19.90);
        hmap.put("DaVita", 19.80);
        hmap.put("M&T Bank", 19.70);
        hmap.put("Fifth Third Bancorp", 19.20);
        hmap.put("Travelers Companies", 18.90);
        hmap.put("Fortive", 18.70);
        hmap.put("Walgreens Boots Alliance", 18.60);
        hmap.put("Arris International", 18.60);
        hmap.put("Nielsen Holdings", 18.50);
        hmap.put("HollyFrontier", 18.30);
        hmap.put("Navistar International", 18.10);
        hmap.put("FirstEnergy", 18.10);
        hmap.put("Automatic Data Processing", 17.90);
        hmap.put("Aramark", 17.90);
        hmap.put("Univar", 17.70);
        hmap.put("Costco Wholesale", 17.70);
        hmap.put("Salesforce.Com", 17.70);
        hmap.put("Emerson Electric Co", 17.60);
        hmap.put("Steel Dynamics", 17.40);
        hmap.put("Northern Trust", 17.00);
        hmap.put("BorgWarner", 17.00);
        hmap.put("E I du Pont de Nemours and Co", 16.80);
        hmap.put("L Brands", 16.50);
        hmap.put("Stanley Black & Decker", 16.50);
        hmap.put("Mohawk Industries", 15.50);
        hmap.put("Markel", 15.40);
        hmap.put("A-Mark Precious Metals", 15.00);
        hmap.put("J.B. Hunt Transport Services", 15.00);
        hmap.put("Kinder Morgan", 15.00);
        hmap.put("Leucadia National", 15.00);
        hmap.put("Mattel", 15.00);
        hmap.put("PACCAR", 15.00);
        hmap.put("Stryker", 15.00);
        hmap.put("Time Warner", 15.00);
        hmap.put("Alphabet", 14.90);
        hmap.put("AK Steel Holding", 14.60);
        hmap.put("Booz Allen Hamilton Holding", 14.40);
        hmap.put("DXC Technology Co", 14.40);
        hmap.put("Caterpillar", 14.40);
        hmap.put("Loews", 14.40);
        hmap.put("ONEOK", 14.00);
        hmap.put("Huntsman", 13.90);
        hmap.put("American International Group", 13.90);
        hmap.put("Arthur J Gallagher & Co", 13.90);
        hmap.put("Micron Technology", 13.60);
        hmap.put("EOG Resources", 13.10);
        hmap.put("Conduent", 12.90);
        hmap.put("Crown Holdings", 12.50);
        hmap.put("Coty", 12.30);
        hmap.put("Capital One Financial", 12.00);
        hmap.put("Spirit AeroSystems Holdings", 11.40);
        hmap.put("Williams Companies", 10.70);
        hmap.put("CBS", 10.60);
        hmap.put("Charles Schwab", 10.50);
        hmap.put("United Natural Foods", 10.40);
        hmap.put("BlackRock", 10.00);
        hmap.put("Phillips 66", 10.00);
        hmap.put("D.R. Horton", 10.00);
        hmap.put("Danaher", 10.00);
        hmap.put("Express Scripts Holding Co", 10.00);
        hmap.put("Franklin Resources", 10.00);
        hmap.put("Gilead Sciences", 10.00);
        hmap.put("Liberty Interactive", 10.00);
        hmap.put("National Oilwell Varco", 10.00);
        hmap.put("Vistra Energy", 10.00);
        hmap.put("Westlake Chemical", 10.00);
        hmap.put("Zimmer Biomet Holdings", 10.00);
        hmap.put("Progressive", 9.80);
        hmap.put("United Rentals", 9.70);
        hmap.put("Nucor", 9.70);
        hmap.put("United States Steel", 9.60);
        hmap.put("Darden Restaurants", 9.30);
        hmap.put("Hilton Worldwide Holdings", 9.30);
        hmap.put("Yum China Holdings", 9.30);
        hmap.put("Molina Healthcare", 9.30);
        hmap.put("AutoNation", 8.90);
        hmap.put("Post Holdings", 8.60);
        hmap.put("Sysco", 8.00);
        hmap.put("O'Reilly Automotive", 8.00);
        hmap.put("Goodyear Tire & Rubber", 7.70);
        hmap.put("Lam Research", 7.50);
        hmap.put("Henry Schein", 7.20);
        hmap.put("EMCOR Group", 7.00);
        hmap.put("Jacobs Engineering Group", 7.00);
        hmap.put("Western Digital", 6.90);
        hmap.put("Interpublic Group of Companies", 6.80);
        hmap.put("Advance Auto Parts", 6.50);
        hmap.put("Asbury Automotive Group", 6.50);
        hmap.put("Ascena Retail Group", 6.50);
        hmap.put("Autozone", 6.50);
        hmap.put("Bed Bath & Beyond", 6.50);
        hmap.put("Burlington Stores", 6.50);
        hmap.put("Foot Locker", 6.50);
        hmap.put("GameStop", 6.50);
        hmap.put("Group 1 Automotive", 6.50);
        hmap.put("Lithia Motors", 6.50);
        hmap.put("Michaels Companies", 6.50);
        hmap.put("Murphy Usa", 6.50);
        hmap.put("Penske Automotive Group", 6.50);
        hmap.put("Ross Stores", 6.50);
        hmap.put("Sonic Automotive", 6.50);
        hmap.put("TravelCenters of America", 6.50);
        hmap.put("Williams-Sonoma", 6.50);
        hmap.put("Telephone and Data Systems", 6.30);
        hmap.put("Ralph Lauren", 6.20);
        hmap.put("Tenneco", 5.70);
        hmap.put("Dana", 5.60);
        hmap.put("Federal National Mortgage Association", 5.60);
        hmap.put("BB&T", 5.40);
        hmap.put("Genesis Healthcare", 5.20);
        hmap.put("Regions Financial", 5.10);
        hmap.put("AmerisourceBergen", 5.00);
        hmap.put("C.H. Robinson Worldwide", 5.00);
        hmap.put("Celanese", 5.00);
        hmap.put("Energy Transfer Equity", 5.00);
        hmap.put("Enterprise Products Partners", 5.00);
        hmap.put("Mastercard", 5.00);
        hmap.put("Netflix", 5.00);
        hmap.put("PBF Energy", 5.00);
        hmap.put("RR Donnelley & Sons Co", 5.00);
        hmap.put("UGI", 5.00);
        hmap.put("Williams Partners", 5.00);
        hmap.put("Pilgrims Pride", 4.70);
        hmap.put("Santander Holdings USA", 4.70);
        hmap.put("SunTrust Banks", 4.70);
        hmap.put("Reinsurance Group of America", 4.50);
        hmap.put("W.R. Berkley", 4.30);
        hmap.put("JetBlue Airways", 4.20);
        hmap.put("Calpine", 4.10);
        hmap.put("Alleghany", 3.90);
        hmap.put("American Financial Group", 3.90);
        hmap.put("AmTrust Financial Services", 3.90);
        hmap.put("Assurant", 3.90);
        hmap.put("Cincinnati Financial", 3.90);
        hmap.put("CNA Financial", 3.90);
        hmap.put("Fidelity National Financial", 3.90);
        hmap.put("First American Financial", 3.90);
        hmap.put("Genworth Financial", 3.90);
        hmap.put("Old Republic International", 3.90);
        hmap.put("Kraft Heinz Co", 3.60);
        hmap.put("TreeHouse Foods", 3.60);
        hmap.put("HRG Group", 3.30);
        hmap.put("Spectrum Brands Holdings", 3.30);
        hmap.put("PuliteGroup", 3.20);
        hmap.put("Casey's General Stores", 3.00);
        hmap.put("Performance Food Group Co", 3.00);
        hmap.put("Publix Super Markets", 3.00);
        hmap.put("Rite Aid", 3.00);
        hmap.put("SpartanNash", 3.00);
        hmap.put("Supervalu", 3.00);
        hmap.put("US Foods Holding", 3.00);
        hmap.put("Packaging Corp of America", 2.70);
        hmap.put("Baker Hughes A GE Co", 2.30);
        hmap.put("News", 2.20);
        hmap.put("Owens & Minor", 2.00);
        hmap.put("J C Penney Company", 1.90);
        hmap.put("Avnet", 1.80);
        hmap.put("Whole Foods Market", 1.80);
        hmap.put("Office Depot", 1.70);
        hmap.put("Charter Communications", 1.20);
        hmap.put("Federal Home Loan Mortgage", 0.90);
        hmap.put("MasTec", 0.90);
        hmap.put("Lowe's Companies", 0.80);
        hmap.put("Activision Blizzard", 0.00);
        hmap.put("AGCO", 0.00);
        hmap.put("Ally Financial", 0.00);
        hmap.put("Altaba", 0.00);
        hmap.put("Altice USA", 0.00);
        hmap.put("Amazon.com", 0.00);
        hmap.put("American Tower", 0.00);
        hmap.put("Ameriprise Financial", 0.00);
        hmap.put("Amphenol", 0.00);
        hmap.put("Andeavor", 0.00);
        hmap.put("Anixter International", 0.00);
        hmap.put("Arrow Electronics", 0.00);
        hmap.put("Avis Budget Group", 0.00);
        hmap.put("Berkshire Hathaway", 0.00);
        hmap.put("Big Lots", 0.00);
        hmap.put("Blackstone Group", 0.00);
        hmap.put("Builders FirstSource", 0.00);
        hmap.put("CalAtlantic Group", 0.00);
        hmap.put("Carmax", 0.00);
        hmap.put("CDW", 0.00);
        hmap.put("Centene", 0.00);
        hmap.put("Chemours", 0.00);
        hmap.put("Citizens Financial Group", 0.00);
        hmap.put("Comcast", 0.00);
        hmap.put("Community Health Systems", 0.00);
        hmap.put("Core-Mark Holding Company", 0.00);
        hmap.put("Dell Technologies", 0.00);
        hmap.put("Dick's Sporting Goods", 0.00);
        hmap.put("Dillards", 0.00);
        hmap.put("Discover Financial Services", 0.00);
        hmap.put("Discovery Communications", 0.00);
        hmap.put("DISH Network", 0.00);
        hmap.put("Dollar General", 0.00);
        hmap.put("Dollar Tree", 0.00);
        hmap.put("Energy Transfer Partners", 0.00);
        hmap.put("Essendant", 0.00);
        hmap.put("Expedia", 0.00);
        hmap.put("Expeditors International of Washington", 0.00);
        hmap.put("Fidelity National Information Services", 0.00);
        hmap.put("First Data", 0.00);
        hmap.put("Fiserv", 0.00);
        hmap.put("Frontier Communications", 0.00);
        hmap.put("General Dynamics", 0.00);
        hmap.put("Genuine Parts Co", 0.00);
        hmap.put("Global Partners", 0.00);
        hmap.put("Harris", 0.00);
        hmap.put("HCA Healthcare", 0.00);
        hmap.put("HD Supply Holdings", 0.00);
        hmap.put("Huntington Ingalls Industries", 0.00);
        hmap.put("Icahn Enterprises", 0.00);
        hmap.put("iHeartMedia", 0.00);
        hmap.put("Ingredion", 0.00);
        hmap.put("Insight Enterprises", 0.00);
        hmap.put("INTL FCStone", 0.00);
        hmap.put("Kelly Services", 0.00);
        hmap.put("Kindred Healthcare", 0.00);
        hmap.put("L3 Technologies", 0.00);
        hmap.put("Laboratory Corporation of America Holdings", 0.00);
        hmap.put("Lear", 0.00);
        hmap.put("Lennar", 0.00);
        hmap.put("LifePoint Health", 0.00);
        hmap.put("Live Nation Entertainment", 0.00);
        hmap.put("NCR", 0.00);
        hmap.put("NetApp", 0.00);
        hmap.put("NGL Energy Partners", 0.00);
        hmap.put("NVR", 0.00);
        hmap.put("Olin", 0.00);
        hmap.put("Patterson Companies", 0.00);
        hmap.put("PayPal Holdings", 0.00);
        hmap.put("Plains GP Holdings", 0.00);
        hmap.put("Priceline Group", 0.00);
        hmap.put("Quintiles IMS Holdings", 0.00);
        hmap.put("Raymond James Financial", 0.00);
        hmap.put("Realogy Holdings", 0.00);
        hmap.put("Reliance Steel & Aluminum Co", 0.00);
        hmap.put("Robert Half International", 0.00);
        hmap.put("Sanmina", 0.00);
        hmap.put("Santander Consumer USA Holdings", 0.00);
        hmap.put("Seaboard", 0.00);
        hmap.put("Sears Holdings", 0.00);
        hmap.put("Sunoco", 0.00);
        hmap.put("Synchrony Financial", 0.00);
        hmap.put("SYNNEX", 0.00);
        hmap.put("T-Mobile US", 0.00);
        hmap.put("Tanga Resources", 0.00);
        hmap.put("Tech Data", 0.00);
        hmap.put("Tenet Healthcare", 0.00);
        hmap.put("Toll Brothers", 0.00);
        hmap.put("Tractor Supply Co", 0.00);
        hmap.put("Universal Health Services", 0.00);
        hmap.put("Veritiv", 0.00);
        hmap.put("WellCare Health Plans", 0.00);
        hmap.put("WestRock Co", 0.00);
        hmap.put("Windstream Holdings", 0.00);
        hmap.put("World Fuel Services", 0.00);
        hmap.put("XPO Logistics", 0.00);
        hmap.put("Plains All American Pipeline", 0.00);


        secondMap.put("Cisco Systems", "Information Technology");
        secondMap.put("Ecolab", "Materials");
        secondMap.put("Hasbro", "Consumer Discretionary");
        secondMap.put("PG&E Corp", "Utilities");
        secondMap.put("Sealed Air", "Materials");
        secondMap.put("Best Buy Co", "Consumer Discretionary");
        secondMap.put("Celgene", "Health Care");
        secondMap.put("Apple", "Information Technology");
        secondMap.put("CMS Energy", "Utilities");
        secondMap.put("Johnson & Johnson", "Health Care");
        secondMap.put("Applied Materials", "Information Technology");
        secondMap.put("Exelon", "Utilities");
        secondMap.put("Ball", "Materials");
        secondMap.put("HP", "Information Technology");
        secondMap.put("Biogen", "Health Care");
        secondMap.put("Boston Scientific", "Health Care");
        secondMap.put("Microsoft", "Information Technology");
        secondMap.put("Humana", "Health Care");
        secondMap.put("Merck & Co", "Health Care");
        secondMap.put("Eversource Energy", "Utilities");
        secondMap.put("Hershey", "Consumer Staples");
        secondMap.put("Boeing", "Industrials");
        secondMap.put("Raytheon", "Industrials");
        secondMap.put("NVIDIA", "Information Technology");
        secondMap.put("Cummins", "Industrials");
        secondMap.put("Praxair", "Materials");
        secondMap.put("Bristol-Myers Squibb", "Health Care");
        secondMap.put("Estee Lauder Companies", "Consumer Staples");
        secondMap.put("Rockwell Automation", "Industrials");
        secondMap.put("MetLife", "Financials");
        secondMap.put("PPG Industries", "Materials");
        secondMap.put("Oracle", "Information Technology");
        secondMap.put("Aflac", "Financials");
        secondMap.put("General Mills", "Consumer Staples");
        secondMap.put("Nordstrom", "Consumer Discretionary");
        secondMap.put("Mondelez International", "Consumer Staples");
        secondMap.put("Starbucks", "Consumer Discretionary");
        secondMap.put("Leidos Holdings", "Information Technology");
        secondMap.put("CVS Health", "Consumer Staples");
        secondMap.put("Colgate-Palmolive", "Consumer Staples");
        secondMap.put("Clorox", "Consumer Staples");
        secondMap.put("Domtar", "Materials");
        secondMap.put("CSX", "Industrials");
        secondMap.put("UnitedHealth Group", "Health Care");
        secondMap.put("Qualcomm", "Information Technology");
        secondMap.put("Nike", "Consumer Discretionary");
        secondMap.put("General Electric", "Industrials");
        secondMap.put("Consolidated Edison", "Utilities");
        secondMap.put("Ford Motor", "Consumer Discretionary");
        secondMap.put("Whirlpool", "Consumer Discretionary");
        secondMap.put("Avangrid", "Utilities");
        secondMap.put("Cognizant Technology Solutions", "Information Technology");
        secondMap.put("Campbell Soup", "Consumer Staples");
        secondMap.put("Prudential Financial", "Financials");
        secondMap.put("Harley-Davidson", "Consumer Discretionary");
        secondMap.put("Archer Daniels Midland", "Consumer Staples");
        secondMap.put("Quest Diagnostics", "Health Care");
        secondMap.put("Las Vegas Sands", "Consumer Discretionary");
        secondMap.put("United Continental Holdings", "Industrials");
        secondMap.put("Citigroup", "Financials");
        secondMap.put("Union Pacific", "Industrials");
        secondMap.put("Host Hotels & Resorts", "Real Estate");
        secondMap.put("Fluor", "Industrials");
        secondMap.put("Voya Financial", "Financials");
        secondMap.put("3M", "Industrials");
        secondMap.put("Monsanto", "Materials");
        secondMap.put("Sprint", "Telecommunication Services");
        secondMap.put("Bunge", "Consumer Staples");
        secondMap.put("Schlumberger NV", "Energy");
        secondMap.put("Dow Chemical", "Materials");
        secondMap.put("State Street Corp", "Financials");
        secondMap.put("Duke Energy", "Utilities");
        secondMap.put("Visa", "Information Technology");
        secondMap.put("International Business Machines", "Information Technology");
        secondMap.put("Masco", "Industrials");
        secondMap.put("MGM Resorts International", "Consumer Discretionary");
        secondMap.put("Delta Air Lines", "Industrials");
        secondMap.put("Royal Caribbean Cruises", "Consumer Discretionary");
        secondMap.put("Kellogg", "Consumer Staples");
        secondMap.put("Wyndham Worldwide", "Consumer Discretionary");
        secondMap.put("Goldman Sachs Group", "Financials");
        secondMap.put("Owens Corning", "Industrials");
        secondMap.put("Eli Lilly and Co", "Health Care");
        secondMap.put("Intel", "Information Technology");
        secondMap.put("Altria Group", "Consumer Staples");
        secondMap.put("Sempra Energy", "Utilities");
        secondMap.put("United Parcel Service", "Industrials");
        secondMap.put("American Express", "Financials");
        secondMap.put("PepsiCo", "Consumer Staples");
        secondMap.put("Air Products and Chemicals", "Materials");
        secondMap.put("United Technologies", "Industrials");
        secondMap.put("Lockheed Martin", "Industrials");
        secondMap.put("McDonald's Corp", "Consumer Discretionary");
        secondMap.put("eBay", "Information Technology");
        secondMap.put("Exxon Mobil", "Energy");
        secondMap.put("Adobe Systems", "Information Technology");
        secondMap.put("Eastman Chemical", "Materials");
        secondMap.put("Cigna", "Health Care");
        secondMap.put("ManpowerGroup", "Industrials");
        secondMap.put("Entergy", "Utilities");
        secondMap.put("Southwest Airlines", "Industrials");
        secondMap.put("Freeport-McMoRan", "Materials");
        secondMap.put("Phillip Morris International", "Consumer Staples");
        secondMap.put("Anthem", "Health Care");
        secondMap.put("Home Depot", "Consumer Discretionary");
        secondMap.put("Xerox", "Information Technology");
        secondMap.put("Unum Group", "Financials");
        secondMap.put("Simon Property Group", "Real Estate");
        secondMap.put("Xcel Energy", "Utilities");
        secondMap.put("J M Smucker", "Consumer Staples");
        secondMap.put("Norfolk Southern", "Industrials");
        secondMap.put("AES", "Utilities");
        secondMap.put("NextEra Energy", "Utilities");
        secondMap.put("Wal-Mart Stores", "Consumer Staples");
        secondMap.put("Waste Management", "Industrials");
        secondMap.put("Jabil", "Information Technology");
        secondMap.put("Republic Services", "Industrials");
        secondMap.put("Weyerhaeuser Co", "Real Estate");
        secondMap.put("Bank of New York Mellon", "Financials");
        secondMap.put("Abbott Laboratories", "Health Care");
        secondMap.put("LyondellBasell NV", "Materials");
        secondMap.put("ConocoPhillips", "Energy");
        secondMap.put("FedEx", "Industrials");
        secondMap.put("CBRE Group", "Real Estate");
        secondMap.put("Kimberly-Clark", "Consumer Staples");
        secondMap.put("Amgen", "Health Care");
        secondMap.put("Gap", "Consumer Discretionary");
        secondMap.put("Becton Dickinson and Co", "Health Care");
        secondMap.put("Pfizer", "Health Care");
        secondMap.put("Aetna", "Health Care");
        secondMap.put("Hewlett Packard Enterprise Co", "Information Technology");
        secondMap.put("Cardinal Health", "Health Care");
        secondMap.put("Occidental Petroleum", "Energy");
        secondMap.put("Viacom", "Consumer Discretionary");
        secondMap.put("PPL", "Utilities");
        secondMap.put("PVH", "Consumer Discretionary");
        secondMap.put("Hormel Foods", "Consumer Staples");
        secondMap.put("Chevron", "Energy");
        secondMap.put("Intuit", "Information Technology");
        secondMap.put("Marriott International", "Consumer Discretionary");
        secondMap.put("Omnicom Group", "Consumer Discretionary");
        secondMap.put("International Paper Co", "Materials");
        secondMap.put("Morgan Stanley", "Financials");
        secondMap.put("Target", "Consumer Discretionary");
        secondMap.put("Parker-Hannifin", "Industrials");
        secondMap.put("AT&T", "Telecommunication Services");
        secondMap.put("JPMorgan Chase & Co", "Financials");
        secondMap.put("Thermo Fischer Scientific", "Health Care");
        secondMap.put("NRG Energy", "Utilities");
        secondMap.put("Lincoln National", "Financials");
        secondMap.put("Alcoa", "Materials");
        secondMap.put("AECOM", "Industrials");
        secondMap.put("Autoliv", "Consumer Discretionary");
        secondMap.put("WEC Energy Group", "Utilities");
        secondMap.put("Alliance Data Systems", "Information Technology");
        secondMap.put("Newmont Mining ", "Materials");
        secondMap.put("DTE Energy", "Utilities");
        secondMap.put("Procter & Gamble", "Consumer Staples");
        secondMap.put("Hartford Financial Services Group", "Financials");
        secondMap.put("Kohls", "Consumer Discretionary");
        secondMap.put("Motorola Solutions", "Information Technology");
        secondMap.put("Yum! Brands", "Consumer Discretionary");
        secondMap.put("Quanta Services", "Industrials");
        secondMap.put("Devon Energy", "Energy");
        secondMap.put("General Motors", "Consumer Discretionary");
        secondMap.put("Textron", "Industrials");
        secondMap.put("Rockwell Collins", "Industrials");
        secondMap.put("Avery Dennison", "Materials");
        secondMap.put("Edison International", "Utilities");
        secondMap.put("Carnival", "Consumer Discretionary");
        secondMap.put("Constellation Brands", "Consumer Staples");
        secondMap.put("Valero Energy", "Energy");
        secondMap.put("W W Grainger", "Industrials");
        secondMap.put("LKQ", "Consumer Discretionary");
        secondMap.put("Anadarko Petroleum", "Energy");
        secondMap.put("Northrop Grumman", "Industrials");
        secondMap.put("Avon Products", "Consumer Staples");
        secondMap.put("Wesco International", "Industrials");
        secondMap.put("Dover", "Industrials");
        secondMap.put("Texas Instruments", "Information Technology");
        secondMap.put("VMware", "Information Technology");
        secondMap.put("Wells Fargo & Co", "Financials");
        secondMap.put("Baxter International", "Health Care");
        secondMap.put("Principal Financial Group", "Financials");
        secondMap.put("Alaska Air Group", "Industrials");
        secondMap.put("Marsh & McLennan Companies", "Financials");
        secondMap.put("Apache", "Energy");
        secondMap.put("Bank of America", "Financials");
        secondMap.put("Twenty-First Century Fox", "Consumer Discretionary");
        secondMap.put("S&P Global", "Financials");
        secondMap.put("Hertz Global Holdings", "Industrials");
        secondMap.put("Allstate", "Financials");
        secondMap.put("Honeywell International", "Industrials");
        secondMap.put("HanesBrands", "Consumer Discretionary");
        secondMap.put("Staples", "Consumer Discretionary");
        secondMap.put("Ameren", "Utilities");
        secondMap.put("Dean Foods", "Consumer Staples");
        secondMap.put("Western Union", "Information Technology");
        secondMap.put("Halliburton Co", "Energy");
        secondMap.put("TJX Companies", "Consumer Discretionary");
        secondMap.put("Mosaic Co", "Materials");
        secondMap.put("Owens-Illinois", "Materials");
        secondMap.put("Marathon Petroleum", "Energy");
        secondMap.put("Kroger Co", "Consumer Staples");
        secondMap.put("American Airlines Group", "Industrials");
        secondMap.put("AbbVie", "Health Care");
        secondMap.put("PNC Financial Services Group", "Financials");
        secondMap.put("ABM Industries", "Industrials");
        secondMap.put("Conagra Brands", "Consumer Staples");
        secondMap.put("Jones Lang LaSalle", "Real Estate");
        secondMap.put("Oshkosh", "Industrials");
        secondMap.put("Coca-Cola Co", "Consumer Staples");
        secondMap.put("Southern Co", "Utilities");
        secondMap.put("Deere & Co", "Industrials");
        secondMap.put("Dominion Energy", "Utilities");
        secondMap.put("Southern Copper", "Materials");
        secondMap.put("American Electric Power Company", "Utilities");
        secondMap.put("Cintas", "Industrials");
        secondMap.put("Walt Disney Co", "Consumer Discretionary");
        secondMap.put("Facebook", "Information Technology");
        secondMap.put("McKesson", "Health Care");
        secondMap.put("Newell Brands", "Consumer Discretionary");
        secondMap.put("Tyson Foods", "Consumer Staples");
        secondMap.put("Verizon Communications", "Telecommunication Services");
        secondMap.put("Dr Pepper Snapple Group", "Consumer Staples");
        secondMap.put("Level 3 Communications", "Telecommunication Services");
        secondMap.put("VF", "Consumer Discretionary");
        secondMap.put("CenturyLink", "Telecommunication Services");
        secondMap.put("CenterPoint Energy", "Utilities");
        secondMap.put("Arconic", "Industrials");
        secondMap.put("Macy's", "Consumer Discretionary");
        secondMap.put("U.S. Bancorp", "Financials");
        secondMap.put("Chesapeake Energy", "Energy");
        secondMap.put("Illinois Tool Works", "Industrials");
        secondMap.put("Berry Global Group", "Materials");
        secondMap.put("Ryder System", "Industrials");
        secondMap.put("Corning", "Information Technologies");
        secondMap.put("Public Service Enterprise Group", "Utilities");
        secondMap.put("Spectrum Group International", "Consumer Discretionary");
        secondMap.put("Tesla", "Consumer Discretionary");
        secondMap.put("Sherwin-Williams Co", "Materials");
        secondMap.put("DaVita", "Health Care");
        secondMap.put("M&T Bank", "Financials");
        secondMap.put("Fifth Third Bancorp", "Financials");
        secondMap.put("Travelers Companies", "Financials");
        secondMap.put("Fortive", "Industrials");
        secondMap.put("Walgreens Boots Alliance", "Consumer Staples");
        secondMap.put("Arris International", "Information Technology");
        secondMap.put("Nielsen Holdings", "Industrials");
        secondMap.put("HollyFrontier", "Energy");
        secondMap.put("Navistar International", "Industrials");
        secondMap.put("FirstEnergy", "Utilities");
        secondMap.put("Automatic Data Processing", "Information Technology");
        secondMap.put("Aramark", "Consumer Discretionary");
        secondMap.put("Univar", "Industrials");
        secondMap.put("Costco Wholesale", "Consumer Staples");
        secondMap.put("Salesforce.Com", "Information Technology");
        secondMap.put("Emerson Electric Co", "Industrials");
        secondMap.put("Steel Dynamics", "Materials");
        secondMap.put("Northern Trust", "Financials");
        secondMap.put("BorgWarner", "Consumer Discretionary");
        secondMap.put("E I du Pont de Nemours and Co", "Materials");
        secondMap.put("L Brands", "Consumer Discretionary");
        secondMap.put("Stanley Black & Decker", "Industrials");
        secondMap.put("Mohawk Industries", "Consumer Discretionary");
        secondMap.put("Markel", "Financials");
        secondMap.put("A-Mark Precious Metals", "Financials");
        secondMap.put("J.B. Hunt Transport Services", "Industrials");
        secondMap.put("Kinder Morgan", "Energy");
        secondMap.put("Leucadia National", "Financials");
        secondMap.put("Mattel", "Consumer Discretionary");
        secondMap.put("PACCAR", "Industrials");
        secondMap.put("Stryker", "Health Care");
        secondMap.put("Time Warner", "Consumer Discretionary");
        secondMap.put("Alphabet", "Information Technology");
        secondMap.put("AK Steel Holding", "Materials");
        secondMap.put("Booz Allen Hamilton Holding", "Information Technology");
        secondMap.put("DXC Technology Co", "Information Technology");
        secondMap.put("Caterpillar", "Industrials");
        secondMap.put("Loews", "Financials");
        secondMap.put("ONEOK", "Energy");
        secondMap.put("Huntsman", "Materials");
        secondMap.put("American International Group", "Financials");
        secondMap.put("Arthur J Gallagher & Co", "Financials");
        secondMap.put("Micron Technology", "Information Technology");
        secondMap.put("EOG Resources", "Energy");
        secondMap.put("Conduent", "Information Technology");
        secondMap.put("Crown Holdings", "Materials");
        secondMap.put("Coty", "Consumer Staples");
        secondMap.put("Capital One Financial", "Financials");
        secondMap.put("Spirit AeroSystems Holdings", "Industrials");
        secondMap.put("Williams Companies", "Energy");
        secondMap.put("CBS", "Consumer Discretionary");
        secondMap.put("Charles Schwab", "Financials");
        secondMap.put("United Natural Foods", "Consumer Staples");
        secondMap.put("BlackRock", "Financials");
        secondMap.put("Phillips 66", "Energy");
        secondMap.put("D.R. Horton", "Consumer Discretionary");
        secondMap.put("Danaher", "Health Care");
        secondMap.put("Express Scripts Holding Co", "Health Care");
        secondMap.put("Franklin Resources", "Financials");
        secondMap.put("Gilead Sciences", "Health Care");
        secondMap.put("Liberty Interactive", "Consumer Discretionary");
        secondMap.put("National Oilwell Varco", "Energy");
        secondMap.put("Vistra Energy", "Utilities");
        secondMap.put("Westlake Chemical", "Materials");
        secondMap.put("Zimmer Biornet Holdings", "Health Care");
        secondMap.put("Progressive", "Financials");
        secondMap.put("United Rentals", "Industrials");
        secondMap.put("Nucor", "Materials");
        secondMap.put("United States Steel", "Materials");
        secondMap.put("Darden Restaurants", "Consumer Discretionary");
        secondMap.put("Hilton Worldwide Holdings", "Consumer Discretionary");
        secondMap.put("Yum China Holdings", "Consumer Discretionary");
        secondMap.put("Molina Healthcare", "Health Care");
        secondMap.put("AutoNation", "Consumer Discretionary");
        secondMap.put("Post Holdings", "Consumer Staples");
        secondMap.put("Sysco", "Consumer Staples");
        secondMap.put("O'Reilly Automotive", "Consumer Discretionary");
        secondMap.put("Goodyear Tire & Rubber", "Consumer Discretionary");
        secondMap.put("Lam Research", "Information Technology");
        secondMap.put("Henry Schein", "Health Care");
        secondMap.put("EMCOR Group", "Industrials");
        secondMap.put("Jacobs Engineering Group", "Industrials");
        secondMap.put("Western Digital", "Information Technologies");
        secondMap.put("Interpublic Group of Companies", "Consumer Discretionary");
        secondMap.put("Advance Auto Parts", "Consumer Discretionary");
        secondMap.put("Asbury Automotive Group", "Consumer Discretionary");
        secondMap.put("Ascena Retail Group", "Consumer Discretionary");
        secondMap.put("Autozone", "Consumer Discretionary");
        secondMap.put("Bed Bath & Beyond", "Consumer Discretionary");
        secondMap.put("Burlington Stores", "Consumer Discretionary");
        secondMap.put("Foot Locker", "Consumer Discretionary");
        secondMap.put("GameStop", "Consumer Discretionary");
        secondMap.put("Group 1 Automotive", "Consumer Discretionary");
        secondMap.put("Lithia Motors", "Consumer Discretionary");
        secondMap.put("Michaels Companies", "Consumer Discretionary");
        secondMap.put("Murphy Usa", "Consumer Discretionary");
        secondMap.put("Penske Automotive Group", "Consumer Discretionary");
        secondMap.put("Ross Stores", "Consumer Discretionary");
        secondMap.put("Sonic Automotive", "Consumer Discretionary");
        secondMap.put("TravelCenters of America", "Consumer Discretionary");
        secondMap.put("Williams-Sonoma", "Consumer Discretionary");
        secondMap.put("Telephone and Data Systems", "Telecommunication Services");
        secondMap.put("Ralph Lauren", "Consumer Discretionary");
        secondMap.put("Tenneco", "Consumer Discretionary");
        secondMap.put("Dana", "Consumer Discretionary");
        secondMap.put("Federal National Mortgage Association", "Financials");
        secondMap.put("BB&T", "Financials");
        secondMap.put("Genesis Healthcare", "Health Care");
        secondMap.put("Regions Financial", "Financials");
        secondMap.put("AmerisourceBergen", "Health Care");
        secondMap.put("C.H. Robinson Worldwide", "Industrials");
        secondMap.put("Celanese", "Materials");
        secondMap.put("Energy Transfer Equity", "Energy");
        secondMap.put("Enterprise Products Partners", "Energy");
        secondMap.put("Mastercard", "Information Technology");
        secondMap.put("Netflix", "Consumer Discretionary");
        secondMap.put("PBF Energy", "Energy");
        secondMap.put("RR Donnelley & Sons Co", "Industrials");
        secondMap.put("UGI", "Utilities");
        secondMap.put("Williams Partners", "Energy");
        secondMap.put("Pilgrims Pride", "Consumer Staples");
        secondMap.put("Santander Holdings USA", "Financials");
        secondMap.put("SunTrust Banks", "Financials");
        secondMap.put("Reinsurance Group of America", "Financials");
        secondMap.put("W.R. Berkley", "Financials");
        secondMap.put("JetBlue Airways", "Industrials");
        secondMap.put("Calpine", "Utilities");
        secondMap.put("Alleghany", "Financials");
        secondMap.put("American Financial Group", "Financials");
        secondMap.put("AmTrust Financial Services", "Financials");
        secondMap.put("Assurant", "Financials");
        secondMap.put("Cincinnati Financial", "Financials");
        secondMap.put("CNA Financial", "Financials");
        secondMap.put("Fidelity National Financial", "Financials");
        secondMap.put("First American Financial", "Financials");
        secondMap.put("Genworth Financial", "Financials");
        secondMap.put("Old Republic International", "Financials");
        secondMap.put("Kraft Heinz Co", "Consumer Staples");
        secondMap.put("TreeHouse Foods", "Consumer Staples");
        secondMap.put("HRG Group", "Consumer Staples");
        secondMap.put("Spectrum Brands Holdings", "Consumer Staples");
        secondMap.put("PuliteGroup", "Consumer Discretionary");
        secondMap.put("Caseys General Stores", "Consumer Staples");
        secondMap.put("Performance Food Group Co", "Consumer Staples");
        secondMap.put("Publix Super Markets", "Consumer Staples");
        secondMap.put("Rite Aid", "Consumer Staples");
        secondMap.put("SpartanNash", "Consumer Staples");
        secondMap.put("Supervalu", "Consumer Staples");
        secondMap.put("US Foods Holding", "Consumer Staples");
        secondMap.put("Packaging Corp of America", "Materials");
        secondMap.put("Baker Hughes A GE Co", "Energy");
        secondMap.put("News", "Consumer Discretionary");
        secondMap.put("Owens & Minor", "Health Care");
        secondMap.put("J C Penney Company", "Consumer Discretionary");
        secondMap.put("Avnet", "Information Technology");
        secondMap.put("Whole Foods Market", "Consumer Staples");
        secondMap.put("Office Depot", "Consumer Discretionary");
        secondMap.put("Charter Communications", "Consumer Discretionary");
        secondMap.put("Federal Home Loan Mortgage", "Financials");
        secondMap.put("MasTec", "Industrials");
        secondMap.put("Lowe's Companies", "Consumer Discretionary");
        secondMap.put("Activision Blizzard", "Information Technologies");
        secondMap.put("AGCO", "Industrials");
        secondMap.put("Ally Financial", "Financials");
        secondMap.put("Altaba", "Information Technology");
        secondMap.put("Altice USA", "Consumer Discretionary");
        secondMap.put("Amazon.com", "Consumer Discretionary");
        secondMap.put("American Tower", "Real Estate");
        secondMap.put("Ameriprise Financial", "Financials");
        secondMap.put("Amphenol", "Information Technology");
        secondMap.put("Andeavor", "Energy");
        secondMap.put("Anixter International", "Information Technology");
        secondMap.put("Arrow Electronics", "Information Technology");
        secondMap.put("Avis Budget Group", "Industrials");
        secondMap.put("Berkshire Hathaway", "Financials");
        secondMap.put("Big Lots", "Consumer Discretionary");
        secondMap.put("Blackstone Group", "Financials");
        secondMap.put("Builders FirstSource", "Industrials");
        secondMap.put("CalAtlantic Group", "Consumer Discretionary");
        secondMap.put("Carmax", "Consumer Discretionary");
        secondMap.put("CDW", "Information Technology");
        secondMap.put("Centene", "Health Care");
        secondMap.put("Chemours", "Materials");
        secondMap.put("Citizens Financial Group", "Financials");
        secondMap.put("Comcast", "Consumer Discretionary");
        secondMap.put("Community Health Systems", "Health Care");
        secondMap.put("Core-Mark Holding Company", "Consumer Discretionary");
        secondMap.put("Dell Technologies", "Information Technology");
        secondMap.put("Dick's Sporting Goods", "Consumer Discretionary");
        secondMap.put("Dillards", "Consumer Discretionary");
        secondMap.put("Discover Financial Services", "Financials");
        secondMap.put("Discovery Communications", "Consumer Discretionary");
        secondMap.put("DISH Network", "Consumer Discretionary");
        secondMap.put("Dollar General", "Consumer Discretionary");
        secondMap.put("Dollar Tree", "Consumer Discretionary");
        secondMap.put("Energy Transfer Partners", "Energy");
        secondMap.put("Essendant", "Industrials");
        secondMap.put("Expedia", "Consumer Discretionary");
        secondMap.put("Expeditors International of Washington", "Industrials");
        secondMap.put("Fidelity National Information Services", "Information Technology");
        secondMap.put("First Data", "Information Technology");
        secondMap.put("Fiserv", "Information Technology");
        secondMap.put("Frontier Communications", "Telecommunication Services");
        secondMap.put("General Dynamics", "Industrials");
        secondMap.put("Genuine Parts Co", "Consumer Discretionary");
        secondMap.put("Global Partners", "Energy");
        secondMap.put("Harris", "Information Technology");
        secondMap.put("HCA Healthcare", "Health Care");
        secondMap.put("HD Supply Holdings", "Industrials");
        secondMap.put("Huntington Ingalls Industries", "Industrials");
        secondMap.put("Icahn Enterprises", "Industrials");
        secondMap.put("iHeartMedia", "Consumer Discretionary");
        secondMap.put("Ingredion", "Consumer Staples");
        secondMap.put("Insight Enterprises", "Information Technology");
        secondMap.put("INTL FCStone", "Financials");
        secondMap.put("Kelly Services", "Industrials");
        secondMap.put("Kindred Healthcare", "Health Care");
        secondMap.put("L3 Technologies", "Industrials");
        secondMap.put("Labratory Corporation of America Holdings", "Health Care");
        secondMap.put("Lear", "Consumer Discretionary");
        secondMap.put("Lennar", "Consumer Discretionary");
        secondMap.put("LifePoint Health", "Health Care");
        secondMap.put("Live Nation Entertainment", "Consumer Discretionary");
        secondMap.put("NCR", "Information Technology");
        secondMap.put("NetApp", "Information Technology");
        secondMap.put("NGL Energy Partners", "Energy");
        secondMap.put("NVR", "Consumer Discretionary");
        secondMap.put("Olin", "Materials");
        secondMap.put("Patterson Companies", "Health Care");
        secondMap.put("PayPal Holdings", "Information Technology");
        secondMap.put("Plains All American Pipeline", "Energy");
        secondMap.put("Plains GP Holdings", "Energy");
        secondMap.put("Priceline Group", "Consumer Discretionary");
        secondMap.put("Quintiles IMS Holdings", "Health Care");
        secondMap.put("Raymond James Financial", "Financials");
        secondMap.put("Realogy Holdings", "Real Estate");
        secondMap.put("Reliance Steel & Aluminum Co", "Materials");
        secondMap.put("Robert Half International", "Industrials");
        secondMap.put("Sanmina", "Information Technology");
        secondMap.put("Santander Consumer USA Holdings", "Financials");
        secondMap.put("Seaboard", "Consumer Staples");
        secondMap.put("Sears Holdings", "Consumer Discretionary");
        secondMap.put("Sunoco", "Energy");
        secondMap.put("Synchrony Financial", "Financials");
        secondMap.put("SYNNEX", "Information Technology");
        secondMap.put("T-Mobile US", "Telecommunication Services");
        secondMap.put("Tanga Resources", "Energy");
        secondMap.put("Tech Data", "Information Technology");
        secondMap.put("Tenet Healthcare", "Health Care");
        secondMap.put("Toll Brothers", "Consumer Discretionary");
        secondMap.put("Tractor Supply Co", "Consumer Discretionary");
        secondMap.put("Universal Health Services", "Health Care");
        secondMap.put("Veritiv", "Industrials");
        secondMap.put("WellCare Health Plans", "Health Care");
        secondMap.put("WestRock Co", "Materials");
        secondMap.put("Windstream Holdings", "Telecommunication Services");
        secondMap.put("World Fuel Services", "Energy");
        secondMap.put("XPO Logistics", "Industrials");





    }

    public double getScoreNum(String x) {
        if (hmap.containsKey(x)) {
            return hmap.get(x);
        }
        return -1.0;
    }

    public String getScoreGrade(String x) {
        if (!hmap.containsKey(x)) {
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

    public String getLowest() {
        return "1. Windstream Holdings\n" +
                "2. World Fuel Services\n +" +
                "3. XPO Logistics";
    }

    public String getHighest() {
        return "1. Cisco Systems\n" +
                "2. Ecolab\n +" +
                "3. Hasbro";
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

    /*public ArrayList<String> getPotentialAlt(String x) {
        ArrayList<String> result = new ArrayList<String>();

    }
    */
}