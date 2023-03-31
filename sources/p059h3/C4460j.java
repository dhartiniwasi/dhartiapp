package p059h3;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p030d2.C4035m;
import p059h3.C4449g;
import p059h3.C4456h;
import p092m2.C5023l;
import p155v3.C5823j0;
import p161w3.C5917a;
import p161w3.C5947k0;
import p161w3.C5953m0;
import p177z1.C6227i;
import p177z1.C6249m2;
import p190b7.C6696t;

/* renamed from: h3.j */
/* compiled from: HlsPlaylistParser */
public final class C4460j implements C5823j0.C5824a<C4459i> {

    /* renamed from: A */
    private static final Pattern f24760A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: B */
    private static final Pattern f24761B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: C */
    private static final Pattern f24762C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: D */
    private static final Pattern f24763D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: E */
    private static final Pattern f24764E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: F */
    private static final Pattern f24765F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: G */
    private static final Pattern f24766G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: H */
    private static final Pattern f24767H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: I */
    private static final Pattern f24768I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: J */
    private static final Pattern f24769J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: K */
    private static final Pattern f24770K = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: L */
    private static final Pattern f24771L = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: M */
    private static final Pattern f24772M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: N */
    private static final Pattern f24773N = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: O */
    private static final Pattern f24774O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: P */
    private static final Pattern f24775P = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: Q */
    private static final Pattern f24776Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: R */
    private static final Pattern f24777R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: S */
    private static final Pattern f24778S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: T */
    private static final Pattern f24779T = m29502c("AUTOSELECT");

    /* renamed from: U */
    private static final Pattern f24780U = m29502c("DEFAULT");

    /* renamed from: V */
    private static final Pattern f24781V = m29502c("FORCED");

    /* renamed from: W */
    private static final Pattern f24782W = m29502c("INDEPENDENT");

    /* renamed from: X */
    private static final Pattern f24783X = m29502c("GAP");

    /* renamed from: Y */
    private static final Pattern f24784Y = m29502c("PRECISE");

    /* renamed from: Z */
    private static final Pattern f24785Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0 */
    private static final Pattern f24786a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0 */
    private static final Pattern f24787b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: c */
    private static final Pattern f24788c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d */
    private static final Pattern f24789d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e */
    private static final Pattern f24790e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f */
    private static final Pattern f24791f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g */
    private static final Pattern f24792g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h */
    private static final Pattern f24793h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i */
    private static final Pattern f24794i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j */
    private static final Pattern f24795j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k */
    private static final Pattern f24796k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l */
    private static final Pattern f24797l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m */
    private static final Pattern f24798m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n */
    private static final Pattern f24799n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o */
    private static final Pattern f24800o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p */
    private static final Pattern f24801p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q */
    private static final Pattern f24802q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r */
    private static final Pattern f24803r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s */
    private static final Pattern f24804s = m29502c("CAN-SKIP-DATERANGES");

    /* renamed from: t */
    private static final Pattern f24805t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u */
    private static final Pattern f24806u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v */
    private static final Pattern f24807v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w */
    private static final Pattern f24808w = m29502c("CAN-BLOCK-RELOAD");

    /* renamed from: x */
    private static final Pattern f24809x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y */
    private static final Pattern f24810y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z */
    private static final Pattern f24811z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: a */
    private final C4456h f24812a;

    /* renamed from: b */
    private final C4449g f24813b;

    /* renamed from: h3.j$a */
    /* compiled from: HlsPlaylistParser */
    public static final class C4461a extends IOException {
    }

    /* renamed from: h3.j$b */
    /* compiled from: HlsPlaylistParser */
    private static class C4462b {

        /* renamed from: a */
        private final BufferedReader f24814a;

        /* renamed from: b */
        private final Queue<String> f24815b;

        /* renamed from: c */
        private String f24816c;

        public C4462b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f24815b = queue;
            this.f24814a = bufferedReader;
        }

        /* renamed from: a */
        public boolean mo18008a() throws IOException {
            String trim;
            if (this.f24816c != null) {
                return true;
            }
            if (!this.f24815b.isEmpty()) {
                this.f24816c = (String) C5917a.m34872e(this.f24815b.poll());
                return true;
            }
            do {
                String readLine = this.f24814a.readLine();
                this.f24816c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f24816c = trim;
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String mo18009b() throws IOException {
            if (mo18008a()) {
                String str = this.f24816c;
                this.f24816c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public C4460j() {
        this(C4456h.f24736n, (C4449g) null);
    }

    /* renamed from: A */
    private static long m29498A(String str, Pattern pattern) throws C6249m2 {
        return new BigDecimal(m29524z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000)).longValue();
    }

    /* renamed from: B */
    private static String m29499B(String str, Map<String, String> map) {
        Matcher matcher = f24787b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: C */
    private static int m29500C(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !C5953m0.m35161u0(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* renamed from: b */
    private static boolean m29501b(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int C = m29500C(bufferedReader, true, read);
        for (int i = 0; i < 7; i++) {
            if (C != "#EXTM3U".charAt(i)) {
                return false;
            }
            C = bufferedReader.read();
        }
        return C5953m0.m35161u0(m29500C(bufferedReader, false, C));
    }

    /* renamed from: c */
    private static Pattern m29502c(String str) {
        return Pattern.compile(str + "=(" + "NO" + "|" + "YES" + ")");
    }

    /* renamed from: d */
    private static C4035m m29503d(String str, C4035m.C4037b[] bVarArr) {
        C4035m.C4037b[] bVarArr2 = new C4035m.C4037b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = bVarArr[i].mo17241b((byte[]) null);
        }
        return new C4035m(str, bVarArr2);
    }

    /* renamed from: e */
    private static String m29504e(long j, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    /* renamed from: f */
    private static C4456h.C4458b m29505f(ArrayList<C4456h.C4458b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C4456h.C4458b bVar = arrayList.get(i);
            if (str.equals(bVar.f24754d)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    private static C4456h.C4458b m29506g(ArrayList<C4456h.C4458b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C4456h.C4458b bVar = arrayList.get(i);
            if (str.equals(bVar.f24755e)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: h */
    private static C4456h.C4458b m29507h(ArrayList<C4456h.C4458b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C4456h.C4458b bVar = arrayList.get(i);
            if (str.equals(bVar.f24753c)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    private static double m29508j(String str, Pattern pattern) throws C6249m2 {
        return Double.parseDouble(m29524z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: k */
    private static C4035m.C4037b m29509k(String str, String str2, Map<String, String> map) throws C6249m2 {
        String u = m29519u(str, f24769J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z = m29524z(str, f24770K, map);
            return new C4035m.C4037b(C6227i.f29963d, "video/mp4", Base64.decode(z.substring(z.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new C4035m.C4037b(C6227i.f29963d, "hls", C5953m0.m35145m0(str));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !"1".equals(u)) {
                return null;
            }
            String z2 = m29524z(str, f24770K, map);
            byte[] decode = Base64.decode(z2.substring(z2.indexOf(44)), 0);
            UUID uuid = C6227i.f29964e;
            return new C4035m.C4037b(uuid, "video/mp4", C5023l.m31708a(uuid, decode));
        }
    }

    /* renamed from: l */
    private static String m29510l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* renamed from: m */
    private static int m29511m(String str, Pattern pattern) throws C6249m2 {
        return Integer.parseInt(m29524z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: n */
    private static long m29512n(String str, Pattern pattern) throws C6249m2 {
        return Long.parseLong(m29524z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r13v60 */
    /* renamed from: o */
    private static C4449g m29513o(C4456h hVar, C4449g gVar, C4462b bVar, String str) throws IOException {
        boolean z;
        ArrayList arrayList;
        String str2;
        C4449g.C4451b bVar2;
        ArrayList arrayList2;
        int i;
        HashMap hashMap;
        String str3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j;
        ArrayList arrayList5;
        long j2;
        HashMap hashMap2;
        long j3;
        C4035m mVar;
        long j4;
        long j5;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C4456h hVar2 = hVar;
        C4449g gVar2 = gVar;
        boolean z2 = hVar2.f24759c;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        C4449g.C4455f fVar = new C4449g.C4455f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str9 = "";
        ? r13 = 0;
        boolean z3 = z2;
        C4449g.C4455f fVar2 = fVar;
        String str10 = str9;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        int i2 = 0;
        long j14 = -9223372036854775807L;
        boolean z4 = false;
        boolean z5 = false;
        int i3 = 0;
        int i4 = 1;
        long j15 = -9223372036854775807L;
        long j16 = -9223372036854775807L;
        boolean z6 = false;
        C4035m mVar2 = null;
        C4035m mVar3 = null;
        boolean z7 = false;
        String str11 = null;
        long j17 = -1;
        String str12 = null;
        String str13 = null;
        int i5 = 0;
        boolean z8 = false;
        C4449g.C4453d dVar = null;
        ArrayList arrayList10 = arrayList7;
        C4449g.C4451b bVar3 = null;
        while (bVar.mo18008a()) {
            String b = bVar.mo18009b();
            if (b.startsWith("#EXT")) {
                arrayList9.add(b);
            }
            if (b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String z9 = m29524z(b, f24802q, hashMap3);
                if ("VOD".equals(z9)) {
                    i2 = 1;
                    z = r13;
                } else if ("EVENT".equals(z9)) {
                    i2 = 2;
                    z = r13;
                } else {
                    z = r13;
                }
            } else if (b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z8 = true;
                z = r13;
            } else {
                if (b.startsWith("#EXT-X-START")) {
                    arrayList = arrayList6;
                    z4 = m29515q(b, f24784Y, r13);
                    j14 = (long) (m29508j(b, f24762C) * 1000000.0d);
                } else {
                    arrayList = arrayList6;
                    if (b.startsWith("#EXT-X-SERVER-CONTROL")) {
                        fVar2 = m29523y(b);
                    } else if (b.startsWith("#EXT-X-PART-INF")) {
                        j16 = (long) (m29508j(b, f24800o) * 1000000.0d);
                    } else if (b.startsWith("#EXT-X-MAP")) {
                        String z10 = m29524z(b, f24770K, hashMap3);
                        String v = m29520v(b, f24764E, hashMap3);
                        if (v != null) {
                            String[] Q0 = C5953m0.m35101Q0(v, "@");
                            j17 = Long.parseLong(Q0[r13]);
                            if (Q0.length > 1) {
                                j8 = Long.parseLong(Q0[1]);
                            }
                        }
                        int i6 = (j17 > -1 ? 1 : (j17 == -1 ? 0 : -1));
                        if (i6 == 0) {
                            j8 = 0;
                        }
                        String str14 = str11;
                        String str15 = str12;
                        if (str14 == null || str15 != null) {
                            dVar = new C4449g.C4453d(z10, j8, j17, str14, str15);
                            if (i6 != 0) {
                                j8 += j17;
                            }
                            str12 = str15;
                            str11 = str14;
                            arrayList6 = arrayList;
                            j17 = -1;
                            z = r13;
                        } else {
                            throw C6249m2.m36663c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", (Throwable) null);
                        }
                    } else {
                        String str16 = str11;
                        String str17 = str12;
                        if (b.startsWith("#EXT-X-TARGETDURATION")) {
                            j15 = 1000000 * ((long) m29511m(b, f24798m));
                        } else if (b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            j11 = m29512n(b, f24809x);
                            str12 = str17;
                            str11 = str16;
                            j7 = j11;
                            arrayList6 = arrayList;
                            z = false;
                        } else if (b.startsWith("#EXT-X-VERSION")) {
                            i4 = m29511m(b, f24801p);
                        } else {
                            if (b.startsWith("#EXT-X-DEFINE")) {
                                String v2 = m29520v(b, f24786a0, hashMap3);
                                if (v2 != null) {
                                    String str18 = hVar2.f24745l.get(v2);
                                    if (str18 != null) {
                                        hashMap3.put(v2, str18);
                                    }
                                } else {
                                    hashMap3.put(m29524z(b, f24775P, hashMap3), m29524z(b, f24785Z, hashMap3));
                                }
                                i = i2;
                                hashMap = hashMap3;
                                arrayList4 = arrayList8;
                                str2 = str9;
                                str3 = str13;
                                j = j11;
                                bVar2 = bVar3;
                                arrayList2 = arrayList9;
                                arrayList3 = arrayList;
                            } else if (b.startsWith("#EXTINF")) {
                                j12 = m29498A(b, f24810y);
                                str10 = m29519u(b, f24811z, str9, hashMap3);
                            } else if (b.startsWith("#EXT-X-SKIP")) {
                                int m = m29511m(b, f24805t);
                                C5917a.m34873f(gVar2 != null && arrayList.isEmpty());
                                int i7 = (int) (j7 - ((C4449g) C5953m0.m35138j(gVar)).f24701k);
                                int i8 = m + i7;
                                if (i7 < 0 || i8 > gVar2.f24708r.size()) {
                                    throw new C4461a();
                                }
                                String str19 = str9;
                                str12 = str17;
                                long j18 = j10;
                                while (i7 < i8) {
                                    C4449g.C4453d dVar2 = gVar2.f24708r.get(i7);
                                    int i9 = i8;
                                    String str20 = str19;
                                    if (j7 != gVar2.f24701k) {
                                        dVar2 = dVar2.mo18002b(j18, (gVar2.f24700j - i3) + dVar2.f24723d);
                                    }
                                    ArrayList arrayList11 = arrayList;
                                    arrayList11.add(dVar2);
                                    long j19 = j18 + dVar2.f24722c;
                                    long j20 = dVar2.f24729r;
                                    long j21 = j19;
                                    if (j20 != -1) {
                                        j8 = dVar2.f24728i + j20;
                                    }
                                    int i10 = dVar2.f24723d;
                                    C4449g.C4453d dVar3 = dVar2.f24721b;
                                    C4035m mVar4 = dVar2.f24725f;
                                    String str21 = dVar2.f24726g;
                                    String str22 = dVar2.f24727h;
                                    int i11 = i10;
                                    if (str22 == null || !str22.equals(Long.toHexString(j11))) {
                                        str12 = dVar2.f24727h;
                                    }
                                    j11++;
                                    i7++;
                                    C4456h hVar3 = hVar;
                                    dVar = dVar3;
                                    str16 = str21;
                                    arrayList = arrayList11;
                                    i5 = i11;
                                    i8 = i9;
                                    j9 = j21;
                                    str19 = str20;
                                    gVar2 = gVar;
                                    mVar3 = mVar4;
                                    j18 = j9;
                                }
                                hVar2 = hVar;
                                gVar2 = gVar;
                                j10 = j18;
                                str9 = str19;
                                str11 = str16;
                                arrayList6 = arrayList;
                                z = false;
                            } else {
                                str2 = str9;
                                ArrayList arrayList12 = arrayList;
                                if (b.startsWith("#EXT-X-KEY")) {
                                    String z11 = m29524z(b, f24767H, hashMap3);
                                    String u = m29519u(b, f24768I, "identity", hashMap3);
                                    if ("NONE".equals(z11)) {
                                        treeMap.clear();
                                        str7 = null;
                                        mVar3 = null;
                                        str8 = null;
                                    } else {
                                        String v3 = m29520v(b, f24771L, hashMap3);
                                        if (!"identity".equals(u)) {
                                            String str23 = str13;
                                            str13 = str23 == null ? m29510l(z11) : str23;
                                            C4035m.C4037b k = m29509k(b, u, hashMap3);
                                            if (k != null) {
                                                treeMap.put(u, k);
                                                str8 = v3;
                                                str7 = null;
                                                mVar3 = null;
                                            }
                                        } else if ("AES-128".equals(z11)) {
                                            str7 = m29524z(b, f24770K, hashMap3);
                                            str8 = v3;
                                        }
                                        str8 = v3;
                                        str7 = null;
                                    }
                                    gVar2 = gVar;
                                    str11 = str7;
                                    arrayList6 = arrayList12;
                                    str9 = str2;
                                    z = false;
                                    hVar2 = hVar;
                                } else {
                                    str3 = str13;
                                    if (b.startsWith("#EXT-X-BYTERANGE")) {
                                        String[] Q02 = C5953m0.m35101Q0(m29524z(b, f24763D, hashMap3), "@");
                                        j17 = Long.parseLong(Q02[0]);
                                        if (Q02.length > 1) {
                                            j8 = Long.parseLong(Q02[1]);
                                        }
                                    } else {
                                        if (b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i3 = Integer.parseInt(b.substring(b.indexOf(58) + 1));
                                            hVar2 = hVar;
                                            gVar2 = gVar;
                                            str4 = str3;
                                            str5 = str17;
                                            str6 = str16;
                                            str9 = str2;
                                            z5 = true;
                                        } else if (b.equals("#EXT-X-DISCONTINUITY")) {
                                            i5++;
                                        } else {
                                            if (b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j6 == 0) {
                                                    j6 = C5953m0.m35071B0(C5953m0.m35085I0(b.substring(b.indexOf(58) + 1))) - j10;
                                                } else {
                                                    i = i2;
                                                    hashMap = hashMap3;
                                                    arrayList4 = arrayList8;
                                                    arrayList2 = arrayList9;
                                                    arrayList3 = arrayList12;
                                                    j = j11;
                                                }
                                            } else if (b.equals("#EXT-X-GAP")) {
                                                hVar2 = hVar;
                                                gVar2 = gVar;
                                                str4 = str3;
                                                str5 = str17;
                                                str6 = str16;
                                                str9 = str2;
                                                z7 = true;
                                            } else if (b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                hVar2 = hVar;
                                                gVar2 = gVar;
                                                str4 = str3;
                                                str5 = str17;
                                                str6 = str16;
                                                str9 = str2;
                                                z3 = true;
                                            } else if (b.equals("#EXT-X-ENDLIST")) {
                                                hVar2 = hVar;
                                                gVar2 = gVar;
                                                str4 = str3;
                                                str5 = str17;
                                                str6 = str16;
                                                str9 = str2;
                                                z6 = true;
                                            } else {
                                                if (b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                    i = i2;
                                                    arrayList5 = arrayList12;
                                                    arrayList8.add(new C4449g.C4452c(Uri.parse(C5947k0.m35054d(str, m29524z(b, f24770K, hashMap3))), m29518t(b, f24760A, -1), m29517s(b, f24761B, -1)));
                                                } else {
                                                    i = i2;
                                                    arrayList5 = arrayList12;
                                                    String str24 = str;
                                                    if (!b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                        j = j11;
                                                        if (b.startsWith("#EXT-X-PART")) {
                                                            String e = m29504e(j, str16, str17);
                                                            String z12 = m29524z(b, f24770K, hashMap3);
                                                            C4449g.C4451b bVar4 = bVar3;
                                                            ArrayList arrayList13 = arrayList8;
                                                            long j22 = (long) (m29508j(b, f24799n) * 1000000.0d);
                                                            ArrayList arrayList14 = arrayList9;
                                                            C4449g.C4451b bVar5 = bVar4;
                                                            boolean q = m29515q(b, f24782W, false) | (z3 && arrayList10.isEmpty());
                                                            boolean q2 = m29515q(b, f24783X, false);
                                                            String v4 = m29520v(b, f24764E, hashMap3);
                                                            if (v4 != null) {
                                                                String[] Q03 = C5953m0.m35101Q0(v4, "@");
                                                                j4 = Long.parseLong(Q03[0]);
                                                                if (Q03.length > 1) {
                                                                    j13 = Long.parseLong(Q03[1]);
                                                                }
                                                            } else {
                                                                j4 = -1;
                                                            }
                                                            int i12 = (j4 > -1 ? 1 : (j4 == -1 ? 0 : -1));
                                                            if (i12 == 0) {
                                                                j13 = 0;
                                                            }
                                                            if (mVar3 == null && !treeMap.isEmpty()) {
                                                                C4035m.C4037b[] bVarArr = (C4035m.C4037b[]) treeMap.values().toArray(new C4035m.C4037b[0]);
                                                                C4035m mVar5 = new C4035m(str3, bVarArr);
                                                                if (mVar2 == null) {
                                                                    mVar2 = m29503d(str3, bVarArr);
                                                                }
                                                                mVar3 = mVar5;
                                                            }
                                                            arrayList10.add(new C4449g.C4451b(z12, dVar, j22, i5, j9, mVar3, str16, e, j13, j4, q2, q, false));
                                                            j9 += j22;
                                                            if (i12 != 0) {
                                                                j13 += j4;
                                                            }
                                                            arrayList8 = arrayList13;
                                                            str11 = str16;
                                                            i2 = i;
                                                            arrayList9 = arrayList14;
                                                            bVar3 = bVar5;
                                                            arrayList6 = arrayList5;
                                                            z = false;
                                                            j11 = j;
                                                            str13 = str3;
                                                            str12 = str17;
                                                            str9 = str2;
                                                            hVar2 = hVar;
                                                            gVar2 = gVar;
                                                        } else {
                                                            bVar2 = bVar3;
                                                            arrayList4 = arrayList8;
                                                            arrayList2 = arrayList9;
                                                            if (!b.startsWith("#")) {
                                                                String e2 = m29504e(j, str16, str17);
                                                                long j23 = j + 1;
                                                                String B = m29499B(b, hashMap3);
                                                                C4449g.C4453d dVar4 = (C4449g.C4453d) hashMap4.get(B);
                                                                int i13 = (j17 > -1 ? 1 : (j17 == -1 ? 0 : -1));
                                                                if (i13 == 0) {
                                                                    j2 = 0;
                                                                } else {
                                                                    if (z8 && dVar == null && dVar4 == null) {
                                                                        dVar4 = new C4449g.C4453d(B, 0, j8, (String) null, (String) null);
                                                                        hashMap4.put(B, dVar4);
                                                                    }
                                                                    j2 = j8;
                                                                }
                                                                if (mVar3 != null || treeMap.isEmpty()) {
                                                                    j3 = j23;
                                                                    hashMap2 = hashMap3;
                                                                    mVar = mVar3;
                                                                } else {
                                                                    j3 = j23;
                                                                    hashMap2 = hashMap3;
                                                                    C4035m.C4037b[] bVarArr2 = (C4035m.C4037b[]) treeMap.values().toArray(new C4035m.C4037b[0]);
                                                                    mVar = new C4035m(str3, bVarArr2);
                                                                    if (mVar2 == null) {
                                                                        mVar2 = m29503d(str3, bVarArr2);
                                                                    }
                                                                }
                                                                C4449g.C4453d dVar5 = dVar != null ? dVar : dVar4;
                                                                ArrayList arrayList15 = arrayList5;
                                                                arrayList15.add(new C4449g.C4453d(B, dVar5, str10, j12, i5, j10, mVar, str16, e2, j2, j17, z7, arrayList10));
                                                                j9 = j10 + j12;
                                                                arrayList10 = new ArrayList();
                                                                if (i13 != 0) {
                                                                    j2 += j17;
                                                                }
                                                                j8 = j2;
                                                                hVar2 = hVar;
                                                                gVar2 = gVar;
                                                                arrayList8 = arrayList4;
                                                                mVar3 = mVar;
                                                                str11 = str16;
                                                                j12 = 0;
                                                                j10 = j9;
                                                                hashMap3 = hashMap2;
                                                                i2 = i;
                                                                bVar3 = bVar2;
                                                                str10 = str2;
                                                                z = false;
                                                                z7 = false;
                                                                j17 = -1;
                                                                arrayList6 = arrayList15;
                                                                str12 = str17;
                                                                j11 = j3;
                                                                arrayList9 = arrayList2;
                                                                str13 = str3;
                                                                str9 = str10;
                                                            } else {
                                                                hashMap = hashMap3;
                                                                arrayList3 = arrayList5;
                                                            }
                                                        }
                                                    } else if (bVar3 == null && "PART".equals(m29524z(b, f24773N, hashMap3))) {
                                                        String z13 = m29524z(b, f24770K, hashMap3);
                                                        long t = m29518t(b, f24765F, -1);
                                                        long t2 = m29518t(b, f24766G, -1);
                                                        long j24 = j11;
                                                        String e3 = m29504e(j24, str16, str17);
                                                        if (mVar3 != null || treeMap.isEmpty()) {
                                                            j5 = j24;
                                                        } else {
                                                            j5 = j24;
                                                            C4035m.C4037b[] bVarArr3 = (C4035m.C4037b[]) treeMap.values().toArray(new C4035m.C4037b[0]);
                                                            C4035m mVar6 = new C4035m(str3, bVarArr3);
                                                            if (mVar2 == null) {
                                                                mVar2 = m29503d(str3, bVarArr3);
                                                            }
                                                            mVar3 = mVar6;
                                                        }
                                                        int i14 = (t > -1 ? 1 : (t == -1 ? 0 : -1));
                                                        if (i14 == 0 || t2 != -1) {
                                                            bVar3 = new C4449g.C4451b(z13, dVar, 0, i5, j9, mVar3, str16, e3, i14 != 0 ? t : 0, t2, false, false, true);
                                                        }
                                                        hVar2 = hVar;
                                                        gVar2 = gVar;
                                                        str13 = str3;
                                                        str11 = str16;
                                                        j11 = j5;
                                                        i2 = i;
                                                        arrayList6 = arrayList5;
                                                        str9 = str2;
                                                        z = false;
                                                        str12 = str17;
                                                    }
                                                }
                                                hashMap = hashMap3;
                                                arrayList4 = arrayList8;
                                                arrayList2 = arrayList9;
                                                j = j11;
                                                arrayList3 = arrayList5;
                                            }
                                            bVar2 = bVar3;
                                        }
                                        arrayList6 = arrayList12;
                                        z = false;
                                    }
                                    hVar2 = hVar;
                                    gVar2 = gVar;
                                    str4 = str3;
                                    str5 = str17;
                                    str6 = str16;
                                    str9 = str2;
                                    arrayList6 = arrayList12;
                                    z = false;
                                }
                            }
                            arrayList8 = arrayList4;
                            str11 = str16;
                            hashMap3 = hashMap;
                            i2 = i;
                            bVar3 = bVar2;
                            z = false;
                            j11 = j;
                            arrayList6 = arrayList3;
                            str12 = str17;
                            arrayList9 = arrayList2;
                            hVar2 = hVar;
                            gVar2 = gVar;
                            str13 = str3;
                            str9 = str2;
                        }
                        str12 = str17;
                        str11 = str16;
                        arrayList6 = arrayList;
                        z = false;
                    }
                }
                arrayList6 = arrayList;
                z = r13;
            }
            r13 = z;
        }
        int i15 = i2;
        C4449g.C4451b bVar6 = bVar3;
        ArrayList arrayList16 = arrayList8;
        ArrayList arrayList17 = arrayList9;
        ArrayList arrayList18 = arrayList6;
        HashMap hashMap5 = new HashMap();
        for (int i16 = 0; i16 < arrayList16.size(); i16++) {
            C4449g.C4452c cVar = (C4449g.C4452c) arrayList16.get(i16);
            long j25 = cVar.f24716b;
            if (j25 == -1) {
                j25 = (j7 + ((long) arrayList18.size())) - (arrayList10.isEmpty() ? 1 : 0);
            }
            int i17 = cVar.f24717c;
            if (i17 == -1 && j16 != -9223372036854775807L) {
                i17 = (arrayList10.isEmpty() ? ((C4449g.C4453d) C6696t.m38506c(arrayList18)).f24719u : arrayList10).size() - 1;
            }
            Uri uri = cVar.f24715a;
            hashMap5.put(uri, new C4449g.C4452c(uri, j25, i17));
        }
        if (bVar6 != null) {
            arrayList10.add(bVar6);
        }
        return new C4449g(i15, str, arrayList17, j14, z4, j6, z5, i3, j7, i4, j15, j16, z3, z6, j6 != 0, mVar2, arrayList18, arrayList10, fVar2, hashMap5);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0460, code lost:
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x04a8, code lost:
        r0 = r0 + 1;
        r31 = r6;
        r32 = r9;
        r33 = r14;
        r15 = r20;
        r9 = r21;
        r8 = null;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p059h3.C4456h m29514p(p059h3.C4460j.C4462b r36, java.lang.String r37) throws java.io.IOException {
        /*
            r1 = r37
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r10 = 0
            r13 = 0
        L_0x0036:
            boolean r14 = r36.mo18008a()
            java.lang.String r15 = "application/x-mpegURL"
            if (r14 == 0) goto L_0x021f
            java.lang.String r14 = r36.mo18009b()
            java.lang.String r9 = "#EXT"
            boolean r9 = r14.startsWith(r9)
            if (r9 == 0) goto L_0x004d
            r8.add(r14)
        L_0x004d:
            java.lang.String r9 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r9 = r14.startsWith(r9)
            r19 = r10
            java.lang.String r10 = "#EXT-X-DEFINE"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x006d
            java.util.regex.Pattern r9 = f24775P
            java.lang.String r9 = m29524z(r14, r9, r11)
            java.util.regex.Pattern r10 = f24785Z
            java.lang.String r10 = m29524z(r14, r10, r11)
            r11.put(r9, r10)
            goto L_0x00ce
        L_0x006d:
            java.lang.String r10 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x0087
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r28 = r12
            r10 = 1
            goto L_0x0204
        L_0x0087:
            java.lang.String r10 = "#EXT-X-MEDIA"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x0093
            r3.add(r14)
            goto L_0x00ce
        L_0x0093:
            java.lang.String r10 = "#EXT-X-SESSION-KEY"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L_0x00c3
            java.util.regex.Pattern r9 = f24768I
            java.lang.String r10 = "identity"
            java.lang.String r9 = m29519u(r14, r9, r10, r11)
            d2.m$b r9 = m29509k(r14, r9, r11)
            if (r9 == 0) goto L_0x00ce
            java.util.regex.Pattern r10 = f24767H
            java.lang.String r10 = m29524z(r14, r10, r11)
            java.lang.String r10 = m29510l(r10)
            d2.m r14 = new d2.m
            r15 = 1
            d2.m$b[] r15 = new p030d2.C4035m.C4037b[r15]
            r16 = 0
            r15[r16] = r9
            r14.<init>((java.lang.String) r10, (p030d2.C4035m.C4037b[]) r15)
            r12.add(r14)
            goto L_0x00ce
        L_0x00c3:
            java.lang.String r10 = "#EXT-X-STREAM-INF"
            boolean r10 = r14.startsWith(r10)
            if (r10 != 0) goto L_0x00e1
            if (r9 == 0) goto L_0x00ce
            goto L_0x00e1
        L_0x00ce:
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r28 = r12
            r10 = r19
            goto L_0x0204
        L_0x00e1:
            java.lang.String r10 = "CLOSED-CAPTIONS=NONE"
            boolean r10 = r14.contains(r10)
            r13 = r13 | r10
            if (r9 == 0) goto L_0x00ef
            r10 = 16384(0x4000, float:2.2959E-41)
            r20 = r13
            goto L_0x00f2
        L_0x00ef:
            r20 = r13
            r10 = 0
        L_0x00f2:
            java.util.regex.Pattern r13 = f24793h
            int r13 = m29511m(r14, r13)
            r28 = r12
            java.util.regex.Pattern r12 = f24788c
            r29 = r7
            r7 = -1
            int r12 = m29517s(r14, r12, r7)
            java.util.regex.Pattern r7 = f24795j
            java.lang.String r7 = m29520v(r14, r7, r11)
            r30 = r8
            java.util.regex.Pattern r8 = f24796k
            java.lang.String r8 = m29520v(r14, r8, r11)
            if (r8 == 0) goto L_0x0139
            r31 = r6
            java.lang.String r6 = "x"
            java.lang.String[] r6 = p161w3.C5953m0.m35101Q0(r8, r6)
            r8 = 0
            r21 = r6[r8]
            int r8 = java.lang.Integer.parseInt(r21)
            r18 = 1
            r6 = r6[r18]
            int r6 = java.lang.Integer.parseInt(r6)
            if (r8 <= 0) goto L_0x0132
            if (r6 > 0) goto L_0x012f
            goto L_0x0132
        L_0x012f:
            r17 = r8
            goto L_0x0135
        L_0x0132:
            r6 = -1
            r17 = -1
        L_0x0135:
            r8 = r6
            r6 = r17
            goto L_0x013d
        L_0x0139:
            r31 = r6
            r6 = -1
            r8 = -1
        L_0x013d:
            r17 = -1082130432(0xffffffffbf800000, float:-1.0)
            r32 = r5
            java.util.regex.Pattern r5 = f24797l
            java.lang.String r5 = m29520v(r14, r5, r11)
            if (r5 == 0) goto L_0x0152
            float r17 = java.lang.Float.parseFloat(r5)
            r33 = r4
            r5 = r17
            goto L_0x0156
        L_0x0152:
            r33 = r4
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0156:
            java.util.regex.Pattern r4 = f24789d
            java.lang.String r4 = m29520v(r14, r4, r11)
            r34 = r3
            java.util.regex.Pattern r3 = f24790e
            java.lang.String r3 = m29520v(r14, r3, r11)
            r35 = r0
            java.util.regex.Pattern r0 = f24791f
            java.lang.String r0 = m29520v(r14, r0, r11)
            r17 = r0
            java.util.regex.Pattern r0 = f24792g
            java.lang.String r0 = m29520v(r14, r0, r11)
            if (r9 == 0) goto L_0x0181
            java.util.regex.Pattern r9 = f24770K
            java.lang.String r9 = m29524z(r14, r9, r11)
            android.net.Uri r9 = p161w3.C5947k0.m35055e(r1, r9)
            goto L_0x0193
        L_0x0181:
            boolean r9 = r36.mo18008a()
            if (r9 == 0) goto L_0x0217
            java.lang.String r9 = r36.mo18009b()
            java.lang.String r9 = m29499B(r9, r11)
            android.net.Uri r9 = p161w3.C5947k0.m35055e(r1, r9)
        L_0x0193:
            z1.r1$b r14 = new z1.r1$b
            r14.<init>()
            int r1 = r2.size()
            z1.r1$b r1 = r14.mo21504R(r1)
            z1.r1$b r1 = r1.mo21497K(r15)
            z1.r1$b r1 = r1.mo21495I(r7)
            z1.r1$b r1 = r1.mo21493G(r12)
            z1.r1$b r1 = r1.mo21512Z(r13)
            z1.r1$b r1 = r1.mo21522j0(r6)
            z1.r1$b r1 = r1.mo21503Q(r8)
            z1.r1$b r1 = r1.mo21502P(r5)
            z1.r1$b r1 = r1.mo21515c0(r10)
            z1.r1 r23 = r1.mo21491E()
            h3.h$b r1 = new h3.h$b
            r21 = r1
            r22 = r9
            r24 = r4
            r25 = r3
            r26 = r17
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r2.add(r1)
            r1 = r35
            java.lang.Object r5 = r1.get(r9)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 != 0) goto L_0x01ea
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.put(r9, r5)
        L_0x01ea:
            g3.q$b r6 = new g3.q$b
            r21 = r6
            r22 = r12
            r23 = r13
            r24 = r4
            r25 = r3
            r26 = r17
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.add(r6)
            r10 = r19
            r13 = r20
        L_0x0204:
            r0 = r1
            r12 = r28
            r7 = r29
            r8 = r30
            r6 = r31
            r5 = r32
            r4 = r33
            r3 = r34
            r1 = r37
            goto L_0x0036
        L_0x0217:
            java.lang.String r0 = "#EXT-X-STREAM-INF must be followed by another line"
            r1 = 0
            z1.m2 r0 = p177z1.C6249m2.m36663c(r0, r1)
            throw r0
        L_0x021f:
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r19 = r10
            r28 = r12
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4 = 0
        L_0x023b:
            int r5 = r2.size()
            if (r4 >= r5) goto L_0x0294
            java.lang.Object r5 = r2.get(r4)
            h3.h$b r5 = (p059h3.C4456h.C4458b) r5
            android.net.Uri r6 = r5.f24751a
            boolean r6 = r0.add(r6)
            if (r6 == 0) goto L_0x0290
            z1.r1 r6 = r5.f24752b
            r2.a r6 = r6.f30241r
            if (r6 != 0) goto L_0x0257
            r6 = 1
            goto L_0x0258
        L_0x0257:
            r6 = 0
        L_0x0258:
            p161w3.C5917a.m34873f(r6)
            g3.q r6 = new g3.q
            android.net.Uri r7 = r5.f24751a
            java.lang.Object r7 = r1.get(r7)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = p161w3.C5917a.m34872e(r7)
            java.util.List r7 = (java.util.List) r7
            r8 = 0
            r6.<init>(r8, r8, r7)
            r2.a r7 = new r2.a
            r9 = 1
            r2.a$b[] r10 = new p127r2.C5432a.C5434b[r9]
            r9 = 0
            r10[r9] = r6
            r7.<init>((p127r2.C5432a.C5434b[]) r10)
            z1.r1 r6 = r5.f24752b
            z1.r1$b r6 = r6.mo21483b()
            z1.r1$b r6 = r6.mo21510X(r7)
            z1.r1 r6 = r6.mo21491E()
            h3.h$b r5 = r5.mo18006a(r6)
            r3.add(r5)
            goto L_0x0291
        L_0x0290:
            r8 = 0
        L_0x0291:
            int r4 = r4 + 1
            goto L_0x023b
        L_0x0294:
            r8 = 0
            r1 = r8
            r9 = r1
            r0 = 0
        L_0x0298:
            int r4 = r34.size()
            if (r0 >= r4) goto L_0x04b7
            r4 = r34
            java.lang.Object r5 = r4.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.util.regex.Pattern r6 = f24776Q
            java.lang.String r6 = m29524z(r5, r6, r11)
            java.util.regex.Pattern r7 = f24775P
            java.lang.String r7 = m29524z(r5, r7, r11)
            z1.r1$b r10 = new z1.r1$b
            r10.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            java.lang.String r14 = ":"
            r12.append(r14)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            z1.r1$b r10 = r10.mo21505S(r12)
            z1.r1$b r10 = r10.mo21507U(r7)
            z1.r1$b r10 = r10.mo21497K(r15)
            int r12 = m29522x(r5)
            z1.r1$b r10 = r10.mo21519g0(r12)
            int r12 = m29521w(r5, r11)
            z1.r1$b r10 = r10.mo21515c0(r12)
            java.util.regex.Pattern r12 = f24774O
            java.lang.String r12 = m29520v(r5, r12, r11)
            z1.r1$b r10 = r10.mo21508V(r12)
            java.util.regex.Pattern r12 = f24770K
            java.lang.String r12 = m29520v(r5, r12, r11)
            r14 = r37
            if (r12 != 0) goto L_0x02fd
            r12 = r8
            goto L_0x0301
        L_0x02fd:
            android.net.Uri r12 = p161w3.C5947k0.m35055e(r14, r12)
        L_0x0301:
            r2.a r8 = new r2.a
            r34 = r4
            r4 = 1
            r2.a$b[] r14 = new p127r2.C5432a.C5434b[r4]
            g3.q r4 = new g3.q
            r20 = r15
            java.util.List r15 = java.util.Collections.emptyList()
            r4.<init>(r6, r7, r15)
            r15 = 0
            r14[r15] = r4
            r8.<init>((p127r2.C5432a.C5434b[]) r14)
            java.util.regex.Pattern r4 = f24772M
            java.lang.String r4 = m29524z(r5, r4, r11)
            r4.hashCode()
            int r14 = r4.hashCode()
            r15 = 2
            switch(r14) {
                case -959297733: goto L_0x034d;
                case -333210994: goto L_0x0342;
                case 62628790: goto L_0x0337;
                case 81665115: goto L_0x032c;
                default: goto L_0x032a;
            }
        L_0x032a:
            r4 = -1
            goto L_0x0357
        L_0x032c:
            java.lang.String r14 = "VIDEO"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0335
            goto L_0x032a
        L_0x0335:
            r4 = 3
            goto L_0x0357
        L_0x0337:
            java.lang.String r14 = "AUDIO"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0340
            goto L_0x032a
        L_0x0340:
            r4 = 2
            goto L_0x0357
        L_0x0342:
            java.lang.String r14 = "CLOSED-CAPTIONS"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x034b
            goto L_0x032a
        L_0x034b:
            r4 = 1
            goto L_0x0357
        L_0x034d:
            java.lang.String r14 = "SUBTITLES"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x0356
            goto L_0x032a
        L_0x0356:
            r4 = 0
        L_0x0357:
            switch(r4) {
                case 0: goto L_0x0463;
                case 1: goto L_0x041f;
                case 2: goto L_0x03ac;
                case 3: goto L_0x0366;
                default: goto L_0x035a;
            }
        L_0x035a:
            r21 = r9
            r6 = r31
            r9 = r32
            r14 = r33
        L_0x0362:
            r16 = 0
            goto L_0x04a8
        L_0x0366:
            h3.h$b r4 = m29507h(r2, r6)
            if (r4 == 0) goto L_0x0391
            z1.r1 r4 = r4.f24752b
            java.lang.String r5 = r4.f30240i
            java.lang.String r5 = p161w3.C5953m0.m35090L(r5, r15)
            z1.r1$b r14 = r10.mo21495I(r5)
            java.lang.String r5 = p161w3.C5967v.m35243g(r5)
            z1.r1$b r5 = r14.mo21517e0(r5)
            int r14 = r4.f30248y
            z1.r1$b r5 = r5.mo21522j0(r14)
            int r14 = r4.f30249z
            z1.r1$b r5 = r5.mo21503Q(r14)
            float r4 = r4.f30218A
            r5.mo21502P(r4)
        L_0x0391:
            if (r12 != 0) goto L_0x0394
            goto L_0x035a
        L_0x0394:
            r10.mo21510X(r8)
            h3.h$a r4 = new h3.h$a
            z1.r1 r5 = r10.mo21491E()
            r4.<init>(r12, r5, r6, r7)
            r14 = r33
            r14.add(r4)
            r21 = r9
            r6 = r31
            r9 = r32
            goto L_0x0362
        L_0x03ac:
            r14 = r33
            h3.h$b r4 = m29505f(r2, r6)
            if (r4 == 0) goto L_0x03c7
            z1.r1 r15 = r4.f24752b
            java.lang.String r15 = r15.f30240i
            r21 = r9
            r9 = 1
            java.lang.String r15 = p161w3.C5953m0.m35090L(r15, r9)
            r10.mo21495I(r15)
            java.lang.String r15 = p161w3.C5967v.m35243g(r15)
            goto L_0x03ca
        L_0x03c7:
            r21 = r9
            r15 = 0
        L_0x03ca:
            java.util.regex.Pattern r9 = f24794i
            java.lang.String r5 = m29520v(r5, r9, r11)
            if (r5 == 0) goto L_0x03fb
            java.lang.String r9 = "/"
            java.lang.String[] r9 = p161w3.C5953m0.m35103R0(r5, r9)
            r16 = 0
            r9 = r9[r16]
            int r9 = java.lang.Integer.parseInt(r9)
            r10.mo21494H(r9)
            java.lang.String r9 = "audio/eac3"
            boolean r9 = r9.equals(r15)
            if (r9 == 0) goto L_0x03fd
            java.lang.String r9 = "/JOC"
            boolean r5 = r5.endsWith(r9)
            if (r5 == 0) goto L_0x03fd
            java.lang.String r5 = "ec+3"
            r10.mo21495I(r5)
            java.lang.String r15 = "audio/eac3-joc"
            goto L_0x03fd
        L_0x03fb:
            r16 = 0
        L_0x03fd:
            r10.mo21517e0(r15)
            if (r12 == 0) goto L_0x0414
            r10.mo21510X(r8)
            h3.h$a r4 = new h3.h$a
            z1.r1 r5 = r10.mo21491E()
            r4.<init>(r12, r5, r6, r7)
            r9 = r32
            r9.add(r4)
            goto L_0x0460
        L_0x0414:
            r9 = r32
            if (r4 == 0) goto L_0x0460
            z1.r1 r4 = r10.mo21491E()
            r21 = r4
            goto L_0x0460
        L_0x041f:
            r21 = r9
            r9 = r32
            r14 = r33
            r16 = 0
            java.util.regex.Pattern r4 = f24778S
            java.lang.String r4 = m29524z(r5, r4, r11)
            java.lang.String r5 = "CC"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0440
            java.lang.String r4 = r4.substring(r15)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-608"
            goto L_0x044b
        L_0x0440:
            r5 = 7
            java.lang.String r4 = r4.substring(r5)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-708"
        L_0x044b:
            if (r1 != 0) goto L_0x0452
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0452:
            z1.r1$b r5 = r10.mo21517e0(r5)
            r5.mo21492F(r4)
            z1.r1 r4 = r10.mo21491E()
            r1.add(r4)
        L_0x0460:
            r6 = r31
            goto L_0x04a8
        L_0x0463:
            r21 = r9
            r9 = r32
            r14 = r33
            r16 = 0
            h3.h$b r4 = m29506g(r2, r6)
            if (r4 == 0) goto L_0x0482
            z1.r1 r4 = r4.f24752b
            java.lang.String r4 = r4.f30240i
            r5 = 3
            java.lang.String r4 = p161w3.C5953m0.m35090L(r4, r5)
            r10.mo21495I(r4)
            java.lang.String r4 = p161w3.C5967v.m35243g(r4)
            goto L_0x0483
        L_0x0482:
            r4 = 0
        L_0x0483:
            if (r4 != 0) goto L_0x0487
            java.lang.String r4 = "text/vtt"
        L_0x0487:
            z1.r1$b r4 = r10.mo21517e0(r4)
            r4.mo21510X(r8)
            if (r12 == 0) goto L_0x049f
            h3.h$a r4 = new h3.h$a
            z1.r1 r5 = r10.mo21491E()
            r4.<init>(r12, r5, r6, r7)
            r6 = r31
            r6.add(r4)
            goto L_0x04a8
        L_0x049f:
            r6 = r31
            java.lang.String r4 = "HlsPlaylistParser"
            java.lang.String r5 = "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"
            p161w3.C5961r.m35215i(r4, r5)
        L_0x04a8:
            int r0 = r0 + 1
            r31 = r6
            r32 = r9
            r33 = r14
            r15 = r20
            r9 = r21
            r8 = 0
            goto L_0x0298
        L_0x04b7:
            r21 = r9
            r6 = r31
            r9 = r32
            r14 = r33
            if (r13 == 0) goto L_0x04c7
            java.util.List r0 = java.util.Collections.emptyList()
            r10 = r0
            goto L_0x04c8
        L_0x04c7:
            r10 = r1
        L_0x04c8:
            h3.h r13 = new h3.h
            r0 = r13
            r1 = r37
            r2 = r30
            r4 = r14
            r5 = r9
            r7 = r29
            r8 = r21
            r9 = r10
            r10 = r19
            r12 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p059h3.C4460j.m29514p(h3.j$b, java.lang.String):h3.h");
    }

    /* renamed from: q */
    private static boolean m29515q(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z;
    }

    /* renamed from: r */
    private static double m29516r(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) C5917a.m34872e(matcher.group(1))) : d;
    }

    /* renamed from: s */
    private static int m29517s(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) C5917a.m34872e(matcher.group(1))) : i;
    }

    /* renamed from: t */
    private static long m29518t(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) C5917a.m34872e(matcher.group(1))) : j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m29519u(java.lang.String r0, java.util.regex.Pattern r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
        /*
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x0016
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            java.lang.Object r0 = p161w3.C5917a.m34872e(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0016:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0023
            if (r2 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            java.lang.String r2 = m29499B(r2, r3)
        L_0x0023:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p059h3.C4460j.m29519u(java.lang.String, java.util.regex.Pattern, java.lang.String, java.util.Map):java.lang.String");
    }

    /* renamed from: v */
    private static String m29520v(String str, Pattern pattern, Map<String, String> map) {
        return m29519u(str, pattern, (String) null, map);
    }

    /* renamed from: w */
    private static int m29521w(String str, Map<String, String> map) {
        String v = m29520v(str, f24777R, map);
        int i = 0;
        if (TextUtils.isEmpty(v)) {
            return 0;
        }
        String[] Q0 = C5953m0.m35101Q0(v, ",");
        if (C5953m0.m35156s(Q0, "public.accessibility.describes-video")) {
            i = 512;
        }
        if (C5953m0.m35156s(Q0, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (C5953m0.m35156s(Q0, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        return C5953m0.m35156s(Q0, "public.easy-to-read") ? i | 8192 : i;
    }

    /* renamed from: x */
    private static int m29522x(String str) {
        boolean q = m29515q(str, f24780U, false);
        if (m29515q(str, f24781V, false)) {
            q |= true;
        }
        return m29515q(str, f24779T, false) ? q | true ? 1 : 0 : q ? 1 : 0;
    }

    /* renamed from: y */
    private static C4449g.C4455f m29523y(String str) {
        String str2 = str;
        double r = m29516r(str2, f24803r, -9.223372036854776E18d);
        long j = -9223372036854775807L;
        long j2 = r == -9.223372036854776E18d ? -9223372036854775807L : (long) (r * 1000000.0d);
        boolean q = m29515q(str2, f24804s, false);
        double r2 = m29516r(str2, f24806u, -9.223372036854776E18d);
        long j3 = r2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r2 * 1000000.0d);
        double r3 = m29516r(str2, f24807v, -9.223372036854776E18d);
        if (r3 != -9.223372036854776E18d) {
            j = (long) (r3 * 1000000.0d);
        }
        return new C4449g.C4455f(j2, q, j3, j, m29515q(str2, f24808w, false));
    }

    /* renamed from: z */
    private static String m29524z(String str, Pattern pattern, Map<String, String> map) throws C6249m2 {
        String v = m29520v(str, pattern, map);
        if (v != null) {
            return v;
        }
        throw C6249m2.m36663c("Couldn't match " + pattern.pattern() + " in " + str, (Throwable) null);
    }

    /* renamed from: i */
    public C4459i mo216a(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (m29501b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                                if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    break;
                                } else if (trim.equals("#EXT-X-ENDLIST")) {
                                    break;
                                } else {
                                    arrayDeque.add(trim);
                                }
                            } else {
                                arrayDeque.add(trim);
                                C4456h p = m29514p(new C4462b(arrayDeque, bufferedReader), uri.toString());
                                C5953m0.m35146n(bufferedReader);
                                return p;
                            }
                        }
                    } else {
                        C5953m0.m35146n(bufferedReader);
                        throw C6249m2.m36663c("Failed to parse the playlist, could not identify any tags.", (Throwable) null);
                    }
                }
                arrayDeque.add(trim);
                return m29513o(this.f24812a, this.f24813b, new C4462b(arrayDeque, bufferedReader), uri.toString());
            }
            throw C6249m2.m36663c("Input does not start with the #EXTM3U header.", (Throwable) null);
        } finally {
            C5953m0.m35146n(bufferedReader);
        }
    }

    public C4460j(C4456h hVar, C4449g gVar) {
        this.f24812a = hVar;
        this.f24813b = gVar;
    }
}
