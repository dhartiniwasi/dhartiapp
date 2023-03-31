package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.provider.C0788e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p138t.C5496g;

/* renamed from: androidx.core.content.res.e */
/* compiled from: FontResourcesParserCompat */
public class C0698e {

    /* renamed from: androidx.core.content.res.e$a */
    /* compiled from: FontResourcesParserCompat */
    static class C0699a {
        /* renamed from: a */
        static int m3236a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: androidx.core.content.res.e$b */
    /* compiled from: FontResourcesParserCompat */
    public interface C0700b {
    }

    /* renamed from: androidx.core.content.res.e$c */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0701c implements C0700b {

        /* renamed from: a */
        private final C0702d[] f2225a;

        public C0701c(C0702d[] dVarArr) {
            this.f2225a = dVarArr;
        }

        /* renamed from: a */
        public C0702d[] mo3026a() {
            return this.f2225a;
        }
    }

    /* renamed from: androidx.core.content.res.e$d */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0702d {

        /* renamed from: a */
        private final String f2226a;

        /* renamed from: b */
        private final int f2227b;

        /* renamed from: c */
        private final boolean f2228c;

        /* renamed from: d */
        private final String f2229d;

        /* renamed from: e */
        private final int f2230e;

        /* renamed from: f */
        private final int f2231f;

        public C0702d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f2226a = str;
            this.f2227b = i;
            this.f2228c = z;
            this.f2229d = str2;
            this.f2230e = i2;
            this.f2231f = i3;
        }

        /* renamed from: a */
        public String mo3027a() {
            return this.f2226a;
        }

        /* renamed from: b */
        public int mo3028b() {
            return this.f2231f;
        }

        /* renamed from: c */
        public int mo3029c() {
            return this.f2230e;
        }

        /* renamed from: d */
        public String mo3030d() {
            return this.f2229d;
        }

        /* renamed from: e */
        public int mo3031e() {
            return this.f2227b;
        }

        /* renamed from: f */
        public boolean mo3032f() {
            return this.f2228c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0703e implements C0700b {

        /* renamed from: a */
        private final C0788e f2232a;

        /* renamed from: b */
        private final int f2233b;

        /* renamed from: c */
        private final int f2234c;

        /* renamed from: d */
        private final String f2235d;

        public C0703e(C0788e eVar, int i, int i2, String str) {
            this.f2232a = eVar;
            this.f2234c = i;
            this.f2233b = i2;
            this.f2235d = str;
        }

        /* renamed from: a */
        public int mo3033a() {
            return this.f2234c;
        }

        /* renamed from: b */
        public C0788e mo3034b() {
            return this.f2232a;
        }

        /* renamed from: c */
        public String mo3035c() {
            return this.f2235d;
        }

        /* renamed from: d */
        public int mo3036d() {
            return this.f2233b;
        }
    }

    /* renamed from: a */
    private static int m3228a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0699a.m3236a(typedArray, i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: b */
    public static androidx.core.content.res.C0698e.C0700b m3229b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.res.e$b r3 = m3231d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0698e.m3229b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.res.e$b");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m3230c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m3228a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m3235h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m3235h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static C0700b m3231d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m3232e(xmlPullParser, resources);
        }
        m3234g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static C0700b m3232e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C5496g.f27938h);
        String string = obtainAttributes.getString(C5496g.f27939i);
        String string2 = obtainAttributes.getString(C5496g.f27943m);
        String string3 = obtainAttributes.getString(C5496g.f27944n);
        int resourceId = obtainAttributes.getResourceId(C5496g.f27940j, 0);
        int integer = obtainAttributes.getInteger(C5496g.f27941k, 1);
        int integer2 = obtainAttributes.getInteger(C5496g.f27942l, 500);
        String string4 = obtainAttributes.getString(C5496g.f27945o);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m3233f(xmlPullParser, resources));
                    } else {
                        m3234g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0701c((C0702d[]) arrayList.toArray(new C0702d[0]));
        }
        while (xmlPullParser.next() != 3) {
            m3234g(xmlPullParser);
        }
        return new C0703e(new C0788e(string, string2, string3, m3230c(resources, resourceId)), integer, integer2, string4);
    }

    /* renamed from: f */
    private static C0702d m3233f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C5496g.f27946p);
        int i = C5496g.f27955y;
        if (!obtainAttributes.hasValue(i)) {
            i = C5496g.f27948r;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = C5496g.f27953w;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C5496g.f27949s;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = C5496g.f27956z;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C5496g.f27950t;
        }
        int i5 = C5496g.f27954x;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C5496g.f27951u;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C5496g.f27952v;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C5496g.f27947q;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m3234g(xmlPullParser);
        }
        return new C0702d(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    private static void m3234g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m3235h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
