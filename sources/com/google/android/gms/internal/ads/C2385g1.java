package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.google.android.gms.internal.ads.g1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2385g1 {

    /* renamed from: a */
    private static final String[] f9637a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f9638b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f9639c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static C2199b1 m12986a(String str) throws IOException {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (hc2.m13798c(newPullParser, "x:xmpmeta")) {
                ua3 w = ua3.m21508w();
                long j2 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (hc2.m13798c(newPullParser, "rdf:Description")) {
                        String[] strArr = f9637a;
                        int i = 0;
                        int i2 = 0;
                        while (i2 < 4) {
                            String a = hc2.m13796a(newPullParser, strArr[i2]);
                            if (a == null) {
                                i2++;
                            } else if (Integer.parseInt(a) != 1) {
                                return null;
                            } else {
                                String[] strArr2 = f9638b;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 4) {
                                        break;
                                    }
                                    String a2 = hc2.m13796a(newPullParser, strArr2[i3]);
                                    if (a2 != null) {
                                        j = Long.parseLong(a2);
                                        if (j == -1) {
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                                j = -9223372036854775807L;
                                String[] strArr3 = f9639c;
                                while (true) {
                                    if (i >= 2) {
                                        w = ua3.m21508w();
                                        break;
                                    }
                                    String a3 = hc2.m13796a(newPullParser, strArr3[i]);
                                    if (a3 != null) {
                                        w = ua3.m21510y(new C2162a1("image/jpeg", "Primary", 0, 0), new C2162a1("video/mp4", "MotionPhoto", Long.parseLong(a3), 0));
                                        break;
                                    }
                                    i++;
                                }
                                j2 = j;
                            }
                        }
                        return null;
                    } else if (hc2.m13798c(newPullParser, "Container:Directory")) {
                        w = m12987b(newPullParser, "Container", "Item");
                    } else if (hc2.m13798c(newPullParser, "GContainer:Directory")) {
                        w = m12987b(newPullParser, "GContainer", "GContainerItem");
                    }
                } while (!hc2.m13797b(newPullParser, "x:xmpmeta"));
                if (w.isEmpty()) {
                    return null;
                }
                return new C2199b1(j2, w);
            }
            throw ea0.m11990a("Couldn't find xmp metadata", (Throwable) null);
        } catch (ea0 | NumberFormatException | XmlPullParserException unused) {
            ot1.m18060e("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    private static ua3 m12987b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        ra3 q = ua3.m21502q();
        do {
            xmlPullParser.next();
            if (hc2.m13798c(xmlPullParser, concat)) {
                String a = hc2.m13796a(xmlPullParser, str2.concat(":Mime"));
                String a2 = hc2.m13796a(xmlPullParser, str2.concat(":Semantic"));
                String a3 = hc2.m13796a(xmlPullParser, str2.concat(":Length"));
                String a4 = hc2.m13796a(xmlPullParser, str2.concat(":Padding"));
                if (a == null || a2 == null) {
                    return ua3.m21508w();
                }
                q.mo13701f(new C2162a1(a, a2, a3 != null ? Long.parseLong(a3) : 0, a4 != null ? Long.parseLong(a4) : 0));
            }
        } while (!hc2.m13797b(xmlPullParser, concat2));
        return q.mo13703h();
    }
}
