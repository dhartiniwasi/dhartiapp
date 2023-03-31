package p072j3;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p014b2.C1609a;
import p030d2.C4035m;
import p072j3.C4734a;
import p092m2.C5023l;
import p092m2.C5029p;
import p155v3.C5823j0;
import p161w3.C5917a;
import p161w3.C5929e;
import p161w3.C5953m0;
import p177z1.C6249m2;
import p177z1.C6272r1;

/* renamed from: j3.b */
/* compiled from: SsManifestParser */
public class C4737b implements C5823j0.C5824a<C4734a> {

    /* renamed from: a */
    private final XmlPullParserFactory f25360a;

    /* renamed from: j3.b$a */
    /* compiled from: SsManifestParser */
    private static abstract class C4738a {

        /* renamed from: a */
        private final String f25361a;

        /* renamed from: b */
        private final String f25362b;

        /* renamed from: c */
        private final C4738a f25363c;

        /* renamed from: d */
        private final List<Pair<String, Object>> f25364d = new LinkedList();

        public C4738a(C4738a aVar, String str, String str2) {
            this.f25363c = aVar;
            this.f25361a = str;
            this.f25362b = str2;
        }

        /* renamed from: e */
        private C4738a m30532e(C4738a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new C4741d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new C4740c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new C4743f(aVar, str2);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18401a(Object obj) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract Object mo18402b();

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final Object mo18403c(String str) {
            for (int i = 0; i < this.f25364d.size(); i++) {
                Pair pair = this.f25364d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            C4738a aVar = this.f25363c;
            if (aVar == null) {
                return null;
            }
            return aVar.mo18403c(str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo18404d(String str) {
            return false;
        }

        /* renamed from: f */
        public final Object mo18405f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f25362b.equals(name)) {
                        mo18413n(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (mo18404d(name)) {
                            mo18413n(xmlPullParser);
                        } else {
                            C4738a e = m30532e(this, name, this.f25361a);
                            if (e == null) {
                                i = 1;
                            } else {
                                mo18401a(e.mo18405f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        mo18414o(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    mo18407h(xmlPullParser);
                    if (!mo18404d(name2)) {
                        return mo18402b();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final boolean mo18406g(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo18407h(XmlPullParser xmlPullParser) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public final int mo18408i(XmlPullParser xmlPullParser, String str, int i) throws C6249m2 {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue == null) {
                return i;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw C6249m2.m36663c((String) null, e);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public final long mo18409j(XmlPullParser xmlPullParser, String str, long j) throws C6249m2 {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue == null) {
                return j;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw C6249m2.m36663c((String) null, e);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public final int mo18410k(XmlPullParser xmlPullParser, String str) throws C6249m2 {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e) {
                    throw C6249m2.m36663c((String) null, e);
                }
            } else {
                throw new C4739b(str);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public final long mo18411l(XmlPullParser xmlPullParser, String str) throws C6249m2 {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e) {
                    throw C6249m2.m36663c((String) null, e);
                }
            } else {
                throw new C4739b(str);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public final String mo18412m(XmlPullParser xmlPullParser, String str) throws C4739b {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C4739b(str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public abstract void mo18413n(XmlPullParser xmlPullParser) throws C6249m2;

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo18414o(XmlPullParser xmlPullParser) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public final void mo18415p(String str, Object obj) {
            this.f25364d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: j3.b$b */
    /* compiled from: SsManifestParser */
    public static class C4739b extends C6249m2 {
        public C4739b(String str) {
            super("Missing required field: " + str, (Throwable) null, true, 4);
        }
    }

    /* renamed from: j3.b$c */
    /* compiled from: SsManifestParser */
    private static class C4740c extends C4738a {

        /* renamed from: e */
        private boolean f25365e;

        /* renamed from: f */
        private UUID f25366f;

        /* renamed from: g */
        private byte[] f25367g;

        public C4740c(C4738a aVar, String str) {
            super(aVar, str, "Protection");
        }

        /* renamed from: q */
        private static C5029p[] m30548q(byte[] bArr) {
            return new C5029p[]{new C5029p(true, (String) null, 8, m30549r(bArr), 0, 0, (byte[]) null)};
        }

        /* renamed from: r */
        private static byte[] m30549r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length; i += 2) {
                sb.append((char) bArr[i]);
            }
            String sb2 = sb.toString();
            byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
            m30551t(decode, 0, 3);
            m30551t(decode, 1, 2);
            m30551t(decode, 4, 5);
            m30551t(decode, 6, 7);
            return decode;
        }

        /* renamed from: s */
        private static String m30550s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        /* renamed from: t */
        private static void m30551t(byte[] bArr, int i, int i2) {
            byte b = bArr[i];
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }

        /* renamed from: b */
        public Object mo18402b() {
            UUID uuid = this.f25366f;
            return new C4734a.C4735a(uuid, C5023l.m31708a(uuid, this.f25367g), m30548q(this.f25367g));
        }

        /* renamed from: d */
        public boolean mo18404d(String str) {
            return "ProtectionHeader".equals(str);
        }

        /* renamed from: h */
        public void mo18407h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f25365e = false;
            }
        }

        /* renamed from: n */
        public void mo18413n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f25365e = true;
                this.f25366f = UUID.fromString(m30550s(xmlPullParser.getAttributeValue((String) null, "SystemID")));
            }
        }

        /* renamed from: o */
        public void mo18414o(XmlPullParser xmlPullParser) {
            if (this.f25365e) {
                this.f25367g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* renamed from: j3.b$d */
    /* compiled from: SsManifestParser */
    private static class C4741d extends C4738a {

        /* renamed from: e */
        private C6272r1 f25368e;

        public C4741d(C4738a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        /* renamed from: q */
        private static List<byte[]> m30557q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] J = C5953m0.m35086J(str);
                byte[][] i = C5929e.m34972i(J);
                if (i == null) {
                    arrayList.add(J);
                } else {
                    Collections.addAll(arrayList, i);
                }
            }
            return arrayList;
        }

        /* renamed from: r */
        private static String m30558r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        /* renamed from: b */
        public Object mo18402b() {
            return this.f25368e;
        }

        /* renamed from: n */
        public void mo18413n(XmlPullParser xmlPullParser) throws C6249m2 {
            C6272r1.C6274b bVar = new C6272r1.C6274b();
            String r = m30558r(mo18412m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) mo18403c("Type")).intValue();
            if (intValue == 2) {
                bVar.mo21497K("video/mp4").mo21522j0(mo18410k(xmlPullParser, "MaxWidth")).mo21503Q(mo18410k(xmlPullParser, "MaxHeight")).mo21506T(m30557q(xmlPullParser.getAttributeValue((String) null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (r == null) {
                    r = "audio/mp4a-latm";
                }
                int k = mo18410k(xmlPullParser, "Channels");
                int k2 = mo18410k(xmlPullParser, "SamplingRate");
                List<byte[]> q = m30557q(xmlPullParser.getAttributeValue((String) null, "CodecPrivateData"));
                if (q.isEmpty() && "audio/mp4a-latm".equals(r)) {
                    q = Collections.singletonList(C1609a.m7401a(k2, k));
                }
                bVar.mo21497K("audio/mp4").mo21494H(k).mo21518f0(k2).mo21506T(q);
            } else if (intValue == 3) {
                int i = 0;
                String str = (String) mo18403c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i = 64;
                    } else if (str.equals("DESC")) {
                        i = 1024;
                    }
                }
                bVar.mo21497K("application/mp4").mo21515c0(i);
            } else {
                bVar.mo21497K("application/mp4");
            }
            this.f25368e = bVar.mo21505S(xmlPullParser.getAttributeValue((String) null, "Index")).mo21507U((String) mo18403c("Name")).mo21517e0(r).mo21493G(mo18410k(xmlPullParser, "Bitrate")).mo21508V((String) mo18403c("Language")).mo21491E();
        }
    }

    /* renamed from: j3.b$e */
    /* compiled from: SsManifestParser */
    private static class C4742e extends C4738a {

        /* renamed from: e */
        private final List<C4734a.C4736b> f25369e = new LinkedList();

        /* renamed from: f */
        private int f25370f;

        /* renamed from: g */
        private int f25371g;

        /* renamed from: h */
        private long f25372h;

        /* renamed from: i */
        private long f25373i;

        /* renamed from: j */
        private long f25374j;

        /* renamed from: k */
        private int f25375k = -1;

        /* renamed from: l */
        private boolean f25376l;

        /* renamed from: m */
        private C4734a.C4735a f25377m = null;

        public C4742e(C4738a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
        }

        /* renamed from: a */
        public void mo18401a(Object obj) {
            if (obj instanceof C4734a.C4736b) {
                this.f25369e.add((C4734a.C4736b) obj);
            } else if (obj instanceof C4734a.C4735a) {
                C5917a.m34873f(this.f25377m == null);
                this.f25377m = (C4734a.C4735a) obj;
            }
        }

        /* renamed from: b */
        public Object mo18402b() {
            int size = this.f25369e.size();
            C4734a.C4736b[] bVarArr = new C4734a.C4736b[size];
            this.f25369e.toArray(bVarArr);
            if (this.f25377m != null) {
                C4734a.C4735a aVar = this.f25377m;
                C4035m mVar = new C4035m(new C4035m.C4037b(aVar.f25341a, "video/mp4", aVar.f25342b));
                for (int i = 0; i < size; i++) {
                    C4734a.C4736b bVar = bVarArr[i];
                    int i2 = bVar.f25344a;
                    if (i2 == 2 || i2 == 1) {
                        C6272r1[] r1VarArr = bVar.f25353j;
                        for (int i3 = 0; i3 < r1VarArr.length; i3++) {
                            r1VarArr[i3] = r1VarArr[i3].mo21483b().mo21499M(mVar).mo21491E();
                        }
                    }
                }
            }
            return new C4734a(this.f25370f, this.f25371g, this.f25372h, this.f25373i, this.f25374j, this.f25375k, this.f25376l, this.f25377m, bVarArr);
        }

        /* renamed from: n */
        public void mo18413n(XmlPullParser xmlPullParser) throws C6249m2 {
            this.f25370f = mo18410k(xmlPullParser, "MajorVersion");
            this.f25371g = mo18410k(xmlPullParser, "MinorVersion");
            this.f25372h = mo18409j(xmlPullParser, "TimeScale", 10000000);
            this.f25373i = mo18411l(xmlPullParser, "Duration");
            this.f25374j = mo18409j(xmlPullParser, "DVRWindowLength", 0);
            this.f25375k = mo18408i(xmlPullParser, "LookaheadCount", -1);
            this.f25376l = mo18406g(xmlPullParser, "IsLive", false);
            mo18415p("TimeScale", Long.valueOf(this.f25372h));
        }
    }

    /* renamed from: j3.b$f */
    /* compiled from: SsManifestParser */
    private static class C4743f extends C4738a {

        /* renamed from: e */
        private final String f25378e;

        /* renamed from: f */
        private final List<C6272r1> f25379f = new LinkedList();

        /* renamed from: g */
        private int f25380g;

        /* renamed from: h */
        private String f25381h;

        /* renamed from: i */
        private long f25382i;

        /* renamed from: j */
        private String f25383j;

        /* renamed from: k */
        private String f25384k;

        /* renamed from: l */
        private int f25385l;

        /* renamed from: m */
        private int f25386m;

        /* renamed from: n */
        private int f25387n;

        /* renamed from: o */
        private int f25388o;

        /* renamed from: p */
        private String f25389p;

        /* renamed from: q */
        private ArrayList<Long> f25390q;

        /* renamed from: r */
        private long f25391r;

        public C4743f(C4738a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f25378e = str;
        }

        /* renamed from: q */
        private void m30564q(XmlPullParser xmlPullParser) throws C6249m2 {
            int s = m30566s(xmlPullParser);
            this.f25380g = s;
            mo18415p("Type", Integer.valueOf(s));
            if (this.f25380g == 3) {
                this.f25381h = mo18412m(xmlPullParser, "Subtype");
            } else {
                this.f25381h = xmlPullParser.getAttributeValue((String) null, "Subtype");
            }
            mo18415p("Subtype", this.f25381h);
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "Name");
            this.f25383j = attributeValue;
            mo18415p("Name", attributeValue);
            this.f25384k = mo18412m(xmlPullParser, "Url");
            this.f25385l = mo18408i(xmlPullParser, "MaxWidth", -1);
            this.f25386m = mo18408i(xmlPullParser, "MaxHeight", -1);
            this.f25387n = mo18408i(xmlPullParser, "DisplayWidth", -1);
            this.f25388o = mo18408i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "Language");
            this.f25389p = attributeValue2;
            mo18415p("Language", attributeValue2);
            long i = (long) mo18408i(xmlPullParser, "TimeScale", -1);
            this.f25382i = i;
            if (i == -1) {
                this.f25382i = ((Long) mo18403c("TimeScale")).longValue();
            }
            this.f25390q = new ArrayList<>();
        }

        /* renamed from: r */
        private void m30565r(XmlPullParser xmlPullParser) throws C6249m2 {
            int size = this.f25390q.size();
            long j = mo18409j(xmlPullParser, "t", -9223372036854775807L);
            int i = 1;
            if (j == -9223372036854775807L) {
                if (size == 0) {
                    j = 0;
                } else if (this.f25391r != -1) {
                    j = this.f25390q.get(size - 1).longValue() + this.f25391r;
                } else {
                    throw C6249m2.m36663c("Unable to infer start time", (Throwable) null);
                }
            }
            this.f25390q.add(Long.valueOf(j));
            this.f25391r = mo18409j(xmlPullParser, "d", -9223372036854775807L);
            long j2 = mo18409j(xmlPullParser, "r", 1);
            if (j2 <= 1 || this.f25391r != -9223372036854775807L) {
                while (true) {
                    long j3 = (long) i;
                    if (j3 < j2) {
                        this.f25390q.add(Long.valueOf((this.f25391r * j3) + j));
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                throw C6249m2.m36663c("Repeated chunk with unspecified duration", (Throwable) null);
            }
        }

        /* renamed from: s */
        private int m30566s(XmlPullParser xmlPullParser) throws C6249m2 {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "Type");
            if (attributeValue == null) {
                throw new C4739b("Type");
            } else if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            } else {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if ("text".equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                throw C6249m2.m36663c("Invalid key value[" + attributeValue + "]", (Throwable) null);
            }
        }

        /* renamed from: a */
        public void mo18401a(Object obj) {
            if (obj instanceof C6272r1) {
                this.f25379f.add((C6272r1) obj);
            }
        }

        /* renamed from: b */
        public Object mo18402b() {
            C6272r1[] r1VarArr = new C6272r1[this.f25379f.size()];
            this.f25379f.toArray(r1VarArr);
            C4734a.C4736b bVar = r2;
            C4734a.C4736b bVar2 = new C4734a.C4736b(this.f25378e, this.f25384k, this.f25380g, this.f25381h, this.f25382i, this.f25383j, this.f25385l, this.f25386m, this.f25387n, this.f25388o, this.f25389p, r1VarArr, this.f25390q, this.f25391r);
            return bVar;
        }

        /* renamed from: d */
        public boolean mo18404d(String str) {
            return "c".equals(str);
        }

        /* renamed from: n */
        public void mo18413n(XmlPullParser xmlPullParser) throws C6249m2 {
            if ("c".equals(xmlPullParser.getName())) {
                m30565r(xmlPullParser);
            } else {
                m30564q(xmlPullParser);
            }
        }
    }

    public C4737b() {
        try {
            this.f25360a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: b */
    public C4734a mo216a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.f25360a.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            return (C4734a) new C4742e((C4738a) null, uri.toString()).mo18405f(newPullParser);
        } catch (XmlPullParserException e) {
            throw C6249m2.m36663c((String) null, e);
        }
    }
}
