package com.example.dicodingsubmission

import java.net.URL

data class TeamLeagueModel (var idTeam: Int,
                            var teamName: String,
                            var formYear: Int,
                            var stadiumName: String,
                            var stadiumImageURL: String,
                            var badgeImageURL: String,
                            var description: String)
class DataModel{
    var dummyTeamLeagueModel = arrayListOf(
        TeamLeagueModel(idTeam= 133604, teamName= "Arsenal", formYear= 1892, stadiumName= "Emirates Stadium", stadiumImageURL= "https://www.thesportsdb.com/images/media/team/stadium/w1anwa1588432105.jpg",badgeImageURL= "https://www.thesportsdb.com/images/media/team/badge/uyhbfe1612467038.png",
            description= "Arsenal Football Club is a professional football club based in Islington, London, England, that plays in the Premier League, the top flight of English football. The club has won 13 League titles, a record 13 FA Cups, 2 League Cups, 15 FA Community Shields, 1 League Centenary Trophy, 1 UEFA Cup Winners' Cup and 1 Inter-Cities Fairs Cup.\r\n\r\nArsenal was the first club from the South of England to join The Football League, in 1893, and they reached the First Division in 1904. Relegated only once, in 1913, they continue the longest streak in the top division, and have won the second-most top-flight matches in English football history. In the 1930s, Arsenal won five League Championships and two FA Cups, and another FA Cup and two Championships after the war. In 1970–71, they won their first League and FA Cup Double. Between 1989 and 2005, they won five League titles and five FA Cups, including two more Doubles. They completed the 20th century with the highest average league position.\r\n\r\nHerbert Chapman won Arsenal's first national trophies, but died prematurely. He helped introduce the WM formation, floodlights, and shirt numbers, and added the white sleeves and brighter red to the club's kit. Arsène Wenger was the longest-serving manager and won the most trophies. He won a record 7 FA Cups, and his title-winning team set an English record for the longest top-flight unbeaten league run at 49 games between 2003 and 2004, receiving the nickname The Invincibles.\r\n\r\nIn 1886, Woolwich munitions workers founded the club as Dial Square. In 1913, the club crossed the city to Arsenal Stadium in Highbury, becoming close neighbours of Tottenham Hotspur, and creating the North London derby. In 2006, they moved to the nearby Emirates Stadium. In terms of revenue, Arsenal is the ninth highest-earning football club in the world, earned €487.6m in 2016–17 season. Based on social media activity from 2014 to 2015, Arsenal's fanbase is the fifth largest in the world. In 2018, Forbes estimated the club was the third most valuable in England, with the club being worth $2.24 billion."),
        TeamLeagueModel(idTeam= 133601, teamName= "Aston Villa", formYear= 1874, stadiumName= "Villa Park", stadiumImageURL=  "https://www.thesportsdb.com/images/media/team/stadium/w1anwa1588432105.jpg",badgeImageURL=  "https://www.thesportsdb.com/images/media/team/badge/aofmzk1565427581.png", description= "Aston Villa Football Club (/ˈæstən ˈvɪllə/; also known as Villa, The Villa, The Villans, The Lions) are a professional football club based in Witton, Birmingham, who play in the Premier League, the highest level of English football. Founded in 1874, they have played at their current home ground, Villa Park, since 1897. Aston Villa were founder members of The Football League in 1888. They were also founder members of the Premier League in 1992, and have remained there ever since. The club were floated by the previous owner and chairman Doug Ellis, but in 2006 full control was acquired by American businessman Randy Lerner. Lerner announced on 12 May 2014 that he is selling the club.\r\n\r\nAston Villa are among the oldest and the most successful football clubs in the history of English football. Villa won the 1981–82 European Cup, and are thus one of five English clubs to win what is now the UEFA Champions League. They have the fourth highest total of major honours won by an English club, having won the First Division Championship seven times (most recently in the 1980–81 season), the FA Cup seven times (last won in 1957), the Football League Cup five times (last won in 1996) and the UEFA Super Cup in 1982. The club have also produced more England national team players than any other side, currently having produced 72.\r\n\r\nThey have a fierce local rivalry with Birmingham City. The Second City derby between Aston Villa and Birmingham City has been played since 1879. The club's traditional kit colours are claret shirts with sky blue sleeves, white shorts and sky blue socks. Their traditional badge is of a rampant gold lion on a light blue background with the club's motto \"Prepared\" underneath; a modified version of this was adopted in 2007."),
        TeamLeagueModel(idTeam= 134301, teamName= "Bournemouth", formYear= 1874, stadiumName= "Villa Park", stadiumImageURL=  "https://www.thesportsdb.com/images/media/team/stadium/rxvwvw1420707921.jpg",badgeImageURL=  "https://www.thesportsdb.com/images/media/team/badge/y08nak1534071116.png", description= "AFC Bournemouth is a professional association football club based in Kings Park, Boscombe, a suburb of Bournemouth, Dorset. They are currently competing in the Championship, the second tier of English football, following relegation at the end of the 2019–20 Premier League. Formed in 1899 as Boscombe St. John's Institute, the club adopted their current name in 1971.\r\n\r\nNicknamed \"The Cherries\", Bournemouth have played their home games at Dean Court since 1910. Their home colours are red and black striped shirts, with black shorts and socks, inspired by that of Italian club A.C. Milan.\r\n\r\nAFC Bournemouth's honours include winning the second and third tiers of English football once, the Associate Members' Cup once and the Football League Third Division South Cup.\r\n\r\nThe club has spent the majority of their history bouncing between the third and fourth tiers of English football. Under manager Eddie Howe, they have risen through the pyramid; the 2015–16 season was their first ever in the top flight, and they remained there for five seasons, until and including the 2019–20 season, when they were relegated following an 18th place-finish."),
        TeamLeagueModel(idTeam= 134355, teamName= "Brentford", formYear= 1889, stadiumName= "Brentford Community Stadium", stadiumImageURL=  "https://www.thesportsdb.com/images/media/team/stadium/kfbybt1506258320.jpg",badgeImageURL=  "https://www.thesportsdb.com/images/media/team/badge/grv1aw1546453779.png", description= "Brentford Football Club is a professional football club based in Brentford, West London, England. They currently compete in the Premier League, the highest tier of English football, having gained promotion via the playoffs at the end of the 2020–21 Championship season. Nicknamed \"the Bees\", the club was founded in 1889 and played home matches at Griffin Park from 1904 before moving to Brentford Community Stadium in 2020. Their main rivals are fellow West London clubs Fulham and Queens Park Rangers.\r\n\r\nBrentford initially played amateur football before they entered the London League in 1896 and finished as runners-up of the Second Division and then the First Division to win election into the Southern League in 1898. They won the Southern League Second Division in 1900–01 and were elected into the Football League in 1920. Brentford won the Third Division South title in 1932–33 and the Second Division title in 1934–35. The club enjoyed a successful spell in the top flight of English football, reaching a peak of fifth in the First Division, in 1935–36, their highest ever league finish, before three relegations left them in the Fourth Division by 1962. They were crowned Fourth Division champions in 1962–63, but were relegated in 1966 and again in 1973 after gaining promotion in 1971–72. Brentford spent 14 seasons in the Third Division after gaining promotion in 1977–78 and went on to win the Third Division title in 1991–92, though were relegated again in 1993.\r\n\r\nBrentford were relegated into the fourth tier in 1998 and won promotion as champions in the 1998–99 campaign. The club were relegated in 2007 and won promotion as champions of League Two in 2008–09 and then were promoted out of League One in 2013–14. They had unsuccessful Championship play-off campaigns in 2015 and 2020. Brentford have a poor record in finals, finishing as runners-up in three Associate Members' Cup / Football League Trophy finals (1985, 2001 and 2011) and losing four play-off finals (the 1997 Second Division final, 2002 Second Division final, 2013 League One final and 2020 Championship final). However, Brentford won the 2021 Championship final to be promoted to the highest level for the first time since the 1946–47 season."),
        TeamLeagueModel(idTeam= 133619, teamName= "Brighton", formYear= 1901, stadiumName= "Amex Stadium", stadiumImageURL=  "https://www.thesportsdb.com/images/media/team/stadium/wqvxrw1420720245.jpg",badgeImageURL=  "https://www.thesportsdb.com/images/media/team/badge/ywypts1448810904.png", description= "Brighton and Hove Albion Football Club is an English football club based in the coastal city of Brighton & Hove, East Sussex. It is often referred to just as Brighton. They currently play in the Football League Championship, the second tier of the English football league system.\r\n\r\nThe team is nicknamed the \"Seagulls\" or \"Albion\". The team has historically played in blue and white stripes, though this changed to all white briefly in the 1970s and again to plain blue during the club's most successful spell in the 1980s. Crystal Palace is considered the club's main rival, although the grounds are 40 miles apart.\r\n\r\nFounded in 1901, Brighton played their early professional football in the Southern League before being elected to the Football League in 1920. The club enjoyed greatest prominence between 1979 and 1983 when they played in the First Division and reached the 1983 FA Cup Final, losing to Manchester United after a replay. They were relegated from the top division in the same season. Mismanagement brought Brighton close to relegation from the Football League to the Conference which they narrowly avoided in 1997 and 1998. A boardroom takeover saved Brighton from liquidation, and following successive promotions they returned to the second tier of English football in 2002 and have played in the second and third tiers ever since."),
        TeamLeagueModel(idTeam= 133610, teamName= "Chelsea", formYear= 1905, stadiumName= "Stamford Bridge", stadiumImageURL=  "https://www.thesportsdb.com/images/media/team/stadium/vpuxsx1420200157.jpg",badgeImageURL=  "https://www.thesportsdb.com/images/media/team/badge/yvwvtu1448813215.png", description= "Chelsea Football Club /ˈtʃɛlsiː/ are a professional football club based in Fulham, London, who play in the Premier League, the highest level of English football. Founded in 1905, the club have spent most of their history in the top tier of English football. The club's home ground is the 41,837-seat Stamford Bridge stadium, where they have played since their establishment.\r\n\r\nChelsea had their first major success in 1955, winning the league championship, and won various cup competitions during the 1960s, 1970s, 1990s and 2000s. The club have enjoyed their greatest period of success in the past two decades, winning 15 major trophies since 1997. Domestically, Chelsea have won four league titles, seven FA Cups, four League Cups and four FA Community Shields, while in continental competitions they have won two UEFA Cup Winners' Cups, one UEFA Super Cup, one UEFA Europa League and one UEFA Champions League. Chelsea are the only London club to win the UEFA Champions League, and one of four clubs, and the only British club, to have won all three main UEFA club competitions.\r\n\r\nChelsea's regular kit colours are royal blue shirts and shorts with white socks. The club's crest has been changed several times in attempts to re-brand the club and modernise its image. The current crest, featuring a ceremonial lion rampant regardant holding a staff, is a modification of the one introduced in the early 1950s. The club have sustained the fifth highest average all-time attendance in English football. Their average home gate for the 2012–13 season was 41,462, the sixth highest in the Premier League. Since July 2003, Chelsea have been owned by Russian billionaire Roman Abramovich. In April 2013 they were ranked by Forbes Magazine as the seventh most valuable football club in the world, at £588 million ($901 million), an increase of 18% from the previous year."),
        TeamLeagueModel(idTeam= 133632, teamName= "Crystal Palace", formYear= 1905, stadiumName= "Selhurst Park", stadiumImageURL=  "https://www.thesportsdb.com/images/media/team/stadium/tvsxvw1420238927.jpg.jpg",badgeImageURL=  "https://www.thesportsdb.com/images/media/team/badge/ia6i3m1656014992.png", description= "Crystal Palace Football Club is an English professional football club based in South Norwood, London. They currently play in the highest level in English football, the Premier League. Since 1964, the club have mostly played in the top two leagues of English football. The club was founded in 1905 at the site of the famous Crystal Palace Exhibition building by the owners of the FA Cup Final stadium, who wanted their own team to play at the historic venue. Palace applied to be elected to The Football League, but this was rejected and they instead joined the Southern Football League Second Division, playing home games at The Crystal Palace, inspiration for the club's initial nickname, \"The Glaziers\". Palace won the Division and promotion in their first season, and played in the Southern League First Division for the next fifteen years.\r\n\r\nIn 1920 the Southern League Division One formed the Football League Third Division. Palace won the division and gained promotion to the Second Division, where they spent four seasons before suffering relegation to the Third Division South. In 1958 a league re-organisation saw Palace become founder members of Division Four. Over the next eleven years the club moved from the lowest rung of English Football to the highest, reaching the First Division in 1969, and staying in the top division for four seasons before suffering successive relegations. In 1973 the club modernised its image, changing the nickname from The Glaziers to \"The Eagles\" and ending the 68-year association with claret and blue by introducing the red-and-blue vertical stripes now associated with the club. The club stabilised itself in the top two divisions with promotions in 1977 and 1979, the latter saw the club crowned as Division Two Champions. The period between 1989–91 was a successful time for the club. They reached an FA Cup Final in 1990, won the Full Members Cup in 1991, and achieved third place in the top division in the 1990–1991 season. Palace became founder members of the Premier League in 1992, but were relegated the same season, despite achieving 49 points which is still a Premier League record for a relegated club. The club then achieved promotion back to the Premier League three times in 1994, 1997 and 2004, but each time suffered relegation at the end of the following season. Palace entered administration in both 2000 and 2010, and are now owned by a consortium of four. The club were promoted back to the Premier League with a 1–0 win over Watford in the Football League play-offs in May 2013.\r\n\r\nCrystal Palace initially played their games in the grounds of The Crystal Palace, but the First World War saw them forced to move out, and they enjoyed a number of seasons at both the Herne Hill Velodrome and The Nest. Since 1924, Palace have played their home games at Selhurst Park. Their home colours are red and blue vertical stripes, though prior to 1973 they wore claret and pale blue after the fashion of Aston Villa. They have a fierce rivalry with M23 neighbours Brighton & Hove Albion, with whom they have contested the M23 derby 98 times and also enjoy a strong rivalry with fellow South London team Millwall. The club's kit is currently made by Macron, and the shirt sponsor is Neteller. The club captain is Mile Jedinak and the current player of the year is Julian Speroni. Edmund Goodman is the club's longest serving manager, and Jim Cannon has made the most appearances for the club. Peter Simpson is the club's top scorer for both one season and overall, netting 54 and 165 respectively. The highest transfer fee received has been for Wilfried Zaha from Manchester United in January 2013."),
        TeamLeagueModel(idTeam= 133615, teamName= "Everton FC", formYear= 1878, stadiumName= "Goodison Park", stadiumImageURL=  "https://www.thesportsdb.com/images/media/team/stadium/vwwttq1420239339.jpg",badgeImageURL=  "https://www.thesportsdb.com/images/media/team/badge/eqayrf1523184794.png", description= "Everton Football Club /ˈɛvərtən/ are an English professional football club based in Liverpool, and currently playing in the Premier League. The club have competed in the top division for a record 110 seasons (missing only four seasons, in the second tier) and have won the League Championship nine times.\r\n\r\nFormed in 1878, Everton were founding members of The Football League in 1888 and won their first league championship two seasons later. Following four league titles and two FA Cup wins, Everton experienced a lull in the immediate post World War Two period until a revival in the 1960s which saw the club win two league championships and an FA Cup. The mid-1980s represented their most recent period of sustained success, with two League Championship successes, an FA Cup, and the 1985 European Cup Winners' Cup. The club's most recent major trophy was the 1995 FA Cup. The club's supporters are known as Evertonians.\r\n\r\nEverton have a rivalry with neighbours Liverpool and the two sides contest the Merseyside derby. The club have been based at Goodison Park since 1892, after moving from Anfield after a row over its rent.\r\n\r\nThe club's home colours are royal blue shirts and white shorts. Everton player Dixie Dean scored a record 60 league goals in the 1927–28 season."),
        TeamLeagueModel(idTeam= 133600, teamName= "Fulham FC", formYear= 1879, stadiumName= "Craven Cottage", stadiumImageURL=  "https://www.thesportsdb.com/images/media/team/stadium/uxywyw1420751718.jpg",badgeImageURL=  "https://www.thesportsdb.com/images/media/team/badge/xwwvyt1448811086.png", description= "Fulham Football Club is an English professional association football club based in Fulham, London. They currently compete in the Championship, the second tier of the English football league system. Founded in 1879, they are London's oldest football club playing professionally.\r\n\r\nThe club has spent 27 seasons in English football's top division, the majority of which have come in two periods during the 1960s and 2000s. The latter period was associated with former chairman Mohamed Al-Fayed, after the club had climbed up from the fourth tier in the 1990s. Fulham have reached two major finals= in 1975 they lost 2–0 against West Ham United in the FA Cup Final as a Second Division team, and in 2010 they played Atlético Madrid in the UEFA Europa League Final, losing 2–1 after extra time.\r\n\r\nFulham's main rivalries are with fellow West London clubs Chelsea, Queens Park Rangers and Brentford. The club adopted a white shirt and black shorts as its kit in 1903, which has been used ever since."),
        TeamLeagueModel(idTeam= 133635, teamName= "Leeds United FC", formYear= 1919, stadiumName= "Elland Road", stadiumImageURL=  "https://www.thesportsdb.com/images/media/team/stadium/uvypxx1420710990.jpg",badgeImageURL=  "https://www.thesportsdb.com/images/media/team/badge/g0eqzw1598804097.png", description= "Leeds United Football Club is a professional football club in Leeds, West Yorkshire, England. The club was formed in 1919 following the disbanding of Leeds City F.C. by the Football League and took over their Elland Road stadium. They will play in the Premier League, the first tier of English football, following promotion in the 2019–20 season.\r\n\r\nMost of their history has been spent playing in the first tier; their longest continuous spell inside the first tier was a period of 18 years between 1964 and 1982, while their longest period outside of it spanned 16 years between 2004 and 2020. They have won three English league titles, one FA Cup, one League Cup, two Charity/Community Shields and two Inter-Cities Fairs Cups. The club reached the 1975 European Cup Final, losing to Bayern Munich after some controversial refereeing decisions. Leeds reached the semi-finals of the tournament's successor, the Champions League in 2001. The club were also runners-up in the European Cup Winners Cup final in 1973. The majority of the honours were won under the management of Don Revie in the 1960s and 1970s.\r\n\r\nLeeds play in all-white kits at home matches. The club's badge features the White Rose of York. The club's anthem is Marching on Together. Leeds share rivalries with Manchester United and Chelsea, as well as with local teams such as Huddersfield Town, Bradford City and Sheffield Wednesday."),
        TeamLeagueModel(idTeam= 133626, teamName= "Leicester City", formYear= 1884, stadiumName= "King Power Stadium", stadiumImageURL=  "https://www.thesportsdb.com/images/media/team/stadium/qquqvq1420243707.jpg",badgeImageURL=  "https://www.thesportsdb.com/images/media/team/badge/xtxwtu1448813356.png", description= "Leicester City Football Club, also known as the Foxes, is an English professional football club based in Leicester at the King Power Stadium. They play in the English Premier League, having been promoted as champions of the Football League Championship in 2013–14.\r\n\r\nThe club was founded in 1884 as Leicester Fosse, playing on a field near Fosse Road. They moved to Filbert Street in 1891 and played there for 111 years, before moving again, this time to the nearby Walkers Stadium in 2002.\r\n\r\nLeicester City were elected to the Football League in 1894. The club's highest ever finish was second place in the top flight, in Division One in 1928–29. The club holds a joint-highest seven second tier titles (six Second Division and one Championship), as well as one League One title. They have won the League Cup three times and have been FA Cup runners-up four times, a tournament record for the most defeats in the final without having won the competition. The club has only spent one season outside the top two tiers of English football in the 2008/09 season."),
    )
}