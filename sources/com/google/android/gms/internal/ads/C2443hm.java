package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.hm */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2443hm {

    /* renamed from: A */
    private static final int f10391A = C2893tq.m21176g("sosn");

    /* renamed from: B */
    private static final int f10392B = C2893tq.m21176g("tvsh");

    /* renamed from: C */
    private static final int f10393C = C2893tq.m21176g("----");

    /* renamed from: D */
    private static final String[] f10394D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    private static final int f10395a = C2893tq.m21176g("nam");

    /* renamed from: b */
    private static final int f10396b = C2893tq.m21176g("trk");

    /* renamed from: c */
    private static final int f10397c = C2893tq.m21176g("cmt");

    /* renamed from: d */
    private static final int f10398d = C2893tq.m21176g("day");

    /* renamed from: e */
    private static final int f10399e = C2893tq.m21176g("ART");

    /* renamed from: f */
    private static final int f10400f = C2893tq.m21176g("too");

    /* renamed from: g */
    private static final int f10401g = C2893tq.m21176g("alb");

    /* renamed from: h */
    private static final int f10402h = C2893tq.m21176g("com");

    /* renamed from: i */
    private static final int f10403i = C2893tq.m21176g("wrt");

    /* renamed from: j */
    private static final int f10404j = C2893tq.m21176g("lyr");

    /* renamed from: k */
    private static final int f10405k = C2893tq.m21176g("gen");

    /* renamed from: l */
    private static final int f10406l = C2893tq.m21176g("covr");

    /* renamed from: m */
    private static final int f10407m = C2893tq.m21176g("gnre");

    /* renamed from: n */
    private static final int f10408n = C2893tq.m21176g("grp");

    /* renamed from: o */
    private static final int f10409o = C2893tq.m21176g("disk");

    /* renamed from: p */
    private static final int f10410p = C2893tq.m21176g("trkn");

    /* renamed from: q */
    private static final int f10411q = C2893tq.m21176g("tmpo");

    /* renamed from: r */
    private static final int f10412r = C2893tq.m21176g("cpil");

    /* renamed from: s */
    private static final int f10413s = C2893tq.m21176g("aART");

    /* renamed from: t */
    private static final int f10414t = C2893tq.m21176g("sonm");

    /* renamed from: u */
    private static final int f10415u = C2893tq.m21176g("soal");

    /* renamed from: v */
    private static final int f10416v = C2893tq.m21176g("soar");

    /* renamed from: w */
    private static final int f10417w = C2893tq.m21176g("soaa");

    /* renamed from: x */
    private static final int f10418x = C2893tq.m21176g("soco");

    /* renamed from: y */
    private static final int f10419y = C2893tq.m21176g("rtng");

    /* renamed from: z */
    private static final int f10420z = C2893tq.m21176g("pgap");

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035 A[Catch:{ all -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[Catch:{ all -> 0x01d3 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.C2370fn m13919a(com.google.android.gms.internal.ads.C2633mq r13) {
        /*
            int r0 = r13.mo12392c()
            int r1 = r13.mo12394e()
            int r0 = r0 + r1
            int r1 = r13.mo12394e()
            int r2 = r1 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = "und"
            java.lang.String r4 = "TCON"
            java.lang.String r5 = "MetadataUtil"
            r6 = 0
            r7 = 169(0xa9, float:2.37E-43)
            if (r2 == r7) goto L_0x01d6
            int r2 = f10407m     // Catch:{ all -> 0x01d3 }
            r7 = -1
            if (r1 != r2) goto L_0x0045
            int r1 = m13920b(r13)     // Catch:{ all -> 0x01d3 }
            if (r1 <= 0) goto L_0x0032
            java.lang.String[] r2 = f10394D     // Catch:{ all -> 0x01d3 }
            int r3 = r2.length     // Catch:{ all -> 0x01d3 }
            r3 = 148(0x94, float:2.07E-43)
            if (r1 > r3) goto L_0x0032
            int r1 = r1 + r7
            r1 = r2[r1]     // Catch:{ all -> 0x01d3 }
            goto L_0x0033
        L_0x0032:
            r1 = r6
        L_0x0033:
            if (r1 == 0) goto L_0x003c
            com.google.android.gms.internal.ads.on r2 = new com.google.android.gms.internal.ads.on     // Catch:{ all -> 0x01d3 }
            r2.<init>(r4, r6, r1)     // Catch:{ all -> 0x01d3 }
            r6 = r2
            goto L_0x0041
        L_0x003c:
            java.lang.String r1 = "Failed to parse standard genre code"
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d3 }
        L_0x0041:
            r13.mo12411v(r0)
            return r6
        L_0x0045:
            int r2 = f10409o     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0053
            java.lang.String r2 = "TPOS"
            com.google.android.gms.internal.ads.on r1 = m13922d(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x0053:
            int r2 = f10410p     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0061
            java.lang.String r2 = "TRCK"
            com.google.android.gms.internal.ads.on r1 = m13922d(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x0061:
            int r2 = f10411q     // Catch:{ all -> 0x01d3 }
            r4 = 1
            r8 = 0
            if (r1 != r2) goto L_0x0071
            java.lang.String r2 = "TBPM"
            com.google.android.gms.internal.ads.mn r1 = m13921c(r1, r2, r13, r4, r8)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x0071:
            int r2 = f10412r     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x007f
            java.lang.String r2 = "TCMP"
            com.google.android.gms.internal.ads.mn r1 = m13921c(r1, r2, r13, r4, r4)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x007f:
            int r2 = f10406l     // Catch:{ all -> 0x01d3 }
            r9 = 4
            if (r1 != r2) goto L_0x00db
            int r1 = r13.mo12394e()     // Catch:{ all -> 0x01d3 }
            int r2 = r13.mo12394e()     // Catch:{ all -> 0x01d3 }
            int r3 = com.google.android.gms.internal.ads.C2888tl.f18048F0     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x00d2
            int r2 = r13.mo12394e()     // Catch:{ all -> 0x01d3 }
            int r2 = com.google.android.gms.internal.ads.C2888tl.m21066a(r2)     // Catch:{ all -> 0x01d3 }
            r3 = 13
            r4 = 14
            if (r2 != r3) goto L_0x00a1
            java.lang.String r3 = "image/jpeg"
            goto L_0x00a9
        L_0x00a1:
            if (r2 != r4) goto L_0x00a8
            java.lang.String r3 = "image/png"
            r2 = 14
            goto L_0x00a9
        L_0x00a8:
            r3 = r6
        L_0x00a9:
            if (r3 != 0) goto L_0x00c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d3 }
            r1.<init>()     // Catch:{ all -> 0x01d3 }
            java.lang.String r3 = "Unrecognized cover art flags: "
            r1.append(r3)     // Catch:{ all -> 0x01d3 }
            r1.append(r2)     // Catch:{ all -> 0x01d3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d3 }
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d3 }
            goto L_0x00d7
        L_0x00c0:
            r13.mo12412w(r9)     // Catch:{ all -> 0x01d3 }
            int r1 = r1 + -16
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x01d3 }
            r13.mo12406q(r2, r8, r1)     // Catch:{ all -> 0x01d3 }
            com.google.android.gms.internal.ads.in r1 = new com.google.android.gms.internal.ads.in     // Catch:{ all -> 0x01d3 }
            r4 = 3
            r1.<init>(r3, r6, r4, r2)     // Catch:{ all -> 0x01d3 }
            r6 = r1
            goto L_0x00d7
        L_0x00d2:
            java.lang.String r1 = "Failed to parse cover art attribute"
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d3 }
        L_0x00d7:
            r13.mo12411v(r0)
            return r6
        L_0x00db:
            int r2 = f10413s     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x00e9
            java.lang.String r2 = "TPE2"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x00e9:
            int r2 = f10414t     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x00f7
            java.lang.String r2 = "TSOT"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x00f7:
            int r2 = f10415u     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0105
            java.lang.String r2 = "TSO2"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x0105:
            int r2 = f10416v     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0113
            java.lang.String r2 = "TSOA"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x0113:
            int r2 = f10417w     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0121
            java.lang.String r2 = "TSOP"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x0121:
            int r2 = f10418x     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x012f
            java.lang.String r2 = "TSOC"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x012f:
            int r2 = f10419y     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x013d
            java.lang.String r2 = "ITUNESADVISORY"
            com.google.android.gms.internal.ads.mn r1 = m13921c(r1, r2, r13, r8, r8)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x013d:
            int r2 = f10420z     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x014b
            java.lang.String r2 = "ITUNESGAPLESS"
            com.google.android.gms.internal.ads.mn r1 = m13921c(r1, r2, r13, r8, r4)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x014b:
            int r2 = f10391A     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0159
            java.lang.String r2 = "TVSHOWSORT"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x0159:
            int r2 = f10392B     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0167
            java.lang.String r2 = "TVSHOW"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x0167:
            int r2 = f10393C     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0280
            r1 = r6
            r2 = r1
            r4 = -1
            r5 = -1
        L_0x016f:
            int r8 = r13.mo12392c()     // Catch:{ all -> 0x01d3 }
            if (r8 >= r0) goto L_0x01a9
            int r8 = r13.mo12392c()     // Catch:{ all -> 0x01d3 }
            int r10 = r13.mo12394e()     // Catch:{ all -> 0x01d3 }
            int r11 = r13.mo12394e()     // Catch:{ all -> 0x01d3 }
            r13.mo12412w(r9)     // Catch:{ all -> 0x01d3 }
            int r12 = com.google.android.gms.internal.ads.C2888tl.f18044D0     // Catch:{ all -> 0x01d3 }
            if (r11 != r12) goto L_0x018f
            int r10 = r10 + -12
            java.lang.String r1 = r13.mo12404o(r10)     // Catch:{ all -> 0x01d3 }
            goto L_0x016f
        L_0x018f:
            int r12 = com.google.android.gms.internal.ads.C2888tl.f18046E0     // Catch:{ all -> 0x01d3 }
            if (r11 != r12) goto L_0x019a
            int r10 = r10 + -12
            java.lang.String r2 = r13.mo12404o(r10)     // Catch:{ all -> 0x01d3 }
            goto L_0x016f
        L_0x019a:
            int r12 = com.google.android.gms.internal.ads.C2888tl.f18048F0     // Catch:{ all -> 0x01d3 }
            if (r11 != r12) goto L_0x019f
            r5 = r10
        L_0x019f:
            if (r11 == r12) goto L_0x01a2
            goto L_0x01a3
        L_0x01a2:
            r4 = r8
        L_0x01a3:
            int r10 = r10 + -12
            r13.mo12412w(r10)     // Catch:{ all -> 0x01d3 }
            goto L_0x016f
        L_0x01a9:
            java.lang.String r8 = "com.apple.iTunes"
            boolean r1 = r8.equals(r1)     // Catch:{ all -> 0x01d3 }
            if (r1 == 0) goto L_0x01cf
            java.lang.String r1 = "iTunSMPB"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x01d3 }
            if (r1 == 0) goto L_0x01cf
            if (r4 != r7) goto L_0x01bc
            goto L_0x01cf
        L_0x01bc:
            r13.mo12411v(r4)     // Catch:{ all -> 0x01d3 }
            r1 = 16
            r13.mo12412w(r1)     // Catch:{ all -> 0x01d3 }
            int r5 = r5 + -16
            java.lang.String r1 = r13.mo12404o(r5)     // Catch:{ all -> 0x01d3 }
            com.google.android.gms.internal.ads.kn r6 = new com.google.android.gms.internal.ads.kn     // Catch:{ all -> 0x01d3 }
            r6.<init>(r3, r2, r1)     // Catch:{ all -> 0x01d3 }
        L_0x01cf:
            r13.mo12411v(r0)
            return r6
        L_0x01d3:
            r1 = move-exception
            goto L_0x02b0
        L_0x01d6:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r7 = f10397c     // Catch:{ all -> 0x01d3 }
            if (r2 != r7) goto L_0x020c
            int r2 = r13.mo12394e()     // Catch:{ all -> 0x01d3 }
            int r4 = r13.mo12394e()     // Catch:{ all -> 0x01d3 }
            int r7 = com.google.android.gms.internal.ads.C2888tl.f18048F0     // Catch:{ all -> 0x01d3 }
            if (r4 != r7) goto L_0x01fb
            r1 = 8
            r13.mo12412w(r1)     // Catch:{ all -> 0x01d3 }
            int r2 = r2 + -16
            java.lang.String r1 = r13.mo12404o(r2)     // Catch:{ all -> 0x01d3 }
            com.google.android.gms.internal.ads.kn r6 = new com.google.android.gms.internal.ads.kn     // Catch:{ all -> 0x01d3 }
            r6.<init>(r3, r1, r1)     // Catch:{ all -> 0x01d3 }
            goto L_0x0208
        L_0x01fb:
            java.lang.String r1 = com.google.android.gms.internal.ads.C2888tl.m21068c(r1)     // Catch:{ all -> 0x01d3 }
            java.lang.String r2 = "Failed to parse comment attribute: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x01d3 }
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d3 }
        L_0x0208:
            r13.mo12411v(r0)
            return r6
        L_0x020c:
            int r3 = f10395a     // Catch:{ all -> 0x01d3 }
            if (r2 == r3) goto L_0x02a6
            int r3 = f10396b     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x0216
            goto L_0x02a6
        L_0x0216:
            int r3 = f10402h     // Catch:{ all -> 0x01d3 }
            if (r2 == r3) goto L_0x029c
            int r3 = f10403i     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x0220
            goto L_0x029c
        L_0x0220:
            int r3 = f10398d     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x022e
            java.lang.String r2 = "TDRC"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x022e:
            int r3 = f10399e     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x023c
            java.lang.String r2 = "TPE1"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x023c:
            int r3 = f10400f     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x024a
            java.lang.String r2 = "TSSE"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x024a:
            int r3 = f10401g     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x0258
            java.lang.String r2 = "TALB"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x0258:
            int r3 = f10404j     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x0266
            java.lang.String r2 = "USLT"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x0266:
            int r3 = f10405k     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x0272
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r4, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x0272:
            int r3 = f10408n     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x0280
            java.lang.String r2 = "TIT1"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x0280:
            java.lang.String r1 = com.google.android.gms.internal.ads.C2888tl.m21068c(r1)     // Catch:{ all -> 0x01d3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d3 }
            r2.<init>()     // Catch:{ all -> 0x01d3 }
            java.lang.String r3 = "Skipped unknown metadata entry: "
            r2.append(r3)     // Catch:{ all -> 0x01d3 }
            r2.append(r1)     // Catch:{ all -> 0x01d3 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01d3 }
            android.util.Log.d(r5, r1)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r6
        L_0x029c:
            java.lang.String r2 = "TCOM"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x02a6:
            java.lang.String r2 = "TIT2"
            com.google.android.gms.internal.ads.on r1 = m13923e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo12411v(r0)
            return r1
        L_0x02b0:
            r13.mo12411v(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2443hm.m13919a(com.google.android.gms.internal.ads.mq):com.google.android.gms.internal.ads.fn");
    }

    /* renamed from: b */
    private static int m13920b(C2633mq mqVar) {
        mqVar.mo12412w(4);
        if (mqVar.mo12394e() == C2888tl.f18048F0) {
            mqVar.mo12412w(8);
            return mqVar.mo12396g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: c */
    private static C2630mn m13921c(int i, String str, C2633mq mqVar, boolean z, boolean z2) {
        int b = m13920b(mqVar);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute: ".concat(C2888tl.m21068c(i)));
            return null;
        } else if (z) {
            return new C2704on(str, (String) null, Integer.toString(b));
        } else {
            return new C2556kn("und", str, Integer.toString(b));
        }
    }

    /* renamed from: d */
    private static C2704on m13922d(int i, String str, C2633mq mqVar) {
        int e = mqVar.mo12394e();
        if (mqVar.mo12394e() == C2888tl.f18048F0 && e >= 22) {
            mqVar.mo12412w(10);
            int j = mqVar.mo12399j();
            if (j > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                String sb2 = sb.toString();
                int j2 = mqVar.mo12399j();
                if (j2 > 0) {
                    sb2 = sb2 + "/" + j2;
                }
                return new C2704on(str, (String) null, sb2);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: ".concat(C2888tl.m21068c(i)));
        return null;
    }

    /* renamed from: e */
    private static C2704on m13923e(int i, String str, C2633mq mqVar) {
        int e = mqVar.mo12394e();
        if (mqVar.mo12394e() == C2888tl.f18048F0) {
            mqVar.mo12412w(8);
            return new C2704on(str, (String) null, mqVar.mo12404o(e - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: ".concat(C2888tl.m21068c(i)));
        return null;
    }
}
