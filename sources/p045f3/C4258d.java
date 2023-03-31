package p045f3;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p030d2.C4035m;
import p045f3.C4269k;
import p141t2.C5507a;
import p155v3.C5823j0;
import p161w3.C5917a;
import p161w3.C5947k0;
import p161w3.C5953m0;
import p161w3.C5956n0;
import p161w3.C5961r;
import p161w3.C5967v;
import p177z1.C6227i;
import p177z1.C6249m2;
import p177z1.C6272r1;
import p182a7.C6408b;
import p182a7.C6415d;
import p190b7.C6685q;
import p190b7.C6703w;

/* renamed from: f3.d */
/* compiled from: DashManifestParser */
public class C4258d extends DefaultHandler implements C5823j0.C5824a<C4257c> {

    /* renamed from: b */
    private static final Pattern f23660b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c */
    private static final Pattern f23661c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d */
    private static final Pattern f23662d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e */
    private static final int[] f23663e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a */
    private final XmlPullParserFactory f23664a;

    /* renamed from: f3.d$a */
    /* compiled from: DashManifestParser */
    protected static final class C4259a {

        /* renamed from: a */
        public final C6272r1 f23665a;

        /* renamed from: b */
        public final C6685q<C4256b> f23666b;

        /* renamed from: c */
        public final C4269k f23667c;

        /* renamed from: d */
        public final String f23668d;

        /* renamed from: e */
        public final ArrayList<C4035m.C4037b> f23669e;

        /* renamed from: f */
        public final ArrayList<C4260e> f23670f;

        /* renamed from: g */
        public final long f23671g;

        /* renamed from: h */
        public final List<C4260e> f23672h;

        /* renamed from: i */
        public final List<C4260e> f23673i;

        public C4259a(C6272r1 r1Var, List<C4256b> list, C4269k kVar, String str, ArrayList<C4035m.C4037b> arrayList, ArrayList<C4260e> arrayList2, List<C4260e> list2, List<C4260e> list3, long j) {
            this.f23665a = r1Var;
            this.f23666b = C6685q.m38443t(list);
            this.f23667c = kVar;
            this.f23668d = str;
            this.f23669e = arrayList;
            this.f23670f = arrayList2;
            this.f23672h = list2;
            this.f23673i = list3;
            this.f23671g = j;
        }
    }

    public C4258d() {
        try {
            this.f23664a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: D */
    protected static int m28679D(List<C4260e> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C4260e eVar = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f23674a) && (str = eVar.f23675b) != null) {
                Matcher matcher = f23661c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C5961r.m35215i("MpdParser", "Unable to parse CEA-608 channel number from: " + eVar.f23675b);
            }
        }
        return -1;
    }

    /* renamed from: E */
    protected static int m28680E(List<C4260e> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C4260e eVar = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f23674a) && (str = eVar.f23675b) != null) {
                Matcher matcher = f23662d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C5961r.m35215i("MpdParser", "Unable to parse CEA-708 service block number from: " + eVar.f23675b);
            }
        }
        return -1;
    }

    /* renamed from: H */
    protected static long m28681H(XmlPullParser xmlPullParser, String str, long j) throws C6249m2 {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        return C5953m0.m35085I0(attributeValue);
    }

    /* renamed from: I */
    protected static C4260e m28682I(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String r0 = m28698r0(xmlPullParser, "schemeIdUri", "");
        String r02 = m28698r0(xmlPullParser, "value", (String) null);
        String r03 = m28698r0(xmlPullParser, "id", (String) null);
        do {
            xmlPullParser.next();
        } while (!C5956n0.m35187d(xmlPullParser, str));
        return new C4260e(r0, r02, r03);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static int m28683J(org.xmlpull.v1.XmlPullParser r4) {
        /*
            r0 = 0
            java.lang.String r1 = "value"
            java.lang.String r4 = r4.getAttributeValue(r0, r1)
            r0 = -1
            if (r4 != 0) goto L_0x000b
            return r0
        L_0x000b:
            java.lang.String r4 = p182a7.C6408b.m37506e(r4)
            r4.hashCode()
            int r1 = r4.hashCode()
            r2 = 2
            r3 = 1
            switch(r1) {
                case 1596796: goto L_0x003e;
                case 2937391: goto L_0x0033;
                case 3094035: goto L_0x0028;
                case 3133436: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            r4 = -1
            goto L_0x0048
        L_0x001d:
            java.lang.String r1 = "fa01"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0026
            goto L_0x001b
        L_0x0026:
            r4 = 3
            goto L_0x0048
        L_0x0028:
            java.lang.String r1 = "f801"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0031
            goto L_0x001b
        L_0x0031:
            r4 = 2
            goto L_0x0048
        L_0x0033:
            java.lang.String r1 = "a000"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x003c
            goto L_0x001b
        L_0x003c:
            r4 = 1
            goto L_0x0048
        L_0x003e:
            java.lang.String r1 = "4000"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0047
            goto L_0x001b
        L_0x0047:
            r4 = 0
        L_0x0048:
            switch(r4) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0051;
                case 2: goto L_0x004f;
                case 3: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            return r0
        L_0x004c:
            r4 = 8
            return r4
        L_0x004f:
            r4 = 6
            return r4
        L_0x0051:
            return r2
        L_0x0052:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p045f3.C4258d.m28683J(org.xmlpull.v1.XmlPullParser):int");
    }

    /* renamed from: K */
    protected static int m28684K(XmlPullParser xmlPullParser) {
        int U = m28690U(xmlPullParser, "value", -1);
        if (U <= 0 || U >= 33) {
            return -1;
        }
        return U;
    }

    /* renamed from: L */
    protected static int m28685L(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    /* renamed from: M */
    protected static long m28686M(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        return C5953m0.m35087J0(attributeValue);
    }

    /* renamed from: N */
    protected static String m28687N(List<C4260e> list) {
        for (int i = 0; i < list.size(); i++) {
            C4260e eVar = list.get(i);
            String str = eVar.f23674a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f23675b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.f23675b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* renamed from: R */
    protected static float m28688R(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? f : Float.parseFloat(attributeValue);
    }

    /* renamed from: S */
    protected static float m28689S(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f23660b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        return !TextUtils.isEmpty(group) ? ((float) parseInt) / ((float) Integer.parseInt(group)) : (float) parseInt;
    }

    /* renamed from: U */
    protected static int m28690U(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    /* renamed from: W */
    protected static long m28691W(List<C4260e> list) {
        for (int i = 0; i < list.size(); i++) {
            C4260e eVar = list.get(i);
            if (C6408b.m37502a("http://dashif.org/guidelines/last-segment-number", eVar.f23674a)) {
                return Long.parseLong(eVar.f23675b);
            }
        }
        return -1;
    }

    /* renamed from: X */
    protected static long m28692X(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* renamed from: Z */
    protected static int m28693Z(XmlPullParser xmlPullParser) {
        int U = m28690U(xmlPullParser, "value", -1);
        if (U < 0) {
            return -1;
        }
        int[] iArr = f23663e;
        if (U < iArr.length) {
            return iArr[U];
        }
        return -1;
    }

    /* renamed from: b */
    private long m28694b(List<C4269k.C4273d> list, long j, long j2, int i, long j3) {
        int m = i >= 0 ? i + 1 : (int) C5953m0.m35144m(j3 - j, j2);
        for (int i2 = 0; i2 < m; i2++) {
            list.add(mo17661m(j, j2));
            j += j2;
        }
        return j;
    }

    /* renamed from: p */
    private static int m28695p(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        C5917a.m34873f(i == i2);
        return i;
    }

    /* renamed from: q */
    private static String m28696q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        C5917a.m34873f(str.equals(str2));
        return str;
    }

    /* renamed from: r */
    private static void m28697r(ArrayList<C4035m.C4037b> arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            C4035m.C4037b bVar = arrayList.get(i);
            if (C6227i.f29962c.equals(bVar.f23117b) && (str = bVar.f23118c) != null) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C4035m.C4037b bVar2 = arrayList.get(i2);
                if (C6227i.f29961b.equals(bVar2.f23117b) && bVar2.f23118c == null) {
                    arrayList.set(i2, new C4035m.C4037b(C6227i.f29962c, str, bVar2.f23119d, bVar2.f23120e));
                }
            }
        }
    }

    /* renamed from: r0 */
    protected static String m28698r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* renamed from: s */
    private static void m28699s(ArrayList<C4035m.C4037b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C4035m.C4037b bVar = arrayList.get(size);
            if (!bVar.mo17242c()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (arrayList.get(i).mo17240a(bVar)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* renamed from: s0 */
    protected static String m28700s0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                m28704w(xmlPullParser);
            }
        } while (!C5956n0.m35187d(xmlPullParser, str));
        return str2;
    }

    /* renamed from: t */
    private static long m28701t(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: u */
    private static String m28702u(String str, String str2) {
        if (C5967v.m35251o(str)) {
            return C5967v.m35239c(str2);
        }
        if (C5967v.m35255s(str)) {
            return C5967v.m35250n(str2);
        }
        if (C5967v.m35254r(str) || C5967v.m35252p(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String g = C5967v.m35243g(str2);
        return "text/vtt".equals(g) ? "application/x-mp4-vtt" : g;
    }

    /* renamed from: v */
    private boolean m28703v(String[] strArr) {
        for (String startsWith : strArr) {
            if (startsWith.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    public static void m28704w(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (C5956n0.m35188e(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (C5956n0.m35188e(xmlPullParser)) {
                    i++;
                } else if (C5956n0.m35186c(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo17628A(org.xmlpull.v1.XmlPullParser r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = m28698r0(r4, r0, r1)
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -2128649360: goto L_0x0056;
                case -1352850286: goto L_0x004b;
                case -1138141449: goto L_0x0040;
                case -986633423: goto L_0x0035;
                case -79006963: goto L_0x002a;
                case 312179081: goto L_0x001f;
                case 2036691300: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            r0 = -1
            goto L_0x0060
        L_0x0014:
            java.lang.String r1 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001d
            goto L_0x0012
        L_0x001d:
            r0 = 6
            goto L_0x0060
        L_0x001f:
            java.lang.String r1 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0028
            goto L_0x0012
        L_0x0028:
            r0 = 5
            goto L_0x0060
        L_0x002a:
            java.lang.String r1 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0033
            goto L_0x0012
        L_0x0033:
            r0 = 4
            goto L_0x0060
        L_0x0035:
            java.lang.String r1 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003e
            goto L_0x0012
        L_0x003e:
            r0 = 3
            goto L_0x0060
        L_0x0040:
            java.lang.String r1 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0049
            goto L_0x0012
        L_0x0049:
            r0 = 2
            goto L_0x0060
        L_0x004b:
            java.lang.String r1 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0054
            goto L_0x0012
        L_0x0054:
            r0 = 1
            goto L_0x0060
        L_0x0056:
            java.lang.String r1 = "urn:dts:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005f
            goto L_0x0012
        L_0x005f:
            r0 = 0
        L_0x0060:
            switch(r0) {
                case 0: goto L_0x007a;
                case 1: goto L_0x0073;
                case 2: goto L_0x006e;
                case 3: goto L_0x0069;
                case 4: goto L_0x007a;
                case 5: goto L_0x0064;
                case 6: goto L_0x006e;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x007e
        L_0x0064:
            int r2 = m28685L(r4)
            goto L_0x007e
        L_0x0069:
            int r2 = m28693Z(r4)
            goto L_0x007e
        L_0x006e:
            int r2 = m28683J(r4)
            goto L_0x007e
        L_0x0073:
            java.lang.String r0 = "value"
            int r2 = m28690U(r4, r0, r2)
            goto L_0x007e
        L_0x007a:
            int r2 = m28684K(r4)
        L_0x007e:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = p161w3.C5956n0.m35187d(r4, r0)
            if (r0 == 0) goto L_0x007e
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p045f3.C4258d.mo17628A(org.xmlpull.v1.XmlPullParser):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public long mo17629B(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public List<C4256b> mo17630C(XmlPullParser xmlPullParser, List<C4256b> list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : RecyclerView.UNDEFINED_DURATION;
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "serviceLocation");
        String s0 = m28700s0(xmlPullParser, "BaseURL");
        if (C5947k0.m35052b(s0)) {
            if (attributeValue3 == null) {
                attributeValue3 = s0;
            }
            return C6703w.m38539j(new C4256b(s0, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C4256b bVar = list.get(i);
            String d = C5947k0.m35054d(bVar.f23643a, s0);
            String str = attributeValue3 == null ? d : attributeValue3;
            if (z) {
                parseInt = bVar.f23645c;
                parseInt2 = bVar.f23646d;
                str = bVar.f23644b;
            }
            arrayList.add(new C4256b(d, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: java.lang.String} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
        r1 = null;
        r4 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.String, p030d2.C4035m.C4037b> mo17631F(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "schemeIdUri"
            java.lang.String r1 = r11.getAttributeValue(r0, r1)
            r2 = 0
            if (r1 == 0) goto L_0x0090
            java.lang.String r1 = p182a7.C6408b.m37506e(r1)
            r1.hashCode()
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -1980789791: goto L_0x003b;
                case 489446379: goto L_0x0030;
                case 755418770: goto L_0x0025;
                case 1812765994: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0045
        L_0x001a:
            java.lang.String r4 = "urn:mpeg:dash:mp4protection:2011"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0023
            goto L_0x0045
        L_0x0023:
            r3 = 3
            goto L_0x0045
        L_0x0025:
            java.lang.String r4 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x002e
            goto L_0x0045
        L_0x002e:
            r3 = 2
            goto L_0x0045
        L_0x0030:
            java.lang.String r4 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0039
            goto L_0x0045
        L_0x0039:
            r3 = 1
            goto L_0x0045
        L_0x003b:
            java.lang.String r4 = "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            switch(r3) {
                case 0: goto L_0x008d;
                case 1: goto L_0x0088;
                case 2: goto L_0x0085;
                case 3: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0090
        L_0x0049:
            java.lang.String r1 = "value"
            java.lang.String r1 = r11.getAttributeValue(r0, r1)
            java.lang.String r3 = "default_KID"
            java.lang.String r3 = p161w3.C5956n0.m35185b(r11, r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0083
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0083
            java.lang.String r4 = "\\s+"
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            java.util.UUID[] r4 = new java.util.UUID[r4]
            r5 = 0
        L_0x006d:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x007b
            r6 = r3[r5]
            java.util.UUID r6 = java.util.UUID.fromString(r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x006d
        L_0x007b:
            java.util.UUID r3 = p177z1.C6227i.f29961b
            byte[] r4 = p092m2.C5023l.m31709b(r3, r4, r0)
            r5 = r0
            goto L_0x0094
        L_0x0083:
            r3 = r0
            goto L_0x0092
        L_0x0085:
            java.util.UUID r3 = p177z1.C6227i.f29963d
            goto L_0x008a
        L_0x0088:
            java.util.UUID r3 = p177z1.C6227i.f29964e
        L_0x008a:
            r1 = r0
            r4 = r1
            goto L_0x0093
        L_0x008d:
            java.util.UUID r3 = p177z1.C6227i.f29962c
            goto L_0x008a
        L_0x0090:
            r1 = r0
            r3 = r1
        L_0x0092:
            r4 = r3
        L_0x0093:
            r5 = r4
        L_0x0094:
            r11.next()
            java.lang.String r6 = "clearkey:Laurl"
            boolean r6 = p161w3.C5956n0.m35189f(r11, r6)
            r7 = 4
            if (r6 == 0) goto L_0x00ac
            int r6 = r11.next()
            if (r6 != r7) goto L_0x00ac
            java.lang.String r5 = r11.getText()
            goto L_0x010f
        L_0x00ac:
            java.lang.String r6 = "ms:laurl"
            boolean r6 = p161w3.C5956n0.m35189f(r11, r6)
            if (r6 == 0) goto L_0x00bb
            java.lang.String r5 = "licenseUrl"
            java.lang.String r5 = r11.getAttributeValue(r0, r5)
            goto L_0x010f
        L_0x00bb:
            if (r4 != 0) goto L_0x00e7
            java.lang.String r6 = "pssh"
            boolean r6 = p161w3.C5956n0.m35190g(r11, r6)
            if (r6 == 0) goto L_0x00e7
            int r6 = r11.next()
            if (r6 != r7) goto L_0x00e7
            java.lang.String r3 = r11.getText()
            byte[] r3 = android.util.Base64.decode(r3, r2)
            java.util.UUID r4 = p092m2.C5023l.m31713f(r3)
            if (r4 != 0) goto L_0x00e3
            java.lang.String r3 = "MpdParser"
            java.lang.String r6 = "Skipping malformed cenc:pssh data"
            p161w3.C5961r.m35215i(r3, r6)
            r3 = r4
            r4 = r0
            goto L_0x010f
        L_0x00e3:
            r9 = r4
            r4 = r3
            r3 = r9
            goto L_0x010f
        L_0x00e7:
            if (r4 != 0) goto L_0x010c
            java.util.UUID r6 = p177z1.C6227i.f29964e
            boolean r8 = r6.equals(r3)
            if (r8 == 0) goto L_0x010c
            java.lang.String r8 = "mspr:pro"
            boolean r8 = p161w3.C5956n0.m35189f(r11, r8)
            if (r8 == 0) goto L_0x010c
            int r8 = r11.next()
            if (r8 != r7) goto L_0x010c
            java.lang.String r4 = r11.getText()
            byte[] r4 = android.util.Base64.decode(r4, r2)
            byte[] r4 = p092m2.C5023l.m31708a(r6, r4)
            goto L_0x010f
        L_0x010c:
            m28704w(r11)
        L_0x010f:
            java.lang.String r6 = "ContentProtection"
            boolean r6 = p161w3.C5956n0.m35187d(r11, r6)
            if (r6 == 0) goto L_0x0094
            if (r3 == 0) goto L_0x0120
            d2.m$b r0 = new d2.m$b
            java.lang.String r11 = "video/mp4"
            r0.<init>(r3, r5, r11, r4)
        L_0x0120:
            android.util.Pair r11 = android.util.Pair.create(r1, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p045f3.C4258d.mo17631F(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public int mo17632G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public Pair<Long, C5507a> mo17633O(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long X = m28692X(xmlPullParser2, "id", 0);
        long X2 = m28692X(xmlPullParser2, "duration", -9223372036854775807L);
        long X3 = m28692X(xmlPullParser2, "presentationTime", 0);
        long N0 = C5953m0.m35095N0(X2, 1000, j);
        long N02 = C5953m0.m35095N0(X3, 1000000, j);
        String r0 = m28698r0(xmlPullParser2, "messageData", (String) null);
        byte[] P = mo17634P(xmlPullParser2, byteArrayOutputStream);
        Long valueOf = Long.valueOf(N02);
        if (r0 != null) {
            P = C5953m0.m35145m0(r0);
        }
        return Pair.create(valueOf, mo17643d(str, str2, X, N0, P));
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public byte[] mo17634P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, C6415d.f30664c.name());
        xmlPullParser.nextToken();
        while (!C5956n0.m35187d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument((String) null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public C4261f mo17635Q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String r0 = m28698r0(xmlPullParser, "schemeIdUri", "");
        String r02 = m28698r0(xmlPullParser, "value", "");
        long X = m28692X(xmlPullParser, "timescale", 1);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (C5956n0.m35189f(xmlPullParser, "Event")) {
                arrayList.add(mo17633O(xmlPullParser, r0, r02, X, byteArrayOutputStream));
            } else {
                m28704w(xmlPullParser);
            }
        } while (!C5956n0.m35187d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        C5507a[] aVarArr = new C5507a[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            aVarArr[i] = (C5507a) pair.second;
        }
        return mo17645e(r0, r02, X, jArr, aVarArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public C4264i mo17636T(XmlPullParser xmlPullParser) {
        return mo17644d0(xmlPullParser, "sourceURL", "range");
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public String mo17637V(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return m28700s0(xmlPullParser, "Label");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e6 A[LOOP:0: B:23:0x00a4->B:79:0x01e6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a2 A[SYNTHETIC] */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p045f3.C4257c mo17638Y(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r46 = this;
            r14 = r46
            r12 = r47
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "profiles"
            java.lang.String[] r1 = r14.mo17640b0(r12, r2, r1)
            boolean r13 = r14.m28703v(r1)
            java.lang.String r1 = "availabilityStartTime"
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r15 = m28681H(r12, r1, r9)
            java.lang.String r1 = "mediaPresentationDuration"
            long r17 = m28686M(r12, r1, r9)
            java.lang.String r1 = "minBufferTime"
            long r19 = m28686M(r12, r1, r9)
            r11 = 0
            java.lang.String r1 = "type"
            java.lang.String r1 = r12.getAttributeValue(r11, r1)
            java.lang.String r2 = "dynamic"
            boolean r21 = r2.equals(r1)
            if (r21 == 0) goto L_0x0040
            java.lang.String r1 = "minimumUpdatePeriod"
            long r1 = m28686M(r12, r1, r9)
            r22 = r1
            goto L_0x0042
        L_0x0040:
            r22 = r9
        L_0x0042:
            if (r21 == 0) goto L_0x004d
            java.lang.String r1 = "timeShiftBufferDepth"
            long r1 = m28686M(r12, r1, r9)
            r24 = r1
            goto L_0x004f
        L_0x004d:
            r24 = r9
        L_0x004f:
            if (r21 == 0) goto L_0x005a
            java.lang.String r1 = "suggestedPresentationDelay"
            long r1 = m28686M(r12, r1, r9)
            r26 = r1
            goto L_0x005c
        L_0x005a:
            r26 = r9
        L_0x005c:
            java.lang.String r1 = "publishTime"
            long r28 = m28681H(r12, r1, r9)
            if (r21 == 0) goto L_0x0067
            r3 = 0
            goto L_0x0068
        L_0x0067:
            r3 = r9
        L_0x0068:
            f3.b r5 = new f3.b
            java.lang.String r6 = r48.toString()
            java.lang.String r7 = r48.toString()
            r8 = 1
            if (r13 == 0) goto L_0x0077
            r1 = 1
            goto L_0x007b
        L_0x0077:
            r30 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007b:
            r5.<init>(r6, r7, r1, r8)
            f3.b[] r1 = new p045f3.C4256b[r8]
            r1[r0] = r5
            java.util.ArrayList r7 = p190b7.C6703w.m38539j(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r21 == 0) goto L_0x0094
            r1 = r9
            goto L_0x0096
        L_0x0094:
            r1 = 0
        L_0x0096:
            r32 = r1
            r34 = r11
            r35 = r34
            r36 = r35
            r37 = r36
            r30 = 0
            r31 = 0
        L_0x00a4:
            r47.next()
            java.lang.String r0 = "BaseURL"
            boolean r0 = p161w3.C5956n0.m35189f(r12, r0)
            if (r0 == 0) goto L_0x00bf
            if (r30 != 0) goto L_0x00b7
            long r3 = r14.mo17629B(r12, r3)
            r30 = 1
        L_0x00b7:
            java.util.List r0 = r14.mo17630C(r12, r7, r13)
            r6.addAll(r0)
            goto L_0x00cd
        L_0x00bf:
            java.lang.String r0 = "ProgramInformation"
            boolean r0 = p161w3.C5956n0.m35189f(r12, r0)
            if (r0 == 0) goto L_0x00d9
            f3.h r0 = r46.mo17642c0(r47)
            r34 = r0
        L_0x00cd:
            r41 = r6
            r43 = r7
            r44 = r9
            r14 = r11
            r42 = 1
            r11 = r5
            goto L_0x019a
        L_0x00d9:
            java.lang.String r0 = "UTCTiming"
            boolean r0 = p161w3.C5956n0.m35189f(r12, r0)
            if (r0 == 0) goto L_0x00e8
            f3.o r0 = r46.mo17671v0(r47)
            r35 = r0
            goto L_0x00cd
        L_0x00e8:
            java.lang.String r0 = "Location"
            boolean r0 = p161w3.C5956n0.m35189f(r12, r0)
            if (r0 == 0) goto L_0x00ff
            java.lang.String r0 = r48.toString()
            java.lang.String r1 = r47.nextText()
            android.net.Uri r0 = p161w3.C5947k0.m35055e(r0, r1)
            r36 = r0
            goto L_0x00cd
        L_0x00ff:
            java.lang.String r0 = "ServiceDescription"
            boolean r0 = p161w3.C5956n0.m35189f(r12, r0)
            if (r0 == 0) goto L_0x010e
            f3.l r0 = r46.mo17668q0(r47)
            r37 = r0
            goto L_0x00cd
        L_0x010e:
            java.lang.String r0 = "Period"
            boolean r0 = p161w3.C5956n0.m35189f(r12, r0)
            if (r0 == 0) goto L_0x0189
            if (r31 != 0) goto L_0x0189
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0120
            r2 = r6
            goto L_0x0121
        L_0x0120:
            r2 = r7
        L_0x0121:
            r0 = r46
            r1 = r47
            r38 = r3
            r3 = r32
            r40 = r5
            r41 = r6
            r5 = r38
            r43 = r7
            r42 = 1
            r7 = r15
            r44 = r9
            r9 = r24
            r14 = r11
            r11 = r13
            android.util.Pair r0 = r0.mo17639a0(r1, r2, r3, r5, r7, r9, r11)
            java.lang.Object r1 = r0.first
            f3.g r1 = (p045f3.C4262g) r1
            long r2 = r1.f23683b
            int r4 = (r2 > r44 ? 1 : (r2 == r44 ? 0 : -1))
            if (r4 != 0) goto L_0x0168
            if (r21 == 0) goto L_0x014e
            r11 = r40
            r8 = 1
            goto L_0x0186
        L_0x014e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to determine start of period "
            r0.append(r1)
            int r1 = r40.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            z1.m2 r0 = p177z1.C6249m2.m36663c(r0, r14)
            throw r0
        L_0x0168:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            int r0 = (r2 > r44 ? 1 : (r2 == r44 ? 0 : -1))
            if (r0 != 0) goto L_0x0179
            r11 = r40
            r9 = r44
            goto L_0x017f
        L_0x0179:
            long r4 = r1.f23683b
            long r9 = r4 + r2
            r11 = r40
        L_0x017f:
            r11.add(r1)
            r32 = r9
            r8 = r31
        L_0x0186:
            r31 = r8
            goto L_0x0198
        L_0x0189:
            r38 = r3
            r41 = r6
            r43 = r7
            r44 = r9
            r14 = r11
            r42 = 1
            r11 = r5
            m28704w(r47)
        L_0x0198:
            r3 = r38
        L_0x019a:
            java.lang.String r0 = "MPD"
            boolean r0 = p161w3.C5956n0.m35187d(r12, r0)
            if (r0 == 0) goto L_0x01e6
            int r0 = (r17 > r44 ? 1 : (r17 == r44 ? 0 : -1))
            if (r0 != 0) goto L_0x01b7
            int r0 = (r32 > r44 ? 1 : (r32 == r44 ? 0 : -1))
            if (r0 == 0) goto L_0x01ad
            r3 = r32
            goto L_0x01b9
        L_0x01ad:
            if (r21 == 0) goto L_0x01b0
            goto L_0x01b7
        L_0x01b0:
            java.lang.String r0 = "Unable to determine duration of static manifest."
            z1.m2 r0 = p177z1.C6249m2.m36663c(r0, r14)
            throw r0
        L_0x01b7:
            r3 = r17
        L_0x01b9:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x01df
            r0 = r46
            r1 = r15
            r5 = r19
            r7 = r21
            r8 = r22
            r38 = r11
            r10 = r24
            r12 = r26
            r14 = r28
            r16 = r34
            r17 = r35
            r18 = r37
            r19 = r36
            r20 = r38
            f3.c r0 = r0.mo17649g(r1, r3, r5, r7, r8, r10, r12, r14, r16, r17, r18, r19, r20)
            return r0
        L_0x01df:
            java.lang.String r0 = "No periods found."
            z1.m2 r0 = p177z1.C6249m2.m36663c(r0, r14)
            throw r0
        L_0x01e6:
            r5 = r11
            r11 = r14
            r6 = r41
            r7 = r43
            r9 = r44
            r8 = 1
            r14 = r46
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: p045f3.C4258d.mo17638Y(org.xmlpull.v1.XmlPullParser, android.net.Uri):f3.c");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public Pair<C4262g, Long> mo17639a0(XmlPullParser xmlPullParser, List<C4256b> list, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException {
        long j5;
        ArrayList arrayList;
        Object obj;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j6;
        long j7;
        C4269k l0;
        C4258d dVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "id");
        long M = m28686M(xmlPullParser2, "start", j);
        long j8 = -9223372036854775807L;
        long j9 = j3 != -9223372036854775807L ? j3 + M : -9223372036854775807L;
        long M2 = m28686M(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j10 = j2;
        long j11 = -9223372036854775807L;
        C4269k kVar = null;
        C4260e eVar = null;
        boolean z2 = false;
        while (true) {
            xmlPullParser.next();
            if (C5956n0.m35189f(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    j10 = dVar.mo17629B(xmlPullParser2, j10);
                    z2 = true;
                }
                arrayList6.addAll(dVar.mo17630C(xmlPullParser2, list, z));
                arrayList = arrayList5;
                arrayList2 = arrayList6;
                j5 = j8;
                obj = obj2;
                arrayList3 = arrayList4;
            } else {
                List<C4256b> list2 = list;
                boolean z3 = z;
                if (C5956n0.m35189f(xmlPullParser2, "AdaptationSet")) {
                    j6 = j10;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList4;
                    arrayList3.add(mo17673y(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list2, kVar, M2, j10, j11, j9, j4, z));
                    xmlPullParser2 = xmlPullParser;
                    arrayList = arrayList5;
                } else {
                    j6 = j10;
                    ArrayList arrayList7 = arrayList5;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (C5956n0.m35189f(xmlPullParser2, "EventStream")) {
                        ArrayList arrayList8 = arrayList7;
                        arrayList8.add(mo17635Q(xmlPullParser));
                        arrayList = arrayList8;
                    } else {
                        ArrayList arrayList9 = arrayList7;
                        if (C5956n0.m35189f(xmlPullParser2, "SegmentBase")) {
                            arrayList = arrayList9;
                            kVar = mo17656j0(xmlPullParser2, (C4269k.C4274e) null);
                            obj = null;
                            j10 = j6;
                            j5 = -9223372036854775807L;
                        } else {
                            arrayList = arrayList9;
                            if (C5956n0.m35189f(xmlPullParser2, "SegmentList")) {
                                long B = mo17629B(xmlPullParser2, -9223372036854775807L);
                                obj = null;
                                l0 = mo17658k0(xmlPullParser, (C4269k.C4271b) null, j9, M2, j6, B, j4);
                                j11 = B;
                                j10 = j6;
                                j5 = -9223372036854775807L;
                            } else {
                                obj = null;
                                if (C5956n0.m35189f(xmlPullParser2, "SegmentTemplate")) {
                                    long B2 = mo17629B(xmlPullParser2, -9223372036854775807L);
                                    j5 = -9223372036854775807L;
                                    l0 = mo17660l0(xmlPullParser, (C4269k.C4272c) null, C6685q.m38445x(), j9, M2, j6, B2, j4);
                                    j11 = B2;
                                    j10 = j6;
                                } else {
                                    j7 = -9223372036854775807L;
                                    if (C5956n0.m35189f(xmlPullParser2, "AssetIdentifier")) {
                                        eVar = m28682I(xmlPullParser2, "AssetIdentifier");
                                    } else {
                                        m28704w(xmlPullParser);
                                    }
                                    j10 = j6;
                                }
                            }
                            kVar = l0;
                        }
                    }
                }
                obj = null;
                j7 = -9223372036854775807L;
                j10 = j6;
            }
            if (C5956n0.m35187d(xmlPullParser2, "Period")) {
                return Pair.create(mo17651h(attributeValue, M, arrayList3, arrayList, eVar), Long.valueOf(M2));
            }
            arrayList4 = arrayList3;
            arrayList6 = arrayList2;
            obj2 = obj;
            arrayList5 = arrayList;
            j8 = j5;
            dVar = this;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public String[] mo17640b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return strArr;
        }
        return attributeValue.split(",");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C4255a mo17641c(int i, int i2, List<C4265j> list, List<C4260e> list2, List<C4260e> list3, List<C4260e> list4) {
        return new C4255a(i, i2, list, list2, list3, list4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public C4263h mo17642c0(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = null;
        String r0 = m28698r0(xmlPullParser, "moreInformationURL", (String) null);
        String r02 = m28698r0(xmlPullParser, "lang", (String) null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (C5956n0.m35189f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (C5956n0.m35189f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (C5956n0.m35189f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                m28704w(xmlPullParser);
            }
            String str4 = str3;
            if (C5956n0.m35187d(xmlPullParser, "ProgramInformation")) {
                return new C4263h(str, str2, str4, r0, r02);
            }
            str3 = str4;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C5507a mo17643d(String str, String str2, long j, long j2, byte[] bArr) {
        return new C5507a(str, str2, j2, j, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public C4264i mo17644d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j2 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j = (Long.parseLong(split[1]) - j2) + 1;
                return mo17653i(attributeValue, j2, j);
            }
        } else {
            j2 = 0;
        }
        j = -1;
        return mo17653i(attributeValue, j2, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C4261f mo17645e(String str, String str2, long j, long[] jArr, C5507a[] aVarArr) {
        return new C4261f(str, str2, j, jArr, aVarArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: f3.k$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v10, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r31v1 */
    /* JADX WARNING: type inference failed for: r31v2 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ee A[LOOP:0: B:1:0x006a->B:53:0x01ee, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0198 A[EDGE_INSN: B:54:0x0198->B:45:0x0198 ?: BREAK  , SYNTHETIC] */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p045f3.C4258d.C4259a mo17646e0(org.xmlpull.v1.XmlPullParser r36, java.util.List<p045f3.C4256b> r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List<p045f3.C4260e> r46, java.util.List<p045f3.C4260e> r47, java.util.List<p045f3.C4260e> r48, java.util.List<p045f3.C4260e> r49, p045f3.C4269k r50, long r51, long r53, long r55, long r57, long r59, boolean r61) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r35 = this;
            r15 = r35
            r14 = r36
            r0 = 0
            java.lang.String r1 = "id"
            java.lang.String r16 = r14.getAttributeValue(r0, r1)
            java.lang.String r1 = "bandwidth"
            r2 = -1
            int r17 = m28690U(r14, r1, r2)
            java.lang.String r1 = "mimeType"
            r2 = r38
            java.lang.String r18 = m28698r0(r14, r1, r2)
            java.lang.String r1 = "codecs"
            r2 = r39
            java.lang.String r19 = m28698r0(r14, r1, r2)
            java.lang.String r1 = "width"
            r2 = r40
            int r20 = m28690U(r14, r1, r2)
            java.lang.String r1 = "height"
            r2 = r41
            int r21 = m28690U(r14, r1, r2)
            r1 = r42
            float r22 = m28689S(r14, r1)
            java.lang.String r1 = "audioSamplingRate"
            r2 = r44
            int r23 = m28690U(r14, r1, r2)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r1 = r48
            r12.<init>(r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = r49
            r9.<init>(r10)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1 = 0
            r24 = r43
            r5 = r55
            r1 = r57
            r25 = r0
            r26 = 0
            r0 = r50
        L_0x006a:
            r36.next()
            java.lang.String r3 = "BaseURL"
            boolean r3 = p161w3.C5956n0.m35189f(r14, r3)
            if (r3 == 0) goto L_0x0090
            if (r26 != 0) goto L_0x007d
            long r5 = r15.mo17629B(r14, r5)
            r26 = 1
        L_0x007d:
            r8 = r37
            r3 = r61
            java.util.List r4 = r15.mo17630C(r14, r8, r3)
            r7.addAll(r4)
        L_0x0088:
            r31 = r7
            r15 = r13
            r7 = r24
            r24 = r0
            goto L_0x00a6
        L_0x0090:
            r8 = r37
            r3 = r61
            java.lang.String r4 = "AudioChannelConfiguration"
            boolean r4 = p161w3.C5956n0.m35189f(r14, r4)
            if (r4 == 0) goto L_0x00aa
            int r4 = r35.mo17628A(r36)
            r24 = r0
            r31 = r7
            r15 = r13
            r7 = r4
        L_0x00a6:
            r13 = r11
            r11 = r9
            goto L_0x0190
        L_0x00aa:
            java.lang.String r4 = "SegmentBase"
            boolean r4 = p161w3.C5956n0.m35189f(r14, r4)
            if (r4 == 0) goto L_0x00b9
            f3.k$e r0 = (p045f3.C4269k.C4274e) r0
            f3.k$e r0 = r15.mo17656j0(r14, r0)
            goto L_0x0088
        L_0x00b9:
            java.lang.String r4 = "SegmentList"
            boolean r4 = p161w3.C5956n0.m35189f(r14, r4)
            if (r4 == 0) goto L_0x00f5
            long r27 = r15.mo17629B(r14, r1)
            r2 = r0
            f3.k$b r2 = (p045f3.C4269k.C4271b) r2
            r0 = r35
            r1 = r36
            r3 = r51
            r29 = r5
            r5 = r53
            r31 = r7
            r7 = r29
            r32 = r9
            r9 = r27
            r33 = r11
            r34 = r12
            r11 = r59
            f3.k$b r0 = r0.mo17658k0(r1, r2, r3, r5, r7, r9, r11)
            r15 = r13
        L_0x00e5:
            r7 = r24
            r1 = r27
        L_0x00e9:
            r5 = r29
            r11 = r32
            r13 = r33
            r12 = r34
        L_0x00f1:
            r24 = r0
            goto L_0x0190
        L_0x00f5:
            r29 = r5
            r31 = r7
            r32 = r9
            r33 = r11
            r34 = r12
            java.lang.String r3 = "SegmentTemplate"
            boolean r3 = p161w3.C5956n0.m35189f(r14, r3)
            if (r3 == 0) goto L_0x0124
            long r27 = r15.mo17629B(r14, r1)
            r2 = r0
            f3.k$c r2 = (p045f3.C4269k.C4272c) r2
            r0 = r35
            r1 = r36
            r3 = r49
            r4 = r51
            r6 = r53
            r8 = r29
            r10 = r27
            r15 = r13
            r12 = r59
            f3.k$c r0 = r0.mo17660l0(r1, r2, r3, r4, r6, r8, r10, r12)
            goto L_0x00e5
        L_0x0124:
            r15 = r13
            java.lang.String r3 = "ContentProtection"
            boolean r3 = p161w3.C5956n0.m35189f(r14, r3)
            if (r3 == 0) goto L_0x0145
            android.util.Pair r3 = r35.mo17631F(r36)
            java.lang.Object r4 = r3.first
            if (r4 == 0) goto L_0x0139
            r25 = r4
            java.lang.String r25 = (java.lang.String) r25
        L_0x0139:
            java.lang.Object r3 = r3.second
            if (r3 == 0) goto L_0x0142
            d2.m$b r3 = (p030d2.C4035m.C4037b) r3
            r15.add(r3)
        L_0x0142:
            r7 = r24
            goto L_0x00e9
        L_0x0145:
            java.lang.String r3 = "InbandEventStream"
            boolean r4 = p161w3.C5956n0.m35189f(r14, r3)
            if (r4 == 0) goto L_0x015b
            f3.e r3 = m28682I(r14, r3)
            r13 = r33
            r13.add(r3)
            r11 = r32
            r12 = r34
            goto L_0x018a
        L_0x015b:
            r13 = r33
            java.lang.String r3 = "EssentialProperty"
            boolean r4 = p161w3.C5956n0.m35189f(r14, r3)
            if (r4 == 0) goto L_0x0171
            f3.e r3 = m28682I(r14, r3)
            r12 = r34
            r12.add(r3)
            r11 = r32
            goto L_0x018a
        L_0x0171:
            r12 = r34
            java.lang.String r3 = "SupplementalProperty"
            boolean r4 = p161w3.C5956n0.m35189f(r14, r3)
            if (r4 == 0) goto L_0x0185
            f3.e r3 = m28682I(r14, r3)
            r11 = r32
            r11.add(r3)
            goto L_0x018a
        L_0x0185:
            r11 = r32
            m28704w(r36)
        L_0x018a:
            r7 = r24
            r5 = r29
            goto L_0x00f1
        L_0x0190:
            java.lang.String r0 = "Representation"
            boolean r0 = p161w3.C5956n0.m35187d(r14, r0)
            if (r0 == 0) goto L_0x01ee
            r0 = r35
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r7
            r7 = r23
            r8 = r17
            r9 = r45
            r10 = r46
            r27 = r11
            r11 = r47
            r28 = r12
            r12 = r19
            r29 = r13
            r13 = r28
            r14 = r27
            z1.r1 r0 = r0.mo17647f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r24 == 0) goto L_0x01c2
            goto L_0x01c9
        L_0x01c2:
            f3.k$e r1 = new f3.k$e
            r1.<init>()
            r24 = r1
        L_0x01c9:
            f3.d$a r1 = new f3.d$a
            boolean r2 = r31.isEmpty()
            if (r2 != 0) goto L_0x01d2
            goto L_0x01d4
        L_0x01d2:
            r31 = r37
        L_0x01d4:
            r2 = -1
            r36 = r1
            r37 = r0
            r38 = r31
            r39 = r24
            r40 = r25
            r41 = r15
            r42 = r29
            r43 = r28
            r44 = r27
            r45 = r2
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return r1
        L_0x01ee:
            r10 = r49
            r9 = r11
            r11 = r13
            r13 = r15
            r0 = r24
            r15 = r35
            r24 = r7
            r7 = r31
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: p045f3.C4258d.mo17646e0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, f3.k, long, long, long, long, long, boolean):f3.d$a");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C6272r1 mo17647f(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List<C4260e> list, List<C4260e> list2, String str4, List<C4260e> list3, List<C4260e> list4) {
        String str5 = str2;
        int i6 = i;
        int i7 = i2;
        List<C4260e> list5 = list;
        String str6 = str4;
        String u = m28702u(str2, str6);
        if ("audio/eac3".equals(u)) {
            u = m28687N(list4);
            if ("audio/eac3-joc".equals(u)) {
                str6 = "ec+3";
            }
        }
        int p0 = mo17667p0(list5);
        String str7 = str;
        C6272r1.C6274b V = new C6272r1.C6274b().mo21505S(str).mo21497K(str2).mo21517e0(u).mo21495I(str6).mo21512Z(i5).mo21519g0(p0).mo21515c0(mo17654i0(list5) | mo17648f0(list2) | mo17652h0(list3) | mo17652h0(list4)).mo21508V(str3);
        if (C5967v.m35255s(u)) {
            V.mo21522j0(i).mo21503Q(i2).mo21502P(f);
        } else if (C5967v.m35251o(u)) {
            V.mo21494H(i3).mo21518f0(i4);
        } else if (C5967v.m35254r(u)) {
            int i8 = -1;
            if ("application/cea-608".equals(u)) {
                i8 = m28679D(list2);
            } else if ("application/cea-708".equals(u)) {
                i8 = m28680E(list2);
            }
            V.mo21492F(i8);
        } else if (C5967v.m35252p(u)) {
            V.mo21522j0(i).mo21503Q(i2);
        }
        return V.mo21491E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public int mo17648f0(List<C4260e> list) {
        int t0;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C4260e eVar = list.get(i2);
            if (C6408b.m37502a("urn:mpeg:dash:role:2011", eVar.f23674a)) {
                t0 = mo17650g0(eVar.f23675b);
            } else if (C6408b.m37502a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f23674a)) {
                t0 = mo17669t0(eVar.f23675b);
            }
            i |= t0;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C4257c mo17649g(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C4263h hVar, C4278o oVar, C4275l lVar, Uri uri, List<C4262g> list) {
        return new C4257c(j, j2, j3, z, j4, j5, j6, j7, hVar, oVar, lVar, uri, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public int mo17650g0(String str) {
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c = 8;
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c = 9;
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c = 10;
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c = 12;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return 512;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case 8:
                return 256;
            case 9:
                return 64;
            case 10:
                return 8;
            case 11:
                return 32;
            case 12:
                return 4;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C4262g mo17651h(String str, long j, List<C4255a> list, List<C4261f> list2, C4260e eVar) {
        return new C4262g(str, j, list, list2, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public int mo17652h0(List<C4260e> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (C6408b.m37502a("http://dashif.org/guidelines/trickmode", list.get(i2).f23674a)) {
                i |= 16384;
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C4264i mo17653i(String str, long j, long j2) {
        return new C4264i(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public int mo17654i0(List<C4260e> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C4260e eVar = list.get(i2);
            if (C6408b.m37502a("urn:mpeg:dash:role:2011", eVar.f23674a)) {
                i |= mo17650g0(eVar.f23675b);
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C4265j mo17655j(C4259a aVar, String str, String str2, ArrayList<C4035m.C4037b> arrayList, ArrayList<C4260e> arrayList2) {
        C6272r1.C6274b b = aVar.f23665a.mo21483b();
        if (str != null) {
            b.mo21507U(str);
        }
        String str3 = aVar.f23668d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<C4035m.C4037b> arrayList3 = aVar.f23669e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m28697r(arrayList3);
            m28699s(arrayList3);
            b.mo21499M(new C4035m(str2, (List<C4035m.C4037b>) arrayList3));
        }
        ArrayList<C4260e> arrayList4 = aVar.f23670f;
        arrayList4.addAll(arrayList2);
        return C4265j.m28758o(aVar.f23671g, b.mo21491E(), aVar.f23666b, aVar.f23667c, arrayList4, aVar.f23672h, aVar.f23673i, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public C4269k.C4274e mo17656j0(XmlPullParser xmlPullParser, C4269k.C4274e eVar) throws XmlPullParserException, IOException {
        long j;
        long j2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C4269k.C4274e eVar2 = eVar;
        long X = m28692X(xmlPullParser2, "timescale", eVar2 != null ? eVar2.f23711b : 1);
        long j3 = 0;
        long X2 = m28692X(xmlPullParser2, "presentationTimeOffset", eVar2 != null ? eVar2.f23712c : 0);
        long j4 = eVar2 != null ? eVar2.f23725d : 0;
        if (eVar2 != null) {
            j3 = eVar2.f23726e;
        }
        C4264i iVar = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - parseLong) + 1;
            j2 = parseLong;
        } else {
            j = j3;
            j2 = j4;
        }
        if (eVar2 != null) {
            iVar = eVar2.f23710a;
        }
        do {
            xmlPullParser.next();
            if (C5956n0.m35189f(xmlPullParser2, "Initialization")) {
                iVar = mo17636T(xmlPullParser);
            } else {
                m28704w(xmlPullParser);
            }
        } while (!C5956n0.m35187d(xmlPullParser2, "SegmentBase"));
        return mo17663n(iVar, X, X2, j2, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C4269k.C4271b mo17657k(C4264i iVar, long j, long j2, long j3, long j4, List<C4269k.C4273d> list, long j5, List<C4264i> list2, long j6, long j7) {
        return new C4269k.C4271b(iVar, j, j2, j3, j4, list, j5, list2, C5953m0.m35071B0(j6), C5953m0.m35071B0(j7));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public C4269k.C4271b mo17658k0(XmlPullParser xmlPullParser, C4269k.C4271b bVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C4269k.C4271b bVar2 = bVar;
        long j6 = 1;
        long X = m28692X(xmlPullParser2, "timescale", bVar2 != null ? bVar2.f23711b : 1);
        long X2 = m28692X(xmlPullParser2, "presentationTimeOffset", bVar2 != null ? bVar2.f23712c : 0);
        long X3 = m28692X(xmlPullParser2, "duration", bVar2 != null ? bVar2.f23714e : -9223372036854775807L);
        if (bVar2 != null) {
            j6 = bVar2.f23713d;
        }
        long X4 = m28692X(xmlPullParser2, "startNumber", j6);
        long t = m28701t(j3, j4);
        List<C4269k.C4273d> list = null;
        List list2 = null;
        C4264i iVar = null;
        do {
            xmlPullParser.next();
            if (C5956n0.m35189f(xmlPullParser2, "Initialization")) {
                iVar = mo17636T(xmlPullParser);
            } else if (C5956n0.m35189f(xmlPullParser2, "SegmentTimeline")) {
                list = mo17662m0(xmlPullParser, X, j2);
            } else if (C5956n0.m35189f(xmlPullParser2, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(mo17664n0(xmlPullParser));
            } else {
                m28704w(xmlPullParser);
            }
        } while (!C5956n0.m35187d(xmlPullParser2, "SegmentList"));
        if (bVar2 != null) {
            if (iVar == null) {
                iVar = bVar2.f23710a;
            }
            if (list == null) {
                list = bVar2.f23715f;
            }
            if (list2 == null) {
                list2 = bVar2.f23719j;
            }
        }
        return mo17657k(iVar, X, X2, X4, X3, list, t, list2, j5, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C4269k.C4272c mo17659l(C4264i iVar, long j, long j2, long j3, long j4, long j5, List<C4269k.C4273d> list, long j6, C4277n nVar, C4277n nVar2, long j7, long j8) {
        return new C4269k.C4272c(iVar, j, j2, j3, j4, j5, list, j6, nVar, nVar2, C5953m0.m35071B0(j7), C5953m0.m35071B0(j8));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public C4269k.C4272c mo17660l0(XmlPullParser xmlPullParser, C4269k.C4272c cVar, List<C4260e> list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C4269k.C4272c cVar2 = cVar;
        long j6 = 1;
        long X = m28692X(xmlPullParser2, "timescale", cVar2 != null ? cVar2.f23711b : 1);
        long X2 = m28692X(xmlPullParser2, "presentationTimeOffset", cVar2 != null ? cVar2.f23712c : 0);
        long X3 = m28692X(xmlPullParser2, "duration", cVar2 != null ? cVar2.f23714e : -9223372036854775807L);
        if (cVar2 != null) {
            j6 = cVar2.f23713d;
        }
        long X4 = m28692X(xmlPullParser2, "startNumber", j6);
        long W = m28691W(list);
        long t = m28701t(j3, j4);
        List<C4269k.C4273d> list2 = null;
        C4277n u0 = mo17670u0(xmlPullParser2, "media", cVar2 != null ? cVar2.f23721k : null);
        C4277n u02 = mo17670u0(xmlPullParser2, "initialization", cVar2 != null ? cVar2.f23720j : null);
        C4264i iVar = null;
        while (true) {
            xmlPullParser.next();
            if (C5956n0.m35189f(xmlPullParser2, "Initialization")) {
                iVar = mo17636T(xmlPullParser);
            } else if (C5956n0.m35189f(xmlPullParser2, "SegmentTimeline")) {
                list2 = mo17662m0(xmlPullParser, X, j2);
            } else {
                m28704w(xmlPullParser);
            }
            if (C5956n0.m35187d(xmlPullParser2, "SegmentTemplate")) {
                break;
            }
        }
        if (cVar2 != null) {
            if (iVar == null) {
                iVar = cVar2.f23710a;
            }
            if (list2 == null) {
                list2 = cVar2.f23715f;
            }
        }
        return mo17659l(iVar, X, X2, X4, W, X3, list2, t, u02, u0, j5, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C4269k.C4273d mo17661m(long j, long j2) {
        return new C4269k.C4273d(j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public List<C4269k.C4273d> mo17662m0(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (C5956n0.m35189f(xmlPullParser2, "S")) {
                long X = m28692X(xmlPullParser2, "t", -9223372036854775807L);
                if (z) {
                    j3 = m28694b(arrayList, j3, j4, i, X);
                }
                if (X == -9223372036854775807L) {
                    X = j3;
                }
                j4 = m28692X(xmlPullParser2, "d", -9223372036854775807L);
                i = m28690U(xmlPullParser2, "r", 0);
                j3 = X;
                z = true;
            } else {
                m28704w(xmlPullParser);
            }
        } while (!C5956n0.m35187d(xmlPullParser2, "SegmentTimeline"));
        if (z) {
            m28694b(arrayList, j3, j4, i, C5953m0.m35095N0(j2, j, 1000));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C4269k.C4274e mo17663n(C4264i iVar, long j, long j2, long j3, long j4) {
        return new C4269k.C4274e(iVar, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public C4264i mo17664n0(XmlPullParser xmlPullParser) {
        return mo17644d0(xmlPullParser, "media", "mediaRange");
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C4278o mo17665o(String str, String str2) {
        return new C4278o(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public int mo17666o0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public int mo17667p0(List<C4260e> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C4260e eVar = list.get(i2);
            if (C6408b.m37502a("urn:mpeg:dash:role:2011", eVar.f23674a)) {
                i |= mo17666o0(eVar.f23675b);
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public C4275l mo17668q0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (C5956n0.m35189f(xmlPullParser2, "Latency")) {
                j = m28692X(xmlPullParser2, "target", -9223372036854775807L);
                j2 = m28692X(xmlPullParser2, "min", -9223372036854775807L);
                j3 = m28692X(xmlPullParser2, "max", -9223372036854775807L);
            } else if (C5956n0.m35189f(xmlPullParser2, "PlaybackRate")) {
                f = m28688R(xmlPullParser2, "min", -3.4028235E38f);
                f2 = m28688R(xmlPullParser2, "max", -3.4028235E38f);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f3 = f;
            float f4 = f2;
            if (C5956n0.m35187d(xmlPullParser2, "ServiceDescription")) {
                return new C4275l(j4, j5, j6, f3, f4);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f = f3;
            f2 = f4;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public int mo17669t0(String str) {
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c = 0;
                    break;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                if (str.equals("2")) {
                    c = 1;
                    break;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
                if (str.equals("3")) {
                    c = 2;
                    break;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
                if (str.equals("4")) {
                    c = 3;
                    break;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorControlHighlight /*54*/:
                if (str.equals("6")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public C4277n mo17670u0(XmlPullParser xmlPullParser, String str, C4277n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue != null ? C4277n.m28808b(attributeValue) : nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public C4278o mo17671v0(XmlPullParser xmlPullParser) {
        return mo17665o(xmlPullParser.getAttributeValue((String) null, "schemeIdUri"), xmlPullParser.getAttributeValue((String) null, "value"));
    }

    /* renamed from: x */
    public C4257c mo216a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.f23664a.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return mo17638Y(newPullParser, uri);
            }
            throw C6249m2.m36663c("inputStream does not contain a valid media presentation description", (Throwable) null);
        } catch (XmlPullParserException e) {
            throw C6249m2.m36663c((String) null, e);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x030d A[LOOP:0: B:1:0x007c->B:69:0x030d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02ce A[EDGE_INSN: B:70:0x02ce->B:63:0x02ce ?: BREAK  , SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p045f3.C4255a mo17673y(org.xmlpull.v1.XmlPullParser r55, java.util.List<p045f3.C4256b> r56, p045f3.C4269k r57, long r58, long r60, long r62, long r64, long r66, boolean r68) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r54 = this;
            r15 = r54
            r14 = r55
            java.lang.String r0 = "id"
            r1 = -1
            int r27 = m28690U(r14, r0, r1)
            int r0 = r54.mo17632G(r55)
            r13 = 0
            java.lang.String r2 = "mimeType"
            java.lang.String r28 = r14.getAttributeValue(r13, r2)
            java.lang.String r2 = "codecs"
            java.lang.String r29 = r14.getAttributeValue(r13, r2)
            java.lang.String r2 = "width"
            int r30 = m28690U(r14, r2, r1)
            java.lang.String r2 = "height"
            int r31 = m28690U(r14, r2, r1)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r32 = m28689S(r14, r2)
            java.lang.String r2 = "audioSamplingRate"
            int r33 = m28690U(r14, r2, r1)
            java.lang.String r12 = "lang"
            java.lang.String r2 = r14.getAttributeValue(r13, r12)
            java.lang.String r3 = "label"
            java.lang.String r3 = r14.getAttributeValue(r13, r3)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r34 = 0
            r35 = r57
            r36 = r0
            r38 = r2
            r39 = r3
            r41 = r13
            r37 = -1
            r40 = 0
            r2 = r60
            r0 = r62
        L_0x007c:
            r55.next()
            java.lang.String r13 = "BaseURL"
            boolean r13 = p161w3.C5956n0.m35189f(r14, r13)
            if (r13 == 0) goto L_0x00bb
            if (r40 != 0) goto L_0x008f
            long r2 = r15.mo17629B(r14, r2)
            r40 = 1
        L_0x008f:
            r13 = r56
            r60 = r0
            r17 = r10
            r10 = r68
            java.util.List r0 = r15.mo17630C(r14, r13, r10)
            r4.addAll(r0)
        L_0x009e:
            r0 = r60
            r42 = r2
            r15 = r5
            r45 = r7
            r46 = r8
            r47 = r9
            r49 = r11
            r50 = r12
            r3 = r17
            r51 = r36
            r53 = r38
            r52 = 0
            r36 = r4
            r38 = r6
            goto L_0x02c6
        L_0x00bb:
            r13 = r56
            r60 = r0
            r17 = r10
            r10 = r68
            java.lang.String r0 = "ContentProtection"
            boolean r0 = p161w3.C5956n0.m35189f(r14, r0)
            if (r0 == 0) goto L_0x00e1
            android.util.Pair r0 = r54.mo17631F(r55)
            java.lang.Object r1 = r0.first
            if (r1 == 0) goto L_0x00d7
            r41 = r1
            java.lang.String r41 = (java.lang.String) r41
        L_0x00d7:
            java.lang.Object r0 = r0.second
            if (r0 == 0) goto L_0x009e
            d2.m$b r0 = (p030d2.C4035m.C4037b) r0
            r11.add(r0)
            goto L_0x009e
        L_0x00e1:
            java.lang.String r0 = "ContentComponent"
            boolean r0 = p161w3.C5956n0.m35189f(r14, r0)
            if (r0 == 0) goto L_0x011b
            r1 = 0
            java.lang.String r0 = r14.getAttributeValue(r1, r12)
            r15 = r38
            java.lang.String r0 = m28696q(r15, r0)
            int r15 = r54.mo17632G(r55)
            r13 = r36
            int r13 = m28695p(r13, r15)
            r53 = r0
            r52 = r1
            r42 = r2
            r36 = r4
            r15 = r5
            r38 = r6
            r45 = r7
            r46 = r8
            r47 = r9
            r49 = r11
            r50 = r12
            r51 = r13
            r3 = r17
        L_0x0117:
            r0 = r60
            goto L_0x02c6
        L_0x011b:
            r13 = r36
            r15 = r38
            r1 = 0
            java.lang.String r0 = "Role"
            boolean r16 = p161w3.C5956n0.m35189f(r14, r0)
            if (r16 == 0) goto L_0x0130
            f3.e r0 = m28682I(r14, r0)
            r8.add(r0)
            goto L_0x013e
        L_0x0130:
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = p161w3.C5956n0.m35189f(r14, r0)
            if (r0 == 0) goto L_0x015b
            int r0 = r54.mo17628A(r55)
            r37 = r0
        L_0x013e:
            r52 = r1
            r42 = r2
            r36 = r4
            r38 = r6
            r45 = r7
            r46 = r8
            r47 = r9
            r49 = r11
            r50 = r12
            r51 = r13
            r53 = r15
            r3 = r17
            r0 = r60
            r15 = r5
            goto L_0x02c6
        L_0x015b:
            java.lang.String r0 = "Accessibility"
            boolean r16 = p161w3.C5956n0.m35189f(r14, r0)
            if (r16 == 0) goto L_0x016b
            f3.e r0 = m28682I(r14, r0)
            r9.add(r0)
            goto L_0x013e
        L_0x016b:
            java.lang.String r0 = "EssentialProperty"
            boolean r16 = p161w3.C5956n0.m35189f(r14, r0)
            if (r16 == 0) goto L_0x017b
            f3.e r0 = m28682I(r14, r0)
            r7.add(r0)
            goto L_0x013e
        L_0x017b:
            java.lang.String r0 = "SupplementalProperty"
            boolean r16 = p161w3.C5956n0.m35189f(r14, r0)
            if (r16 == 0) goto L_0x018b
            f3.e r0 = m28682I(r14, r0)
            r6.add(r0)
            goto L_0x013e
        L_0x018b:
            java.lang.String r0 = "Representation"
            boolean r0 = p161w3.C5956n0.m35189f(r14, r0)
            if (r0 == 0) goto L_0x0204
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x019c
            r16 = r4
            goto L_0x019e
        L_0x019c:
            r16 = r56
        L_0x019e:
            r0 = r54
            r18 = r1
            r1 = r55
            r42 = r2
            r2 = r16
            r3 = r28
            r36 = r4
            r4 = r29
            r44 = r5
            r5 = r30
            r38 = r6
            r6 = r31
            r45 = r7
            r7 = r32
            r46 = r8
            r8 = r37
            r47 = r9
            r9 = r33
            r48 = r17
            r10 = r15
            r49 = r11
            r11 = r46
            r50 = r12
            r12 = r47
            r51 = r13
            r52 = r18
            r13 = r45
            r14 = r38
            r53 = r15
            r15 = r35
            r16 = r64
            r18 = r58
            r20 = r42
            r22 = r60
            r24 = r66
            r26 = r68
            f3.d$a r0 = r0.mo17646e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r22, r24, r26)
            z1.r1 r1 = r0.f23665a
            java.lang.String r1 = r1.f30243t
            int r1 = p161w3.C5967v.m35247k(r1)
            r14 = r51
            int r1 = m28695p(r14, r1)
            r15 = r44
            r15.add(r0)
            r14 = r55
            r51 = r1
            r3 = r48
            goto L_0x0117
        L_0x0204:
            r52 = r1
            r42 = r2
            r36 = r4
            r38 = r6
            r45 = r7
            r46 = r8
            r47 = r9
            r49 = r11
            r50 = r12
            r14 = r13
            r53 = r15
            r48 = r17
            r15 = r5
            java.lang.String r0 = "SegmentBase"
            r13 = r55
            boolean r0 = p161w3.C5956n0.m35189f(r13, r0)
            if (r0 == 0) goto L_0x023b
            r0 = r35
            f3.k$e r0 = (p045f3.C4269k.C4274e) r0
            r11 = r54
            f3.k$e r0 = r11.mo17656j0(r13, r0)
            r35 = r0
            r51 = r14
            r3 = r48
            r0 = r60
            r14 = r13
            goto L_0x02c6
        L_0x023b:
            r11 = r54
            java.lang.String r0 = "SegmentList"
            boolean r0 = p161w3.C5956n0.m35189f(r13, r0)
            if (r0 == 0) goto L_0x026c
            r0 = r60
            long r16 = r11.mo17629B(r13, r0)
            r2 = r35
            f3.k$b r2 = (p045f3.C4269k.C4271b) r2
            r0 = r54
            r1 = r55
            r3 = r64
            r5 = r58
            r7 = r42
            r9 = r16
            r51 = r14
            r14 = r11
            r11 = r66
            f3.k$b r0 = r0.mo17658k0(r1, r2, r3, r5, r7, r9, r11)
            r35 = r0
            r14 = r13
        L_0x0267:
            r0 = r16
            r3 = r48
            goto L_0x02c6
        L_0x026c:
            r0 = r60
            r51 = r14
            r14 = r11
            java.lang.String r2 = "SegmentTemplate"
            boolean r2 = p161w3.C5956n0.m35189f(r13, r2)
            if (r2 == 0) goto L_0x0299
            long r16 = r14.mo17629B(r13, r0)
            r2 = r35
            f3.k$c r2 = (p045f3.C4269k.C4272c) r2
            r0 = r54
            r1 = r55
            r3 = r38
            r4 = r64
            r6 = r58
            r8 = r42
            r10 = r16
            r14 = r13
            r12 = r66
            f3.k$c r0 = r0.mo17660l0(r1, r2, r3, r4, r6, r8, r10, r12)
            r35 = r0
            goto L_0x0267
        L_0x0299:
            r14 = r13
            java.lang.String r2 = "InbandEventStream"
            boolean r3 = p161w3.C5956n0.m35189f(r14, r2)
            if (r3 == 0) goto L_0x02ac
            f3.e r2 = m28682I(r14, r2)
            r3 = r48
            r3.add(r2)
            goto L_0x02c6
        L_0x02ac:
            r3 = r48
            java.lang.String r2 = "Label"
            boolean r2 = p161w3.C5956n0.m35189f(r14, r2)
            if (r2 == 0) goto L_0x02bd
            java.lang.String r2 = r54.mo17637V(r55)
            r39 = r2
            goto L_0x02c6
        L_0x02bd:
            boolean r2 = p161w3.C5956n0.m35188e(r55)
            if (r2 == 0) goto L_0x02c6
            r54.mo17674z(r55)
        L_0x02c6:
            java.lang.String r2 = "AdaptationSet"
            boolean r2 = p161w3.C5956n0.m35187d(r14, r2)
            if (r2 == 0) goto L_0x030d
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            r1 = 0
        L_0x02d8:
            int r2 = r15.size()
            if (r1 >= r2) goto L_0x02fa
            java.lang.Object r2 = r15.get(r1)
            f3.d$a r2 = (p045f3.C4258d.C4259a) r2
            r55 = r54
            r56 = r2
            r57 = r39
            r58 = r41
            r59 = r49
            r60 = r3
            f3.j r2 = r55.mo17655j(r56, r57, r58, r59, r60)
            r0.add(r2)
            int r1 = r1 + 1
            goto L_0x02d8
        L_0x02fa:
            r55 = r54
            r56 = r27
            r57 = r51
            r58 = r0
            r59 = r47
            r60 = r45
            r61 = r38
            f3.a r0 = r55.mo17641c(r56, r57, r58, r59, r60, r61)
            return r0
        L_0x030d:
            r10 = r3
            r5 = r15
            r4 = r36
            r6 = r38
            r2 = r42
            r7 = r45
            r8 = r46
            r9 = r47
            r11 = r49
            r12 = r50
            r36 = r51
            r13 = r52
            r38 = r53
            r15 = r54
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: p045f3.C4258d.mo17673y(org.xmlpull.v1.XmlPullParser, java.util.List, f3.k, long, long, long, long, long, boolean):f3.a");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo17674z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        m28704w(xmlPullParser);
    }
}
