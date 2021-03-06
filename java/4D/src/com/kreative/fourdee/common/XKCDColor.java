package com.kreative.fourdee.common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class XKCDColor {
	public static final Map<String, Integer> XKCD_COLORS;
	static {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("purple", 0xFF7E1E9C);
		map.put("green", 0xFF15B01A);
		map.put("blue", 0xFF0343DF);
		map.put("pink", 0xFFFF81C0);
		map.put("brown", 0xFF653700);
		map.put("red", 0xFFE50000);
		map.put("light blue", 0xFF95D0FC);
		map.put("teal", 0xFF029386);
		map.put("orange", 0xFFF97306);
		map.put("light green", 0xFF96F97B);
		map.put("magenta", 0xFFC20078);
		map.put("yellow", 0xFFFFFF14);
		map.put("sky blue", 0xFF75BBFD);
		map.put("grey", 0xFF929591);
		map.put("lime green", 0xFF89FE05);
		map.put("light purple", 0xFFBF77F6);
		map.put("violet", 0xFF9A0EEA);
		map.put("dark green", 0xFF033500);
		map.put("turquoise", 0xFF06C2AC);
		map.put("lavender", 0xFFC79FEF);
		map.put("dark blue", 0xFF00035B);
		map.put("tan", 0xFFD1B26F);
		map.put("cyan", 0xFF00FFFF);
		map.put("aqua", 0xFF13EAC9);
		map.put("forest green", 0xFF06470C);
		map.put("mauve", 0xFFAE7181);
		map.put("dark purple", 0xFF35063E);
		map.put("bright green", 0xFF01FF07);
		map.put("maroon", 0xFF650021);
		map.put("olive", 0xFF6E750E);
		map.put("salmon", 0xFFFF796C);
		map.put("beige", 0xFFE6DAA6);
		map.put("royal blue", 0xFF0504AA);
		map.put("navy blue", 0xFF001146);
		map.put("lilac", 0xFFCEA2FD);
		map.put("black", 0xFF000000);
		map.put("hot pink", 0xFFFF028D);
		map.put("light brown", 0xFFAD8150);
		map.put("pale green", 0xFFC7FDB5);
		map.put("peach", 0xFFFFB07C);
		map.put("olive green", 0xFF677A04);
		map.put("dark pink", 0xFFCB416B);
		map.put("periwinkle", 0xFF8E82FE);
		map.put("sea green", 0xFF53FCA1);
		map.put("lime", 0xFFAAFF32);
		map.put("indigo", 0xFF380282);
		map.put("mustard", 0xFFCEB301);
		map.put("light pink", 0xFFFFD1DF);
		map.put("rose", 0xFFCF6275);
		map.put("bright blue", 0xFF0165FC);
		map.put("neon green", 0xFF0CFF0C);
		map.put("burnt orange", 0xFFC04E01);
		map.put("aquamarine", 0xFF04D8B2);
		map.put("navy", 0xFF01153E);
		map.put("grass green", 0xFF3F9B0B);
		map.put("pale blue", 0xFFD0FEFE);
		map.put("dark red", 0xFF840000);
		map.put("bright purple", 0xFFBE03FD);
		map.put("yellow green", 0xFFC0FB2D);
		map.put("baby blue", 0xFFA2CFFE);
		map.put("gold", 0xFFDBB40C);
		map.put("mint green", 0xFF8FFF9F);
		map.put("plum", 0xFF580F41);
		map.put("royal purple", 0xFF4B006E);
		map.put("brick red", 0xFF8F1402);
		map.put("dark teal", 0xFF014D4E);
		map.put("burgundy", 0xFF610023);
		map.put("khaki", 0xFFAAA662);
		map.put("blue green", 0xFF137E6D);
		map.put("seafoam green", 0xFF7AF9AB);
		map.put("kelly green", 0xFF02AB2E);
		map.put("puke green", 0xFF9AAE07);
		map.put("pea green", 0xFF8EAB12);
		map.put("taupe", 0xFFB9A281);
		map.put("dark brown", 0xFF341C02);
		map.put("deep purple", 0xFF36013F);
		map.put("chartreuse", 0xFFC1F80A);
		map.put("bright pink", 0xFFFE01B1);
		map.put("light orange", 0xFFFDAA48);
		map.put("mint", 0xFF9FFEB0);
		map.put("pastel green", 0xFFB0FF9D);
		map.put("sand", 0xFFE2CA76);
		map.put("dark orange", 0xFFC65102);
		map.put("spring green", 0xFFA9F971);
		map.put("puce", 0xFFA57E52);
		map.put("seafoam", 0xFF80F9AD);
		map.put("grey blue", 0xFF6B8BA4);
		map.put("army green", 0xFF4B5D16);
		map.put("dark grey", 0xFF363737);
		map.put("dark yellow", 0xFFD5B60A);
		map.put("goldenrod", 0xFFFAC205);
		map.put("slate", 0xFF516572);
		map.put("light teal", 0xFF90E4C1);
		map.put("rust", 0xFFA83C09);
		map.put("deep blue", 0xFF040273);
		map.put("pale pink", 0xFFFFCFDC);
		map.put("cerulean", 0xFF0485D1);
		map.put("light red", 0xFFFF474C);
		map.put("mustard yellow", 0xFFD2BD0A);
		map.put("ochre", 0xFFBF9005);
		map.put("pale yellow", 0xFFFFFF84);
		map.put("crimson", 0xFF8C000F);
		map.put("fuchsia", 0xFFED0DD9);
		map.put("hunter green", 0xFF0B4008);
		map.put("blue grey", 0xFF607C8E);
		map.put("slate blue", 0xFF5B7C99);
		map.put("pale purple", 0xFFB790D4);
		map.put("sea blue", 0xFF047495);
		map.put("pinkish purple", 0xFFD648D7);
		map.put("puke", 0xFFA5A502);
		map.put("light grey", 0xFFD8DCD6);
		map.put("leaf green", 0xFF5CA904);
		map.put("light yellow", 0xFFFFFE7A);
		map.put("eggplant", 0xFF380835);
		map.put("steel blue", 0xFF5A7D9A);
		map.put("moss green", 0xFF658B38);
		map.put("robin's egg blue", 0xFF98EFF9);
		map.put("white", 0xFFFFFFFF);
		map.put("grey green", 0xFF789B73);
		map.put("sage", 0xFF87AE73);
		map.put("brick", 0xFFA03623);
		map.put("burnt sienna", 0xFFB04E0F);
		map.put("reddish brown", 0xFF7F2B0A);
		map.put("cream", 0xFFFFFFC2);
		map.put("coral", 0xFFFC5A50);
		map.put("ocean blue", 0xFF03719C);
		map.put("greenish", 0xFF40A368);
		map.put("dark magenta", 0xFF960056);
		map.put("red orange", 0xFFFD3C06);
		map.put("bluish purple", 0xFF703BE7);
		map.put("midnight blue", 0xFF020035);
		map.put("light violet", 0xFFD6B4FC);
		map.put("dusty rose", 0xFFC0737A);
		map.put("medium blue", 0xFF2C6FBB);
		map.put("greenish yellow", 0xFFCDFD02);
		map.put("yellowish green", 0xFFB0DD16);
		map.put("purplish blue", 0xFF601EF9);
		map.put("greyish blue", 0xFF5E819D);
		map.put("grape", 0xFF6C3461);
		map.put("light olive", 0xFFACBF69);
		map.put("cornflower blue", 0xFF5170D7);
		map.put("pinkish red", 0xFFF10C45);
		map.put("bright red", 0xFFFF000D);
		map.put("azure", 0xFF069AF3);
		map.put("blue purple", 0xFF5729CE);
		map.put("dark turquoise", 0xFF045C5A);
		map.put("electric blue", 0xFF0652FF);
		map.put("off white", 0xFFFFFFE4);
		map.put("powder blue", 0xFFB1D1FC);
		map.put("wine", 0xFF80013F);
		map.put("dull green", 0xFF74A662);
		map.put("apple green", 0xFF76CD26);
		map.put("light turquoise", 0xFF7EF4CC);
		map.put("neon purple", 0xFFBC13FE);
		map.put("cobalt", 0xFF1E488F);
		map.put("pinkish", 0xFFD46A7E);
		map.put("olive drab", 0xFF6F7632);
		map.put("dark cyan", 0xFF0A888A);
		map.put("purple blue", 0xFF632DE9);
		map.put("dark violet", 0xFF34013F);
		map.put("dark lavender", 0xFF856798);
		map.put("forrest green", 0xFF154406);
		map.put("vomit", 0xFFA2A415);
		map.put("pale orange", 0xFFFFA756);
		map.put("greenish blue", 0xFF0B8B87);
		map.put("dark tan", 0xFFAF884A);
		map.put("green blue", 0xFF06B48B);
		map.put("bluish green", 0xFF10A674);
		map.put("pastel blue", 0xFFA2BFFE);
		map.put("moss", 0xFF769958);
		map.put("grass", 0xFF5CAC2D);
		map.put("deep pink", 0xFFCB0162);
		map.put("blood red", 0xFF980002);
		map.put("sage green", 0xFF88B378);
		map.put("aqua blue", 0xFF02D8E9);
		map.put("terracotta", 0xFFCA6641);
		map.put("pastel purple", 0xFFCAA0FF);
		map.put("sienna", 0xFFA9561E);
		map.put("dark olive", 0xFF373E02);
		map.put("green yellow", 0xFFC9FF27);
		map.put("scarlet", 0xFFBE0119);
		map.put("greyish green", 0xFF82A67D);
		map.put("chocolate", 0xFF3D1C02);
		map.put("blue violet", 0xFF5D06E9);
		map.put("cornflower", 0xFF6A79F7);
		map.put("baby pink", 0xFFFFB7CE);
		map.put("charcoal", 0xFF343837);
		map.put("pine green", 0xFF0A481E);
		map.put("pumpkin", 0xFFE17701);
		map.put("greenish brown", 0xFF696112);
		map.put("red brown", 0xFF8B2E16);
		map.put("brownish green", 0xFF6A6E09);
		map.put("tangerine", 0xFFFF9408);
		map.put("salmon pink", 0xFFFE7B7C);
		map.put("aqua green", 0xFF12E193);
		map.put("raspberry", 0xFFB00149);
		map.put("greyish purple", 0xFF887191);
		map.put("rose pink", 0xFFF7879A);
		map.put("neon pink", 0xFFFE019A);
		map.put("cobalt blue", 0xFF030AA7);
		map.put("orange brown", 0xFFBE6400);
		map.put("deep red", 0xFF9A0200);
		map.put("orange red", 0xFFFD411E);
		map.put("dirty yellow", 0xFFCDC50A);
		map.put("orchid", 0xFFC875C4);
		map.put("reddish pink", 0xFFFE2C54);
		map.put("reddish purple", 0xFF910951);
		map.put("yellow orange", 0xFFFCB001);
		map.put("light cyan", 0xFFACFFFC);
		map.put("sky", 0xFF82CAFC);
		map.put("light magenta", 0xFFFA5FF7);
		map.put("pale red", 0xFFD9544D);
		map.put("emerald", 0xFF01A049);
		map.put("dark beige", 0xFFAC9362);
		map.put("ugly green", 0xFF7A9703);
		map.put("jade", 0xFF1FA774);
		map.put("greenish grey", 0xFF96AE8D);
		map.put("dark salmon", 0xFFC85A53);
		map.put("purplish pink", 0xFFCE5DAE);
		map.put("dark aqua", 0xFF05696B);
		map.put("brownish orange", 0xFFCB7723);
		map.put("light olive green", 0xFFA4BE5C);
		map.put("light aqua", 0xFF8CFFDB);
		map.put("clay", 0xFFB66A50);
		map.put("medium green", 0xFF39AD48);
		map.put("burnt umber", 0xFFA0450E);
		map.put("dull blue", 0xFF49759C);
		map.put("pale brown", 0xFFB1916E);
		map.put("emerald green", 0xFF028F1E);
		map.put("brownish", 0xFF9C6D57);
		map.put("mud", 0xFF735C12);
		map.put("dark rose", 0xFFB5485D);
		map.put("brownish red", 0xFF9E3623);
		map.put("pink purple", 0xFFDB4BDA);
		map.put("pinky purple", 0xFFC94CBE);
		map.put("camo green", 0xFF526525);
		map.put("faded green", 0xFF7BB274);
		map.put("dusty pink", 0xFFD58A94);
		map.put("purple pink", 0xFFE03FD8);
		map.put("vomit green", 0xFF89A203);
		map.put("deep green", 0xFF02590F);
		map.put("reddish orange", 0xFFF8481C);
		map.put("mahogany", 0xFF4A0100);
		map.put("aubergine", 0xFF3D0734);
		map.put("dull pink", 0xFFD5869D);
		map.put("evergreen", 0xFF05472A);
		map.put("dark sky blue", 0xFF448EE4);
		map.put("very light green", 0xFFD1FFBD);
		map.put("pastel pink", 0xFFFFBACD);
		map.put("grey purple", 0xFF826D8C);
		map.put("very light blue", 0xFFD5FFFF);
		map.put("dark mauve", 0xFF874C62);
		map.put("cadet blue", 0xFF4E7496);
		map.put("ice blue", 0xFFD7FFFE);
		map.put("light tan", 0xFFFBEEAC);
		map.put("dirty green", 0xFF667E2C);
		map.put("neon blue", 0xFF04D9FF);
		map.put("wine red", 0xFF7B0323);
		map.put("chocolate brown", 0xFF411900);
		map.put("dull purple", 0xFF84597E);
		map.put("yellow brown", 0xFFB79400);
		map.put("denim", 0xFF3B638C);
		map.put("eggshell", 0xFFFFFFD4);
		map.put("jungle green", 0xFF048243);
		map.put("dark peach", 0xFFDE7E5D);
		map.put("poop", 0xFF7F5E00);
		map.put("umber", 0xFFB26400);
		map.put("light lavender", 0xFFDFC5FE);
		map.put("bright yellow", 0xFFFFFD01);
		map.put("golden yellow", 0xFFFEC615);
		map.put("dusty blue", 0xFF5A86AD);
		map.put("electric green", 0xFF21FC0D);
		map.put("lighter green", 0xFF75FD63);
		map.put("slate grey", 0xFF59656D);
		map.put("teal green", 0xFF25A36F);
		map.put("marine blue", 0xFF01386A);
		map.put("avocado", 0xFF90B134);
		map.put("terra cotta", 0xFFC9643B);
		map.put("dusty purple", 0xFF825F87);
		map.put("light maroon", 0xFFA24857);
		map.put("reddish", 0xFFC44240);
		map.put("dark lilac", 0xFF9C6DA5);
		map.put("dark periwinkle", 0xFF665FD1);
		map.put("bluish grey", 0xFF748B97);
		map.put("puke yellow", 0xFFC2BE0E);
		map.put("purplish", 0xFF94568C);
		map.put("ultramarine", 0xFF2000B1);
		map.put("barney purple", 0xFFA00498);
		map.put("forest", 0xFF0B5509);
		map.put("pea soup", 0xFF929901);
		map.put("brownish yellow", 0xFFC9B003);
		map.put("bright teal", 0xFF01F9C6);
		map.put("bluegreen", 0xFF017A79);
		map.put("green brown", 0xFF544E03);
		map.put("blurple", 0xFF5539CC);
		map.put("light sky blue", 0xFFC6FCFF);
		map.put("periwinkle blue", 0xFF8F99FB);
		map.put("pale violet", 0xFFCEAEFA);
		map.put("true blue", 0xFF010FCC);
		map.put("green grey", 0xFF77926F);
		map.put("grey brown", 0xFF7F7053);
		map.put("dark olive green", 0xFF3C4D03);
		map.put("apricot", 0xFFFFB16D);
		map.put("faded purple", 0xFF916E99);
		map.put("cerise", 0xFFDE0C62);
		map.put("khaki green", 0xFF728639);
		map.put("burnt red", 0xFF9F2305);
		map.put("light forest green", 0xFF4F9153);
		map.put("violet blue", 0xFF510AC9);
		map.put("pale lavender", 0xFFEECFFE);
		map.put("acid green", 0xFF8FFE09);
		map.put("purple grey", 0xFF866F85);
		map.put("lemon", 0xFFFDFF52);
		map.put("bright orange", 0xFFFF5B00);
		map.put("soft green", 0xFF6FC276);
		map.put("blush", 0xFFF29E8E);
		map.put("yellowish brown", 0xFF9B7A01);
		map.put("fluorescent green", 0xFF08FF08);
		map.put("electric purple", 0xFFAA23FF);
		map.put("steel", 0xFF738595);
		map.put("dull orange", 0xFFD8863B);
		map.put("muddy green", 0xFF657432);
		map.put("marigold", 0xFFFCC006);
		map.put("ocean", 0xFF017B92);
		map.put("light mauve", 0xFFC292A1);
		map.put("bordeaux", 0xFF7B002C);
		map.put("light blue green", 0xFF7EFBB3);
		map.put("yellowish", 0xFFFAEE66);
		map.put("snot green", 0xFF9DC100);
		map.put("light lime green", 0xFFB9FF66);
		map.put("drab green", 0xFF749551);
		map.put("faded blue", 0xFF658CBB);
		map.put("dark forest green", 0xFF002D04);
		map.put("hot purple", 0xFFCB00F5);
		map.put("dark maroon", 0xFF3C0008);
		map.put("brown green", 0xFF706C11);
		map.put("swamp green", 0xFF748500);
		map.put("light indigo", 0xFF6D5ACF);
		map.put("purpley blue", 0xFF5F34E7);
		map.put("lightish blue", 0xFF3D7AFD);
		map.put("teal blue", 0xFF01889F);
		map.put("denim blue", 0xFF3B5B92);
		map.put("dark lime green", 0xFF7EBD01);
		map.put("dull yellow", 0xFFEEDC5B);
		map.put("pistachio", 0xFFC0FA8B);
		map.put("lemon yellow", 0xFFFDFF38);
		map.put("red violet", 0xFF9E0168);
		map.put("dusky pink", 0xFFCC7A8B);
		map.put("dirt", 0xFF8A6E45);
		map.put("very dark green", 0xFF062E03);
		map.put("medium purple", 0xFF9E43A2);
		map.put("shit", 0xFF7F5F00);
		map.put("dark mustard", 0xFFA88905);
		map.put("pea soup green", 0xFF94A617);
		map.put("bubblegum pink", 0xFFFE83CC);
		map.put("barbie pink", 0xFFFE46A5);
		map.put("military green", 0xFF667C3E);
		map.put("pale teal", 0xFF82CBB2);
		map.put("bronze", 0xFFA87900);
		map.put("pinky red", 0xFFFC2647);
		map.put("dull red", 0xFFBB3F3F);
		map.put("darkish blue", 0xFF014182);
		map.put("bluish", 0xFF2976BB);
		map.put("dark gold", 0xFFB59410);
		map.put("yellowy green", 0xFFBFF128);
		map.put("pine", 0xFF2B5D34);
		map.put("dark blue green", 0xFF005249);
		map.put("dirty pink", 0xFFCA7B80);
		map.put("slate green", 0xFF658D6D);
		map.put("prussian blue", 0xFF004577);
		map.put("bright violet", 0xFFAD0AFD);
		map.put("lighter purple", 0xFFA55AF4);
		map.put("steel grey", 0xFF6F828A);
		map.put("russet", 0xFFA13905);
		map.put("vermillion", 0xFFF4320C);
		map.put("greyish brown", 0xFF7A6A4F);
		map.put("red purple", 0xFF820747);
		map.put("red pink", 0xFFFA2A55);
		map.put("bright turquoise", 0xFF0FFEF9);
		map.put("golden brown", 0xFFB27A01);
		map.put("cerulean blue", 0xFF056EEE);
		map.put("soft blue", 0xFF6488EA);
		map.put("easter green", 0xFF8CFD7E);
		map.put("amber", 0xFFFEB308);
		map.put("mid blue", 0xFF276AB3);
		map.put("shit brown", 0xFF7B5804);
		map.put("hospital green", 0xFF9BE5AA);
		map.put("purpleish blue", 0xFF6140EF);
		map.put("purply blue", 0xFF661AEE);
		map.put("silver", 0xFFC5C9C7);
		map.put("sickly green", 0xFF94B21C);
		map.put("melon", 0xFFFF7855);
		map.put("dusky rose", 0xFFBA6873);
		map.put("brown orange", 0xFFB96902);
		map.put("darkish green", 0xFF287C37);
		map.put("cranberry", 0xFF9E003A);
		map.put("purpleish", 0xFF98568D);
		map.put("ecru", 0xFFFEFFCA);
		map.put("mocha", 0xFF9D7651);
		map.put("bright magenta", 0xFFFF08E8);
		map.put("coffee", 0xFFA6814C);
		map.put("sepia", 0xFF985E2B);
		map.put("faded red", 0xFFD3494E);
		map.put("canary yellow", 0xFFFFFE40);
		map.put("bluey purple", 0xFF6241C7);
		map.put("pastel yellow", 0xFFFFFE71);
		map.put("pale turquoise", 0xFFA5FBD5);
		map.put("greyish pink", 0xFFC88D94);
		map.put("marine", 0xFF042E60);
		map.put("purplish grey", 0xFF7A687F);
		map.put("camel", 0xFFC69F59);
		map.put("brownish grey", 0xFF86775F);
		map.put("burnt yellow", 0xFFD5AB09);
		map.put("cherry red", 0xFFF7022A);
		map.put("orangey brown", 0xFFB16002);
		map.put("soft pink", 0xFFFDB0C0);
		map.put("dark sea green", 0xFF11875D);
		map.put("aqua marine", 0xFF2EE8BB);
		map.put("robin egg blue", 0xFF8AF1FE);
		map.put("light sea green", 0xFF98F6B0);
		map.put("mud brown", 0xFF60460F);
		map.put("sandstone", 0xFFC9AE74);
		map.put("british racing green", 0xFF05480D);
		map.put("faded pink", 0xFFDE9DAC);
		map.put("maize", 0xFFF4D054);
		map.put("ocre", 0xFFC69C04);
		map.put("orange yellow", 0xFFFFAD01);
		map.put("dark khaki", 0xFF9B8F55);
		map.put("light lime", 0xFFAEFD6C);
		map.put("bright light blue", 0xFF26F7FD);
		map.put("jade green", 0xFF2BAF6A);
		map.put("barney", 0xFFAC1DB8);
		map.put("adobe", 0xFFBD6C48);
		map.put("minty green", 0xFF0BF77D);
		map.put("light navy blue", 0xFF2E5A88);
		map.put("dusty green", 0xFF76A973);
		map.put("very dark blue", 0xFF000133);
		map.put("ocean green", 0xFF3D9973);
		map.put("mustard green", 0xFFA8B504);
		map.put("poop brown", 0xFF7A5901);
		map.put("olive brown", 0xFF645403);
		map.put("pink red", 0xFFF5054F);
		map.put("light navy", 0xFF155084);
		map.put("very light purple", 0xFFF6CEFC);
		map.put("ivory", 0xFFFFFFCB);
		map.put("bright lavender", 0xFFC760FF);
		map.put("bright aqua", 0xFF0BF9EA);
		map.put("robin's egg", 0xFF6DEDFD);
		map.put("muted green", 0xFF5FA052);
		map.put("medium brown", 0xFF7F5112);
		map.put("copper", 0xFFB66325);
		map.put("dark lime", 0xFF84B701);
		map.put("strawberry", 0xFFFB2943);
		map.put("dirt brown", 0xFF836539);
		map.put("celery", 0xFFC1FD95);
		map.put("bright sky blue", 0xFF02CCFE);
		map.put("poo brown", 0xFF885F01);
		map.put("pinkish brown", 0xFFB17261);
		map.put("celadon", 0xFFBEFDB7);
		map.put("bright lime green", 0xFF65FE08);
		map.put("auburn", 0xFF9A3001);
		map.put("shocking pink", 0xFFFE02A2);
		map.put("mulberry", 0xFF920A4E);
		map.put("carolina blue", 0xFF8AB8FE);
		map.put("lightish green", 0xFF61E160);
		map.put("light lilac", 0xFFEDC8FF);
		map.put("pale olive", 0xFFB9CC81);
		map.put("pumpkin orange", 0xFFFB7D07);
		map.put("yellow ochre", 0xFFCB9D06);
		map.put("fire engine red", 0xFFFE0002);
		map.put("deep sky blue", 0xFF0D75F8);
		map.put("watermelon", 0xFFFD4659);
		map.put("bottle green", 0xFF044A05);
		map.put("very dark purple", 0xFF2A0134);
		map.put("wheat", 0xFFFBDD7E);
		map.put("murky green", 0xFF6C7A0E);
		map.put("brownish purple", 0xFF76424E);
		map.put("kermit green", 0xFF5CB200);
		map.put("primary blue", 0xFF0804F9);
		map.put("orangey red", 0xFFFA4224);
		map.put("pale lilac", 0xFFE4CBFF);
		map.put("rust red", 0xFFAA2704);
		map.put("dirty orange", 0xFFC87606);
		map.put("pinkish grey", 0xFFC8ACA9);
		map.put("light plum", 0xFF9D5783);
		map.put("greeny blue", 0xFF42B395);
		map.put("dark navy", 0xFF000435);
		map.put("pink/purple", 0xFFEF1DE7);
		map.put("irish green", 0xFF019529);
		map.put("baby poop", 0xFF937C00);
		map.put("slime green", 0xFF99CC04);
		map.put("purplish red", 0xFFB0054B);
		map.put("rouge", 0xFFAB1239);
		map.put("light rose", 0xFFFFC5CB);
		map.put("drab", 0xFF828344);
		map.put("dark navy blue", 0xFF00022E);
		map.put("light yellow green", 0xFFCCFD7F);
		map.put("easter purple", 0xFFC071FE);
		map.put("snot", 0xFFACBB0D);
		map.put("light salmon", 0xFFFEA993);
		map.put("purpley pink", 0xFFC83CB9);
		map.put("poo", 0xFF8F7303);
		map.put("berry", 0xFF990F4B);
		map.put("medium grey", 0xFF7D7F7C);
		map.put("brown red", 0xFF922B05);
		map.put("blood", 0xFF770001);
		map.put("soft purple", 0xFFA66FB5);
		map.put("grey pink", 0xFFC3909B);
		map.put("bluey green", 0xFF2BB179);
		map.put("midnight", 0xFF03012D);
		map.put("dark indigo", 0xFF1F0954);
		map.put("warm grey", 0xFF978A84);
		map.put("sandy brown", 0xFFC4A661);
		map.put("cherry", 0xFFCF0234);
		map.put("blue/purple", 0xFF5A06EF);
		map.put("gunmetal", 0xFF536267);
		map.put("deep violet", 0xFF490648);
		map.put("tree green", 0xFF2A7E19);
		map.put("orangish brown", 0xFFB25F03);
		map.put("shamrock green", 0xFF02C14D);
		map.put("orangish red", 0xFFF43605);
		map.put("greeny yellow", 0xFFC6F808);
		map.put("ugly yellow", 0xFFD0C101);
		map.put("french blue", 0xFF436BAD);
		map.put("dusky purple", 0xFF895B7B);
		map.put("butter yellow", 0xFFFFFD74);
		map.put("light beige", 0xFFFFFEB6);
		map.put("golden", 0xFFF5BF03);
		map.put("dusky blue", 0xFF475F94);
		map.put("lightblue", 0xFF7BC8F6);
		map.put("purply pink", 0xFFF075E6);
		map.put("off green", 0xFF6BA353);
		map.put("ocher", 0xFFBF9B0C);
		map.put("milk chocolate", 0xFF7F4E1E);
		map.put("light peach", 0xFFFFD8B1);
		map.put("deep magenta", 0xFFA0025C);
		map.put("caramel", 0xFFAF6F09);
		map.put("greenish teal", 0xFF32BF84);
		map.put("pale lime", 0xFFBEFD73);
		map.put("purple red", 0xFF990147);
		map.put("blueberry", 0xFF464196);
		map.put("asparagus", 0xFF77AB56);
		map.put("pale grey", 0xFFFDFDFE);
		map.put("light grey blue", 0xFF9DBCD4);
		map.put("pale lime green", 0xFFB1FF65);
		map.put("grassy green", 0xFF419C03);
		map.put("mossy green", 0xFF638B27);
		map.put("earth", 0xFFA2653E);
		map.put("deep orange", 0xFFDC4D01);
		map.put("pale aqua", 0xFFB8FFEB);
		map.put("rose red", 0xFFBE013C);
		map.put("stone", 0xFFADA587);
		map.put("rusty orange", 0xFFCD5909);
		map.put("pea", 0xFFA4BF20);
		map.put("sick green", 0xFF9DB92C);
		map.put("chestnut", 0xFF742802);
		map.put("blue/green", 0xFF0F9B8E);
		map.put("amethyst", 0xFF9B5FC0);
		map.put("dark mint green", 0xFF20C073);
		map.put("pale rose", 0xFFFDC1C5);
		map.put("muted blue", 0xFF3B719F);
		map.put("fawn", 0xFFCFAF7B);
		map.put("buff", 0xFFFEF69E);
		map.put("turquoise green", 0xFF04F489);
		map.put("muddy brown", 0xFF886806);
		map.put("sea", 0xFF3C9992);
		map.put("tomato", 0xFFEF4026);
		map.put("carnation pink", 0xFFFF7FA7);
		map.put("banana", 0xFFFFFF7E);
		map.put("neon yellow", 0xFFCFFF04);
		map.put("greyish", 0xFFA8A495);
		map.put("mid green", 0xFF50A747);
		map.put("muted purple", 0xFF805B87);
		map.put("electric pink", 0xFFFF0490);
		map.put("sandy", 0xFFF1DA7A);
		map.put("ugly pink", 0xFFCD7584);
		map.put("turquoise blue", 0xFF06B1C4);
		map.put("light burgundy", 0xFFA8415B);
		map.put("greenish tan", 0xFFBCCB7A);
		map.put("dark mint", 0xFF48C072);
		map.put("light urple", 0xFFB36FF6);
		map.put("midnight purple", 0xFF280137);
		map.put("pinkish orange", 0xFFFF724C);
		map.put("pear", 0xFFCBF85F);
		map.put("dark plum", 0xFF3F012C);
		map.put("tealish", 0xFF24BCA8);
		map.put("perrywinkle", 0xFF8F8CE7);
		map.put("yellowish orange", 0xFFFFAB0F);
		map.put("pastel orange", 0xFFFF964F);
		map.put("iris", 0xFF6258C4);
		map.put("ultramarine blue", 0xFF1805DB);
		map.put("navy green", 0xFF35530A);
		map.put("seaweed", 0xFF18D17B);
		map.put("kiwi", 0xFF9CEF43);
		map.put("fluro green", 0xFF0AFF02);
		map.put("bright light green", 0xFF2DFE54);
		map.put("vivid green", 0xFF2FEF10);
		map.put("frog green", 0xFF58BC08);
		map.put("dull brown", 0xFF876E4B);
		map.put("dusk", 0xFF4E5481);
		map.put("mustard brown", 0xFFAC7E04);
		map.put("leafy green", 0xFF51B73B);
		map.put("cool blue", 0xFF4984B8);
		map.put("almost black", 0xFF070D0D);
		map.put("yellow/green", 0xFFC8FD3D);
		map.put("heliotrope", 0xFFD94FF5);
		map.put("green apple", 0xFF5EDC1F);
		map.put("baby poop green", 0xFF8F9805);
		map.put("apple", 0xFF6ECB3C);
		map.put("purpleish pink", 0xFFDF4EC8);
		map.put("night blue", 0xFF040348);
		map.put("merlot", 0xFF730039);
		map.put("lightgreen", 0xFF76FF7B);
		map.put("tomato red", 0xFFEC2D01);
		map.put("key lime", 0xFFAEFF6E);
		map.put("pale cyan", 0xFFB7FFFA);
		map.put("vomit yellow", 0xFFC7C10C);
		map.put("purplish brown", 0xFF6B4247);
		map.put("bubblegum", 0xFFFF6CB5);
		map.put("shamrock", 0xFF01B44C);
		map.put("mango", 0xFFFFA62B);
		map.put("lime yellow", 0xFFD0FE1D);
		map.put("hot green", 0xFF25FF29);
		map.put("grape purple", 0xFF5D1451);
		map.put("faded orange", 0xFFF0944D);
		map.put("avocado green", 0xFF87A922);
		map.put("peacock blue", 0xFF016795);
		map.put("weird green", 0xFF3AE57F);
		map.put("bright lilac", 0xFFC95EFB);
		map.put("fern green", 0xFF548D44);
		map.put("dirty blue", 0xFF3F829D);
		map.put("rust orange", 0xFFC45508);
		map.put("heather", 0xFFA484AC);
		map.put("deep teal", 0xFF00555A);
		map.put("dark seafoam", 0xFF1FB57A);
		map.put("baby poo", 0xFFAB9004);
		map.put("yellowgreen", 0xFFBBF90F);
		map.put("light sage", 0xFFBCECAC);
		map.put("light aquamarine", 0xFF7BFDC7);
		map.put("spearmint", 0xFF1EF876);
		map.put("bright lime", 0xFF87FD05);
		map.put("vibrant green", 0xFF0ADD08);
		map.put("very pale green", 0xFFCFFDBC);
		map.put("faded yellow", 0xFFFEFF7F);
		map.put("bile", 0xFFB5C306);
		map.put("viridian", 0xFF1E9167);
		map.put("very light pink", 0xFFFFF4F2);
		map.put("puke brown", 0xFF947706);
		map.put("medium pink", 0xFFF36196);
		map.put("ugly purple", 0xFFA442A0);
		map.put("sunshine yellow", 0xFFFFFD37);
		map.put("seaweed green", 0xFF35AD6B);
		map.put("light periwinkle", 0xFFC1C6FC);
		map.put("lemon green", 0xFFADF802);
		map.put("greeny brown", 0xFF696006);
		map.put("dark grey blue", 0xFF29465B);
		map.put("bright olive", 0xFF9CBB04);
		map.put("turtle green", 0xFF75B84F);
		map.put("pale sky blue", 0xFFBDF6FE);
		map.put("light mustard", 0xFFF7D560);
		map.put("diarrhea", 0xFF9F8303);
		map.put("dark aquamarine", 0xFF017371);
		map.put("brownish pink", 0xFFC27E79);
		map.put("baby shit green", 0xFF889717);
		map.put("purpley", 0xFF8756E4);
		map.put("greyblue", 0xFF77A1B5);
		map.put("hot magenta", 0xFFF504C9);
		map.put("blue/grey", 0xFF758DA3);
		map.put("pale", 0xFFFFF9D0);
		map.put("cool green", 0xFF33B864);
		map.put("sandy yellow", 0xFFFDEE73);
		map.put("eggshell blue", 0xFFC4FFF7);
		map.put("barf green", 0xFF94AC02);
		map.put("baby green", 0xFF8CFF9E);
		map.put("vibrant purple", 0xFFAD03DE);
		map.put("brown grey", 0xFF8D8468);
		map.put("water blue", 0xFF0E87CC);
		map.put("lipstick red", 0xFFC0022F);
		map.put("banana yellow", 0xFFFAFE4B);
		map.put("wisteria", 0xFFA87DC2);
		map.put("purple brown", 0xFF673A3F);
		map.put("brown yellow", 0xFFB29705);
		map.put("purple/pink", 0xFFD725DE);
		map.put("lemon lime", 0xFFBFFE28);
		map.put("grey/blue", 0xFF647D8E);
		map.put("dusty red", 0xFFB9484E);
		map.put("deep rose", 0xFFC74767);
		map.put("dark seafoam green", 0xFF3EAF76);
		map.put("muddy yellow", 0xFFBFAC05);
		map.put("carnation", 0xFFFD798F);
		map.put("yellowy brown", 0xFFAE8B0C);
		map.put("violet red", 0xFFA50055);
		map.put("twilight blue", 0xFF0A437A);
		map.put("pure blue", 0xFF0203E2);
		map.put("lightish red", 0xFFFE2F4A);
		map.put("brick orange", 0xFFC14A09);
		map.put("velvet", 0xFF750851);
		map.put("sunflower", 0xFFFFC512);
		map.put("light mint green", 0xFFA6FBB2);
		map.put("light grass green", 0xFF9AF764);
		map.put("lavender blue", 0xFF8B88F8);
		map.put("rusty red", 0xFFAF2F0D);
		map.put("lightish purple", 0xFFA552E6);
		map.put("dried blood", 0xFF4B0101);
		map.put("light blue grey", 0xFFB7C9E2);
		map.put("leaf", 0xFF71AA34);
		map.put("orangish", 0xFFFC824A);
		map.put("pale olive green", 0xFFB1D27B);
		map.put("off yellow", 0xFFF1F33F);
		map.put("dusty orange", 0xFFF0833A);
		map.put("butter", 0xFFFFFF81);
		map.put("royal", 0xFF0C1793);
		map.put("petrol", 0xFF005F6A);
		map.put("greenish cyan", 0xFF2AFEB7);
		map.put("duck egg blue", 0xFFC3FBF4);
		map.put("bubble gum pink", 0xFFFF69AF);
		map.put("bluegrey", 0xFF85A3B2);
		map.put("warm brown", 0xFF964E02);
		map.put("twilight", 0xFF4E518B);
		map.put("saffron", 0xFFFEB209);
		map.put("purple/blue", 0xFF5D21D0);
		map.put("dark sand", 0xFFA88F59);
		map.put("vibrant blue", 0xFF0339F8);
		map.put("putty", 0xFFBEAE8A);
		map.put("lawn green", 0xFF4DA409);
		map.put("camouflage green", 0xFF4B6113);
		map.put("blush pink", 0xFFFE828C);
		map.put("reddy brown", 0xFF6E1005);
		map.put("darkish red", 0xFFA90308);
		map.put("algae green", 0xFF21C36F);
		map.put("dark coral", 0xFFCF524E);
		map.put("bright cyan", 0xFF41FDFE);
		map.put("piss yellow", 0xFFDDD618);
		map.put("pastel red", 0xFFDB5856);
		map.put("greenish turquoise", 0xFF00FBB0);
		map.put("dark", 0xFF1B2431);
		map.put("ruby", 0xFFCA0147);
		map.put("poop green", 0xFF6F7C00);
		map.put("orangered", 0xFFFE420F);
		map.put("dandelion", 0xFFFEDF08);
		map.put("claret", 0xFF680018);
		map.put("pale mauve", 0xFFFED0FC);
		map.put("lipstick", 0xFFD5174E);
		map.put("rosa", 0xFFFE86A4);
		map.put("darkblue", 0xFF030764);
		map.put("tan brown", 0xFFAB7E4C);
		map.put("shit green", 0xFF758000);
		map.put("red wine", 0xFF8C0034);
		map.put("pinky", 0xFFFC86AA);
		map.put("mud green", 0xFF606602);
		map.put("light greenish blue", 0xFF63F7B4);
		map.put("dull teal", 0xFF5F9E8F);
		map.put("deep lavender", 0xFF8D5EB7);
		map.put("vivid blue", 0xFF152EFF);
		map.put("raw umber", 0xFFA75E09);
		map.put("light mint", 0xFFB6FFBB);
		map.put("light light blue", 0xFFCAFFFB);
		map.put("highlighter green", 0xFF1BFC06);
		map.put("greeny grey", 0xFF7EA07A);
		map.put("bluey grey", 0xFF89A0B0);
		map.put("algae", 0xFF54AC68);
		map.put("sap green", 0xFF5C8B15);
		map.put("pale salmon", 0xFFFFB19A);
		map.put("metallic blue", 0xFF4F738E);
		map.put("ice", 0xFFD6FFFA);
		map.put("gross green", 0xFFA0BF16);
		map.put("dodger blue", 0xFF3E82FC);
		map.put("warm pink", 0xFFFB5581);
		map.put("light green blue", 0xFF56FCA2);
		map.put("flat green", 0xFF699D4C);
		map.put("dark blue grey", 0xFF1F3B4D);
		map.put("clay brown", 0xFFB2713D);
		map.put("sand yellow", 0xFFFCE166);
		map.put("grapefruit", 0xFFFD5956);
		map.put("blood orange", 0xFFFE4B03);
		map.put("very pale blue", 0xFFD6FFFE);
		map.put("old pink", 0xFFC77986);
		map.put("neon red", 0xFFFF073A);
		map.put("golden rod", 0xFFF9BC08);
		map.put("plum purple", 0xFF4E0550);
		map.put("pale peach", 0xFFFFE5AD);
		map.put("dark yellow green", 0xFF728F02);
		map.put("carmine", 0xFF9D0216);
		map.put("deep sea blue", 0xFF015482);
		map.put("dark hot pink", 0xFFD90166);
		map.put("warm blue", 0xFF4B57DB);
		map.put("light khaki", 0xFFE6F2A2);
		map.put("icky green", 0xFF8FAE22);
		map.put("greenblue", 0xFF23C48B);
		map.put("dirty purple", 0xFF734A65);
		map.put("rich blue", 0xFF021BF9);
		map.put("mushroom", 0xFFBA9E88);
		map.put("flat blue", 0xFF3C73A8);
		map.put("dark slate blue", 0xFF214761);
		map.put("dark sage", 0xFF598556);
		map.put("coral pink", 0xFFFF6163);
		map.put("true green", 0xFF089404);
		map.put("darkish purple", 0xFF751973);
		map.put("dark taupe", 0xFF7F684E);
		map.put("cool grey", 0xFF95A3A6);
		map.put("canary", 0xFFFDFF63);
		map.put("booger green", 0xFF96B403);
		map.put("muted pink", 0xFFD1768F);
		map.put("hazel", 0xFF8E7618);
		map.put("dark royal blue", 0xFF02066F);
		map.put("vivid purple", 0xFF9900FA);
		map.put("racing green", 0xFF014600);
		map.put("leather", 0xFFAC7434);
		map.put("green/blue", 0xFF01C08D);
		map.put("sunflower yellow", 0xFFFFDA03);
		map.put("rich purple", 0xFF720058);
		map.put("pale magenta", 0xFFD767AD);
		map.put("light yellowish green", 0xFFC2FF89);
		map.put("indigo blue", 0xFF3A18B1);
		map.put("dark fuchsia", 0xFF9D0759);
		map.put("yellow tan", 0xFFFFE36E);
		map.put("wintergreen", 0xFF20F986);
		map.put("violet pink", 0xFFFB5FFC);
		map.put("topaz", 0xFF13BBAF);
		map.put("seafoam blue", 0xFF78D1B6);
		map.put("light gold", 0xFFFDDC5C);
		map.put("grey/green", 0xFF86A17D);
		map.put("foam green", 0xFF90FDA9);
		map.put("creme", 0xFFFFFFB6);
		map.put("clear blue", 0xFF247AFD);
		map.put("ugly blue", 0xFF31668A);
		map.put("terracota", 0xFFCB6843);
		map.put("very dark brown", 0xFF1D0200);
		map.put("straw", 0xFFFCF679);
		map.put("parchment", 0xFFFEFCAF);
		map.put("orangey yellow", 0xFFFDB915);
		map.put("greyish teal", 0xFF719F91);
		map.put("sapphire", 0xFF2138AB);
		map.put("nice blue", 0xFF107AB0);
		map.put("browny orange", 0xFFCA6B02);
		map.put("washed out green", 0xFFBCF5A6);
		map.put("tiffany blue", 0xFF7BF2DA);
		map.put("light seafoam", 0xFFA0FEBF);
		map.put("light neon green", 0xFF4EFD54);
		map.put("light bright green", 0xFF53FE5C);
		map.put("light bluish green", 0xFF76FDA8);
		map.put("rosy pink", 0xFFF6688E);
		map.put("peachy pink", 0xFFFF9A8A);
		map.put("pale light green", 0xFFB1FC99);
		map.put("old rose", 0xFFC87F89);
		map.put("fern", 0xFF63A950);
		map.put("dusk blue", 0xFF26538D);
		map.put("camo", 0xFF7F8F4E);
		map.put("burnt siena", 0xFFB75203);
		map.put("tealish green", 0xFF0CDC73);
		map.put("swamp", 0xFF698339);
		map.put("sand brown", 0xFFCBA560);
		map.put("rust brown", 0xFF8B3103);
		map.put("orangeish", 0xFFFD8D49);
		map.put("light royal blue", 0xFF3A2EFE);
		map.put("cocoa", 0xFF875F42);
		map.put("baby purple", 0xFFCA9BF7);
		map.put("raw sienna", 0xFF9A6200);
		map.put("radioactive green", 0xFF2CFA1F);
		map.put("light pea green", 0xFFC4FE82);
		map.put("cinnamon", 0xFFAC4F06);
		map.put("squash", 0xFFF2AB15);
		map.put("charcoal grey", 0xFF3C4142);
		map.put("bright yellow green", 0xFF9DFF00);
		map.put("baby puke green", 0xFFB6C406);
		map.put("poison green", 0xFF40FD14);
		map.put("light lavendar", 0xFFEFC0FE);
		map.put("indian red", 0xFF850E04);
		map.put("dark cream", 0xFFFFF39A);
		map.put("toupe", 0xFFC7AC7D);
		map.put("butterscotch", 0xFFFDB147);
		map.put("burple", 0xFF6832E3);
		map.put("tan green", 0xFFA9BE70);
		map.put("sun yellow", 0xFFFFDF22);
		map.put("pale gold", 0xFFFDDE6C);
		map.put("light light green", 0xFFC8FFB0);
		map.put("lichen", 0xFF8FB67B);
		map.put("green/yellow", 0xFFB5CE08);
		map.put("darkgreen", 0xFF054907);
		map.put("azul", 0xFF1D5DEC);
		map.put("sunny yellow", 0xFFFFF917);
		map.put("sickly yellow", 0xFFD0E429);
		map.put("kelley green", 0xFF009337);
		map.put("bruise", 0xFF7E4071);
		map.put("browny green", 0xFF6F6C0A);
		map.put("battleship grey", 0xFF6B7C85);
		map.put("off blue", 0xFF5684AE);
		map.put("manilla", 0xFFFFFA86);
		map.put("greenish beige", 0xFFC9D179);
		map.put("deep brown", 0xFF410200);
		map.put("darkish pink", 0xFFDA467D);
		map.put("custard", 0xFFFFFD78);
		map.put("ugly brown", 0xFF7D7103);
		map.put("stormy blue", 0xFF507B9C);
		map.put("liliac", 0xFFC48EFD);
		map.put("baby shit brown", 0xFFAD900D);
		map.put("reddish grey", 0xFF997570);
		map.put("powder pink", 0xFFFFB2D0);
		map.put("eggplant purple", 0xFF430541);
		map.put("egg shell", 0xFFFFFCC4);
		map.put("very light brown", 0xFFD3B683);
		map.put("tea green", 0xFFBDF8A3);
		map.put("orange pink", 0xFFFF6F52);
		map.put("light grey green", 0xFFB7E1A1);
		map.put("kiwi green", 0xFF8EE53F);
		map.put("boring green", 0xFF63B365);
		map.put("light pastel green", 0xFFB2FBA5);
		map.put("candy pink", 0xFFFF63E9);
		map.put("purply", 0xFF983FB2);
		map.put("purpley grey", 0xFF947E94);
		map.put("dusty lavender", 0xFFAC86A8);
		map.put("desert", 0xFFCCAD60);
		map.put("deep lilac", 0xFF966EBD);
		map.put("pig pink", 0xFFE78EA5);
		map.put("olive yellow", 0xFFC2B709);
		map.put("light seafoam green", 0xFFA7FFB5);
		map.put("light moss green", 0xFFA6C875);
		map.put("lavender pink", 0xFFDD85D7);
		map.put("deep aqua", 0xFF08787F);
		map.put("bland", 0xFFAFA88B);
		map.put("strong pink", 0xFFFF0789);
		map.put("green teal", 0xFF0CB577);
		map.put("deep turquoise", 0xFF017374);
		map.put("dark green blue", 0xFF1F6357);
		map.put("bright sea green", 0xFF05FFA6);
		map.put("booger", 0xFF9BB53C);
		map.put("blue with a hint of purple", 0xFF533CC6);
		map.put("blue blue", 0xFF2242C7);
		map.put("windows blue", 0xFF3778BF);
		map.put("toxic green", 0xFF61DE2A);
		map.put("strong blue", 0xFF0C06F7);
		map.put("spruce", 0xFF0A5F38);
		map.put("pinkish tan", 0xFFD99B82);
		map.put("macaroni and cheese", 0xFFEFB435);
		map.put("grey teal", 0xFF5E9B8A);
		map.put("dusty teal", 0xFF4C9085);
		map.put("dark grass green", 0xFF388004);
		map.put("cement", 0xFFA5A391);
		map.put("yellowish tan", 0xFFFCFC81);
		map.put("warm purple", 0xFF952E8F);
		map.put("tea", 0xFF65AB7C);
		map.put("really light blue", 0xFFD4FFFF);
		map.put("nasty green", 0xFF70B23F);
		map.put("light eggplant", 0xFF894585);
		map.put("fresh green", 0xFF69D84F);
		map.put("electric lime", 0xFFA8FF04);
		map.put("dust", 0xFFB2996E);
		map.put("dark pastel green", 0xFF56AE57);
		map.put("cloudy blue", 0xFFACC2D9);
		XKCD_COLORS = Collections.unmodifiableMap(map);
	}
	
	public static int parse(String name) {
		name = name.replaceAll("[^A-Za-z0-9/']+", " ").trim().toLowerCase();
		if (XKCD_COLORS.containsKey(name)) {
			return XKCD_COLORS.get(name);
		} else {
			return 0;
		}
	}
}