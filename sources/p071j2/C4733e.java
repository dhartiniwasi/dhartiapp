package p071j2;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p071j2.C4728b;
import p161w3.C5956n0;
import p161w3.C5961r;
import p177z1.C6249m2;
import p190b7.C6685q;

/* renamed from: j2.e */
/* compiled from: XmpMotionPhotoDescriptionParser */
final class C4733e {

    /* renamed from: a */
    private static final String[] f25330a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f25331b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f25332c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static C4728b m30517a(String str) throws IOException {
        try {
            return m30518b(str);
        } catch (NumberFormatException | XmlPullParserException | C6249m2 unused) {
            C5961r.m35215i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    private static C4728b m30518b(String str) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (C5956n0.m35189f(newPullParser, "x:xmpmeta")) {
            long j = -9223372036854775807L;
            C6685q<C4728b.C4729a> x = C6685q.m38445x();
            do {
                newPullParser.next();
                if (C5956n0.m35189f(newPullParser, "rdf:Description")) {
                    if (!m30520d(newPullParser)) {
                        return null;
                    }
                    j = m30521e(newPullParser);
                    x = m30519c(newPullParser);
                } else if (C5956n0.m35189f(newPullParser, "Container:Directory")) {
                    x = m30522f(newPullParser, "Container", "Item");
                } else if (C5956n0.m35189f(newPullParser, "GContainer:Directory")) {
                    x = m30522f(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!C5956n0.m35187d(newPullParser, "x:xmpmeta"));
            if (x.isEmpty()) {
                return null;
            }
            return new C4728b(j, x);
        }
        throw C6249m2.m36661a("Couldn't find xmp metadata", (Throwable) null);
    }

    /* renamed from: c */
    private static C6685q<C4728b.C4729a> m30519c(XmlPullParser xmlPullParser) {
        for (String a : f25332c) {
            String a2 = C5956n0.m35184a(xmlPullParser, a);
            if (a2 != null) {
                return C6685q.m38447z(new C4728b.C4729a("image/jpeg", "Primary", 0, 0), new C4728b.C4729a("video/mp4", "MotionPhoto", Long.parseLong(a2), 0));
            }
        }
        return C6685q.m38445x();
    }

    /* renamed from: d */
    private static boolean m30520d(XmlPullParser xmlPullParser) {
        String[] strArr = f25330a;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String a = C5956n0.m35184a(xmlPullParser, strArr[i]);
            if (a == null) {
                i++;
            } else if (Integer.parseInt(a) == 1) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static long m30521e(XmlPullParser xmlPullParser) {
        for (String a : f25331b) {
            String a2 = C5956n0.m35184a(xmlPullParser, a);
            if (a2 != null) {
                long parseLong = Long.parseLong(a2);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    private static C6685q<C4728b.C4729a> m30522f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C6685q.C6686a r = C6685q.m38441r();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (C5956n0.m35189f(xmlPullParser, str3)) {
                String a = C5956n0.m35184a(xmlPullParser, str2 + ":Mime");
                String a2 = C5956n0.m35184a(xmlPullParser, str2 + ":Semantic");
                String a3 = C5956n0.m35184a(xmlPullParser, str2 + ":Length");
                String a4 = C5956n0.m35184a(xmlPullParser, str2 + ":Padding");
                if (a == null || a2 == null) {
                    return C6685q.m38445x();
                }
                r.mo22506a(new C4728b.C4729a(a, a2, a3 != null ? Long.parseLong(a3) : 0, a4 != null ? Long.parseLong(a4) : 0));
            }
        } while (!C5956n0.m35187d(xmlPullParser, str4));
        return r.mo22547h();
    }
}
