package iitm.saarang;

public class Eventmanager {
	
	public int noofevents;
	public static Eventnode[] allevents;
	public void createData()
	{   
		pplmanager Coordinator=new pplmanager();
		Coordinator.createdata();
		

		 /*Eventnode[] aevents=
		    {
		   new Eventnode(
		        0,"Dreams on Canvas","Spotlight","Is art your passion?\n\nDoes the world seem extra colorful?\n\nThen welcome to \"Dreams on Canvas\", a platform to showcase your artistic talent. Dreams on Canvas brings together the best student artists from the country to compete and exhibit their proficiency in shades and colors.\n\nThis is an art exhibition at Saarang where we expect you not to just exhibit yourpaintings but to bring out other artistic abilities in you.For this purpose, the exhibition over the four days will be coupled with various lectures and workshops by the who's-who of the art world.",
		        new pplnode[] {Coordinator.forIndex(0),Coordinator.forIndex(1),Coordinator.forIndex(2),Coordinator.forIndex(3),Coordinator.forIndex(4),Coordinator.forIndex(5),Coordinator.forIndex(6),Coordinator.forIndex(7),Coordinator.forIndex(8),Coordinator.forIndex(9),Coordinator.forIndex(10),Coordinator.forIndex(11),Coordinator.forIndex(12),Coordinator.forIndex(13)}
		        ),
		   new Eventnode(
		        1,"Impact","Spotlight",
		        "This Saarang is not just about the best bands and the best talent. Its also about getting back in touch with our basic humanitarian nature, seeing a smile on a child's face.\n\nSaarang Impact, an action oriented endeavour, plans to give back to society through collection drives, campaigns and awareness camps. By tying up with various NGOs and social institutions, we wish to create opportunities for social awareness targeted at today's youth. Reaching out to underprivileged children, creating a platform for NGOs to interact with youth and many such initiatives are on track.\n\nJoin hands with us this Saarang as we celebrate and spread joy by promoting a social cause. Create an Impact!\n\niVolunteer\n\nAlways wanted to give back to society but didn't know how? Envisioned a change in the community around you but never knew how to bring out the impact? If such questions have bogged you, then we bring to you iVolunteer!\n\nThis Saarang, its time for you to give back to society. Be that special person for that underprivileged kid. Make an impact on the environment. Give hope to the needy. Lead towards a change, a transformation for the better. Add a smile to that face. Saarang 2010 partners with iVolunteer to give you this chance to work with any of their numerous NGO partners across the country, who can use your skills and combine their mission to impact real lives.\n\niVolunteer is an initiative of MITRA, a not-for-profit organisation working in the social sector in India, headquartered in Delhi. MITRA was established in November 2000 as an entrepreneurial initiative by a group of graduates from Institute of Rural Management, Anand (IRMA). Today MITRA has grown nation wide and has offices in Delhi, Mumbai, Bangalore and Chennai.\n\nRegister with iVolunteer\n\nBe it 2 hours of your free time on a single weekend or 6 hours over 3 months; you may want to teach underprivileged children or help in the admin of an NGO working for animals - it's your choice. You decide the social cause you want to support, the time you can contribute and what work you wish to do - and we will match you to that perfect volunteer opportunity.\n\nGo to www.ivolunteer.in/IVolunteerHome/SiteUser/Volunteers/Register.aspx?F=2 to register.",
		        new pplnode[] {}
		        ),
		   new Eventnode(
		        2,"Essence","Spotlight",
		        "Essence has been envisaged to be a three day Youth Summit, which aims at shaping future leaders through constructive discussions and interactive workshops on Youth and Policy Making. The vision is to engage some of the most creative minds in the country in coming up with solutions to a variety of issues that come under the ambit of policy making.\n\nThe Summit aims to be a unique learning experience for the participants. It includes participatory workshops, interactive discussions, model building exercises, a field visit and lectures by who's who from media, politics and think tanks. With such activities on the first two days, the final day of the summit shall culminate in STEP: an open public policy debate between participants, dignitaries in the field, media personalities, NGOs, civic bodies and other stakeholders.",
		        new pplnode[] {Coordinator.forIndex(63),Coordinator.forIndex(64),Coordinator.forIndex(65),Coordinator.forIndex(66),Coordinator.forIndex(67),Coordinator.forIndex(68)}
		        ),
		   new Eventnode(
		        3,"HYVA 2010","Spotlight",
		        "The Habitat Young Visionary Award has come to Saarang now.\n\nOne of the most prestigious youth awards in the country, HYVA entails writing and arguing out your vision about the nation. If you are the next visionary a fully paid summer school to Cambridge awaits you.\n\nDeadline for essay entry: December 15, 2009\n\nMore details can be found at the website(http://www.indiahabitat.org/main.htm) of the India Habitat Centre.",
		        new pplnode[] {}
		        ),
		   new Eventnode(
		        4,"Saarang Village","Spotlight",
		        "With a cultural diversity rivaling the fauna of a rainforest, India is a heritage to be proud of, and incidently boast of. However with dwindiling numbers interested in performing and / or appreciating these magnificent arts, it is of vital importance to showcase their beauty and awe-inspiring nature. In light of the above, we, at Saarang 2010, bring you Saarang Village.\n\nSaarang Village is here to bring you the face of India at Saarang 2010. From Folklore, the Saarang village packed full of surprises, to the vibrant Alive, a feast for the senses in the form of a parade, Saarang has a new facet garunteed to knock your socks off.\n\nFolklore\n\nFolklore promises to be the complete village experience in the middle of the rustle and bustle of a cultural festival, with an (near) authentic enclosure packed with exhibitions of folk arts and crafts, village cuisine and tribal / traditional artists. The plans include a performing arts festival with dance forms from an Indian state being showcased through the duration of Saarang. With interactive demonstrations, arts / crafts workshops, exclusive 'village' merchandise and a food festival, among other things, on the cards, this is one place that you don't want to strike off of your metaphorical itinerary at Saarang.\n\nAlive\n\nThe present cultural festivals closely reflect the definition of 'cultural performances' slowly changing country-over. As influences creep into our traditional arts and the western arts penetrate our performing arts, a new form of 'culture' is being born. Come watch as the Saarang kicks off with a tribute to this transition, the Saarang parade, Alive, the parade with a beat.",
		        new pplnode[] {Coordinator.forIndex(108),Coordinator.forIndex(109),Coordinator.forIndex(110),Coordinator.forIndex(111),Coordinator.forIndex(112),Coordinator.forIndex(113),Coordinator.forIndex(114),Coordinator.forIndex(115)}
		        ),
		   new Eventnode(
		        5,"Lectures and Demos","Spotlight",
		        "\"A nap, my friend, is a brief period of sleep which overtakes superannuated persons when they endeavor to entertain unwelcome visitors or to listen to scientific lectures.\"\n  - George Bernard Shaw\n\nThis is not about those lectures that give you the naps my friend, this is about those if you miss, will leave you with a lot of sleepless nights. Be ready because this Saarang, Lectures and Demonstrations is bigger that ever bringing you people from far and wide including the big screen stars.\n\nHear them speak and get inspired!\n\nPopular Lecture Series\n\n   The popular lecture series this Saarang will leave you stunned with the galaxy of celebrities around you. This Saarang is your chance to hear in person to all those you ever wanted to.\n\nSpeakers\n\nPadmashri Dr. Kamal Haasan:\n  Kamal Haasan is an Indian actor, script writer and film maker and one of the most renowned Indian film personality in world cinema.\n  Dr. Kamal Haasan will give the Inaugural address for events at Saarang 2010 on January 22nd at 9 a.m. at ICSR Main Auditorium, IIT Madras.\n\nMr. Gautham Menon:\n  Mr. Gautham Menon is presently one of the biggest directors in the tamil film industry. He started off with the huge hit Minnale, which he also shot in Hindi as Rehna Hain Tere Dil Main (RHTDM), which got him huge acclaim. After Minnale, success has always been around him and he has made huge commercial hits like Kaaka Kaaka (Gharshana in Telugu), Vettaiyaadu Vilaiyaadu and Vaaranam Aayiram which have a unique distinction of also attracting critical acclaim.\n  Mr. Gautham Menon will deliver a lecture along with Dr. Kamal Haasan on 22nd January at 9 am in the ICSR Main Auditorium, IIT Madras.\n\nMs. Anjali Menon:\n  Anjali Menon is an internationally acclaimed film director. She directed the movie Manjadikuru (Lucky Red Seeds - 2008),  for which she won the FIPRESCI award for the Best Malayalam film at 2008 International film festival of Kerala. In 2009, the movie swept the awards at South Asian International Film Festival at New York, winning five Grand Jury Awards, including Best Film, Best Director, Best Screenplay, Best Cinematographer & Best Emerging Talent. Top honours graduate from London International Film School (UK) in 2002, Anjali Menon has been working on fiction & non-fiction formats since 1997. Having worked on various projects in India, the Middle East and UK, Anjali Menon started Little Films in Mumbai in 2006. Besides her background in Indian performing arts and visual media, Anjali Menon is also a post-graduate in communication studies (specializing in TV production) from Pune, India.\n  Anjali Menon will deliver a lecture on 22nd January at 2 PM in the ICSR Main Auditorium, IIT Madras.\n\nDr. Arun Shourie:\n  Arun Shourie is among India's best known commentators on current and political affairs. Born in Jalandhar, Punjab (1941), he studied at St. Stephen's College in Delhi and then obtained his doctorate in Economics from Syracuse University, USA.\n  Among other portfolios, he held the office of the Minister of Disinvestment, Communications and Information Technology in Mr. Atal Bihari Vajpayee's cabinet. He is the recepient of numerous national and international awards, including the Magsaysay Award and one of India’s highest civilian awards, the Padma Bhushan.\n  Dr. Arun Shourie will deliver a lecture at Saarang Youth Summit on January 24.\n\nSabu Cyril:\n\nSabu Cyril is one of India's biggest film art directors. He has won Filmfare Best Art Direction Award twice, in 2005 for Yuva and in 1994 for Gardish, and National Film Award for Best Art Direction three times. He is the Art Director of Aladin, De Dana Dan, Billu Barber, Bhool Bhulaiyaa, Om Shanti Om, Jaaneman, Bhagam Bhag, Chup chup ke, Garam Masala, Malamaal weekly, Hulchul, Yuva Main Hoon Na, Hera Pheri, Pukar, Kushi, Asoka, Hey Ram, Gardhish, Major Saab, Dholi Sajake Rakhna, Sath Rangke Sapne, Viraasat in Hindi and Anniyan, Aayitha Ezhuthu, Boys, Lesa Lesa, Panchadanthram, Kannathil Muthammital, Citizen in Tamil and many more films in Malayalam and Telugu totalling to more than 100 films.\n  Sabu Cyril will deliver a lecture at ICSR main auditorium on January 24.\n\nCultural Lecture Series\n\n   The cultural lecture series shall bring to you series of lectures from different genres in music, dance and literature. If you believe more in substance than style, this is the place for you to be. Sit back while these lectures coupled with demonstrations take you through a history of different music, dance and literature forms.\n\nSpeakers\n\nKavita Seth:\n  Kavita Seth is one of the foremost Sufi Rock singers in the country. She is best known for singing the song 'Iktara' in the movie 'Wake up Sid'.\n  Kavita Seth will deliver a lecture cum demonstration at ICSR main auditorium on January 23.\n\nBombay Jayashri:\n  Bombay S Jayashri is a leading Carnatic music vocalist. She has also recorded songs as a playback singer in South Indian films. She is the recipient of several awards from reputed institutions like The Music Academy, Shanmukhananda Sabha (Bombay), Krishna Gana Sabha (Madras) and Indian Fine Arts (Madras).\n  Bombay Jayashri will deliver a lecture at ICSR main auditorium on January 24.\n\nOopali Operajita:\n  One of India's virtuoso classical dancers, Prof. Oopali Operajita has been called \"the best Odissi interpreter today\" by India's most respected dance critic, the late P V Subramanian, (Subbudu), of The Statesman. She has performed extensively in India and abraod. A choreographer of eminence, Prof. Operajita's major contribution to the Odissi repertoire include the \"Kewat Prasang\" from Tulsidas's Ramcharitmanas, (which became Kelucharan Mohapatra's favourite performance piece), \"Madanabhasma Prasang\" from Kalidasa's Kumarasambhavam, which was the first solo piece from Kalidasa's works in the Odissi style, and many other short pieces.\n  Prof. Operajita was appointed Distinguished Faculty Fellow at Carnegie Mellon University in 1990 by its legendary founder-president, President Richard Cyert.\n  Her several international awards include a Canada Council Arts Award, a Senior Performing Arts Fellowship from the Shastri Indo-Canadian Institute and nominations for an Outstanding Established Artist Award from the Pittsburgh Cultural Trust and a Harry Schwalb Award for Excellence in the Arts from Pittsburgh magazine.\n  Oopali Operajita will deliver a lecture at ICSR auditorium on January 22.\n\nPadma Bhushan Dr. Padma Subrahmanyam:\n  Dr. Padma Subrahmanyam, the legendary Bharatnatyam  dancer is a rare  combination of a dancer, research scholar, choreographer, music composer & musician, teacher, author and indologist. She is now the director of 'Nrithyodaya'- the dance school founded in 1942. She has a Bachelor's degree in Music, Master's in Ethno Musicology and Ph.D in dance on her thesis on 'Karanas in Indian dance and sculpture'. She has  many awards and honours to her credit including 'Padma Bhushan', 'Padmashri', 'Sangeet Natak Akademi Award', 'Kalaimamani Award' from Govt. of Tamilnadu, 'Kalidas Samman' from Govt. of Madhya Pradesh, 'Nada Brahmam' from Narada Gana Sabha in Chennai, 'Bharata Sastra Rakshamani' and so on. She has also received the prestigious 'Fukuoka Asian Cultural Prize' from Japan for her contribution to development and harmony in Asia. She has served as a non-official member of the Indo-Sub-commission for education and culture.\n  Dr Padma Subrahmanyam will deliver a lecture at ICSR main auditorium on January 25.\n\nDr. Neena Prasad:\n  Dr Neena Prasad is trained in Bharatnatyam, Kuchipudi, Mohiniyattam and Kathakali.She is famous among the dance circles as a Mohiniyattam exponent.She was awarded PhD from Rabindra Bharati University, Calcutta on her thesis :\"The concepts of Lasya and Tandava in the classical dances of South India- A detailed Study\". Thus she became the first South Indian to receive a PhD in dance. A postdoctoral fellowship was  also conferred to her for Cross Cultural Music and Dance Performance, University of Surrey,England on the theme: Post Colonial Identity Construction.\n  Dr. Neena Prasad will deliver a lecture at ICSR Hall 1 on January 25.",
		        new pplnode[] {Coordinator.forIndex(84),Coordinator.forIndex(85),Coordinator.forIndex(86),Coordinator.forIndex(87),Coordinator.forIndex(88)}
		        ),
		   new Eventnode(
		        6,"Mr & Ms Saarang","Spotlight",
		        "Do you want to be the most popular person at Saarang?\n\nDo you want to show that you are the crème de la crème of Saarang?\n\nDo you want the entire Saarang crowd talking about you and you alone?\n\nIf so, we encourage you to participate in Mr and Ms. Saarang, a competition where all the participants fight it out for the top honours in Saarang 2010.In addition to the prestigious honour of becoming King and Queen of Saarang 2010, there are loads of fabulous prizes to give away. So why don’t you step up and prove that you are the best?",
		        new pplnode[] {Coordinator.forIndex(79),Coordinator.forIndex(80),Coordinator.forIndex(81),Coordinator.forIndex(82),Coordinator.forIndex(83)}
		        ),
		   new Eventnode(
		        7,"Culture Show","Spotlight",
		        "Panache - The Culture Show\n\nA culmination of culture and beauty through the years, Saarang is, for the first time, all set to witness the arrival of its own Culture Show. Panache promises to be a stage for designers to showcase their skill and best designs, but with a twist. Teams must use the stage and prove to both the judges and audience that they are the clear winners.\n\nIn addition, to test the ingenuity and practical design sense of participants, they must design their apparel based on an Indian Ethnic theme of their choice. Participants must portray their themes through a variety of characters. They may use the stage in whatever way that they wish, including, but not limited to, sets and music.",
		        new pplnode[] {Coordinator.forIndex(79),Coordinator.forIndex(80),Coordinator.forIndex(81),Coordinator.forIndex(82),Coordinator.forIndex(83)}
		        ),
		   new Eventnode(
		        8,"LM Solo Vocals","Music Events/Light Music",
		        "Alankaar - Light Music Solo\n\nThink you can win over millions with the magic of your voice? Saarang 2010 gives you an opportunity to prove your talent. Battle it out at Alankaar, LM solo Competition - where the best in the country battle it out for the coveted title!",
		        new pplnode[] {Coordinator.forIndex(89),Coordinator.forIndex(90),Coordinator.forIndex(91),Coordinator.forIndex(92)}
		        ),
		   new Eventnode(
		        9,"LM Group","Music Events/Light Music",
		        "Tarang - Light Music Group\n\nAre you musically inclined? Do you have friends who are too? Then collaborate and be at Saarang 2010 to battle it out on the stage that has never failed to deliver. Prove yourselves at Tarang!",
		        new pplnode[] {Coordinator.forIndex(89),Coordinator.forIndex(90),Coordinator.forIndex(91),Coordinator.forIndex(92)}
		        ),
		   new Eventnode(
		        10,"Classical Instrumental","Music Events/Classical Music",
		        "Amruthavarshini (or Malhar in Hindustaani) - The raaga that is so powerful, it brings rain when sung.\n\nCome this Saarang and get drenched in the heavenly showers of music. Classical Music @ Saarang has taken a new Avathar - Amruthavarshini.\n\nIt goes beyond a competition... It is a Musical Battle for proving one's worth. Where the winds of Classical Music blows from all parts of India.. Where the best is crowned but everybody wins, and takes back with them the treasure of Gyana, from each other and the Interactive Judges - The Masters. So come prepared for the musical tempest.\n\nClassical Instrumental\n\nThis comes in two flavours, percussion and non-percussion. Both are equally competitive and see a dedicated following that grows year on year.",
		        new pplnode[] {Coordinator.forIndex(53),Coordinator.forIndex(54)}
		        ),
		   new Eventnode(
		        11,"Classical Vocals","Music Events/Classical Music",
		        "Amruthavarshini (or Malhar in Hindustaani) - The raaga that is so powerful, it brings rain when sung.\n\nCome this Saarang and get drenched in the heavenly showers of music. Classical Music @ Saarang has taken a new Avathar - Amruthavarshini.\n\nIt goes beyond a competition... It is a Musical Battle for proving one's worth. Where the winds of Classical Music blows from all parts of India.. Where the best is crowned but everybody wins, and takes back with them the treasure of Gyana, from each other and the Interactive Judges - The Masters. So come prepared for the musical tempest.\n\nClassical Vocals\n\nAn event for the fans of Indian Classical Vocals, both Carnatic and Hindustani. Challenging even to the most experienced, it has its own niche following.",
		        new pplnode[] {Coordinator.forIndex(53),Coordinator.forIndex(54)}
		        ),
		   new Eventnode(
		        12,"WM Solo Vocals","Music Events/Western Music",
		        "Cantata - Western Music Solo (Vocals)\n\nLet your voice take centre stage with Cantata, the solo singing event at Saarang 2010. Aspiring Frank Sinatras and Celine Dions, step out of your shower and into the spotlight and prove your mettle against the best Saarang has to offer. Are you up for the challenge?",
		        new pplnode[] {Coordinator.forIndex(135),Coordinator.forIndex(136),Coordinator.forIndex(137),Coordinator.forIndex(138)}
		        ),
		   new Eventnode(
		        13,"Decibels","Music Events/Western Music",
		        "Does your band want to join the ranks of Slain, Junkyard Groove, Moksha, Medicis, Bhayanak Maut, Powder in the Ashtray, Pin Drop Violence, Panatella, and Nerverek? These are only few of the many bands that were catapulted into the big time simply by their riveting performances on the Decibels stage. Here’s an opportunity for you to own IIT’s famed Open Air Theatre and display those tight riffs, mind boggling solos and captivating showmanship in front of thousands.",
		        new pplnode[] {Coordinator.forIndex(135),Coordinator.forIndex(136),Coordinator.forIndex(137),Coordinator.forIndex(138)}
		        ),
		   new Eventnode(
		        14,"Powerchords","Music Events/Western Music",
		        "One of the most awaited college rock band competitions in India, Powerchord provides you with the platform to be the next big act on the Indian music scene. Let those after-college jam sessions finally pay off.",
		        new pplnode[] {Coordinator.forIndex(135),Coordinator.forIndex(136),Coordinator.forIndex(137),Coordinator.forIndex(138)}
		        ),
		   new Eventnode(
		        15,"WM Solo Instrumental","Music Events/Western Music",
		        "Flying Solo - Western Music Solo (Instrumental)\n\nIf singing isn’t your forte, then Flying Solo is the event for you. Be it a Blue Danube, or a Purple Haze, let your instrument do the talking. The stage is yours if you can prove you’re worth it (and even if you can’t).",
		        new pplnode[] {Coordinator.forIndex(135),Coordinator.forIndex(136),Coordinator.forIndex(137),Coordinator.forIndex(138)}
		        ),
		   new Eventnode(
		        16,"A Cappella","Music Events/Western Music",
		        "A Cappella (from Italian for choir) is vocal music intended to be performed without instrumental accompaniment.  Let the music flow directly from your soul. The versatility of the human voice is such that you don’t even need instruments to be the Rolling Stones. The prize is yours if you can prove us right.",
		        new pplnode[] {Coordinator.forIndex(135),Coordinator.forIndex(136),Coordinator.forIndex(137),Coordinator.forIndex(138)}
		        ),
		   new Eventnode(
		        17,"Acoustyx","Music Events/Western Music",
		        "Unplugged\n\nMusic isn’t always about distortion, processors and wah-wahs. If you’re more Jack Johnson than Steve Vai, show off your mellow sounds on our stage. Unplugged is where you can get back to basics.",
		        new pplnode[] {Coordinator.forIndex(135),Coordinator.forIndex(136),Coordinator.forIndex(137),Coordinator.forIndex(138)}
		        ),
		   new Eventnode(
		        18,"Dramatics","Thespian Events",
		        "Make us laugh, make us cry, make us throw rotten eggs and tomatoes at you – the stage is yours for fifty minutes, and so is the audience. Saarang Dramatics is one of the biggest college-level dramatics competitions in the country, so if you have a great script and a great cast, this is the best place to show them off.",
		        new pplnode[] {Coordinator.forIndex(129),Coordinator.forIndex(130),Coordinator.forIndex(131)}
		        ),
		   new Eventnode(
		        19,"Mono Acting","Thespian Events",
		        "Other actors can be annoying. They mess up their lines, forget their cues, and it's embarrassing to share a stage with them. If only every actor was as good as you. If only you could have a stage to yourself and nobody else. Saarang understands your plight, and has the solution: Monoacting.",
		        new pplnode[] {Coordinator.forIndex(129),Coordinator.forIndex(130),Coordinator.forIndex(131)}
		        ),
		   new Eventnode(
		        20,"Street Play","Thespian Events",
		        "There are some times when standing in the middle of a busy street and delivering soliloquies isn't an entirely bad idea. When you're doing a street play, for example. Is your group captivating enough to get your message across? Find out at Saarang's Street Play event.",
		        new pplnode[] {Coordinator.forIndex(129),Coordinator.forIndex(130),Coordinator.forIndex(131)}
		        ),
		   new Eventnode(
		        21,"Radio Play","Thespian Events",
		        "If seeing is believing, radio plays are unbelievable. Let everyone at Saarang know how unbelievably good your radio play is. Show us something we'll never see.",
		        new pplnode[] {Coordinator.forIndex(129),Coordinator.forIndex(130),Coordinator.forIndex(131)}
		        ),
		   new Eventnode(
		        22,"Biz Quiz","Quizzes",
		        "Biz-Zorro - The Saarang Biz Quiz\n\nDo you think you know the trade?\n\nDo you think you can do better than Donald Trump?\n\nDo you fancy yourself in Warren Buffet's shoes?\n\nDo you know the who's who of the business world?\n\nIf you do, this is the right place for you.  If you don't you will learn it here.\n\nThis is a deal you can't refuse.",
		        new pplnode[] {Coordinator.forIndex(42),Coordinator.forIndex(43)}
		        ),
		   new Eventnode(
		        23,"SpEnt Quiz","Quizzes",
		        "What is SpEnt?\n\nA portmanteau of Sports and Entertainment. Some may say that as Sports are a form of entertainment, the former is redundant. We disagree.",
		        new pplnode[] {Coordinator.forIndex(127),Coordinator.forIndex(128)}
		        ),
		   new Eventnode(
		        24,"Lonewolf","Quizzes",
		        "The Mother of all Quizzes needs no introduction. However, it needs some other sections. Use a calorie to scroll down to those.\n\nTo put it simply, this is the highest point of quizzing in India. Miss it at your own peril!\n\nQ. What does FAQ stand for?\nA. Free Advice for Queers\n\nQ. How can I prepare for the quiz?\nA. Surya Namaskara every morning\n\nQ. What are the topics that will be covered?\nA. Everything.\n\nQ. Really?\nA. No.\n\nQ. Can you provide any sample questions?\nA. Yes. Just one. Here it is.\n\nConnect (Not an exhaustive list)\n1. The best quizzers.\n2. The best questions.\n3. The best spirits.\n4. Four inebriated quizmasters.",
		        new pplnode[] {Coordinator.forIndex(93),Coordinator.forIndex(94),Coordinator.forIndex(95),Coordinator.forIndex(96)}
		        ),
		   new Eventnode(
		        25,"India Quiz","Quizzes",
		        "India Quiz, as the name suggests is India Quiz. Need we say more?.....Actually we do. We believe in the concept of 'Vasudaiva Kutumbakam' and may cross the LoC, McMohan line or the Palk Strait and ask some questions about our neighbours too.",
		        new pplnode[] {Coordinator.forIndex(77),Coordinator.forIndex(78)}
		        ),
		   new Eventnode(
		        26,"Geo Genius","Quizzes",
		        "Titles ,though misleading, are chosen for want of better ones.\n\nThe quiz is loosely based on its more famous namesake, conducted by National Geographic. However, this version departs significantly from the original in terms of style, presentation, and liberal application of the geo-tag to encompass (almost) anything and everything.\n\nAt the same time, expect classic favourites such as the race around the globe, continent-specific questions and what not.\n\nDoes that mean you have to crack open those atlases? Hardly. We sure won't.\n\nSo just turn up in groups of 3, and get ready for some fun.",
		        new pplnode[] {Coordinator.forIndex(74),Coordinator.forIndex(75),Coordinator.forIndex(76)}
		        ),
		   new Eventnode(
		        27,"The Fourth Estate","Media Events",
		        "A free press is one of the shining beacons of true civilization. And journalists are the bearers of that beacon. If you have dreams of being a journalist and of taking forth the news to the world, The Fourth Estate is the event for you.\n\nThe winners will be selected from a series of rounds that will test your writing and live-reporting skills.",
		        new pplnode[] {Coordinator.forIndex(58),Coordinator.forIndex(59)}
		        ),
		   new Eventnode(
		        28,"Short Film Making","Media Events",
		        "Sick of being stunted by a painted sky?\n\nWell then…\n\nLet’s bid Michelangelo goodbye!\n\nWe are the flipside.\n\nWe’re not Sean Maguire to ask you ‘what it smells like in Sistine Chapel’; not when we clearly state that we want you to get beyond. But you can be assured that we do cohere in tendencies: We’re not looking for libraries, and this screen is no stage. Chaplin got that clear and got us all; Kubrick lived to be second-best. We’ve not had successors since, and so here’s the acid test…\n\nIdeas are no more than dead unless kissed to life through expression, so it’s pointless to be proud, sitting on a shelf and looking out to the street, feeling full, counting crows and watching people pass by. We are the street, and the street's asking you to scrape yourself out because we’ve got something to give that half of tinsel-town would give lives for: An opportunity. A chance to tell Toto that you’re not in Kansas anymore, for this is a world where you tag thoughts together, ink out images and stitch-up scenes, with the best sketch and an ability to make the lines unseen set to get you some fuel for the fire inside to burn longer. A lot of fuel, actually.\n\nBut these are mean streets, though; streets of strife. An 'underground' above the surface that wields this knife called ‘criticism’ that cuts deeper than most, for it’s a cynical world that we live in, a cynical... world: One in no mind to change, that too. And everything you do, every flaunt at two score and four is an attempt to break the ice, to make the world turn the leaf... All done to bag this bumper prize called 'Belief’.\n\nMake Believe. Try us.",
		        new pplnode[] {Coordinator.forIndex(121),Coordinator.forIndex(122),Coordinator.forIndex(123)}
		        ),
		   new Eventnode(
		        29,"Photography Contest","Media Events",
		        "If you have a photographic memory that was never developed, then this one's for you. Just click away at anything you feel is profounf, beautiful or simply comical and submit it to us. The rest, as they say, will go down in history.\n\nSo, if you  think you are good at photography and want to prove it, just come to this event.",
		        new pplnode[] {Coordinator.forIndex(105)}
		        ),
		   new Eventnode(
		        30,"Choreo Nite","Dance Events",
		        "Choreo Nite is undoubtedly one of the most awaited events in Saarang. With tickets for this night getting sold out days in advance, this number one crowd puller gives different dance groups an excellent platform to showcase their talent. Exciting and energising to the core, this event gives every aspiring dance troupe the chance to perform in front of an 8000-strong audience- easily the biggest audience on the college circuit. Year after year the competition has been increasing and amazing dance performances have become a hallmark of this event. Come and be a part of this larger than life experience.",
		        new pplnode[] {Coordinator.forIndex(47),Coordinator.forIndex(48),Coordinator.forIndex(49),Coordinator.forIndex(50)}
		        ),
		   new Eventnode(
		        31,"Classical Dance","Dance Events",
		        "Nritya Prerana- Classical Dance\n\nDance starts as a hobby, becomes a habit and finally an addiction. Words are insufficient to describe how this hedonistic endeavor can transform the dancer’s body and intellect. Traditional Indian classical dance goes one step further in cleansing the soul. In India, nritya is synonymous with sadhana, the pathway to attaining spiritual salvation or moksha. It elevates us to an eternal state of bliss, away from the mundane earthly limitations to a divine plane of uninterrupted felicity where the dancer immerses himself/herself in the chasm of pure bliss and becomes one with his sadhana, nritya. Dance is also the culminating point of ‘bhakthi’ or ultimate devotion when the devotee forgets the surroundings and loses control over his senses in the most controlled manner.\n\nDance does as much to the appreciator as it does to the performer. Just like how according to Sankhya,  the dynamic dance of the life-giving prakrithi enchants the purusha and transforms him, a good dancer weaves a magic spell on the spectators who then become enthralled, uplifted and inspired.Yes, dance is the inspiring force within all of us. The 'prerana'. The eternal persuasive encouraging force which enlightens us.\n\nThis Saarang, as we embark on a journey to art in its purest and unadulterated form, join us and enthrall us with your graceful splendor.We present to you, \"nritya prerana\" @ Saarang 2010!",
		        new pplnode[] {Coordinator.forIndex(51),Coordinator.forIndex(52)}
		        ),
		   new Eventnode(
		        32,"Freestyle Solo Dance","Dance Events",
		        "Though this event is fairly new at Saarang, it is as much of a crowd puller as the other dance events, choreo night and dance workshops. Whether you want to shake a leg or show off your hand stand, this stage is the perfect platform for you. Calling all feet tappers, breakers and hip-hoppers from all over the country, this one is for you!",
		        new pplnode[] {Coordinator.forIndex(47),Coordinator.forIndex(48),Coordinator.forIndex(49),Coordinator.forIndex(50)}
		        ),
		   new Eventnode(
		        33,"JAM","Speaking Events",
		        "JAM, is something of a social experiment. Eight people are given a minute of fame. The same minute of fame. And only one person can speak at a time. And boy, do people HATE sharing their minute…\n\nOnce you do finally manage to start speaking, you can speak only so long as there is absolutely no deviation from coherent continuous (interesting) speech. And the first one to point out a flaw, will buzz you (with great panache) and grab the mic from you!\n\nAs if it isn't bad enough, we introduce another player into the fray… This player is called the JAM mod (among lot of other things), is around to make your life miserable, poke fun of you, give you your topics and moderate all objections.\n\nSo be utterly bamboozled as you die laughing (or crying) as the incredible speakers of the queen's english buzz it out, trying not to stutter, stammer, pause \"unnaturally\", make any grammatical errors or repeating anything… And fail miserably…\n\nRated R.",
		        new pplnode[] {Coordinator.forIndex(124),Coordinator.forIndex(125),Coordinator.forIndex(126)}
		        ),
		   new Eventnode(
		        34,"Debate","Speaking Events",
		        "\"I argue very well. Ask any of my remaining friends. I can win an argument on any topic, against any opponent. People know this, and steer clear of me at parties. Often, as a sign of their great respect, they don't even invite me.\"\n  - Dave Barry\n\nAre you reading that and going \"Oh my gosh! That’s so me!!\"... Well then, here’s a party where you are invited for that very reason. Arguments can take many flavours, and can get pretty nasty at times, but hey, we like to argue. So here is today’s the motion : This House must argue.\n\nLadies and Gentlemen, we the speaking events co-ordinators of Saarang, Ladies and Gentlemen, interpret the given motion \"This House must argue\", as follows Ladies and Gentlemen -:\n\nWe define the house as all those seated at the Debating hall at Saarang 2010, Ladies and Gentlemen. We interpret argue, as argument by the rules of American Parliamentary Debate, as outlined by the esteemed and crazy co-ordinators.\n\nWe interpret awesome argument as brilliant content with brilliant speaking Ladies and Gentlemen. And we would like to establish Ladies and Gentlemen, that saying \"Ladies and Gentlemen\", is not quite necessary. What I mean Ladies and Gentlemen, is that there’s always \"Sir\" and \"The Mighty Opposition\" and \"The Retarded Government\" and \"The Deluded Opposition\" and so on... Mix it up, for god’s sake, Ladies and Gentlemen!!\n\nSo Ladies and Gentlemen, blow us away with your passion, inspire us with your conviction, have us rolling in the aisles, and make the hair on our hairy necks stand.",
		        new pplnode[] {Coordinator.forIndex(124),Coordinator.forIndex(125),Coordinator.forIndex(126)}
		        ),
		   new Eventnode(
		        35,"Elocution","Speaking Events",
		        "Since time immemorial, the power of words has been unleashed to wage wars as well as broker peace, to drive the masses into a collective frenzy as well as to soothe and offer hope, to bring people closer as well as create invisible walls, bringing to the fore the entire gamut of human emotions.\n\nAt Saarang '10 we invite you to enrapture us with the power, artistry and subtlety of your rhetoric.\n\nBe there at Saarang Elocution to be part of an extravagant exhitbition of oratory.",
		        new pplnode[] {Coordinator.forIndex(124),Coordinator.forIndex(125),Coordinator.forIndex(126)}
		        ),
		   new Eventnode(
		        36,"Extempore","Speaking Events",
		        "\" ... and though it may be long and hard, I will endure it. In fact, I will enjoy every single moment of it.\"\n  - Luther King on his freedom struggle.\n\n\"That’s what she said.\"\n  - Somebody else at Extempore.\n\n\"And suppose all hamburgers are cows but all cows are not hamburgers. Now, if a tree falls on a cow in the forest and you hear the hamburger make a squishy sound, then what shade of beige is the mayonnaise?\"?\n\nWhile easily mistaken for a question from the IIT-JEE, these are the types of largely irrelevant things an average participant at Extempore tries to figure impromptu in his head. As Dr. Spaceman would have us know, the head is a lot like a washing machine. And at Extempore, you’ll see double entendres and bad puns tumbling through heads like dirty socks and tighty whities through a Whirlpool front loader.\n\nExtempore, or Exxtemppure as Sonu Niiggaa M. likes to call it, has been a forum for spontaneous exposition on a number of socially relevant issues such as the love of female pandas, or pandies if you will, for bamboo shafts; why the Irish make really bad super-villains; Wonder Woman’s domination fetishes and so much more. On a completely irrelevant tangent, it has also been confused with a number of popular day time talk shows.\n\n\"What! And you’re going to let me be part of this extravagant celebration of wit, irreverence and political incorrectness for free?\" ?All we ask in return is that you be pretty interesting. Or interesting. Or plain old pretty.",
		        new pplnode[] {Coordinator.forIndex(124),Coordinator.forIndex(125),Coordinator.forIndex(126)}
		        ),
		   new Eventnode(
		        37,"WTGW","Literary Events",
		        "A dream come true for logophiles - we promise to keep your brain somersaulting, right from aardvark to zyzzyva. You can take our word for it.",
		        new pplnode[] {Coordinator.forIndex(148),Coordinator.forIndex(149)}
		        ),
		   new Eventnode(
		        38,"Crossie","Literary Events",
		        "\"Screwed up verbal circuits make a racist gridman\"(pun intended)\n  - Captain cruciverbose(if you know what he means)\n\nIf you have it in you to make  any sense out of the statement above and you want to show the world how whacko you are then this is the place you would wanna be.  Get ready to face a multitude of word twists , double entendres and phrases that just don’t seem to make any sense at the first look. Rest assured, you will face lots of ups and downs but if you are cryptic enough then tibi est mundus!",
		        new pplnode[] {Coordinator.forIndex(60)}
		        ),
		   new Eventnode(
		        39,"Creative Writing","Literary Events",
		        "\"It is necessary to write, if the days are not to slip emptily by.  How else, indeed, to clap the net over the butterfly of the moment?  For the moment passes, it is forgotten; the mood is gone; life itself is gone.  That is where the writer scores over his fellows:  he catches the changes of his mind on the hop.\"\n  - Vita Sackville-West\n\nDoes your heart leap up when you behold a rainbow? Would you write a letter to the world that never wrote to you? If two roads diverged in a wood, would you take the one less travelled by? If yes, then for you, Saarang Creative Writing is the place to be. With categories spanning various genres of writing, an impressive array of judges and fabulous prizes for the winners, the Creative Writing event is the doyen of all literary events at Saarang.\n\nThe event will be conducted on three days of Saarang - one day for fiction, another for poetry and the third for a melange of forms and genres. So whether you are a seasoned writer of short stories, an aspiring novelist, a poetic soul or a sultan of experimental writing - this event is the place for you.",
		        new pplnode[] {Coordinator.forIndex(58),Coordinator.forIndex(59)}
		        ),
		   new Eventnode(
		        40,"Scrabble","Literary Events",
		        "Before we start, here are a few questions for you :\n\nAre you bored of your life and think that it can’t be unjumbled to give you 42?\n\nOr\n\nAre you bored coz you have solved the best crosswords and are looking for something better?\n\nOr\n\nAre you feeling lucky???\n\nIf your answer to any of the above is NO, then our words of advice would be firstly \"DONT PANIC\" .Turn On, Tune In, Drop Out and BE HERE. If your answer is YES, need we say more?\n\nWell, we'll, even if we don't need to. This is what some uninformed sections of media have to say about Scrabble :-\"Scrabble is an offshoot of \"Clabbers,\" an ancient, anarchic anagramming game that relies on the supposed existence of non-words. Modern-day Scrabble was invented in 1947 by a night watchman, Joe Epstein, who suffered a calamitous emotional breakdown when he discovered that his surname contains no 7-letter words. Epstein now lives in a public park in San Francisco, sharing acorns with squirrels. \n\nAnd, this is how the informed sections responded: \"Just shut up and play your move ! \"—The 2097 Inter-Galactic Scrabble Champion.",
		        new pplnode[] {Coordinator.forIndex(120),Coordinator.forIndex(121)}
		        ),
		   new Eventnode(
		        41,"Fine Arts","Arts And Craft",
		        "\"I've never believed in God, but I believe in Picasso\"\n\nIf you are another one such art freak, you have found the right place... coz  Fine arts is back with a bang proudly ruffling its new colors.With a colossal list of new events in its rack, fine arts is all set to rock the show in Saarang 2010.\n\nThis is probably the one event where you can let your imagination run riot and sweep the awards ...You don’t need to have any pre-requisites to be a part of one of the most envied events of Saarang....\n\nAll you need is to have the enthusiasm...\n\nBe a part of the \"finest\" fine arts in the history of Saarang.\n\nDay 1\n\nColorz!\n   \"Feeling blue\", \" Yellow-bellied\", \"Green with envy\" and \"Seeing red\".... nothing portrays feelings better than colours. Come, add colours to your strokes and leave Saarang 2010 with \"flying colours\".\n\nSoap Carving\n   A newbie to the Saarang Fine Arts' list of great events. Try out your hand at sculpture this time and.... believe us, you'll be surprised at what you can make out of soap. So, come, carve out your victory in soap!\n\nDay 2\n\nShades of Grey\n   We don't think you need a write-up for this classic event @ Fine Arts. So, come around and give the \"white\" some \"shades of grey\"!!\n\nArty-Stiks\n   No matter how hard we try we just can't leave our engineering instincts behind! Use your creativity and design to create a masterpiece of sticks and glue!!\n\nDay 3\n\nFace Me!!\n   \"God has given you one face, and you make yourself another.\"\n     - William Shakespeare\n   But..... Here is your chance to create the third face of your friend.\n\nKlay Kraft\n   Ever tried to build castles in air day dreaming?? So get ready to dirty your hands with clay and give a form to your dreams!!!\n\nDay 4\n\nDesign Your Comic\n   \"5 reason to read the newspaper: comics, sports, blah, blah, blah\"\n     - F Arts\n   If you think on the same lines here's your chance to give life to your favourite comic characters.\nPS: Please read some comic strips if you don't know what it means! :)\n\nExpressions\n   What can be more touching than a hand made greeting card. Saarang Fine Arts team brings you a new challenge with a blend of arts, crafts and of course the feeling within your heart. Here is your chance to pull on the hats of creativity and express yourselves.",
		        new pplnode[] {Coordinator.forIndex(69),Coordinator.forIndex(70),Coordinator.forIndex(71),Coordinator.forIndex(72),Coordinator.forIndex(73)}
		        ),
		   new Eventnode(
		        42,"Antakshari","Variety Events",
		        "Are your eager to satisfy your long lasting desire by showcasing your knowledge of Hindi songs?\n\nAre you a die hard fan of hindi music right from old hindi classics to the latest tracks?\n\nAre you a fabulous bathroom singer?Then you are the ones we are looking for.Come fight it out in the battle of Bollywood. Aa dekhe zara kisme kitna hai dum???",
		        new pplnode[] {Coordinator.forIndex(40),Coordinator.forIndex(41)}
		        ),
		   new Eventnode(
		        43,"Cluedo","Variety Events",
		        "Cluedo offers you the oppurtunity to realize your childhood dreams of stepping into the shoes of your favorite sleuth, be it Hercule Poirot, Sherlock Holmes, George Smiley - the list is endless. If you believe you have a knack for noticing things others don't, this is the experience for you. Light up your imagination and chase every wild theory you have to its end. For this event is not for the simple minded.\n\nPit your talents against the rest and find out how you fare in picking up clues, forming deductions and cracking the puzzling cases we will bring to your attention. Battle against time with the passion of becoming the finest detective you can be, by bringing all the skills you have at your disposal.",
		        new pplnode[] {Coordinator.forIndex(55),Coordinator.forIndex(56),Coordinator.forIndex(57)}
		        ),
		   new Eventnode(
		        44,"Potpourri","Variety Events",
		        "Traditionally, this event has always been an eclectic fusion of dumb charades, pictionary, tinto (a modification of twenty questions) and other such wacky games the coordinators come up with.",
		        new pplnode[] {Coordinator.forIndex(106),Coordinator.forIndex(107)}
		        ),
		   new Eventnode(
		        45,"Whose Line","Variety Events",
		        "Is your mother the only person who loves you? Do you share your problems with your pet gerbil? Does your facebook status say 'it’s complicated' when we all really know the truth? If your answer to all the above questions is yes, well then, we're sorry, dude! But if you're someone who likes to make fun of aforementioned loser on a daily basis then WHOSE LINE is for you!!\n\nIt's an event where everything's made up and the points don't matter*. That's right the points are just like the other Jackson siblings, they just don't matter.\n\nIn a short span of time, we shall throw tons of props and plots at you and all you have to do is use them to make us laugh at/with you. This year’s Whose Line incorporates MadAdz; a round where you do pretty much the same thing except you have to make it into an advertisement.  If you're really funny we give you cash, and certificates to hang on your wall next to your Gossip Girl poster.  So if you always wanted to display your comic skill, here’s your chance.",
		        new pplnode[] {Coordinator.forIndex(139),Coordinator.forIndex(140)}
		        ),
		   new Eventnode(
		        46,"Daily Quiz","Unwind",
		        "Daily Quiz is one of the many events at Saarang which is meant for jobless people. All you need to do is pick up a copy from the Hospitality Desk, fill in the answers and give it back at the Desk. Simple. Nothing more to it. Errr…. except one. The answers need to be correct.",
		        new pplnode[] {Coordinator.forIndex(62)}
		        ),
		   new Eventnode(
		        47,"Daily Events","Unwind",
		        "Saarang is lot of fun with whole lotta events all through the day. But there's one set of events which fill all the small gaps and blends all the events together into Saarang. These daily events also provide you a great opportunity to win prizes if you are not participating in any other event which requires some skill sets. Loaded with puzzles, trivia, crossies and rebuses, these events can keep you engaged all day long and and make sure that you are into Saarang all the time along with giving you a great chance to win some cool prizes.",
		        new pplnode[] {Coordinator.forIndex(61)}
		        ),
		   new Eventnode(
		        48,"Informals","Unwind",
		        "Every year Informals at Saarang has been a stage radiating fun. This year we go beyond the stage and make sure there is something more for everyone. A whole world of fun, excitement and surprises await you.\n\nStep into the Informals Park and rediscover the kid in you. Enjoy the fame on the stage, the competitive spirit in the arena or just sit back and relax in our lounge and of course watch people try out all the crazy games we have in store. To top it all, we have a pot full of goodies up for grabs and remember, no one leaves the world of Informals without a smile....",
		        new pplnode[] {Coordinator.forIndex(79),Coordinator.forIndex(80),Coordinator.forIndex(81),Coordinator.forIndex(82),Coordinator.forIndex(83)}
		        ),
		   new Eventnode(
		        49,"Scavenger Hunt","Unwind",
		        "Queen of Sheeba\n\nA list of artefacts,\n\nOh so rare!\n\nYou search and you forage,\n\nAnywhere, everywhere\n\nBlood of a maiden,\n\nA baboon's tail hair,\n\nScavenger hunt at saarang,\n\nBE THERE!!!",
		        new pplnode[] {Coordinator.forIndex(116),Coordinator.forIndex(117),Coordinator.forIndex(118)}
		        ),
		   new Eventnode(
		        50,"Treasure Hunt","Unwind",
		        "Feel you are getting unnoticed at Saarang? Wanna become a Jack Sparrow? Then you are at the rite place.\n\nWhat better way could there be to become popular and have a thrilling experiance.\n\nThe rules are simple. Run around the 500 acre IIT campus and use your wit a bit ( Cant be popular if you don't have one :P)\n\nand hopefully you can end up with the chest of gold.",
		        new pplnode[] {Coordinator.forIndex(132),Coordinator.forIndex(133),Coordinator.forIndex(134)}
		        ),
		   new Eventnode(
		        51,"Paintball","Unwind",
		        "Paintball is back. With bigger guns and penetrating bullets, out to spill blood on the playing arena. Just Kidding :)\n\nLeave your computers behind, gaming can't get more lifelike than this. It's your team and your paint pellet loaded guns against the odds in this game of shoot-em-up. Whether you’re a sharp shooter or a complete novice, you’re sure to have 5 mins of adrenalin pumping action. Come down to the Paintball field on any day of Saarang, for fun is guaranteed.",
		        new pplnode[] {Coordinator.forIndex(102),Coordinator.forIndex(103),Coordinator.forIndex(104)}
		        ),
		   new Eventnode(
		        52,"Online Quiz","Online Events",
		        "The perfect aperitif to the quizzes at Saarang, Saarang Online Quiz returns this year better than ever, and sealed airtight so that Googling alone is not going to help you. Quizzing at its highest level, but following the KISS ideology. Go, have fun.",
		        new pplnode[] {Coordinator.forIndex(62)}
		        ),
		   new Eventnode(
		        53,"Online Creative Writing","Online Events",
		        "If you are an aspiring poet, playwright or writer of fiction, Online Creative Writing is your moment in the sun. The categories in the event will include something for everyone.\n\nTopics will be uploaded six weeks before the deadline. Go to http://www.saarang.org/2010/events/online-events/creative-writing for more information.\n\nBesides the opportunity to be read by some of the most celebrated writers of today, there are also exciting cash prizes up for grabs!",
		        new pplnode[] {Coordinator.forIndex(58),Coordinator.forIndex(59)}
		        ),
		   new Eventnode(
		        54,"Online Debate","Online Events",
		        "Tongue tied? Always felt a lump in the throat every time you went on the stage even despite having so much to say?  Online Debate is perfect for you. Get to know what others think and have your say. Log in now at www.saarang.org/events/online-events/online-debate. We request you to register first on the user portal and go through the other relevant information.",
		        new pplnode[] {Coordinator.forIndex(97),Coordinator.forIndex(98)}
		        ),
		   new Eventnode(
		        55,"Workshops","Interactions",
		        "Lectures putting you to sleep? Western music taking too much time between performances? Informals too loud for your eardrums?\n\nAt the risk of sounding slightly shady, we tell you: If you wanna DO something, show up for.....Workshops!\n\nWhy?\n\n1. We keep your hands full\n2. We send you home with pretty things [or ugly things- depending on your ability to follow instructions]\n3. We DO stuff [Oh, did we mention that already?]\n4. You get to hobnob with happening people [like us \\m/]\n5. The coolest gals always show up for workshops [Ok, we know all Saarang events promise this, but we MEAN it. Really]\n\nBe it painting or pottery, coffee brewing or code breaking [tentative], cartooning or comedy - we have it all!\n\nIf it isn't obvious already, make workshops your first stop at Saarang '10!",
		        new pplnode[] {Coordinator.forIndex(141),Coordinator.forIndex(142),Coordinator.forIndex(143),Coordinator.forIndex(144),Coordinator.forIndex(145),Coordinator.forIndex(146),Coordinator.forIndex(147)}
		        ),
		   new Eventnode(
		        56,"Pro Shows","Pro Shows",
		        "Come the last week of January, and the Open Air Theatre will be alive with the energy of thrilling live performances every night. Our professional shows consist of a variety that combine finesse and ingenuity. There is something for everyone over the five nights, beginning with Classical Night, followed by the two Popular Nights (Light Music), and culminating in the Rock Show.",
		        new pplnode[] {Coordinator.forIndex(204),Coordinator.forIndex(205),Coordinator.forIndex(206),Coordinator.forIndex(207),Coordinator.forIndex(208),Coordinator.forIndex(209),Coordinator.forIndex(210),Coordinator.forIndex(211),Coordinator.forIndex(212),Coordinator.forIndex(213)}
		        ),
		   new Eventnode(
		        57,"Formalities","Formalities",
		        "Like any other fest, Saarang has its share of formalities like inauguration, closing ceremony, etc.",
		        new pplnode[] {}
		        ),
		   new Eventnode(
		        58,"Unknown Event","Unknown Event",
		        "The details of this event is unavailable. Please contact the hospitality desk for more details.",
		        new pplnode[] {}
		        )
		    };*/
		  Eventnode[] aevents=
		    {
		    new Eventnode(
		        0,"Dreams on Canvas","Spotlight","Is art your passion?\n\nDoes the world seem extra colorful?\n\nThen welcome to \"Dreams on Canvas\", a platform to showcase your artistic talent. Dreams on Canvas brings together the best student artists from the country to compete and exhibit their proficiency in shades and colors.\n\nThis is an art exhibition at Saarang where we expect you not to just exhibit yourpaintings but to bring out other artistic abilities in you.For this purpose, the exhibition over the four days will be coupled with various lectures and workshops by the who's-who of the art world.",
		        new pplnode[] {Coordinator.forIndex(0),Coordinator.forIndex(1),Coordinator.forIndex(2),Coordinator.forIndex(3),Coordinator.forIndex(4),Coordinator.forIndex(5),Coordinator.forIndex(6),Coordinator.forIndex(7),Coordinator.forIndex(8),Coordinator.forIndex(9),Coordinator.forIndex(10),Coordinator.forIndex(11),Coordinator.forIndex(12),Coordinator.forIndex(13)}
		        ),
		   new Eventnode(
		        1,"Impact","Spotlight",
		        "This Saarang is not just about the best bands and the best talent. Its also about getting back in touch with our basic humanitarian nature, seeing a smile on a child's face.\n\nSaarang Impact, an action oriented endeavour, plans to give back to society through collection drives, campaigns and awareness camps. By tying up with various NGOs and social institutions, we wish to create opportunities for social awareness targeted at today's youth. Reaching out to underprivileged children, creating a platform for NGOs to interact with youth and many such initiatives are on track.\n\nJoin hands with us this Saarang as we celebrate and spread joy by promoting a social cause. Create an Impact!\n\niVolunteer\n\nAlways wanted to give back to society but didn't know how? Envisioned a change in the community around you but never knew how to bring out the impact? If such questions have bogged you, then we bring to you iVolunteer!\n\nThis Saarang, its time for you to give back to society. Be that special person for that underprivileged kid. Make an impact on the environment. Give hope to the needy. Lead towards a change, a transformation for the better. Add a smile to that face. Saarang 2010 partners with iVolunteer to give you this chance to work with any of their numerous NGO partners across the country, who can use your skills and combine their mission to impact real lives.\n\niVolunteer is an initiative of MITRA, a not-for-profit organisation working in the social sector in India, headquartered in Delhi. MITRA was established in November 2000 as an entrepreneurial initiative by a group of graduates from Institute of Rural Management, Anand (IRMA). Today MITRA has grown nation wide and has offices in Delhi, Mumbai, Bangalore and Chennai.\n\nRegister with iVolunteer\n\nBe it 2 hours of your free time on a single weekend or 6 hours over 3 months; you may want to teach underprivileged children or help in the admin of an NGO working for animals - it's your choice. You decide the social cause you want to support, the time you can contribute and what work you wish to do - and we will match you to that perfect volunteer opportunity.\n\nGo to www.ivolunteer.in/IVolunteerHome/SiteUser/Volunteers/Register.aspx?F=2 to register.",
		        new pplnode[] {}
		        ),
		   new Eventnode(
		        2,"Essence","Spotlight",
		        "Essence has been envisaged to be a three day Youth Summit, which aims at shaping future leaders through constructive discussions and interactive workshops on Youth and Policy Making. The vision is to engage some of the most creative minds in the country in coming up with solutions to a variety of issues that come under the ambit of policy making.\n\nThe Summit aims to be a unique learning experience for the participants. It includes participatory workshops, interactive discussions, model building exercises, a field visit and lectures by who's who from media, politics and think tanks. With such activities on the first two days, the final day of the summit shall culminate in STEP: an open public policy debate between participants, dignitaries in the field, media personalities, NGOs, civic bodies and other stakeholders.",
		        new pplnode[] {Coordinator.forIndex(63),Coordinator.forIndex(64),Coordinator.forIndex(65),Coordinator.forIndex(66),Coordinator.forIndex(67),Coordinator.forIndex(68)}
		        ),
		   new Eventnode(
		        3,"HYVA 2010","Spotlight",
		        "The Habitat Young Visionary Award has come to Saarang now.\n\nOne of the most prestigious youth awards in the country, HYVA entails writing and arguing out your vision about the nation. If you are the next visionary a fully paid summer school to Cambridge awaits you.\n\nDeadline for essay entry: December 15, 2009\n\nMore details can be found at the website(http://www.indiahabitat.org/main.htm) of the India Habitat Centre.",
		        new pplnode[] {}
		        ),
		   new Eventnode(
		        4,"Saarang Village","Spotlight",
		        "With a cultural diversity rivaling the fauna of a rainforest, India is a heritage to be proud of, and incidently boast of. However with dwindiling numbers interested in performing and / or appreciating these magnificent arts, it is of vital importance to showcase their beauty and awe-inspiring nature. In light of the above, we, at Saarang 2010, bring you Saarang Village.\n\nSaarang Village is here to bring you the face of India at Saarang 2010. From Folklore, the Saarang village packed full of surprises, to the vibrant Alive, a feast for the senses in the form of a parade, Saarang has a new facet garunteed to knock your socks off.\n\nFolklore\n\nFolklore promises to be the complete village experience in the middle of the rustle and bustle of a cultural festival, with an (near) authentic enclosure packed with exhibitions of folk arts and crafts, village cuisine and tribal / traditional artists. The plans include a performing arts festival with dance forms from an Indian state being showcased through the duration of Saarang. With interactive demonstrations, arts / crafts workshops, exclusive 'village' merchandise and a food festival, among other things, on the cards, this is one place that you don't want to strike off of your metaphorical itinerary at Saarang.\n\nAlive\n\nThe present cultural festivals closely reflect the definition of 'cultural performances' slowly changing country-over. As influences creep into our traditional arts and the western arts penetrate our performing arts, a new form of 'culture' is being born. Come watch as the Saarang kicks off with a tribute to this transition, the Saarang parade, Alive, the parade with a beat.",
		        new pplnode[] {Coordinator.forIndex(108),Coordinator.forIndex(109),Coordinator.forIndex(110),Coordinator.forIndex(111),Coordinator.forIndex(112),Coordinator.forIndex(113),Coordinator.forIndex(114),Coordinator.forIndex(115)}
		        ),
		   new Eventnode(
		        5,"Lectures and Demos","Spotlight",
		        "Watch this space for updates",
		        new pplnode[] {Coordinator.forIndex(212),Coordinator.forIndex(213),Coordinator.forIndex(214),Coordinator.forIndex(215),Coordinator.forIndex(216)}
		        ),
		   new Eventnode(
		        6,"Mr & Ms Saarang","Spotlight",
		        "Do you want to be the most popular person at Saarang?\n\nDo you want to show that you are the crème de la crème of Saarang?\n\nDo you want the entire Saarang crowd talking about you and you alone?\n\nIf so, we encourage you to participate in Mr and Ms. Saarang, a competition where all the participants fight it out for the top honours in Saarang 2010.In addition to the prestigious honour of becoming King and Queen of Saarang 2010, there are loads of fabulous prizes to give away. So why don’t you step up and prove that you are the best?",
		        new pplnode[] {Coordinator.forIndex(79),Coordinator.forIndex(80),Coordinator.forIndex(81),Coordinator.forIndex(82),Coordinator.forIndex(83)}
		        ),
		   new Eventnode(
		        7,"Culture Show","Spotlight",
		        "Panache - The Culture Show\n\nA culmination of culture and beauty through the years, Saarang is, for the first time, all set to witness the arrival of its own Culture Show. Panache promises to be a stage for designers to showcase their skill and best designs, but with a twist. Teams must use the stage and prove to both the judges and audience that they are the clear winners.\n\nIn addition, to test the ingenuity and practical design sense of participants, they must design their apparel based on an Indian Ethnic theme of their choice. Participants must portray their themes through a variety of characters. They may use the stage in whatever way that they wish, including, but not limited to, sets and music.",
		        new pplnode[] {Coordinator.forIndex(79),Coordinator.forIndex(80),Coordinator.forIndex(81),Coordinator.forIndex(82),Coordinator.forIndex(83)}
		        ),
		  new Eventnode(
		        8,"Alankaar - Light Music Solo","Light Music",
		        "Are you tired of only singing when you are alone? Do you want to give it a shot in front of an audience and celebrity judges? Do you also sit with your family and point all the errors that a participant makes on your favourite TV singing reality show, and in the end conclude that you could do better than that? If your answer is yes for any or all of these questions, then this is the perfect platform to showcase your talent. All you need is a flair for Indian music and the passion to win over hearts with your voice."
		        ,new pplnode[] {Coordinator.forIndex(237),Coordinator.forIndex(238),Coordinator.forIndex(239)}
		        ),
		   new Eventnode(
		        9,"Tarang - Light Music Group","Light Music",
		        "Do you have the undying passion for Indian music? Have you ever wanted  to perform with your friends on stage in front of a large audience? Then  come prove your mettle at the biggest stage for bands performing Indian  music at Saarang. Battle it out against the best bands from the country  and get a chance to perform in front of an audience of 8000 in the  hallowed Open Air Theater, or as we call it, OAT.",
		        new pplnode[] {Coordinator.forIndex(237),Coordinator.forIndex(238),Coordinator.forIndex(239)}
		        ),
		   new Eventnode(
		        10,"Classical Instrumental","Classical Music",
		        "Kalyani - A raaga which is auspicious as its name suggests, dispels the darkness of fear. One that gives motherly comfort and increases confidence." +
		" Come January, Saarang will witness a confluence of classical music from all over India. Where the best is crowned but everybody wins, and takes back with them the treasure of Gyana, from each other and the Judges - The Masters. So come prepared for this musical treat brought to you by this version of Classical Music @ Saarang - Kalyani",
		        new pplnode[] {Coordinator.forIndex(235),Coordinator.forIndex(236)}
		        ),
		   new Eventnode(
		        11,"Classical Vocals","Classical Music",
		        "Kalyani - A raaga which is auspicious as its name suggests, dispels the darkness of fear. One that gives motherly comfort and increases confidence." +
		" Come January, Saarang will witness a confluence of classical music from all over India. Where the best is crowned but everybody wins, and takes back with them the treasure of Gyana, from each other and the Judges - The Masters. So come prepared for this musical treat brought to you by this version of Classical Music @ Saarang - Kalyani",
		        new pplnode[] {Coordinator.forIndex(235),Coordinator.forIndex(236)}
		        ),
		   new Eventnode(
		        12,"Aria - Western Music Solo (Vocals)","Western Music",
		        "Throw away your inhibitions and let your voice take centre stage with Aria, the solo singing event at Saarang 2011. Aspiring Frank Sinatras and Celine Dions, step into the spotlight to prove your mettle against the best Saarang has to offer. Are you up for the challenge?" +
		        " \nRules:" +
		"\n1. Time Limit: 4 minutes + 1 minute set up time" +
		"\n2. Accompaniment: Vocalists are allowed to play an accompanying instrument OR have one accompanist (instrumental only). Backing tracks will be allowed." +
		"\n3. Participants may perform only in English." +
		"\n4. Participants must bring their own instruments. We will provide a standard 5-piece drumkit, amplifiers, mics, cables, and keyboard stands." +
		"\n5. All participants must be college students. Please carry your college ID.",
		        new pplnode[] {Coordinator.forIndex(240),Coordinator.forIndex(241),Coordinator.forIndex(242),Coordinator.forIndex(243)}
		        ),
		   new Eventnode(
		        13,"Decibels","Western Music",
		        "Hell is full of musical amateurs - George Bernard Shaw" +

		"The definitive semi-professional band competition, Decibels has seen the likes of Slain, Junkyard Groove," +
		"Moksha, Medici, Bhayanak Maut, Power in the Ashtray, Pin Drop Violence, Panatella, NerveRek burn " +
		"up IITM’s famous Open Air Theater stage." +

		"We at IITM, like to make big things. So we give you, the complete attention of 8000 people , truck" +
		"loads of money and a chance to make history. That's it. And in this world , as in many others, SIZE" +
		"DOES MATTER." +

		"Carpe diem, baby.",
		        new pplnode[] {Coordinator.forIndex(240),Coordinator.forIndex(241),Coordinator.forIndex(242),Coordinator.forIndex(243)}
		        ),
		   new Eventnode(
		        14,"Powerchords","Western Music",
		        "The chance for college bands to shine! Diversity and versatility (and coolness, and awesome guitar and maybe a really good drummer to complement a kick-ass bassist and stand out vocals) are encouraged." +
		"\nRules" +

		"\n1. There will be a preliminary round, followed by a final round." +
		"\n2. Prelims: Participants are required to play one song." +
		"\nTime limit – 5 minutes + 3 minutes set up time" +
		"\n3. Six bands will be selected for the final round." +
		"\n4. Final round : Time limit – 15 minutes + 3 minutes set up time" +
		"\n5. Bands may perform only in English." +
		"\n6. All band members have to be college students. Please carry your college ID." +
		"\n7. A standard 5 piece drum kit, mics, cables, and amplifiers will be provided. Participants must bring their own instruments." +

		"\n8. One person cannot participate in more than one band in the same event.",
		        new pplnode[] {Coordinator.forIndex(240),Coordinator.forIndex(241),Coordinator.forIndex(242),Coordinator.forIndex(243)}
		        ),
		   new Eventnode(
		        15,"WM Solo Instrumental","Western Music",
		        "Singing not your forte? Sonata is the event for you. Be it a Blue Danube, or a Purple Haze, let your instrument do the talking. The stage is yours if you can prove you’re worth it (and even if you can’t). It’s your five minutes of fame." +
		"\nRules:" +

		"\n1. Time Limit - 4 minutes + 1 minute set up time" +
		"\n2. Accompaniment: Participants are allowed one accompanist or a MIDI/mp3 track." +
		"\n3. Participants may perform only Western Pieces." +
		"\n4. Participants must bring their own instruments. We will provide a standard 5 piece drumkit, amplifiers, mics, cables, and keyboard stands." +
		"\n5. All participants must be college students. Please carry your college ID.",
		        new pplnode[] {Coordinator.forIndex(240),Coordinator.forIndex(241),Coordinator.forIndex(242),Coordinator.forIndex(243)}
		        ),
		   new Eventnode(
		        16,"A Cappella","Western Music",
		        "A Cappella (from Italian for choir) is vocal music intended to be performed without instrumental accompaniment. Let the music flow directly from your soul so that others can feel it. Celebrate the versatility of the human voice. We believe you don’t need instruments to be the Rolling stones. The prize is yours if you can prove us right." +

		"\nRules:" +

		"\n1. Time limit: 10 minutes + 1 minute set up time" +

		"\n2. Accompaniment: Only one accompanying instrument (acoustic) is allowed. Keyboards may be used only in the Piano patch." +

		"\nParticipants must bring their own instruments." +

		"\n3. Participants may perform only in English." +

		"\n4. Mics will be provided." +

		"\n5. All participants must be college students. Please carry your college ID." +

		"\n6. One person cannot participate in more than one band in the same event.",
		        new pplnode[] {Coordinator.forIndex(240),Coordinator.forIndex(241),Coordinator.forIndex(242),Coordinator.forIndex(243)}
		        ),
		   new Eventnode(
		        17,"Acoustyx","Western Music",
		        "Get back to the basics with Acoustyx. Music isn’t always about distortion, processors and wah-wahs. If you’re more Jack Johnson than Steve Vai, show off your mellow sounds on our stage at the acoustiyx competition. Go unplug." +

		 "\nRules:" +

		"\n1. Time limit: 15 minutes + 3 minutes set up time" +

		"\n2. Instruments: No electric instruments except for bass guitars and acoustic electric guitars will be allowed. Keyboards can only be used when set to the piano patch. Mics will be provided for all acoustic instruments. "+

		"\n3. Participants may perform only in English. " +

		"\n4. Mics, a standard 5 piece drum kit, cables, and amplifiers will be provided. Participants must bring their own instruments." +

		 "\n5. One person cannot participate in more than one band in the same event.",
		        new pplnode[] {Coordinator.forIndex(240),Coordinator.forIndex(241),Coordinator.forIndex(242),Coordinator.forIndex(243)}
		        ),
		   new Eventnode(
		        18,"Dramatics","Thespian Events",
		        "One day of unadulterated theatre. See the best colleges in the country put up professional productions. Saarang Dramatics has established itself as the litmus test for most budding actors." +
		"\nRules" +
		"\n1. Time Limit - The time of 1 hour will be counted from 'empty stage to empty stage'." +
		"\n2. Props - Basic props will be provided on prior notice, i.e. chairs, tables and 1 cot."+
		"\n3. Sticking on the backdrop will NOT be allowed." +
		"\n4. Use of fire/water/smoke machines on stage (or anywhere in its vicinity) is strictly prohibited.",
		        new pplnode[] {Coordinator.forIndex(260),Coordinator.forIndex(261),Coordinator.forIndex(262)}
		        ),
		   new Eventnode(
		        19,"Mono Acting","Thespian Events",
		        "If you are a loner or a glory hound, or a really good actor who never gets that main role, or a really good actor who always gets the main role, this one's for you! You are in the colosseum for five minutes. Win the crowd or face their wrath." +

		"\nRules" +
		"\n1. Time Limit - 4 + 1 minute will be given per person." +
		"\n2. After 4 minutes, a buzzer/bell will be rung." +
		"\n3. Exceeding time limit will result in negative marking." +
		"\n4. Only 3 individuals per college will be allowed." +
		"\n5. Participants have to be student",
		        new pplnode[] {Coordinator.forIndex(260),Coordinator.forIndex(261),Coordinator.forIndex(262)}
		        ),
		   new Eventnode(
		        20,"Street Play","Thespian Events",
		        "Plays, as a medium of communication, have been present in all cultures. And Street Play at Saarang celebrates exactly this art form. Drum it up, people!" +
		"\nRules" +
		"\n1. Time Limit - 15 minutes" +
		"\n2. Only acoustic and percussion instruments will be allowed." +
		"\n3. Plays will have to deal with subjects of social relevance." +
		"\n4. Plays in English. Tamil and Hindi are allowed. Please avoid other language except for very small lines." +
		"\n5. No props/costume will be provided." +
		"\n6. Please stick to the area allotted to the event.",
		        new pplnode[] {Coordinator.forIndex(260),Coordinator.forIndex(261),Coordinator.forIndex(262)}
		        ),
		          
		   new Eventnode(
		        21,"Radio Play","Thespian Events",
		        "Participants will perform a play with dialogues, music, and sound effects from behind a screen. The audience will not see the participants as they are performing the play." +

		"\nRules" +
		"\n1. Time Limit - 15 minutes" +
		"\n2. No pre-recorded music will be allowed." +
		"\n3. Only the use of acoustic instruments and percussion instruments will be allowed." +
		"\n4. Maximum 7 members per team." +
		"\n5. Registration is on a first-come first-served basis, interested teams mail us immediately - drams@saarang.org" +
		"\n6. On the spot registration will also be allowed at the hospitality desk, on the day of the event.",
		        new pplnode[] {Coordinator.forIndex(260),Coordinator.forIndex(261),Coordinator.forIndex(262)}
		        ),

		        new Eventnode(
		        54,"Online Playwright Competition","Thespian Events",
		        "Have you ever watched a disastrous play and wondered \"I could have written it better than that!\". Well, go ahead! Submit short to medium-length play and you could win amazing prizes, including a chance to be published by a top literary magazine. The plays should be entirely original. Plays that have been performed at/sent to other competitions at any point of time need not be sent. (Online submission)" +
		"Mail in your entries to drams@saarang.org This e-mail address is being protected from spambots. You need JavaScript enabled to view it with \"Online Playwright Competition - submission\" in the subject line." +
		"You can start mailing in your entries on 25th December 2010. Watch this space for the deadline for entries.",
		        new pplnode[] {Coordinator.forIndex(260),Coordinator.forIndex(261),Coordinator.forIndex(262)}
		        ),

		   new Eventnode(
		        22,"Biz Quiz","Quizzes",
		        "The Saarang Business Quiz, popularly known as BizQuiz, is a regular quiz at every cultural festival. At Saarang, it is one of 5 major quizzes, and has garnered widespread participation over the years. BizQuiz focuses specifically on all matters related to the Business world - from Gordon Gekko to Narayan Murthy." +
		        "BizQuiz has two levels of participation- a written preliminary round, and a 6-team final. To induce the element of \"business\" into the quiz, there may be rounds that require participants to hold wagers, and bet against their competitors. A diverse quiz, BizQuiz requires no specific preparation, and caters to audiences of all ages.",
		        new pplnode[] {Coordinator.forIndex(247),Coordinator.forIndex(248)}
		        ),
		   new Eventnode(
		        23,"SpEnt Quiz","Quizzes",
		        "Being an event that has all to do with question and answers, we'll give our information in the same format as well." +

		"\nWhat is the SpEnt Quiz?" +

		"\nSpEnt is a portmanteau of Sports and Entertainment. For those who think Sports is" +
		"Entertainment, we recommend repeating this away from the comfortable chair they are" +
		"sitting on. Needless to say, the SpEnt Quiz is a quiz on sports and entertainment. ",
		        new pplnode[] {Coordinator.forIndex(255),Coordinator.forIndex(256),Coordinator.forIndex(257)}
		        ),
		   new Eventnode(
		        24,"Lonewolf","Quizzes",
		        "Widely recognized as the best college quiz in India, complete with the Chennai winters, drunken coordinators, sleepless nights and mosquito bites, where quizzing legends are born and forever preserved by insti folklore,  the Saarang Lonewolf Quiz is back in an all new avatar featuring new rounds.",
		        new pplnode[] {Coordinator.forIndex(251),Coordinator.forIndex(252),Coordinator.forIndex(253),Coordinator.forIndex(254)}
		        ),
		   new Eventnode(
		        25,"India Quiz","Quizzes",
		        "The India Quiz at Saarang, as the name suggests, is all about desi feel. Get ready to explore this vast and diverse country of ours. We are going to keep it short and simple, as we entertain you with some interesting and quirky trivia about our Bharat Mata." +

		"\nG +ear up and charge your grey cells with everything from Kanyakumari to Kashmir, Sachin to Saina," +
		"from the big Khans to Kat and other big cats and anything else you can think of." +

		"\nThose simple snippets of info that you glanced over in recent newspapers, a few facts scattered all" +
		"over you old history text books or even those gen facts you heard from a friend could get you some prizes! " +

		"India quiz is set to take you by storm. Are you ready?",
		        new pplnode[] {Coordinator.forIndex(249),Coordinator.forIndex(250)}
		        ),
		   new Eventnode(
		        26,"Buzzer Quiz","Quizzes",
		        "Buzzer quiz is probably the only quiz where you might know all the answers. This however doesn't make it any easier. The question now is 'Are you fast enough?'  Buzzer quiz debuts this Saarang and promises to be a bucket load of joyful yelps, and invariably, agonizing groans when the obvious hits you right between the eyebrows just seconds after it did to your opponents. The prelims, with its unique format primarily test your off-the-feet-thinking and quick wittedness. It's not only the traditional score, but also the time taken which will see one through to the finals. The finals will of course field questions from myrmecology and Chuck Norris and everything in between. The only pre-requisite is recognizing that EVERY question is on the buzzer. Lateral thinking and wild guesses will find due space for expression here.  The quiz is open to teams of three or lesser and we assure you, this will push your faith in your teammates to the very brink. We guarantee a virtual cornucopia of questions which won’t fail to tantalize and amaze. ",
		        new pplnode[] {}
		        ),
		   new Eventnode(
		        27,"The Fourth Estate","Media Events",
		        "The news media has shaped the course of modern history lending credence to the maxim- the pen is mightier than the sword. It took just two committed reporters to bring down the corrupt President of perhaps the most powerful country in the world. In the words of Benjamin Franklin, newspapers without a democracy are preferable to a democracy without newspapers." +
		"At Saarang 2011, the Fourth Estate will primarily test a participant’s journalistic ability primarily in the field of reporting.",
		        new pplnode[] {Coordinator.forIndex(323)}
		        ),
		   new Eventnode(
		        28,"Short Film Making","Media Events",
		        "What would we be without emotion? Imagine a world, apathetic, oblivious, monotonous, and downright mechanical. The world would fall to beings of superior intellect and wisdom. Creativity  would have no place in the drab, dark corridors of inability to appraise, for perception itself will have been destroyed by this seemingly innocuous alteration. We are however, emotive beings. From birth, we have known the futility of existence in the absence of feeling - feeling with the heart. So, yes, we can feel. And we can expect to feel. Come, enlighten our people. Strike at the very depths of our conscience and watch our emotion flow. After all, feeling is believing .." +

		"\nShort Film Making, a staggering collaboration of breath-taking ideas, camera work, acting and so much more. Come, be a part of the honoured film makers of the new era and show us what you are made of!",
		        new pplnode[] {Coordinator.forIndex(227),Coordinator.forIndex(228),Coordinator.forIndex(229)}
		        ),
		   new Eventnode(
		        29,"Photography Contest","Media Events",
		        "Like to show the world, the world you see through your eyes? Learn it the best way." +

		"\nAt the Saarang photography workshop you will learn all you wanted to learn about photography from experts. No props or pre-registration required. Here is a chance for all the amateur as well as the expert photographers to learn a lot of new stuff and the latest techniques. There will also be an exhibit of various photos clicked by the expert. An added feature will be the photo-walk where you will learn to choose your subject and frame your shot. Do not miss this golden opportunity!" +

		"\nPS: DO NOT FORGET your camera." +

		"\nAlso look out for the photography contest. Based on a theme that will be released everyday, wield your weapons and shoot the subject. Lots of prizes to be won!",
		        new pplnode[] {}
		        ),
		   new Eventnode(
		        30,"Choreo Nite","Dance Events",
		        "Stay in the game for the Biggest Dance Competition in South India, a night where college teams across the country fight for the coveted title. So Pop it, Rock it, Beat it! The Saarang Choreo Nite  is back again this year. Bigger, Better and Fancier! With tickets sold out days in advance, an 8000+ audience, attractive prize money, it’s definitely a larger than life experience. With teams showcasing the best of their mettle, this is the perfect dance floor to have a mind blowing experience and yet feel that razor sharp, cut throat competition." +
		"If you feel you have it in you to set the Saarang stage ablaze, register now. But that is a big \"IF\"." +

		"\nCare for a Challenge?    ",
		        new pplnode[] {Coordinator.forIndex(47),Coordinator.forIndex(48),Coordinator.forIndex(49),Coordinator.forIndex(50)}
		        ),
		   new Eventnode(
		        31,"Classical Dance","Dance Events",
		        "We are calling dancers of all classical Indian dance forms to live their biggest dream at Saarang. If you are used to hopping from college to dance class to sabha, sit with your back upright and move your feet involuntarily to rhythm, you will be at home here." +

		"\nThe Utsav presents to you an opportunity of a lifetime, where you can not only compete, but interact with eminent dancers, attend workshops and lec dems." +


		"\nCome, be part of the cultural revival at Saarang." +

		"\nThe cultural dance event comprises of two categories " +

		    "\n* SOLO EVENT" +
		    "\n* GROUP EVENT"
		,
		        new pplnode[] {Coordinator.forIndex(210),Coordinator.forIndex(211)}
		        ),
		   new Eventnode(
		        32,"Freestyle Solo Dance","Dance Events",
		        "Always been waiting to steal the stage? Wanted the lime light all for yourself? Well, if you can" +
		"shake a leg and move those hips, we have the perfect stage for you. From the desi kuthu to popping, locking and breaking, this arena will let you play it well. A perfect chance to showcase the fancy head stand, a couple of cart wheels and your latest jazz move." +

		"\nMake your mark at Freestyle Solo!",
		        new pplnode[] {Coordinator.forIndex(206),Coordinator.forIndex(207),Coordinator.forIndex(208),Coordinator.forIndex(209)}
		        ),
		   new Eventnode(
		        33,"JAM","Speaking Events",
		        "JAM, is something of a social experiment. Eight people are given a minute of fame. The same minute of fame. And only one person can speak at a time. And boy, do people HATE sharing their minute..." +


		"\nOnce you do finally manage to start speaking, you can speak only so long as there is absolutely no deviation from coherent continuous (interesting) speech. And the first one to point out a flaw, will buzz you (with great panache) and grab the mic from you!" +
		"\nAs if it isn't bad enough, we introduce another player into the fray.. This player is called the JAM mod (among lot of other things), is around to make your life miserable, poke fun of you, give you your topics and moderate all objections." +
		"\nSo be utterly bamboozled as you die laughing (or crying) as the incredible speakers of the queen's english buzz it out, trying not to stutter, stammer, pause \"unnaturally\", make any grammatical errors or repeating anything.. And fail miserably..",
		        new pplnode[] {Coordinator.forIndex(258),Coordinator.forIndex(259)}
		        ),
		    new Eventnode(
		        35,"Elocution","Speaking Events",

		"Since time immemorial, the power of words has been unleashed to wage wars as well as broker peace, to" +
		"drive the masses into a collective frenzy as well as to soothe and offer hope, to bring people closer as" +
		"well as create invisible walls, bringing to the fore the entire gamut of human emotions." +
		"\nAt Saarang '11 we invite you to enrapture us with the power, artistry and subtlety of your rhetoric." +
		"\nBe there at Saarang Elocution to be part of an extravagant exhitbition of oratory." ,
		        new pplnode[] {Coordinator.forIndex(258),Coordinator.forIndex(259)}
		        ),
		   new Eventnode(
		        36,"Extempore","Speaking Events",
		        "\" ... and though it may be long and hard, I will endure it. In fact, I will enjoy every single moment of it.\"\n  - Luther King on his freedom struggle.\n\n\"That’s what she said.\"\n  - Somebody else at Extempore.\n\n\"And suppose all hamburgers are cows but all cows are not hamburgers. Now, if a tree falls on a cow in the forest and you hear the hamburger make a squishy sound, then what shade of beige is the mayonnaise?\"?\n\nWhile easily mistaken for a question from the IIT-JEE, these are the types of largely irrelevant things an average participant at Extempore tries to figure impromptu in his head. As Dr. Spaceman would have us know, the head is a lot like a washing machine. And at Extempore, you’ll see double entendres and bad puns tumbling through heads like dirty socks and tighty whities through a Whirlpool front loader.\n\nExtempore, or Exxtemppure as Sonu Niiggaa M. likes to call it, has been a forum for spontaneous exposition on a number of socially relevant issues such as the love of female pandas, or pandies if you will, for bamboo shafts; why the Irish make really bad super-villains; Wonder Woman’s domination fetishes and so much more. On a completely irrelevant tangent, it has also been confused with a number of popular day time talk shows.\n\n\"What! And you’re going to let me be part of this extravagant celebration of wit, irreverence and political incorrectness for free?\" ?All we ask in return is that you be pretty interesting. Or interesting. Or plain old pretty.",
		        new pplnode[] {Coordinator.forIndex(258),Coordinator.forIndex(259)}
		        ),
		   new Eventnode(
		        37,"WTGW","Literary Events",
		        "To all those who feel 26 letters is not enough to get your adrenaline rushing, get ready to face a multitude of word puzzles. Witness hardcore ‘What’s The Good Word’- the ultimate word games challenge!!!!!" +

		"\nAs the saying goes (or the going says)" +
		"\"English is German which has been Latinized and Frenchified\"" +

		"So, come, drench yourselves in an ocean of words and get your brains to somersault to dizzying heights...this SAARANG!!!",
		        new pplnode[] {Coordinator.forIndex(223),Coordinator.forIndex(224)}
		        ),
		   new Eventnode(
		        38,"Crossie","Literary Events",
		        "\"Screwed up verbal circuits make a racist gridman\"(pun intended)\n  - Captain cruciverbose(if you know what he means)\n\nIf you have it in you to make  any sense out of the statement above and you want to show the world how whacko you are then this is the place you would wanna be.  Get ready to face a multitude of word twists , double entendres and phrases that just don’t seem to make any sense at the first look. Rest assured, you will face lots of ups and downs but if you are cryptic enough then tibi est mundus!",
		        new pplnode[] {Coordinator.forIndex(60)}
		        ),
		   new Eventnode(
		        39,"Creative Writing","Literary Events",
		        "The pages are still blank, but there is a miraculous feeling of the words being there, written in invisible ink and clamouring to become visible." +

		"\nVladimir Nabakov" +

		"\nWriting, for most people, is about discovery. About perfectly round pebbles and the smell of cardamom early in the morning. About a gentle touch and candle-lit eyes. About a lump in the throat. About the swirl and swing of the words as they tangle with human emotions. About a peculiar inner music. About a paper-and-pen cocktail with a sprinkling of emotion." +

		 "\nAt Saarang 2011, discover yourself." +

		 "\nThere are two categories for participation:" +

		"\nBecause brevity is the soul of all wit, the Short Fiction category, for those exponents of the art of the short story." +

		"\nBecause there exists a mirror which makes beautiful that which is distorted, the Poetry category, for those inclined towards verse." +

		"\nThe two events will take place in three hour slots on separate days during Saarang. Watch this space for further details.",
		        new pplnode[] {Coordinator.forIndex(217),Coordinator.forIndex(218)}
		        ),
		   new Eventnode(
		        40,"Scrabble","Literary Events",
		        "All you need to know is English and of course when to make a move when you are onboard" +
		"\nRules:" +
		"\n1. The dictionary used is the Collins Scrabble Dictionary." +
		"\n2. There will be a written prelims. 10 teams will be selected for finals." +
		"\n3. Maximum of two per team. ",
		        new pplnode[] {Coordinator.forIndex(221),Coordinator.forIndex(222)}
		        ),
		   new Eventnode(
		        41,"Fine Arts","Arts And Craft",
		        "A  Fine blend of Art, Craft and YOU." +
		"\nFine Arts gives you the perfect platform to showcase your creativity and artistic skills." +
		"\n\"I've never believed in God, but I believe in Picasso.\"" +
		"\nIf you're one such art freak, you've found the right place. Fine arts is back with a bang, proudly ruffling its new colors. With a myriad of fine art events to stimulate the artist in you, we shall not let the Picasso in you rest in peace!" +
		"\nSet free the great creator inside you, unleash yourself on to the canvas, and render that cannot be expressed in words.This is probably the one event where you can let your imagination run riot and sweep the awards. You don’t need to have any pre-requisites to be a part of one of the most envied events at Saarang. All you need is to have the enthusiasm." +
		"\nBe a part of the \"finest\" fine arts in the history of Saarang.",
		        new pplnode[] {Coordinator.forIndex(201),Coordinator.forIndex(202),Coordinator.forIndex(203),Coordinator.forIndex(204),Coordinator.forIndex(205)}
		        ),
		   new Eventnode(
		        42,"Antakshari","Variety Events",
		        "\"Thande thande paani se nahana chahiye, gaana aaye ya na aye gaana chahiye...\"" +

		"\nAre you one who is truly passionate about hindi bollywood singing?" +
		"\nAre you one who has a song for every occasion? (jaise filmo mein hota hai....)" +
		"\nAre you a victim of high funda singing competitions where, in the pool of those over talented singers, your passion and interests have remained unseen and unnoticed? If yes, then..." +

		"\n\"Koi baat nahi, bade bade shehro mein aisi choti choti baatein hoti rehti hain... Basanti, un kutto ke saamne mat gaana..." +

		"\n...Kyuki humein jangli billiya pasand hai!!\"" +

		"\nIf you have that zeal for hindi classics then we promise a completely fun-filled time and a good deal of prize money with much more exciting stuff that you can take back home." +

		"\nWo sikandar hi doston kehlata he, Hari baazi ko jeetna jise aata he...." +

		"\nAntakshari ka Sikandar banna hai bas 3 baziya dur-" +

		  "\nPrelims" +

		  "\n\nSemi-finals" +

		  "\n\nFinals" +

		"\"Ye antakshari nahi aasan, itna samajh lijiye, ek talent ka mela hai, aur jeet ke jaana hai\"",
		        new pplnode[] {Coordinator.forIndex(277),Coordinator.forIndex(278)}
		        ),
		   new Eventnode(
		        43,"Cluedo","Variety Events",
		        "Have you ever been fascinated by mysteries and detective stories?" +

		"\nIf so, then this is your chance to have a taste of being a part of them at the popular game \"Cluedo\". " +




		"\nCluedo is a unique mystery solving event inspired by the popular board game that goes by the same name." +
		"\nThe participants will be posed with challenging scenarios that'll test their reasoning skills, carefulness, awareness and the uncommon parts of common sense. Sometimes the questions will be aided by audiovisuals or images which'll make them more interesting and fun to solve. All the armchair detective skills of Sherlock Holmes and Hercule Poirot will be put to use to solve thefts, murders, escapes and a lot more out of the wildest imaginations." +

		"\nPrelims will be a written round which will be followed by finals. The qualifying teams from the prelims will play a group game amongst themselves in the finals, which will be loosely based on the actual board game  \"Cluedo\".",
		        new pplnode[] {Coordinator.forIndex(279),Coordinator.forIndex(280),Coordinator.forIndex(281)}
		        ),
		   new Eventnode(
		        44,"Potpourri","Variety Events",
		        "Potpourri is an eclectic fusion of dumb charades, pictionary, tinto(a modification of twenty questions) and other such wacky games the coordinators come up with. It has always been a crowd favourite since you are guaranteed to have fun on stage and in the audience, cheering on participants who might be jumping up and down trying to tell their teammates \"Hey! I’m a monkey\". So if long hours of non stop enjoyment are what you are looking for, this is where you want to be!" +

		        "\nFormat: " +
		"\nThe event will consist of a prelims and a finals." +


		"\nRules and regulations:" +

		   "\n1. 3 members per team" +
		   "\n2. Cross college teams allowed" +
		   "\n3. No pre-registration required"
		,
		        new pplnode[] {Coordinator.forIndex(282),Coordinator.forIndex(283)}
		        ),
		   new Eventnode(
		        45,"Wolf","Variety Events",
		        "A village cut off from the rest of the World infested with 4 serial killers  tries desperately to save the clan.Armed with strong words and sharp brains the villagers try to banish the impostors." +

		"\nOne player from each of the participating teams would be tested on the rules and objectives of the" +
		"game and fourteen teams would be selected." +

		"\nEach team would be represented on each table by one member. The moderator would assign each" +
		"player a character randomly."
		,
		        new pplnode[] {}
		        ),
		  new Eventnode(
		        45,"Mr. and Ms. Saarang","Variety Events",
		        "Have you been perpetually perplexed by how your talent to entertain people has always gone unnoticed?" +

		"\nHave you grown up thinking that your name is \"SHUT UP!\" thanks to how people have been unreceptive to your gift of attention-grabbing?" +

		"\nHave you always wished for a Bollywood movie ending involving your one great shot to fame, one fine day?" +

		"\nOh yes, apart from sympathy, we also offer you the good news. Your chance has arrived and in great style!" +

		"\nWelcome to Mr & Ms Saarang, the ultimate hunt for any aspiring person with a whole lot of narcissistic and ‘I-want-all-the-attention’ tendencies. You only need to fulfill two prerequisites:" +

		"\n1)   You need to belong to the group known taxonomically as Homo sapiens (Latin: \"wise man\" or   \"knowing man\"),[3][4] are the only living species in the Homo genus of bipedal primates in Hominidae, the great ape family." +

		      "\n2)  The biological and genetic ability to trip on others and of course, get tripped on (Du-uh!)",
		        new pplnode[] {Coordinator.forIndex(297),Coordinator.forIndex(298),Coordinator.forIndex(299),Coordinator.forIndex(300)}
		        ),

		   new Eventnode(
		        46,"Daily Quiz","Unwind",
		        "Daily Quiz keeps the quizzing flavour intact during Saarang.." +
		        "\nIt's pretty simple. Everyday, a set of quiz questions will be available at the Hospitality Desk as handouts. Fill up the answers and hand it back at the desk. The participants with the best entries win prizes.",
		        new pplnode[] {Coordinator.forIndex(275),Coordinator.forIndex(276),}
		        ),
		   new Eventnode(
		        47,"Daily Events","Unwind",
		        "Rightfully labelled as everyone's and anyone's event, Saarang Daily Events guarantees to be the perfect companion for the funlover in you, whether it be between events or over lunch. Ensuring fun from the very moment the paper reaches your clutches, Daily Events requires only a craving for enjoyment from you. If oodles of fun, with prizes along the way, is what you're eyeing at Saarang, Daily Events is the perfect event for you! ",
		        new pplnode[] {Coordinator.forIndex(263)}
		        ),
		   new Eventnode(
		        48,"Informals","Unwind",
		        "The man turned, breathing heavily. He could see the silhouette of a woman under a canopy of stars set in inky black. He ran towards her, trying to make sense of the chaos around him. Colours splattering across trees, people screaming, psychotic laughter. The silhouette was moving towards a darkened alley. He had to block her off, before she could lose herself in the darkness. He was getting desperate. He heard two gunshots ricocheting off the walls, and they rang in his ears like a church bell boding ill. It was his first case and every nerve in his body was pulsing. And suddenly, there was light." +

		"\nThe woman had disappeared in a puff of smoke, and the last human contact in this city had been thus extinguished. The man had run from pole to post, in a desperate attempt to connect with anything remotely human. The emptiness of the city rang in his ears. The silence was deafening." +

		"\nSuddenly, there was more light. He felt some unexplainable force dragging him towards it. Was he dying, he wondered. This is how the Mahabharata had described death. He had nothing to fear, for he had always walked by the path of dharma and karma. Scenes of his life flashed before him. " +
		"\nA red luminescence emerged from something just beyond the narrow alley. There stood a troupe of young people, wearing strange clothes and sporting inane expressions. The boy at the head of their group held out his hand. \"We're the Informals,\" he said. The man was growing steadily confused. The Informals sounded less like the name of an international terrorist organization than did Paneer Butter Masala (a radical fundamentalist group in Kaiga). \"But...\" he stammered, \"What is your criminal agenda?\" The boy laughed, with a manic gleam in his eyes. \"We're slowly taking over the city. Anyone who matters is here. And anyone who doesn't matter is also here. We're planting a seed in the mind of everyone.It is a seed that will grow and root itself in the subconscious.\" \"What's this seed?\" asked the man.",
		        new pplnode[] {Coordinator.forIndex(297),Coordinator.forIndex(298),Coordinator.forIndex(299),Coordinator.forIndex(300)}
		        ),
		       new Eventnode(
		        49,"Scavenger Hunt","Unwind",

		"Beg, borrow, steal, spill blood. The only goal is to procure the Queen’s wonted needs! Many great people have tried, some have even come close to the line. It is now your chance, to wage a war, to fight and make sure the Queen goes back with a smile at Saarang 2011. Be there!" +
		"\nRegistrations:" +

		   "\n1. Registrations will be done at the Hospitality desk, from Day 1 to the day before the event." +
		   "\n2. Each team will consist of 6 members (minimum of 1 IITian and a maximum of 3 IITians)." +
		   "\n3. The final list of teams of 6 for the event will be available at the Hospitality desk the evening before the day of the event.",
		        new pplnode[] {Coordinator.forIndex(264),Coordinator.forIndex(265),Coordinator.forIndex(266)}
		        ),
		   new Eventnode(
		        50,"Treasure Hunt","Unwind",
		        "Treasure Hunt - The Rush" +

		"\nEver had a fascination for the capers of Robert Langdon? Is National Treasure your favourite movie of all time? Do you think in ciphers? Do you dream of becoming rich overnight? Does traipsing through tropical jungles infested with dangerous beasts give you a rush? If so, you're at the right place." +
		"\nFour hours. Ten teams. Cryptic clues. Many paths. One Treasure. The race is on."
		,
		        new pplnode[] {Coordinator.forIndex(267),Coordinator.forIndex(268),Coordinator.forIndex(269)}
		        ),
		   new Eventnode(
		        51,"Paintball","Unwind",
		        "Paintball is back. With bigger guns and penetrating bullets, out to spill blood on the playing arena. Just Kidding :)\n\nLeave your computers behind, gaming can't get more lifelike than this. It's your team and your paint pellet loaded guns against the odds in this game of shoot-em-up. Whether you’re a sharp shooter or a complete novice, you’re sure to have 5 mins of adrenalin pumping action. Come down to the Paintball field on any day of Saarang, for fun is guaranteed.",
		        new pplnode[] {Coordinator.forIndex(102),Coordinator.forIndex(103),Coordinator.forIndex(104)}
		        ),
		   new Eventnode(
		        52,"Online Quiz","Online Events",
		        "The perfect aperitif to the quizzes at Saarang, Saarang Online Quiz returns this year better than ever, and sealed airtight so that Googling alone is not going to help you. Quizzing at its highest level, but following the KISS ideology. Go, have fun.",
		        new pplnode[] {Coordinator.forIndex(62)}
		        ),
		   new Eventnode(
		        53,"Online Creative Writing","Online Events",
		        "If you are an aspiring poet, playwright or writer of fiction, Online Creative Writing is your moment in the sun. The categories in the event will include something for everyone.\n\nTopics will be uploaded six weeks before the deadline. Go to http://www.saarang.org/2010/events/online-events/creative-writing for more information.\n\nBesides the opportunity to be read by some of the most celebrated writers of today, there are also exciting cash prizes up for grabs!",
		        new pplnode[] {Coordinator.forIndex(58),Coordinator.forIndex(59)}
		        ),
		    
		       new Eventnode(
		        55,"Workshops","Interactions",
		        "Lectures putting you to sleep? Western music taking too much time between performances? Informals too loud for your eardrums?\n\nAt the risk of sounding slightly shady, we tell you: If you wanna DO something, show up for.....Workshops!\n\nWhy?\n\n1. We keep your hands full\n2. We send you home with pretty things [or ugly things- depending on your ability to follow instructions]\n3. We DO stuff [Oh, did we mention that already?]\n4. You get to hobnob with happening people [like us \\m/]\n5. The coolest gals always show up for workshops [Ok, we know all Saarang events promise this, but we MEAN it. Really]\n\nBe it painting or pottery, coffee brewing or code breaking [tentative], cartooning or comedy - we have it all!\n\nIf it isn't obvious already, make workshops your first stop at Saarang '10!",
		        new pplnode[] {Coordinator.forIndex(141),Coordinator.forIndex(142),Coordinator.forIndex(143),Coordinator.forIndex(144),Coordinator.forIndex(145),Coordinator.forIndex(146),Coordinator.forIndex(147)}
		        ),
		   new Eventnode(
		        56,"Pro Shows","Pro Shows",
		        "Glitz and glamour have always been a part of Saarang and this year, we bring you some of the best names in the entertainment industry." +

		"\nSaarang has always been a popular stage for the who's who in the entertainment business, and some celestial names who have graced the stage at Saarang in the past include Sonu Niigaam, Shaan, Lucky Ali, Opeth, Uriah Heep, Parikrama, Ustad Bismillah Khan, Ustad Zakir Hussain, Shobana’s ensemble, to name a few." +
		"\nLast January, the Open Air Theatre of IIT Madras was swept away as the terrific trio of Shankar Ehsaan and Loy descended upon Saarang, before Hammerfall gave Chennai a taste of some true metal music." ,
		        new pplnode[] {Coordinator.forIndex(344),Coordinator.forIndex(345),Coordinator.forIndex(346),Coordinator.forIndex(347),Coordinator.forIndex(348),Coordinator.forIndex(349),Coordinator.forIndex(350),Coordinator.forIndex(351),Coordinator.forIndex(352),Coordinator.forIndex(353),Coordinator.forIndex(354)}
		        ),
		   new Eventnode(
		        57,"Formalities","Formalities",
		        "Like any other fest, Saarang has its share of formalities like inauguration, closing ceremony, etc.",
		        new pplnode[] {}
		        ),
		   new Eventnode(
		        58,"Unknown Event","Unknown Event",
		        "The details of this event is unavailable. Please contact the hospitality desk for more details.",
		        new pplnode[] {}
		        )
		    };
	allevents=aevents;	
	noofevents=58;
	}     
public String finddesbysub(String a)
{
	for(int i=0;i<allevents.length;i++)
	{
	if(allevents[i].name.equals(a))
		return allevents[i].description;
	
	}
	return " ";
	}
public String findtypebysub(String a)
{
	for(int i=0;i<allevents.length;i++)
	{
	if(allevents[i].name.equals(a))
		return allevents[i].type;
	
	}
	return "";
	}


public int findidbysub(String a)
{
	for(int i=0;i<allevents.length;i++)
	{
	if(allevents[i].name.equals(a))
		return i;
	
	}
	return -1;
	}
public String finddesbybookid(long a)
{
	for(int i=0;i<allevents.length;i++)
	{
	if(allevents[i].bookid==a)
		return allevents[i].description;
	
	}
	return "";
	}
public String findsubbyid(long a)
{
	for(int i=0;i<allevents.length;i++)
	{
	if(allevents[i].id==a)
		return allevents[i].name;
	}
	return "";
}

public String findsubbybookid(long a)
{
	for(int i=0;i<allevents.length;i++)
	{
	if(allevents[i].bookid==a)
		return allevents[i].name;
	
	}
	return "";
	}
public pplnode[] findcoordsbysub(String a)
{
	for(int i=0;i<allevents.length;i++)
	{
	if(allevents[i].name.equals(a))
		return allevents[i].coords;
	
	}
	return null;
	}

}