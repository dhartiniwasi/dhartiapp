package p092m2;

import p037e2.C4230x;
import p127r2.C5432a;
import p160w2.C5891a;
import p160w2.C5899e;
import p160w2.C5906i;
import p160w2.C5907j;
import p160w2.C5913m;
import p161w3.C5918a0;
import p161w3.C5961r;
import p166x2.C6042a;
import p177z1.C6272r1;

/* renamed from: m2.h */
/* compiled from: MetadataUtil */
final class C5020h {

    /* renamed from: a */
    static final String[] f26296a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: a */
    private static C5899e m31664a(int i, C5918a0 a0Var) {
        int m = a0Var.mo20560m();
        if (a0Var.mo20560m() == 1684108385) {
            a0Var.mo20547P(8);
            String x = a0Var.mo20571x(m - 16);
            return new C5899e("und", x, x);
        }
        C5961r.m35215i("MetadataUtil", "Failed to parse comment attribute: " + C5002a.m31553a(i));
        return null;
    }

    /* renamed from: b */
    private static C5891a m31665b(C5918a0 a0Var) {
        int m = a0Var.mo20560m();
        if (a0Var.mo20560m() == 1684108385) {
            int b = C5002a.m31554b(a0Var.mo20560m());
            String str = b == 13 ? "image/jpeg" : b == 14 ? "image/png" : null;
            if (str == null) {
                C5961r.m35215i("MetadataUtil", "Unrecognized cover art flags: " + b);
                return null;
            }
            a0Var.mo20547P(4);
            int i = m - 16;
            byte[] bArr = new byte[i];
            a0Var.mo20557j(bArr, 0, i);
            return new C5891a(str, (String) null, 3, bArr);
        }
        C5961r.m35215i("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    /* renamed from: c */
    public static C5432a.C5434b m31666c(C5918a0 a0Var) {
        int e = a0Var.mo20552e() + a0Var.mo20560m();
        int m = a0Var.mo20560m();
        int i = (m >> 24) & 255;
        if (i == 169 || i == 253) {
            int i2 = 16777215 & m;
            if (i2 == 6516084) {
                C5899e a = m31664a(m, a0Var);
                a0Var.mo20546O(e);
                return a;
            } else if (i2 == 7233901 || i2 == 7631467) {
                C5913m h = m31671h(m, "TIT2", a0Var);
                a0Var.mo20546O(e);
                return h;
            } else if (i2 == 6516589 || i2 == 7828084) {
                C5913m h2 = m31671h(m, "TCOM", a0Var);
                a0Var.mo20546O(e);
                return h2;
            } else if (i2 == 6578553) {
                C5913m h3 = m31671h(m, "TDRC", a0Var);
                a0Var.mo20546O(e);
                return h3;
            } else if (i2 == 4280916) {
                C5913m h4 = m31671h(m, "TPE1", a0Var);
                a0Var.mo20546O(e);
                return h4;
            } else if (i2 == 7630703) {
                C5913m h5 = m31671h(m, "TSSE", a0Var);
                a0Var.mo20546O(e);
                return h5;
            } else if (i2 == 6384738) {
                C5913m h6 = m31671h(m, "TALB", a0Var);
                a0Var.mo20546O(e);
                return h6;
            } else if (i2 == 7108978) {
                C5913m h7 = m31671h(m, "USLT", a0Var);
                a0Var.mo20546O(e);
                return h7;
            } else if (i2 == 6776174) {
                C5913m h8 = m31671h(m, "TCON", a0Var);
                a0Var.mo20546O(e);
                return h8;
            } else if (i2 == 6779504) {
                C5913m h9 = m31671h(m, "TIT1", a0Var);
                a0Var.mo20546O(e);
                return h9;
            }
        } else if (m == 1735291493) {
            try {
                return m31670g(a0Var);
            } finally {
                a0Var.mo20546O(e);
            }
        } else if (m == 1684632427) {
            C5913m d = m31667d(m, "TPOS", a0Var);
            a0Var.mo20546O(e);
            return d;
        } else if (m == 1953655662) {
            C5913m d2 = m31667d(m, "TRCK", a0Var);
            a0Var.mo20546O(e);
            return d2;
        } else if (m == 1953329263) {
            C5906i i3 = m31672i(m, "TBPM", a0Var, true, false);
            a0Var.mo20546O(e);
            return i3;
        } else if (m == 1668311404) {
            C5906i i4 = m31672i(m, "TCMP", a0Var, true, true);
            a0Var.mo20546O(e);
            return i4;
        } else if (m == 1668249202) {
            C5891a b = m31665b(a0Var);
            a0Var.mo20546O(e);
            return b;
        } else if (m == 1631670868) {
            C5913m h10 = m31671h(m, "TPE2", a0Var);
            a0Var.mo20546O(e);
            return h10;
        } else if (m == 1936682605) {
            C5913m h11 = m31671h(m, "TSOT", a0Var);
            a0Var.mo20546O(e);
            return h11;
        } else if (m == 1936679276) {
            C5913m h12 = m31671h(m, "TSO2", a0Var);
            a0Var.mo20546O(e);
            return h12;
        } else if (m == 1936679282) {
            C5913m h13 = m31671h(m, "TSOA", a0Var);
            a0Var.mo20546O(e);
            return h13;
        } else if (m == 1936679265) {
            C5913m h14 = m31671h(m, "TSOP", a0Var);
            a0Var.mo20546O(e);
            return h14;
        } else if (m == 1936679791) {
            C5913m h15 = m31671h(m, "TSOC", a0Var);
            a0Var.mo20546O(e);
            return h15;
        } else if (m == 1920233063) {
            C5906i i5 = m31672i(m, "ITUNESADVISORY", a0Var, false, false);
            a0Var.mo20546O(e);
            return i5;
        } else if (m == 1885823344) {
            C5906i i6 = m31672i(m, "ITUNESGAPLESS", a0Var, false, true);
            a0Var.mo20546O(e);
            return i6;
        } else if (m == 1936683886) {
            C5913m h16 = m31671h(m, "TVSHOWSORT", a0Var);
            a0Var.mo20546O(e);
            return h16;
        } else if (m == 1953919848) {
            C5913m h17 = m31671h(m, "TVSHOW", a0Var);
            a0Var.mo20546O(e);
            return h17;
        } else if (m == 757935405) {
            C5906i e2 = m31668e(a0Var, e);
            a0Var.mo20546O(e);
            return e2;
        }
        C5961r.m35208b("MetadataUtil", "Skipped unknown metadata entry: " + C5002a.m31553a(m));
        a0Var.mo20546O(e);
        return null;
    }

    /* renamed from: d */
    private static C5913m m31667d(int i, String str, C5918a0 a0Var) {
        int m = a0Var.mo20560m();
        if (a0Var.mo20560m() == 1684108385 && m >= 22) {
            a0Var.mo20547P(10);
            int I = a0Var.mo20540I();
            if (I > 0) {
                String str2 = "" + I;
                int I2 = a0Var.mo20540I();
                if (I2 > 0) {
                    str2 = str2 + "/" + I2;
                }
                return new C5913m(str, (String) null, str2);
            }
        }
        C5961r.m35215i("MetadataUtil", "Failed to parse index/count attribute: " + C5002a.m31553a(i));
        return null;
    }

    /* renamed from: e */
    private static C5906i m31668e(C5918a0 a0Var, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (a0Var.mo20552e() < i) {
            int e = a0Var.mo20552e();
            int m = a0Var.mo20560m();
            int m2 = a0Var.mo20560m();
            a0Var.mo20547P(4);
            if (m2 == 1835360622) {
                str = a0Var.mo20571x(m - 12);
            } else if (m2 == 1851878757) {
                str2 = a0Var.mo20571x(m - 12);
            } else {
                if (m2 == 1684108385) {
                    i2 = e;
                    i3 = m;
                }
                a0Var.mo20547P(m - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        a0Var.mo20546O(i2);
        a0Var.mo20547P(16);
        return new C5907j(str, str2, a0Var.mo20571x(i3 - 16));
    }

    /* renamed from: f */
    public static C6042a m31669f(C5918a0 a0Var, int i, String str) {
        while (true) {
            int e = a0Var.mo20552e();
            if (e >= i) {
                return null;
            }
            int m = a0Var.mo20560m();
            if (a0Var.mo20560m() == 1684108385) {
                int m2 = a0Var.mo20560m();
                int m3 = a0Var.mo20560m();
                int i2 = m - 16;
                byte[] bArr = new byte[i2];
                a0Var.mo20557j(bArr, 0, i2);
                return new C6042a(str, bArr, m3, m2);
            }
            a0Var.mo20546O(e + m);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p160w2.C5913m m31670g(p161w3.C5918a0 r3) {
        /*
            int r3 = m31673j(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = f26296a
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            w2.m r1 = new w2.m
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            p161w3.C5961r.m35215i(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p092m2.C5020h.m31670g(w3.a0):w2.m");
    }

    /* renamed from: h */
    private static C5913m m31671h(int i, String str, C5918a0 a0Var) {
        int m = a0Var.mo20560m();
        if (a0Var.mo20560m() == 1684108385) {
            a0Var.mo20547P(8);
            return new C5913m(str, (String) null, a0Var.mo20571x(m - 16));
        }
        C5961r.m35215i("MetadataUtil", "Failed to parse text attribute: " + C5002a.m31553a(i));
        return null;
    }

    /* renamed from: i */
    private static C5906i m31672i(int i, String str, C5918a0 a0Var, boolean z, boolean z2) {
        int j = m31673j(a0Var);
        if (z2) {
            j = Math.min(1, j);
        }
        if (j < 0) {
            C5961r.m35215i("MetadataUtil", "Failed to parse uint8 attribute: " + C5002a.m31553a(i));
            return null;
        } else if (z) {
            return new C5913m(str, (String) null, Integer.toString(j));
        } else {
            return new C5899e("und", str, Integer.toString(j));
        }
    }

    /* renamed from: j */
    private static int m31673j(C5918a0 a0Var) {
        a0Var.mo20547P(4);
        if (a0Var.mo20560m() == 1684108385) {
            a0Var.mo20547P(8);
            return a0Var.mo20534C();
        }
        C5961r.m35215i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: k */
    public static void m31674k(int i, C4230x xVar, C6272r1.C6274b bVar) {
        if (i == 1 && xVar.mo17592a()) {
            bVar.mo21500N(xVar.f23585a).mo21501O(xVar.f23586b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r6 != null) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[LOOP:1: B:17:0x003e->B:18:0x0040, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m31675l(int r5, p127r2.C5432a r6, p127r2.C5432a r7, p177z1.C6272r1.C6274b r8, p127r2.C5432a... r9) {
        /*
            r2.a r0 = new r2.a
            r1 = 0
            r2.a$b[] r2 = new p127r2.C5432a.C5434b[r1]
            r0.<init>((p127r2.C5432a.C5434b[]) r2)
            r2 = 1
            if (r5 != r2) goto L_0x000e
            if (r6 == 0) goto L_0x003c
            goto L_0x003d
        L_0x000e:
            r6 = 2
            if (r5 != r6) goto L_0x003c
            if (r7 == 0) goto L_0x003c
            r5 = 0
        L_0x0014:
            int r6 = r7.mo19696d()
            if (r5 >= r6) goto L_0x003c
            r2.a$b r6 = r7.mo19695c(r5)
            boolean r3 = r6 instanceof p166x2.C6042a
            if (r3 == 0) goto L_0x0039
            x2.a r6 = (p166x2.C6042a) r6
            java.lang.String r3 = r6.f29309a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0039
            r2.a r5 = new r2.a
            r2.a$b[] r7 = new p127r2.C5432a.C5434b[r2]
            r7[r1] = r6
            r5.<init>((p127r2.C5432a.C5434b[]) r7)
            r6 = r5
            goto L_0x003d
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x0014
        L_0x003c:
            r6 = r0
        L_0x003d:
            int r5 = r9.length
        L_0x003e:
            if (r1 >= r5) goto L_0x0049
            r7 = r9[r1]
            r2.a r6 = r6.mo19694b(r7)
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0049:
            int r5 = r6.mo19696d()
            if (r5 <= 0) goto L_0x0052
            r8.mo21510X(r6)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p092m2.C5020h.m31675l(int, r2.a, r2.a, z1.r1$b, r2.a[]):void");
    }
}
