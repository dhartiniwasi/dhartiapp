package p161w3;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: w3.n0 */
/* compiled from: XmlPullParserUtil */
public final class C5956n0 {
    /* renamed from: a */
    public static String m35184a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m35185b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (m35191h(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m35186c(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: d */
    public static boolean m35187d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m35186c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: e */
    public static boolean m35188e(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: f */
    public static boolean m35189f(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m35188e(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: g */
    public static boolean m35190g(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m35188e(xmlPullParser) && m35191h(xmlPullParser.getName()).equals(str);
    }

    /* renamed from: h */
    private static String m35191h(String str) {
        int indexOf = str.indexOf(58);
        return indexOf == -1 ? str : str.substring(indexOf + 1);
    }
}
