package p333qb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: qb.a */
/* compiled from: ApplicationInfoLoader */
public final class C12207a {

    /* renamed from: a */
    public static final String f45323a;

    /* renamed from: b */
    public static final String f45324b;

    /* renamed from: c */
    public static final String f45325c;

    /* renamed from: d */
    public static final String f45326d;

    static {
        Class<C12212f> cls = C12212f.class;
        f45323a = cls.getName() + '.' + "aot-shared-library-name";
        f45324b = cls.getName() + '.' + "vm-snapshot-data";
        f45325c = cls.getName() + '.' + "isolate-snapshot-data";
        f45326d = cls.getName() + '.' + "flutter-assets-dir";
    }

    /* renamed from: a */
    private static ApplicationInfo m58629a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static boolean m58630b(Bundle bundle, String str, boolean z) {
        return bundle == null ? z : bundle.getBoolean(str, z);
    }

    /* renamed from: c */
    private static String m58631c(ApplicationInfo applicationInfo, Context context) {
        int i;
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i = bundle.getInt("io.flutter.network-policy", 0)) <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            xml.next();
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2 && xml.getName().equals("domain-config")) {
                    m58635g(xml, jSONArray, false);
                }
            }
            return jSONArray.toString();
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static String m58632d(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, (String) null);
    }

    /* renamed from: e */
    public static C12208b m58633e(Context context) {
        ApplicationInfo a = m58629a(context);
        return new C12208b(m58632d(a.metaData, f45323a), m58632d(a.metaData, f45324b), m58632d(a.metaData, f45325c), m58632d(a.metaData, f45326d), m58631c(a, context), a.nativeLibraryDir, m58630b(a.metaData, "io.flutter.automatically-register-plugins", true));
    }

    /* renamed from: f */
    private static void m58634f(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) throws IOException, XmlPullParserException {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() == 4) {
            String trim = xmlResourceParser.getText().trim();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(trim);
            jSONArray2.put(attributeBooleanValue);
            jSONArray2.put(z);
            jSONArray.put(jSONArray2);
            xmlResourceParser.next();
            if (xmlResourceParser.getEventType() != 3) {
                throw new IllegalStateException("Expected end of domain tag");
            }
            return;
        }
        throw new IllegalStateException("Expected text");
    }

    /* renamed from: g */
    private static void m58635g(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) throws IOException, XmlPullParserException {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, "cleartextTrafficPermitted", z);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    m58634f(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    m58635g(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    m58636h(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    /* renamed from: h */
    private static void m58636h(XmlResourceParser xmlResourceParser) throws IOException, XmlPullParserException {
        String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType != 3 || xmlResourceParser.getName() != name) {
                eventType = xmlResourceParser.next();
            } else {
                return;
            }
        }
    }
}
